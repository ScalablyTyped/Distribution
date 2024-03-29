package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A client-side counterpart of the FilterControl extension.
  */
trait MVCxClientFilterControl
  extends StObject
     with ASPxClientFilterControl {
  
  /**
    * Returns the filter control's state.
    * @param obj An object that receives a filter control's callback parameters.
    */
  def FillStateObject(obj: Any): Unit
}
object MVCxClientFilterControl {
  
  inline def apply(
    AdjustControl: () => Unit,
    Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]],
    Apply: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]],
    FillStateObject: Any => Unit,
    GetAppliedFilterExpression: () => String,
    GetClientVisible: () => Boolean,
    GetEditor: (Double, Double) => ASPxClientEditBase,
    GetFilterExpression: () => String,
    GetHeight: () => Double,
    GetMainElement: () => Any,
    GetParentControl: () => Any,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsFilterExpressionValid: () => Boolean,
    Reset: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetHeight: Double => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    name: String
  ): MVCxClientFilterControl = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Applied = Applied.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], FillStateObject = js.Any.fromFunction1(FillStateObject), GetAppliedFilterExpression = js.Any.fromFunction0(GetAppliedFilterExpression), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEditor = js.Any.fromFunction2(GetEditor), GetFilterExpression = js.Any.fromFunction0(GetFilterExpression), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsFilterExpressionValid = js.Any.fromFunction0(IsFilterExpressionValid), Reset = js.Any.fromFunction0(Reset), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientFilterControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MVCxClientFilterControl] (val x: Self) extends AnyVal {
    
    inline def setFillStateObject(value: Any => Unit): Self = StObject.set(x, "FillStateObject", js.Any.fromFunction1(value))
  }
}
