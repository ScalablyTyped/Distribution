package typings.devexpressDashWeb

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
  def GetKeyValue(): String
  /**
    * Specifies the key value associated with the text displayed within the editor's edit box.
    * @param keyValue A string specifying the key value associated with the editor's value (displayed text).
    */
  def SetKeyValue(keyValue: String): Unit
}

object ASPxClientDropDownEdit {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    AdjustDropDownWindow: () => Unit,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DropDownCommandButtonClick: ASPxClientEvent[ASPxClientDropDownCommandEventHandler[ASPxClientDropDownEdit]],
    Focus: () => Unit,
    GetButtonVisible: Double => Boolean,
    GetCaption: () => String,
    GetCaretPosition: () => Double,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Object,
    GetIsValid: () => Boolean,
    GetKeyValue: () => String,
    GetMainElement: () => js.Object,
    GetParentControl: () => js.Object,
    GetReadOnly: () => Boolean,
    GetText: () => String,
    GetValue: () => js.Object,
    GetVisible: () => Boolean,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    HideDropDown: () => Unit,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
    SelectAll: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetButtonVisible: (Double, Boolean) => Unit,
    SetCaption: String => Unit,
    SetCaretPosition: Double => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetKeyValue: String => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelection: (Double, Double, Boolean) => Unit,
    SetText: String => Unit,
    SetValue: js.Object => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ShowDropDown: () => Unit,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientTextEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientDropDownEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AdjustDropDownWindow = js.Any.fromFunction0(AdjustDropDownWindow), ButtonClick = ButtonClick, CloseUp = CloseUp, DropDown = DropDown, DropDownCommandButtonClick = DropDownCommandButtonClick, Focus = js.Any.fromFunction0(Focus), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = js.Any.fromFunction0(GetCaption), GetCaretPosition = js.Any.fromFunction0(GetCaretPosition), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetKeyValue = js.Any.fromFunction0(GetKeyValue), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, HideDropDown = js.Any.fromFunction0(HideDropDown), InCallback = js.Any.fromFunction0(InCallback), Init = Init, KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, QueryCloseUp = QueryCloseUp, SelectAll = js.Any.fromFunction0(SelectAll), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetButtonVisible = js.Any.fromFunction2(SetButtonVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetCaretPosition = js.Any.fromFunction1(SetCaretPosition), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetKeyValue = js.Any.fromFunction1(SetKeyValue), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelection = js.Any.fromFunction3(SetSelection), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowDropDown = js.Any.fromFunction0(ShowDropDown), TextChanged = TextChanged, UserInput = UserInput, Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientDropDownEdit]
  }
}

