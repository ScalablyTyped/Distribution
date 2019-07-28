package typings.expo.expoMod

import typings.expo.expoMod.PermissionsNs.PermissionDetailsLocationAndroid
import typings.expo.expoMod.PermissionsNs.PermissionDetailsLocationIOS
import typings.expo.expoMod.PermissionsNs.PermissionExpires
import typings.expo.expoMod.PermissionsNs.PermissionResponse
import typings.expo.expoMod.PermissionsNs.PermissionStatus
import typings.expo.expoMod.PermissionsNs.PermissionType
import typings.expo.expoStrings.always
import typings.expo.expoStrings.audioRecording
import typings.expo.expoStrings.calendar
import typings.expo.expoStrings.camera
import typings.expo.expoStrings.cameraRoll
import typings.expo.expoStrings.coarse
import typings.expo.expoStrings.contacts
import typings.expo.expoStrings.fine
import typings.expo.expoStrings.location
import typings.expo.expoStrings.never
import typings.expo.expoStrings.none
import typings.expo.expoStrings.notifications
import typings.expo.expoStrings.reminders
import typings.expo.expoStrings.systemBrightness
import typings.expo.expoStrings.userFacingNotifications
import typings.expo.expoStrings.whenInUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Permissions")
@js.native
object PermissionsNs extends js.Object {
  trait PermissionDetailsLocationAndroid extends js.Object {
    var scope: fine | coarse | none
  }
  
  trait PermissionDetailsLocationIOS extends js.Object {
    var scope: whenInUse | always
  }
  
  trait PermissionResponse extends js.Object {
    var expires: PermissionExpires
    var permissions: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ key in expo.expo.Permissions.PermissionType ]: expo.expo.Permissions.SinglePermissionResponse}
      */ typings.expo.expoStrings.PermissionResponse with js.Any
    var status: PermissionStatus
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoStrings.undetermined
    - typings.expo.expoStrings.granted
    - typings.expo.expoStrings.denied
  */
  trait PermissionStatus extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.expo.expoStrings.audioRecording
    - typings.expo.expoStrings.calendar
    - typings.expo.expoStrings.cameraRoll
    - typings.expo.expoStrings.camera
    - typings.expo.expoStrings.contacts
    - typings.expo.expoStrings.location
    - typings.expo.expoStrings.reminders
    - typings.expo.expoStrings.notifications
    - typings.expo.expoStrings.systemBrightness
    - typings.expo.expoStrings.userFacingNotifications
    - typings.expo.expoStrings.SMS
  */
  trait PermissionType extends js.Object
  
  trait SinglePermissionResponse extends js.Object {
    var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
    var expires: PermissionExpires
    var ios: js.UndefOr[PermissionDetailsLocationIOS] = js.undefined
    var status: PermissionStatus
  }
  
  val AUDIO_RECORDING: audioRecording = js.native
  val CALENDAR: calendar = js.native
  val CAMERA: camera = js.native
  val CAMERA_ROLL: cameraRoll = js.native
  val CONTACTS: contacts = js.native
  val LOCATION: location = js.native
  val NOTIFICATIONS: notifications = js.native
  val REMINDERS: reminders = js.native
  /**
    * Will be removed in SDK 32
    */
  val SMS: typings.expo.expoStrings.SMS = js.native
  val SYSTEM_BRIGHTNESS: systemBrightness = js.native
  val USER_FACING_NOTIFICATIONS: userFacingNotifications = js.native
  def askAsync(permissionTypes: PermissionType*): js.Promise[PermissionResponse] = js.native
  def getAsync(permissionTypes: PermissionType*): js.Promise[PermissionResponse] = js.native
  type PermissionExpires = never
}

