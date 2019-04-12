package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.CalendarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecurrenceRule extends js.Object {
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
  def interval(interval: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def onlyInMonth(month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month): RecurrenceRule
  def onlyInMonths(months: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month]): RecurrenceRule
  def onlyOnMonthDay(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def onlyOnMonthDays(days: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]): RecurrenceRule
  def onlyOnWeek(week: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def onlyOnWeekday(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday): RecurrenceRule
  def onlyOnWeekdays(days: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday]): RecurrenceRule
  def onlyOnWeeks(weeks: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]): RecurrenceRule
  def onlyOnYearDay(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def onlyOnYearDays(days: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer]): RecurrenceRule
  def setTimeZone(timeZone: java.lang.String): EventRecurrence
  def times(times: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): RecurrenceRule
  def until(endDate: stdLib.Date): RecurrenceRule
  def weekStartsOn(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday): RecurrenceRule
}

object RecurrenceRule {
  @scala.inline
  def apply(
    addDailyExclusion: () => RecurrenceRule,
    addDailyRule: () => RecurrenceRule,
    addDate: stdLib.Date => EventRecurrence,
    addDateExclusion: stdLib.Date => EventRecurrence,
    addMonthlyExclusion: () => RecurrenceRule,
    addMonthlyRule: () => RecurrenceRule,
    addWeeklyExclusion: () => RecurrenceRule,
    addWeeklyRule: () => RecurrenceRule,
    addYearlyExclusion: () => RecurrenceRule,
    addYearlyRule: () => RecurrenceRule,
    interval: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => RecurrenceRule,
    onlyInMonth: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month => RecurrenceRule,
    onlyInMonths: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Month] => RecurrenceRule,
    onlyOnMonthDay: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => RecurrenceRule,
    onlyOnMonthDays: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer] => RecurrenceRule,
    onlyOnWeek: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => RecurrenceRule,
    onlyOnWeekday: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday => RecurrenceRule,
    onlyOnWeekdays: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday] => RecurrenceRule,
    onlyOnWeeks: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer] => RecurrenceRule,
    onlyOnYearDay: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => RecurrenceRule,
    onlyOnYearDays: js.Array[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer] => RecurrenceRule,
    setTimeZone: java.lang.String => EventRecurrence,
    times: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => RecurrenceRule,
    until: stdLib.Date => RecurrenceRule,
    weekStartsOn: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday => RecurrenceRule
  ): RecurrenceRule = {
    val __obj = js.Dynamic.literal(addDailyExclusion = js.Any.fromFunction0(addDailyExclusion), addDailyRule = js.Any.fromFunction0(addDailyRule), addDate = js.Any.fromFunction1(addDate), addDateExclusion = js.Any.fromFunction1(addDateExclusion), addMonthlyExclusion = js.Any.fromFunction0(addMonthlyExclusion), addMonthlyRule = js.Any.fromFunction0(addMonthlyRule), addWeeklyExclusion = js.Any.fromFunction0(addWeeklyExclusion), addWeeklyRule = js.Any.fromFunction0(addWeeklyRule), addYearlyExclusion = js.Any.fromFunction0(addYearlyExclusion), addYearlyRule = js.Any.fromFunction0(addYearlyRule), interval = js.Any.fromFunction1(interval), onlyInMonth = js.Any.fromFunction1(onlyInMonth), onlyInMonths = js.Any.fromFunction1(onlyInMonths), onlyOnMonthDay = js.Any.fromFunction1(onlyOnMonthDay), onlyOnMonthDays = js.Any.fromFunction1(onlyOnMonthDays), onlyOnWeek = js.Any.fromFunction1(onlyOnWeek), onlyOnWeekday = js.Any.fromFunction1(onlyOnWeekday), onlyOnWeekdays = js.Any.fromFunction1(onlyOnWeekdays), onlyOnWeeks = js.Any.fromFunction1(onlyOnWeeks), onlyOnYearDay = js.Any.fromFunction1(onlyOnYearDay), onlyOnYearDays = js.Any.fromFunction1(onlyOnYearDays), setTimeZone = js.Any.fromFunction1(setTimeZone), times = js.Any.fromFunction1(times), until = js.Any.fromFunction1(until), weekStartsOn = js.Any.fromFunction1(weekStartsOn))
  
    __obj.asInstanceOf[RecurrenceRule]
  }
}

