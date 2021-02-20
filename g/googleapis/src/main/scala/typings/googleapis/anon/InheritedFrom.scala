package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InheritedFrom extends StObject {
  
  var inherited: js.UndefOr[Boolean] = js.native
  
  var inheritedFrom: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var teamDrivePermissionType: js.UndefOr[String] = js.native
}
object InheritedFrom {
  
  @scala.inline
  def apply(): InheritedFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InheritedFrom]
  }
  
  @scala.inline
  implicit class InheritedFromMutableBuilder[Self <: InheritedFrom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedFrom(value: String): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    @scala.inline
    def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    @scala.inline
    def setTeamDrivePermissionType(value: String): Self = StObject.set(x, "teamDrivePermissionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTeamDrivePermissionTypeUndefined: Self = StObject.set(x, "teamDrivePermissionType", js.undefined)
  }
}
