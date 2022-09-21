package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConvertRegionPricesRequest extends StObject {
  
  /**
    * The intital price to convert other regions from. Tax exclusive.
    */
  var price: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaConvertRegionPricesRequest {
  
  inline def apply(): SchemaConvertRegionPricesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConvertRegionPricesRequest]
  }
  
  extension [Self <: SchemaConvertRegionPricesRequest](x: Self) {
    
    inline def setPrice(value: SchemaMoney): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
  }
}
