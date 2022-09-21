package typings.firebase.firebaseMod.firebase.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventName extends StObject
@JSImport("firebase/compat", "firebase.analytics.EventName")
@js.native
object EventName extends StObject {
  
  @js.native
  sealed trait ADD_PAYMENT_INFO
    extends StObject
       with EventName
  
  @js.native
  sealed trait ADD_SHIPPING_INFO
    extends StObject
       with EventName
  
  @js.native
  sealed trait ADD_TO_CART
    extends StObject
       with EventName
  
  @js.native
  sealed trait ADD_TO_WISHLIST
    extends StObject
       with EventName
  
  @js.native
  sealed trait BEGIN_CHECKOUT
    extends StObject
       with EventName
  
  /** @deprecated */
  @js.native
  sealed trait CHECKOUT_PROGRESS
    extends StObject
       with EventName
  
  @js.native
  sealed trait EXCEPTION
    extends StObject
       with EventName
  
  @js.native
  sealed trait GENERATE_LEAD
    extends StObject
       with EventName
  
  @js.native
  sealed trait LOGIN
    extends StObject
       with EventName
  
  @js.native
  sealed trait PAGE_VIEW
    extends StObject
       with EventName
  
  @js.native
  sealed trait PURCHASE
    extends StObject
       with EventName
  
  @js.native
  sealed trait REFUND
    extends StObject
       with EventName
  
  @js.native
  sealed trait REMOVE_FROM_CART
    extends StObject
       with EventName
  
  @js.native
  sealed trait SCREEN_VIEW
    extends StObject
       with EventName
  
  @js.native
  sealed trait SEARCH
    extends StObject
       with EventName
  
  @js.native
  sealed trait SELECT_CONTENT
    extends StObject
       with EventName
  
  @js.native
  sealed trait SELECT_ITEM
    extends StObject
       with EventName
  
  @js.native
  sealed trait SELECT_PROMOTION
    extends StObject
       with EventName
  
  /** @deprecated */
  @js.native
  sealed trait SET_CHECKOUT_OPTION
    extends StObject
       with EventName
  
  @js.native
  sealed trait SHARE
    extends StObject
       with EventName
  
  @js.native
  sealed trait SIGN_UP
    extends StObject
       with EventName
  
  @js.native
  sealed trait TIMING_COMPLETE
    extends StObject
       with EventName
  
  @js.native
  sealed trait VIEW_CART
    extends StObject
       with EventName
  
  @js.native
  sealed trait VIEW_ITEM
    extends StObject
       with EventName
  
  @js.native
  sealed trait VIEW_ITEM_LIST
    extends StObject
       with EventName
  
  @js.native
  sealed trait VIEW_PROMOTION
    extends StObject
       with EventName
  
  @js.native
  sealed trait VIEW_SEARCH_RESULTS
    extends StObject
       with EventName
}
