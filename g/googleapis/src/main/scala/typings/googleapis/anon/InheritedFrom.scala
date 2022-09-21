package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InheritedFrom extends StObject {
  
  var additionalRoles: js.UndefOr[js.Array[String]] = js.undefined
  
  var inherited: js.UndefOr[Boolean] = js.undefined
  
  var inheritedFrom: js.UndefOr[String] = js.undefined
  
  var role: js.UndefOr[String] = js.undefined
  
  var teamDrivePermissionType: js.UndefOr[String] = js.undefined
}
object InheritedFrom {
  
  inline def apply(): InheritedFrom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InheritedFrom]
  }
  
  extension [Self <: InheritedFrom](x: Self) {
    
    inline def setAdditionalRoles(value: js.Array[String]): Self = StObject.set(x, "additionalRoles", value.asInstanceOf[js.Any])
    
    inline def setAdditionalRolesUndefined: Self = StObject.set(x, "additionalRoles", js.undefined)
    
    inline def setAdditionalRolesVarargs(value: String*): Self = StObject.set(x, "additionalRoles", js.Array(value*))
    
    inline def setInherited(value: Boolean): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
    
    inline def setInheritedFrom(value: String): Self = StObject.set(x, "inheritedFrom", value.asInstanceOf[js.Any])
    
    inline def setInheritedFromUndefined: Self = StObject.set(x, "inheritedFrom", js.undefined)
    
    inline def setInheritedUndefined: Self = StObject.set(x, "inherited", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTeamDrivePermissionType(value: String): Self = StObject.set(x, "teamDrivePermissionType", value.asInstanceOf[js.Any])
    
    inline def setTeamDrivePermissionTypeUndefined: Self = StObject.set(x, "teamDrivePermissionType", js.undefined)
  }
}
