package typings.firebase.mod.firebase.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventParams extends StObject {
  
  var affiliation: js.UndefOr[String] = js.native
  
  var checkout_option: js.UndefOr[String] = js.native
  
  var checkout_step: js.UndefOr[Double] = js.native
  
  var content_id: js.UndefOr[String] = js.native
  
  var content_type: js.UndefOr[String] = js.native
  
  var coupon: js.UndefOr[String] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var event_category: String = js.native
  
  var event_label: js.UndefOr[String] = js.native
  
  var fatal: js.UndefOr[Boolean] = js.native
  
  var item_list_id: js.UndefOr[String] = js.native
  
  var item_list_name: js.UndefOr[String] = js.native
  
  var items: js.UndefOr[js.Array[Item]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[String] = js.native
  
  var payment_type: js.UndefOr[String] = js.native
  
  var promotion_id: js.UndefOr[String] = js.native
  
  var promotion_name: js.UndefOr[String] = js.native
  
  var promotions: js.UndefOr[js.Array[Promotion]] = js.native
  
  var screen_name: js.UndefOr[String] = js.native
  
  var search_term: js.UndefOr[String] = js.native
  
  var shipping: js.UndefOr[Currency] = js.native
  
  var shipping_tier: js.UndefOr[String] = js.native
  
  var tax: js.UndefOr[Currency] = js.native
  
  var transaction_id: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object EventParams {
  
  @scala.inline
  def apply(event_category: String): EventParams = {
    val __obj = js.Dynamic.literal(event_category = event_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
  
  @scala.inline
  implicit class EventParamsMutableBuilder[Self <: EventParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    @scala.inline
    def setCheckout_option(value: String): Self = StObject.set(x, "checkout_option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckout_optionUndefined: Self = StObject.set(x, "checkout_option", js.undefined)
    
    @scala.inline
    def setCheckout_step(value: Double): Self = StObject.set(x, "checkout_step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckout_stepUndefined: Self = StObject.set(x, "checkout_step", js.undefined)
    
    @scala.inline
    def setContent_id(value: String): Self = StObject.set(x, "content_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_idUndefined: Self = StObject.set(x, "content_id", js.undefined)
    
    @scala.inline
    def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    @scala.inline
    def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setEvent_category(value: String): Self = StObject.set(x, "event_category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_label(value: String): Self = StObject.set(x, "event_label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvent_labelUndefined: Self = StObject.set(x, "event_label", js.undefined)
    
    @scala.inline
    def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
    
    @scala.inline
    def setItem_list_id(value: String): Self = StObject.set(x, "item_list_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_list_idUndefined: Self = StObject.set(x, "item_list_id", js.undefined)
    
    @scala.inline
    def setItem_list_name(value: String): Self = StObject.set(x, "item_list_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_list_nameUndefined: Self = StObject.set(x, "item_list_name", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setPayment_type(value: String): Self = StObject.set(x, "payment_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayment_typeUndefined: Self = StObject.set(x, "payment_type", js.undefined)
    
    @scala.inline
    def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
    
    @scala.inline
    def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
    
    @scala.inline
    def setPromotions(value: js.Array[Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    @scala.inline
    def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value :_*))
    
    @scala.inline
    def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
    
    @scala.inline
    def setSearch_term(value: String): Self = StObject.set(x, "search_term", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch_termUndefined: Self = StObject.set(x, "search_term", js.undefined)
    
    @scala.inline
    def setShipping(value: Currency): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    @scala.inline
    def setShipping_tier(value: String): Self = StObject.set(x, "shipping_tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShipping_tierUndefined: Self = StObject.set(x, "shipping_tier", js.undefined)
    
    @scala.inline
    def setTax(value: Currency): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
