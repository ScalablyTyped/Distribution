package typings.firebase.firebaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.Anon_Appid
import typings.firebase.Anon_Checkoutoption
import typings.firebase.Anon_CheckoutoptionCheckoutstep
import typings.firebase.Anon_Contentid
import typings.firebase.Anon_ContentidContenttype
import typings.firebase.Anon_Coupon
import typings.firebase.Anon_CouponCurrency
import typings.firebase.Anon_Currency
import typings.firebase.Anon_CurrencyItems
import typings.firebase.Anon_CurrencyKey
import typings.firebase.Anon_Description
import typings.firebase.Anon_Eventcategory
import typings.firebase.Anon_Items
import typings.firebase.Anon_Key
import typings.firebase.Anon_KeyPromotions
import typings.firebase.Anon_KeySearchterm
import typings.firebase.firebaseMod.analyticsNs.AnalyticsCallOptions
import typings.firebase.firebaseMod.analyticsNs.Currency
import typings.firebase.firebaseMod.analyticsNs.CustomEventName
import typings.firebase.firebaseMod.analyticsNs.CustomParams
import typings.firebase.firebaseMod.analyticsNs.EventName
import typings.firebase.firebaseMod.analyticsNs.Item
import typings.firebase.firebaseMod.analyticsNs.Promotion
import typings.firebase.firebaseMod.analyticsNs.SettingsOptions
import typings.firebase.firebaseMod.appNs.App
import typings.firebase.firebaseStrings.add_to_cart
import typings.firebase.firebaseStrings.add_to_wishlist
import typings.firebase.firebaseStrings.begin_checkout
import typings.firebase.firebaseStrings.checkout_progress
import typings.firebase.firebaseStrings.exception
import typings.firebase.firebaseStrings.generate_lead
import typings.firebase.firebaseStrings.login
import typings.firebase.firebaseStrings.purchase
import typings.firebase.firebaseStrings.refund
import typings.firebase.firebaseStrings.remove_from_cart
import typings.firebase.firebaseStrings.screen_view
import typings.firebase.firebaseStrings.search
import typings.firebase.firebaseStrings.select_content
import typings.firebase.firebaseStrings.set_checkout_option
import typings.firebase.firebaseStrings.share
import typings.firebase.firebaseStrings.sign_up
import typings.firebase.firebaseStrings.timing_complete
import typings.firebase.firebaseStrings.view_item
import typings.firebase.firebaseStrings.view_item_list
import typings.firebase.firebaseStrings.view_promotion
import typings.firebase.firebaseStrings.view_search_results
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @webonly
  */
@JSImport("firebase", "analytics")
@js.native
object analyticsNs extends js.Object {
  @js.native
  trait Analytics extends js.Object {
    /**
      * The {@link firebase.app.App app} associated with the `Analytics` service
      * instance.
      *
      * @example
      * ```javascript
      * var app = analytics.app;
      * ```
      */
    var app: App = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    def logEvent[T /* <: String */](eventName: CustomEventName[T]): Unit = js.native
    def logEvent[T /* <: String */](eventName: CustomEventName[T], eventParams: StringDictionary[js.Any]): Unit = js.native
    def logEvent[T /* <: String */](
      eventName: CustomEventName[T],
      eventParams: StringDictionary[js.Any],
      options: AnalyticsCallOptions
    ): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_addtocart(eventName: add_to_cart, eventParams: Anon_Currency): Unit = js.native
    @JSName("logEvent")
    def logEvent_addtocart(eventName: add_to_cart, eventParams: Anon_Currency, options: AnalyticsCallOptions): Unit = js.native
    @JSName("logEvent")
    def logEvent_addtowishlist(eventName: add_to_wishlist, eventParams: Anon_Currency): Unit = js.native
    @JSName("logEvent")
    def logEvent_addtowishlist(eventName: add_to_wishlist, eventParams: Anon_Currency, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_begincheckout(eventName: begin_checkout, eventParams: Anon_Coupon): Unit = js.native
    @JSName("logEvent")
    def logEvent_begincheckout(eventName: begin_checkout, eventParams: Anon_Coupon, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: Anon_Checkoutoption): Unit = js.native
    @JSName("logEvent")
    def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: Anon_Checkoutoption, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_exception(eventName: exception, eventParams: Anon_Description): Unit = js.native
    @JSName("logEvent")
    def logEvent_exception(eventName: exception, eventParams: Anon_Description, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_generatelead(eventName: generate_lead, eventParams: Anon_CurrencyKey): Unit = js.native
    @JSName("logEvent")
    def logEvent_generatelead(eventName: generate_lead, eventParams: Anon_CurrencyKey, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_login(eventName: login, eventParams: Anon_Key): Unit = js.native
    @JSName("logEvent")
    def logEvent_login(eventName: login, eventParams: Anon_Key, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_purchase(eventName: purchase, eventParams: Anon_CouponCurrency): Unit = js.native
    @JSName("logEvent")
    def logEvent_purchase(eventName: purchase, eventParams: Anon_CouponCurrency, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_refund(eventName: refund, eventParams: Anon_CurrencyItems): Unit = js.native
    @JSName("logEvent")
    def logEvent_refund(eventName: refund, eventParams: Anon_CurrencyItems, options: AnalyticsCallOptions): Unit = js.native
    @JSName("logEvent")
    def logEvent_removefromcart(eventName: remove_from_cart, eventParams: Anon_Currency): Unit = js.native
    @JSName("logEvent")
    def logEvent_removefromcart(eventName: remove_from_cart, eventParams: Anon_Currency, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_screenview(eventName: screen_view, eventParams: Anon_Appid): Unit = js.native
    @JSName("logEvent")
    def logEvent_screenview(eventName: screen_view, eventParams: Anon_Appid, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_search(eventName: search, eventParams: Anon_KeySearchterm): Unit = js.native
    @JSName("logEvent")
    def logEvent_search(eventName: search, eventParams: Anon_KeySearchterm, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_selectcontent(eventName: select_content, eventParams: Anon_Contentid): Unit = js.native
    @JSName("logEvent")
    def logEvent_selectcontent(eventName: select_content, eventParams: Anon_Contentid, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: Anon_CheckoutoptionCheckoutstep): Unit = js.native
    @JSName("logEvent")
    def logEvent_setcheckoutoption(
      eventName: set_checkout_option,
      eventParams: Anon_CheckoutoptionCheckoutstep,
      options: AnalyticsCallOptions
    ): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_share(eventName: share, eventParams: Anon_ContentidContenttype): Unit = js.native
    @JSName("logEvent")
    def logEvent_share(eventName: share, eventParams: Anon_ContentidContenttype, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_signup(eventName: sign_up, eventParams: Anon_Key): Unit = js.native
    @JSName("logEvent")
    def logEvent_signup(eventName: sign_up, eventParams: Anon_Key, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_timingcomplete(eventName: timing_complete, eventParams: Anon_Eventcategory): Unit = js.native
    @JSName("logEvent")
    def logEvent_timingcomplete(eventName: timing_complete, eventParams: Anon_Eventcategory, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_viewitem(eventName: view_item, eventParams: Anon_Items): Unit = js.native
    @JSName("logEvent")
    def logEvent_viewitem(eventName: view_item, eventParams: Anon_Items, options: AnalyticsCallOptions): Unit = js.native
    @JSName("logEvent")
    def logEvent_viewitemlist(eventName: view_item_list, eventParams: Anon_Items): Unit = js.native
    @JSName("logEvent")
    def logEvent_viewitemlist(eventName: view_item_list, eventParams: Anon_Items, options: AnalyticsCallOptions): Unit = js.native
    /**
      * Sends analytics event with given `eventParams`. This method
      * automatically associates this logged event with this Firebase web
      * app instance on this device.
      * List of official event parameters can be found in
      * {@link https://developers.google.com/gtagjs/reference/event
      * the gtag.js reference documentation}.
      */
    @JSName("logEvent")
    def logEvent_viewpromotion(eventName: view_promotion, eventParams: Anon_KeyPromotions): Unit = js.native
    @JSName("logEvent")
    def logEvent_viewpromotion(eventName: view_promotion, eventParams: Anon_KeyPromotions, options: AnalyticsCallOptions): Unit = js.native
    @JSName("logEvent")
    def logEvent_viewsearchresults(eventName: view_search_results, eventParams: Anon_KeySearchterm): Unit = js.native
    @JSName("logEvent")
    def logEvent_viewsearchresults(eventName: view_search_results, eventParams: Anon_KeySearchterm, options: AnalyticsCallOptions): Unit = js.native
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
    def setUserProperties(properties: CustomParams): Unit = js.native
    def setUserProperties(properties: CustomParams, options: AnalyticsCallOptions): Unit = js.native
  }
  
  trait AnalyticsCallOptions extends js.Object {
    /**
      * If true, this config or event call applies globally to all
      * analytics properties on the page.
      */
    var global: Boolean
  }
  
  trait ControlParams extends js.Object {
    var event_callback: js.UndefOr[js.Function0[Unit]] = js.undefined
    var event_timeout: js.UndefOr[Double] = js.undefined
    var groups: js.UndefOr[String | js.Array[String]] = js.undefined
    var send_to: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  
  @js.native
  sealed trait EventName extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebase.firebaseStrings.add_payment_info
    - typings.firebase.firebaseStrings.add_to_cart
    - typings.firebase.firebaseStrings.add_to_wishlist
    - typings.firebase.firebaseStrings.begin_checkout
    - typings.firebase.firebaseStrings.checkout_progress
    - typings.firebase.firebaseStrings.exception
    - typings.firebase.firebaseStrings.generate_lead
    - typings.firebase.firebaseStrings.login
    - typings.firebase.firebaseStrings.page_view
    - typings.firebase.firebaseStrings.purchase
    - typings.firebase.firebaseStrings.refund
    - typings.firebase.firebaseStrings.remove_from_cart
    - typings.firebase.firebaseStrings.screen_view
    - typings.firebase.firebaseStrings.search
    - typings.firebase.firebaseStrings.select_content
    - typings.firebase.firebaseStrings.set_checkout_option
    - typings.firebase.firebaseStrings.share
    - typings.firebase.firebaseStrings.sign_up
    - typings.firebase.firebaseStrings.timing_complete
    - typings.firebase.firebaseStrings.view_item
    - typings.firebase.firebaseStrings.view_item_list
    - typings.firebase.firebaseStrings.view_promotion
    - typings.firebase.firebaseStrings.view_search_results
  */
  trait EventNameString extends js.Object
  
  trait EventParams extends js.Object {
    var checkout_option: js.UndefOr[String] = js.undefined
    var checkout_step: js.UndefOr[Double] = js.undefined
    var content_id: js.UndefOr[String] = js.undefined
    var content_type: js.UndefOr[String] = js.undefined
    var coupon: js.UndefOr[String] = js.undefined
    var currency: js.UndefOr[String] = js.undefined
    var description: js.UndefOr[String] = js.undefined
    var event_category: String
    var event_label: js.UndefOr[String] = js.undefined
    var fatal: js.UndefOr[Boolean] = js.undefined
    var items: js.UndefOr[js.Array[Item]] = js.undefined
    var method: js.UndefOr[String] = js.undefined
    var number: js.UndefOr[String] = js.undefined
    var promotions: js.UndefOr[js.Array[Promotion]] = js.undefined
    var screen_name: js.UndefOr[String] = js.undefined
    var search_term: js.UndefOr[String] = js.undefined
    var shipping: js.UndefOr[Currency] = js.undefined
    var tax: js.UndefOr[Currency] = js.undefined
    var transaction_id: js.UndefOr[String] = js.undefined
    var value: js.UndefOr[Double] = js.undefined
  }
  
  trait Item extends js.Object {
    var brand: js.UndefOr[String] = js.undefined
    var category: js.UndefOr[String] = js.undefined
    var creative_name: js.UndefOr[String] = js.undefined
    var creative_slot: js.UndefOr[String] = js.undefined
    var id: js.UndefOr[String] = js.undefined
    var location_id: js.UndefOr[String] = js.undefined
    var name: js.UndefOr[String] = js.undefined
    var price: js.UndefOr[Currency] = js.undefined
    var quantity: js.UndefOr[Double] = js.undefined
  }
  
  trait Promotion extends js.Object {
    var creative_name: js.UndefOr[String] = js.undefined
    var creative_slot: js.UndefOr[String] = js.undefined
    var id: js.UndefOr[String] = js.undefined
    var name: js.UndefOr[String] = js.undefined
  }
  
  trait SettingsOptions extends js.Object {
    /** Sets custom name for `dataLayer` array used by gtag. */
    var dataLayerName: js.UndefOr[String] = js.undefined
    /** Sets custom name for `gtag` function. */
    var gtagName: js.UndefOr[String] = js.undefined
  }
  
  def settings(settings: SettingsOptions): Unit = js.native
  @js.native
  object EventName extends js.Object {
    @js.native
    sealed trait ADD_PAYMENT_INFO extends EventName
    
    @js.native
    sealed trait ADD_TO_CART extends EventName
    
    @js.native
    sealed trait ADD_TO_WISHLIST extends EventName
    
    @js.native
    sealed trait BEGIN_CHECKOUT extends EventName
    
    @js.native
    sealed trait CHECKOUT_PROGRESS extends EventName
    
    @js.native
    sealed trait EXCEPTION extends EventName
    
    @js.native
    sealed trait GENERATE_LEAD extends EventName
    
    @js.native
    sealed trait LOGIN extends EventName
    
    @js.native
    sealed trait PAGE_VIEW extends EventName
    
    @js.native
    sealed trait PURCHASE extends EventName
    
    @js.native
    sealed trait REFUND extends EventName
    
    @js.native
    sealed trait REMOVE_FROM_CART extends EventName
    
    @js.native
    sealed trait SCREEN_VIEW extends EventName
    
    @js.native
    sealed trait SEARCH extends EventName
    
    @js.native
    sealed trait SELECT_CONTENT extends EventName
    
    @js.native
    sealed trait SET_CHECKOUT_OPTION extends EventName
    
    @js.native
    sealed trait SHARE extends EventName
    
    @js.native
    sealed trait SIGN_UP extends EventName
    
    @js.native
    sealed trait TIMING_COMPLETE extends EventName
    
    @js.native
    sealed trait VIEW_ITEM extends EventName
    
    @js.native
    sealed trait VIEW_ITEM_LIST extends EventName
    
    @js.native
    sealed trait VIEW_PROMOTION extends EventName
    
    @js.native
    sealed trait VIEW_SEARCH_RESULTS extends EventName
    
    /* "add_payment_info" */ val ADD_PAYMENT_INFO: typings.firebase.firebaseMod.analyticsNs.EventName.ADD_PAYMENT_INFO with String = js.native
    /* "add_to_cart" */ val ADD_TO_CART: typings.firebase.firebaseMod.analyticsNs.EventName.ADD_TO_CART with String = js.native
    /* "add_to_wishlist" */ val ADD_TO_WISHLIST: typings.firebase.firebaseMod.analyticsNs.EventName.ADD_TO_WISHLIST with String = js.native
    /* "begin_checkout" */ val BEGIN_CHECKOUT: typings.firebase.firebaseMod.analyticsNs.EventName.BEGIN_CHECKOUT with String = js.native
    /* "checkout_progress" */ val CHECKOUT_PROGRESS: typings.firebase.firebaseMod.analyticsNs.EventName.CHECKOUT_PROGRESS with String = js.native
    /* "exception" */ val EXCEPTION: typings.firebase.firebaseMod.analyticsNs.EventName.EXCEPTION with String = js.native
    /* "generate_lead" */ val GENERATE_LEAD: typings.firebase.firebaseMod.analyticsNs.EventName.GENERATE_LEAD with String = js.native
    /* "login" */ val LOGIN: typings.firebase.firebaseMod.analyticsNs.EventName.LOGIN with String = js.native
    /* "page_view" */ val PAGE_VIEW: typings.firebase.firebaseMod.analyticsNs.EventName.PAGE_VIEW with String = js.native
    /* "purchase" */ val PURCHASE: typings.firebase.firebaseMod.analyticsNs.EventName.PURCHASE with String = js.native
    /* "refund" */ val REFUND: typings.firebase.firebaseMod.analyticsNs.EventName.REFUND with String = js.native
    /* "remove_from_cart" */ val REMOVE_FROM_CART: typings.firebase.firebaseMod.analyticsNs.EventName.REMOVE_FROM_CART with String = js.native
    /* "screen_view" */ val SCREEN_VIEW: typings.firebase.firebaseMod.analyticsNs.EventName.SCREEN_VIEW with String = js.native
    /* "search" */ val SEARCH: typings.firebase.firebaseMod.analyticsNs.EventName.SEARCH with String = js.native
    /* "select_content" */ val SELECT_CONTENT: typings.firebase.firebaseMod.analyticsNs.EventName.SELECT_CONTENT with String = js.native
    /* "set_checkout_option" */ val SET_CHECKOUT_OPTION: typings.firebase.firebaseMod.analyticsNs.EventName.SET_CHECKOUT_OPTION with String = js.native
    /* "share" */ val SHARE: typings.firebase.firebaseMod.analyticsNs.EventName.SHARE with String = js.native
    /* "sign_up" */ val SIGN_UP: typings.firebase.firebaseMod.analyticsNs.EventName.SIGN_UP with String = js.native
    /* "timing_complete" */ val TIMING_COMPLETE: typings.firebase.firebaseMod.analyticsNs.EventName.TIMING_COMPLETE with String = js.native
    /* "view_item" */ val VIEW_ITEM: typings.firebase.firebaseMod.analyticsNs.EventName.VIEW_ITEM with String = js.native
    /* "view_item_list" */ val VIEW_ITEM_LIST: typings.firebase.firebaseMod.analyticsNs.EventName.VIEW_ITEM_LIST with String = js.native
    /* "view_promotion" */ val VIEW_PROMOTION: typings.firebase.firebaseMod.analyticsNs.EventName.VIEW_PROMOTION with String = js.native
    /* "view_search_results" */ val VIEW_SEARCH_RESULTS: typings.firebase.firebaseMod.analyticsNs.EventName.VIEW_SEARCH_RESULTS with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventName with String] = js.native
  }
  
  type Currency = String | Double
  type CustomEventName[T] = T
  type CustomParams = StringDictionary[js.Any]
}

