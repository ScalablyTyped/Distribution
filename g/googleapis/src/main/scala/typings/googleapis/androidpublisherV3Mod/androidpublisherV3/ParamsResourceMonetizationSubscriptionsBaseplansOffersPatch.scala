package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Immutable. The ID of the base plan to which this offer is an extension.
    */
  var basePlanId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. Unique ID of this subscription offer. Must be unique within the base plan.
    */
  var offerId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. The package name of the app the parent subscription belongs to.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Immutable. The ID of the parent subscription this offer belongs to.
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
  
  /**
    * Required. The list of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch {
  
  inline def apply(): ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch]
  }
  
  extension [Self <: ParamsResourceMonetizationSubscriptionsBaseplansOffersPatch](x: Self) {
    
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
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
