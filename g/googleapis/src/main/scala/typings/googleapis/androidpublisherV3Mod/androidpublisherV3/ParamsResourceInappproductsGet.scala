package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceInappproductsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Package name of the app.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * Unique identifier for the in-app product.
    */
  var sku: js.UndefOr[String] = js.undefined
}
object ParamsResourceInappproductsGet {
  
  inline def apply(): ParamsResourceInappproductsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceInappproductsGet]
  }
  
  extension [Self <: ParamsResourceInappproductsGet](x: Self) {
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setSku(value: String): Self = StObject.set(x, "sku", value.asInstanceOf[js.Any])
    
    inline def setSkuUndefined: Self = StObject.set(x, "sku", js.undefined)
  }
}
