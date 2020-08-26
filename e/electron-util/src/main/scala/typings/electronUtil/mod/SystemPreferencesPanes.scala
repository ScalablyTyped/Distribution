package typings.electronUtil.mod

import typings.electronUtil.electronUtilStrings.Advanced
import typings.electronUtil.electronUtilStrings.Captioning
import typings.electronUtil.electronUtilStrings.Dictation
import typings.electronUtil.electronUtilStrings.FDE
import typings.electronUtil.electronUtilStrings.Firewall
import typings.electronUtil.electronUtilStrings.General
import typings.electronUtil.electronUtilStrings.Hearing
import typings.electronUtil.electronUtilStrings.Internet
import typings.electronUtil.electronUtilStrings.Keyboard
import typings.electronUtil.electronUtilStrings.Media_Descriptions
import typings.electronUtil.electronUtilStrings.Mouse
import typings.electronUtil.electronUtilStrings.Privacy
import typings.electronUtil.electronUtilStrings.Privacy_Accessibility
import typings.electronUtil.electronUtilStrings.Privacy_Advertising
import typings.electronUtil.electronUtilStrings.Privacy_AllFiles
import typings.electronUtil.electronUtilStrings.Privacy_Assistive
import typings.electronUtil.electronUtilStrings.Privacy_Automation
import typings.electronUtil.electronUtilStrings.Privacy_Calendars
import typings.electronUtil.electronUtilStrings.Privacy_Camera
import typings.electronUtil.electronUtilStrings.Privacy_Contacts
import typings.electronUtil.electronUtilStrings.Privacy_DesktopFolder
import typings.electronUtil.electronUtilStrings.Privacy_Diagnostics
import typings.electronUtil.electronUtilStrings.Privacy_DocumentsFolder
import typings.electronUtil.electronUtilStrings.Privacy_DownloadsFolder
import typings.electronUtil.electronUtilStrings.Privacy_LocationServices
import typings.electronUtil.electronUtilStrings.Privacy_Microphone
import typings.electronUtil.electronUtilStrings.Privacy_Photos
import typings.electronUtil.electronUtilStrings.Privacy_Reminders
import typings.electronUtil.electronUtilStrings.Privacy_ScreenCapture
import typings.electronUtil.electronUtilStrings.Seeing_Display
import typings.electronUtil.electronUtilStrings.Seeing_VoiceOver
import typings.electronUtil.electronUtilStrings.Seeing_Zoom
import typings.electronUtil.electronUtilStrings.Services_ARDService
import typings.electronUtil.electronUtilStrings.Services_BluetoothSharing
import typings.electronUtil.electronUtilStrings.Services_PersonalFileSharing
import typings.electronUtil.electronUtilStrings.Services_PrinterSharing
import typings.electronUtil.electronUtilStrings.Services_RemoteAppleEvent
import typings.electronUtil.electronUtilStrings.Services_RemoteLogin
import typings.electronUtil.electronUtilStrings.Services_ScreenSharing
import typings.electronUtil.electronUtilStrings.SpeakableItems
import typings.electronUtil.electronUtilStrings.Switch
import typings.electronUtil.electronUtilStrings.TTS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemPreferencesPanes extends js.Object {
  var security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture = js.native
  var sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing = js.native
  var speech: Dictation | TTS = js.native
  var universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch = js.native
}

object SystemPreferencesPanes {
  @scala.inline
  def apply(
    security: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture,
    sharing: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing,
    speech: Dictation | TTS,
    universalaccess: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  ): SystemPreferencesPanes = {
    val __obj = js.Dynamic.literal(security = security.asInstanceOf[js.Any], sharing = sharing.asInstanceOf[js.Any], speech = speech.asInstanceOf[js.Any], universalaccess = universalaccess.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemPreferencesPanes]
  }
  @scala.inline
  implicit class SystemPreferencesPanesOps[Self <: SystemPreferencesPanes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSecurity(
      value: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Advertising | Privacy_AllFiles | Privacy_Assistive | Privacy_Automation | Privacy_Calendars | Privacy_Camera | Privacy_Contacts | Privacy_DesktopFolder | Privacy_Diagnostics | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_LocationServices | Privacy_Microphone | Privacy_Photos | Privacy_Reminders | Privacy_ScreenCapture
    ): Self = this.set("security", value.asInstanceOf[js.Any])
    @scala.inline
    def setSharing(
      value: Internet | Services_ARDService | Services_BluetoothSharing | Services_PersonalFileSharing | Services_PrinterSharing | Services_RemoteAppleEvent | Services_RemoteLogin | Services_ScreenSharing
    ): Self = this.set("sharing", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeech(value: Dictation | TTS): Self = this.set("speech", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniversalaccess(
      value: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
    ): Self = this.set("universalaccess", value.asInstanceOf[js.Any])
  }
  
}

