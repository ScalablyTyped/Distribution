package typings.expoPermissions.permissionsTypesMod

import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionResponse
  extends typings.unimodulesPermissionsInterface.mod.PermissionResponse {
  var permissions: PermissionMap
}

object PermissionResponse {
  @scala.inline
  def apply(
    canAskAgain: Boolean,
    expires: PermissionExpiration,
    granted: Boolean,
    permissions: PermissionMap,
    status: typings.unimodulesPermissionsInterface.mod.PermissionStatus
  ): PermissionResponse = {
    val __obj = js.Dynamic.literal(canAskAgain = canAskAgain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], granted = granted.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PermissionResponse]
  }
}

