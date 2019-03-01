package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the RecurrenceRangeControl.
  */
trait ASPxClientRecurrenceRangeControl extends ASPxClientControl {
  /**
    * Gets the recurrence end date.
    */
  def GetEndDate(): stdLib.Date
  /**
    * Gets how many times the appointment occurs.
    */
  def GetOccurrenceCount(): scala.Double
  /**
    * Gets the type of the recurrence range.
    */
  def GetRange(): ASPxClientRecurrenceRange
  /**
    * Sets the recurrence end date.
    * @param date A JavaScript Date object that specifies the end date for the recurrence.
    */
  def SetEndDate(date: stdLib.Date): scala.Unit
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  def SetOccurrenceCount(occurrenceCount: scala.Double): scala.Unit
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  def SetRange(range: ASPxClientRecurrenceRange): scala.Unit
}

object ASPxClientRecurrenceRangeControl {
  @scala.inline
  def apply(
    AdjustControl: js.Function0[scala.Unit],
    GetClientVisible: js.Function0[scala.Boolean],
    GetEndDate: js.Function0[stdLib.Date],
    GetHeight: js.Function0[scala.Double],
    GetMainElement: js.Function0[js.Object],
    GetOccurrenceCount: js.Function0[scala.Double],
    GetParentControl: js.Function0[js.Object],
    GetRange: js.Function0[ASPxClientRecurrenceRange],
    GetVisible: js.Function0[scala.Boolean],
    GetWidth: js.Function0[scala.Double],
    InCallback: js.Function0[scala.Boolean],
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: js.Function1[java.lang.String, scala.Unit],
    SetClientVisible: js.Function1[scala.Boolean, scala.Unit],
    SetEndDate: js.Function1[stdLib.Date, scala.Unit],
    SetHeight: js.Function1[scala.Double, scala.Unit],
    SetOccurrenceCount: js.Function1[scala.Double, scala.Unit],
    SetRange: js.Function1[ASPxClientRecurrenceRange, scala.Unit],
    SetVisible: js.Function1[scala.Boolean, scala.Unit],
    SetWidth: js.Function1[scala.Double, scala.Unit],
    name: java.lang.String
  ): ASPxClientRecurrenceRangeControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AdjustControl")(AdjustControl)
    __obj.updateDynamic("GetClientVisible")(GetClientVisible)
    __obj.updateDynamic("GetEndDate")(GetEndDate)
    __obj.updateDynamic("GetHeight")(GetHeight)
    __obj.updateDynamic("GetMainElement")(GetMainElement)
    __obj.updateDynamic("GetOccurrenceCount")(GetOccurrenceCount)
    __obj.updateDynamic("GetParentControl")(GetParentControl)
    __obj.updateDynamic("GetRange")(GetRange)
    __obj.updateDynamic("GetVisible")(GetVisible)
    __obj.updateDynamic("GetWidth")(GetWidth)
    __obj.updateDynamic("InCallback")(InCallback)
    __obj.updateDynamic("Init")(Init)
    __obj.updateDynamic("SendMessageToAssistiveTechnology")(SendMessageToAssistiveTechnology)
    __obj.updateDynamic("SetClientVisible")(SetClientVisible)
    __obj.updateDynamic("SetEndDate")(SetEndDate)
    __obj.updateDynamic("SetHeight")(SetHeight)
    __obj.updateDynamic("SetOccurrenceCount")(SetOccurrenceCount)
    __obj.updateDynamic("SetRange")(SetRange)
    __obj.updateDynamic("SetVisible")(SetVisible)
    __obj.updateDynamic("SetWidth")(SetWidth)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[ASPxClientRecurrenceRangeControl]
  }
}

