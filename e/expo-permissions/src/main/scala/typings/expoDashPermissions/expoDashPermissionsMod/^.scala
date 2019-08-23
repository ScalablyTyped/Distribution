package typings.expoDashPermissions.expoDashPermissionsMod

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
object ^ extends js.Object {
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
}

