package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPasswordPoliciesContext extends StObject {
  
  /**
    * The scope of non-compliant password.
    */
  var passwordPolicyScope: js.UndefOr[String | Null] = js.undefined
}
object SchemaPasswordPoliciesContext {
  
  inline def apply(): SchemaPasswordPoliciesContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPasswordPoliciesContext]
  }
  
  extension [Self <: SchemaPasswordPoliciesContext](x: Self) {
    
    inline def setPasswordPolicyScope(value: String): Self = StObject.set(x, "passwordPolicyScope", value.asInstanceOf[js.Any])
    
    inline def setPasswordPolicyScopeNull: Self = StObject.set(x, "passwordPolicyScope", null)
    
    inline def setPasswordPolicyScopeUndefined: Self = StObject.set(x, "passwordPolicyScope", js.undefined)
  }
}
