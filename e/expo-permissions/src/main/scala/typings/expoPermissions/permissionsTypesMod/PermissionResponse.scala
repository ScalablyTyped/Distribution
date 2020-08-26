package typings.expoPermissions.permissionsTypesMod

import typings.unimodulesPermissionsInterface.mod.PermissionExpiration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionResponse
  extends typings.unimodulesPermissionsInterface.mod.PermissionResponse {
  var permissions: PermissionMap = js.native
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
  @scala.inline
  implicit class PermissionResponseOps[Self <: PermissionResponse] (val x: Self) extends AnyVal {
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
    def setPermissions(value: PermissionMap): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
  
}

