package typings.googleAppsScript.GoogleAppsScript.Drive.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PermissionPermissionDetails extends js.Object {
  
  var additionalRoles: js.UndefOr[js.Array[String]] = js.native
  
  var inherited: js.UndefOr[Boolean] = js.native
  
  var inheritedFrom: js.UndefOr[String] = js.native
  
  var permissionType: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
}
object PermissionPermissionDetails {
  
  @scala.inline
  def apply(): PermissionPermissionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionPermissionDetails]
  }
  
  @scala.inline
  implicit class PermissionPermissionDetailsOps[Self <: PermissionPermissionDetails] (val x: Self) extends AnyVal {
    
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
    def setAdditionalRolesVarargs(value: String*): Self = this.set("additionalRoles", js.Array(value :_*))
    
    @scala.inline
    def setAdditionalRoles(value: js.Array[String]): Self = this.set("additionalRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdditionalRoles: Self = this.set("additionalRoles", js.undefined)
    
    @scala.inline
    def setInherited(value: Boolean): Self = this.set("inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInherited: Self = this.set("inherited", js.undefined)
    
    @scala.inline
    def setInheritedFrom(value: String): Self = this.set("inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritedFrom: Self = this.set("inheritedFrom", js.undefined)
    
    @scala.inline
    def setPermissionType(value: String): Self = this.set("permissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermissionType: Self = this.set("permissionType", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
