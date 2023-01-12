package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewBatchEditCardDeletingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val cardValues: Any
  
  val visibleIndex: Double
}
object CardViewBatchEditCardDeletingEventArgs {
  
  inline def apply(cancel: Boolean, cardValues: Any, sender: Control, visibleIndex: Double): CardViewBatchEditCardDeletingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditCardDeletingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CardViewBatchEditCardDeletingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCardValues(value: Any): Self = StObject.set(x, "cardValues", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
