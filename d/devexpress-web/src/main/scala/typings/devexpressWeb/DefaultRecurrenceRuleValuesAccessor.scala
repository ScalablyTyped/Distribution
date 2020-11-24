package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object providing access to an ASPxClientRecurrenceControlBase control's editor values.
  */
@js.native
trait DefaultRecurrenceRuleValuesAccessor extends js.Object {
  
  /**
    * Gets the number of the month's day in which the appointment is scheduled.
    */
  def GetDayNumber(): Double = js.native
  
  /**
    * Gets or sets the month's number.
    */
  def GetMonth(): Double = js.native
  
  /**
    * Get the frequency with which the appointment occurs with respect to the appointment's recurrence type.
    */
  def GetPeriodicity(): Double = js.native
  
  /**
    * Gets the days of the week on which a weekly recurrent appointment is scheduled.
    */
  def GetWeekDays(): ASPxClientWeekDays = js.native
  
  /**
    * Gets the number of the week in a month when an appointment is scheduled.
    */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth = js.native
}
object DefaultRecurrenceRuleValuesAccessor {
  
  @scala.inline
  def apply(
    GetDayNumber: () => Double,
    GetMonth: () => Double,
    GetPeriodicity: () => Double,
    GetWeekDays: () => ASPxClientWeekDays,
    GetWeekOfMonth: () => ASPxClientWeekOfMonth
  ): DefaultRecurrenceRuleValuesAccessor = {
    val __obj = js.Dynamic.literal(GetDayNumber = js.Any.fromFunction0(GetDayNumber), GetMonth = js.Any.fromFunction0(GetMonth), GetPeriodicity = js.Any.fromFunction0(GetPeriodicity), GetWeekDays = js.Any.fromFunction0(GetWeekDays), GetWeekOfMonth = js.Any.fromFunction0(GetWeekOfMonth))
    __obj.asInstanceOf[DefaultRecurrenceRuleValuesAccessor]
  }
  
  @scala.inline
  implicit class DefaultRecurrenceRuleValuesAccessorOps[Self <: DefaultRecurrenceRuleValuesAccessor] (val x: Self) extends AnyVal {
    
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
    def setGetDayNumber(value: () => Double): Self = this.set("GetDayNumber", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetMonth(value: () => Double): Self = this.set("GetMonth", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPeriodicity(value: () => Double): Self = this.set("GetPeriodicity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWeekDays(value: () => ASPxClientWeekDays): Self = this.set("GetWeekDays", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetWeekOfMonth(value: () => ASPxClientWeekOfMonth): Self = this.set("GetWeekOfMonth", js.Any.fromFunction0(value))
  }
}
