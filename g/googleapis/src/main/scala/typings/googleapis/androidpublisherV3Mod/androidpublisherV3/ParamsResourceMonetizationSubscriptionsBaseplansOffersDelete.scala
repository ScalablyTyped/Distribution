package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent base plan (ID) of the offer to delete.
    */
  var basePlanId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique offer ID of the offer to delete.
    */
  var offerId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent app (package name) of the offer to delete.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The parent subscription (ID) of the offer to delete.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete {
  
  inline def apply(): ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete]
  }
  
  extension [Self <: ParamsResourceMonetizationSubscriptionsBaseplansOffersDelete](x: Self) {
    
    inline def setBasePlanId(value: String): Self = StObject.set(x, "basePlanId", value.asInstanceOf[js.Any])
    
    inline def setBasePlanIdUndefined: Self = StObject.set(x, "basePlanId", js.undefined)
    
    inline def setOfferId(value: String): Self = StObject.set(x, "offerId", value.asInstanceOf[js.Any])
    
    inline def setOfferIdUndefined: Self = StObject.set(x, "offerId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
