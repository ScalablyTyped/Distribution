package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePurchasesSubscriptionsAcknowledge
  extends StObject
     with StandardParameters {
  
  /**
    * The package name of the application for which this subscription was purchased (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubscriptionPurchasesAcknowledgeRequest] = js.undefined
  
  /**
    * The purchased subscription ID (for example, 'monthly001').
    */
  var subscriptionId: js.UndefOr[String] = js.undefined
  
  /**
    * The token provided to the user's device when the subscription was purchased.
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourcePurchasesSubscriptionsAcknowledge {
  
  inline def apply(): ParamsResourcePurchasesSubscriptionsAcknowledge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesSubscriptionsAcknowledge]
  }
  
  extension [Self <: ParamsResourcePurchasesSubscriptionsAcknowledge](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRequestBody(value: SchemaSubscriptionPurchasesAcknowledgeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSubscriptionId(value: String): Self = StObject.set(x, "subscriptionId", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionIdUndefined: Self = StObject.set(x, "subscriptionId", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
