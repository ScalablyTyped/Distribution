package typings.expoDashPermissions.expoDashPermissionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo-permissions", "PermissionStatus")
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

