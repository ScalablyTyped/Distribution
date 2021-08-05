package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewCardFocusingEventArgs
  extends StObject
     with CancelEventArgs {
  
  val htmlEvent: js.Any
  
  val visibleIndex: Double
}
object CardViewCardFocusingEventArgs {
  
  inline def apply(cancel: Boolean, htmlEvent: js.Any, sender: Control, visibleIndex: Double): CardViewCardFocusingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewCardFocusingEventArgs]
  }
  
  extension [Self <: CardViewCardFocusingEventArgs](x: Self) {
    
    inline def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
