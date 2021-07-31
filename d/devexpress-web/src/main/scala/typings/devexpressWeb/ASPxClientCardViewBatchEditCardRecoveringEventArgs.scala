package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.BatchEditCardRecovering event.
  */
trait ASPxClientCardViewBatchEditCardRecoveringEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Gets a hashtable that maintains information about recovered cells.
    */
  var cardValues: js.Any
  
  /**
    * Gets the visible index of the card whose cells has been recovered.
    */
  var visibleIndex: Double
}
object ASPxClientCardViewBatchEditCardRecoveringEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, cardValues: js.Any, visibleIndex: Double): ASPxClientCardViewBatchEditCardRecoveringEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], cardValues = cardValues.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewBatchEditCardRecoveringEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewBatchEditCardRecoveringEventArgsMutableBuilder[Self <: ASPxClientCardViewBatchEditCardRecoveringEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardValues(value: js.Any): Self = StObject.set(x, "cardValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
