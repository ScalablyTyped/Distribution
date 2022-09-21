package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConvertRegionPricesResponse extends StObject {
  
  /**
    * Converted other regions prices in USD and EUR, to use for countries where Play doesn't support a country's local currency.
    */
  var convertedOtherRegionsPrice: js.UndefOr[SchemaConvertedOtherRegionsPrice] = js.undefined
  
  /**
    * Map from region code to converted region price.
    */
  var convertedRegionPrices: js.UndefOr[StringDictionary[SchemaConvertedRegionPrice] | Null] = js.undefined
}
object SchemaConvertRegionPricesResponse {
  
  inline def apply(): SchemaConvertRegionPricesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConvertRegionPricesResponse]
  }
  
  extension [Self <: SchemaConvertRegionPricesResponse](x: Self) {
    
    inline def setConvertedOtherRegionsPrice(value: SchemaConvertedOtherRegionsPrice): Self = StObject.set(x, "convertedOtherRegionsPrice", value.asInstanceOf[js.Any])
    
    inline def setConvertedOtherRegionsPriceUndefined: Self = StObject.set(x, "convertedOtherRegionsPrice", js.undefined)
    
    inline def setConvertedRegionPrices(value: StringDictionary[SchemaConvertedRegionPrice]): Self = StObject.set(x, "convertedRegionPrices", value.asInstanceOf[js.Any])
    
    inline def setConvertedRegionPricesNull: Self = StObject.set(x, "convertedRegionPrices", null)
    
    inline def setConvertedRegionPricesUndefined: Self = StObject.set(x, "convertedRegionPrices", js.undefined)
  }
}
