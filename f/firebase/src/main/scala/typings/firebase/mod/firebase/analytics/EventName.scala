package typings.firebase.mod.firebase.analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventName extends StObject
@JSImport("firebase", "firebase.analytics.EventName")
@js.native
object EventName extends StObject {
  
  @js.native
  sealed trait ADD_PAYMENT_INFO extends EventName
  
  @js.native
  sealed trait ADD_SHIPPING_INFO extends EventName
  
  @js.native
  sealed trait ADD_TO_CART extends EventName
  
  @js.native
  sealed trait ADD_TO_WISHLIST extends EventName
  
  @js.native
  sealed trait BEGIN_CHECKOUT extends EventName
  
  /** @deprecated */
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
  sealed trait SELECT_ITEM extends EventName
  
  @js.native
  sealed trait SELECT_PROMOTION extends EventName
  
  /** @deprecated */
  @js.native
  sealed trait SET_CHECKOUT_OPTION extends EventName
  
  @js.native
  sealed trait SHARE extends EventName
  
  @js.native
  sealed trait SIGN_UP extends EventName
  
  @js.native
  sealed trait TIMING_COMPLETE extends EventName
  
  @js.native
  sealed trait VIEW_CART extends EventName
  
  @js.native
  sealed trait VIEW_ITEM extends EventName
  
  @js.native
  sealed trait VIEW_ITEM_LIST extends EventName
  
  @js.native
  sealed trait VIEW_PROMOTION extends EventName
  
  @js.native
  sealed trait VIEW_SEARCH_RESULTS extends EventName
}
