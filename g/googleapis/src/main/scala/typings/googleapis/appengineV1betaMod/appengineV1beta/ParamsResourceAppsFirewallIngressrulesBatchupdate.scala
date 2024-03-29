package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsFirewallIngressrulesBatchupdate
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the Firewall collection to set. Example: apps/myapp/firewall/ingressRules.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBatchUpdateIngressRulesRequest] = js.undefined
}
object ParamsResourceAppsFirewallIngressrulesBatchupdate {
  
  inline def apply(): ParamsResourceAppsFirewallIngressrulesBatchupdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsFirewallIngressrulesBatchupdate]
  }
  
  extension [Self <: ParamsResourceAppsFirewallIngressrulesBatchupdate](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setRequestBody(value: SchemaBatchUpdateIngressRulesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
