package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.firebase.analytics.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Coupon
  extends /* key */ StringDictionary[js.Any] {
  
  var coupon: js.UndefOr[String] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  var shipping_tier: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object Coupon {
  
  @scala.inline
  def apply(): Coupon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coupon]
  }
  
  @scala.inline
  implicit class CouponMutableBuilder[Self <: Coupon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setShipping_tier(value: String): Self = StObject.set(x, "shipping_tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_tierUndefined: Self = StObject.set(x, "shipping_tier", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
