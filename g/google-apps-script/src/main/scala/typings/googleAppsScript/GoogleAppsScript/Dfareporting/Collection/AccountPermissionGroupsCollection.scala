package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionGroup
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.AccountPermissionGroupsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountPermissionGroupsCollection extends js.Object {
  
  // Gets one account permission group by ID.
  def get(profileId: String, id: String): AccountPermissionGroup = js.native
  
  // Retrieves the list of account permission groups.
  def list(profileId: String): AccountPermissionGroupsListResponse = js.native
}
object AccountPermissionGroupsCollection {
  
  @scala.inline
  def apply(
    get: (String, String) => AccountPermissionGroup,
    list: String => AccountPermissionGroupsListResponse
  ): AccountPermissionGroupsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[AccountPermissionGroupsCollection]
  }
  
  @scala.inline
  implicit class AccountPermissionGroupsCollectionOps[Self <: AccountPermissionGroupsCollection] (val x: Self) extends AnyVal {
    
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
    def setGet(value: (String, String) => AccountPermissionGroup): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setList(value: String => AccountPermissionGroupsListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
