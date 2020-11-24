package typings.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.mod.firebase.analytics.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkoutoption
  extends /* key */ StringDictionary[js.Any] {
  
  var checkout_option: js.UndefOr[String] = js.native
  
  var checkout_step: js.UndefOr[Double] = js.native
  
  var coupon: js.UndefOr[String] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object Checkoutoption {
  
  @scala.inline
  def apply(): Checkoutoption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Checkoutoption]
  }
  
  @scala.inline
  implicit class CheckoutoptionOps[Self <: Checkoutoption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckout_option(value: String): Self = this.set("checkout_option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckout_option: Self = this.set("checkout_option", js.undefined)
    
    @scala.inline
    def setCheckout_step(value: Double): Self = this.set("checkout_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckout_step: Self = this.set("checkout_step", js.undefined)
    
    @scala.inline
    def setCoupon(value: String): Self = this.set("coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoupon: Self = this.set("coupon", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
