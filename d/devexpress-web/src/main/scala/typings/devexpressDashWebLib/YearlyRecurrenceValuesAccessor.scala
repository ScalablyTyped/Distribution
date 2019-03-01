package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object providing access to an ASPxClientYearlyRecurrenceControl's editor values.
  */
trait YearlyRecurrenceValuesAccessor extends DefaultRecurrenceRuleValuesAccessor

object YearlyRecurrenceValuesAccessor {
  @scala.inline
  def apply(
    GetDayNumber: js.Function0[scala.Double],
    GetMonth: js.Function0[scala.Double],
    GetPeriodicity: js.Function0[scala.Double],
    GetWeekDays: js.Function0[ASPxClientWeekDays],
    GetWeekOfMonth: js.Function0[ASPxClientWeekOfMonth]
  ): YearlyRecurrenceValuesAccessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("GetDayNumber")(GetDayNumber)
    __obj.updateDynamic("GetMonth")(GetMonth)
    __obj.updateDynamic("GetPeriodicity")(GetPeriodicity)
    __obj.updateDynamic("GetWeekDays")(GetWeekDays)
    __obj.updateDynamic("GetWeekOfMonth")(GetWeekOfMonth)
    __obj.asInstanceOf[YearlyRecurrenceValuesAccessor]
  }
}

