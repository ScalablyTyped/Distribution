package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMonetizationSubscriptionsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent app (package name) for which the subscription should be created. Must be equal to the package_name field on the Subscription resource.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The ID to use for the subscription. For the requirements on this format, see the documentation of the product_id field on the Subscription resource.
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
  var requestBody: js.UndefOr[SchemaSubscription] = js.undefined
}
object ParamsResourceMonetizationSubscriptionsCreate {
  
  inline def apply(): ParamsResourceMonetizationSubscriptionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonetizationSubscriptionsCreate]
  }
  
  extension [Self <: ParamsResourceMonetizationSubscriptionsCreate](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRegionsVersionDotversion(value: String): Self = StObject.set(x, "regionsVersion.version", value.asInstanceOf[js.Any])
    
    inline def setRegionsVersionDotversionUndefined: Self = StObject.set(x, "regionsVersion.version", js.undefined)
    
    inline def setRequestBody(value: SchemaSubscription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
