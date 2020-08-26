package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.Fields
import typings.gapiClientDfareporting.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserRolePermissionGroupsResource extends js.Object {
  /** Gets one user role permission group by ID. */
  def get(request: Fields): Request[UserRolePermissionGroup] = js.native
  /** Gets a list of all supported user role permission groups. */
  def list(request: Key): Request[UserRolePermissionGroupsListResponse] = js.native
}

object UserRolePermissionGroupsResource {
  @scala.inline
  def apply(
    get: Fields => Request[UserRolePermissionGroup],
    list: Key => Request[UserRolePermissionGroupsListResponse]
  ): UserRolePermissionGroupsResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserRolePermissionGroupsResource]
  }
  @scala.inline
  implicit class UserRolePermissionGroupsResourceOps[Self <: UserRolePermissionGroupsResource] (val x: Self) extends AnyVal {
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
    def setGet(value: Fields => Request[UserRolePermissionGroup]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Key => Request[UserRolePermissionGroupsListResponse]): Self = this.set("list", js.Any.fromFunction1(value))
  }
  
}

