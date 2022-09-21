package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirewallpoliciesGetrule
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the firewall policy to which the queried rule belongs.
    */
  var firewallPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The priority of the rule to get from the firewall policy.
    */
  var priority: js.UndefOr[Double] = js.undefined
}
object ParamsResourceFirewallpoliciesGetrule {
  
  inline def apply(): ParamsResourceFirewallpoliciesGetrule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirewallpoliciesGetrule]
  }
  
  extension [Self <: ParamsResourceFirewallpoliciesGetrule](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
