package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ScriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClockTriggerBuilder extends js.Object {
  def after(durationMilliseconds: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClockTriggerBuilder
  def at(date: stdLib.Date): ClockTriggerBuilder
  def atDate(
    year: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    month: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer,
    day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer
  ): ClockTriggerBuilder
  def atHour(hour: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClockTriggerBuilder
  def create(): Trigger
  def everyDays(n: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClockTriggerBuilder
  def everyHours(n: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClockTriggerBuilder
  def everyMinutes(n: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClockTriggerBuilder
  def everyWeeks(n: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClockTriggerBuilder
  def inTimezone(timezone: java.lang.String): ClockTriggerBuilder
  def nearMinute(minute: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClockTriggerBuilder
  def onMonthDay(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer): ClockTriggerBuilder
  def onWeekDay(day: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday): ClockTriggerBuilder
}

