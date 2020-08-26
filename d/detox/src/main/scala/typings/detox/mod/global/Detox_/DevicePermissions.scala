package typings.detox.mod.global.Detox_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Source for string definitions is https://github.com/wix/AppleSimulatorUtils
  */
@js.native
trait DevicePermissions extends js.Object {
  var calendar: js.UndefOr[CalendarPermission] = js.native
  var camera: js.UndefOr[CameraPermission] = js.native
  var contacts: js.UndefOr[ContactsPermission] = js.native
  var faceid: js.UndefOr[FaceIDPermission] = js.native
  var health: js.UndefOr[HealthPermission] = js.native
  var homekit: js.UndefOr[HomekitPermission] = js.native
  var location: js.UndefOr[LocationPermission] = js.native
  var medialibrary: js.UndefOr[MediaLibraryPermission] = js.native
  var microphone: js.UndefOr[MicrophonePermission] = js.native
  var motion: js.UndefOr[MotionPermission] = js.native
  var notifications: js.UndefOr[NotificationsPermission] = js.native
  var photos: js.UndefOr[PhotosPermission] = js.native
  var reminders: js.UndefOr[RemindersPermission] = js.native
  var siri: js.UndefOr[SiriPermission] = js.native
  var speech: js.UndefOr[SpeechPermission] = js.native
}

object DevicePermissions {
  @scala.inline
  def apply(): DevicePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePermissions]
  }
  @scala.inline
  implicit class DevicePermissionsOps[Self <: DevicePermissions] (val x: Self) extends AnyVal {
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
    def setCalendar(value: CalendarPermission): Self = this.set("calendar", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCalendar: Self = this.set("calendar", js.undefined)
    @scala.inline
    def setCamera(value: CameraPermission): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setContacts(value: ContactsPermission): Self = this.set("contacts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
    @scala.inline
    def setFaceid(value: FaceIDPermission): Self = this.set("faceid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFaceid: Self = this.set("faceid", js.undefined)
    @scala.inline
    def setHealth(value: HealthPermission): Self = this.set("health", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealth: Self = this.set("health", js.undefined)
    @scala.inline
    def setHomekit(value: HomekitPermission): Self = this.set("homekit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomekit: Self = this.set("homekit", js.undefined)
    @scala.inline
    def setLocation(value: LocationPermission): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMedialibrary(value: MediaLibraryPermission): Self = this.set("medialibrary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedialibrary: Self = this.set("medialibrary", js.undefined)
    @scala.inline
    def setMicrophone(value: MicrophonePermission): Self = this.set("microphone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMicrophone: Self = this.set("microphone", js.undefined)
    @scala.inline
    def setMotion(value: MotionPermission): Self = this.set("motion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMotion: Self = this.set("motion", js.undefined)
    @scala.inline
    def setNotifications(value: NotificationsPermission): Self = this.set("notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifications: Self = this.set("notifications", js.undefined)
    @scala.inline
    def setPhotos(value: PhotosPermission): Self = this.set("photos", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhotos: Self = this.set("photos", js.undefined)
    @scala.inline
    def setReminders(value: RemindersPermission): Self = this.set("reminders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReminders: Self = this.set("reminders", js.undefined)
    @scala.inline
    def setSiri(value: SiriPermission): Self = this.set("siri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSiri: Self = this.set("siri", js.undefined)
    @scala.inline
    def setSpeech(value: SpeechPermission): Self = this.set("speech", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpeech: Self = this.set("speech", js.undefined)
  }
  
}

