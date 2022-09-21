package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePurchasesProductsAcknowledge
  extends StObject
     with StandardParameters {
  
  /**
    * The package name of the application the inapp product was sold in (for example, 'com.some.thing').
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The inapp product SKU (for example, 'com.some.thing.inapp1').
    */
  var productId: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaProductPurchasesAcknowledgeRequest] = js.undefined
  
  /**
    * The token provided to the user's device when the inapp product was purchased.
    */
  var token: js.UndefOr[String] = js.undefined
}
object ParamsResourcePurchasesProductsAcknowledge {
  
  inline def apply(): ParamsResourcePurchasesProductsAcknowledge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePurchasesProductsAcknowledge]
  }
  
  extension [Self <: ParamsResourcePurchasesProductsAcknowledge](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setProductId(value: String): Self = StObject.set(x, "productId", value.asInstanceOf[js.Any])
    
    inline def setProductIdUndefined: Self = StObject.set(x, "productId", js.undefined)
    
    inline def setRequestBody(value: SchemaProductPurchasesAcknowledgeRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
