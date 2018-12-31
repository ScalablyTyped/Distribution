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

