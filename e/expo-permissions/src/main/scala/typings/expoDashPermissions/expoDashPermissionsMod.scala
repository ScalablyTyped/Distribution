package typings.expoDashPermissions

import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionResponse
import typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionType
import typings.expoDashPermissions.expoDashPermissionsStrings.audioRecording
import typings.expoDashPermissions.expoDashPermissionsStrings.calendar
import typings.expoDashPermissions.expoDashPermissionsStrings.camera
import typings.expoDashPermissions.expoDashPermissionsStrings.cameraRoll
import typings.expoDashPermissions.expoDashPermissionsStrings.contacts
import typings.expoDashPermissions.expoDashPermissionsStrings.location
import typings.expoDashPermissions.expoDashPermissionsStrings.notifications
import typings.expoDashPermissions.expoDashPermissionsStrings.reminders
import typings.expoDashPermissions.expoDashPermissionsStrings.systemBrightness
import typings.expoDashPermissions.expoDashPermissionsStrings.userFacingNotifications
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions", JSImport.Namespace)
@js.native
object expoDashPermissionsMod extends js.Object {
  val AUDIO_RECORDING: audioRecording = js.native
  val CALENDAR: calendar = js.native
  val CAMERA: camera = js.native
  val CAMERA_ROLL: cameraRoll = js.native
  val CONTACTS: contacts = js.native
  val LOCATION: location = js.native
  val NOTIFICATIONS: notifications = js.native
  val REMINDERS: reminders = js.native
  val SYSTEM_BRIGHTNESS: systemBrightness = js.native
  val USER_FACING_NOTIFICATIONS: userFacingNotifications = js.native
  def askAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  def getAsync(types: PermissionType*): js.Promise[PermissionResponse] = js.native
  @js.native
  object PermissionStatus extends js.Object {
    /* "denied" */ val DENIED: typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.DENIED with String = js.native
    /* "granted" */ val GRANTED: typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.GRANTED with String = js.native
    /* "undetermined" */ val UNDETERMINED: typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.UNDETERMINED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus with String
      ] = js.native
  }
  
}

