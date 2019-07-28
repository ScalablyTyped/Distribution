package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client ASPxFilterControl.
  */
trait ASPxClientFilterControl extends ASPxClientControl {
  /**
    * Occurs after a new filter expression has been applied.
    */
  var Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]]
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientFilterControl.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]]
  /**
    * Applies a filter constructed by an end-user.
    */
  def Apply(): Unit
  /**
    * Returns the applied filter expression.
    */
  def GetAppliedFilterExpression(): String
  /**
    * Returns the editor used to edit operand values for the specified filter column.
    * @param editorIndex An integer value that identifies the filter column by its index within the collection.
    */
  def GetEditor(editorIndex: Double): ASPxClientEditBase
  /**
    * Returns the filter expression.
    */
  def GetFilterExpression(): String
  /**
    * Returns a value indicating whether the filter expression being currently composed on the client side is valid - all expression conditions are filled.
    */
  def IsFilterExpressionValid(): Boolean
  /**
    * Resets the current filter expression to a previously applied filter expression.
    */
  def Reset(): Unit
}

object ASPxClientFilterControl {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]],
    Apply: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]],
    GetAppliedFilterExpression: () => String,
    GetClientVisible: () => Boolean,
    GetEditor: Double => ASPxClientEditBase,
    GetFilterExpression: () => String,
    GetHeight: () => Double,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
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
  ): ASPxClientFilterControl = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), Applied = Applied, Apply = js.Any.fromFunction0(Apply), BeginCallback = BeginCallback, CallbackError = CallbackError, EndCallback = EndCallback, GetAppliedFilterExpression = js.Any.fromFunction0(GetAppliedFilterExpression), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEditor = js.Any.fromFunction1(GetEditor), GetFilterExpression = js.Any.fromFunction0(GetFilterExpression), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, IsFilterExpressionValid = js.Any.fromFunction0(IsFilterExpressionValid), Reset = js.Any.fromFunction0(Reset), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetHeight = js.Any.fromFunction1(SetHeight), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientFilterControl]
  }
}

