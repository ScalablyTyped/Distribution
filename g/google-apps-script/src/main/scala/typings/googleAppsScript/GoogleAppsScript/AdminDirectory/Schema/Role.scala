package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Role extends js.Object {
  
  var etag: js.UndefOr[String] = js.native
  
  var isSuperAdminRole: js.UndefOr[Boolean] = js.native
  
  var isSystemRole: js.UndefOr[Boolean] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var roleDescription: js.UndefOr[String] = js.native
  
  var roleId: js.UndefOr[String] = js.native
  
  var roleName: js.UndefOr[String] = js.native
  
  var rolePrivileges: js.UndefOr[js.Array[RoleRolePrivileges]] = js.native
}
object Role {
  
  @scala.inline
  def apply(): Role = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Role]
  }
  
  @scala.inline
  implicit class RoleOps[Self <: Role] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setIsSuperAdminRole(value: Boolean): Self = this.set("isSuperAdminRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSuperAdminRole: Self = this.set("isSuperAdminRole", js.undefined)
    
    @scala.inline
    def setIsSystemRole(value: Boolean): Self = this.set("isSystemRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSystemRole: Self = this.set("isSystemRole", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRoleDescription(value: String): Self = this.set("roleDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleDescription: Self = this.set("roleDescription", js.undefined)
    
    @scala.inline
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleId: Self = this.set("roleId", js.undefined)
    
    @scala.inline
    def setRoleName(value: String): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setRolePrivilegesVarargs(value: RoleRolePrivileges*): Self = this.set("rolePrivileges", js.Array(value :_*))
    
    @scala.inline
    def setRolePrivileges(value: js.Array[RoleRolePrivileges]): Self = this.set("rolePrivileges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRolePrivileges: Self = this.set("rolePrivileges", js.undefined)
  }
}
