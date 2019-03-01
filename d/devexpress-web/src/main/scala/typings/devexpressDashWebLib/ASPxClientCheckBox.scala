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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("CheckedChanged")(CheckedChanged)
    __obj.updateDynamic("Focus")(Focus)
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetCheckState")(GetCheckState)
    __obj.updateDynamic("GetChecked")(GetChecked)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetErrorText")(GetErrorText)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetInputElement")(GetInputElement)
    __obj.updateDynamic("GetIsValid")(GetIsValid)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetReadOnly")(GetReadOnly)
    __obj.updateDynamic("GetText")(GetText)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("GotFocus")(GotFocus)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("LostFocus")(LostFocus)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetCheckState")(SetCheckState)
    __obj.updateDynamic("SetChecked")(SetChecked)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetErrorText")(SetErrorText)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetIsValid")(SetIsValid)
    __obj.updateDynamic("SetReadOnly")(SetReadOnly)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("Validate")(Validate)
    __obj.updateDynamic("Validation")(Validation)
    __obj.updateDynamic("ValueChanged")(ValueChanged)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientCheckBox]
  }
}

