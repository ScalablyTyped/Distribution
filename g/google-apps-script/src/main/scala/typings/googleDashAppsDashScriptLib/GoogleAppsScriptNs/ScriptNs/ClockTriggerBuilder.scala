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

object ClockTriggerBuilder {
  @scala.inline
  def apply(
    after: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ClockTriggerBuilder,
    at: stdLib.Date => ClockTriggerBuilder,
    atDate: (googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer) => ClockTriggerBuilder,
    atHour: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ClockTriggerBuilder,
    create: () => Trigger,
    everyDays: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ClockTriggerBuilder,
    everyHours: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ClockTriggerBuilder,
    everyMinutes: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ClockTriggerBuilder,
    everyWeeks: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ClockTriggerBuilder,
    inTimezone: java.lang.String => ClockTriggerBuilder,
    nearMinute: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ClockTriggerBuilder,
    onMonthDay: googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer => ClockTriggerBuilder,
    onWeekDay: googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday => ClockTriggerBuilder
  ): ClockTriggerBuilder = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), at = js.Any.fromFunction1(at), atDate = js.Any.fromFunction3(atDate), atHour = js.Any.fromFunction1(atHour), create = js.Any.fromFunction0(create), everyDays = js.Any.fromFunction1(everyDays), everyHours = js.Any.fromFunction1(everyHours), everyMinutes = js.Any.fromFunction1(everyMinutes), everyWeeks = js.Any.fromFunction1(everyWeeks), inTimezone = js.Any.fromFunction1(inTimezone), nearMinute = js.Any.fromFunction1(nearMinute), onMonthDay = js.Any.fromFunction1(onMonthDay), onWeekDay = js.Any.fromFunction1(onWeekDay))
  
    __obj.asInstanceOf[ClockTriggerBuilder]
  }
}

