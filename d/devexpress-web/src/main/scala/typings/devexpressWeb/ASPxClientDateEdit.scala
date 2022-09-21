package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxDateEdit control.
  */
trait ASPxClientDateEdit
  extends StObject
     with ASPxClientDropDownEditBase {
  
  /**
    * Occurs when an end user clicks a calendar date cell.
    */
  var CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]]
  
  /**
    * Allows you to disable the calendar's days.
    */
  var CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]]
  
  /**
    * Occurs on the client after a user changes the selected date in the date editor.
    */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]
  
  /**
    * Returns the calendar of the date editor.
    */
  def GetCalendar(): ASPxClientCalendar
  
  /**
    * Gets the date that is the editor's value.
    */
  def GetDate(): js.Date
  
  /**
    * Gets the maximum date of the editor.
    */
  def GetMaxDate(): js.Date
  
  /**
    * Gets the minimum date of the editor.
    */
  def GetMinDate(): js.Date
  
  /**
    * Returns the number of days in a range selected within a date edit.
    */
  def GetRangeDayCount(): Double
  
  /**
    * Gets the range's length.
    */
  def GetRangeLength(): Double
  
  /**
    * Returns the built-in time edit control.
    */
  def GetTimeEdit(): ASPxClientTimeEdit
  
  /**
    * Enables you to convert the value entered by an end user into the value that will be stored by the date editor.
    */
  var ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]]
  
  /**
    * Specifies the date for the editor.
    * @param date The date.
    */
  def SetDate(date: js.Date): Unit
  
  /**
    * Sets the maximum date of the editor.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: js.Date): Unit
  
  /**
    * Sets the minimum date of the editor.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: js.Date): Unit
  
  /**
    * This event is not in effect for the ASPxClientDateEdit. Use the ASPxClientDateEdit.DateChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientDateEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]
}
object ASPxClientDateEdit {
  
  inline def apply(
    AdjustControl: () => Unit,
    AdjustDropDownWindow: () => Unit,
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]],
    CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    Focus: () => Unit,
    GetButton: Double => Any,
    GetButtonVisible: Double => Boolean,
    GetCalendar: () => ASPxClientCalendar,
    GetCaption: () => String,
    GetCaretPosition: () => Double,
    GetClientVisible: () => Boolean,
    GetDate: () => js.Date,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => Any,
    GetMaxDate: () => js.Date,
    GetMinDate: () => js.Date,
    GetParentControl: () => Any,
    GetRangeDayCount: () => Double,
    GetRangeLength: () => Double,
    GetReadOnly: () => Boolean,
    GetText: () => String,
    GetTimeEdit: () => ASPxClientTimeEdit,
    GetValue: () => Any,
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
    SetDate: js.Date => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetMaxDate: js.Date => Unit,
    SetMinDate: js.Date => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelection: (Double, Double, Boolean) => Unit,
    SetText: String => Unit,
    SetValue: Any => Unit,
    SetVisible: Boolean => Unit,
    SetWidth: Double => Unit,
    ShowDropDown: () => Unit,
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: String
  ): ASPxClientDateEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AdjustDropDownWindow = js.Any.fromFunction0(AdjustDropDownWindow), ButtonClick = ButtonClick.asInstanceOf[js.Any], CalendarCellClick = CalendarCellClick.asInstanceOf[js.Any], CalendarCustomDisabledDate = CalendarCustomDisabledDate.asInstanceOf[js.Any], CloseUp = CloseUp.asInstanceOf[js.Any], DateChanged = DateChanged.asInstanceOf[js.Any], DropDown = DropDown.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCalendar = js.Any.fromFunction0(GetCalendar), GetCaption = js.Any.fromFunction0(GetCaption), GetCaretPosition = js.Any.fromFunction0(GetCaretPosition), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDate = js.Any.fromFunction0(GetDate), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaxDate = js.Any.fromFunction0(GetMaxDate), GetMinDate = js.Any.fromFunction0(GetMinDate), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRangeDayCount = js.Any.fromFunction0(GetRangeDayCount), GetRangeLength = js.Any.fromFunction0(GetRangeLength), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetTimeEdit = js.Any.fromFunction0(GetTimeEdit), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], HideDropDown = js.Any.fromFunction0(HideDropDown), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], ParseDate = ParseDate.asInstanceOf[js.Any], QueryCloseUp = QueryCloseUp.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetButtonVisible = js.Any.fromFunction2(SetButtonVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetCaretPosition = js.Any.fromFunction1(SetCaretPosition), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDate = js.Any.fromFunction1(SetDate), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetMaxDate = js.Any.fromFunction1(SetMaxDate), SetMinDate = js.Any.fromFunction1(SetMinDate), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelection = js.Any.fromFunction3(SetSelection), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowDropDown = js.Any.fromFunction0(ShowDropDown), TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateEdit]
  }
  
  extension [Self <: ASPxClientDateEdit](x: Self) {
    
    inline def setCalendarCellClick(value: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "CalendarCellClick", value.asInstanceOf[js.Any])
    
    inline def setCalendarCustomDisabledDate(value: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "CalendarCustomDisabledDate", value.asInstanceOf[js.Any])
    
    inline def setDateChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "DateChanged", value.asInstanceOf[js.Any])
    
    inline def setGetCalendar(value: () => ASPxClientCalendar): Self = StObject.set(x, "GetCalendar", js.Any.fromFunction0(value))
    
    inline def setGetDate(value: () => js.Date): Self = StObject.set(x, "GetDate", js.Any.fromFunction0(value))
    
    inline def setGetMaxDate(value: () => js.Date): Self = StObject.set(x, "GetMaxDate", js.Any.fromFunction0(value))
    
    inline def setGetMinDate(value: () => js.Date): Self = StObject.set(x, "GetMinDate", js.Any.fromFunction0(value))
    
    inline def setGetRangeDayCount(value: () => Double): Self = StObject.set(x, "GetRangeDayCount", js.Any.fromFunction0(value))
    
    inline def setGetRangeLength(value: () => Double): Self = StObject.set(x, "GetRangeLength", js.Any.fromFunction0(value))
    
    inline def setGetTimeEdit(value: () => ASPxClientTimeEdit): Self = StObject.set(x, "GetTimeEdit", js.Any.fromFunction0(value))
    
    inline def setParseDate(value: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "ParseDate", value.asInstanceOf[js.Any])
    
    inline def setSetDate(value: js.Date => Unit): Self = StObject.set(x, "SetDate", js.Any.fromFunction1(value))
    
    inline def setSetMaxDate(value: js.Date => Unit): Self = StObject.set(x, "SetMaxDate", js.Any.fromFunction1(value))
    
    inline def setSetMinDate(value: js.Date => Unit): Self = StObject.set(x, "SetMinDate", js.Any.fromFunction1(value))
    
    inline def setTextChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "TextChanged", value.asInstanceOf[js.Any])
  }
}
