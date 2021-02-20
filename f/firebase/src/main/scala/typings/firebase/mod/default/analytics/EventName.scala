package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventName extends StObject
@JSImport("firebase", "default.analytics.EventName")
@js.native
object EventName extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventName with String] = js.native
  
  @js.native
  sealed trait ADD_PAYMENT_INFO extends EventName
  /* "add_payment_info" */ val ADD_PAYMENT_INFO: typings.firebase.mod.default.analytics.EventName.ADD_PAYMENT_INFO with String = js.native
  
  @js.native
  sealed trait ADD_SHIPPING_INFO extends EventName
  /* "add_shipping_info" */ val ADD_SHIPPING_INFO: typings.firebase.mod.default.analytics.EventName.ADD_SHIPPING_INFO with String = js.native
  
  @js.native
  sealed trait ADD_TO_CART extends EventName
  /* "add_to_cart" */ val ADD_TO_CART: typings.firebase.mod.default.analytics.EventName.ADD_TO_CART with String = js.native
  
  @js.native
  sealed trait ADD_TO_WISHLIST extends EventName
  /* "add_to_wishlist" */ val ADD_TO_WISHLIST: typings.firebase.mod.default.analytics.EventName.ADD_TO_WISHLIST with String = js.native
  
  @js.native
  sealed trait BEGIN_CHECKOUT extends EventName
  /* "begin_checkout" */ val BEGIN_CHECKOUT: typings.firebase.mod.default.analytics.EventName.BEGIN_CHECKOUT with String = js.native
  
  /** @deprecated */
  @js.native
  sealed trait CHECKOUT_PROGRESS extends EventName
  /* "checkout_progress" */ val CHECKOUT_PROGRESS: typings.firebase.mod.default.analytics.EventName.CHECKOUT_PROGRESS with String = js.native
  
  @js.native
  sealed trait EXCEPTION extends EventName
  /* "exception" */ val EXCEPTION: typings.firebase.mod.default.analytics.EventName.EXCEPTION with String = js.native
  
  @js.native
  sealed trait GENERATE_LEAD extends EventName
  /* "generate_lead" */ val GENERATE_LEAD: typings.firebase.mod.default.analytics.EventName.GENERATE_LEAD with String = js.native
  
  @js.native
  sealed trait LOGIN extends EventName
  /* "login" */ val LOGIN: typings.firebase.mod.default.analytics.EventName.LOGIN with String = js.native
  
  @js.native
  sealed trait PAGE_VIEW extends EventName
  /* "page_view" */ val PAGE_VIEW: typings.firebase.mod.default.analytics.EventName.PAGE_VIEW with String = js.native
  
  @js.native
  sealed trait PURCHASE extends EventName
  /* "purchase" */ val PURCHASE: typings.firebase.mod.default.analytics.EventName.PURCHASE with String = js.native
  
  @js.native
  sealed trait REFUND extends EventName
  /* "refund" */ val REFUND: typings.firebase.mod.default.analytics.EventName.REFUND with String = js.native
  
  @js.native
  sealed trait REMOVE_FROM_CART extends EventName
  /* "remove_from_cart" */ val REMOVE_FROM_CART: typings.firebase.mod.default.analytics.EventName.REMOVE_FROM_CART with String = js.native
  
  @js.native
  sealed trait SCREEN_VIEW extends EventName
  /* "screen_view" */ val SCREEN_VIEW: typings.firebase.mod.default.analytics.EventName.SCREEN_VIEW with String = js.native
  
  @js.native
  sealed trait SEARCH extends EventName
  /* "search" */ val SEARCH: typings.firebase.mod.default.analytics.EventName.SEARCH with String = js.native
  
  @js.native
  sealed trait SELECT_CONTENT extends EventName
  /* "select_content" */ val SELECT_CONTENT: typings.firebase.mod.default.analytics.EventName.SELECT_CONTENT with String = js.native
  
  @js.native
  sealed trait SELECT_ITEM extends EventName
  /* "select_item" */ val SELECT_ITEM: typings.firebase.mod.default.analytics.EventName.SELECT_ITEM with String = js.native
  
  @js.native
  sealed trait SELECT_PROMOTION extends EventName
  /* "select_promotion" */ val SELECT_PROMOTION: typings.firebase.mod.default.analytics.EventName.SELECT_PROMOTION with String = js.native
  
  /** @deprecated */
  @js.native
  sealed trait SET_CHECKOUT_OPTION extends EventName
  /* "set_checkout_option" */ val SET_CHECKOUT_OPTION: typings.firebase.mod.default.analytics.EventName.SET_CHECKOUT_OPTION with String = js.native
  
  @js.native
  sealed trait SHARE extends EventName
  /* "share" */ val SHARE: typings.firebase.mod.default.analytics.EventName.SHARE with String = js.native
  
  @js.native
  sealed trait SIGN_UP extends EventName
  /* "sign_up" */ val SIGN_UP: typings.firebase.mod.default.analytics.EventName.SIGN_UP with String = js.native
  
  @js.native
  sealed trait TIMING_COMPLETE extends EventName
  /* "timing_complete" */ val TIMING_COMPLETE: typings.firebase.mod.default.analytics.EventName.TIMING_COMPLETE with String = js.native
  
  @js.native
  sealed trait VIEW_CART extends EventName
  /* "view_cart" */ val VIEW_CART: typings.firebase.mod.default.analytics.EventName.VIEW_CART with String = js.native
  
  @js.native
  sealed trait VIEW_ITEM extends EventName
  /* "view_item" */ val VIEW_ITEM: typings.firebase.mod.default.analytics.EventName.VIEW_ITEM with String = js.native
  
  @js.native
  sealed trait VIEW_ITEM_LIST extends EventName
  /* "view_item_list" */ val VIEW_ITEM_LIST: typings.firebase.mod.default.analytics.EventName.VIEW_ITEM_LIST with String = js.native
  
  @js.native
  sealed trait VIEW_PROMOTION extends EventName
  /* "view_promotion" */ val VIEW_PROMOTION: typings.firebase.mod.default.analytics.EventName.VIEW_PROMOTION with String = js.native
  
  @js.native
  sealed trait VIEW_SEARCH_RESULTS extends EventName
  /* "view_search_results" */ val VIEW_SEARCH_RESULTS: typings.firebase.mod.default.analytics.EventName.VIEW_SEARCH_RESULTS with String = js.native
}
