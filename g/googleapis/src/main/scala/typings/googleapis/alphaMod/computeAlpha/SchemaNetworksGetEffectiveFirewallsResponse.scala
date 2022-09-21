package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworksGetEffectiveFirewallsResponse extends StObject {
  
  /**
    * Effective firewalls from firewall policy.
    */
  var firewallPolicys: js.UndefOr[js.Array[SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy]] = js.undefined
  
  /**
    * Effective firewalls on the network.
    */
  var firewalls: js.UndefOr[js.Array[SchemaFirewall]] = js.undefined
  
  /**
    * Effective firewalls from organization policies.
    */
  var organizationFirewalls: js.UndefOr[js.Array[SchemaNetworksGetEffectiveFirewallsResponseOrganizationFirewallPolicy]] = js.undefined
}
object SchemaNetworksGetEffectiveFirewallsResponse {
  
  inline def apply(): SchemaNetworksGetEffectiveFirewallsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworksGetEffectiveFirewallsResponse]
  }
  
  extension [Self <: SchemaNetworksGetEffectiveFirewallsResponse](x: Self) {
    
    inline def setFirewallPolicys(value: js.Array[SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy]): Self = StObject.set(x, "firewallPolicys", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicysUndefined: Self = StObject.set(x, "firewallPolicys", js.undefined)
    
    inline def setFirewallPolicysVarargs(value: SchemaNetworksGetEffectiveFirewallsResponseEffectiveFirewallPolicy*): Self = StObject.set(x, "firewallPolicys", js.Array(value*))
    
    inline def setFirewalls(value: js.Array[SchemaFirewall]): Self = StObject.set(x, "firewalls", value.asInstanceOf[js.Any])
    
    inline def setFirewallsUndefined: Self = StObject.set(x, "firewalls", js.undefined)
    
    inline def setFirewallsVarargs(value: SchemaFirewall*): Self = StObject.set(x, "firewalls", js.Array(value*))
    
    inline def setOrganizationFirewalls(value: js.Array[SchemaNetworksGetEffectiveFirewallsResponseOrganizationFirewallPolicy]): Self = StObject.set(x, "organizationFirewalls", value.asInstanceOf[js.Any])
    
    inline def setOrganizationFirewallsUndefined: Self = StObject.set(x, "organizationFirewalls", js.undefined)
    
    inline def setOrganizationFirewallsVarargs(value: SchemaNetworksGetEffectiveFirewallsResponseOrganizationFirewallPolicy*): Self = StObject.set(x, "organizationFirewalls", js.Array(value*))
  }
}
