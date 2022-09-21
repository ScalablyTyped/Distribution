package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientCardView.CardClick event.
  */
trait ASPxClientCardViewCardClickEventArgs
  extends StObject
     with ASPxClientCancelEventArgs {
  
  /**
    * Provides access to the parameters associated with the ASPxClientCardView.CardClick event.
    */
  var htmlEvent: Any
  
  /**
    * Gets the processed card's visible index.
    */
  var visibleIndex: Double
}
object ASPxClientCardViewCardClickEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: Any, visibleIndex: Double): ASPxClientCardViewCardClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCardViewCardClickEventArgs]
  }
  
  extension [Self <: ASPxClientCardViewCardClickEventArgs](x: Self) {
    
    inline def setHtmlEvent(value: Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
