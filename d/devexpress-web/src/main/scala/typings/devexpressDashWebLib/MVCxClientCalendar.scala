package typings
package devexpressDashWebLib

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
    AdjustControl: js.Function0[scala.Unit],
    BeginCallback: ASPxClientEvent[MVCxClientBeginCallbackEventHandler[MVCxClientCalendar]],
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
  ): MVCxClientCalendar = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, BeginCallback = BeginCallback, CallbackError = CallbackError, CellClick = CellClick, ClearSelection = ClearSelection, CustomDisabledDate = CustomDisabledDate, DeselectDate = DeselectDate, DeselectRange = DeselectRange, EndCallback = EndCallback, Focus = Focus, GetCaption = GetCaption, GetClientVisible = GetClientVisible, GetEnabled = GetEnabled, GetErrorText = GetErrorText, GetHeight = GetHeight, GetInputElement = GetInputElement, GetIsValid = GetIsValid, GetMainElement = GetMainElement, GetMaxDate = GetMaxDate, GetMinDate = GetMinDate, GetParentControl = GetParentControl, GetReadOnly = GetReadOnly, GetSelectedDate = GetSelectedDate, GetSelectedDates = GetSelectedDates, GetValue = GetValue, GetVisible = GetVisible, GetVisibleDate = GetVisibleDate, GetWidth = GetWidth, GotFocus = GotFocus, InCallback = InCallback, Init = Init, IsDateSelected = IsDateSelected, KeyDown = KeyDown, KeyPress = KeyPress, KeyUp = KeyUp, LostFocus = LostFocus, SelectDate = SelectDate, SelectRange = SelectRange, SelectionChanged = SelectionChanged, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetCaption = SetCaption, SetClientVisible = SetClientVisible, SetEnabled = SetEnabled, SetErrorText = SetErrorText, SetHeight = SetHeight, SetIsValid = SetIsValid, SetMaxDate = SetMaxDate, SetMinDate = SetMinDate, SetReadOnly = SetReadOnly, SetSelectedDate = SetSelectedDate, SetValue = SetValue, SetVisible = SetVisible, SetVisibleDate = SetVisibleDate, SetWidth = SetWidth, Validate = Validate, Validation = Validation, ValueChanged = ValueChanged, VisibleMonthChanged = VisibleMonthChanged, name = name)
  
    __obj.asInstanceOf[MVCxClientCalendar]
  }
}

