package typings
package devexpressDashWebLib

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
    GetDayNumber: js.Function0[scala.Double],
    GetMonth: js.Function0[scala.Double],
    GetPeriodicity: js.Function0[scala.Double],
    GetWeekDays: js.Function0[ASPxClientWeekDays],
    GetWeekOfMonth: js.Function0[ASPxClientWeekOfMonth]
  ): MonthlyRecurrenceValuesAccessor = {
    val __obj = js.Dynamic.literal(GetDayNumber = GetDayNumber, GetMonth = GetMonth, GetPeriodicity = GetPeriodicity, GetWeekDays = GetWeekDays, GetWeekOfMonth = GetWeekOfMonth)
  
    __obj.asInstanceOf[MonthlyRecurrenceValuesAccessor]
  }
}

