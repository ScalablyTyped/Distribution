package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaInstancesGetEffectiveFirewallsResponseOrganizationFirewallPolicy extends StObject {
  
  /**
    * The unique identifier for the security policy. This identifier is defined by the server.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rules that apply to the network.
    */
  var rules: js.UndefOr[js.Array[SchemaSecurityPolicyRule]] = js.undefined
}
object SchemaInstancesGetEffectiveFirewallsResponseOrganizationFirewallPolicy {
  
  inline def apply(): SchemaInstancesGetEffectiveFirewallsResponseOrganizationFirewallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInstancesGetEffectiveFirewallsResponseOrganizationFirewallPolicy]
  }
  
  extension [Self <: SchemaInstancesGetEffectiveFirewallsResponseOrganizationFirewallPolicy](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setRules(value: js.Array[SchemaSecurityPolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaSecurityPolicyRule*): Self = StObject.set(x, "rules", js.Array(value*))
  }
}
