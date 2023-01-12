package typings.firebaseAnalytics.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.distSrcPublicTypesMod.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckoutstepCoupon
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var checkout_option: js.UndefOr[String] = js.undefined
  
  var checkout_step: js.UndefOr[Double] = js.undefined
  
  var coupon: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object CheckoutstepCoupon {
  
  inline def apply(): CheckoutstepCoupon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckoutstepCoupon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckoutstepCoupon] (val x: Self) extends AnyVal {
    
    inline def setCheckout_option(value: String): Self = StObject.set(x, "checkout_option", value.asInstanceOf[js.Any])
    
    inline def setCheckout_optionUndefined: Self = StObject.set(x, "checkout_option", js.undefined)
    
    inline def setCheckout_step(value: Double): Self = StObject.set(x, "checkout_step", value.asInstanceOf[js.Any])
    
    inline def setCheckout_stepUndefined: Self = StObject.set(x, "checkout_step", js.undefined)
    
    inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
