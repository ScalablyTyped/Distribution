package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinskyOfferType extends StObject {
  
  var finskyOfferType: js.UndefOr[Double] = js.native
  
  var giftable: js.UndefOr[Boolean] = js.native
  
  var listPrice: js.UndefOr[AmountInMicros] = js.native
  
  var rentalDuration: js.UndefOr[Unit] = js.native
  
  var retailPrice: js.UndefOr[AmountInMicros] = js.native
}
object FinskyOfferType {
  
  @scala.inline
  def apply(): FinskyOfferType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinskyOfferType]
  }
  
  @scala.inline
  implicit class FinskyOfferTypeMutableBuilder[Self <: FinskyOfferType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFinskyOfferType(value: Double): Self = StObject.set(x, "finskyOfferType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinskyOfferTypeUndefined: Self = StObject.set(x, "finskyOfferType", js.undefined)
    
    @scala.inline
    def setGiftable(value: Boolean): Self = StObject.set(x, "giftable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGiftableUndefined: Self = StObject.set(x, "giftable", js.undefined)
    
    @scala.inline
    def setListPrice(value: AmountInMicros): Self = StObject.set(x, "listPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPriceUndefined: Self = StObject.set(x, "listPrice", js.undefined)
    
    @scala.inline
    def setRentalDuration(value: Unit): Self = StObject.set(x, "rentalDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRentalDurationUndefined: Self = StObject.set(x, "rentalDuration", js.undefined)
    
    @scala.inline
    def setRetailPrice(value: AmountInMicros): Self = StObject.set(x, "retailPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetailPriceUndefined: Self = StObject.set(x, "retailPrice", js.undefined)
  }
}
