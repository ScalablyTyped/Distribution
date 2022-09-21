package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The unique base plan ID of the base plan to update prices on.
    */
  var basePlanId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Package name of the parent app. Must be equal to the package_name field on the Subscription resource.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID of the subscription to update. Must be equal to the product_id field on the Subscription resource.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaMigrateBasePlanPricesRequest] = js.undefined
}
object ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices {
  
  inline def apply(): ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices]
  }
  
  extension [Self <: ParamsResourceMonetizationSubscriptionsBaseplansMigrateprices](x: Self) {
    
    inline def setBasePlanId(value: String): Self = StObject.set(x, "basePlanId", value.asInstanceOf[js.Any])
    
    inline def setBasePlanIdUndefined: Self = StObject.set(x, "basePlanId", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRequestBody(value: SchemaMigrateBasePlanPricesRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
