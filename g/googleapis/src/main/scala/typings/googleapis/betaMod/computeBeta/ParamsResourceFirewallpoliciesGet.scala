package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceFirewallpoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the firewall policy to get.
    */
  var firewallPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceFirewallpoliciesGet {
  
  inline def apply(): ParamsResourceFirewallpoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceFirewallpoliciesGet]
  }
  
  extension [Self <: ParamsResourceFirewallpoliciesGet](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
  }
}
