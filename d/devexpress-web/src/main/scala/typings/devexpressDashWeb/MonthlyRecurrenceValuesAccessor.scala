package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object providing access to an ASPxClientMonthlyRecurrenceControl's editor values.
  */
trait MonthlyRecurrenceValuesAccessor extends DefaultRecurrenceRuleValuesAccessor

object MonthlyRecurrenceValuesAccessor {
  @scala.inline
  def apply(
    GetDayNumber: () => Double,
    GetMonth: () => Double,
    GetPeriodicity: () => Double,
    GetWeekDays: () => ASPxClientWeekDays,
    GetWeekOfMonth: () => ASPxClientWeekOfMonth
  ): MonthlyRecurrenceValuesAccessor = {
    val __obj = js.Dynamic.literal(GetDayNumber = js.Any.fromFunction0(GetDayNumber), GetMonth = js.Any.fromFunction0(GetMonth), GetPeriodicity = js.Any.fromFunction0(GetPeriodicity), GetWeekDays = js.Any.fromFunction0(GetWeekDays), GetWeekOfMonth = js.Any.fromFunction0(GetWeekOfMonth))
  
    __obj.asInstanceOf[MonthlyRecurrenceValuesAccessor]
  }
}

