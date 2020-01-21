package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object providing access to an ASPxClientRecurrenceControlBase control's editor values.
  */
@JSGlobal("DefaultRecurrenceRuleValuesAccessor")
@js.native
class DefaultRecurrenceRuleValuesAccessor protected () extends js.Object {
  /**
    * Initializes a new instance of the DefaultRecurrenceRuleValuesAccessor object. For internal use only.
    */
  def this(recurrenceControl: ASPxClientRecurrenceControlBase) = this()
  /**
    * Gets the number of the month's day in which the appointment is scheduled.
    */
  def GetDayNumber(): Double = js.native
  /**
    * Gets or sets the month's number.
    */
  def GetMonth(): Double = js.native
  /**
    * Get the frequency with which the appointment occurs with respect to the appointment's recurrence type.
    */
  def GetPeriodicity(): Double = js.native
  /**
    * Gets the days of the week on which a weekly recurrent appointment is scheduled.
    */
  def GetWeekDays(): ASPxClientWeekDays = js.native
  /**
    * Gets the number of the week in a month when an appointment is scheduled.
    */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth = js.native
}

