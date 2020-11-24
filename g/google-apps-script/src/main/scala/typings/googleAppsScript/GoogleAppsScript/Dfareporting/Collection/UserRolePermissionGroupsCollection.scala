package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionGroup
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.UserRolePermissionGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRolePermissionGroupsCollection extends js.Object {
  
  // Gets one user role permission group by ID.
  def get(profileId: String, id: String): UserRolePermissionGroup = js.native
  
  // Gets a list of all supported user role permission groups.
  def list(profileId: String): UserRolePermissionGroupsListResponse = js.native
}
object UserRolePermissionGroupsCollection {
  
  @scala.inline
  def apply(
    get: (String, String) => UserRolePermissionGroup,
    list: String => UserRolePermissionGroupsListResponse
  ): UserRolePermissionGroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[UserRolePermissionGroupsCollection]
  }
  
  @scala.inline
  implicit class UserRolePermissionGroupsCollectionOps[Self <: UserRolePermissionGroupsCollection] (val x: Self) extends AnyVal {
    
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
    def setGet(value: (String, String) => UserRolePermissionGroup): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setList(value: String => UserRolePermissionGroupsListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
