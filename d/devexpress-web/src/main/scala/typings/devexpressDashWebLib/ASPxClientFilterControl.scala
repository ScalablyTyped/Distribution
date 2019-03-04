package typings
package devexpressDashWebLib

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
  def Apply(): scala.Unit
  /**
    * Returns the applied filter expression.
    */
  def GetAppliedFilterExpression(): java.lang.String
  /**
    * Returns the editor used to edit operand values for the specified filter column.
    * @param editorIndex An integer value that identifies the filter column by its index within the collection.
    */
  def GetEditor(editorIndex: scala.Double): ASPxClientEditBase
  /**
    * Returns the filter expression.
    */
  def GetFilterExpression(): java.lang.String
  /**
    * Returns a value indicating whether the filter expression being currently composed on the client side is valid - all expression conditions are filled.
    */
  def IsFilterExpressionValid(): scala.Boolean
  /**
    * Resets the current filter expression to a previously applied filter expression.
    */
  def Reset(): scala.Unit
}

object ASPxClientFilterControl {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    Applied: ASPxClientEvent[ASPxClientFilterAppliedEventHandler[ASPxClientFilterControl]],
    Apply: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientFilterControl]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientFilterControl]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientFilterControl]],
    GetAppliedFilterExpression: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEditor: js.Function1[scala.Double, ASPxClientEditBase],
    GetFilterExpression: js.Function0[java.lang.String],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsFilterExpressionValid: js.Function0[scala.Boolean],
    Reset: js.Function0[scala.Unit],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientFilterControl = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, Applied = Applied, Apply = Apply, BeginCallback = BeginCallback, CallbackError = CallbackError, EndCallback = EndCallback, GetAppliedFilterExpression = GetAppliedFilterExpression, GetClientVisible = GetClientVisible, GetEditor = GetEditor, GetFilterExpression = GetFilterExpression, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, IsFilterExpressionValid = IsFilterExpressionValid, Reset = Reset, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientFilterControl]
  }
}

