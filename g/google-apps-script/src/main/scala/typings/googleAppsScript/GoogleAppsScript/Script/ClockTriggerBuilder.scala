package typings.googleAppsScript.GoogleAppsScript.Script

import typings.googleAppsScript.GoogleAppsScript.Base.Date
import typings.googleAppsScript.GoogleAppsScript.Base.Weekday
import typings.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A builder for clock triggers.
  */
@js.native
trait ClockTriggerBuilder extends StObject {
  
  def after(durationMilliseconds: Integer): ClockTriggerBuilder = js.native
  
  def at(date: Date): ClockTriggerBuilder = js.native
  
  def atDate(year: Integer, month: Integer, day: Integer): ClockTriggerBuilder = js.native
  
  def atHour(hour: Integer): ClockTriggerBuilder = js.native
  
  def create(): Trigger = js.native
  
  def everyDays(n: Integer): ClockTriggerBuilder = js.native
  
  def everyHours(n: Integer): ClockTriggerBuilder = js.native
  
  def everyMinutes(n: Integer): ClockTriggerBuilder = js.native
  
  def everyWeeks(n: Integer): ClockTriggerBuilder = js.native
  
  def inTimezone(timezone: String): ClockTriggerBuilder = js.native
  
  def nearMinute(minute: Integer): ClockTriggerBuilder = js.native
  
  def onMonthDay(day: Integer): ClockTriggerBuilder = js.native
  
  def onWeekDay(day: Weekday): ClockTriggerBuilder = js.native
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
  
  @scala.inline
  implicit class ClockTriggerBuilderMutableBuilder[Self <: ClockTriggerBuilder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfter(value: Integer => ClockTriggerBuilder): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAt(value: Date => ClockTriggerBuilder): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAtDate(value: (Integer, Integer, Integer) => ClockTriggerBuilder): Self = StObject.set(x, "atDate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAtHour(value: Integer => ClockTriggerBuilder): Self = StObject.set(x, "atHour", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreate(value: () => Trigger): Self = StObject.set(x, "create", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEveryDays(value: Integer => ClockTriggerBuilder): Self = StObject.set(x, "everyDays", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEveryHours(value: Integer => ClockTriggerBuilder): Self = StObject.set(x, "everyHours", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEveryMinutes(value: Integer => ClockTriggerBuilder): Self = StObject.set(x, "everyMinutes", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEveryWeeks(value: Integer => ClockTriggerBuilder): Self = StObject.set(x, "everyWeeks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInTimezone(value: String => ClockTriggerBuilder): Self = StObject.set(x, "inTimezone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNearMinute(value: Integer => ClockTriggerBuilder): Self = StObject.set(x, "nearMinute", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnMonthDay(value: Integer => ClockTriggerBuilder): Self = StObject.set(x, "onMonthDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnWeekDay(value: Weekday => ClockTriggerBuilder): Self = StObject.set(x, "onWeekDay", js.Any.fromFunction1(value))
  }
}
