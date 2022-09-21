package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMonetizationSubscriptionsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * Immutable. Package name of the parent app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. Unique product ID of the product. Unique within the parent app. Product IDs must be composed of lower-case letters (a-z), numbers (0-9), underscores (_) and dots (.). It must start with a lower-case letter or number, and be between 1 and 40 (inclusive) characters in length.
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
  
  /**
    * Required. The list of fields to be updated.
    */
  var updateMask: js.UndefOr[String] = js.undefined
}
object ParamsResourceMonetizationSubscriptionsPatch {
  
  inline def apply(): ParamsResourceMonetizationSubscriptionsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonetizationSubscriptionsPatch]
  }
  
  extension [Self <: ParamsResourceMonetizationSubscriptionsPatch](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRegionsVersionDotversion(value: String): Self = StObject.set(x, "regionsVersion.version", value.asInstanceOf[js.Any])
    
    inline def setRegionsVersionDotversionUndefined: Self = StObject.set(x, "regionsVersion.version", js.undefined)
    
    inline def setRequestBody(value: SchemaSubscription): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setUpdateMask(value: String): Self = StObject.set(x, "updateMask", value.asInstanceOf[js.Any])
    
    inline def setUpdateMaskUndefined: Self = StObject.set(x, "updateMask", js.undefined)
  }
}
