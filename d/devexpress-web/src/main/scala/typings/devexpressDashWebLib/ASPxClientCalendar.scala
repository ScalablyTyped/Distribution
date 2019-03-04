package typings
package devexpressDashWebLib

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
  def ClearSelection(): scala.Unit
  /**
    * Deselects the specified date within the calendar.
    * @param date A date-time value that specifies the date to deselect.
    */
  def DeselectDate(date: stdLib.Date): scala.Unit
  /**
    * Deselects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def DeselectRange(start: stdLib.Date, end: stdLib.Date): scala.Unit
  /**
    * Gets the maximum date on the calendar.
    */
  def GetMaxDate(): stdLib.Date
  /**
    * Gets the minimum date on the calendar.
    */
  def GetMinDate(): stdLib.Date
  /**
    * Returns the calendar's selected date.
    */
  def GetSelectedDate(): stdLib.Date
  /**
    * Returns a list of dates which are selected within the calendar.
    */
  def GetSelectedDates(): js.Array[stdLib.Date]
  /**
    * Gets the date that determines the month and year that are currently displayed in the calendar.
    */
  def GetVisibleDate(): stdLib.Date
  /**
    * Tests whether the specified date is selected.
    * @param date A date-time value that specifies the date to test.
    */
  def IsDateSelected(date: stdLib.Date): scala.Boolean
  /**
    * Selects the specified date within the calendar.
    * @param date A date-time value that specifies the selected date.
    */
  def SelectDate(date: stdLib.Date): scala.Unit
  /**
    * Selects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def SelectRange(start: stdLib.Date, end: stdLib.Date): scala.Unit
  /**
    * Sets the maximum date of the calendar.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: stdLib.Date): scala.Unit
  /**
    * Sets the minimum date of the calendar.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: stdLib.Date): scala.Unit
  /**
    * Sets the calendar's selected date.
    * @param date A date object that specifies the calendar's selected date.
    */
  def SetSelectedDate(date: stdLib.Date): scala.Unit
  /**
    * Sets the date that specifies the month and year to be displayed in the calendar.
    * @param date The date that specifies calendar's visible month and year.
    */
  def SetVisibleDate(date: stdLib.Date): scala.Unit
}

object ASPxClientCalendar {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]],
    CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]],
    ClearSelection: js.Function0[scala.Unit],
    CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]],
    DeselectDate: js.Function1[stdLib.Date, scala.Unit],
    DeselectRange: js.Function2[stdLib.Date, stdLib.Date, scala.Unit],
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]],
    Focus: js.Function0[scala.Unit],
    GetCaption: js.Function0[java.lang.String],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEnabled: js.Function0[scala.Boolean],
    GetErrorText: js.Function0[java.lang.String],
    GetHeight: js.Function0[scala.Double],
    GetInputElement: js.Function0[js.Object],
    GetIsValid: js.Function0[scala.Boolean],
    GetMainElement: js.Function0[js.Object],
    GetMaxDate: js.Function0[stdLib.Date],
    GetMinDate: js.Function0[stdLib.Date],
    GetParentControl: js.Function0[js.Object],
    GetReadOnly: js.Function0[scala.Boolean],
    GetSelectedDate: js.Function0[stdLib.Date],
    GetSelectedDates: js.Function0[js.Array[stdLib.Date]],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetVisibleDate: js.Function0[stdLib.Date],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsDateSelected: js.Function1[stdLib.Date, scala.Boolean],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectDate: js.Function1[stdLib.Date, scala.Unit],
    SelectRange: js.Function2[stdLib.Date, stdLib.Date, scala.Unit],
    SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetMaxDate: js.Function1[stdLib.Date, scala.Unit],
    SetMinDate: js.Function1[stdLib.Date, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetSelectedDate: js.Function1[stdLib.Date, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetVisibleDate: js.Function1[stdLib.Date, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    name: java.lang.String
  ): ASPxClientCalendar = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, BeginCallback = BeginCallback, CallbackError = CallbackError, CellClick = CellClick, ClearSelection = ClearSelection, CustomDisabledDate = CustomDisabledDate, DeselectDate = DeselectDate, DeselectRange = DeselectRange, EndCallback = EndCallback, Focus = Focus, GetCaption = GetCaption, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetMainElement = GetMainElement, GetMaxDate = GetMaxDate, GetMinDate = GetMinDate, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetSelectedDate = GetSelectedDate, GetSelectedDates = GetSelectedDates, GetValue = GetValue, GetVisible = GetVisible, GetVisibleDate = GetVisibleDate, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, IsDateSelected = IsDateSelected, KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, SelectDate = SelectDate, SelectRange = SelectRange, SelectionChanged = SelectionChanged, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetCaption = SetCaption, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetMaxDate = SetMaxDate, SetMinDate = SetMinDate, SetReadOnly = SetReadOnly, SetSelectedDate = SetSelectedDate, SetValue = SetValue, SetVisible = SetVisible, SetVisibleDate = SetVisibleDate, SetWidth = SetWidth, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, VisibleMonthChanged = VisibleMonthChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientCalendar]
  }
}

