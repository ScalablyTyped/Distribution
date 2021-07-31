package typings.firebase.mod.default.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventName extends StObject
@JSImport("firebase", "default.analytics.EventName")
@js.native
object EventName extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[EventName & String] = js.native
  
  @js.native
  sealed trait ADD_PAYMENT_INFO
    extends StObject
       with EventName
  /* "add_payment_info" */ val ADD_PAYMENT_INFO: typings.firebase.mod.default.analytics.EventName.ADD_PAYMENT_INFO & String = js.native
  
  @js.native
  sealed trait ADD_SHIPPING_INFO
    extends StObject
       with EventName
  /* "add_shipping_info" */ val ADD_SHIPPING_INFO: typings.firebase.mod.default.analytics.EventName.ADD_SHIPPING_INFO & String = js.native
  
  @js.native
  sealed trait ADD_TO_CART
    extends StObject
       with EventName
  /* "add_to_cart" */ val ADD_TO_CART: typings.firebase.mod.default.analytics.EventName.ADD_TO_CART & String = js.native
  
  @js.native
  sealed trait ADD_TO_WISHLIST
    extends StObject
       with EventName
  /* "add_to_wishlist" */ val ADD_TO_WISHLIST: typings.firebase.mod.default.analytics.EventName.ADD_TO_WISHLIST & String = js.native
  
  @js.native
  sealed trait BEGIN_CHECKOUT
    extends StObject
       with EventName
  /* "begin_checkout" */ val BEGIN_CHECKOUT: typings.firebase.mod.default.analytics.EventName.BEGIN_CHECKOUT & String = js.native
  
  /** @deprecated */
  @js.native
  sealed trait CHECKOUT_PROGRESS
    extends StObject
       with EventName
  /* "checkout_progress" */ val CHECKOUT_PROGRESS: typings.firebase.mod.default.analytics.EventName.CHECKOUT_PROGRESS & String = js.native
  
  @js.native
  sealed trait EXCEPTION
    extends StObject
       with EventName
  /* "exception" */ val EXCEPTION: typings.firebase.mod.default.analytics.EventName.EXCEPTION & String = js.native
  
  @js.native
  sealed trait GENERATE_LEAD
    extends StObject
       with EventName
  /* "generate_lead" */ val GENERATE_LEAD: typings.firebase.mod.default.analytics.EventName.GENERATE_LEAD & String = js.native
  
  @js.native
  sealed trait LOGIN
    extends StObject
       with EventName
  /* "login" */ val LOGIN: typings.firebase.mod.default.analytics.EventName.LOGIN & String = js.native
  
  @js.native
  sealed trait PAGE_VIEW
    extends StObject
       with EventName
  /* "page_view" */ val PAGE_VIEW: typings.firebase.mod.default.analytics.EventName.PAGE_VIEW & String = js.native
  
  @js.native
  sealed trait PURCHASE
    extends StObject
       with EventName
  /* "purchase" */ val PURCHASE: typings.firebase.mod.default.analytics.EventName.PURCHASE & String = js.native
  
  @js.native
  sealed trait REFUND
    extends StObject
       with EventName
  /* "refund" */ val REFUND: typings.firebase.mod.default.analytics.EventName.REFUND & String = js.native
  
  @js.native
  sealed trait REMOVE_FROM_CART
    extends StObject
       with EventName
  /* "remove_from_cart" */ val REMOVE_FROM_CART: typings.firebase.mod.default.analytics.EventName.REMOVE_FROM_CART & String = js.native
  
  @js.native
  sealed trait SCREEN_VIEW
    extends StObject
       with EventName
  /* "screen_view" */ val SCREEN_VIEW: typings.firebase.mod.default.analytics.EventName.SCREEN_VIEW & String = js.native
  
  @js.native
  sealed trait SEARCH
    extends StObject
       with EventName
  /* "search" */ val SEARCH: typings.firebase.mod.default.analytics.EventName.SEARCH & String = js.native
  
  @js.native
  sealed trait SELECT_CONTENT
    extends StObject
       with EventName
  /* "select_content" */ val SELECT_CONTENT: typings.firebase.mod.default.analytics.EventName.SELECT_CONTENT & String = js.native
  
  @js.native
  sealed trait SELECT_ITEM
    extends StObject
       with EventName
  /* "select_item" */ val SELECT_ITEM: typings.firebase.mod.default.analytics.EventName.SELECT_ITEM & String = js.native
  
  @js.native
  sealed trait SELECT_PROMOTION
    extends StObject
       with EventName
  /* "select_promotion" */ val SELECT_PROMOTION: typings.firebase.mod.default.analytics.EventName.SELECT_PROMOTION & String = js.native
  
  /** @deprecated */
  @js.native
  sealed trait SET_CHECKOUT_OPTION
    extends StObject
       with EventName
  /* "set_checkout_option" */ val SET_CHECKOUT_OPTION: typings.firebase.mod.default.analytics.EventName.SET_CHECKOUT_OPTION & String = js.native
  
  @js.native
  sealed trait SHARE
    extends StObject
       with EventName
  /* "share" */ val SHARE: typings.firebase.mod.default.analytics.EventName.SHARE & String = js.native
  
  @js.native
  sealed trait SIGN_UP
    extends StObject
       with EventName
  /* "sign_up" */ val SIGN_UP: typings.firebase.mod.default.analytics.EventName.SIGN_UP & String = js.native
  
  @js.native
  sealed trait TIMING_COMPLETE
    extends StObject
       with EventName
  /* "timing_complete" */ val TIMING_COMPLETE: typings.firebase.mod.default.analytics.EventName.TIMING_COMPLETE & String = js.native
  
  @js.native
  sealed trait VIEW_CART
    extends StObject
       with EventName
  /* "view_cart" */ val VIEW_CART: typings.firebase.mod.default.analytics.EventName.VIEW_CART & String = js.native
  
  @js.native
  sealed trait VIEW_ITEM
    extends StObject
       with EventName
  /* "view_item" */ val VIEW_ITEM: typings.firebase.mod.default.analytics.EventName.VIEW_ITEM & String = js.native
  
  @js.native
  sealed trait VIEW_ITEM_LIST
    extends StObject
       with EventName
  /* "view_item_list" */ val VIEW_ITEM_LIST: typings.firebase.mod.default.analytics.EventName.VIEW_ITEM_LIST & String = js.native
  
  @js.native
  sealed trait VIEW_PROMOTION
    extends StObject
       with EventName
  /* "view_promotion" */ val VIEW_PROMOTION: typings.firebase.mod.default.analytics.EventName.VIEW_PROMOTION & String = js.native
  
  @js.native
  sealed trait VIEW_SEARCH_RESULTS
    extends StObject
       with EventName
  /* "view_search_results" */ val VIEW_SEARCH_RESULTS: typings.firebase.mod.default.analytics.EventName.VIEW_SEARCH_RESULTS & String = js.native
}
