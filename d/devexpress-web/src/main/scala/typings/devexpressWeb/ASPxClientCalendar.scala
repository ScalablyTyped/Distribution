package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxCalendar control.
  */
trait ASPxClientCalendar
  extends StObject
     with ASPxClientEdit {
  
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
    * Deselects all the selected dates within the calendar.
    */
  def ClearSelection(): Unit
  
  /**
    * Allows you to disable the calendar's days.
    */
  var CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]]
  
  /**
    * Deselects the specified date within the calendar.
    * @param date A date-time value that specifies the date to deselect.
    */
  def DeselectDate(date: js.Date): Unit
  
  /**
    * Deselects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def DeselectRange(start: js.Date, end: js.Date): Unit
  
  /**
    * Occurs on the client side after the callback server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]]
  
  /**
    * Gets the maximum date on the calendar.
    */
  def GetMaxDate(): js.Date
  
  /**
    * Gets the minimum date on the calendar.
    */
  def GetMinDate(): js.Date
  
  /**
    * Returns the calendar's selected date.
    */
  def GetSelectedDate(): js.Date
  
  /**
    * Returns a list of dates which are selected within the calendar.
    */
  def GetSelectedDates(): js.Array[js.Date]
  
  /**
    * Gets the date that determines the month and year that are currently displayed in the calendar.
    */
  def GetVisibleDate(): js.Date
  
  /**
    * Tests whether the specified date is selected. true if the specified date is selected; otherwise, false.
    * @param date A date-time value that specifies the date to test.
    */
  def IsDateSelected(date: js.Date): Boolean
  
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
    * Selects the specified date within the calendar.
    * @param date A date-time value that specifies the selected date.
    */
  def SelectDate(date: js.Date): Unit
  
  /**
    * Selects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def SelectRange(start: js.Date, end: js.Date): Unit
  
  /**
    * Occurs on the client after a user changes the selected date in the calendar.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]
  
  /**
    * Sets the maximum date of the calendar.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: js.Date): Unit
  
  /**
    * Sets the minimum date of the calendar.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: js.Date): Unit
  
  /**
    * Sets the calendar's selected date.
    * @param date A date object that specifies the calendar's selected date.
    */
  def SetSelectedDate(date: js.Date): Unit
  
  /**
    * Sets the date that specifies the month and year to be displayed in the calendar.
    * @param date The date that specifies calendar's visible month and year.
    */
  def SetVisibleDate(date: js.Date): Unit
  
  /**
    * Occurs on the client when a user changes the month in the calendar.
    */
  var VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]
}
object ASPxClientCalendar {
  
  inline def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]],
    CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]],
    ClearSelection: () => Unit,
    CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]],
    DeselectDate: js.Date => Unit,
    DeselectRange: (js.Date, js.Date) => Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]],
    Focus: () => Unit,
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => Any,
    GetMaxDate: () => js.Date,
    GetMinDate: () => js.Date,
    GetParentControl: () => Any,
    GetReadOnly: () => Boolean,
    GetSelectedDate: () => js.Date,
    GetSelectedDates: () => js.Array[js.Date],
    GetValue: () => Any,
    GetVisible: () => Boolean,
    GetVisibleDate: () => js.Date,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsDateSelected: js.Date => Boolean,
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectDate: js.Date => Unit,
    SelectRange: (js.Date, js.Date) => Unit,
    SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetMaxDate: js.Date => Unit,
    SetMinDate: js.Date => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelectedDate: js.Date => Unit,
    SetValue: Any => Unit,
    SetVisible: Boolean => Unit,
    SetVisibleDate: js.Date => Unit,
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
  
  extension [Self <: ASPxClientCalendar](x: Self) {
    
    inline def setBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "BeginCallback", value.asInstanceOf[js.Any])
    
    inline def setCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "CallbackError", value.asInstanceOf[js.Any])
    
    inline def setCellClick(value: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "CellClick", value.asInstanceOf[js.Any])
    
    inline def setClearSelection(value: () => Unit): Self = StObject.set(x, "ClearSelection", js.Any.fromFunction0(value))
    
    inline def setCustomDisabledDate(value: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "CustomDisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDeselectDate(value: js.Date => Unit): Self = StObject.set(x, "DeselectDate", js.Any.fromFunction1(value))
    
    inline def setDeselectRange(value: (js.Date, js.Date) => Unit): Self = StObject.set(x, "DeselectRange", js.Any.fromFunction2(value))
    
    inline def setEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "EndCallback", value.asInstanceOf[js.Any])
    
    inline def setGetMaxDate(value: () => js.Date): Self = StObject.set(x, "GetMaxDate", js.Any.fromFunction0(value))
    
    inline def setGetMinDate(value: () => js.Date): Self = StObject.set(x, "GetMinDate", js.Any.fromFunction0(value))
    
    inline def setGetSelectedDate(value: () => js.Date): Self = StObject.set(x, "GetSelectedDate", js.Any.fromFunction0(value))
    
    inline def setGetSelectedDates(value: () => js.Array[js.Date]): Self = StObject.set(x, "GetSelectedDates", js.Any.fromFunction0(value))
    
    inline def setGetVisibleDate(value: () => js.Date): Self = StObject.set(x, "GetVisibleDate", js.Any.fromFunction0(value))
    
    inline def setIsDateSelected(value: js.Date => Boolean): Self = StObject.set(x, "IsDateSelected", js.Any.fromFunction1(value))
    
    inline def setKeyDown(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "KeyDown", value.asInstanceOf[js.Any])
    
    inline def setKeyPress(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "KeyPress", value.asInstanceOf[js.Any])
    
    inline def setKeyUp(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "KeyUp", value.asInstanceOf[js.Any])
    
    inline def setSelectDate(value: js.Date => Unit): Self = StObject.set(x, "SelectDate", js.Any.fromFunction1(value))
    
    inline def setSelectRange(value: (js.Date, js.Date) => Unit): Self = StObject.set(x, "SelectRange", js.Any.fromFunction2(value))
    
    inline def setSelectionChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "SelectionChanged", value.asInstanceOf[js.Any])
    
    inline def setSetMaxDate(value: js.Date => Unit): Self = StObject.set(x, "SetMaxDate", js.Any.fromFunction1(value))
    
    inline def setSetMinDate(value: js.Date => Unit): Self = StObject.set(x, "SetMinDate", js.Any.fromFunction1(value))
    
    inline def setSetSelectedDate(value: js.Date => Unit): Self = StObject.set(x, "SetSelectedDate", js.Any.fromFunction1(value))
    
    inline def setSetVisibleDate(value: js.Date => Unit): Self = StObject.set(x, "SetVisibleDate", js.Any.fromFunction1(value))
    
    inline def setVisibleMonthChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]): Self = StObject.set(x, "VisibleMonthChanged", value.asInstanceOf[js.Any])
  }
}
