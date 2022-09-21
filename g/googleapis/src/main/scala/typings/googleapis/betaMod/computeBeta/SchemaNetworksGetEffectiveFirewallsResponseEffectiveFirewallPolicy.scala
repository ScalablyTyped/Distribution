package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy extends StObject {
  
  /**
    * [Output Only] Deprecated, please use short name instead. The display name of the firewall policy.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The name of the firewall policy.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The rules that apply to the network.
    */
  var rules: js.UndefOr[js.Array[SchemaFirewallPolicyRule]] = js.undefined
  
  /**
    * [Output Only] The short name of the firewall policy.
    */
  var shortName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * [Output Only] The type of the firewall policy.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy {
  
  inline def apply(): SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy]
  }
  
  extension [Self <: SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRules(value: js.Array[SchemaFirewallPolicyRule]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    inline def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    inline def setRulesVarargs(value: SchemaFirewallPolicyRule*): Self = StObject.set(x, "rules", js.Array(value*))
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameNull: Self = StObject.set(x, "shortName", null)
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
