package typings.googleapis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuyLink extends StObject {
  
  var buyLink: js.UndefOr[String] = js.undefined
  
  var country: js.UndefOr[String] = js.undefined
  
  var isEbook: js.UndefOr[Boolean] = js.undefined
  
  var listPrice: js.UndefOr[Amount] = js.undefined
  
  var offers: js.UndefOr[js.Array[FinskyOfferType]] = js.undefined
  
  var onSaleDate: js.UndefOr[String] = js.undefined
  
  var retailPrice: js.UndefOr[Amount] = js.undefined
  
  var saleability: js.UndefOr[String] = js.undefined
}
object BuyLink {
  
  inline def apply(): BuyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyLink]
  }
  
  extension [Self <: BuyLink](x: Self) {
    
    inline def setBuyLink(value: String): Self = StObject.set(x, "buyLink", value.asInstanceOf[js.Any])
    
    inline def setBuyLinkUndefined: Self = StObject.set(x, "buyLink", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setIsEbook(value: Boolean): Self = StObject.set(x, "isEbook", value.asInstanceOf[js.Any])
    
    inline def setIsEbookUndefined: Self = StObject.set(x, "isEbook", js.undefined)
    
    inline def setListPrice(value: Amount): Self = StObject.set(x, "listPrice", value.asInstanceOf[js.Any])
    
    inline def setListPriceUndefined: Self = StObject.set(x, "listPrice", js.undefined)
    
    inline def setOffers(value: js.Array[FinskyOfferType]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    inline def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
    
    inline def setOffersVarargs(value: FinskyOfferType*): Self = StObject.set(x, "offers", js.Array(value*))
    
    inline def setOnSaleDate(value: String): Self = StObject.set(x, "onSaleDate", value.asInstanceOf[js.Any])
    
    inline def setOnSaleDateUndefined: Self = StObject.set(x, "onSaleDate", js.undefined)
    
    inline def setRetailPrice(value: Amount): Self = StObject.set(x, "retailPrice", value.asInstanceOf[js.Any])
    
    inline def setRetailPriceUndefined: Self = StObject.set(x, "retailPrice", js.undefined)
    
    inline def setSaleability(value: String): Self = StObject.set(x, "saleability", value.asInstanceOf[js.Any])
    
    inline def setSaleabilityUndefined: Self = StObject.set(x, "saleability", js.undefined)
  }
}
