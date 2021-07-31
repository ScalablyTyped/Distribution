package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewBatchEditEndEditingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val cardValues: js.Any
  
  val visibleIndex: Double
}
object CardViewBatchEditEndEditingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Any, sender: Control, visibleIndex: Double): CardViewBatchEditEndEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewBatchEditEndEditingEventArgs]
  }
  
  @scala.inline
  implicit class CardViewBatchEditEndEditingEventArgsMutableBuilder[Self <: CardViewBatchEditEndEditingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardValues(value: js.Any): Self = StObject.set(x, "cardValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
