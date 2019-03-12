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

object ASPxClientRecurrenceInfo {
  @scala.inline
  def apply(
    GetDayNumber: () => scala.Double,
    GetDuration: () => scala.Double,
    GetEnd: () => stdLib.Date,
    GetMonth: () => scala.Double,
    GetOccurrenceCount: () => scala.Double,
    GetPeriodicity: () => scala.Double,
    GetRange: () => ASPxClientRecurrenceRange,
    GetRecurrenceType: () => ASPxClientRecurrenceType,
    GetStart: () => stdLib.Date,
    GetWeekDays: () => ASPxClientWeekDays,
    GetWeekOfMonth: () => ASPxClientWeekOfMonth,
    SetDayNumber: scala.Double => scala.Unit,
    SetDuration: js.Any => scala.Unit,
    SetEnd: stdLib.Date => scala.Unit,
    SetMonth: scala.Double => scala.Unit,
    SetOccurrenceCount: scala.Double => scala.Unit,
    SetPeriodicity: scala.Double => scala.Unit,
    SetRange: ASPxClientRecurrenceRange => scala.Unit,
    SetRecurrenceType: ASPxClientRecurrenceType => scala.Unit,
    SetStart: stdLib.Date => scala.Unit,
    SetWeekDays: ASPxClientWeekDays => scala.Unit,
    SetWeekOfMonth: ASPxClientWeekOfMonth => scala.Unit
  ): ASPxClientRecurrenceInfo = {
    val __obj = js.Dynamic.literal(GetDayNumber = js.Any.fromFunction0(GetDayNumber), GetDuration = js.Any.fromFunction0(GetDuration), GetEnd = js.Any.fromFunction0(GetEnd), GetMonth = js.Any.fromFunction0(GetMonth), GetOccurrenceCount = js.Any.fromFunction0(GetOccurrenceCount), GetPeriodicity = js.Any.fromFunction0(GetPeriodicity), GetRange = js.Any.fromFunction0(GetRange), GetRecurrenceType = js.Any.fromFunction0(GetRecurrenceType), GetStart = js.Any.fromFunction0(GetStart), GetWeekDays = js.Any.fromFunction0(GetWeekDays), GetWeekOfMonth = js.Any.fromFunction0(GetWeekOfMonth), SetDayNumber = js.Any.fromFunction1(SetDayNumber), SetDuration = js.Any.fromFunction1(SetDuration), SetEnd = js.Any.fromFunction1(SetEnd), SetMonth = js.Any.fromFunction1(SetMonth), SetOccurrenceCount = js.Any.fromFunction1(SetOccurrenceCount), SetPeriodicity = js.Any.fromFunction1(SetPeriodicity), SetRange = js.Any.fromFunction1(SetRange), SetRecurrenceType = js.Any.fromFunction1(SetRecurrenceType), SetStart = js.Any.fromFunction1(SetStart), SetWeekDays = js.Any.fromFunction1(SetWeekDays), SetWeekOfMonth = js.Any.fromFunction1(SetWeekOfMonth))
  
    __obj.asInstanceOf[ASPxClientRecurrenceInfo]
  }
}

