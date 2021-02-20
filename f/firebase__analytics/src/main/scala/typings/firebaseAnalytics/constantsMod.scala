package typings.firebaseAnalytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@firebase/analytics/dist/src/constants", "DYNAMIC_CONFIG_URL")
  @js.native
  val DYNAMIC_CONFIG_URL: /* "https://firebase.googleapis.com/v1alpha/projects/-/apps/{app-id}/webConfig" */ String = js.native
  
  @js.native
  sealed trait EventName extends StObject
  @JSImport("@firebase/analytics/dist/src/constants", "EventName")
  @js.native
  object EventName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EventName with String] = js.native
    
    @js.native
    sealed trait ADD_PAYMENT_INFO extends EventName
    /* "add_payment_info" */ val ADD_PAYMENT_INFO: typings.firebaseAnalytics.constantsMod.EventName.ADD_PAYMENT_INFO with String = js.native
    
    @js.native
    sealed trait ADD_SHIPPING_INFO extends EventName
    /* "add_shipping_info" */ val ADD_SHIPPING_INFO: typings.firebaseAnalytics.constantsMod.EventName.ADD_SHIPPING_INFO with String = js.native
    
    @js.native
    sealed trait ADD_TO_CART extends EventName
    /* "add_to_cart" */ val ADD_TO_CART: typings.firebaseAnalytics.constantsMod.EventName.ADD_TO_CART with String = js.native
    
    @js.native
    sealed trait ADD_TO_WISHLIST extends EventName
    /* "add_to_wishlist" */ val ADD_TO_WISHLIST: typings.firebaseAnalytics.constantsMod.EventName.ADD_TO_WISHLIST with String = js.native
    
    @js.native
    sealed trait BEGIN_CHECKOUT extends EventName
    /* "begin_checkout" */ val BEGIN_CHECKOUT: typings.firebaseAnalytics.constantsMod.EventName.BEGIN_CHECKOUT with String = js.native
    
    /** @deprecated */
    @js.native
    sealed trait CHECKOUT_PROGRESS extends EventName
    /* "checkout_progress" */ val CHECKOUT_PROGRESS: typings.firebaseAnalytics.constantsMod.EventName.CHECKOUT_PROGRESS with String = js.native
    
    @js.native
    sealed trait EXCEPTION extends EventName
    /* "exception" */ val EXCEPTION: typings.firebaseAnalytics.constantsMod.EventName.EXCEPTION with String = js.native
    
    @js.native
    sealed trait GENERATE_LEAD extends EventName
    /* "generate_lead" */ val GENERATE_LEAD: typings.firebaseAnalytics.constantsMod.EventName.GENERATE_LEAD with String = js.native
    
    @js.native
    sealed trait LOGIN extends EventName
    /* "login" */ val LOGIN: typings.firebaseAnalytics.constantsMod.EventName.LOGIN with String = js.native
    
    @js.native
    sealed trait PAGE_VIEW extends EventName
    /* "page_view" */ val PAGE_VIEW: typings.firebaseAnalytics.constantsMod.EventName.PAGE_VIEW with String = js.native
    
    @js.native
    sealed trait PURCHASE extends EventName
    /* "purchase" */ val PURCHASE: typings.firebaseAnalytics.constantsMod.EventName.PURCHASE with String = js.native
    
    @js.native
    sealed trait REFUND extends EventName
    /* "refund" */ val REFUND: typings.firebaseAnalytics.constantsMod.EventName.REFUND with String = js.native
    
    @js.native
    sealed trait REMOVE_FROM_CART extends EventName
    /* "remove_from_cart" */ val REMOVE_FROM_CART: typings.firebaseAnalytics.constantsMod.EventName.REMOVE_FROM_CART with String = js.native
    
    @js.native
    sealed trait SCREEN_VIEW extends EventName
    /* "screen_view" */ val SCREEN_VIEW: typings.firebaseAnalytics.constantsMod.EventName.SCREEN_VIEW with String = js.native
    
    @js.native
    sealed trait SEARCH extends EventName
    /* "search" */ val SEARCH: typings.firebaseAnalytics.constantsMod.EventName.SEARCH with String = js.native
    
    @js.native
    sealed trait SELECT_CONTENT extends EventName
    /* "select_content" */ val SELECT_CONTENT: typings.firebaseAnalytics.constantsMod.EventName.SELECT_CONTENT with String = js.native
    
    @js.native
    sealed trait SELECT_ITEM extends EventName
    /* "select_item" */ val SELECT_ITEM: typings.firebaseAnalytics.constantsMod.EventName.SELECT_ITEM with String = js.native
    
    @js.native
    sealed trait SELECT_PROMOTION extends EventName
    /* "select_promotion" */ val SELECT_PROMOTION: typings.firebaseAnalytics.constantsMod.EventName.SELECT_PROMOTION with String = js.native
    
    /** @deprecated */
    @js.native
    sealed trait SET_CHECKOUT_OPTION extends EventName
    /* "set_checkout_option" */ val SET_CHECKOUT_OPTION: typings.firebaseAnalytics.constantsMod.EventName.SET_CHECKOUT_OPTION with String = js.native
    
    @js.native
    sealed trait SHARE extends EventName
    /* "share" */ val SHARE: typings.firebaseAnalytics.constantsMod.EventName.SHARE with String = js.native
    
    @js.native
    sealed trait SIGN_UP extends EventName
    /* "sign_up" */ val SIGN_UP: typings.firebaseAnalytics.constantsMod.EventName.SIGN_UP with String = js.native
    
    @js.native
    sealed trait TIMING_COMPLETE extends EventName
    /* "timing_complete" */ val TIMING_COMPLETE: typings.firebaseAnalytics.constantsMod.EventName.TIMING_COMPLETE with String = js.native
    
    @js.native
    sealed trait VIEW_CART extends EventName
    /* "view_cart" */ val VIEW_CART: typings.firebaseAnalytics.constantsMod.EventName.VIEW_CART with String = js.native
    
    @js.native
    sealed trait VIEW_ITEM extends EventName
    /* "view_item" */ val VIEW_ITEM: typings.firebaseAnalytics.constantsMod.EventName.VIEW_ITEM with String = js.native
    
    @js.native
    sealed trait VIEW_ITEM_LIST extends EventName
    /* "view_item_list" */ val VIEW_ITEM_LIST: typings.firebaseAnalytics.constantsMod.EventName.VIEW_ITEM_LIST with String = js.native
    
    @js.native
    sealed trait VIEW_PROMOTION extends EventName
    /* "view_promotion" */ val VIEW_PROMOTION: typings.firebaseAnalytics.constantsMod.EventName.VIEW_PROMOTION with String = js.native
    
    @js.native
    sealed trait VIEW_SEARCH_RESULTS extends EventName
    /* "view_search_results" */ val VIEW_SEARCH_RESULTS: typings.firebaseAnalytics.constantsMod.EventName.VIEW_SEARCH_RESULTS with String = js.native
  }
  
  @JSImport("@firebase/analytics/dist/src/constants", "FETCH_TIMEOUT_MILLIS")
  @js.native
  val FETCH_TIMEOUT_MILLIS: Double = js.native
  
  @JSImport("@firebase/analytics/dist/src/constants", "GA_FID_KEY")
  @js.native
  val GA_FID_KEY: /* "firebase_id" */ String = js.native
  
  @JSImport("@firebase/analytics/dist/src/constants", "GTAG_URL")
  @js.native
  val GTAG_URL: /* "https://www.googletagmanager.com/gtag/js" */ String = js.native
  
  @js.native
  sealed trait GtagCommand extends StObject
  @JSImport("@firebase/analytics/dist/src/constants", "GtagCommand")
  @js.native
  object GtagCommand extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[GtagCommand with String] = js.native
    
    @js.native
    sealed trait CONFIG extends GtagCommand
    /* "config" */ val CONFIG: typings.firebaseAnalytics.constantsMod.GtagCommand.CONFIG with String = js.native
    
    @js.native
    sealed trait EVENT extends GtagCommand
    /* "event" */ val EVENT: typings.firebaseAnalytics.constantsMod.GtagCommand.EVENT with String = js.native
    
    @js.native
    sealed trait SET extends GtagCommand
    /* "set" */ val SET: typings.firebaseAnalytics.constantsMod.GtagCommand.SET with String = js.native
  }
  
  @JSImport("@firebase/analytics/dist/src/constants", "ORIGIN_KEY")
  @js.native
  val ORIGIN_KEY: /* "origin" */ String = js.native
}
