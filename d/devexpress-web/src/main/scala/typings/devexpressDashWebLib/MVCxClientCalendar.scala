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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("BeginCallback")(BeginCallback)
    __obj.updateDynamic("CallbackError")(CallbackError)
    __obj.updateDynamic("CellClick")(CellClick)
    __obj.updateDynamic("ClearSelection")(ClearSelection)
    __obj.updateDynamic("CustomDisabledDate")(CustomDisabledDate)
    __obj.updateDynamic("DeselectDate")(DeselectDate)
    __obj.updateDynamic("DeselectRange")(DeselectRange)
    __obj.updateDynamic("EndCallback")(EndCallback)
    __obj.updateDynamic("Focus")(Focus)
    __obj.updateDynamic("GetCaption")(GetCaption)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEnabled")(GetEnabled)
    __obj.updateDynamic("GetErrorText")(GetErrorText)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetInputElement")(GetInputElement)
    __obj.updateDynamic("GetIsValid")(GetIsValid)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetMaxDate")(GetMaxDate)
    __obj.updateDynamic("GetMinDate")(GetMinDate)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetReadOnly")(GetReadOnly)
    __obj.updateDynamic("GetSelectedDate")(GetSelectedDate)
    __obj.updateDynamic("GetSelectedDates")(GetSelectedDates)
    __obj.updateDynamic("GetValue")(GetValue)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetVisibleDate")(GetVisibleDate)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("GotFocus")(GotFocus)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("IsDateSelected")(IsDateSelected)
    __obj.updateDynamic("KeyDown")(KeyDown)
    __obj.updateDynamic("KeyPress")(KeyPress)
    __obj.updateDynamic("KeyUp")(KeyUp)
    __obj.updateDynamic("LostFocus")(LostFocus)
    __obj.updateDynamic("SelectDate")(SelectDate)
    __obj.updateDynamic("SelectRange")(SelectRange)
    __obj.updateDynamic("SelectionChanged")(SelectionChanged)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetCaption")(SetCaption)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetEnabled")(SetEnabled)
    __obj.updateDynamic("SetErrorText")(SetErrorText)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetIsValid")(SetIsValid)
    __obj.updateDynamic("SetMaxDate")(SetMaxDate)
    __obj.updateDynamic("SetMinDate")(SetMinDate)
    __obj.updateDynamic("SetReadOnly")(SetReadOnly)
    __obj.updateDynamic("SetSelectedDate")(SetSelectedDate)
    __obj.updateDynamic("SetValue")(SetValue)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetVisibleDate")(SetVisibleDate)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("Validate")(Validate)
    __obj.updateDynamic("Validation")(Validation)
    __obj.updateDynamic("ValueChanged")(ValueChanged)
    __obj.updateDynamic("VisibleMonthChanged")(VisibleMonthChanged)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[MVCxClientCalendar]
  }
}

