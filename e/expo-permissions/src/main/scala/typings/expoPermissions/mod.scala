package typings.expoPermissions

import typings.expoPermissions.expoPermissionsStrings.audioRecording
import typings.expoPermissions.expoPermissionsStrings.calendar
import typings.expoPermissions.expoPermissionsStrings.camera
import typings.expoPermissions.expoPermissionsStrings.cameraRoll
import typings.expoPermissions.expoPermissionsStrings.contacts
import typings.expoPermissions.expoPermissionsStrings.location
import typings.expoPermissions.expoPermissionsStrings.notifications
import typings.expoPermissions.expoPermissionsStrings.reminders
import typings.expoPermissions.expoPermissionsStrings.systemBrightness
import typings.expoPermissions.expoPermissionsStrings.userFacingNotifications
import typings.expoPermissions.permissionsTypesMod.PermissionResponse
import typings.expoPermissions.permissionsTypesMod.PermissionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions", JSImport.Namespace)
@js.native
object mod extends js.Object {
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
    /* "denied" */ val DENIED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.DENIED with String = js.native
    /* "granted" */ val GRANTED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.GRANTED with String = js.native
    /* "undetermined" */ val UNDETERMINED: typings.unimodulesPermissionsInterface.mod.PermissionStatus.UNDETERMINED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.unimodulesPermissionsInterface.mod.PermissionStatus with String] = js.native
  }
  
}

