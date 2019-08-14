package typings.detox.detoxMod.Global.DetoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *  Source for string definitions is https://github.com/wix/AppleSimulatorUtils
  */
trait DevicePermissions extends js.Object {
  var calendar: js.UndefOr[CalendarPermission] = js.undefined
  var camera: js.UndefOr[CameraPermission] = js.undefined
  var contacts: js.UndefOr[ContactsPermission] = js.undefined
  var health: js.UndefOr[HealthPermission] = js.undefined
  var homekit: js.UndefOr[HomekitPermission] = js.undefined
  var location: js.UndefOr[LocationPermission] = js.undefined
  var medialibrary: js.UndefOr[MediaLibraryPermission] = js.undefined
  var microphone: js.UndefOr[MicrophonePermission] = js.undefined
  var motion: js.UndefOr[MotionPermission] = js.undefined
  var notifications: js.UndefOr[NotificationsPermission] = js.undefined
  var photos: js.UndefOr[PhotosPermission] = js.undefined
  var reminders: js.UndefOr[RemindersPermission] = js.undefined
  var siri: js.UndefOr[SiriPermission] = js.undefined
  var speech: js.UndefOr[SpeechPermission] = js.undefined
}

object DevicePermissions {
  @scala.inline
  def apply(
    calendar: CalendarPermission = null,
    camera: CameraPermission = null,
    contacts: ContactsPermission = null,
    health: HealthPermission = null,
    homekit: HomekitPermission = null,
    location: LocationPermission = null,
    medialibrary: MediaLibraryPermission = null,
    microphone: MicrophonePermission = null,
    motion: MotionPermission = null,
    notifications: NotificationsPermission = null,
    photos: PhotosPermission = null,
    reminders: RemindersPermission = null,
    siri: SiriPermission = null,
    speech: SpeechPermission = null
  ): DevicePermissions = {
    val __obj = js.Dynamic.literal()
    if (calendar != null) __obj.updateDynamic("calendar")(calendar)
    if (camera != null) __obj.updateDynamic("camera")(camera)
    if (contacts != null) __obj.updateDynamic("contacts")(contacts)
    if (health != null) __obj.updateDynamic("health")(health)
    if (homekit != null) __obj.updateDynamic("homekit")(homekit)
    if (location != null) __obj.updateDynamic("location")(location)
    if (medialibrary != null) __obj.updateDynamic("medialibrary")(medialibrary)
    if (microphone != null) __obj.updateDynamic("microphone")(microphone)
    if (motion != null) __obj.updateDynamic("motion")(motion)
    if (notifications != null) __obj.updateDynamic("notifications")(notifications)
    if (photos != null) __obj.updateDynamic("photos")(photos)
    if (reminders != null) __obj.updateDynamic("reminders")(reminders)
    if (siri != null) __obj.updateDynamic("siri")(siri)
    if (speech != null) __obj.updateDynamic("speech")(speech)
    __obj.asInstanceOf[DevicePermissions]
  }
}

