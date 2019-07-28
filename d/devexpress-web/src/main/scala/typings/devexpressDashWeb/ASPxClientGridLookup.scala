package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The client-side equivalent of the ASPxGridLookup control.
  */
trait ASPxClientGridLookup extends ASPxClientDropDownEditBase {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGridLookup]]
  /**
    * Occurs on the client side after a callback's server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGridLookup]]
  /**
    * Fires on the client when a data row is clicked within the built-in dropdown grid.
    */
  var RowClick: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridLookup]]
  /**
    * Confirms the current selection made by an end-user within the editor's dropdown grid.
    */
  def ConfirmCurrentSelection(): Unit
  /**
    * Returns a client object representing the built-in dropdown grid.
    */
  def GetGridView(): ASPxClientGridView
  /**
    * Cancels the current selection made by an end-user within the editor's dropdown grid and rolls back to the last confirmed selection. The selection can be confirmed by either pressing the Enter key or calling the ConfirmCurrentSelection method.
    */
  def RollbackToLastConfirmedSelection(): Unit
}

object ASPxClientGridLookup {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    AdjustDropDownWindow: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientGridLookup]],
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    ConfirmCurrentSelection: () => Unit,
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientGridLookup]],
    Focus: () => Unit,
    GetButtonVisible: Double => Boolean,
    GetCaption: () => String,
    GetCaretPosition: () => Double,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetGridView: () => ASPxClientGridView,
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
    HideDropDown: () => Unit,
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
    RollbackToLastConfirmedSelection: () => Unit,
    RowClick: ASPxClientEvent[ASPxClientGridViewRowClickEventHandler[ASPxClientGridLookup]],
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
  ): ASPxClientGridLookup = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AdjustDropDownWindow = js.Any.fromFunction0(AdjustDropDownWindow), BeginCallback = BeginCallback, ButtonClick = ButtonClick, CloseUp = CloseUp, ConfirmCurrentSelection = js.Any.fromFunction0(ConfirmCurrentSelection), DropDown = DropDown, EndCallback = EndCallback, Focus = js.Any.fromFunction0(Focus), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCaption = js.Any.fromFunction0(GetCaption), GetCaretPosition = js.Any.fromFunction0(GetCaretPosition), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetGridView = js.Any.fromFunction0(GetGridView), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, HideDropDown = js.Any.fromFunction0(HideDropDown), InCallback = js.Any.fromFunction0(InCallback), Init = Init, KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, QueryCloseUp = QueryCloseUp, RollbackToLastConfirmedSelection = js.Any.fromFunction0(RollbackToLastConfirmedSelection), RowClick = RowClick, SelectAll = js.Any.fromFunction0(SelectAll), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetButtonVisible = js.Any.fromFunction2(SetButtonVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetCaretPosition = js.Any.fromFunction1(SetCaretPosition), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelection = js.Any.fromFunction3(SetSelection), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowDropDown = js.Any.fromFunction0(ShowDropDown), TextChanged = TextChanged, UserInput = UserInput, Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientGridLookup]
  }
}

