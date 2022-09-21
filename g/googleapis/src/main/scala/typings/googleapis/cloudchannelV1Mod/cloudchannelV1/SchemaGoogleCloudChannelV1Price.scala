package typings.googleapis.cloudchannelV1Mod.cloudchannelV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudChannelV1Price extends StObject {
  
  /**
    * Base price.
    */
  var basePrice: js.UndefOr[SchemaGoogleTypeMoney] = js.undefined
  
  /**
    * Discount percentage, represented as decimal. For example, a 20% discount will be represent as 0.2.
    */
  var discount: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Effective Price after applying the discounts.
    */
  var effectivePrice: js.UndefOr[SchemaGoogleTypeMoney] = js.undefined
  
  /**
    * Link to external price list, such as link to Google Voice rate card.
    */
  var externalPriceUri: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudChannelV1Price {
  
  inline def apply(): SchemaGoogleCloudChannelV1Price = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudChannelV1Price]
  }
  
  extension [Self <: SchemaGoogleCloudChannelV1Price](x: Self) {
    
    inline def setBasePrice(value: SchemaGoogleTypeMoney): Self = StObject.set(x, "basePrice", value.asInstanceOf[js.Any])
    
    inline def setBasePriceUndefined: Self = StObject.set(x, "basePrice", js.undefined)
    
    inline def setDiscount(value: Double): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
    
    inline def setDiscountNull: Self = StObject.set(x, "discount", null)
    
    inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
    
    inline def setEffectivePrice(value: SchemaGoogleTypeMoney): Self = StObject.set(x, "effectivePrice", value.asInstanceOf[js.Any])
    
    inline def setEffectivePriceUndefined: Self = StObject.set(x, "effectivePrice", js.undefined)
    
    inline def setExternalPriceUri(value: String): Self = StObject.set(x, "externalPriceUri", value.asInstanceOf[js.Any])
    
    inline def setExternalPriceUriNull: Self = StObject.set(x, "externalPriceUri", null)
    
    inline def setExternalPriceUriUndefined: Self = StObject.set(x, "externalPriceUri", js.undefined)
  }
}
