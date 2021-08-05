package typings.googleapis.appengineV1Mod.appengineV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsFirewallIngressrulesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the Firewall resource to retrieve. Example:
    * apps/myapp/firewall/ingressRules/100.
    */
  var appsId: js.UndefOr[String] = js.undefined
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * Part of `name`. See documentation of `appsId`.
    */
  var ingressRulesId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsFirewallIngressrulesGet {
  
  inline def apply(): ParamsResourceAppsFirewallIngressrulesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsFirewallIngressrulesGet]
  }
  
  extension [Self <: ParamsResourceAppsFirewallIngressrulesGet](x: Self) {
    
    inline def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    inline def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setIngressRulesId(value: String): Self = StObject.set(x, "ingressRulesId", value.asInstanceOf[js.Any])
    
    inline def setIngressRulesIdUndefined: Self = StObject.set(x, "ingressRulesId", js.undefined)
  }
}
