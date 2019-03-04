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
    after: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ClockTriggerBuilder],
    at: js.Function1[stdLib.Date, ClockTriggerBuilder],
    atDate: js.Function3[
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, 
      ClockTriggerBuilder
    ],
    atHour: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ClockTriggerBuilder],
    create: js.Function0[Trigger],
    everyDays: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ClockTriggerBuilder],
    everyHours: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ClockTriggerBuilder],
    everyMinutes: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ClockTriggerBuilder],
    everyWeeks: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ClockTriggerBuilder],
    inTimezone: js.Function1[java.lang.String, ClockTriggerBuilder],
    nearMinute: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ClockTriggerBuilder],
    onMonthDay: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.Integer, ClockTriggerBuilder],
    onWeekDay: js.Function1[googleDashAppsDashScriptLib.GoogleAppsScriptNs.BaseNs.Weekday, ClockTriggerBuilder]
  ): ClockTriggerBuilder = {
    val __obj = js.Dynamic.literal(after = after, at = at, atDate = atDate, atHour = atHour, create = create, everyDays = everyDays, everyHours = everyHours, everyMinutes = everyMinutes, everyWeeks = everyWeeks, inTimezone = inTimezone, nearMinute = nearMinute, onMonthDay = onMonthDay, onWeekDay = onWeekDay)
  
    __obj.asInstanceOf[ClockTriggerBuilder]
  }
}

