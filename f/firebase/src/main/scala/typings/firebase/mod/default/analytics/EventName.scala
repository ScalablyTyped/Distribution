package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventName extends js.Object
@JSImport("firebase", "analytics.EventName")
@js.native
object EventName extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventName with String] = js.native
  
  @js.native
  sealed trait ADD_PAYMENT_INFO extends EventName
  /* "add_payment_info" */ @js.native
  object ADD_PAYMENT_INFO extends TopLevel[ADD_PAYMENT_INFO with String]
  
  @js.native
  sealed trait ADD_SHIPPING_INFO extends EventName
  /* "add_shipping_info" */ @js.native
  object ADD_SHIPPING_INFO extends TopLevel[ADD_SHIPPING_INFO with String]
  
  @js.native
  sealed trait ADD_TO_CART extends EventName
  /* "add_to_cart" */ @js.native
  object ADD_TO_CART extends TopLevel[ADD_TO_CART with String]
  
  @js.native
  sealed trait ADD_TO_WISHLIST extends EventName
  /* "add_to_wishlist" */ @js.native
  object ADD_TO_WISHLIST extends TopLevel[ADD_TO_WISHLIST with String]
  
  @js.native
  sealed trait BEGIN_CHECKOUT extends EventName
  /* "begin_checkout" */ @js.native
  object BEGIN_CHECKOUT extends TopLevel[BEGIN_CHECKOUT with String]
  
  /** @deprecated */
  @js.native
  sealed trait CHECKOUT_PROGRESS extends EventName
  /* "checkout_progress" */ @js.native
  object CHECKOUT_PROGRESS extends TopLevel[CHECKOUT_PROGRESS with String]
  
  @js.native
  sealed trait EXCEPTION extends EventName
  /* "exception" */ @js.native
  object EXCEPTION extends TopLevel[EXCEPTION with String]
  
  @js.native
  sealed trait GENERATE_LEAD extends EventName
  /* "generate_lead" */ @js.native
  object GENERATE_LEAD extends TopLevel[GENERATE_LEAD with String]
  
  @js.native
  sealed trait LOGIN extends EventName
  /* "login" */ @js.native
  object LOGIN extends TopLevel[LOGIN with String]
  
  @js.native
  sealed trait PAGE_VIEW extends EventName
  /* "page_view" */ @js.native
  object PAGE_VIEW extends TopLevel[PAGE_VIEW with String]
  
  @js.native
  sealed trait PURCHASE extends EventName
  /* "purchase" */ @js.native
  object PURCHASE extends TopLevel[PURCHASE with String]
  
  @js.native
  sealed trait REFUND extends EventName
  /* "refund" */ @js.native
  object REFUND extends TopLevel[REFUND with String]
  
  @js.native
  sealed trait REMOVE_FROM_CART extends EventName
  /* "remove_from_cart" */ @js.native
  object REMOVE_FROM_CART extends TopLevel[REMOVE_FROM_CART with String]
  
  @js.native
  sealed trait SCREEN_VIEW extends EventName
  /* "screen_view" */ @js.native
  object SCREEN_VIEW extends TopLevel[SCREEN_VIEW with String]
  
  @js.native
  sealed trait SEARCH extends EventName
  /* "search" */ @js.native
  object SEARCH extends TopLevel[SEARCH with String]
  
  @js.native
  sealed trait SELECT_CONTENT extends EventName
  /* "select_content" */ @js.native
  object SELECT_CONTENT extends TopLevel[SELECT_CONTENT with String]
  
  @js.native
  sealed trait SELECT_ITEM extends EventName
  /* "select_item" */ @js.native
  object SELECT_ITEM extends TopLevel[SELECT_ITEM with String]
  
  @js.native
  sealed trait SELECT_PROMOTION extends EventName
  /* "select_promotion" */ @js.native
  object SELECT_PROMOTION extends TopLevel[SELECT_PROMOTION with String]
  
  /** @deprecated */
  @js.native
  sealed trait SET_CHECKOUT_OPTION extends EventName
  /* "set_checkout_option" */ @js.native
  object SET_CHECKOUT_OPTION extends TopLevel[SET_CHECKOUT_OPTION with String]
  
  @js.native
  sealed trait SHARE extends EventName
  /* "share" */ @js.native
  object SHARE extends TopLevel[SHARE with String]
  
  @js.native
  sealed trait SIGN_UP extends EventName
  /* "sign_up" */ @js.native
  object SIGN_UP extends TopLevel[SIGN_UP with String]
  
  @js.native
  sealed trait TIMING_COMPLETE extends EventName
  /* "timing_complete" */ @js.native
  object TIMING_COMPLETE extends TopLevel[TIMING_COMPLETE with String]
  
  @js.native
  sealed trait VIEW_CART extends EventName
  /* "view_cart" */ @js.native
  object VIEW_CART extends TopLevel[VIEW_CART with String]
  
  @js.native
  sealed trait VIEW_ITEM extends EventName
  /* "view_item" */ @js.native
  object VIEW_ITEM extends TopLevel[VIEW_ITEM with String]
  
  @js.native
  sealed trait VIEW_ITEM_LIST extends EventName
  /* "view_item_list" */ @js.native
  object VIEW_ITEM_LIST extends TopLevel[VIEW_ITEM_LIST with String]
  
  @js.native
  sealed trait VIEW_PROMOTION extends EventName
  /* "view_promotion" */ @js.native
  object VIEW_PROMOTION extends TopLevel[VIEW_PROMOTION with String]
  
  @js.native
  sealed trait VIEW_SEARCH_RESULTS extends EventName
  /* "view_search_results" */ @js.native
  object VIEW_SEARCH_RESULTS extends TopLevel[VIEW_SEARCH_RESULTS with String]
}
