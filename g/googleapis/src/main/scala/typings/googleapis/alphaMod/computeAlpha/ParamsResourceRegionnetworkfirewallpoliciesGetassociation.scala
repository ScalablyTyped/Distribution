package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionnetworkfirewallpoliciesGetassociation
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
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionnetworkfirewallpoliciesGetassociation {
  
  inline def apply(): ParamsResourceRegionnetworkfirewallpoliciesGetassociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionnetworkfirewallpoliciesGetassociation]
  }
  
  extension [Self <: ParamsResourceRegionnetworkfirewallpoliciesGetassociation](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
  }
}
