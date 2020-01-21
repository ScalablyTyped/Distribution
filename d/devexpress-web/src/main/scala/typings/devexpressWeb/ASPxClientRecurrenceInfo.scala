package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains information defining the occurrences of a recurring client appointment.
  */
@JSGlobal("ASPxClientRecurrenceInfo")
@js.native
/**
  * Initializes a new instance of the ASPxClientRecurrenceInfo class with default settings.
  */
class ASPxClientRecurrenceInfo () extends js.Object {
  /**
    * Gets the ordinal number of a day within a defined month.
    */
  def GetDayNumber(): Double = js.native
  /**
    * Gets the duration of the recurrence.
    */
  def GetDuration(): Double = js.native
  /**
    * Gets the recurrence end date.
    */
  def GetEnd(): Date = js.native
  /**
    * Gets the month (as a number) on which the corresponding appointment recurs.
    */
  def GetMonth(): Double = js.native
  /**
    * Gets how many times the appointment occurs.
    */
  def GetOccurrenceCount(): Double = js.native
  /**
    * Gets the frequency with which the corresponding appointment reoccurs (dependent on the recurrence Type).
    */
  def GetPeriodicity(): Double = js.native
  /**
    * Gets the type of the recurrence range.
    */
  def GetRange(): ASPxClientRecurrenceRange = js.native
  /**
    * Gets the time base for the frequency of the corresponding appointment reoccurrence.
    */
  def GetRecurrenceType(): ASPxClientRecurrenceType = js.native
  /**
    * Gets the recurrence start date.
    */
  def GetStart(): Date = js.native
  /**
    * Gets the day/days in a week on which the corresponding appointment occurs.
    */
  def GetWeekDays(): ASPxClientWeekDays = js.native
  /**
    * Gets the occurrence number of the week in a month for the recurrence pattern.
    */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth = js.native
  /**
    * Sets the ordinal number of a day within a defined month.
    * @param dayNumber A positive integer value that specifies the day number within a month.
    */
  def SetDayNumber(dayNumber: Double): Unit = js.native
  /**
    * Sets the duration of the recurrence.
    * @param duration A TimeSpan object representing the duration.
    */
  def SetDuration(duration: js.Any): Unit = js.native
  /**
    * Sets the recurrence end date.
    * @param end A JavaScript Date object that specifies the end date for the recurrence.
    */
  def SetEnd(end: Date): Unit = js.native
  /**
    * Sets the month (as a number) on which the corresponding appointment occurs.
    * @param month A positive integer value that specifies the month's number.
    */
  def SetMonth(month: Double): Unit = js.native
  /**
    * Sets how many times the appointment occurs.
    * @param occurrenceCount An integer value that specifies how many times the appointment occurs.
    */
  def SetOccurrenceCount(occurrenceCount: Double): Unit = js.native
  /**
    * Sets the frequency with which the corresponding appointment occurs (dependent on the recurrence Type).
    * @param periodicity An integer value that specifies the frequency with which the corresponding appointment occurs.
    */
  def SetPeriodicity(periodicity: Double): Unit = js.native
  /**
    * Sets the type of the recurrence range.
    * @param range An ASPxClientRecurrenceRangeenumeration value that specifies the recurrence range type.
    */
  def SetRange(range: ASPxClientRecurrenceRange): Unit = js.native
  /**
    * Sets the time base for the frequency of the corresponding appointment occurrences.
    * @param type An ASPxClientRecurrenceType enumeration value that specifies the recurrence's frequency type.
    */
  def SetRecurrenceType(`type`: ASPxClientRecurrenceType): Unit = js.native
  /**
    * Sets the recurrence start date.
    * @param start A JavaScript date object value that specifies the start date for the recurrence.
    */
  def SetStart(start: Date): Unit = js.native
  /**
    * Sets the day/days in a week that the corresponding appointment recurs on.
    * @param weekDays The ASPxClientWeekDays enumeration value specifying the day/days in a week.
    */
  def SetWeekDays(weekDays: ASPxClientWeekDays): Unit = js.native
  /**
    * Sets the occurrence number of the week in a month for the recurrence pattern.
    * @param weekOfMonth A ASPxClientWeekOfMonth enumeration value that specifies a particular week in every month.
    */
  def SetWeekOfMonth(weekOfMonth: ASPxClientWeekOfMonth): Unit = js.native
}

