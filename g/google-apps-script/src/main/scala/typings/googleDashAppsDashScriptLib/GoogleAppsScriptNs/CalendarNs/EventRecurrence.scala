package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventRecurrence extends js.Object {
  def addDailyExclusion(): RecurrenceRule
  def addDailyRule(): RecurrenceRule
  def addDate(date: stdLib.Date): EventRecurrence
  def addDateExclusion(date: stdLib.Date): EventRecurrence
  def addMonthlyExclusion(): RecurrenceRule
  def addMonthlyRule(): RecurrenceRule
  def addWeeklyExclusion(): RecurrenceRule
  def addWeeklyRule(): RecurrenceRule
  def addYearlyExclusion(): RecurrenceRule
  def addYearlyRule(): RecurrenceRule
  def setTimeZone(timeZone: java.lang.String): EventRecurrence
}

object EventRecurrence {
  @scala.inline
  def apply(
    addDailyExclusion: js.Function0[RecurrenceRule],
    addDailyRule: js.Function0[RecurrenceRule],
    addDate: js.Function1[stdLib.Date, EventRecurrence],
    addDateExclusion: js.Function1[stdLib.Date, EventRecurrence],
    addMonthlyExclusion: js.Function0[RecurrenceRule],
    addMonthlyRule: js.Function0[RecurrenceRule],
    addWeeklyExclusion: js.Function0[RecurrenceRule],
    addWeeklyRule: js.Function0[RecurrenceRule],
    addYearlyExclusion: js.Function0[RecurrenceRule],
    addYearlyRule: js.Function0[RecurrenceRule],
    setTimeZone: js.Function1[java.lang.String, EventRecurrence]
  ): EventRecurrence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addDailyExclusion")(addDailyExclusion)
    __obj.updateDynamic("addDailyRule")(addDailyRule)
    __obj.updateDynamic("addDate")(addDate)
    __obj.updateDynamic("addDateExclusion")(addDateExclusion)
    __obj.updateDynamic("addMonthlyExclusion")(addMonthlyExclusion)
    __obj.updateDynamic("addMonthlyRule")(addMonthlyRule)
    __obj.updateDynamic("addWeeklyExclusion")(addWeeklyExclusion)
    __obj.updateDynamic("addWeeklyRule")(addWeeklyRule)
    __obj.updateDynamic("addYearlyExclusion")(addYearlyExclusion)
    __obj.updateDynamic("addYearlyRule")(addYearlyRule)
    __obj.updateDynamic("setTimeZone")(setTimeZone)
    __obj.asInstanceOf[EventRecurrence]
  }
}

