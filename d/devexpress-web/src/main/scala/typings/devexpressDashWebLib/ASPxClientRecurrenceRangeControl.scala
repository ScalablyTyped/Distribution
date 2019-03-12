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
    AdjustControl: () => scala.Unit,
    GetClientVisible: () => scala.Boolean,
    GetEndDate: () => stdLib.Date,
    GetHeight: () => scala.Double,
    GetMainElement: () => js.Object,
    GetOccurrenceCount: () => scala.Double,
    GetParentControl: () => js.Object,
    GetRange: () => ASPxClientRecurrenceRange,
    GetVisible: () => scala.Boolean,
    GetWidth: () => scala.Double,
    InCallback: () => scala.Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    SendMessageToAssistiveTechnology: java.lang.String => scala.Unit,
    SetClientVisible: scala.Boolean => scala.Unit,
    SetEndDate: stdLib.Date => scala.Unit,
    SetHeight: scala.Double => scala.Unit,
    SetOccurrenceCount: scala.Double => scala.Unit,
    SetRange: ASPxClientRecurrenceRange => scala.Unit,
    SetVisible: scala.Boolean => scala.Unit,
    SetWidth: scala.Double => scala.Unit,
    name: java.lang.String
  ): ASPxClientRecurrenceRangeControl = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEndDate = js.Any.fromFunction0(GetEndDate), GetHeight = js.Any.fromFunction0(GetHeight), GetMainElement = js.Any.fromFunction0(GetMainElement), GetOccurrenceCount = js.Any.fromFunction0(GetOccurrenceCount), GetParentControl = js.Any.fromFunction0(GetParentControl), GetRange = js.Any.fromFunction0(GetRange), GetVisible = js.Any.fromFunction0(GetVisible), GetWidth = js.Any.fromFunction0(GetWidth), InCallback = js.Any.fromFunction0(InCallback), Init = Init, SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEndDate = js.Any.fromFunction1(SetEndDate), SetHeight = js.Any.fromFunction1(SetHeight), SetOccurrenceCount = js.Any.fromFunction1(SetOccurrenceCount), SetRange = js.Any.fromFunction1(SetRange), SetVisible = js.Any.fromFunction1(SetVisible), SetWidth = js.Any.fromFunction1(SetWidth), name = name)
  
    __obj.asInstanceOf[ASPxClientRecurrenceRangeControl]
  }
}

