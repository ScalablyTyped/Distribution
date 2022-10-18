package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.distAnalyticsMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paymenttype
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var coupon: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var payment_type: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object Paymenttype {
  
  inline def apply(): Paymenttype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paymenttype]
  }
  
  extension [Self <: Paymenttype](x: Self) {
    
    inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setPayment_type(value: String): Self = StObject.set(x, "payment_type", value.asInstanceOf[js.Any])
    
    inline def setPayment_typeUndefined: Self = StObject.set(x, "payment_type", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
