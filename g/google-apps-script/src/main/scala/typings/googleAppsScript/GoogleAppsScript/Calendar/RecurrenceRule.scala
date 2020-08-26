package typings.googleAppsScript.GoogleAppsScript.Calendar

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Base.Month
import typings.googleAppsScript.GoogleAppsScript.Base.Weekday
import typings.googleAppsScript.GoogleAppsScript.Integer
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
@js.native
trait RecurrenceRule extends js.Object {
  def addDailyExclusion(): RecurrenceRule = js.native
  def addDailyRule(): RecurrenceRule = js.native
  def addDate(date: Date): EventRecurrence = js.native
  def addDateExclusion(date: Date): EventRecurrence = js.native
  def addMonthlyExclusion(): RecurrenceRule = js.native
  def addMonthlyRule(): RecurrenceRule = js.native
  def addWeeklyExclusion(): RecurrenceRule = js.native
  def addWeeklyRule(): RecurrenceRule = js.native
  def addYearlyExclusion(): RecurrenceRule = js.native
  def addYearlyRule(): RecurrenceRule = js.native
  def interval(interval: Integer): RecurrenceRule = js.native
  def onlyInMonth(month: Month): RecurrenceRule = js.native
  def onlyInMonths(months: js.Array[Month]): RecurrenceRule = js.native
  def onlyOnMonthDay(day: Integer): RecurrenceRule = js.native
  def onlyOnMonthDays(days: js.Array[Integer]): RecurrenceRule = js.native
  def onlyOnWeek(week: Integer): RecurrenceRule = js.native
  def onlyOnWeekday(day: Weekday): RecurrenceRule = js.native
  def onlyOnWeekdays(days: js.Array[Weekday]): RecurrenceRule = js.native
  def onlyOnWeeks(weeks: js.Array[Integer]): RecurrenceRule = js.native
  def onlyOnYearDay(day: Integer): RecurrenceRule = js.native
  def onlyOnYearDays(days: js.Array[Integer]): RecurrenceRule = js.native
  def setTimeZone(timeZone: String): EventRecurrence = js.native
  def times(times: Integer): RecurrenceRule = js.native
  def until(endDate: Date): RecurrenceRule = js.native
  def weekStartsOn(day: Weekday): RecurrenceRule = js.native
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
  @scala.inline
  implicit class RecurrenceRuleOps[Self <: RecurrenceRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddDailyExclusion(value: () => RecurrenceRule): Self = this.set("addDailyExclusion", js.Any.fromFunction0(value))
    @scala.inline
    def setAddDailyRule(value: () => RecurrenceRule): Self = this.set("addDailyRule", js.Any.fromFunction0(value))
    @scala.inline
    def setAddDate(value: Date => EventRecurrence): Self = this.set("addDate", js.Any.fromFunction1(value))
    @scala.inline
    def setAddDateExclusion(value: Date => EventRecurrence): Self = this.set("addDateExclusion", js.Any.fromFunction1(value))
    @scala.inline
    def setAddMonthlyExclusion(value: () => RecurrenceRule): Self = this.set("addMonthlyExclusion", js.Any.fromFunction0(value))
    @scala.inline
    def setAddMonthlyRule(value: () => RecurrenceRule): Self = this.set("addMonthlyRule", js.Any.fromFunction0(value))
    @scala.inline
    def setAddWeeklyExclusion(value: () => RecurrenceRule): Self = this.set("addWeeklyExclusion", js.Any.fromFunction0(value))
    @scala.inline
    def setAddWeeklyRule(value: () => RecurrenceRule): Self = this.set("addWeeklyRule", js.Any.fromFunction0(value))
    @scala.inline
    def setAddYearlyExclusion(value: () => RecurrenceRule): Self = this.set("addYearlyExclusion", js.Any.fromFunction0(value))
    @scala.inline
    def setAddYearlyRule(value: () => RecurrenceRule): Self = this.set("addYearlyRule", js.Any.fromFunction0(value))
    @scala.inline
    def setInterval(value: Integer => RecurrenceRule): Self = this.set("interval", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyInMonth(value: Month => RecurrenceRule): Self = this.set("onlyInMonth", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyInMonths(value: js.Array[Month] => RecurrenceRule): Self = this.set("onlyInMonths", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyOnMonthDay(value: Integer => RecurrenceRule): Self = this.set("onlyOnMonthDay", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyOnMonthDays(value: js.Array[Integer] => RecurrenceRule): Self = this.set("onlyOnMonthDays", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyOnWeek(value: Integer => RecurrenceRule): Self = this.set("onlyOnWeek", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyOnWeekday(value: Weekday => RecurrenceRule): Self = this.set("onlyOnWeekday", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyOnWeekdays(value: js.Array[Weekday] => RecurrenceRule): Self = this.set("onlyOnWeekdays", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyOnWeeks(value: js.Array[Integer] => RecurrenceRule): Self = this.set("onlyOnWeeks", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyOnYearDay(value: Integer => RecurrenceRule): Self = this.set("onlyOnYearDay", js.Any.fromFunction1(value))
    @scala.inline
    def setOnlyOnYearDays(value: js.Array[Integer] => RecurrenceRule): Self = this.set("onlyOnYearDays", js.Any.fromFunction1(value))
    @scala.inline
    def setSetTimeZone(value: String => EventRecurrence): Self = this.set("setTimeZone", js.Any.fromFunction1(value))
    @scala.inline
    def setTimes(value: Integer => RecurrenceRule): Self = this.set("times", js.Any.fromFunction1(value))
    @scala.inline
    def setUntil(value: Date => RecurrenceRule): Self = this.set("until", js.Any.fromFunction1(value))
    @scala.inline
    def setWeekStartsOn(value: Weekday => RecurrenceRule): Self = this.set("weekStartsOn", js.Any.fromFunction1(value))
  }
  
}

