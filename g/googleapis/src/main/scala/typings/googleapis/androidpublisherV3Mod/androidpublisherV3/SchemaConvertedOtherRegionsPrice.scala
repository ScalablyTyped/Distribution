package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConvertedOtherRegionsPrice extends StObject {
  
  /**
    * Price in EUR to use for the "Other regions" location exclusive of taxes.
    */
  var eurPrice: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Price in USD to use for the "Other regions" location exclusive of taxes.
    */
  var usdPrice: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaConvertedOtherRegionsPrice {
  
  inline def apply(): SchemaConvertedOtherRegionsPrice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConvertedOtherRegionsPrice]
  }
  
  extension [Self <: SchemaConvertedOtherRegionsPrice](x: Self) {
    
    inline def setEurPrice(value: SchemaMoney): Self = StObject.set(x, "eurPrice", value.asInstanceOf[js.Any])
    
    inline def setEurPriceUndefined: Self = StObject.set(x, "eurPrice", js.undefined)
    
    inline def setUsdPrice(value: SchemaMoney): Self = StObject.set(x, "usdPrice", value.asInstanceOf[js.Any])
    
    inline def setUsdPriceUndefined: Self = StObject.set(x, "usdPrice", js.undefined)
  }
}
