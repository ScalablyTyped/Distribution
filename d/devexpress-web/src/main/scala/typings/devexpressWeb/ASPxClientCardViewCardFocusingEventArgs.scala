package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.CardFocusing event.
  */
trait ASPxClientCardViewCardFocusingEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Provides access to the parameters associated with the ASPxClientCardView.CardFocusing event.
    */
  var htmlEvent: js.Any
  
  /**
    * Gets the card visible index.
    */
  var visibleIndex: Double
}
object ASPxClientCardViewCardFocusingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, visibleIndex: Double): ASPxClientCardViewCardFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCardFocusingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientCardViewCardFocusingEventArgsMutableBuilder[Self <: ASPxClientCardViewCardFocusingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
