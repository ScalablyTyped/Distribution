package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNetworkfirewallpoliciesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the firewall policy to get.
    */
  var firewallPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceNetworkfirewallpoliciesGet {
  
  inline def apply(): ParamsResourceNetworkfirewallpoliciesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworkfirewallpoliciesGet]
  }
  
  extension [Self <: ParamsResourceNetworkfirewallpoliciesGet](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
