package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinskyOfferType extends StObject {
  
  var finskyOfferType: js.UndefOr[Double] = js.undefined
  
  var giftable: js.UndefOr[Boolean] = js.undefined
  
  var listPrice: js.UndefOr[CurrencyCode] = js.undefined
  
  var rentalDuration: js.UndefOr[Unit] = js.undefined
  
  var retailPrice: js.UndefOr[CurrencyCode] = js.undefined
}
object FinskyOfferType {
  
  inline def apply(): FinskyOfferType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinskyOfferType]
  }
  
  extension [Self <: FinskyOfferType](x: Self) {
    
    inline def setFinskyOfferType(value: Double): Self = StObject.set(x, "finskyOfferType", value.asInstanceOf[js.Any])
    
    inline def setFinskyOfferTypeUndefined: Self = StObject.set(x, "finskyOfferType", js.undefined)
    
    inline def setGiftable(value: Boolean): Self = StObject.set(x, "giftable", value.asInstanceOf[js.Any])
    
    inline def setGiftableUndefined: Self = StObject.set(x, "giftable", js.undefined)
    
    inline def setListPrice(value: CurrencyCode): Self = StObject.set(x, "listPrice", value.asInstanceOf[js.Any])
    
    inline def setListPriceUndefined: Self = StObject.set(x, "listPrice", js.undefined)
    
    inline def setRentalDuration(value: Unit): Self = StObject.set(x, "rentalDuration", value.asInstanceOf[js.Any])
    
    inline def setRentalDurationUndefined: Self = StObject.set(x, "rentalDuration", js.undefined)
    
    inline def setRetailPrice(value: CurrencyCode): Self = StObject.set(x, "retailPrice", value.asInstanceOf[js.Any])
    
    inline def setRetailPriceUndefined: Self = StObject.set(x, "retailPrice", js.undefined)
  }
}
