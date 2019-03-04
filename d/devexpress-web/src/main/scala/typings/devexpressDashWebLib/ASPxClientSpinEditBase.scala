package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base class for the ASPxClientSpinEdit object.
  */
trait ASPxClientSpinEditBase extends ASPxClientButtonEditBase {
  /**
    * This event is not in effect for the ASPxClientSpinEditBase. Use the ASPxClientTimeEdit.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientSpinEditBase: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]]
}

object ASPxClientSpinEditBase {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    Focus: js.Function0[scala.Unit],
    GetButtonVisible: js.Function1[scala.Double, scala.Boolean],
    GetCaption: js.Function0[java.lang.String],
    GetCaretPosition: js.Function0[scala.Double],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetErrorText: js.Function0[java.lang.String],
    GetHeight: js.Function0[scala.Double],
    GetInputElement: js.Function0[js.Object],
    GetIsValid: js.Function0[scala.Boolean],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetReadOnly: js.Function0[scala.Boolean],
    GetText: js.Function0[java.lang.String],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectAll: js.Function0[scala.Unit],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetButtonVisible: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetCaretPosition: js.Function1[scala.Double, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetSelection: js.Function3[scala.Double, scala.Double, scala.Boolean, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientSpinEditBase]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientSpinEditBase = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, ButtonClick = ButtonClick, Focus = Focus, GetButtonVisible = GetButtonVisible, GetCaption = GetCaption, GetCaretPosition = GetCaretPosition, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetText = GetText, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, SelectAll = SelectAll, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetButtonVisible = SetButtonVisible, SetCaption = SetCaption, SetCaretPosition = SetCaretPosition, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetReadOnly = SetReadOnly, SetSelection = SetSelection, SetText = SetText, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, TextChanged = TextChanged, UserInput = UserInput, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientSpinEditBase]
  }
}

