package typings.devexpressDashWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxCalendar control.
  */
trait ASPxClientCalendar extends ASPxClientEdit {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]]
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientCalendar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]]
  /**
    * Occurs when an end user clicks a date cell.
    */
  var CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]]
  /**
    * Allows you to disable the calendar's days.
    */
  var CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]]
  /**
    * Occurs on the client side after the callback server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]]
  /**
    * Occurs on the client-side when an end-user presses a key while the editor has focus.
    */
  var KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]
  /**
    * Occurs on the client-side when an end-user presses and releases a key while the editor has focus.
    */
  var KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]
  /**
    * Occurs on the client-side when an end-user releases a pressed key while the editor has focus.
    */
  var KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]
  /**
    * Fires on the client side after the selected date has been changed within the calendar.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]
  /**
    * Occurs on the client side when the month displayed within the calendar is changed.
    */
  var VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]
  /**
    * Deselects all the selected dates within the calendar.
    */
  def ClearSelection(): Unit
  /**
    * Deselects the specified date within the calendar.
    * @param date A date-time value that specifies the date to deselect.
    */
  def DeselectDate(date: Date): Unit
  /**
    * Deselects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def DeselectRange(start: Date, end: Date): Unit
  /**
    * Gets the maximum date on the calendar.
    */
  def GetMaxDate(): Date
  /**
    * Gets the minimum date on the calendar.
    */
  def GetMinDate(): Date
  /**
    * Returns the calendar's selected date.
    */
  def GetSelectedDate(): Date
  /**
    * Returns a list of dates which are selected within the calendar.
    */
  def GetSelectedDates(): js.Array[Date]
  /**
    * Gets the date that determines the month and year that are currently displayed in the calendar.
    */
  def GetVisibleDate(): Date
  /**
    * Tests whether the specified date is selected.
    * @param date A date-time value that specifies the date to test.
    */
  def IsDateSelected(date: Date): Boolean
  /**
    * Selects the specified date within the calendar.
    * @param date A date-time value that specifies the selected date.
    */
  def SelectDate(date: Date): Unit
  /**
    * Selects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def SelectRange(start: Date, end: Date): Unit
  /**
    * Sets the maximum date of the calendar.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: Date): Unit
  /**
    * Sets the minimum date of the calendar.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: Date): Unit
  /**
    * Sets the calendar's selected date.
    * @param date A date object that specifies the calendar's selected date.
    */
  def SetSelectedDate(date: Date): Unit
  /**
    * Sets the date that specifies the month and year to be displayed in the calendar.
    * @param date The date that specifies calendar's visible month and year.
    */
  def SetVisibleDate(date: Date): Unit
}

object ASPxClientCalendar {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]],
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
  ): ASPxClientCalendar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback, CallbackError = CallbackError, CellClick = CellClick, ClearSelection = js.Any.fromFunction0(ClearSelection), CustomDisabledDate = CustomDisabledDate, DeselectDate = js.Any.fromFunction1(DeselectDate), DeselectRange = js.Any.fromFunction2(DeselectRange), EndCallback = EndCallback, Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaxDate = js.Any.fromFunction0(GetMaxDate), GetMinDate = js.Any.fromFunction0(GetMinDate), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetSelectedDate = js.Any.fromFunction0(GetSelectedDate), GetSelectedDates = js.Any.fromFunction0(GetSelectedDates), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetVisibleDate = js.Any.fromFunction0(GetVisibleDate), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus, InCallback = js.Any.fromFunction0(InCallback), Init = Init, IsDateSelected = js.Any.fromFunction1(IsDateSelected), KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, SelectDate = js.Any.fromFunction1(SelectDate), SelectRange = js.Any.fromFunction2(SelectRange), SelectionChanged = SelectionChanged, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetMaxDate = js.Any.fromFunction1(SetMaxDate), SetMinDate = js.Any.fromFunction1(SetMinDate), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelectedDate = js.Any.fromFunction1(SetSelectedDate), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetVisibleDate = js.Any.fromFunction1(SetVisibleDate), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation, ValueChanged = ValueChanged, VisibleMonthChanged = VisibleMonthChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientCalendar]
  }
}

