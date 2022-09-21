package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent base plan (ID) for which the offer should be created. Must be equal to the base_plan_id field on the SubscriptionOffer resource.
    */
  var basePlanId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID to use for the offer. For the requirements on this format, see the documentation of the offer_id field on the SubscriptionOffer resource.
    */
  var offerId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent app (package name) for which the offer should be created. Must be equal to the package_name field on the Subscription resource.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent subscription (ID) for which the offer should be created. Must be equal to the product_id field on the SubscriptionOffer resource.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. A string representing version of the available regions being used for the specified resource. The current version is 2022/01.
    */
  @JSName("regionsVersion.version")
  var regionsVersionDotversion: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSubscriptionOffer] = js.undefined
}
object ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate {
  
  inline def apply(): ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate]
  }
  
  extension [Self <: ParamsResourceMonetizationSubscriptionsBaseplansOffersCreate](x: Self) {
    
    inline def setBasePlanId(value: String): Self = StObject.set(x, "basePlanId", value.asInstanceOf[js.Any])
    
    inline def setBasePlanIdUndefined: Self = StObject.set(x, "basePlanId", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRegionsVersionDotversion(value: String): Self = StObject.set(x, "regionsVersion.version", value.asInstanceOf[js.Any])
    
    inline def setRegionsVersionDotversionUndefined: Self = StObject.set(x, "regionsVersion.version", js.undefined)
    
    inline def setRequestBody(value: SchemaSubscriptionOffer): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
