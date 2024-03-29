package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object providing access to an ASPxClientRecurrenceControlBase control's editor values.
  */
trait DefaultRecurrenceRuleValuesAccessor extends StObject {
  
  /**
    * Gets the number of the month's day in which the appointment is scheduled.
    */
  def GetDayNumber(): Double
  
  /**
    * Gets or sets the month's number.
    */
  def GetMonth(): Double
  
  /**
    * Get the frequency with which the appointment occurs with respect to the appointment's recurrence type.
    */
  def GetPeriodicity(): Double
  
  /**
    * Gets the days of the week on which a weekly recurrent appointment is scheduled.
    */
  def GetWeekDays(): ASPxClientWeekDays
  
  /**
    * Gets the number of the week in a month when an appointment is scheduled.
    */
  def GetWeekOfMonth(): ASPxClientWeekOfMonth
}
object DefaultRecurrenceRuleValuesAccessor {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: DefaultRecurrenceRuleValuesAccessor] (val x: Self) extends AnyVal {
    
    inline def setGetDayNumber(value: () => Double): Self = StObject.set(x, "GetDayNumber", js.Any.fromFunction0(value))
    
    inline def setGetMonth(value: () => Double): Self = StObject.set(x, "GetMonth", js.Any.fromFunction0(value))
    
    inline def setGetPeriodicity(value: () => Double): Self = StObject.set(x, "GetPeriodicity", js.Any.fromFunction0(value))
    
    inline def setGetWeekDays(value: () => ASPxClientWeekDays): Self = StObject.set(x, "GetWeekDays", js.Any.fromFunction0(value))
    
    inline def setGetWeekOfMonth(value: () => ASPxClientWeekOfMonth): Self = StObject.set(x, "GetWeekOfMonth", js.Any.fromFunction0(value))
  }
}
