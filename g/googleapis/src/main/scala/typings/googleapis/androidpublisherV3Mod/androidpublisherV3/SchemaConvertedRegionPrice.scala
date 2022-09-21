package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConvertedRegionPrice extends StObject {
  
  /**
    * The converted price tax inclusive.
    */
  var price: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * The region code of the region.
    */
  var regionCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tax amount of the converted price.
    */
  var taxAmount: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaConvertedRegionPrice {
  
  inline def apply(): SchemaConvertedRegionPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConvertedRegionPrice]
  }
  
  extension [Self <: SchemaConvertedRegionPrice](x: Self) {
    
    inline def setPrice(value: SchemaMoney): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeNull: Self = StObject.set(x, "regionCode", null)
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
    
    inline def setTaxAmount(value: SchemaMoney): Self = StObject.set(x, "taxAmount", value.asInstanceOf[js.Any])
    
    inline def setTaxAmountUndefined: Self = StObject.set(x, "taxAmount", js.undefined)
  }
}
