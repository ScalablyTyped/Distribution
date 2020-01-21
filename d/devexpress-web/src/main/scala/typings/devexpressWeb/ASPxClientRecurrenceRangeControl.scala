package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a client-side equivalent of the RecurrenceRangeControl.
  */
@JSGlobal("ASPxClientRecurrenceRangeControl")
@js.native
class ASPxClientRecurrenceRangeControl () extends ASPxClientControl {
  /**
    * Gets the recurrence end date.
    */
  def GetEndDate(): Date = js.native
  /**
    * Gets how many times the appointment occurs.
    */
  def GetOccurrenceCount(): Double = js.native
  /**
    * Gets the type of the recurrence range.
    */
  def GetRange(): ASPxClientRecurrenceRange = js.native
  /**
    * Sets the recurrence end date.
    * @param date A JavaScript Date object that specifies the end date for the recurrence.
    */
  def SetEndDate(date: Date): Unit = js.native
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  def SetOccurrenceCount(occurrenceCount: Double): Unit = js.native
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  def SetRange(range: ASPxClientRecurrenceRange): Unit = js.native
}

