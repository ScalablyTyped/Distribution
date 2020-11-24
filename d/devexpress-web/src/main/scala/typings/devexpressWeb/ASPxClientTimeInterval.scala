package typings.devexpressWeb

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the TimeInterval class.
  */
@js.native
trait ASPxClientTimeInterval extends js.Object {
  
  /**
    * Client-side function that determines whether the specified interval is contained within the current one. true if the specified interval is located within the current one; otherwise, false.
    * @param interval An ASPxClientTimeInterval object, representing the time interval to check.
    */
  def Contains(interval: ASPxClientTimeInterval): Boolean = js.native
  
  /**
    * Determines whether the specified object is equal to the current ASPxClientTimeInterval instance. true if the specified object is equal to the current ASPxClientTimeInterval instance; otherwise false.
    * @param interval The object to compare with the current object.
    */
  def Equals(interval: ASPxClientTimeInterval): Boolean = js.native
  
  /**
    * Gets a value indicating if the time interval is All-Day.
    */
  def GetAllDay(): Boolean = js.native
  
  /**
    * Client-side function that returns the duration of the specified time interval.
    */
  def GetDuration(): Double = js.native
  
  /**
    * Client-side function that returns the end time of the interval.
    */
  def GetEnd(): Date = js.native
  
  /**
    * Client-side function that returns the start time of the interval.
    */
  def GetStart(): Date = js.native
  
  /**
    * Checks if the current time interval intersects with the specified time interval. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWith(interval: ASPxClientTimeInterval): Boolean = js.native
  
  /**
    * Checks if the current time interval intersects with the specified time interval. The boundaries of the time intervals are excluded from the check. true, if the two time intervals intersect; otherwise, false.
    * @param interval A ASPxClientTimeInterval object which represents the time interval to be checked.
    */
  def IntersectsWithExcludingBounds(interval: ASPxClientTimeInterval): Boolean = js.native
  
  /**
    * Sets a value specifying if the time interval is All-Day.
    * @param allDayValue true, if this is an all-day time interval; otherwise, false.
    */
  def SetAllDay(allDayValue: Boolean): Unit = js.native
  
  /**
    * Client-side function that returns the duration of the specified time interval.
    * @param value A TimeSpan  object, representing the duration of the time period.
    */
  def SetDuration(value: js.Any): Unit = js.native
  
  /**
    * Client-side function that sets the end time of the interval.
    * @param value A DateTime value, representing the end of the interval.
    */
  def SetEnd(value: Date): Unit = js.native
  
  /**
    * Client-side function that sets the start time of the interval.
    * @param value A DateTime value, representing the beginning of the interval.
    */
  def SetStart(value: Date): Unit = js.native
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
  implicit class ASPxClientTimeIntervalOps[Self <: ASPxClientTimeInterval] (val x: Self) extends AnyVal {
    
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
    def setContains(value: ASPxClientTimeInterval => Boolean): Self = this.set("Contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: ASPxClientTimeInterval => Boolean): Self = this.set("Equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllDay(value: () => Boolean): Self = this.set("GetAllDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = this.set("GetDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnd(value: () => Date): Self = this.set("GetEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStart(value: () => Date): Self = this.set("GetStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntersectsWith(value: ASPxClientTimeInterval => Boolean): Self = this.set("IntersectsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersectsWithExcludingBounds(value: ASPxClientTimeInterval => Boolean): Self = this.set("IntersectsWithExcludingBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllDay(value: Boolean => Unit): Self = this.set("SetAllDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDuration(value: js.Any => Unit): Self = this.set("SetDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnd(value: Date => Unit): Self = this.set("SetEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStart(value: Date => Unit): Self = this.set("SetStart", js.Any.fromFunction1(value))
  }
}
