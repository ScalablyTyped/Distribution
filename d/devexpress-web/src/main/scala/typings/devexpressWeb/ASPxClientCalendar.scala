package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxCalendar control.
  */
@js.native
trait ASPxClientCalendar extends ASPxClientEdit {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientCalendar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs when an end user clicks a date cell.
    */
  var CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Allows you to disable the calendar's days.
    */
  var CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client side after the callback server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client-side when an end-user presses a key while the editor has focus.
    */
  var KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client-side when an end-user presses and releases a key while the editor has focus.
    */
  var KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client-side when an end-user releases a pressed key while the editor has focus.
    */
  var KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Fires on the client side after the selected date has been changed within the calendar.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client side when the month displayed within the calendar is changed.
    */
  var VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Deselects all the selected dates within the calendar.
    */
  def ClearSelection(): Unit = js.native
  /**
    * Deselects the specified date within the calendar.
    * @param date A date-time value that specifies the date to deselect.
    */
  def DeselectDate(date: Date): Unit = js.native
  /**
    * Deselects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def DeselectRange(start: Date, end: Date): Unit = js.native
  /**
    * Gets the maximum date on the calendar.
    */
  def GetMaxDate(): Date = js.native
  /**
    * Gets the minimum date on the calendar.
    */
  def GetMinDate(): Date = js.native
  /**
    * Returns the calendar's selected date.
    */
  def GetSelectedDate(): Date = js.native
  /**
    * Returns a list of dates which are selected within the calendar.
    */
  def GetSelectedDates(): js.Array[Date] = js.native
  /**
    * Gets the date that determines the month and year that are currently displayed in the calendar.
    */
  def GetVisibleDate(): Date = js.native
  /**
    * Tests whether the specified date is selected. true if the specified date is selected; otherwise, false.
    * @param date A date-time value that specifies the date to test.
    */
  def IsDateSelected(date: Date): Boolean = js.native
  /**
    * Selects the specified date within the calendar.
    * @param date A date-time value that specifies the selected date.
    */
  def SelectDate(date: Date): Unit = js.native
  /**
    * Selects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def SelectRange(start: Date, end: Date): Unit = js.native
  /**
    * Sets the maximum date of the calendar.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: Date): Unit = js.native
  /**
    * Sets the minimum date of the calendar.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: Date): Unit = js.native
  /**
    * Sets the calendar's selected date.
    * @param date A date object that specifies the calendar's selected date.
    */
  def SetSelectedDate(date: Date): Unit = js.native
  /**
    * Sets the date that specifies the month and year to be displayed in the calendar.
    * @param date The date that specifies calendar's visible month and year.
    */
  def SetVisibleDate(date: Date): Unit = js.native
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
    GetInputElement: () => js.Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => js.Any,
    GetMaxDate: () => Date,
    GetMinDate: () => Date,
    GetParentControl: () => js.Any,
    GetReadOnly: () => Boolean,
    GetSelectedDate: () => Date,
    GetSelectedDates: () => js.Array[Date],
    GetValue: () => js.Any,
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
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetVisibleDate: Date => Unit,
    SetWidth: Double => Unit,
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    name: String
  ): ASPxClientCalendar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CellClick = CellClick.asInstanceOf[js.Any], ClearSelection = js.Any.fromFunction0(ClearSelection), CustomDisabledDate = CustomDisabledDate.asInstanceOf[js.Any], DeselectDate = js.Any.fromFunction1(DeselectDate), DeselectRange = js.Any.fromFunction2(DeselectRange), EndCallback = EndCallback.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaxDate = js.Any.fromFunction0(GetMaxDate), GetMinDate = js.Any.fromFunction0(GetMinDate), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetSelectedDate = js.Any.fromFunction0(GetSelectedDate), GetSelectedDates = js.Any.fromFunction0(GetSelectedDates), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetVisibleDate = js.Any.fromFunction0(GetVisibleDate), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsDateSelected = js.Any.fromFunction1(IsDateSelected), KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectDate = js.Any.fromFunction1(SelectDate), SelectRange = js.Any.fromFunction2(SelectRange), SelectionChanged = SelectionChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetMaxDate = js.Any.fromFunction1(SetMaxDate), SetMinDate = js.Any.fromFunction1(SetMinDate), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelectedDate = js.Any.fromFunction1(SetSelectedDate), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetVisibleDate = js.Any.fromFunction1(SetVisibleDate), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], VisibleMonthChanged = VisibleMonthChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendar]
  }
  @scala.inline
  implicit class ASPxClientCalendarOps[Self <: ASPxClientCalendar] (val x: Self) extends AnyVal {
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
    def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]]): Self = this.set("BeginCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]]): Self = this.set("CallbackError", value.asInstanceOf[js.Any])
    @scala.inline
    def setCellClick(value: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]]): Self = this.set("CellClick", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearSelection(value: () => Unit): Self = this.set("ClearSelection", js.Any.fromFunction0(value))
    @scala.inline
    def setCustomDisabledDate(value: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]]): Self = this.set("CustomDisabledDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeselectDate(value: Date => Unit): Self = this.set("DeselectDate", js.Any.fromFunction1(value))
    @scala.inline
    def setDeselectRange(value: (Date, Date) => Unit): Self = this.set("DeselectRange", js.Any.fromFunction2(value))
    @scala.inline
    def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]]): Self = this.set("EndCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetMaxDate(value: () => Date): Self = this.set("GetMaxDate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMinDate(value: () => Date): Self = this.set("GetMinDate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectedDate(value: () => Date): Self = this.set("GetSelectedDate", js.Any.fromFunction0(value))
    @scala.inline
    def setGetSelectedDates(value: () => js.Array[Date]): Self = this.set("GetSelectedDates", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVisibleDate(value: () => Date): Self = this.set("GetVisibleDate", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDateSelected(value: Date => Boolean): Self = this.set("IsDateSelected", js.Any.fromFunction1(value))
    @scala.inline
    def setKeyDown(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = this.set("KeyDown", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyPress(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = this.set("KeyPress", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUp(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = this.set("KeyUp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectDate(value: Date => Unit): Self = this.set("SelectDate", js.Any.fromFunction1(value))
    @scala.inline
    def setSelectRange(value: (Date, Date) => Unit): Self = this.set("SelectRange", js.Any.fromFunction2(value))
    @scala.inline
    def setSelectionChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]): Self = this.set("SelectionChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetMaxDate(value: Date => Unit): Self = this.set("SetMaxDate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetMinDate(value: Date => Unit): Self = this.set("SetMinDate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetSelectedDate(value: Date => Unit): Self = this.set("SetSelectedDate", js.Any.fromFunction1(value))
    @scala.inline
    def setSetVisibleDate(value: Date => Unit): Self = this.set("SetVisibleDate", js.Any.fromFunction1(value))
    @scala.inline
    def setVisibleMonthChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]): Self = this.set("VisibleMonthChanged", value.asInstanceOf[js.Any])
  }
  
}

