package typings.firebaseAnalyticsCompat

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseAnalytics.mod.Analytics
import typings.firebaseAnalytics.mod.AnalyticsCallOptions
import typings.firebaseAnalytics.mod.AnalyticsSettings
import typings.firebaseAnalytics.mod.CustomEventName
import typings.firebaseAnalytics.mod.CustomParams
import typings.firebaseAnalyticsCompat.anon.Affiliation
import typings.firebaseAnalyticsCompat.anon.Checkoutoption
import typings.firebaseAnalyticsCompat.anon.Checkoutstep
import typings.firebaseAnalyticsCompat.anon.Contenttype
import typings.firebaseAnalyticsCompat.anon.Coupon
import typings.firebaseAnalyticsCompat.anon.Currency
import typings.firebaseAnalyticsCompat.anon.Description
import typings.firebaseAnalyticsCompat.anon.Dictkey
import typings.firebaseAnalyticsCompat.anon.DictkeyCurrency
import typings.firebaseAnalyticsCompat.anon.Eventcategory
import typings.firebaseAnalyticsCompat.anon.Firebasescreen
import typings.firebaseAnalyticsCompat.anon.Itemid
import typings.firebaseAnalyticsCompat.anon.Itemlistid
import typings.firebaseAnalyticsCompat.anon.Items
import typings.firebaseAnalyticsCompat.anon.Method
import typings.firebaseAnalyticsCompat.anon.Pagelocation
import typings.firebaseAnalyticsCompat.anon.Promotionid
import typings.firebaseAnalyticsCompat.anon.Searchterm
import typings.firebaseAnalyticsCompat.anon.Value
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.add_payment_info
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.add_shipping_info
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.add_to_cart
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.add_to_wishlist
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.begin_checkout
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.checkout_progress
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.exception
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.generate_lead
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.login
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.page_view
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.purchase
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.refund
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.remove_from_cart
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.screen_view
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.search
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.select_content
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.select_item
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.select_promotion
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.set_checkout_option
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.share
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.sign_up
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.timing_complete
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_cart
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_item
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_item_list
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_promotion
import typings.firebaseAnalyticsCompat.firebaseAnalyticsCompatStrings.view_search_results
import typings.firebaseAnalyticsCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp
import typings.firebaseAnalyticsTypes.mod.FirebaseAnalytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@firebase/analytics-compat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* augmented module */
  object firebaseAnalyticsAugmentingMod {
    
    @JSImport("@firebase/analytics", JSImport.Namespace)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAnalytics(app: js.UndefOr[FirebaseApp]): Analytics = ^.asInstanceOf[js.Dynamic].applyDynamic("getAnalytics")(app.asInstanceOf[js.Any]).asInstanceOf[Analytics]
    
    inline def initializeAnalytics(app: FirebaseApp, options: js.UndefOr[AnalyticsSettings]): Analytics = (^.asInstanceOf[js.Dynamic].applyDynamic("initializeAnalytics")(app.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Analytics]
    
    inline def logEvent(
      analyticsInstance: FirebaseAnalytics,
      eventName: add_to_cart | add_to_wishlist | purchase | refund | remove_from_cart | search | select_promotion | view_cart | view_item | view_promotion | view_search_results,
      eventParams: js.UndefOr[Affiliation | Currency | DictkeyCurrency | Promotionid | Searchterm],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def logEvent[T /* <: String */](
      analyticsInstance: FirebaseAnalytics,
      eventName: CustomEventName[T],
      eventParams: js.UndefOr[StringDictionary[Any]],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_addpaymentinfo(
      analyticsInstance: FirebaseAnalytics,
      eventName: add_payment_info,
      eventParams: js.UndefOr[Dictkey],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_addshippinginfo(
      analyticsInstance: FirebaseAnalytics,
      eventName: add_shipping_info,
      eventParams: js.UndefOr[Coupon],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_begincheckout(
      analyticsInstance: FirebaseAnalytics,
      eventName: begin_checkout,
      eventParams: js.UndefOr[Items],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_checkoutprogress(
      analyticsInstance: FirebaseAnalytics,
      eventName: checkout_progress,
      eventParams: js.UndefOr[Checkoutoption],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_exception(
      analyticsInstance: FirebaseAnalytics,
      eventName: exception,
      eventParams: js.UndefOr[Description],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_generatelead(
      analyticsInstance: FirebaseAnalytics,
      eventName: generate_lead,
      eventParams: js.UndefOr[Value],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_login(
      analyticsInstance: FirebaseAnalytics,
      eventName: login,
      eventParams: js.UndefOr[Method],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_pageview(
      analyticsInstance: FirebaseAnalytics,
      eventName: page_view,
      eventParams: js.UndefOr[Pagelocation],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_screenview(
      analyticsInstance: FirebaseAnalytics,
      eventName: screen_view,
      eventParams: js.UndefOr[Firebasescreen],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_selectcontent(
      analyticsInstance: FirebaseAnalytics,
      eventName: select_content,
      eventParams: js.UndefOr[Contenttype],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_selectitem(
      analyticsInstance: FirebaseAnalytics,
      eventName: select_item,
      eventParams: js.UndefOr[Itemlistid],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_setcheckoutoption(
      analyticsInstance: FirebaseAnalytics,
      eventName: set_checkout_option,
      eventParams: js.UndefOr[Checkoutstep],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_share(
      analyticsInstance: FirebaseAnalytics,
      eventName: share,
      eventParams: js.UndefOr[Itemid],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_signup(
      analyticsInstance: FirebaseAnalytics,
      eventName: sign_up,
      eventParams: js.UndefOr[Method],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_timingcomplete(
      analyticsInstance: FirebaseAnalytics,
      eventName: timing_complete,
      eventParams: js.UndefOr[Eventcategory],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def logEvent_viewitemlist(
      analyticsInstance: FirebaseAnalytics,
      eventName: view_item_list,
      eventParams: js.UndefOr[Itemlistid],
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(analyticsInstance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], eventParams.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setAnalyticsCollectionEnabled(analyticsInstance: FirebaseAnalytics, enabled: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setAnalyticsCollectionEnabled")(analyticsInstance.asInstanceOf[js.Any], enabled.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setCurrentScreen(
      analyticsInstance: FirebaseAnalytics,
      screenName: String,
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setCurrentScreen")(analyticsInstance.asInstanceOf[js.Any], screenName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setUserId(analyticsInstance: FirebaseAnalytics, id: String | Null, options: js.UndefOr[AnalyticsCallOptions]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(analyticsInstance.asInstanceOf[js.Any], id.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def setUserProperties(
      analyticsInstance: FirebaseAnalytics,
      properties: CustomParams,
      options: js.UndefOr[AnalyticsCallOptions]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(analyticsInstance.asInstanceOf[js.Any], properties.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  inline def registerAnalytics(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAnalytics")().asInstanceOf[Unit]
  
  /**
    * Define extension behavior of `registerAnalytics`
    */
  /* augmented module */
  object firebaseAppCompatAugmentingMod {
    
    trait FirebaseApp extends StObject {
      
      def analytics(): FirebaseAnalytics
    }
    object FirebaseApp {
      
      inline def apply(analytics: () => FirebaseAnalytics): FirebaseApp = {
        val __obj = js.Dynamic.literal(analytics = js.Any.fromFunction0(analytics))
        __obj.asInstanceOf[FirebaseApp]
      }
      
      extension [Self <: FirebaseApp](x: Self) {
        
        inline def setAnalytics(value: () => FirebaseAnalytics): Self = StObject.set(x, "analytics", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait FirebaseNamespace extends StObject {
      
      def analytics(): FirebaseAnalytics = js.native
      def analytics(app: FirebaseApp): FirebaseAnalytics = js.native
    }
  }
}
