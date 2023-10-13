import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

WebUI.comment('Story: Book an appointment')

WebUI.comment('Given that the user has logged into their account')

WebUI.openBrowser(GlobalVariable.G_SiteURL)

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('Common Test Cases/Login'), [('Username') : 'John Doe', ('Password') : 'ThisIsNotAPassword'], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('And Appointment page is displayed')

// Check appointment section with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Appointment Dialog Origin', AppointmentDialogObject)

WebUI.selectOptionByLabel(findTestObject('Page_CuraAppointment/lst_Facility'), 'Hongkong CURA Healthcare Center', false)

// Check Facility with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Facilty', FacilityObject)

WebUI.check(findTestObject('Page_CuraAppointment/chk_Medicaid'))

// Check medicare with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Medicare', MedicareChoicesObject)

WebUI.check(findTestObject('Page_CuraAppointment/chk_Readmission'))

WebUI.setText(findTestObject('Page_CuraAppointment/txt_VisitDate'), '27/12/2016')
WebUI.click(CommentLabelObject) // just to hide date chooser

// Check date with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Visit Date', DateObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible.')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 1')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 1', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 2')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 2', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 3')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 3', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 4')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 4', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 5')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 5', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 6')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 6', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 7')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 7', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 8')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 8', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 9')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 9', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 10')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 10', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 11')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 11', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 12')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 12', CommentObject)

WebUI.setText(findTestObject('Page_CuraAppointment/txt_Comment'), 'Please make appointment as soon as possible. 13')

// Check comment with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Comment 13', CommentObject)

WebUI.comment('When he fills in valid information in Appointment page')

// Check data with TestOps Vision
WebUI.takeElementScreenshotAsCheckpoint('Appointment Dialog With Data', AppointmentDialogObject)

WebUI.click(findTestObject('Page_CuraAppointment/btn_BookAppointment'))

// Check Full Appointment with TestOps Vision
WebUI.takeFullPageScreenshotAsCheckpoint('Review Appoitment')

WebUI.verifyTextPresent('Appointment Confirmation', false)

WebUI.comment('Then he should be able to book a new appointment')

WebUI.verifyMatch('Hongkong CURA Healthcare Center', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Facility')), false)

WebUI.verifyMatch('Yes', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_HospitalReadmission')), false)

WebUI.verifyMatch('Medicaid', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Program')), false)

WebUI.verifyMatch('27/12/2016', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_VisitDate')), false)

WebUI.verifyMatch('Please make appointment as soon as possible.', WebUI.getText(findTestObject('Page_AppointmentConfirmation/lbl_Comment')), false)

WebUI.closeBrowser()


