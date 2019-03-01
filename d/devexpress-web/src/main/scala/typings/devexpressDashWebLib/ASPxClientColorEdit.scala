package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxColorEdit control.
  */
trait ASPxClientColorEdit extends ASPxClientDropDownEditBase {
  /**
    * Fires after the selected color has been changed within the color editor via end-user interaction.
    */
  var ColorChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]]
  /**
    * This event is not in effect for the ASPxClientColorEdit. Use the ColorChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientColorEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]]
  /**
    * Returns the color editor's value.
    */
  def GetColor(): java.lang.String
  /**
    * Indicates whether the automatic color item is selected.
    */
  def IsAutomaticColorSelected(): scala.Boolean
  /**
    * Specifies the color value for the color editor.
    * @param value A string value specifying the editor color.
    */
  def SetColor(value: java.lang.String): scala.Unit
}

object ASPxClientColorEdit {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    AdjustDropDownWindow: js.Function0[scala.Unit],
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    ColorChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    Focus: js.Function0[scala.Unit],
    GetButtonVisible: js.Function1[scala.Double, scala.Boolean],
    GetCaption: js.Function0[java.lang.String],
    GetCaretPosition: js.Function0[scala.Double],
    GetClientVisible: js.Function0[scala.Boolean],
    GetColor: js.Function0[java.lang.String],
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
    HideDropDown: js.Function0[scala.Unit],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsAutomaticColorSelected: js.Function0[scala.Boolean],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
    SelectAll: js.Function0[scala.Unit],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetButtonVisible: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetCaretPosition: js.Function1[scala.Double, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetColor: js.Function1[java.lang.String, scala.Unit],
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
    ShowDropDown: js.Function0[scala.Unit],
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientColorEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientColorEdit = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("AdjustDropDownWindow")(AdjustDropDownWindow)
    __obj.updateDynamic("ButtonClick")(ButtonClick)
    __obj.updateDynamic("CloseUp")(CloseUp)
    __obj.updateDynamic("ColorChanged")(ColorChanged)
    __obj.updateDynamic("DropDown")(DropDown)
    __obj.updateDynamic("Focus")(Focus)
    __obj.updateDynamic("GetButtonVisible")(GetButtonVisible)
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetCaretPosition")(GetCaretPosition)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetColor")(GetColor)
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
    __obj.updateDynamic("HideDropDown")(HideDropDown)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("IsAutomaticColorSelected")(IsAutomaticColorSelected)
    __obj.updateDynamic("KeyDown")(KeyDown)
    __obj.updateDynamic("KeyPress")(KeyPress)
    __obj.updateDynamic("KeyUp")(KeyUp)
    __obj.updateDynamic("LostFocus")(LostFocus)
    __obj.updateDynamic("QueryCloseUp")(QueryCloseUp)
    __obj.updateDynamic("SelectAll")(SelectAll)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetButtonVisible")(SetButtonVisible)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetCaretPosition")(SetCaretPosition)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetColor")(SetColor)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetErrorText")(SetErrorText)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetIsValid")(SetIsValid)
    __obj.updateDynamic("SetReadOnly")(SetReadOnly)
    __obj.updateDynamic("SetSelection")(SetSelection)
    __obj.updateDynamic("SetText")(SetText)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("ShowDropDown")(ShowDropDown)
    __obj.updateDynamic("TextChanged")(TextChanged)
    __obj.updateDynamic("UserInput")(UserInput)
    __obj.updateDynamic("Validate")(Validate)
    __obj.updateDynamic("Validation")(Validation)
    __obj.updateDynamic("ValueChanged")(ValueChanged)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientColorEdit]
  }
}

