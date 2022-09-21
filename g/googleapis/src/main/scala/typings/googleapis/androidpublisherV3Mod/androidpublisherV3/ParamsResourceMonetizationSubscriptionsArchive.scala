package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMonetizationSubscriptionsArchive
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent app (package name) of the app of the subscription to delete.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique product ID of the subscription to delete.
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaArchiveSubscriptionRequest] = js.undefined
}
object ParamsResourceMonetizationSubscriptionsArchive {
  
  inline def apply(): ParamsResourceMonetizationSubscriptionsArchive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonetizationSubscriptionsArchive]
  }
  
  extension [Self <: ParamsResourceMonetizationSubscriptionsArchive](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRequestBody(value: SchemaArchiveSubscriptionRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
