package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceMonetizationSubscriptionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The parent app (package name) of the subscription to get.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The unique product ID of the subscription to get.
    */
  var productId: js.UndefOr[String] = js.undefined
}
object ParamsResourceMonetizationSubscriptionsGet {
  
  inline def apply(): ParamsResourceMonetizationSubscriptionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMonetizationSubscriptionsGet]
  }
  
  extension [Self <: ParamsResourceMonetizationSubscriptionsGet](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
  }
}
