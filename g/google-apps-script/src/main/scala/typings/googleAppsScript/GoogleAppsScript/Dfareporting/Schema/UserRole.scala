package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserRole extends js.Object {
  
  var accountId: js.UndefOr[String] = js.native
  
  var defaultUserRole: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentUserRoleId: js.UndefOr[String] = js.native
  
  var permissions: js.UndefOr[js.Array[UserRolePermission]] = js.native
  
  var subaccountId: js.UndefOr[String] = js.native
}
object UserRole {
  
  @scala.inline
  def apply(): UserRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserRole]
  }
  
  @scala.inline
  implicit class UserRoleOps[Self <: UserRole] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setDefaultUserRole(value: Boolean): Self = this.set("defaultUserRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultUserRole: Self = this.set("defaultUserRole", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentUserRoleId(value: String): Self = this.set("parentUserRoleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentUserRoleId: Self = this.set("parentUserRoleId", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: UserRolePermission*): Self = this.set("permissions", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[UserRolePermission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissions: Self = this.set("permissions", js.undefined)
    
    @scala.inline
    def setSubaccountId(value: String): Self = this.set("subaccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubaccountId: Self = this.set("subaccountId", js.undefined)
  }
}
