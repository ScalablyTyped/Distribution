package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleRolePrivileges extends js.Object {
  
  var privilegeName: js.UndefOr[String] = js.native
  
  var serviceId: js.UndefOr[String] = js.native
}
object RoleRolePrivileges {
  
  @scala.inline
  def apply(): RoleRolePrivileges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleRolePrivileges]
  }
  
  @scala.inline
  implicit class RoleRolePrivilegesOps[Self <: RoleRolePrivileges] (val x: Self) extends AnyVal {
    
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
    def setPrivilegeName(value: String): Self = this.set("privilegeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivilegeName: Self = this.set("privilegeName", js.undefined)
    
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceId: Self = this.set("serviceId", js.undefined)
  }
}
