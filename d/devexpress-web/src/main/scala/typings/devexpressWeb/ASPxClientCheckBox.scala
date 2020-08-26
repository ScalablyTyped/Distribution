package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxCheckBox control.
  */
@js.native
trait ASPxClientCheckBox extends ASPxClientEdit {
  /**
    * Occurs on the client side when the editor's checked state is changed.
    */
  var CheckedChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCheckBox]] = js.native
  /**
    * Returns a value which specifies a check box checked state.
    */
  def GetCheckState(): String = js.native
  /**
    * Returns a value indicating whether the check box editor is checked.
    */
  def GetChecked(): Boolean = js.native
  /**
    * Returns the text displayed within the editor.
    */
  def GetText(): String = js.native
  /**
    * Sets a value specifying the state of a check box.
    * @param checkState A string value matches one of the CheckState enumeration values.
    */
  def SetCheckState(checkState: String): Unit = js.native
  /**
    * Sets a value which specifies the checked status of the check box editor.
    * @param isChecked true if the check box editor is checked; otherwise, false.
    */
  def SetChecked(isChecked: Boolean): Unit = js.native
  /**
    * Sets the text to be displayed within the editor.
    * @param text A string value specifying the text to be displayed within the editor.
    */
  def SetText(text: String): Unit = js.native
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
    GetInputElement: () => js.Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => js.Any,
    GetParentControl: () => js.Any,
    GetReadOnly: () => Boolean,
    GetText: () => String,
    GetValue: () => js.Any,
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
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientCheckBox = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), CheckedChanged = CheckedChanged.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetCheckState = js.Any.fromFunction0(GetCheckState), GetChecked = js.Any.fromFunction0(GetChecked), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetCheckState = js.Any.fromFunction1(SetCheckState), SetChecked = js.Any.fromFunction1(SetChecked), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCheckBox]
  }
  @scala.inline
  implicit class ASPxClientCheckBoxOps[Self <: ASPxClientCheckBox] (val x: Self) extends AnyVal {
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
    def setCheckedChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCheckBox]]): Self = this.set("CheckedChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCheckState(value: () => String): Self = this.set("GetCheckState", js.Any.fromFunction0(value))
    @scala.inline
    def setGetChecked(value: () => Boolean): Self = this.set("GetChecked", js.Any.fromFunction0(value))
    @scala.inline
    def setGetText(value: () => String): Self = this.set("GetText", js.Any.fromFunction0(value))
    @scala.inline
    def setSetCheckState(value: String => Unit): Self = this.set("SetCheckState", js.Any.fromFunction1(value))
    @scala.inline
    def setSetChecked(value: Boolean => Unit): Self = this.set("SetChecked", js.Any.fromFunction1(value))
    @scala.inline
    def setSetText(value: String => Unit): Self = this.set("SetText", js.Any.fromFunction1(value))
  }
  
}

