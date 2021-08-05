package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoleSets extends StObject {
  
  var roleSets: js.UndefOr[js.Array[AdditionalRoles]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object RoleSets {
  
  inline def apply(): RoleSets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoleSets]
  }
  
  extension [Self <: RoleSets](x: Self) {
    
    inline def setRoleSets(value: js.Array[AdditionalRoles]): Self = StObject.set(x, "roleSets", value.asInstanceOf[js.Any])
    
    inline def setRoleSetsUndefined: Self = StObject.set(x, "roleSets", js.undefined)
    
    inline def setRoleSetsVarargs(value: AdditionalRoles*): Self = StObject.set(x, "roleSets", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
