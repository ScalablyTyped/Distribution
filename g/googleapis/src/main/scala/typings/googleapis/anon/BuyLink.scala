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
  
  @scala.inline
  def apply(): BuyLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuyLink]
  }
  
  @scala.inline
  implicit class BuyLinkMutableBuilder[Self <: BuyLink] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuyLink(value: String): Self = StObject.set(x, "buyLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuyLinkUndefined: Self = StObject.set(x, "buyLink", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setIsEbook(value: Boolean): Self = StObject.set(x, "isEbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEbookUndefined: Self = StObject.set(x, "isEbook", js.undefined)
    
    @scala.inline
    def setListPrice(value: Amount): Self = StObject.set(x, "listPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListPriceUndefined: Self = StObject.set(x, "listPrice", js.undefined)
    
    @scala.inline
    def setOffers(value: js.Array[FinskyOfferType]): Self = StObject.set(x, "offers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffersUndefined: Self = StObject.set(x, "offers", js.undefined)
    
    @scala.inline
    def setOffersVarargs(value: FinskyOfferType*): Self = StObject.set(x, "offers", js.Array(value :_*))
    
    @scala.inline
    def setOnSaleDate(value: String): Self = StObject.set(x, "onSaleDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSaleDateUndefined: Self = StObject.set(x, "onSaleDate", js.undefined)
    
    @scala.inline
    def setRetailPrice(value: Amount): Self = StObject.set(x, "retailPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetailPriceUndefined: Self = StObject.set(x, "retailPrice", js.undefined)
    
    @scala.inline
    def setSaleability(value: String): Self = StObject.set(x, "saleability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleabilityUndefined: Self = StObject.set(x, "saleability", js.undefined)
  }
}
