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
    GetDayNumber: js.Function0[scala.Double],
    GetDuration: js.Function0[scala.Double],
    GetEnd: js.Function0[stdLib.Date],
    GetMonth: js.Function0[scala.Double],
    GetOccurrenceCount: js.Function0[scala.Double],
    GetPeriodicity: js.Function0[scala.Double],
    GetRange: js.Function0[ASPxClientRecurrenceRange],
    GetRecurrenceType: js.Function0[ASPxClientRecurrenceType],
    GetStart: js.Function0[stdLib.Date],
    GetWeekDays: js.Function0[ASPxClientWeekDays],
    GetWeekOfMonth: js.Function0[ASPxClientWeekOfMonth],
    SetDayNumber: js.Function1[scala.Double, scala.Unit],
    SetDuration: js.Function1[js.Any, scala.Unit],
    SetEnd: js.Function1[stdLib.Date, scala.Unit],
    SetMonth: js.Function1[scala.Double, scala.Unit],
    SetOccurrenceCount: js.Function1[scala.Double, scala.Unit],
    SetPeriodicity: js.Function1[scala.Double, scala.Unit],
    SetRange: js.Function1[ASPxClientRecurrenceRange, scala.Unit],
    SetRecurrenceType: js.Function1[ASPxClientRecurrenceType, scala.Unit],
    SetStart: js.Function1[stdLib.Date, scala.Unit],
    SetWeekDays: js.Function1[ASPxClientWeekDays, scala.Unit],
    SetWeekOfMonth: js.Function1[ASPxClientWeekOfMonth, scala.Unit]
  ): ASPxClientRecurrenceInfo = {
    val __obj = js.Dynamic.literal(GetDayNumber = GetDayNumber, GetDuration = GetDuration, GetEnd = GetEnd, GetMonth = GetMonth, GetOccurrenceCount = GetOccurrenceCount, GetPeriodicity = GetPeriodicity, GetRange = GetRange, GetRecurrenceType = GetRecurrenceType, GetStart = GetStart, GetWeekDays = GetWeekDays, GetWeekOfMonth = GetWeekOfMonth, SetDayNumber = SetDayNumber, SetDuration = SetDuration, SetEnd = SetEnd, SetMonth = SetMonth, SetOccurrenceCount = SetOccurrenceCount, SetPeriodicity = SetPeriodicity, SetRange = SetRange, SetRecurrenceType = SetRecurrenceType, SetStart = SetStart, SetWeekDays = SetWeekDays, SetWeekOfMonth = SetWeekOfMonth)
  
    __obj.asInstanceOf[ASPxClientRecurrenceInfo]
  }
}

