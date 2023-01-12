package typings.firebaseAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPublicTypesMod {
  
  trait Analytics extends StObject {
    
    /**
      * The {@link @firebase/app#FirebaseApp} this {@link Analytics} instance is associated with.
      */
    var app: FirebaseApp
  }
  object Analytics {
    
    inline def apply(app: FirebaseApp): Analytics = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[Analytics]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Analytics] (val x: Self) extends AnyVal {
      
      inline def setApp(value: FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsCallOptions extends StObject {
    
    /**
      * If true, this config or event call applies globally to all
      * Google Analytics properties on the page.
      */
    var global: Boolean
  }
  object AnalyticsCallOptions {
    
    inline def apply(global: Boolean): AnalyticsCallOptions = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsCallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsCallOptions] (val x: Self) extends AnyVal {
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnalyticsSettings extends StObject {
    
    /**
      * Params to be passed in the initial `gtag` config call during Firebase
      * Analytics initialization.
      */
    var config: js.UndefOr[GtagConfigParams | EventParams] = js.undefined
  }
  object AnalyticsSettings {
    
    inline def apply(): AnalyticsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnalyticsSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnalyticsSettings] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: GtagConfigParams | EventParams): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    }
  }
  
  trait ConsentSettings
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /** Enables storage, such as cookies, related to advertising */
    var ad_storage: js.UndefOr[ConsentStatusString] = js.undefined
    
    /** Enables storage, such as cookies, related to analytics (for example, visit duration) */
    var analytics_storage: js.UndefOr[ConsentStatusString] = js.undefined
    
    /**
      * Enables storage that supports the functionality of the website or app such as language settings
      */
    var functionality_storage: js.UndefOr[ConsentStatusString] = js.undefined
    
    /** Enables storage related to personalization such as video recommendations */
    var personalization_storage: js.UndefOr[ConsentStatusString] = js.undefined
    
    /**
      * Enables storage related to security such as authentication functionality, fraud prevention,
      * and other user protection.
      */
    var security_storage: js.UndefOr[ConsentStatusString] = js.undefined
  }
  object ConsentSettings {
    
    inline def apply(): ConsentSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConsentSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConsentSettings] (val x: Self) extends AnyVal {
      
      inline def setAd_storage(value: ConsentStatusString): Self = StObject.set(x, "ad_storage", value.asInstanceOf[js.Any])
      
      inline def setAd_storageUndefined: Self = StObject.set(x, "ad_storage", js.undefined)
      
      inline def setAnalytics_storage(value: ConsentStatusString): Self = StObject.set(x, "analytics_storage", value.asInstanceOf[js.Any])
      
      inline def setAnalytics_storageUndefined: Self = StObject.set(x, "analytics_storage", js.undefined)
      
      inline def setFunctionality_storage(value: ConsentStatusString): Self = StObject.set(x, "functionality_storage", value.asInstanceOf[js.Any])
      
      inline def setFunctionality_storageUndefined: Self = StObject.set(x, "functionality_storage", js.undefined)
      
      inline def setPersonalization_storage(value: ConsentStatusString): Self = StObject.set(x, "personalization_storage", value.asInstanceOf[js.Any])
      
      inline def setPersonalization_storageUndefined: Self = StObject.set(x, "personalization_storage", js.undefined)
      
      inline def setSecurity_storage(value: ConsentStatusString): Self = StObject.set(x, "security_storage", value.asInstanceOf[js.Any])
      
      inline def setSecurity_storageUndefined: Self = StObject.set(x, "security_storage", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.granted
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.denied
  */
  trait ConsentStatusString extends StObject
  object ConsentStatusString {
    
    inline def denied: typings.firebaseAnalytics.firebaseAnalyticsStrings.denied = "denied".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.denied]
    
    inline def granted: typings.firebaseAnalytics.firebaseAnalyticsStrings.granted = "granted".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.granted]
  }
  
  trait ControlParams extends StObject {
    
    var event_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var event_timeout: js.UndefOr[Double] = js.undefined
    
    var groups: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var send_to: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ControlParams {
    
    inline def apply(): ControlParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ControlParams] (val x: Self) extends AnyVal {
      
      inline def setEvent_callback(value: () => Unit): Self = StObject.set(x, "event_callback", js.Any.fromFunction0(value))
      
      inline def setEvent_callbackUndefined: Self = StObject.set(x, "event_callback", js.undefined)
      
      inline def setEvent_timeout(value: Double): Self = StObject.set(x, "event_timeout", value.asInstanceOf[js.Any])
      
      inline def setEvent_timeoutUndefined: Self = StObject.set(x, "event_timeout", js.undefined)
      
      inline def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value*))
      
      inline def setSend_to(value: String | js.Array[String]): Self = StObject.set(x, "send_to", value.asInstanceOf[js.Any])
      
      inline def setSend_toUndefined: Self = StObject.set(x, "send_to", js.undefined)
      
      inline def setSend_toVarargs(value: String*): Self = StObject.set(x, "send_to", js.Array(value*))
    }
  }
  
  type Currency = String | Double
  
  type CustomParams = StringDictionary[Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.add_payment_info
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.add_shipping_info
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.add_to_cart
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.add_to_wishlist
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.begin_checkout
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.checkout_progress
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.exception
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.generate_lead
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.login
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.page_view
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.purchase
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.refund
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.remove_from_cart
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.screen_view
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.search
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.select_content
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.select_item
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.select_promotion
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.set_checkout_option
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.share
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.sign_up
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.timing_complete
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.view_cart
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.view_item
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.view_item_list
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.view_promotion
    - typings.firebaseAnalytics.firebaseAnalyticsStrings.view_search_results
  */
  trait EventNameString extends StObject
  object EventNameString {
    
    inline def add_payment_info: typings.firebaseAnalytics.firebaseAnalyticsStrings.add_payment_info = "add_payment_info".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.add_payment_info]
    
    inline def add_shipping_info: typings.firebaseAnalytics.firebaseAnalyticsStrings.add_shipping_info = "add_shipping_info".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.add_shipping_info]
    
    inline def add_to_cart: typings.firebaseAnalytics.firebaseAnalyticsStrings.add_to_cart = "add_to_cart".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.add_to_cart]
    
    inline def add_to_wishlist: typings.firebaseAnalytics.firebaseAnalyticsStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.add_to_wishlist]
    
    inline def begin_checkout: typings.firebaseAnalytics.firebaseAnalyticsStrings.begin_checkout = "begin_checkout".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.begin_checkout]
    
    inline def checkout_progress: typings.firebaseAnalytics.firebaseAnalyticsStrings.checkout_progress = "checkout_progress".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.checkout_progress]
    
    inline def exception: typings.firebaseAnalytics.firebaseAnalyticsStrings.exception = "exception".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.exception]
    
    inline def generate_lead: typings.firebaseAnalytics.firebaseAnalyticsStrings.generate_lead = "generate_lead".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.generate_lead]
    
    inline def login: typings.firebaseAnalytics.firebaseAnalyticsStrings.login = "login".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.login]
    
    inline def page_view: typings.firebaseAnalytics.firebaseAnalyticsStrings.page_view = "page_view".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.page_view]
    
    inline def purchase: typings.firebaseAnalytics.firebaseAnalyticsStrings.purchase = "purchase".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.purchase]
    
    inline def refund: typings.firebaseAnalytics.firebaseAnalyticsStrings.refund = "refund".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.refund]
    
    inline def remove_from_cart: typings.firebaseAnalytics.firebaseAnalyticsStrings.remove_from_cart = "remove_from_cart".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.remove_from_cart]
    
    inline def screen_view: typings.firebaseAnalytics.firebaseAnalyticsStrings.screen_view = "screen_view".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.screen_view]
    
    inline def search: typings.firebaseAnalytics.firebaseAnalyticsStrings.search = "search".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.search]
    
    inline def select_content: typings.firebaseAnalytics.firebaseAnalyticsStrings.select_content = "select_content".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.select_content]
    
    inline def select_item: typings.firebaseAnalytics.firebaseAnalyticsStrings.select_item = "select_item".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.select_item]
    
    inline def select_promotion: typings.firebaseAnalytics.firebaseAnalyticsStrings.select_promotion = "select_promotion".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.select_promotion]
    
    inline def set_checkout_option: typings.firebaseAnalytics.firebaseAnalyticsStrings.set_checkout_option = "set_checkout_option".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.set_checkout_option]
    
    inline def share: typings.firebaseAnalytics.firebaseAnalyticsStrings.share = "share".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.share]
    
    inline def sign_up: typings.firebaseAnalytics.firebaseAnalyticsStrings.sign_up = "sign_up".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.sign_up]
    
    inline def timing_complete: typings.firebaseAnalytics.firebaseAnalyticsStrings.timing_complete = "timing_complete".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.timing_complete]
    
    inline def view_cart: typings.firebaseAnalytics.firebaseAnalyticsStrings.view_cart = "view_cart".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.view_cart]
    
    inline def view_item: typings.firebaseAnalytics.firebaseAnalyticsStrings.view_item = "view_item".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.view_item]
    
    inline def view_item_list: typings.firebaseAnalytics.firebaseAnalyticsStrings.view_item_list = "view_item_list".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.view_item_list]
    
    inline def view_promotion: typings.firebaseAnalytics.firebaseAnalyticsStrings.view_promotion = "view_promotion".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.view_promotion]
    
    inline def view_search_results: typings.firebaseAnalytics.firebaseAnalyticsStrings.view_search_results = "view_search_results".asInstanceOf[typings.firebaseAnalytics.firebaseAnalyticsStrings.view_search_results]
  }
  
  trait EventParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var affiliation: js.UndefOr[String] = js.undefined
    
    var checkout_option: js.UndefOr[String] = js.undefined
    
    var checkout_step: js.UndefOr[Double] = js.undefined
    
    var content_type: js.UndefOr[String] = js.undefined
    
    var coupon: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var event_category: js.UndefOr[String] = js.undefined
    
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
    
    var page_location: js.UndefOr[String] = js.undefined
    
    var page_path: js.UndefOr[String] = js.undefined
    
    var page_title: js.UndefOr[String] = js.undefined
    
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
    
    inline def apply(): EventParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventParams] (val x: Self) extends AnyVal {
      
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
      
      inline def setEvent_categoryUndefined: Self = StObject.set(x, "event_category", js.undefined)
      
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
      
      inline def setPage_location(value: String): Self = StObject.set(x, "page_location", value.asInstanceOf[js.Any])
      
      inline def setPage_locationUndefined: Self = StObject.set(x, "page_location", js.undefined)
      
      inline def setPage_path(value: String): Self = StObject.set(x, "page_path", value.asInstanceOf[js.Any])
      
      inline def setPage_pathUndefined: Self = StObject.set(x, "page_path", js.undefined)
      
      inline def setPage_title(value: String): Self = StObject.set(x, "page_title", value.asInstanceOf[js.Any])
      
      inline def setPage_titleUndefined: Self = StObject.set(x, "page_title", js.undefined)
      
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
  
  trait GtagConfigParams
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * If set to false, disables all advertising personalization with `gtag.js`.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/display-features | Disable advertising features }
      */
    var allow_ad_personalization_signals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to false, disables all advertising features with `gtag.js`.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/display-features | Disable advertising features }
      */
    var allow_google_signals: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to `auto`.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/cookies-user-id | Cookies and user identification }
      */
    var cookie_domain: js.UndefOr[String] = js.undefined
    
    /**
      * Defaults to 63072000 (two years, in seconds).
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/cookies-user-id | Cookies and user identification }
      */
    var cookie_expires: js.UndefOr[Double] = js.undefined
    
    /**
      * Appends additional flags to the cookie when set.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/cookies-user-id | Cookies and user identification }
      */
    var cookie_flags: js.UndefOr[String] = js.undefined
    
    /**
      * Defaults to `_ga`.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/cookies-user-id | Cookies and user identification }
      */
    var cookie_prefix: js.UndefOr[String] = js.undefined
    
    /**
      * If set to true, will update cookies on each page load.
      * Defaults to true.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/cookies-user-id | Cookies and user identification }
      */
    var cookie_update: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The URL of the page.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/page-view | Page views }
      */
    var page_location: js.UndefOr[String] = js.undefined
    
    /**
      * The title of the page.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/page-view | Page views }
      */
    var page_title: js.UndefOr[String] = js.undefined
    
    /**
      * Whether or not a page view should be sent.
      * If set to true (default), a page view is automatically sent upon initialization
      * of analytics.
      * See {@link https://developers.google.com/analytics/devguides/collection/ga4/page-view | Page views }
      */
    var send_page_view: js.UndefOr[Boolean] = js.undefined
  }
  object GtagConfigParams {
    
    inline def apply(): GtagConfigParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GtagConfigParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GtagConfigParams] (val x: Self) extends AnyVal {
      
      inline def setAllow_ad_personalization_signals(value: Boolean): Self = StObject.set(x, "allow_ad_personalization_signals", value.asInstanceOf[js.Any])
      
      inline def setAllow_ad_personalization_signalsUndefined: Self = StObject.set(x, "allow_ad_personalization_signals", js.undefined)
      
      inline def setAllow_google_signals(value: Boolean): Self = StObject.set(x, "allow_google_signals", value.asInstanceOf[js.Any])
      
      inline def setAllow_google_signalsUndefined: Self = StObject.set(x, "allow_google_signals", js.undefined)
      
      inline def setCookie_domain(value: String): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
      
      inline def setCookie_domainUndefined: Self = StObject.set(x, "cookie_domain", js.undefined)
      
      inline def setCookie_expires(value: Double): Self = StObject.set(x, "cookie_expires", value.asInstanceOf[js.Any])
      
      inline def setCookie_expiresUndefined: Self = StObject.set(x, "cookie_expires", js.undefined)
      
      inline def setCookie_flags(value: String): Self = StObject.set(x, "cookie_flags", value.asInstanceOf[js.Any])
      
      inline def setCookie_flagsUndefined: Self = StObject.set(x, "cookie_flags", js.undefined)
      
      inline def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      inline def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      inline def setCookie_update(value: Boolean): Self = StObject.set(x, "cookie_update", value.asInstanceOf[js.Any])
      
      inline def setCookie_updateUndefined: Self = StObject.set(x, "cookie_update", js.undefined)
      
      inline def setPage_location(value: String): Self = StObject.set(x, "page_location", value.asInstanceOf[js.Any])
      
      inline def setPage_locationUndefined: Self = StObject.set(x, "page_location", js.undefined)
      
      inline def setPage_title(value: String): Self = StObject.set(x, "page_title", value.asInstanceOf[js.Any])
      
      inline def setPage_titleUndefined: Self = StObject.set(x, "page_title", js.undefined)
      
      inline def setSend_page_view(value: Boolean): Self = StObject.set(x, "send_page_view", value.asInstanceOf[js.Any])
      
      inline def setSend_page_viewUndefined: Self = StObject.set(x, "send_page_view", js.undefined)
    }
  }
  
  trait Item extends StObject {
    
    var affiliation: js.UndefOr[String] = js.undefined
    
    /** @deprecated Use item_brand instead. */
    var brand: js.UndefOr[String] = js.undefined
    
    /** @deprecated Use item_category instead. */
    var category: js.UndefOr[String] = js.undefined
    
    var coupon: js.UndefOr[String] = js.undefined
    
    var creative_name: js.UndefOr[String] = js.undefined
    
    var creative_slot: js.UndefOr[String] = js.undefined
    
    var discount: js.UndefOr[Currency] = js.undefined
    
    /** @deprecated Use item_id instead. */
    var id: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var item_brand: js.UndefOr[String] = js.undefined
    
    var item_category: js.UndefOr[String] = js.undefined
    
    var item_category2: js.UndefOr[String] = js.undefined
    
    var item_category3: js.UndefOr[String] = js.undefined
    
    var item_category4: js.UndefOr[String] = js.undefined
    
    var item_category5: js.UndefOr[String] = js.undefined
    
    var item_id: js.UndefOr[String] = js.undefined
    
    var item_list_id: js.UndefOr[String] = js.undefined
    
    var item_list_name: js.UndefOr[String] = js.undefined
    
    var item_name: js.UndefOr[String] = js.undefined
    
    var item_variant: js.UndefOr[String] = js.undefined
    
    var location_id: js.UndefOr[String] = js.undefined
    
    /** @deprecated Use item_name instead. */
    var name: js.UndefOr[String] = js.undefined
    
    var price: js.UndefOr[Currency] = js.undefined
    
    var promotion_id: js.UndefOr[String] = js.undefined
    
    var promotion_name: js.UndefOr[String] = js.undefined
    
    var quantity: js.UndefOr[Double] = js.undefined
  }
  object Item {
    
    inline def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      inline def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
      
      inline def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
      
      inline def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      inline def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      inline def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      inline def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
      
      inline def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
      
      inline def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
      
      inline def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
      
      inline def setDiscount(value: Currency): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
      
      inline def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setItem_brand(value: String): Self = StObject.set(x, "item_brand", value.asInstanceOf[js.Any])
      
      inline def setItem_brandUndefined: Self = StObject.set(x, "item_brand", js.undefined)
      
      inline def setItem_category(value: String): Self = StObject.set(x, "item_category", value.asInstanceOf[js.Any])
      
      inline def setItem_category2(value: String): Self = StObject.set(x, "item_category2", value.asInstanceOf[js.Any])
      
      inline def setItem_category2Undefined: Self = StObject.set(x, "item_category2", js.undefined)
      
      inline def setItem_category3(value: String): Self = StObject.set(x, "item_category3", value.asInstanceOf[js.Any])
      
      inline def setItem_category3Undefined: Self = StObject.set(x, "item_category3", js.undefined)
      
      inline def setItem_category4(value: String): Self = StObject.set(x, "item_category4", value.asInstanceOf[js.Any])
      
      inline def setItem_category4Undefined: Self = StObject.set(x, "item_category4", js.undefined)
      
      inline def setItem_category5(value: String): Self = StObject.set(x, "item_category5", value.asInstanceOf[js.Any])
      
      inline def setItem_category5Undefined: Self = StObject.set(x, "item_category5", js.undefined)
      
      inline def setItem_categoryUndefined: Self = StObject.set(x, "item_category", js.undefined)
      
      inline def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      inline def setItem_idUndefined: Self = StObject.set(x, "item_id", js.undefined)
      
      inline def setItem_list_id(value: String): Self = StObject.set(x, "item_list_id", value.asInstanceOf[js.Any])
      
      inline def setItem_list_idUndefined: Self = StObject.set(x, "item_list_id", js.undefined)
      
      inline def setItem_list_name(value: String): Self = StObject.set(x, "item_list_name", value.asInstanceOf[js.Any])
      
      inline def setItem_list_nameUndefined: Self = StObject.set(x, "item_list_name", js.undefined)
      
      inline def setItem_name(value: String): Self = StObject.set(x, "item_name", value.asInstanceOf[js.Any])
      
      inline def setItem_nameUndefined: Self = StObject.set(x, "item_name", js.undefined)
      
      inline def setItem_variant(value: String): Self = StObject.set(x, "item_variant", value.asInstanceOf[js.Any])
      
      inline def setItem_variantUndefined: Self = StObject.set(x, "item_variant", js.undefined)
      
      inline def setLocation_id(value: String): Self = StObject.set(x, "location_id", value.asInstanceOf[js.Any])
      
      inline def setLocation_idUndefined: Self = StObject.set(x, "location_id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPrice(value: Currency): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      inline def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
      
      inline def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
      
      inline def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
      
      inline def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
      
      inline def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      inline def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
  
  trait Promotion extends StObject {
    
    var creative_name: js.UndefOr[String] = js.undefined
    
    var creative_slot: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Promotion {
    
    inline def apply(): Promotion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Promotion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Promotion] (val x: Self) extends AnyVal {
      
      inline def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
      
      inline def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
      
      inline def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
      
      inline def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait SettingsOptions extends StObject {
    
    /** Sets custom name for `dataLayer` array used by `gtag.js`. */
    var dataLayerName: js.UndefOr[String] = js.undefined
    
    /** Sets custom name for `gtag` function. */
    var gtagName: js.UndefOr[String] = js.undefined
  }
  object SettingsOptions {
    
    inline def apply(): SettingsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SettingsOptions] (val x: Self) extends AnyVal {
      
      inline def setDataLayerName(value: String): Self = StObject.set(x, "dataLayerName", value.asInstanceOf[js.Any])
      
      inline def setDataLayerNameUndefined: Self = StObject.set(x, "dataLayerName", js.undefined)
      
      inline def setGtagName(value: String): Self = StObject.set(x, "gtagName", value.asInstanceOf[js.Any])
      
      inline def setGtagNameUndefined: Self = StObject.set(x, "gtagName", js.undefined)
    }
  }
}
