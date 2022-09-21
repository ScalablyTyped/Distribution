package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInappproductsPatch
  extends StObject
     with StandardParameters {
  
  /**
    * If true the prices for all regions targeted by the parent app that don't have a price specified for this in-app product will be auto converted to the target currency based on the default price. Defaults to false.
    */
  var autoConvertMissingPrices: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaInAppProduct] = js.undefined
  
  /**
    * Unique identifier for the in-app product.
    */
  var sku: js.UndefOr[String] = js.undefined
}
object ParamsResourceInappproductsPatch {
  
  inline def apply(): ParamsResourceInappproductsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInappproductsPatch]
  }
  
  extension [Self <: ParamsResourceInappproductsPatch](x: Self) {
    
    inline def setAutoConvertMissingPrices(value: Boolean): Self = StObject.set(x, "autoConvertMissingPrices", value.asInstanceOf[js.Any])
    
    inline def setAutoConvertMissingPricesUndefined: Self = StObject.set(x, "autoConvertMissingPrices", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRequestBody(value: SchemaInAppProduct): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
