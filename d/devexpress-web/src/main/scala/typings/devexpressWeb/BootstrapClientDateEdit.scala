package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the BootstrapDateEdit control.
  */
@js.native
trait BootstrapClientDateEdit extends ASPxClientDateEdit

object BootstrapClientDateEdit {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    AdjustDropDownWindow: () => Unit,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]],
    CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    Focus: () => Unit,
    GetButton: Double => js.Any,
    GetButtonVisible: Double => Boolean,
    GetCalendar: () => ASPxClientCalendar,
    GetCaption: () => String,
    GetCaretPosition: () => Double,
    GetClientVisible: () => Boolean,
    GetDate: () => Date,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => js.Any,
    GetMaxDate: () => Date,
    GetMinDate: () => Date,
    GetParentControl: () => js.Any,
    GetRangeDayCount: () => Double,
    GetRangeLength: () => Double,
    GetReadOnly: () => Boolean,
    GetText: () => String,
    GetTimeEdit: () => ASPxClientTimeEdit,
    GetValue: () => js.Any,
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
    ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
    SelectAll: () => Unit,
    SendMessageToAssistiveTechnology: String => Unit,
    SetButtonVisible: (Double, Boolean) => Unit,
    SetCaption: String => Unit,
    SetCaretPosition: Double => Unit,
    SetClientVisible: Boolean => Unit,
    SetDate: Date => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetMaxDate: Date => Unit,
    SetMinDate: Date => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelection: (Double, Double, Boolean) => Unit,
    SetText: String => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ShowDropDown: () => Unit,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): BootstrapClientDateEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AdjustDropDownWindow = js.Any.fromFunction0(AdjustDropDownWindow), ButtonClick = ButtonClick.asInstanceOf[js.Any], CalendarCellClick = CalendarCellClick.asInstanceOf[js.Any], CalendarCustomDisabledDate = CalendarCustomDisabledDate.asInstanceOf[js.Any], CloseUp = CloseUp.asInstanceOf[js.Any], DateChanged = DateChanged.asInstanceOf[js.Any], DropDown = DropDown.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCalendar = js.Any.fromFunction0(GetCalendar), GetCaption = js.Any.fromFunction0(GetCaption), GetCaretPosition = js.Any.fromFunction0(GetCaretPosition), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDate = js.Any.fromFunction0(GetDate), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaxDate = js.Any.fromFunction0(GetMaxDate), GetMinDate = js.Any.fromFunction0(GetMinDate), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRangeDayCount = js.Any.fromFunction0(GetRangeDayCount), GetRangeLength = js.Any.fromFunction0(GetRangeLength), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetTimeEdit = js.Any.fromFunction0(GetTimeEdit), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], HideDropDown = js.Any.fromFunction0(HideDropDown), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], ParseDate = ParseDate.asInstanceOf[js.Any], QueryCloseUp = QueryCloseUp.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetButtonVisible = js.Any.fromFunction2(SetButtonVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetCaretPosition = js.Any.fromFunction1(SetCaretPosition), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDate = js.Any.fromFunction1(SetDate), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetMaxDate = js.Any.fromFunction1(SetMaxDate), SetMinDate = js.Any.fromFunction1(SetMinDate), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelection = js.Any.fromFunction3(SetSelection), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowDropDown = js.Any.fromFunction0(ShowDropDown), TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapClientDateEdit]
  }
}

