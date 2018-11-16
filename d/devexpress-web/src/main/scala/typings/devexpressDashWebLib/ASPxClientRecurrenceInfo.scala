package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
 * Contains information defining the occurrences of a recurring client appointment.
 */

trait ASPxClientRecurrenceInfo extends js.Object {
  /**
       * Gets the ordinal number of a day within a defined month.
       */
  def GetDayNumber(): scala.Double
  /**
       * Gets the duration of the recurrence.
       */
  def GetDuration(): scala.Double
  /**
       * Gets the recurrence end date.
       */
  def GetEnd(): stdLib.Date
  /**
       * Gets the month (as a number) on which the corresponding appointment recurs.
       */
  def GetMonth(): scala.Double
  /**
       * Gets how many times the appointment occurs.
       */
  def GetOccurrenceCount(): scala.Double
  /**
       * Gets the frequency with which the corresponding appointment reoccurs (dependent on the recurrence Type).
       */
  def GetPeriodicity(): scala.Double
  /**
       * Gets the type of the recurrence range.
       */
  def GetRange(): ASPxClientRecurrenceRange
  /**
       * Gets the time base for the frequency of the corresponding appointment reoccurrence.
       */
  def GetRecurrenceType(): ASPxClientRecurrenceType
  /**
       * Gets the recurrence start date.
       */
  def GetStart(): stdLib.Date
  /**
       * Gets the day/days in a week on which the corresponding appointment occurs.
       */
  def GetWeekDays(): ASPxClientWeekDays
  /**
       * Gets the occurrence number of the week in a month for the recurrence pattern.
       */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth
  /**
       * Sets the ordinal number of a day within a defined month.
       * @param dayNumber A positive integer value that specifies the day number within a month.
       */
  def SetDayNumber(dayNumber: scala.Double): scala.Unit
  /**
       * Sets the duration of the recurrence.
       * @param duration A TimeSpan object representing the duration.
       */
  def SetDuration(duration: js.Any): scala.Unit
  /**
       * Sets the recurrence end date.
       * @param end A JavaScript Date object that specifies the end date for the recurrence.
       */
  def SetEnd(end: stdLib.Date): scala.Unit
  /**
       * Sets the month (as a number) on which the corresponding appointment occurs.
       * @param month A positive integer value that specifies the month's number.
       */
  def SetMonth(month: scala.Double): scala.Unit
  /**
       * Sets how many times the appointment occurs.
       * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
       */
  def SetOccurrenceCount(occurrenceCount: scala.Double): scala.Unit
  /**
       * Sets the frequency with which the corresponding appointment occurs (dependent on the recurrence Type).
       * @param periodicity An integer value that specifies the frequency with which the corresponding appointment occurs.
       */
  def SetPeriodicity(periodicity: scala.Double): scala.Unit
  /**
       * Sets the type of the recurrence range.
       * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
       */
  def SetRange(range: ASPxClientRecurrenceRange): scala.Unit
  /**
       * Sets the time base for the frequency of the corresponding appointment occurrences.
       * @param type An ASPxClientRecurrenceType enumeration value that specifies the recurrence's frequency type.
       */
  def SetRecurrenceType(`type`: ASPxClientRecurrenceType): scala.Unit
  /**
       * Sets the recurrence start date.
       * @param start A JavaScript date object value that specifies the start date for the recurrence.
       */
  def SetStart(start: stdLib.Date): scala.Unit
  /**
       * Sets the day/days in a week that the corresponding appointment recurs on.
       * @param weekDays The ASPxClientWeekDays enumeration value specifying the day/days in a week.
       */
  def SetWeekDays(weekDays: ASPxClientWeekDays): scala.Unit
  /**
       * Sets the occurrence number of the week in a month for the recurrence pattern.
       * @param weekOfMonth A ASPxClientWeekOfMonth enumeration value that specifies a particular week in every month.
       */
  def SetWeekOfMonth(weekOfMonth: ASPxClientWeekOfMonth): scala.Unit
}

