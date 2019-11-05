package typings.googleDashAppsDashScript.GoogleAppsScript.Calendar

import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Date
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Month
import typings.googleDashAppsDashScript.GoogleAppsScript.Base.Weekday
import typings.googleDashAppsDashScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a recurrence rule for an event series.
  *
  * Note that this class also behaves like the EventRecurrence that it belongs to,
  * allowing you to chain rule creation together like so:
  *
  *     recurrence.addDailyRule().times(3).interval(2).addWeeklyExclusion().times(2);
  *
  * times(times)
  * interval(interval)
  */
trait RecurrenceRule extends js.Object {
  def addDailyExclusion(): RecurrenceRule
  def addDailyRule(): RecurrenceRule
  def addDate(date: Date): EventRecurrence
  def addDateExclusion(date: Date): EventRecurrence
  def addMonthlyExclusion(): RecurrenceRule
  def addMonthlyRule(): RecurrenceRule
  def addWeeklyExclusion(): RecurrenceRule
  def addWeeklyRule(): RecurrenceRule
  def addYearlyExclusion(): RecurrenceRule
  def addYearlyRule(): RecurrenceRule
  def interval(interval: Integer): RecurrenceRule
  def onlyInMonth(month: Month): RecurrenceRule
  def onlyInMonths(months: js.Array[Month]): RecurrenceRule
  def onlyOnMonthDay(day: Integer): RecurrenceRule
  def onlyOnMonthDays(days: js.Array[Integer]): RecurrenceRule
  def onlyOnWeek(week: Integer): RecurrenceRule
  def onlyOnWeekday(day: Weekday): RecurrenceRule
  def onlyOnWeekdays(days: js.Array[Weekday]): RecurrenceRule
  def onlyOnWeeks(weeks: js.Array[Integer]): RecurrenceRule
  def onlyOnYearDay(day: Integer): RecurrenceRule
  def onlyOnYearDays(days: js.Array[Integer]): RecurrenceRule
  def setTimeZone(timeZone: String): EventRecurrence
  def times(times: Integer): RecurrenceRule
  def until(endDate: Date): RecurrenceRule
  def weekStartsOn(day: Weekday): RecurrenceRule
}

object RecurrenceRule {
  @scala.inline
  def apply(
    addDailyExclusion: () => RecurrenceRule,
    addDailyRule: () => RecurrenceRule,
    addDate: Date => EventRecurrence,
    addDateExclusion: Date => EventRecurrence,
    addMonthlyExclusion: () => RecurrenceRule,
    addMonthlyRule: () => RecurrenceRule,
    addWeeklyExclusion: () => RecurrenceRule,
    addWeeklyRule: () => RecurrenceRule,
    addYearlyExclusion: () => RecurrenceRule,
    addYearlyRule: () => RecurrenceRule,
    interval: Integer => RecurrenceRule,
    onlyInMonth: Month => RecurrenceRule,
    onlyInMonths: js.Array[Month] => RecurrenceRule,
    onlyOnMonthDay: Integer => RecurrenceRule,
    onlyOnMonthDays: js.Array[Integer] => RecurrenceRule,
    onlyOnWeek: Integer => RecurrenceRule,
    onlyOnWeekday: Weekday => RecurrenceRule,
    onlyOnWeekdays: js.Array[Weekday] => RecurrenceRule,
    onlyOnWeeks: js.Array[Integer] => RecurrenceRule,
    onlyOnYearDay: Integer => RecurrenceRule,
    onlyOnYearDays: js.Array[Integer] => RecurrenceRule,
    setTimeZone: String => EventRecurrence,
    times: Integer => RecurrenceRule,
    until: Date => RecurrenceRule,
    weekStartsOn: Weekday => RecurrenceRule
  ): RecurrenceRule = {
    val __obj = js.Dynamic.literal(addDailyExclusion = js.Any.fromFunction0(addDailyExclusion), addDailyRule = js.Any.fromFunction0(addDailyRule), addDate = js.Any.fromFunction1(addDate), addDateExclusion = js.Any.fromFunction1(addDateExclusion), addMonthlyExclusion = js.Any.fromFunction0(addMonthlyExclusion), addMonthlyRule = js.Any.fromFunction0(addMonthlyRule), addWeeklyExclusion = js.Any.fromFunction0(addWeeklyExclusion), addWeeklyRule = js.Any.fromFunction0(addWeeklyRule), addYearlyExclusion = js.Any.fromFunction0(addYearlyExclusion), addYearlyRule = js.Any.fromFunction0(addYearlyRule), interval = js.Any.fromFunction1(interval), onlyInMonth = js.Any.fromFunction1(onlyInMonth), onlyInMonths = js.Any.fromFunction1(onlyInMonths), onlyOnMonthDay = js.Any.fromFunction1(onlyOnMonthDay), onlyOnMonthDays = js.Any.fromFunction1(onlyOnMonthDays), onlyOnWeek = js.Any.fromFunction1(onlyOnWeek), onlyOnWeekday = js.Any.fromFunction1(onlyOnWeekday), onlyOnWeekdays = js.Any.fromFunction1(onlyOnWeekdays), onlyOnWeeks = js.Any.fromFunction1(onlyOnWeeks), onlyOnYearDay = js.Any.fromFunction1(onlyOnYearDay), onlyOnYearDays = js.Any.fromFunction1(onlyOnYearDays), setTimeZone = js.Any.fromFunction1(setTimeZone), times = js.Any.fromFunction1(times), until = js.Any.fromFunction1(until), weekStartsOn = js.Any.fromFunction1(weekStartsOn))
  
    __obj.asInstanceOf[RecurrenceRule]
  }
}

