package typings.googleapis.appengineV1betaMod.appengineV1beta

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAppsFirewallIngressrulesPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Part of `name`. Name of the Firewall resource to update. Example:
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
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFirewallRule] = js.undefined
  
  /**
    * Standard field mask for the set of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceAppsFirewallIngressrulesPatch {
  
  @scala.inline
  def apply(): ParamsResourceAppsFirewallIngressrulesPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAppsFirewallIngressrulesPatch]
  }
  
  @scala.inline
  implicit class ParamsResourceAppsFirewallIngressrulesPatchMutableBuilder[Self <: ParamsResourceAppsFirewallIngressrulesPatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppsId(value: String): Self = StObject.set(x, "appsId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppsIdUndefined: Self = StObject.set(x, "appsId", js.undefined)
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    @scala.inline
    def setIngressRulesId(value: String): Self = StObject.set(x, "ingressRulesId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIngressRulesIdUndefined: Self = StObject.set(x, "ingressRulesId", js.undefined)
    
    @scala.inline
    def setRequestBody(value: SchemaFirewallRule): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    @scala.inline
    def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
