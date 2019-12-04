package typings.atFirebaseAnalytics.distSrcConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventName extends js.Object

@JSImport("@firebase/analytics/dist/src/constants", "EventName")
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
  
  /* "add_payment_info" */ val ADD_PAYMENT_INFO: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.ADD_PAYMENT_INFO with String = js.native
  /* "add_to_cart" */ val ADD_TO_CART: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.ADD_TO_CART with String = js.native
  /* "add_to_wishlist" */ val ADD_TO_WISHLIST: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.ADD_TO_WISHLIST with String = js.native
  /* "begin_checkout" */ val BEGIN_CHECKOUT: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.BEGIN_CHECKOUT with String = js.native
  /* "checkout_progress" */ val CHECKOUT_PROGRESS: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.CHECKOUT_PROGRESS with String = js.native
  /* "exception" */ val EXCEPTION: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.EXCEPTION with String = js.native
  /* "generate_lead" */ val GENERATE_LEAD: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.GENERATE_LEAD with String = js.native
  /* "login" */ val LOGIN: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.LOGIN with String = js.native
  /* "page_view" */ val PAGE_VIEW: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.PAGE_VIEW with String = js.native
  /* "purchase" */ val PURCHASE: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.PURCHASE with String = js.native
  /* "refund" */ val REFUND: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.REFUND with String = js.native
  /* "remove_from_cart" */ val REMOVE_FROM_CART: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.REMOVE_FROM_CART with String = js.native
  /* "screen_view" */ val SCREEN_VIEW: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.SCREEN_VIEW with String = js.native
  /* "search" */ val SEARCH: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.SEARCH with String = js.native
  /* "select_content" */ val SELECT_CONTENT: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.SELECT_CONTENT with String = js.native
  /* "set_checkout_option" */ val SET_CHECKOUT_OPTION: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.SET_CHECKOUT_OPTION with String = js.native
  /* "share" */ val SHARE: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.SHARE with String = js.native
  /* "sign_up" */ val SIGN_UP: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.SIGN_UP with String = js.native
  /* "timing_complete" */ val TIMING_COMPLETE: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.TIMING_COMPLETE with String = js.native
  /* "view_item" */ val VIEW_ITEM: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.VIEW_ITEM with String = js.native
  /* "view_item_list" */ val VIEW_ITEM_LIST: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.VIEW_ITEM_LIST with String = js.native
  /* "view_promotion" */ val VIEW_PROMOTION: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.VIEW_PROMOTION with String = js.native
  /* "view_search_results" */ val VIEW_SEARCH_RESULTS: typings.atFirebaseAnalytics.distSrcConstantsMod.EventName.VIEW_SEARCH_RESULTS with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventName with String] = js.native
}

