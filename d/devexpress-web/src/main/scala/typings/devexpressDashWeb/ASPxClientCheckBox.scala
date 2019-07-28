package typings.devexpressDashWeb

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
  def GetCheckState(): String
  /**
    * Returns a value indicating whether the check box editor is checked.
    */
  def GetChecked(): Boolean
  /**
    * Returns the text displayed within the editor.
    */
  def GetText(): String
  /**
    * Sets a value specifying the state of a check box.
    * @param checkState A string value matches one of the CheckState enumeration values.
    */
  def SetCheckState(checkState: String): Unit
  /**
    * Sets a value which specifies the checked status of the check box editor.
    * @param isChecked true if the check box editor is checked; otherwise, false.
    */
  def SetChecked(isChecked: Boolean): Unit
  /**
    * Sets the text to be displayed within the editor.
    * @param text A string value specifying the text to be displayed within the editor.
    */
  def SetText(text: String): Unit
}

object ASPxClientCheckBox {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCheckBox]],
    Focus: () => Unit,
    GetCaption: () => String,
    GetCheckState: () => String,
    GetChecked: () => Boolean,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Object,
    GetIsValid: () => Boolean,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetReadOnly: () => Boolean,
    GetText: () => String,
    GetValue: () => js.Object,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetCheckState: String => Unit,
    SetChecked: Boolean => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetReadOnly: Boolean => Unit,
    SetText: String => Unit,
    SetValue: js.Object => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientCheckBox = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CheckedChanged = CheckedChanged, Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetCheckState = js.Any.fromFunction0(GetCheckState), GetChecked = js.Any.fromFunction0(GetChecked), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, InCallback = js.Any.fromFunction0(InCallback), Init = Init, LostFocus = LostFocus, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetCheckState = js.Any.fromFunction1(SetCheckState), SetChecked = js.Any.fromFunction1(SetChecked), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientCheckBox]
  }
}

