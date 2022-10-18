package typings.firebase

import org.scalablytyped.runtime.StringDictionary
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
import typings.firebaseAnalytics.anon.Affiliation
import typings.firebaseAnalytics.anon.Checkoutoption
import typings.firebaseAnalytics.anon.Checkoutstep
import typings.firebaseAnalytics.anon.Contenttype
import typings.firebaseAnalytics.anon.Coupon
import typings.firebaseAnalytics.anon.Currency
import typings.firebaseAnalytics.anon.Description
import typings.firebaseAnalytics.anon.Dictkey
import typings.firebaseAnalytics.anon.DictkeyCurrency
import typings.firebaseAnalytics.anon.Eventcategory
import typings.firebaseAnalytics.anon.Firebasescreen
import typings.firebaseAnalytics.anon.Itemid
import typings.firebaseAnalytics.anon.Itemlistid
import typings.firebaseAnalytics.anon.Items
import typings.firebaseAnalytics.anon.Method
import typings.firebaseAnalytics.anon.Pagelocation
import typings.firebaseAnalytics.anon.Promotionid
import typings.firebaseAnalytics.anon.Searchterm
import typings.firebaseAnalytics.anon.Value
import typings.firebaseAnalytics.mod.Analytics
import typings.firebaseAnalytics.mod.AnalyticsCallOptions
import typings.firebaseAnalytics.mod.AnalyticsSettings
import typings.firebaseAnalytics.mod.ConsentSettings
import typings.firebaseAnalytics.mod.CustomEventName
import typings.firebaseAnalytics.mod.CustomParams
import typings.firebaseAnalytics.mod.SettingsOptions
import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreDistAnalyticsMod {
  
  @JSImport("firebase/firestore/dist/analytics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAnalytics(): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalytics")().asInstanceOf[Analytics]
  inline def getAnalytics(app: FirebaseApp): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalytics")(app.asInstanceOf[js.Any]).asInstanceOf[Analytics]
  
  inline def initializeAnalytics(app: FirebaseApp): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("initializeAnalytics")(app.asInstanceOf[js.Any]).asInstanceOf[Analytics]
  inline def initializeAnalytics(app: FirebaseApp, options: AnalyticsSettings): Analytics = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAnalytics")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analytics]
  
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: add_to_cart | add_to_wishlist | purchase | refund | remove_from_cart | search | select_promotion | view_cart | view_item | view_promotion | view_search_results
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: add_to_cart | add_to_wishlist | purchase | refund | remove_from_cart | search | select_promotion | view_cart | view_item | view_promotion | view_search_results,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(analyticsInstance: Analytics, eventName: purchase | refund, eventParams: Affiliation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: purchase | refund,
    eventParams: Affiliation,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: add_to_cart | add_to_wishlist | remove_from_cart,
    eventParams: Currency
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: add_to_cart | add_to_wishlist | remove_from_cart,
    eventParams: Currency,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(analyticsInstance: Analytics, eventName: view_cart | view_item, eventParams: DictkeyCurrency): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: view_cart | view_item,
    eventParams: DictkeyCurrency,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: select_promotion | view_promotion,
    eventParams: Promotionid
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: select_promotion | view_promotion,
    eventParams: Promotionid,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(analyticsInstance: Analytics, eventName: search | view_search_results, eventParams: Searchterm): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent(
    analyticsInstance: Analytics,
    eventName: search | view_search_results,
    eventParams: Searchterm,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent[T /* <: String */](analyticsInstance: Analytics, eventName: CustomEventName[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent[T /* <: String */](analyticsInstance: Analytics, eventName: CustomEventName[T], eventParams: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent[T /* <: String */](
    analyticsInstance: Analytics,
    eventName: CustomEventName[T],
    eventParams: StringDictionary[Any],
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent[T /* <: String */](
    analyticsInstance: Analytics,
    eventName: CustomEventName[T],
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_addpaymentinfo(analyticsInstance: Analytics, eventName: add_payment_info): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addpaymentinfo(
    analyticsInstance: Analytics,
    eventName: add_payment_info,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addpaymentinfo(analyticsInstance: Analytics, eventName: add_payment_info, eventParams: Dictkey): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addpaymentinfo(
    analyticsInstance: Analytics,
    eventName: add_payment_info,
    eventParams: Dictkey,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_addshippinginfo(analyticsInstance: Analytics, eventName: add_shipping_info): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addshippinginfo(
    analyticsInstance: Analytics,
    eventName: add_shipping_info,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addshippinginfo(analyticsInstance: Analytics, eventName: add_shipping_info, eventParams: Coupon): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_addshippinginfo(
    analyticsInstance: Analytics,
    eventName: add_shipping_info,
    eventParams: Coupon,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_begincheckout(analyticsInstance: Analytics, eventName: begin_checkout): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_begincheckout(
    analyticsInstance: Analytics,
    eventName: begin_checkout,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_begincheckout(analyticsInstance: Analytics, eventName: begin_checkout, eventParams: Items): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_begincheckout(
    analyticsInstance: Analytics,
    eventName: begin_checkout,
    eventParams: Items,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_checkoutprogress(analyticsInstance: Analytics, eventName: checkout_progress): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_checkoutprogress(
    analyticsInstance: Analytics,
    eventName: checkout_progress,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_checkoutprogress(analyticsInstance: Analytics, eventName: checkout_progress, eventParams: Checkoutoption): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_checkoutprogress(
    analyticsInstance: Analytics,
    eventName: checkout_progress,
    eventParams: Checkoutoption,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_exception(analyticsInstance: Analytics, eventName: exception): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_exception(
    analyticsInstance: Analytics,
    eventName: exception,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_exception(analyticsInstance: Analytics, eventName: exception, eventParams: Description): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_exception(
    analyticsInstance: Analytics,
    eventName: exception,
    eventParams: Description,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_generatelead(analyticsInstance: Analytics, eventName: generate_lead): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_generatelead(
    analyticsInstance: Analytics,
    eventName: generate_lead,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_generatelead(analyticsInstance: Analytics, eventName: generate_lead, eventParams: Value): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_generatelead(
    analyticsInstance: Analytics,
    eventName: generate_lead,
    eventParams: Value,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_login(analyticsInstance: Analytics, eventName: login): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_login(analyticsInstance: Analytics, eventName: login, eventParams: Unit, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_login(analyticsInstance: Analytics, eventName: login, eventParams: Method): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_login(analyticsInstance: Analytics, eventName: login, eventParams: Method, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_pageview(analyticsInstance: Analytics, eventName: page_view): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_pageview(
    analyticsInstance: Analytics,
    eventName: page_view,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_pageview(analyticsInstance: Analytics, eventName: page_view, eventParams: Pagelocation): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_pageview(
    analyticsInstance: Analytics,
    eventName: page_view,
    eventParams: Pagelocation,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_screenview(analyticsInstance: Analytics, eventName: screen_view): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_screenview(
    analyticsInstance: Analytics,
    eventName: screen_view,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_screenview(analyticsInstance: Analytics, eventName: screen_view, eventParams: Firebasescreen): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_screenview(
    analyticsInstance: Analytics,
    eventName: screen_view,
    eventParams: Firebasescreen,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_selectcontent(analyticsInstance: Analytics, eventName: select_content): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectcontent(
    analyticsInstance: Analytics,
    eventName: select_content,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectcontent(analyticsInstance: Analytics, eventName: select_content, eventParams: Contenttype): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectcontent(
    analyticsInstance: Analytics,
    eventName: select_content,
    eventParams: Contenttype,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_selectitem(analyticsInstance: Analytics, eventName: select_item): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectitem(
    analyticsInstance: Analytics,
    eventName: select_item,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectitem(analyticsInstance: Analytics, eventName: select_item, eventParams: Itemlistid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_selectitem(
    analyticsInstance: Analytics,
    eventName: select_item,
    eventParams: Itemlistid,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_setcheckoutoption(analyticsInstance: Analytics, eventName: set_checkout_option): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_setcheckoutoption(
    analyticsInstance: Analytics,
    eventName: set_checkout_option,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_setcheckoutoption(analyticsInstance: Analytics, eventName: set_checkout_option, eventParams: Checkoutstep): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_setcheckoutoption(
    analyticsInstance: Analytics,
    eventName: set_checkout_option,
    eventParams: Checkoutstep,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_share(analyticsInstance: Analytics, eventName: share): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_share(analyticsInstance: Analytics, eventName: share, eventParams: Unit, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_share(analyticsInstance: Analytics, eventName: share, eventParams: Itemid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_share(analyticsInstance: Analytics, eventName: share, eventParams: Itemid, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_signup(analyticsInstance: Analytics, eventName: sign_up): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_signup(analyticsInstance: Analytics, eventName: sign_up, eventParams: Unit, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_signup(analyticsInstance: Analytics, eventName: sign_up, eventParams: Method): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_signup(
    analyticsInstance: Analytics,
    eventName: sign_up,
    eventParams: Method,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_timingcomplete(analyticsInstance: Analytics, eventName: timing_complete): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_timingcomplete(
    analyticsInstance: Analytics,
    eventName: timing_complete,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_timingcomplete(analyticsInstance: Analytics, eventName: timing_complete, eventParams: Eventcategory): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_timingcomplete(
    analyticsInstance: Analytics,
    eventName: timing_complete,
    eventParams: Eventcategory,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def logEvent_viewitemlist(analyticsInstance: Analytics, eventName: view_item_list): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_viewitemlist(
    analyticsInstance: Analytics,
    eventName: view_item_list,
    eventParams: Unit,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_viewitemlist(analyticsInstance: Analytics, eventName: view_item_list, eventParams: Itemlistid): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def logEvent_viewitemlist(
    analyticsInstance: Analytics,
    eventName: view_item_list,
    eventParams: Itemlistid,
    options: AnalyticsCallOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setAnalyticsCollectionEnabled(analyticsInstance: Analytics, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsCollectionEnabled")(analyticsInstance.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setConsent(consentSettings: ConsentSettings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setConsent")(consentSettings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setCurrentScreen(analyticsInstance: Analytics, screenName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(analyticsInstance.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setCurrentScreen(analyticsInstance: Analytics, screenName: String, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(analyticsInstance.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDefaultEventParameters(customParams: CustomParams): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultEventParameters")(customParams.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUserId(analyticsInstance: Analytics): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setUserId(analyticsInstance: Analytics, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUserId(analyticsInstance: Analytics, id: String, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUserId(analyticsInstance: Analytics, id: Null, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUserProperties(analyticsInstance: Analytics, properties: CustomParams): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(analyticsInstance.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setUserProperties(analyticsInstance: Analytics, properties: CustomParams, options: AnalyticsCallOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(analyticsInstance.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def settings(options: SettingsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
