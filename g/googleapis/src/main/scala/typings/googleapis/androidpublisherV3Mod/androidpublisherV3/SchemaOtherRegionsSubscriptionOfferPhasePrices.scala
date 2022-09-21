package typings.googleapis.androidpublisherV3Mod.androidpublisherV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOtherRegionsSubscriptionOfferPhasePrices extends StObject {
  
  /**
    * Required. Price in EUR to use for any new locations Play may launch in.
    */
  var eurPrice: js.UndefOr[SchemaMoney] = js.undefined
  
  /**
    * Required. Price in USD to use for any new locations Play may launch in.
    */
  var usdPrice: js.UndefOr[SchemaMoney] = js.undefined
}
object SchemaOtherRegionsSubscriptionOfferPhasePrices {
  
  inline def apply(): SchemaOtherRegionsSubscriptionOfferPhasePrices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOtherRegionsSubscriptionOfferPhasePrices]
  }
  
  extension [Self <: SchemaOtherRegionsSubscriptionOfferPhasePrices](x: Self) {
    
    inline def setEurPrice(value: SchemaMoney): Self = StObject.set(x, "eurPrice", value.asInstanceOf[js.Any])
    
    inline def setEurPriceUndefined: Self = StObject.set(x, "eurPrice", js.undefined)
    
    inline def setUsdPrice(value: SchemaMoney): Self = StObject.set(x, "usdPrice", value.asInstanceOf[js.Any])
    
    inline def setUsdPriceUndefined: Self = StObject.set(x, "usdPrice", js.undefined)
  }
}
