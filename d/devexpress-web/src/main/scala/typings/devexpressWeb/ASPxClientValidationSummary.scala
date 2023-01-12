package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxValidationSummary control.
  */
trait ASPxClientValidationSummary
  extends StObject
     with ASPxClientControl {
  
  /**
    * Occurs on the client side when the validation summary's visibility is changed.
    */
  var VisibilityChanged: ASPxClientEvent[
    ASPxClientValidationSummaryVisibilityChangedEventHandler[ASPxClientValidationSummary]
  ]
}
object ASPxClientValidationSummary {
  
  inline def apply(
    AdjustControl: () => Unit,
    GetClientVisible: () => Boolean,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    VisibilityChanged: ASPxClientEvent[
      ASPxClientValidationSummaryVisibilityChangedEventHandler[ASPxClientValidationSummary]
    ],
    name: String
  ): ASPxClientValidationSummary = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), VisibilityChanged = VisibilityChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientValidationSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientValidationSummary] (val x: Self) extends AnyVal {
    
    inline def setVisibilityChanged(
      value: ASPxClientEvent[
          ASPxClientValidationSummaryVisibilityChangedEventHandler[ASPxClientValidationSummary]
        ]
    ): Self = StObject.set(x, "VisibilityChanged", value.asInstanceOf[js.Any])
  }
}
