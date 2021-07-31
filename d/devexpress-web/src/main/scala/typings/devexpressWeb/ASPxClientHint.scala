package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxHint control.
  */
trait ASPxClientHint
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs on the client side when a hint is about to be hidden.
    */
  var Hiding: ASPxClientEvent[ASPxClientHintHidingEventHandler]
  
  /**
    * Occurs on the client side when a hint is about to be shown.
    */
  var Showing: ASPxClientEvent[ASPxClientHintShowingEventHandler]
}
object ASPxClientHint {
  
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    Hiding: ASPxClientEvent[ASPxClientHintHidingEventHandler],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Showing: ASPxClientEvent[ASPxClientHintShowingEventHandler],
    name: String
  ): ASPxClientHint = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), Hiding = Hiding.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Showing = Showing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHint]
  }
  
  @scala.inline
  implicit class ASPxClientHintMutableBuilder[Self <: ASPxClientHint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHiding(value: ASPxClientEvent[ASPxClientHintHidingEventHandler]): Self = StObject.set(x, "Hiding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowing(value: ASPxClientEvent[ASPxClientHintShowingEventHandler]): Self = StObject.set(x, "Showing", value.asInstanceOf[js.Any])
  }
}
