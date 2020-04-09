package typings.firebase.mod.analytics

import org.scalablytyped.runtime.StringDictionary
import typings.firebase.AnonAffiliation
import typings.firebase.AnonAppid
import typings.firebase.AnonCheckoutoption
import typings.firebase.AnonCheckoutstep
import typings.firebase.AnonContentid
import typings.firebase.AnonContenttype
import typings.firebase.AnonCoupon
import typings.firebase.AnonCurrency
import typings.firebase.AnonDescription
import typings.firebase.AnonDictkey
import typings.firebase.AnonEventcategory
import typings.firebase.AnonItemlistid
import typings.firebase.AnonItems
import typings.firebase.AnonMethod
import typings.firebase.AnonPagelocation
import typings.firebase.AnonPromotionid
import typings.firebase.AnonSearchterm
import typings.firebase.AnonTransactionid
import typings.firebase.AnonValue
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
import typings.firebase.mod.app.App
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * List of recommended event parameters can be found in
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
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: AnonDictkey): Unit = js.native
  @JSName("logEvent")
  def logEvent_addpaymentinfo(eventName: add_payment_info, eventParams: AnonDictkey, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info, eventParams: AnonCoupon): Unit = js.native
  @JSName("logEvent")
  def logEvent_addshippinginfo(eventName: add_shipping_info, eventParams: AnonCoupon, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_addtocart(eventName: add_to_cart, eventParams: AnonCurrency): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtocart(eventName: add_to_cart, eventParams: AnonCurrency, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtowishlist(eventName: add_to_wishlist, eventParams: AnonCurrency): Unit = js.native
  @JSName("logEvent")
  def logEvent_addtowishlist(eventName: add_to_wishlist, eventParams: AnonCurrency, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout, eventParams: AnonItems): Unit = js.native
  @JSName("logEvent")
  def logEvent_begincheckout(eventName: begin_checkout, eventParams: AnonItems, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: AnonCheckoutoption): Unit = js.native
  @JSName("logEvent")
  def logEvent_checkoutprogress(eventName: checkout_progress, eventParams: AnonCheckoutoption, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_exception(eventName: exception, eventParams: AnonDescription): Unit = js.native
  @JSName("logEvent")
  def logEvent_exception(eventName: exception, eventParams: AnonDescription, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead, eventParams: AnonTransactionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_generatelead(eventName: generate_lead, eventParams: AnonTransactionid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_login(eventName: login, eventParams: AnonMethod): Unit = js.native
  @JSName("logEvent")
  def logEvent_login(eventName: login, eventParams: AnonMethod, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view, eventParams: AnonPagelocation): Unit = js.native
  @JSName("logEvent")
  def logEvent_pageview(eventName: page_view, eventParams: AnonPagelocation, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_purchase(eventName: purchase, eventParams: AnonAffiliation): Unit = js.native
  @JSName("logEvent")
  def logEvent_purchase(eventName: purchase, eventParams: AnonAffiliation, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_refund(eventName: refund, eventParams: AnonAffiliation): Unit = js.native
  @JSName("logEvent")
  def logEvent_refund(eventName: refund, eventParams: AnonAffiliation, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_removefromcart(eventName: remove_from_cart, eventParams: AnonCurrency): Unit = js.native
  @JSName("logEvent")
  def logEvent_removefromcart(eventName: remove_from_cart, eventParams: AnonCurrency, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view, eventParams: AnonAppid): Unit = js.native
  @JSName("logEvent")
  def logEvent_screenview(eventName: screen_view, eventParams: AnonAppid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_search(eventName: search, eventParams: AnonSearchterm): Unit = js.native
  @JSName("logEvent")
  def logEvent_search(eventName: search, eventParams: AnonSearchterm, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content, eventParams: AnonContentid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectcontent(eventName: select_content, eventParams: AnonContentid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item, eventParams: AnonItemlistid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectitem(eventName: select_item, eventParams: AnonItemlistid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_selectpromotion(eventName: select_promotion, eventParams: AnonPromotionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_selectpromotion(eventName: select_promotion, eventParams: AnonPromotionid, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: AnonCheckoutstep): Unit = js.native
  @JSName("logEvent")
  def logEvent_setcheckoutoption(eventName: set_checkout_option, eventParams: AnonCheckoutstep, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_share(eventName: share, eventParams: AnonContenttype): Unit = js.native
  @JSName("logEvent")
  def logEvent_share(eventName: share, eventParams: AnonContenttype, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up, eventParams: AnonMethod): Unit = js.native
  @JSName("logEvent")
  def logEvent_signup(eventName: sign_up, eventParams: AnonMethod, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete, eventParams: AnonEventcategory): Unit = js.native
  @JSName("logEvent")
  def logEvent_timingcomplete(eventName: timing_complete, eventParams: AnonEventcategory, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_viewcart(eventName: view_cart, eventParams: AnonValue): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewcart(eventName: view_cart, eventParams: AnonValue, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitem(eventName: view_item, eventParams: AnonValue): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitem(eventName: view_item, eventParams: AnonValue, options: AnalyticsCallOptions): Unit = js.native
  /**
    * Sends analytics event with given `eventParams`. This method
    * automatically associates this logged event with this Firebase web
    * app instance on this device.
    * List of recommended event parameters can be found in
    * {@link https://developers.google.com/gtagjs/reference/event
    * the gtag.js reference documentation}.
    */
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list, eventParams: AnonItemlistid): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewitemlist(eventName: view_item_list, eventParams: AnonItemlistid, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewpromotion(eventName: view_promotion, eventParams: AnonPromotionid): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewpromotion(eventName: view_promotion, eventParams: AnonPromotionid, options: AnalyticsCallOptions): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewsearchresults(eventName: view_search_results, eventParams: AnonSearchterm): Unit = js.native
  @JSName("logEvent")
  def logEvent_viewsearchresults(eventName: view_search_results, eventParams: AnonSearchterm, options: AnalyticsCallOptions): Unit = js.native
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

