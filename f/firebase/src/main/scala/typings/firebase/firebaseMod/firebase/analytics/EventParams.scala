package typings.firebase.firebaseMod.firebase.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventParams extends StObject {
  
  var affiliation: js.UndefOr[String] = js.undefined
  
  var checkout_option: js.UndefOr[String] = js.undefined
  
  var checkout_step: js.UndefOr[Double] = js.undefined
  
  var content_type: js.UndefOr[String] = js.undefined
  
  var coupon: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var event_category: String
  
  var event_label: js.UndefOr[String] = js.undefined
  
  var fatal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Firebase-specific. Use to log a `screen_name` to Firebase Analytics.
    */
  var firebase_screen: js.UndefOr[String] = js.undefined
  
  /**
    * Firebase-specific. Use to log a `screen_class` to Firebase Analytics.
    */
  var firebase_screen_class: js.UndefOr[String] = js.undefined
  
  var item_id: js.UndefOr[String] = js.undefined
  
  var item_list_id: js.UndefOr[String] = js.undefined
  
  var item_list_name: js.UndefOr[String] = js.undefined
  
  var items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var payment_type: js.UndefOr[String] = js.undefined
  
  var promotion_id: js.UndefOr[String] = js.undefined
  
  var promotion_name: js.UndefOr[String] = js.undefined
  
  var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  
  var screen_name: js.UndefOr[String] = js.undefined
  
  var search_term: js.UndefOr[String] = js.undefined
  
  var shipping: js.UndefOr[Currency] = js.undefined
  
  var shipping_tier: js.UndefOr[String] = js.undefined
  
  var tax: js.UndefOr[Currency] = js.undefined
  
  var transaction_id: js.UndefOr[String] = js.undefined
  
  var value: js.UndefOr[Double] = js.undefined
}
object EventParams {
  
  inline def apply(event_category: String): EventParams = {
    val __obj = js.Dynamic.literal(event_category = event_category.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventParams]
  }
  
  extension [Self <: EventParams](x: Self) {
    
    inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
    
    inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
    
    inline def setCheckout_option(value: String): Self = StObject.set(x, "checkout_option", value.asInstanceOf[js.Any])
    
    inline def setCheckout_optionUndefined: Self = StObject.set(x, "checkout_option", js.undefined)
    
    inline def setCheckout_step(value: Double): Self = StObject.set(x, "checkout_step", value.asInstanceOf[js.Any])
    
    inline def setCheckout_stepUndefined: Self = StObject.set(x, "checkout_step", js.undefined)
    
    inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
    
    inline def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
    
    inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
    
    inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEvent_category(value: String): Self = StObject.set(x, "event_category", value.asInstanceOf[js.Any])
    
    inline def setEvent_label(value: String): Self = StObject.set(x, "event_label", value.asInstanceOf[js.Any])
    
    inline def setEvent_labelUndefined: Self = StObject.set(x, "event_label", js.undefined)
    
    inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
    
    inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
    
    inline def setFirebase_screen(value: String): Self = StObject.set(x, "firebase_screen", value.asInstanceOf[js.Any])
    
    inline def setFirebase_screenUndefined: Self = StObject.set(x, "firebase_screen", js.undefined)
    
    inline def setFirebase_screen_class(value: String): Self = StObject.set(x, "firebase_screen_class", value.asInstanceOf[js.Any])
    
    inline def setFirebase_screen_classUndefined: Self = StObject.set(x, "firebase_screen_class", js.undefined)
    
    inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
    
    inline def setItem_idUndefined: Self = StObject.set(x, "item_id", js.undefined)
    
    inline def setItem_list_id(value: String): Self = StObject.set(x, "item_list_id", value.asInstanceOf[js.Any])
    
    inline def setItem_list_idUndefined: Self = StObject.set(x, "item_list_id", js.undefined)
    
    inline def setItem_list_name(value: String): Self = StObject.set(x, "item_list_name", value.asInstanceOf[js.Any])
    
    inline def setItem_list_nameUndefined: Self = StObject.set(x, "item_list_name", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setPayment_type(value: String): Self = StObject.set(x, "payment_type", value.asInstanceOf[js.Any])
    
    inline def setPayment_typeUndefined: Self = StObject.set(x, "payment_type", js.undefined)
    
    inline def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
    
    inline def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
    
    inline def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
    
    inline def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
    
    inline def setPromotions(value: js.Array[Promotion]): Self = StObject.set(x, "promotions", value.asInstanceOf[js.Any])
    
    inline def setPromotionsUndefined: Self = StObject.set(x, "promotions", js.undefined)
    
    inline def setPromotionsVarargs(value: Promotion*): Self = StObject.set(x, "promotions", js.Array(value*))
    
    inline def setScreen_name(value: String): Self = StObject.set(x, "screen_name", value.asInstanceOf[js.Any])
    
    inline def setScreen_nameUndefined: Self = StObject.set(x, "screen_name", js.undefined)
    
    inline def setSearch_term(value: String): Self = StObject.set(x, "search_term", value.asInstanceOf[js.Any])
    
    inline def setSearch_termUndefined: Self = StObject.set(x, "search_term", js.undefined)
    
    inline def setShipping(value: Currency): Self = StObject.set(x, "shipping", value.asInstanceOf[js.Any])
    
    inline def setShippingUndefined: Self = StObject.set(x, "shipping", js.undefined)
    
    inline def setShipping_tier(value: String): Self = StObject.set(x, "shipping_tier", value.asInstanceOf[js.Any])
    
    inline def setShipping_tierUndefined: Self = StObject.set(x, "shipping_tier", js.undefined)
    
    inline def setTax(value: Currency): Self = StObject.set(x, "tax", value.asInstanceOf[js.Any])
    
    inline def setTaxUndefined: Self = StObject.set(x, "tax", js.undefined)
    
    inline def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    inline def setTransaction_idUndefined: Self = StObject.set(x, "transaction_id", js.undefined)
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
