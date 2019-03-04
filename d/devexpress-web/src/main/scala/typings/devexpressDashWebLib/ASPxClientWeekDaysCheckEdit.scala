package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the WeekDaysCheckEdit control.
  */
trait ASPxClientWeekDaysCheckEdit extends ASPxClientControl {
  /**
    * Gets the selection state of the week day check boxes.
    */
  def GetValue(): ASPxClientWeekDays
  /**
    * Gets the selection state of the week day check boxes.
    * @param value An ASPxClientWeekDays object specifying the selection state of the week day check boxes.
    */
  def SetValue(value: ASPxClientWeekDays): scala.Unit
}

object ASPxClientWeekDaysCheckEdit {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetParentControl: js.Function0[js.Object],
    GetValue: js.Function0[ASPxClientWeekDays],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetValue: js.Function1[ASPxClientWeekDays, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientWeekDaysCheckEdit = {
    val __obj = js.Dynamic.literal(AdjustControl = AdjustControl, GetClientVisible = GetClientVisible, GetHeight = GetHeight, GetMainElement = GetMainElement, GetParentControl = GetParentControl, GetValue = GetValue, GetVisible = GetVisible, GetWidth = GetWidth, InCallback = InCallback, Init = Init, SendMessageToAssistiveTechnology = SendMessageToAssistiveTechnology, SetClientVisible = SetClientVisible, SetHeight = SetHeight, SetValue = SetValue, SetVisible = SetVisible, SetWidth = SetWidth, name = name)
  
    __obj.asInstanceOf[ASPxClientWeekDaysCheckEdit]
  }
}

