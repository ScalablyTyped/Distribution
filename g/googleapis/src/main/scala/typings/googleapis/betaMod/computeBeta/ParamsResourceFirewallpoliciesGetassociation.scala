package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirewallpoliciesGetassociation
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the firewall policy to which the queried rule belongs.
    */
  var firewallPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the association to get from the firewall policy.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceFirewallpoliciesGetassociation {
  
  inline def apply(): ParamsResourceFirewallpoliciesGetassociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirewallpoliciesGetassociation]
  }
  
  extension [Self <: ParamsResourceFirewallpoliciesGetassociation](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
