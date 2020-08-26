package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the FilterControl extension.
  */
@js.native
trait MVCxClientFilterControl extends ASPxClientFilterControl {
  /**
    * Returns the filter control's state.
    * @param obj An object that receives a filter control's callback parameters.
    */
  def FillStateObject(obj: js.Any): Unit = js.native
}

object MVCxClientFilterControl {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]],
    Apply: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]],
    FillStateObject: js.Any => Unit,
    GetAppliedFilterExpression: () => String,
    GetClientVisible: () => Boolean,
    GetEditor: Double => ASPxClientEditBase,
    GetFilterExpression: () => String,
    GetHeight: () => Double,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
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
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Applied = Applied.asInstanceOf[js.Any], Apply = js.Any.fromFunction0(Apply), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], EndCallback = EndCallback.asInstanceOf[js.Any], FillStateObject = js.Any.fromFunction1(FillStateObject), GetAppliedFilterExpression = js.Any.fromFunction0(GetAppliedFilterExpression), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEditor = js.Any.fromFunction1(GetEditor), GetFilterExpression = js.Any.fromFunction0(GetFilterExpression), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsFilterExpressionValid = js.Any.fromFunction0(IsFilterExpressionValid), Reset = js.Any.fromFunction0(Reset), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVCxClientFilterControl]
  }
  @scala.inline
  implicit class MVCxClientFilterControlOps[Self <: MVCxClientFilterControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFillStateObject(value: js.Any => Unit): Self = this.set("FillStateObject", js.Any.fromFunction1(value))
  }
  
}

