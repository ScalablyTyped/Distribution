package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ASPxDateEdit control.
  */
@js.native
trait ASPxClientDateEdit extends ASPxClientDropDownEditBase {
  
  /**
    * Occurs when an end user clicks a calendar date cell.
    */
  var CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]] = js.native
  
  /**
    * Allows you to disable the calendar's days.
    */
  var CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]] = js.native
  
  /**
    * Fires after the selected date has been changed within the date editor.
    */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]] = js.native
  
  /**
    * Returns the calendar of the date editor.
    */
  def GetCalendar(): ASPxClientCalendar = js.native
  
  /**
    * Gets the date that is the editor's value.
    */
  def GetDate(): Date = js.native
  
  /**
    * Gets the maximum date of the editor.
    */
  def GetMaxDate(): Date = js.native
  
  /**
    * Gets the minimum date of the editor.
    */
  def GetMinDate(): Date = js.native
  
  /**
    * Returns the number of days in a range selected within a date edit.
    */
  def GetRangeDayCount(): Double = js.native
  
  /**
    * Gets the range's length.
    */
  def GetRangeLength(): Double = js.native
  
  /**
    * Returns the built-in time edit control.
    */
  def GetTimeEdit(): ASPxClientTimeEdit = js.native
  
  /**
    * Enables you to convert the value entered by an end user into the value that will be stored by the date editor.
    */
  var ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]] = js.native
  
  /**
    * Specifies the date for the editor.
    * @param date The date.
    */
  def SetDate(date: Date): Unit = js.native
  
  /**
    * Sets the maximum date of the editor.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: Date): Unit = js.native
  
  /**
    * Sets the minimum date of the editor.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: Date): Unit = js.native
  
  /**
    * This event is not in effect for the ASPxClientDateEdit. Use the ASPxClientDateEdit.DateChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientDateEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]] = js.native
}
object ASPxClientDateEdit {
  
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
  ): ASPxClientDateEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), AdjustDropDownWindow = js.Any.fromFunction0(AdjustDropDownWindow), ButtonClick = ButtonClick.asInstanceOf[js.Any], CalendarCellClick = CalendarCellClick.asInstanceOf[js.Any], CalendarCustomDisabledDate = CalendarCustomDisabledDate.asInstanceOf[js.Any], CloseUp = CloseUp.asInstanceOf[js.Any], DateChanged = DateChanged.asInstanceOf[js.Any], DropDown = DropDown.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetButton = js.Any.fromFunction1(GetButton), GetButtonVisible = js.Any.fromFunction1(GetButtonVisible), GetCalendar = js.Any.fromFunction0(GetCalendar), GetCaption = js.Any.fromFunction0(GetCaption), GetCaretPosition = js.Any.fromFunction0(GetCaretPosition), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetDate = js.Any.fromFunction0(GetDate), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaxDate = js.Any.fromFunction0(GetMaxDate), GetMinDate = js.Any.fromFunction0(GetMinDate), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRangeDayCount = js.Any.fromFunction0(GetRangeDayCount), GetRangeLength = js.Any.fromFunction0(GetRangeLength), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetText = js.Any.fromFunction0(GetText), GetTimeEdit = js.Any.fromFunction0(GetTimeEdit), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], HideDropDown = js.Any.fromFunction0(HideDropDown), InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], ParseDate = ParseDate.asInstanceOf[js.Any], QueryCloseUp = QueryCloseUp.asInstanceOf[js.Any], SelectAll = js.Any.fromFunction0(SelectAll), SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetButtonVisible = js.Any.fromFunction2(SetButtonVisible), SetCaption = js.Any.fromFunction1(SetCaption), SetCaretPosition = js.Any.fromFunction1(SetCaretPosition), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetDate = js.Any.fromFunction1(SetDate), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetMaxDate = js.Any.fromFunction1(SetMaxDate), SetMinDate = js.Any.fromFunction1(SetMinDate), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelection = js.Any.fromFunction3(SetSelection), SetText = js.Any.fromFunction1(SetText), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), ShowDropDown = js.Any.fromFunction0(ShowDropDown), TextChanged = TextChanged.asInstanceOf[js.Any], UserInput = UserInput.asInstanceOf[js.Any], Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientDateEdit]
  }
  
  @scala.inline
  implicit class ASPxClientDateEditMutableBuilder[Self <: ASPxClientDateEdit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCalendarCellClick(value: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "CalendarCellClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCalendarCustomDisabledDate(value: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "CalendarCustomDisabledDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "DateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCalendar(value: () => ASPxClientCalendar): Self = StObject.set(x, "GetCalendar", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDate(value: () => Date): Self = StObject.set(x, "GetDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMaxDate(value: () => Date): Self = StObject.set(x, "GetMaxDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMinDate(value: () => Date): Self = StObject.set(x, "GetMinDate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRangeDayCount(value: () => Double): Self = StObject.set(x, "GetRangeDayCount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRangeLength(value: () => Double): Self = StObject.set(x, "GetRangeLength", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTimeEdit(value: () => ASPxClientTimeEdit): Self = StObject.set(x, "GetTimeEdit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParseDate(value: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "ParseDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetDate(value: Date => Unit): Self = StObject.set(x, "SetDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMaxDate(value: Date => Unit): Self = StObject.set(x, "SetMaxDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetMinDate(value: Date => Unit): Self = StObject.set(x, "SetMinDate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTextChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]): Self = StObject.set(x, "TextChanged", value.asInstanceOf[js.Any])
  }
}
