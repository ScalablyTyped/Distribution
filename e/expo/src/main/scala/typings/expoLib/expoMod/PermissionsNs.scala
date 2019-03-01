package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Permissions")
@js.native
object PermissionsNs extends js.Object {
  trait PermissionDetailsLocationAndroid extends js.Object {
    var scope: expoLib.expoLibStrings.fine | expoLib.expoLibStrings.coarse | expoLib.expoLibStrings.none
  }
  
  trait PermissionDetailsLocationIOS extends js.Object {
    var scope: expoLib.expoLibStrings.whenInUse | expoLib.expoLibStrings.always
  }
  
  trait PermissionResponse extends js.Object {
    var expires: PermissionExpires
    var permissions: /* import warning: ImportType.apply c Unsupported type mapping: 
    {[ key in expo.expo.Permissions.PermissionType ]: expo.expo.Permissions.SinglePermissionResponse}
      */ expoLib.expoLibStrings.PermissionResponse with js.Any
    var status: PermissionStatus
  }
  
  trait PermissionStatus extends js.Object
  
  trait PermissionType extends js.Object
  
  trait SinglePermissionResponse extends js.Object {
    var android: js.UndefOr[PermissionDetailsLocationAndroid] = js.undefined
    var expires: PermissionExpires
    var ios: js.UndefOr[PermissionDetailsLocationIOS] = js.undefined
    var status: PermissionStatus
  }
  
  val AUDIO_RECORDING: expoLib.expoLibStrings.audioRecording = js.native
  val CALENDAR: expoLib.expoLibStrings.calendar = js.native
  val CAMERA: expoLib.expoLibStrings.camera = js.native
  val CAMERA_ROLL: expoLib.expoLibStrings.cameraRoll = js.native
  val CONTACTS: expoLib.expoLibStrings.contacts = js.native
  val LOCATION: expoLib.expoLibStrings.location = js.native
  val NOTIFICATIONS: expoLib.expoLibStrings.notifications = js.native
  val REMINDERS: expoLib.expoLibStrings.reminders = js.native
  /**
    * Will be removed in SDK 32
    */
  val SMS: expoLib.expoLibStrings.SMS = js.native
  val SYSTEM_BRIGHTNESS: expoLib.expoLibStrings.systemBrightness = js.native
  val USER_FACING_NOTIFICATIONS: expoLib.expoLibStrings.userFacingNotifications = js.native
  def askAsync(permissionTypes: PermissionType*): js.Promise[PermissionResponse] = js.native
  def getAsync(permissionTypes: PermissionType*): js.Promise[PermissionResponse] = js.native
  type PermissionExpires = expoLib.expoLibStrings.never
}

