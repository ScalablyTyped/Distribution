package typings.firebase.firebaseMod.default

import typings.firebase.firebaseMod.firebase.analytics.Analytics
import typings.firebase.firebaseMod.firebase.analytics.SettingsOptions
import typings.firebase.firebaseMod.firebase.app.App
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @webonly
  */
object analytics {
  
  /**
    * Gets the {@link firebase.analytics.Analytics `Analytics`} service.
    *
    * `firebase.analytics()` can be called with no arguments to access the default
    * app's {@link firebase.analytics.Analytics `Analytics`} service.
    *
    * @webonly
    *
    * @example
    * ```javascript
    * // Get the Analytics service for the default app
    * const defaultAnalytics = firebase.analytics();
    * ```
    *
    * @param app The app to create an analytics service for.
    * If not passed, uses the default app.
    */
  inline def apply(): Analytics = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Analytics]
  inline def apply(app: App): Analytics = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Analytics]
  
  @JSImport("firebase/compat", "default.analytics")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/compat", "default.analytics.EventName")
  @js.native
  object EventName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.firebase.firebaseMod.firebase.analytics.EventName & String] = js.native
    
    /* "add_payment_info" */ val ADD_PAYMENT_INFO: typings.firebase.firebaseMod.firebase.analytics.EventName.ADD_PAYMENT_INFO & String = js.native
    
    /* "add_shipping_info" */ val ADD_SHIPPING_INFO: typings.firebase.firebaseMod.firebase.analytics.EventName.ADD_SHIPPING_INFO & String = js.native
    
    /* "add_to_cart" */ val ADD_TO_CART: typings.firebase.firebaseMod.firebase.analytics.EventName.ADD_TO_CART & String = js.native
    
    /* "add_to_wishlist" */ val ADD_TO_WISHLIST: typings.firebase.firebaseMod.firebase.analytics.EventName.ADD_TO_WISHLIST & String = js.native
    
    /* "begin_checkout" */ val BEGIN_CHECKOUT: typings.firebase.firebaseMod.firebase.analytics.EventName.BEGIN_CHECKOUT & String = js.native
    
    /* "checkout_progress" */ val CHECKOUT_PROGRESS: typings.firebase.firebaseMod.firebase.analytics.EventName.CHECKOUT_PROGRESS & String = js.native
    
    /* "exception" */ val EXCEPTION: typings.firebase.firebaseMod.firebase.analytics.EventName.EXCEPTION & String = js.native
    
    /* "generate_lead" */ val GENERATE_LEAD: typings.firebase.firebaseMod.firebase.analytics.EventName.GENERATE_LEAD & String = js.native
    
    /* "login" */ val LOGIN: typings.firebase.firebaseMod.firebase.analytics.EventName.LOGIN & String = js.native
    
    /* "page_view" */ val PAGE_VIEW: typings.firebase.firebaseMod.firebase.analytics.EventName.PAGE_VIEW & String = js.native
    
    /* "purchase" */ val PURCHASE: typings.firebase.firebaseMod.firebase.analytics.EventName.PURCHASE & String = js.native
    
    /* "refund" */ val REFUND: typings.firebase.firebaseMod.firebase.analytics.EventName.REFUND & String = js.native
    
    /* "remove_from_cart" */ val REMOVE_FROM_CART: typings.firebase.firebaseMod.firebase.analytics.EventName.REMOVE_FROM_CART & String = js.native
    
    /* "screen_view" */ val SCREEN_VIEW: typings.firebase.firebaseMod.firebase.analytics.EventName.SCREEN_VIEW & String = js.native
    
    /* "search" */ val SEARCH: typings.firebase.firebaseMod.firebase.analytics.EventName.SEARCH & String = js.native
    
    /* "select_content" */ val SELECT_CONTENT: typings.firebase.firebaseMod.firebase.analytics.EventName.SELECT_CONTENT & String = js.native
    
    /* "select_item" */ val SELECT_ITEM: typings.firebase.firebaseMod.firebase.analytics.EventName.SELECT_ITEM & String = js.native
    
    /* "select_promotion" */ val SELECT_PROMOTION: typings.firebase.firebaseMod.firebase.analytics.EventName.SELECT_PROMOTION & String = js.native
    
    /* "set_checkout_option" */ val SET_CHECKOUT_OPTION: typings.firebase.firebaseMod.firebase.analytics.EventName.SET_CHECKOUT_OPTION & String = js.native
    
    /* "share" */ val SHARE: typings.firebase.firebaseMod.firebase.analytics.EventName.SHARE & String = js.native
    
    /* "sign_up" */ val SIGN_UP: typings.firebase.firebaseMod.firebase.analytics.EventName.SIGN_UP & String = js.native
    
    /* "timing_complete" */ val TIMING_COMPLETE: typings.firebase.firebaseMod.firebase.analytics.EventName.TIMING_COMPLETE & String = js.native
    
    /* "view_cart" */ val VIEW_CART: typings.firebase.firebaseMod.firebase.analytics.EventName.VIEW_CART & String = js.native
    
    /* "view_item" */ val VIEW_ITEM: typings.firebase.firebaseMod.firebase.analytics.EventName.VIEW_ITEM & String = js.native
    
    /* "view_item_list" */ val VIEW_ITEM_LIST: typings.firebase.firebaseMod.firebase.analytics.EventName.VIEW_ITEM_LIST & String = js.native
    
    /* "view_promotion" */ val VIEW_PROMOTION: typings.firebase.firebaseMod.firebase.analytics.EventName.VIEW_PROMOTION & String = js.native
    
    /* "view_search_results" */ val VIEW_SEARCH_RESULTS: typings.firebase.firebaseMod.firebase.analytics.EventName.VIEW_SEARCH_RESULTS & String = js.native
  }
  
  /**
    * An async function that returns true if current browser context supports initialization of analytics module
    * (`firebase.analytics()`).
    *
    * Returns false otherwise.
    *
    *
    */
  inline def isSupported(): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("isSupported")().asInstanceOf[js.Promise[Boolean]]
  
  inline def settings(settings: SettingsOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("settings")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
