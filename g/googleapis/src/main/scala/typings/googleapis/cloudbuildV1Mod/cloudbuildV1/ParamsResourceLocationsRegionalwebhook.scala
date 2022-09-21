package typings.googleapis.cloudbuildV1Mod.cloudbuildV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsRegionalwebhook
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The location where the webhook should be sent.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaHttpBody] = js.undefined
  
  /**
    * For GitHub Enterprise webhooks, this key is used to associate the webhook request with the GitHubEnterpriseConfig to use for validation.
    */
  var webhookKey: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsRegionalwebhook {
  
  inline def apply(): ParamsResourceLocationsRegionalwebhook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsRegionalwebhook]
  }
  
  extension [Self <: ParamsResourceLocationsRegionalwebhook](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRequestBody(value: SchemaHttpBody): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setWebhookKey(value: String): Self = StObject.set(x, "webhookKey", value.asInstanceOf[js.Any])
    
    inline def setWebhookKeyUndefined: Self = StObject.set(x, "webhookKey", js.undefined)
  }
}
