package typings.devexpressDashWeb

import typings.std.Date
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
  def GetDayNumber(): Double
  /**
    * Gets the duration of the recurrence.
    */
  def GetDuration(): Double
  /**
    * Gets the recurrence end date.
    */
  def GetEnd(): Date
  /**
    * Gets the month (as a number) on which the corresponding appointment recurs.
    */
  def GetMonth(): Double
  /**
    * Gets how many times the appointment occurs.
    */
  def GetOccurrenceCount(): Double
  /**
    * Gets the frequency with which the corresponding appointment reoccurs (dependent on the recurrence Type).
    */
  def GetPeriodicity(): Double
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
  def GetStart(): Date
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
  def SetDayNumber(dayNumber: Double): Unit
  /**
    * Sets the duration of the recurrence.
    * @param duration A TimeSpan object representing the duration.
    */
  def SetDuration(duration: js.Any): Unit
  /**
    * Sets the recurrence end date.
    * @param end A JavaScript Date object that specifies the end date for the recurrence.
    */
  def SetEnd(end: Date): Unit
  /**
    * Sets the month (as a number) on which the corresponding appointment occurs.
    * @param month A positive integer value that specifies the month's number.
    */
  def SetMonth(month: Double): Unit
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  def SetOccurrenceCount(occurrenceCount: Double): Unit
  /**
    * Sets the frequency with which the corresponding appointment occurs (dependent on the recurrence Type).
    * @param periodicity An integer value that specifies the frequency with which the corresponding appointment occurs.
    */
  def SetPeriodicity(periodicity: Double): Unit
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  def SetRange(range: ASPxClientRecurrenceRange): Unit
  /**
    * Sets the time base for the frequency of the corresponding appointment occurrences.
    * @param type An ASPxClientRecurrenceType enumeration value that specifies the recurrence's frequency type.
    */
  def SetRecurrenceType(`type`: ASPxClientRecurrenceType): Unit
  /**
    * Sets the recurrence start date.
    * @param start A JavaScript date object value that specifies the start date for the recurrence.
    */
  def SetStart(start: Date): Unit
  /**
    * Sets the day/days in a week that the corresponding appointment recurs on.
    * @param weekDays The ASPxClientWeekDays enumeration value specifying the day/days in a week.
    */
  def SetWeekDays(weekDays: ASPxClientWeekDays): Unit
  /**
    * Sets the occurrence number of the week in a month for the recurrence pattern.
    * @param weekOfMonth A ASPxClientWeekOfMonth enumeration value that specifies a particular week in every month.
    */
  def SetWeekOfMonth(weekOfMonth: ASPxClientWeekOfMonth): Unit
}

object ASPxClientRecurrenceInfo {
  @scala.inline
  def apply(
    GetDayNumber: () => Double,
    GetDuration: () => Double,
    GetEnd: () => Date,
    GetMonth: () => Double,
    GetOccurrenceCount: () => Double,
    GetPeriodicity: () => Double,
    GetRange: () => ASPxClientRecurrenceRange,
    GetRecurrenceType: () => ASPxClientRecurrenceType,
    GetStart: () => Date,
    GetWeekDays: () => ASPxClientWeekDays,
    GetWeekOfMonth: () => ASPxClientWeekOfMonth,
    SetDayNumber: Double => Unit,
    SetDuration: js.Any => Unit,
    SetEnd: Date => Unit,
    SetMonth: Double => Unit,
    SetOccurrenceCount: Double => Unit,
    SetPeriodicity: Double => Unit,
    SetRange: ASPxClientRecurrenceRange => Unit,
    SetRecurrenceType: ASPxClientRecurrenceType => Unit,
    SetStart: Date => Unit,
    SetWeekDays: ASPxClientWeekDays => Unit,
    SetWeekOfMonth: ASPxClientWeekOfMonth => Unit
  ): ASPxClientRecurrenceInfo = {
    val __obj = js.Dynamic.literal(GetDayNumber = js.Any.fromFunction0(GetDayNumber), GetDuration = js.Any.fromFunction0(GetDuration), GetEnd = js.Any.fromFunction0(GetEnd), GetMonth = js.Any.fromFunction0(GetMonth), GetOccurrenceCount = js.Any.fromFunction0(GetOccurrenceCount), GetPeriodicity = js.Any.fromFunction0(GetPeriodicity), GetRange = js.Any.fromFunction0(GetRange), GetRecurrenceType = js.Any.fromFunction0(GetRecurrenceType), GetStart = js.Any.fromFunction0(GetStart), GetWeekDays = js.Any.fromFunction0(GetWeekDays), GetWeekOfMonth = js.Any.fromFunction0(GetWeekOfMonth), SetDayNumber = js.Any.fromFunction1(SetDayNumber), SetDuration = js.Any.fromFunction1(SetDuration), SetEnd = js.Any.fromFunction1(SetEnd), SetMonth = js.Any.fromFunction1(SetMonth), SetOccurrenceCount = js.Any.fromFunction1(SetOccurrenceCount), SetPeriodicity = js.Any.fromFunction1(SetPeriodicity), SetRange = js.Any.fromFunction1(SetRange), SetRecurrenceType = js.Any.fromFunction1(SetRecurrenceType), SetStart = js.Any.fromFunction1(SetStart), SetWeekDays = js.Any.fromFunction1(SetWeekDays), SetWeekOfMonth = js.Any.fromFunction1(SetWeekOfMonth))
  
    __obj.asInstanceOf[ASPxClientRecurrenceInfo]
  }
}

