package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.distEsmSrcPublicTypesMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tax
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var affiliation: js.UndefOr[String] = js.undefined
  
  var coupon: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var shipping: js.UndefOr[typings.firebaseAnalytics.distEsmSrcPublicTypesMod.Currency] = js.undefined
  
  var tax: js.UndefOr[typings.firebaseAnalytics.distEsmSrcPublicTypesMod.Currency] = js.undefined
  
  var transaction_id: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object Tax {
  
  inline def apply(): Tax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Tax]
  }
  
  extension [Self <: Tax](x: Self) {
    
    inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setShipping(value: typings.firebaseAnalytics.distEsmSrcPublicTypesMod.Currency): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setTax(value: typings.firebaseAnalytics.distEsmSrcPublicTypesMod.Currency): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
