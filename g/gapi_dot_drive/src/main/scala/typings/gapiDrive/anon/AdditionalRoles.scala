package typings.gapiDrive.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalRoles extends js.Object {
  
  var additionalRoles: js.Array[String] = js.native
  
  var inherited: Boolean = js.native
  
  var inheritedFrom: String = js.native
  
  var role: String = js.native
  
  var teamDrivePermissionType: String = js.native
}
object AdditionalRoles {
  
  @scala.inline
  def apply(
    additionalRoles: js.Array[String],
    inherited: Boolean,
    inheritedFrom: String,
    role: String,
    teamDrivePermissionType: String
  ): AdditionalRoles = {
    val __obj = js.Dynamic.literal(additionalRoles = additionalRoles.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any], inheritedFrom = inheritedFrom.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], teamDrivePermissionType = teamDrivePermissionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalRoles]
  }
  
  @scala.inline
  implicit class AdditionalRolesOps[Self <: AdditionalRoles] (val x: Self) extends AnyVal {
    
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
    def setInherited(value: Boolean): Self = this.set("inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedFrom(value: String): Self = this.set("inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDrivePermissionType(value: String): Self = this.set("teamDrivePermissionType", value.asInstanceOf[js.Any])
  }
}
