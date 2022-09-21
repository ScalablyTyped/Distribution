package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPrice extends StObject {
  
  /**
    * 3 letter Currency code, as defined by ISO 4217. See java/com/google/common/money/CurrencyCode.java
    */
  var currency: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Price in 1/million of the currency base unit, represented as a string.
    */
  var priceMicros: js.UndefOr[String | Null] = js.undefined
}
object SchemaPrice {
  
  inline def apply(): SchemaPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPrice]
  }
  
  extension [Self <: SchemaPrice](x: Self) {
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyNull: Self = StObject.set(x, "currency", null)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setPriceMicros(value: String): Self = StObject.set(x, "priceMicros", value.asInstanceOf[js.Any])
    
    inline def setPriceMicrosNull: Self = StObject.set(x, "priceMicros", null)
    
    inline def setPriceMicrosUndefined: Self = StObject.set(x, "priceMicros", js.undefined)
  }
}
