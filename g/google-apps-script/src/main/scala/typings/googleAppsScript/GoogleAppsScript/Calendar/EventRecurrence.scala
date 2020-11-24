package typings.googleAppsScript.GoogleAppsScript.Calendar

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the recurrence settings for an event series.
  */
@js.native
trait EventRecurrence extends js.Object {
  
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
  
  def setTimeZone(timeZone: String): EventRecurrence = js.native
}
object EventRecurrence {
  
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
    setTimeZone: String => EventRecurrence
  ): EventRecurrence = {
    val __obj = js.Dynamic.literal(addDailyExclusion = js.Any.fromFunction0(addDailyExclusion), addDailyRule = js.Any.fromFunction0(addDailyRule), addDate = js.Any.fromFunction1(addDate), addDateExclusion = js.Any.fromFunction1(addDateExclusion), addMonthlyExclusion = js.Any.fromFunction0(addMonthlyExclusion), addMonthlyRule = js.Any.fromFunction0(addMonthlyRule), addWeeklyExclusion = js.Any.fromFunction0(addWeeklyExclusion), addWeeklyRule = js.Any.fromFunction0(addWeeklyRule), addYearlyExclusion = js.Any.fromFunction0(addYearlyExclusion), addYearlyRule = js.Any.fromFunction0(addYearlyRule), setTimeZone = js.Any.fromFunction1(setTimeZone))
    __obj.asInstanceOf[EventRecurrence]
  }
  
  @scala.inline
  implicit class EventRecurrenceOps[Self <: EventRecurrence] (val x: Self) extends AnyVal {
    
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
    def setSetTimeZone(value: String => EventRecurrence): Self = this.set("setTimeZone", js.Any.fromFunction1(value))
  }
}
