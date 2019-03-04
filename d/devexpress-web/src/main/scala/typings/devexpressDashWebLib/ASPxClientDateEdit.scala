package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxDateEdit control.
  */
trait ASPxClientDateEdit extends ASPxClientDropDownEditBase {
  /**
    * Occurs when an end user clicks a calendar date cell.
    */
  var CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]]
  /**
    * Allows you to disable the calendar's days.
    */
  var CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]]
  /**
    * Fires after the selected date has been changed within the date editor.
    */
  var DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]
  /**
    * Enables you to convert the value entered by an end user into the value that will be stored by the date editor.
    */
  var ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]]
  /**
    * This event is not in effect for the ASPxClientDateEdit. Use the DateChanged event instead.
    */
  @JSName("TextChanged")
  var TextChanged_ASPxClientDateEdit: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]]
  /**
    * Returns the calendar of the date editor.
    */
  def GetCalendar(): ASPxClientCalendar
  /**
    * Gets the date that is the editor's value.
    */
  def GetDate(): stdLib.Date
  /**
    * Gets the maximum date of the editor.
    */
  def GetMaxDate(): stdLib.Date
  /**
    * Gets the minimum date of the editor.
    */
  def GetMinDate(): stdLib.Date
  /**
    * Returns the number of days in a range selected within a date edit.
    */
  def GetRangeDayCount(): scala.Double
  /**
    * Gets the range length.
    */
  def GetRangeLength(): scala.Double
  /**
    * Returns the built-in time edit control.
    */
  def GetTimeEdit(): ASPxClientTimeEdit
  /**
    * Specifies the date for the editor.
    * @param date A DateTime object that is the date.
    */
  def SetDate(date: stdLib.Date): scala.Unit
  /**
    * Sets the maximum date of the editor.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: stdLib.Date): scala.Unit
  /**
    * Sets the minimum date of the editor.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: stdLib.Date): scala.Unit
}

object ASPxClientDateEdit {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    AdjustDropDownWindow: js.Function0[scala.Unit],
    ButtonClick: ASPxClientEvent[ASPxClientButtonEditClickEventHandler[ASPxClientButtonEditBase]],
    CalendarCellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientDateEdit]],
    CalendarCustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientDateEdit]],
    CloseUp: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    DateChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]],
    DropDown: ASPxClientEvent[ASPxClientEventHandler[ASPxClientDropDownEditBase]],
    Focus: js.Function0[scala.Unit],
    GetButtonVisible: js.Function1[scala.Double, scala.Boolean],
    GetCalendar: js.Function0[ASPxClientCalendar],
    GetCaption: js.Function0[java.lang.String],
    GetCaretPosition: js.Function0[scala.Double],
    GetClientVisible: js.Function0[scala.Boolean],
    GetDate: js.Function0[stdLib.Date],
    GetEnabled: js.Function0[scala.Boolean],
    GetErrorText: js.Function0[java.lang.String],
    GetHeight: js.Function0[scala.Double],
    GetInputElement: js.Function0[js.Object],
    GetIsValid: js.Function0[scala.Boolean],
    GetMainElement: js.Function0[js.Object],
    GetMaxDate: js.Function0[stdLib.Date],
    GetMinDate: js.Function0[stdLib.Date],
    GetParentControl: js.Function0[js.Object],
    GetRangeDayCount: js.Function0[scala.Double],
    GetRangeLength: js.Function0[scala.Double],
    GetReadOnly: js.Function0[scala.Boolean],
    GetText: js.Function0[java.lang.String],
    GetTimeEdit: js.Function0[ASPxClientTimeEdit],
    GetValue: js.Function0[js.Object],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    HideDropDown: js.Function0[scala.Unit],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientTextEdit]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    ParseDate: ASPxClientEvent[ASPxClientParseDateEventHandler[ASPxClientDateEdit]],
    QueryCloseUp: ASPxClientEvent[ASPxClientCancelEventHandler[ASPxClientDropDownEditBase]],
    SelectAll: js.Function0[scala.Unit],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetButtonVisible: js.Function2[scala.Double, scala.Boolean, scala.Unit],
    SetCaption: js.Function1[java.lang.String, scala.Unit],
    SetCaretPosition: js.Function1[scala.Double, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetDate: js.Function1[stdLib.Date, scala.Unit],
    SetEnabled: js.Function1[scala.Boolean, scala.Unit],
    SetErrorText: js.Function1[java.lang.String, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetIsValid: js.Function1[scala.Boolean, scala.Unit],
    SetMaxDate: js.Function1[stdLib.Date, scala.Unit],
    SetMinDate: js.Function1[stdLib.Date, scala.Unit],
    SetReadOnly: js.Function1[scala.Boolean, scala.Unit],
    SetSelection: js.Function3[scala.Double, scala.Double, scala.Boolean, scala.Unit],
    SetText: js.Function1[java.lang.String, scala.Unit],
    SetValue: js.Function1[js.Object, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    ShowDropDown: js.Function0[scala.Unit],
    TextChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientDateEdit]],
    UserInput: ASPxClientEvent[ASPxClientEventHandler[ASPxClientTextEdit]],
    Validate: js.Function0[scala.Unit],
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    name: java.lang.String
  ): ASPxClientDateEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, AdjustDropDownWindow = AdjustDropDownWindow, ButtonClick = ButtonClick, CalendarCellClick = CalendarCellClick, CalendarCustomDisabledDate = CalendarCustomDisabledDate, CloseUp = CloseUp, DateChanged = DateChanged, DropDown = DropDown, Focus = Focus, GetButtonVisible = GetButtonVisible, GetCalendar = GetCalendar, GetCaption = GetCaption, GetCaretPosition = GetCaretPosition, GetClientVisible = GetClientVisible, GetDate = GetDate, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetMainElement = GetMainElement, GetMaxDate = GetMaxDate, GetMinDate = GetMinDate, GetParentControl = GetParentControl, GetRangeDayCount = GetRangeDayCount, GetRangeLength = GetRangeLength, GetReadOnly = GetReadOnly, GetText = GetText, GetTimeEdit = GetTimeEdit, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, GotFocus = GotFocus, HideDropDown = HideDropDown, InCallback = InCallback, Init = Init, KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, ParseDate = ParseDate, QueryCloseUp = QueryCloseUp, SelectAll = SelectAll, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetButtonVisible = SetButtonVisible, SetCaption = SetCaption, SetCaretPosition = SetCaretPosition, SetClientVisible = SetClientVisible, SetDate = SetDate, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetMaxDate = SetMaxDate, SetMinDate = SetMinDate, SetReadOnly = SetReadOnly, SetSelection = SetSelection, SetText = SetText, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, ShowDropDown = ShowDropDown, TextChanged = TextChanged, UserInput = UserInput, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, name = name)
  
    __obj.asInstanceOf[ASPxClientDateEdit]
  }
}

