package typings.googleDashAppsDashScript.GoogleAppsScript.Script

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Weekday
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClockTriggerBuilder extends js.Object {
  def after(durationMilliseconds: Integer): ClockTriggerBuilder
  def at(date: Date): ClockTriggerBuilder
  def atDate(year: Integer, month: Integer, day: Integer): ClockTriggerBuilder
  def atHour(hour: Integer): ClockTriggerBuilder
  def create(): Trigger
  def everyDays(n: Integer): ClockTriggerBuilder
  def everyHours(n: Integer): ClockTriggerBuilder
  def everyMinutes(n: Integer): ClockTriggerBuilder
  def everyWeeks(n: Integer): ClockTriggerBuilder
  def inTimezone(timezone: String): ClockTriggerBuilder
  def nearMinute(minute: Integer): ClockTriggerBuilder
  def onMonthDay(day: Integer): ClockTriggerBuilder
  def onWeekDay(day: Weekday): ClockTriggerBuilder
}

object ClockTriggerBuilder {
  @scala.inline
  def apply(
    after: Integer => ClockTriggerBuilder,
    at: Date => ClockTriggerBuilder,
    atDate: (Integer, Integer, Integer) => ClockTriggerBuilder,
    atHour: Integer => ClockTriggerBuilder,
    create: () => Trigger,
    everyDays: Integer => ClockTriggerBuilder,
    everyHours: Integer => ClockTriggerBuilder,
    everyMinutes: Integer => ClockTriggerBuilder,
    everyWeeks: Integer => ClockTriggerBuilder,
    inTimezone: String => ClockTriggerBuilder,
    nearMinute: Integer => ClockTriggerBuilder,
    onMonthDay: Integer => ClockTriggerBuilder,
    onWeekDay: Weekday => ClockTriggerBuilder
  ): ClockTriggerBuilder = {
    val __obj = js.Dynamic.literal(after = js.Any.fromFunction1(after), at = js.Any.fromFunction1(at), atDate = js.Any.fromFunction3(atDate), atHour = js.Any.fromFunction1(atHour), create = js.Any.fromFunction0(create), everyDays = js.Any.fromFunction1(everyDays), everyHours = js.Any.fromFunction1(everyHours), everyMinutes = js.Any.fromFunction1(everyMinutes), everyWeeks = js.Any.fromFunction1(everyWeeks), inTimezone = js.Any.fromFunction1(inTimezone), nearMinute = js.Any.fromFunction1(nearMinute), onMonthDay = js.Any.fromFunction1(onMonthDay), onWeekDay = js.Any.fromFunction1(onWeekDay))
  
    __obj.asInstanceOf[ClockTriggerBuilder]
  }
}

