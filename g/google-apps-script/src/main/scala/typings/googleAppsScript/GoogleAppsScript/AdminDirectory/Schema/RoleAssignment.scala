package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleAssignment extends js.Object {
  
  var assignedTo: js.UndefOr[String] = js.native
  
  var etag: js.UndefOr[String] = js.native
  
  var kind: js.UndefOr[String] = js.native
  
  var orgUnitId: js.UndefOr[String] = js.native
  
  var roleAssignmentId: js.UndefOr[String] = js.native
  
  var roleId: js.UndefOr[String] = js.native
  
  var scopeType: js.UndefOr[String] = js.native
}
object RoleAssignment {
  
  @scala.inline
  def apply(): RoleAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleAssignment]
  }
  
  @scala.inline
  implicit class RoleAssignmentOps[Self <: RoleAssignment] (val x: Self) extends AnyVal {
    
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
    def setAssignedTo(value: String): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssignedTo: Self = this.set("assignedTo", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setOrgUnitId(value: String): Self = this.set("orgUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrgUnitId: Self = this.set("orgUnitId", js.undefined)
    
    @scala.inline
    def setRoleAssignmentId(value: String): Self = this.set("roleAssignmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleAssignmentId: Self = this.set("roleAssignmentId", js.undefined)
    
    @scala.inline
    def setRoleId(value: String): Self = this.set("roleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleId: Self = this.set("roleId", js.undefined)
    
    @scala.inline
    def setScopeType(value: String): Self = this.set("scopeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScopeType: Self = this.set("scopeType", js.undefined)
  }
}
