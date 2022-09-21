package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsFirewallIngressrulesList
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `parent`. Name of the Firewall collection to retrieve. Example: apps/myapp/firewall/ingressRules.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * A valid IP Address. If set, only rules matching this address will be returned. The first returned rule will be the rule that fires on requests from this IP.
    */
  var matchingAddress: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum results to return per page.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  
  /**
    * Continuation token for fetching the next page of results.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsFirewallIngressrulesList {
  
  inline def apply(): ParamsResourceAppsFirewallIngressrulesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsFirewallIngressrulesList]
  }
  
  extension [Self <: ParamsResourceAppsFirewallIngressrulesList](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setMatchingAddress(value: String): Self = StObject.set(x, "matchingAddress", value.asInstanceOf[js.Any])
    
    inline def setMatchingAddressUndefined: Self = StObject.set(x, "matchingAddress", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    
    inline def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    inline def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
