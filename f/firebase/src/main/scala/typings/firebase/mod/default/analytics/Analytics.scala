package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.anon.Affiliation
import typings.firebase.anon.Appid
import typings.firebase.anon.Checkoutoption
import typings.firebase.anon.Checkoutstep
import typings.firebase.anon.Contentid
import typings.firebase.anon.Contenttype
import typings.firebase.anon.Coupon
import typings.firebase.anon.Description
import typings.firebase.anon.Dictkey
import typings.firebase.anon.Eventcategory
import typings.firebase.anon.Itemlistid
import typings.firebase.anon.Items
import typings.firebase.anon.Method
import typings.firebase.anon.Pagelocation
import typings.firebase.anon.Promotionid
import typings.firebase.anon.Searchterm
import typings.firebase.anon.Transactionid
import typings.firebase.anon.Value
import typings.firebase.firebaseStrings.add_payment_info
import typings.firebase.firebaseStrings.add_shipping_info
import typings.firebase.firebaseStrings.add_to_cart
import typings.firebase.firebaseStrings.add_to_wishlist
import typings.firebase.firebaseStrings.begin_checkout
import typings.firebase.firebaseStrings.checkout_progress
import typings.firebase.firebaseStrings.exception
import typings.firebase.firebaseStrings.generate_lead
import typings.firebase.firebaseStrings.login
import typings.firebase.firebaseStrings.page_view
import typings.firebase.firebaseStrings.purchase
import typings.firebase.firebaseStrings.refund
import typings.firebase.firebaseStrings.remove_from_cart
import typings.firebase.firebaseStrings.screen_view
import typings.firebase.firebaseStrings.search
import typings.firebase.firebaseStrings.select_content
import typings.firebase.firebaseStrings.select_item
import typings.firebase.firebaseStrings.select_promotion
import typings.firebase.firebaseStrings.set_checkout_option
import typings.firebase.firebaseStrings.share
import typings.firebase.firebaseStrings.sign_up
import typings.firebase.firebaseStrings.timing_complete
import typings.firebase.firebaseStrings.view_cart
import typings.firebase.firebaseStrings.view_item
import typings.firebase.firebaseStrings.view_item_list
import typings.firebase.firebaseStrings.view_promotion
import typings.firebase.firebaseStrings.view_search_results
import typings.firebase.mod.firebase.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Analytics extends StObject {
  
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
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  def logEvent[T /* <: String */](eventName: typings.firebase.mod.firebase.analytics.CustomEventName[T]): Unit = js.native
  def logEvent[T /* <: String */](
    eventName: typings.firebase.mod.firebase.analytics.CustomEventName[T],
    eventParams: js.UndefOr[scala.Nothing],
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  def logEvent[T /* <: String */](
    eventName: typings.firebase.mod.firebase.analytics.CustomEventName[T],
    eventParams: StringDictionary[js.Any]
  ): Unit = js.native
  def logEvent[T /* <: String */](
    eventName: typings.firebase.mod.firebase.analytics.CustomEventName[T],
    eventParams: StringDictionary[js.Any],
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(
    eventName: add_payment_info,
    eventParams: js.UndefOr[scala.Nothing],
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: Dictkey): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(
    eventName: add_payment_info,
    eventParams: Dictkey,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info, eventParams: Coupon): Unit = js.native
  @JSName("logEvent")
  def logEvent_addshippinginfo(
    eventName: add_shipping_info,
    eventParams: Coupon,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addtocart(eventName: add_to_cart, eventParams: typings.firebase.anon.Currency): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtocart(
    eventName: add_to_cart,
    eventParams: typings.firebase.anon.Currency,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtowishlist(eventName: add_to_wishlist, eventParams: typings.firebase.anon.Currency): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtowishlist(
    eventName: add_to_wishlist,
    eventParams: typings.firebase.anon.Currency,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout, eventParams: Items): Unit = js.native
  @JSName("logEvent")
  def logEvent_begincheckout(
    eventName: begin_checkout,
    eventParams: Items,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: Checkoutoption): Unit = js.native
  @JSName("logEvent")
  def logEvent_checkoutprogress(
    eventName: checkout_progress,
    eventParams: Checkoutoption,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_exception(eventName: exception, eventParams: Description): Unit = js.native
  @JSName("logEvent")
  def logEvent_exception(
    eventName: exception,
    eventParams: Description,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead, eventParams: Transactionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_generatelead(
    eventName: generate_lead,
    eventParams: Transactionid,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_login(eventName: login, eventParams: Method): Unit = js.native
  @JSName("logEvent")
  def logEvent_login(
    eventName: login,
    eventParams: Method,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view, eventParams: Pagelocation): Unit = js.native
  @JSName("logEvent")
  def logEvent_pageview(
    eventName: page_view,
    eventParams: Pagelocation,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_purchase(eventName: purchase, eventParams: Affiliation): Unit = js.native
  @JSName("logEvent")
  def logEvent_purchase(
    eventName: purchase,
    eventParams: Affiliation,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  @JSName("logEvent")
  def logEvent_refund(eventName: refund, eventParams: Affiliation): Unit = js.native
  @JSName("logEvent")
  def logEvent_refund(
    eventName: refund,
    eventParams: Affiliation,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  @JSName("logEvent")
  def logEvent_removefromcart(eventName: remove_from_cart, eventParams: typings.firebase.anon.Currency): Unit = js.native
  @JSName("logEvent")
  def logEvent_removefromcart(
    eventName: remove_from_cart,
    eventParams: typings.firebase.anon.Currency,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view, eventParams: Appid): Unit = js.native
  @JSName("logEvent")
  def logEvent_screenview(
    eventName: screen_view,
    eventParams: Appid,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_search(eventName: search, eventParams: Searchterm): Unit = js.native
  @JSName("logEvent")
  def logEvent_search(
    eventName: search,
    eventParams: Searchterm,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content, eventParams: Contentid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectcontent(
    eventName: select_content,
    eventParams: Contentid,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item, eventParams: Itemlistid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectitem(
    eventName: select_item,
    eventParams: Itemlistid,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectpromotion(eventName: select_promotion, eventParams: Promotionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectpromotion(
    eventName: select_promotion,
    eventParams: Promotionid,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: Checkoutstep): Unit = js.native
  @JSName("logEvent")
  def logEvent_setcheckoutoption(
    eventName: set_checkout_option,
    eventParams: Checkoutstep,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_share(eventName: share, eventParams: Contenttype): Unit = js.native
  @JSName("logEvent")
  def logEvent_share(
    eventName: share,
    eventParams: Contenttype,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up, eventParams: Method): Unit = js.native
  @JSName("logEvent")
  def logEvent_signup(
    eventName: sign_up,
    eventParams: Method,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete, eventParams: Eventcategory): Unit = js.native
  @JSName("logEvent")
  def logEvent_timingcomplete(
    eventName: timing_complete,
    eventParams: Eventcategory,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_viewcart(eventName: view_cart, eventParams: Value): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewcart(
    eventName: view_cart,
    eventParams: Value,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitem(eventName: view_item, eventParams: Value): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitem(
    eventName: view_item,
    eventParams: Value,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list, eventParams: Itemlistid): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitemlist(
    eventName: view_item_list,
    eventParams: Itemlistid,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewpromotion(eventName: view_promotion, eventParams: Promotionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewpromotion(
    eventName: view_promotion,
    eventParams: Promotionid,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewsearchresults(eventName: view_search_results, eventParams: Searchterm): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewsearchresults(
    eventName: view_search_results,
    eventParams: Searchterm,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
  
  /**
    * Sets whether analytics collection is enabled for this app on this device.
    * window['ga-disable-analyticsId'] = true;
    */
  def setAnalyticsCollectionEnabled(enabled: Boolean): Unit = js.native
  
  /**
    * Use gtag 'config' command to set 'screen_name'.
    */
  def setCurrentScreen(screenName: String): Unit = js.native
  def setCurrentScreen(screenName: String, options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions): Unit = js.native
  
  /**
    * Use gtag 'config' command to set 'user_id'.
    */
  def setUserId(id: String): Unit = js.native
  def setUserId(id: String, options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions): Unit = js.native
  
  /**
    * Use gtag 'config' command to set all params specified.
    */
  def setUserProperties(properties: typings.firebase.mod.firebase.analytics.CustomParams): Unit = js.native
  def setUserProperties(
    properties: typings.firebase.mod.firebase.analytics.CustomParams,
    options: typings.firebase.mod.firebase.analytics.AnalyticsCallOptions
  ): Unit = js.native
}
