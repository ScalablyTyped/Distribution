package typings.gapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRoleRequest extends js.Object {
  /** The Role resource to create. */
  var role: js.UndefOr[Role] = js.native
  /** The role id to use for this role. */
  var roleId: js.UndefOr[String] = js.native
}

object CreateRoleRequest {
  @scala.inline
  def apply(): CreateRoleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRoleRequest]
  }
  @scala.inline
  implicit class CreateRoleRequestOps[Self <: CreateRoleRequest] (val x: Self) extends AnyVal {
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
    def setRole(value: Role): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    @scala.inline
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleId: Self = this.set("roleId", js.undefined)
  }
  
}

