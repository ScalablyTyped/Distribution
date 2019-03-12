package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object providing access to an ASPxClientRecurrenceControlBase control's editor values.
  */
trait DefaultRecurrenceRuleValuesAccessor extends js.Object {
  /**
    * Gets the number of the month's day in which the appointment is scheduled.
    */
  def GetDayNumber(): scala.Double
  /**
    * Gets or sets the month's number.
    */
  def GetMonth(): scala.Double
  /**
    * Get the frequency with which the appointment occurs with respect to the appointment's recurrence type.
    */
  def GetPeriodicity(): scala.Double
  /**
    * Gets the days of the week on which a weekly recurrent appointment is scheduled.
    */
  def GetWeekDays(): ASPxClientWeekDays
  /**
    * Gets the number of the week in a month when an appointment is scheduled.
    */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth
}

object DefaultRecurrenceRuleValuesAccessor {
  @scala.inline
  def apply(
    GetDayNumber: () => scala.Double,
    GetMonth: () => scala.Double,
    GetPeriodicity: () => scala.Double,
    GetWeekDays: () => ASPxClientWeekDays,
    GetWeekOfMonth: () => ASPxClientWeekOfMonth
  ): DefaultRecurrenceRuleValuesAccessor = {
    val __obj = js.Dynamic.literal(GetDayNumber = js.Any.fromFunction0(GetDayNumber), GetMonth = js.Any.fromFunction0(GetMonth), GetPeriodicity = js.Any.fromFunction0(GetPeriodicity), GetWeekDays = js.Any.fromFunction0(GetWeekDays), GetWeekOfMonth = js.Any.fromFunction0(GetWeekOfMonth))
  
    __obj.asInstanceOf[DefaultRecurrenceRuleValuesAccessor]
  }
}

