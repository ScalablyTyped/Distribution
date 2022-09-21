package typings.googleapis.cloudidentityV1beta1Mod.cloudidentityV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTransitiveMembershipRole extends StObject {
  
  /**
    * TransitiveMembershipRole in string format. Currently supported TransitiveMembershipRoles: `"MEMBER"`, `"OWNER"`, and `"MANAGER"`.
    */
  var role: js.UndefOr[String | Null] = js.undefined
}
object SchemaTransitiveMembershipRole {
  
  inline def apply(): SchemaTransitiveMembershipRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTransitiveMembershipRole]
  }
  
  extension [Self <: SchemaTransitiveMembershipRole](x: Self) {
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
