package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceNetworkfirewallpoliciesGetassociation
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the firewall policy to which the queried association belongs.
    */
  var firewallPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the association to get from the firewall policy.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ParamsResourceNetworkfirewallpoliciesGetassociation {
  
  inline def apply(): ParamsResourceNetworkfirewallpoliciesGetassociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceNetworkfirewallpoliciesGetassociation]
  }
  
  extension [Self <: ParamsResourceNetworkfirewallpoliciesGetassociation](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
