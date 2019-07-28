package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side counterpart of the Calendar and CalendarFor extensions.
  */
trait MVCxClientCalendar extends ASPxClientCalendar {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  @JSName("BeginCallback")
  var BeginCallback_MVCxClientCalendar: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientCalendar]]
}

object MVCxClientCalendar {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientCalendar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]],
    CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]],
    ClearSelection: () => Unit,
    CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]],
    DeselectDate: Date => Unit,
    DeselectRange: (Date, Date) => Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]],
    Focus: () => Unit,
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Object,
    GetIsValid: () => Boolean,
    GetMainElement: () => js.Object,
    GetMaxDate: () => Date,
    GetMinDate: () => Date,
    GetParentControl: () => js.Object,
    GetReadOnly: () => Boolean,
    GetSelectedDate: () => Date,
    GetSelectedDates: () => js.Array[Date],
    GetValue: () => js.Object,
    GetVisible: () => Boolean,
    GetVisibleDate: () => Date,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsDateSelected: Date => Boolean,
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectDate: Date => Unit,
    SelectRange: (Date, Date) => Unit,
    SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetMaxDate: Date => Unit,
    SetMinDate: Date => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelectedDate: Date => Unit,
    SetValue: js.Object => Unit,
    SetVisible: Boolean => Unit,
    SetVisibleDate: Date => Unit,
    SetWidth: Double => Unit,
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    name: String
  ): MVCxClientCalendar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback, CallbackError = CallbackError, CellClick = CellClick, ClearSelection = js.Any.fromFunction0(ClearSelection), CustomDisabledDate = CustomDisabledDate, DeselectDate = js.Any.fromFunction1(DeselectDate), DeselectRange = js.Any.fromFunction2(DeselectRange), EndCallback = EndCallback, Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaxDate = js.Any.fromFunction0(GetMaxDate), GetMinDate = js.Any.fromFunction0(GetMinDate), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetSelectedDate = js.Any.fromFunction0(GetSelectedDate), GetSelectedDates = js.Any.fromFunction0(GetSelectedDates), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetVisibleDate = js.Any.fromFunction0(GetVisibleDate), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, InCallback = js.Any.fromFunction0(InCallback), Init = Init, IsDateSelected = js.Any.fromFunction1(IsDateSelected), KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, SelectDate = js.Any.fromFunction1(SelectDate), SelectRange = js.Any.fromFunction2(SelectRange), SelectionChanged = SelectionChanged, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetMaxDate = js.Any.fromFunction1(SetMaxDate), SetMinDate = js.Any.fromFunction1(SetMinDate), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelectedDate = js.Any.fromFunction1(SetSelectedDate), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetVisibleDate = js.Any.fromFunction1(SetVisibleDate), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, VisibleMonthChanged = VisibleMonthChanged, name = name)
  
    __obj.asInstanceOf[MVCxClientCalendar]
  }
}

