package typings.expoDashPermissions.buildPermissionsDotTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PermissionStatus extends js.Object

@JSImport("expo-permissions/build/Permissions.types", "PermissionStatus")
@js.native
object PermissionStatus extends js.Object {
  @js.native
  sealed trait DENIED extends PermissionStatus
  
  @js.native
  sealed trait GRANTED extends PermissionStatus
  
  @js.native
  sealed trait UNDETERMINED extends PermissionStatus
  
  /* "denied" */ val DENIED: typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.DENIED with String = js.native
  /* "granted" */ val GRANTED: typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.GRANTED with String = js.native
  /* "undetermined" */ val UNDETERMINED: typings.expoDashPermissions.buildPermissionsDotTypesMod.PermissionStatus.UNDETERMINED with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PermissionStatus with String] = js.native
}

