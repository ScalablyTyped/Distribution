package typings.devexpressWeb

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the TimeInterval class.
  */
trait ASPxClientTimeInterval extends StObject {
  
  /**
    * Client-side function that determines whether the specified interval is contained within the current one. true if the specified interval is located within the current one; otherwise, false.
    * @param interval An ASPxClientTimeInterval object, representing the time interval to check.
    */
  def Contains(interval: ASPxClientTimeInterval): Boolean
  
  /**
    * Determines whether the specified object is equal to the current ASPxClientTimeInterval instance. true if the specified object is equal to the current ASPxClientTimeInterval instance; otherwise false.
    * @param interval The object to compare with the current object.
    */
  def Equals(interval: ASPxClientTimeInterval): Boolean
  
  /**
    * Gets a value indicating if the time interval is All-Day.
    */
  def GetAllDay(): Boolean
  
  /**
    * Client-side function that returns the duration of the specified time interval.
    */
  def GetDuration(): Double
  
  /**
    * Client-side function that returns the end time of the interval.
    */
  def GetEnd(): Date
  
  /**
    * Client-side function that returns the start time of the interval.
    */
  def GetStart(): Date
  
  /**
    * Checks if the current time interval intersects with the specified time interval. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWith(interval: ASPxClientTimeInterval): Boolean
  
  /**
    * Checks if the current time interval intersects with the specified time interval. The boundaries of the time intervals are excluded from the check. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWithExcludingBounds(interval: ASPxClientTimeInterval): Boolean
  
  /**
    * Sets a value specifying if the time interval is All-Day.
    * @param allDayValue true, if this is an all-day time interval; otherwise, false.
    */
  def SetAllDay(allDayValue: Boolean): Unit
  
  /**
    * Client-side function that returns the duration of the specified time interval.
    * @param value A TimeSpan  object, representing the duration of the time period.
    */
  def SetDuration(value: js.Any): Unit
  
  /**
    * Client-side function that sets the end time of the interval.
    * @param value A DateTime value, representing the end of the interval.
    */
  def SetEnd(value: Date): Unit
  
  /**
    * Client-side function that sets the start time of the interval.
    * @param value A DateTime value, representing the beginning of the interval.
    */
  def SetStart(value: Date): Unit
}
object ASPxClientTimeInterval {
  
  @scala.inline
  def apply(
    Contains: ASPxClientTimeInterval => Boolean,
    Equals: ASPxClientTimeInterval => Boolean,
    GetAllDay: () => Boolean,
    GetDuration: () => Double,
    GetEnd: () => Date,
    GetStart: () => Date,
    IntersectsWith: ASPxClientTimeInterval => Boolean,
    IntersectsWithExcludingBounds: ASPxClientTimeInterval => Boolean,
    SetAllDay: Boolean => Unit,
    SetDuration: js.Any => Unit,
    SetEnd: Date => Unit,
    SetStart: Date => Unit
  ): ASPxClientTimeInterval = {
    val __obj = js.Dynamic.literal(Contains = js.Any.fromFunction1(Contains), Equals = js.Any.fromFunction1(Equals), GetAllDay = js.Any.fromFunction0(GetAllDay), GetDuration = js.Any.fromFunction0(GetDuration), GetEnd = js.Any.fromFunction0(GetEnd), GetStart = js.Any.fromFunction0(GetStart), IntersectsWith = js.Any.fromFunction1(IntersectsWith), IntersectsWithExcludingBounds = js.Any.fromFunction1(IntersectsWithExcludingBounds), SetAllDay = js.Any.fromFunction1(SetAllDay), SetDuration = js.Any.fromFunction1(SetDuration), SetEnd = js.Any.fromFunction1(SetEnd), SetStart = js.Any.fromFunction1(SetStart))
    __obj.asInstanceOf[ASPxClientTimeInterval]
  }
  
  @scala.inline
  implicit class ASPxClientTimeIntervalMutableBuilder[Self <: ASPxClientTimeInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: ASPxClientTimeInterval => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: ASPxClientTimeInterval => Boolean): Self = StObject.set(x, "Equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllDay(value: () => Boolean): Self = StObject.set(x, "GetAllDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = StObject.set(x, "GetDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnd(value: () => Date): Self = StObject.set(x, "GetEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStart(value: () => Date): Self = StObject.set(x, "GetStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntersectsWith(value: ASPxClientTimeInterval => Boolean): Self = StObject.set(x, "IntersectsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersectsWithExcludingBounds(value: ASPxClientTimeInterval => Boolean): Self = StObject.set(x, "IntersectsWithExcludingBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllDay(value: Boolean => Unit): Self = StObject.set(x, "SetAllDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDuration(value: js.Any => Unit): Self = StObject.set(x, "SetDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnd(value: Date => Unit): Self = StObject.set(x, "SetEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStart(value: Date => Unit): Self = StObject.set(x, "SetStart", js.Any.fromFunction1(value))
  }
}
