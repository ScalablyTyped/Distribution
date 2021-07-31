package typings.firebaseAnalyticsTypes

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config
import typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event
import typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set
import typings.firebaseAppTypes.mod.FirebaseApp
import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait AnalyticsCallOptions extends StObject {
    
    /**
      * If true, this config or event call applies globally to all
      * analytics properties on the page.
      */
    var global: Boolean
  }
  object AnalyticsCallOptions {
    
    @scala.inline
    def apply(global: Boolean): AnalyticsCallOptions = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsCallOptions]
    }
    
    @scala.inline
    implicit class AnalyticsCallOptionsMutableBuilder[Self <: AnalyticsCallOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControlParams extends StObject {
    
    var event_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var event_timeout: js.UndefOr[Double] = js.undefined
    
    var groups: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var send_to: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ControlParams {
    
    @scala.inline
    def apply(): ControlParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlParams]
    }
    
    @scala.inline
    implicit class ControlParamsMutableBuilder[Self <: ControlParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent_callback(value: () => Unit): Self = StObject.set(x, "event_callback", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEvent_callbackUndefined: Self = StObject.set(x, "event_callback", js.undefined)
      
      @scala.inline
      def setEvent_timeout(value: Double): Self = StObject.set(x, "event_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent_timeoutUndefined: Self = StObject.set(x, "event_timeout", js.undefined)
      
      @scala.inline
      def setGroups(value: String | js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      @scala.inline
      def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      @scala.inline
      def setSend_to(value: String | js.Array[String]): Self = StObject.set(x, "send_to", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend_toUndefined: Self = StObject.set(x, "send_to", js.undefined)
      
      @scala.inline
      def setSend_toVarargs(value: String*): Self = StObject.set(x, "send_to", js.Array(value :_*))
    }
  }
  
  type Currency = String | Double
  
  type CustomParams = StringDictionary[js.Any]
  
  type DataLayer = js.Array[IArguments]
  
  /**
    * Dynamic configuration fetched from server.
    * See https://firebase.google.com/docs/projects/api/reference/rest/v1beta1/projects.webApps/getConfig
    */
  trait DynamicConfig extends StObject {
    
    var apiKey: String
    
    var appId: String
    
    var authDomain: String
    
    var databaseURL: String
    
    var locationId: String
    
    var measurementId: String
    
    var messagingSenderId: String
    
    var projectId: String
    
    var storageBucket: String
  }
  object DynamicConfig {
    
    @scala.inline
    def apply(
      apiKey: String,
      appId: String,
      authDomain: String,
      databaseURL: String,
      locationId: String,
      measurementId: String,
      messagingSenderId: String,
      projectId: String,
      storageBucket: String
    ): DynamicConfig = {
      val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], authDomain = authDomain.asInstanceOf[js.Any], databaseURL = databaseURL.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any], measurementId = measurementId.asInstanceOf[js.Any], messagingSenderId = messagingSenderId.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], storageBucket = storageBucket.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamicConfig]
    }
    
    @scala.inline
    implicit class DynamicConfigMutableBuilder[Self <: DynamicConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthDomain(value: String): Self = StObject.set(x, "authDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessagingSenderId(value: String): Self = StObject.set(x, "messagingSenderId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_payment_info
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_shipping_info
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_to_cart
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_to_wishlist
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.begin_checkout
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.checkout_progress
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.exception
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.generate_lead
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.login
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.page_view
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.purchase
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.refund
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.remove_from_cart
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.screen_view
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.search
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_content
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_item
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_promotion
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set_checkout_option
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.share
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.sign_up
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.timing_complete
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_cart
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_item
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_item_list
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_promotion
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_search_results
  */
  trait EventNameString extends StObject
  object EventNameString {
    
    @scala.inline
    def add_payment_info: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_payment_info = "add_payment_info".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_payment_info]
    
    @scala.inline
    def add_shipping_info: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_shipping_info = "add_shipping_info".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_shipping_info]
    
    @scala.inline
    def add_to_cart: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_to_cart = "add_to_cart".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_to_cart]
    
    @scala.inline
    def add_to_wishlist: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_to_wishlist = "add_to_wishlist".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.add_to_wishlist]
    
    @scala.inline
    def begin_checkout: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.begin_checkout = "begin_checkout".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.begin_checkout]
    
    @scala.inline
    def checkout_progress: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.checkout_progress = "checkout_progress".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.checkout_progress]
    
    @scala.inline
    def exception: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.exception = "exception".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.exception]
    
    @scala.inline
    def generate_lead: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.generate_lead = "generate_lead".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.generate_lead]
    
    @scala.inline
    def login: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.login = "login".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.login]
    
    @scala.inline
    def page_view: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.page_view = "page_view".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.page_view]
    
    @scala.inline
    def purchase: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.purchase = "purchase".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.purchase]
    
    @scala.inline
    def refund: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.refund = "refund".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.refund]
    
    @scala.inline
    def remove_from_cart: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.remove_from_cart = "remove_from_cart".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.remove_from_cart]
    
    @scala.inline
    def screen_view: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.screen_view = "screen_view".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.screen_view]
    
    @scala.inline
    def search: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.search = "search".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.search]
    
    @scala.inline
    def select_content: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_content = "select_content".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_content]
    
    @scala.inline
    def select_item: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_item = "select_item".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_item]
    
    @scala.inline
    def select_promotion: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_promotion = "select_promotion".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.select_promotion]
    
    @scala.inline
    def set_checkout_option: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set_checkout_option = "set_checkout_option".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set_checkout_option]
    
    @scala.inline
    def share: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.share = "share".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.share]
    
    @scala.inline
    def sign_up: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.sign_up = "sign_up".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.sign_up]
    
    @scala.inline
    def timing_complete: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.timing_complete = "timing_complete".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.timing_complete]
    
    @scala.inline
    def view_cart: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_cart = "view_cart".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_cart]
    
    @scala.inline
    def view_item: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_item = "view_item".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_item]
    
    @scala.inline
    def view_item_list: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_item_list = "view_item_list".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_item_list]
    
    @scala.inline
    def view_promotion: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_promotion = "view_promotion".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_promotion]
    
    @scala.inline
    def view_search_results: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_search_results = "view_search_results".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.view_search_results]
  }
  
  trait EventParams extends StObject {
    
    var affiliation: js.UndefOr[String] = js.undefined
    
    var checkout_option: js.UndefOr[String] = js.undefined
    
    var checkout_step: js.UndefOr[Double] = js.undefined
    
    var content_id: js.UndefOr[String] = js.undefined
    
    var content_type: js.UndefOr[String] = js.undefined
    
    var coupon: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var description: js.UndefOr[String] = js.undefined
    
    var event_category: js.UndefOr[String] = js.undefined
    
    var event_label: js.UndefOr[String] = js.undefined
    
    var fatal: js.UndefOr[Boolean] = js.undefined
    
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
    
    @scala.inline
    def apply(): EventParams = {
      val __obj = js.Dynamic.literal()
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
      def setEvent_categoryUndefined: Self = StObject.set(x, "event_category", js.undefined)
      
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
  
  @js.native
  trait FirebaseAnalytics extends StObject {
    
    var app: FirebaseApp = js.native
    
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    def logEvent(eventName: EventNameString): Unit = js.native
    def logEvent(eventName: EventNameString, eventParams: Unit, options: AnalyticsCallOptions): Unit = js.native
    def logEvent(eventName: EventNameString, eventParams: EventParams): Unit = js.native
    def logEvent(eventName: EventNameString, eventParams: EventParams, options: AnalyticsCallOptions): Unit = js.native
    
    /**
      * Sets whether analytics collection is enabled for this app on this device.
      * window['ga-disable-analyticsId'] = true;
      */
    def setAnalyticsCollectionEnabled(enabled: Boolean): Unit = js.native
    
    /**
      * Use gtag 'config' command to set 'screen_name'.
      */
    def setCurrentScreen(screenName: String): Unit = js.native
    def setCurrentScreen(screenName: String, options: AnalyticsCallOptions): Unit = js.native
    
    /**
      * Use gtag 'config' command to set 'user_id'.
      */
    def setUserId(id: String): Unit = js.native
    def setUserId(id: String, options: AnalyticsCallOptions): Unit = js.native
    
    /**
      * Use gtag 'config' command to set all params specified.
      */
    def setUserProperties(properties: StringDictionary[js.Any]): Unit = js.native
    def setUserProperties(properties: StringDictionary[js.Any], options: AnalyticsCallOptions): Unit = js.native
  }
  
  @js.native
  trait Gtag extends StObject {
    
    def apply(command: config, targetId: String): Unit = js.native
    def apply(command: config, targetId: String, config: ControlParams): Unit = js.native
    def apply(command: config, targetId: String, config: CustomParams): Unit = js.native
    def apply(command: config, targetId: String, config: EventParams): Unit = js.native
    def apply(command: event, eventName: String): Unit = js.native
    def apply(command: event, eventName: String, eventParams: ControlParams): Unit = js.native
    def apply(command: event, eventName: String, eventParams: CustomParams): Unit = js.native
    def apply(command: event, eventName: String, eventParams: EventParams): Unit = js.native
    def apply(command: set, config: CustomParams): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set
    - typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config
  */
  trait GtagCommand extends StObject
  object GtagCommand {
    
    @scala.inline
    def config: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config = "config".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.config]
    
    @scala.inline
    def event: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event = "event".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.event]
    
    @scala.inline
    def set: typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set = "set".asInstanceOf[typings.firebaseAnalyticsTypes.firebaseAnalyticsTypesStrings.set]
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
    
    @scala.inline
    def apply(): Item = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Item]
    }
    
    @scala.inline
    implicit class ItemMutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffiliation(value: String): Self = StObject.set(x, "affiliation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffiliationUndefined: Self = StObject.set(x, "affiliation", js.undefined)
      
      @scala.inline
      def setBrand(value: String): Self = StObject.set(x, "brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrandUndefined: Self = StObject.set(x, "brand", js.undefined)
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setCoupon(value: String): Self = StObject.set(x, "coupon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCouponUndefined: Self = StObject.set(x, "coupon", js.undefined)
      
      @scala.inline
      def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
      
      @scala.inline
      def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
      
      @scala.inline
      def setDiscount(value: Currency): Self = StObject.set(x, "discount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscountUndefined: Self = StObject.set(x, "discount", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setItem_brand(value: String): Self = StObject.set(x, "item_brand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_brandUndefined: Self = StObject.set(x, "item_brand", js.undefined)
      
      @scala.inline
      def setItem_category(value: String): Self = StObject.set(x, "item_category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_category2(value: String): Self = StObject.set(x, "item_category2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_category2Undefined: Self = StObject.set(x, "item_category2", js.undefined)
      
      @scala.inline
      def setItem_category3(value: String): Self = StObject.set(x, "item_category3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_category3Undefined: Self = StObject.set(x, "item_category3", js.undefined)
      
      @scala.inline
      def setItem_category4(value: String): Self = StObject.set(x, "item_category4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_category4Undefined: Self = StObject.set(x, "item_category4", js.undefined)
      
      @scala.inline
      def setItem_category5(value: String): Self = StObject.set(x, "item_category5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_category5Undefined: Self = StObject.set(x, "item_category5", js.undefined)
      
      @scala.inline
      def setItem_categoryUndefined: Self = StObject.set(x, "item_category", js.undefined)
      
      @scala.inline
      def setItem_id(value: String): Self = StObject.set(x, "item_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_idUndefined: Self = StObject.set(x, "item_id", js.undefined)
      
      @scala.inline
      def setItem_list_id(value: String): Self = StObject.set(x, "item_list_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_list_idUndefined: Self = StObject.set(x, "item_list_id", js.undefined)
      
      @scala.inline
      def setItem_list_name(value: String): Self = StObject.set(x, "item_list_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_list_nameUndefined: Self = StObject.set(x, "item_list_name", js.undefined)
      
      @scala.inline
      def setItem_name(value: String): Self = StObject.set(x, "item_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_nameUndefined: Self = StObject.set(x, "item_name", js.undefined)
      
      @scala.inline
      def setItem_variant(value: String): Self = StObject.set(x, "item_variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem_variantUndefined: Self = StObject.set(x, "item_variant", js.undefined)
      
      @scala.inline
      def setLocation_id(value: String): Self = StObject.set(x, "location_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation_idUndefined: Self = StObject.set(x, "location_id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPrice(value: Currency): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
      
      @scala.inline
      def setPromotion_id(value: String): Self = StObject.set(x, "promotion_id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotion_idUndefined: Self = StObject.set(x, "promotion_id", js.undefined)
      
      @scala.inline
      def setPromotion_name(value: String): Self = StObject.set(x, "promotion_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromotion_nameUndefined: Self = StObject.set(x, "promotion_name", js.undefined)
      
      @scala.inline
      def setQuantity(value: Double): Self = StObject.set(x, "quantity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuantityUndefined: Self = StObject.set(x, "quantity", js.undefined)
    }
  }
  
  trait MinimalDynamicConfig extends StObject {
    
    var appId: String
    
    var measurementId: String
  }
  object MinimalDynamicConfig {
    
    @scala.inline
    def apply(appId: String, measurementId: String): MinimalDynamicConfig = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], measurementId = measurementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinimalDynamicConfig]
    }
    
    @scala.inline
    implicit class MinimalDynamicConfigMutableBuilder[Self <: MinimalDynamicConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeasurementId(value: String): Self = StObject.set(x, "measurementId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Promotion extends StObject {
    
    var creative_name: js.UndefOr[String] = js.undefined
    
    var creative_slot: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Promotion {
    
    @scala.inline
    def apply(): Promotion = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Promotion]
    }
    
    @scala.inline
    implicit class PromotionMutableBuilder[Self <: Promotion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreative_name(value: String): Self = StObject.set(x, "creative_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_nameUndefined: Self = StObject.set(x, "creative_name", js.undefined)
      
      @scala.inline
      def setCreative_slot(value: String): Self = StObject.set(x, "creative_slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCreative_slotUndefined: Self = StObject.set(x, "creative_slot", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait SettingsOptions extends StObject {
    
    /** Sets custom name for `dataLayer` array used by gtag. */
    var dataLayerName: js.UndefOr[String] = js.undefined
    
    /** Sets custom name for `gtag` function. */
    var gtagName: js.UndefOr[String] = js.undefined
  }
  object SettingsOptions {
    
    @scala.inline
    def apply(): SettingsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SettingsOptions]
    }
    
    @scala.inline
    implicit class SettingsOptionsMutableBuilder[Self <: SettingsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataLayerName(value: String): Self = StObject.set(x, "dataLayerName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataLayerNameUndefined: Self = StObject.set(x, "dataLayerName", js.undefined)
      
      @scala.inline
      def setGtagName(value: String): Self = StObject.set(x, "gtagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGtagNameUndefined: Self = StObject.set(x, "gtagName", js.undefined)
    }
  }
  
  trait ThrottleMetadata extends StObject {
    
    // The number of times fetch has backed off. Used for resuming backoff after a timeout.
    var backoffCount: Double
    
    // The Unix timestamp in milliseconds when callers can retry a request.
    var throttleEndTimeMillis: Double
  }
  object ThrottleMetadata {
    
    @scala.inline
    def apply(backoffCount: Double, throttleEndTimeMillis: Double): ThrottleMetadata = {
      val __obj = js.Dynamic.literal(backoffCount = backoffCount.asInstanceOf[js.Any], throttleEndTimeMillis = throttleEndTimeMillis.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThrottleMetadata]
    }
    
    @scala.inline
    implicit class ThrottleMetadataMutableBuilder[Self <: ThrottleMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackoffCount(value: Double): Self = StObject.set(x, "backoffCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleEndTimeMillis(value: Double): Self = StObject.set(x, "throttleEndTimeMillis", value.asInstanceOf[js.Any])
    }
  }
  
  object firebaseComponentAugmentingMod {
    
    trait NameServiceMapping extends StObject {
      
      var analytics: FirebaseAnalytics
    }
    object NameServiceMapping {
      
      @scala.inline
      def apply(analytics: FirebaseAnalytics): NameServiceMapping = {
        val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any])
        __obj.asInstanceOf[NameServiceMapping]
      }
      
      @scala.inline
      implicit class NameServiceMappingMutableBuilder[Self <: NameServiceMapping] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAnalytics(value: FirebaseAnalytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      }
    }
  }
}
