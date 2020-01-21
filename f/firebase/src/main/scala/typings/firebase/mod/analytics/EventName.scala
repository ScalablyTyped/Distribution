package typings.firebase.mod.analytics

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventName extends js.Object

@JSImport("firebase", "analytics.EventName")
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventName with String] = js.native
  /* "add_payment_info" */ @js.native
  object ADD_PAYMENT_INFO extends TopLevel[ADD_PAYMENT_INFO with String]
  
  /* "add_to_cart" */ @js.native
  object ADD_TO_CART extends TopLevel[ADD_TO_CART with String]
  
  /* "add_to_wishlist" */ @js.native
  object ADD_TO_WISHLIST extends TopLevel[ADD_TO_WISHLIST with String]
  
  /* "begin_checkout" */ @js.native
  object BEGIN_CHECKOUT extends TopLevel[BEGIN_CHECKOUT with String]
  
  /* "checkout_progress" */ @js.native
  object CHECKOUT_PROGRESS extends TopLevel[CHECKOUT_PROGRESS with String]
  
  /* "exception" */ @js.native
  object EXCEPTION extends TopLevel[EXCEPTION with String]
  
  /* "generate_lead" */ @js.native
  object GENERATE_LEAD extends TopLevel[GENERATE_LEAD with String]
  
  /* "login" */ @js.native
  object LOGIN extends TopLevel[LOGIN with String]
  
  /* "page_view" */ @js.native
  object PAGE_VIEW extends TopLevel[PAGE_VIEW with String]
  
  /* "purchase" */ @js.native
  object PURCHASE extends TopLevel[PURCHASE with String]
  
  /* "refund" */ @js.native
  object REFUND extends TopLevel[REFUND with String]
  
  /* "remove_from_cart" */ @js.native
  object REMOVE_FROM_CART extends TopLevel[REMOVE_FROM_CART with String]
  
  /* "screen_view" */ @js.native
  object SCREEN_VIEW extends TopLevel[SCREEN_VIEW with String]
  
  /* "search" */ @js.native
  object SEARCH extends TopLevel[SEARCH with String]
  
  /* "select_content" */ @js.native
  object SELECT_CONTENT extends TopLevel[SELECT_CONTENT with String]
  
  /* "set_checkout_option" */ @js.native
  object SET_CHECKOUT_OPTION extends TopLevel[SET_CHECKOUT_OPTION with String]
  
  /* "share" */ @js.native
  object SHARE extends TopLevel[SHARE with String]
  
  /* "sign_up" */ @js.native
  object SIGN_UP extends TopLevel[SIGN_UP with String]
  
  /* "timing_complete" */ @js.native
  object TIMING_COMPLETE extends TopLevel[TIMING_COMPLETE with String]
  
  /* "view_item" */ @js.native
  object VIEW_ITEM extends TopLevel[VIEW_ITEM with String]
  
  /* "view_item_list" */ @js.native
  object VIEW_ITEM_LIST extends TopLevel[VIEW_ITEM_LIST with String]
  
  /* "view_promotion" */ @js.native
  object VIEW_PROMOTION extends TopLevel[VIEW_PROMOTION with String]
  
  /* "view_search_results" */ @js.native
  object VIEW_SEARCH_RESULTS extends TopLevel[VIEW_SEARCH_RESULTS with String]
  
}

