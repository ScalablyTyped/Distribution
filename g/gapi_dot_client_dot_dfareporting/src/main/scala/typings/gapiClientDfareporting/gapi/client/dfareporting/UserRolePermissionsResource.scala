package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.AltFields
import typings.gapiClientDfareporting.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolePermissionsResource extends js.Object {
  /** Gets one user role permission by ID. */
  def get(request: Fields): Request[UserRolePermission] = js.native
  /** Gets a list of user role permissions, possibly filtered. */
  def list(request: AltFields): Request[UserRolePermissionsListResponse] = js.native
}

object UserRolePermissionsResource {
  @scala.inline
  def apply(
    get: Fields => Request[UserRolePermission],
    list: AltFields => Request[UserRolePermissionsListResponse]
  ): UserRolePermissionsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserRolePermissionsResource]
  }
  @scala.inline
  implicit class UserRolePermissionsResourceOps[Self <: UserRolePermissionsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[UserRolePermission]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: AltFields => Request[UserRolePermissionsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

