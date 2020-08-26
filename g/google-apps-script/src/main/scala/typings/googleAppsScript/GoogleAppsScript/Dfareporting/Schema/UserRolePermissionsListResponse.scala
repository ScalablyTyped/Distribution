package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolePermissionsListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.native
  var userRolePermissions: js.UndefOr[js.Array[UserRolePermission]] = js.native
}

object UserRolePermissionsListResponse {
  @scala.inline
  def apply(): UserRolePermissionsListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRolePermissionsListResponse]
  }
  @scala.inline
  implicit class UserRolePermissionsListResponseOps[Self <: UserRolePermissionsListResponse] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setUserRolePermissionsVarargs(value: UserRolePermission*): Self = this.set("userRolePermissions", js.Array(value :_*))
    @scala.inline
    def setUserRolePermissions(value: js.Array[UserRolePermission]): Self = this.set("userRolePermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserRolePermissions: Self = this.set("userRolePermissions", js.undefined)
  }
  
}

