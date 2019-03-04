package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a base for client editor objects realizing the dropdown editor functionality.
  */
trait ASPxClientDropDownEdit extends ASPxClientDropDownEditBase {
  /**
    * Allows you to handle a click on 'Ok' and 'Cancel' buttons in the drop-down arrow.
    */
  var DropDownCommandButtonClick: ASPxClientEvent[ASPxClientDropDownCommandEventHandler[ASPxClientDropDownEdit]]
  /**
    * Obtains the key value associated with the text displayed within the editor's edit box.
    */
  def GetKeyValue(): java.lang.String
  /**
    * Specifies the key value associated with the text displayed within the editor's edit box.
    * @param keyValue A string specifying the key value associated with the editor's value (displayed text).
    */
  def SetKeyValue(keyValue: java.lang.String): scala.Unit
}

object ASPxClientDropDownEdit {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    AdjustDropDownWindow: js.Function0[scala.Unit],
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DropDownCommandButtonClick: ASPxClientEvent[ASPxClientDropDownCommandEventHandler[ASPxClientDropDownEdit]],
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
    GetKeyValue: js.Function0[java.lang.String],
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
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetKeyValue: js.Function1[java.lang.String, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetSelection: js.Function3[scala.Double, scala.Double, scala.Boolean, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    ShowDropDown: js.Function0[scala.Unit],
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTextEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientDropDownEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, AdjustDropDownWindow = AdjustDropDownWindow, ButtonClick = ButtonClick, CloseUp = CloseUp, DropDown = DropDown, DropDownCommandButtonClick = DropDownCommandButtonClick, Focus = Focus, GetButtonVisible = GetButtonVisible, GetCaption = GetCaption, GetCaretPosition = GetCaretPosition, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetKeyValue = GetKeyValue, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetText = GetText, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, HideDropDown = HideDropDown, InCallback = InCallback, Init = Init, KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, QueryCloseUp = QueryCloseUp, SelectAll = SelectAll, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetButtonVisible = SetButtonVisible, SetCaption = SetCaption, SetCaretPosition = SetCaretPosition, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetKeyValue = SetKeyValue, SetReadOnly = SetReadOnly, SetSelection = SetSelection, SetText = SetText, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, ShowDropDown = ShowDropDown, TextChanged = TextChanged, UserInput = UserInput, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientDropDownEdit]
  }
}

