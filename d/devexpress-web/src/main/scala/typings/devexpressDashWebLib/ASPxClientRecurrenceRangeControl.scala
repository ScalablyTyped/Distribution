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

