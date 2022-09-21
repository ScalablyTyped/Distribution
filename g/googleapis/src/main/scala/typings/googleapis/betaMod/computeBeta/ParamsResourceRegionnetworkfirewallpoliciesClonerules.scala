package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceRegionnetworkfirewallpoliciesClonerules
  extends StObject
     with StandardParameters {
  
  /**
    * Name of the firewall policy to update.
    */
  var firewallPolicy: js.UndefOr[String] = js.undefined
  
  /**
    * Project ID for this request.
    */
  var project: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the region scoping this request.
    */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * An optional request ID to identify requests. Specify a unique request ID so that if you must retry your request, the server will know to ignore the request if it has already been completed. For example, consider a situation where you make an initial request and the request times out. If you make the request again with the same request ID, the server can check if original operation with the same request ID was received, and if so, will ignore the second request. This prevents clients from accidentally creating duplicate commitments. The request ID must be a valid UUID with the exception that zero UUID is not supported ( 00000000-0000-0000-0000-000000000000).
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * The firewall policy from which to copy rules.
    */
  var sourceFirewallPolicy: js.UndefOr[String] = js.undefined
}
object ParamsResourceRegionnetworkfirewallpoliciesClonerules {
  
  inline def apply(): ParamsResourceRegionnetworkfirewallpoliciesClonerules = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceRegionnetworkfirewallpoliciesClonerules]
  }
  
  extension [Self <: ParamsResourceRegionnetworkfirewallpoliciesClonerules](x: Self) {
    
    inline def setFirewallPolicy(value: String): Self = StObject.set(x, "firewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setFirewallPolicyUndefined: Self = StObject.set(x, "firewallPolicy", js.undefined)
    
    inline def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setSourceFirewallPolicy(value: String): Self = StObject.set(x, "sourceFirewallPolicy", value.asInstanceOf[js.Any])
    
    inline def setSourceFirewallPolicyUndefined: Self = StObject.set(x, "sourceFirewallPolicy", js.undefined)
  }
}
