package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardViewCardClickEventArgs
  extends StObject
     with CancelEventArgs {
  
  val htmlEvent: js.Any
  
  val visibleIndex: Double
}
object CardViewCardClickEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, htmlEvent: js.Any, sender: Control, visibleIndex: Double): CardViewCardClickEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], htmlEvent = htmlEvent.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], visibleIndex = visibleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardViewCardClickEventArgs]
  }
  
  @scala.inline
  implicit class CardViewCardClickEventArgsMutableBuilder[Self <: CardViewCardClickEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHtmlEvent(value: js.Any): Self = StObject.set(x, "htmlEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
  }
}
