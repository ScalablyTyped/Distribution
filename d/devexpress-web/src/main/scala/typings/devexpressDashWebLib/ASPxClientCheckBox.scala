package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxCheckBox control.
  */
trait ASPxClientCheckBox extends ASPxClientEdit {
  /**
    * Occurs on the client side when the editor's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCheckBox]]
  /**
    * Returns a value which specifies a check box checked state.
    */
  def GetCheckState(): java.lang.String
  /**
    * Returns a value indicating whether the check box editor is checked.
    */
  def GetChecked(): scala.Boolean
  /**
    * Returns the text displayed within the editor.
    */
  def GetText(): java.lang.String
  /**
    * Sets a value specifying the state of a check box.
    * @param checkState A string value matches one of the CheckState enumeration values.
    */
  def SetCheckState(checkState: java.lang.String): scala.Unit
  /**
    * Sets a value which specifies the checked status of the check box editor.
    * @param isChecked true if the check box editor is checked; otherwise, false.
    */
  def SetChecked(isChecked: scala.Boolean): scala.Unit
  /**
    * Sets the text to be displayed within the editor.
    * @param text A string value specifying the text to be displayed within the editor.
    */
  def SetText(text: java.lang.String): scala.Unit
}

object ASPxClientCheckBox {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCheckBox]],
    Focus: js.Function0[scala.Unit],
    GetCaption: js.Function0[java.lang.String],
    GetCheckState: js.Function0[java.lang.String],
    GetChecked: js.Function0[scala.Boolean],
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
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetCheckState: js.Function1[java.lang.String, scala.Unit],
    SetChecked: js.Function1[scala.Boolean, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientCheckBox = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, CheckedChanged = CheckedChanged, Focus = Focus, GetCaption = GetCaption, GetCheckState = GetCheckState, GetChecked = GetChecked, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetText = GetText, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, LostFocus = LostFocus, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetCaption = SetCaption, SetCheckState = SetCheckState, SetChecked = SetChecked, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetReadOnly = SetReadOnly, SetText = SetText, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientCheckBox]
  }
}

