package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapTimeInterval extends StObject {
  
  def contains(interval: BootstrapTimeInterval): Boolean = js.native
  
  def equals(interval: BootstrapTimeInterval): Boolean = js.native
  
  def getAllDay(): Boolean = js.native
  
  def getDuration(): Double = js.native
  
  def getEnd(): Date = js.native
  
  def getStart(): Date = js.native
  
  val instance: js.Any = js.native
  
  def intersectsWith(interval: BootstrapTimeInterval): Boolean = js.native
  
  def intersectsWithExcludingBounds(interval: BootstrapTimeInterval): Boolean = js.native
  
  def setAllDay(allDayValue: Boolean): Unit = js.native
  
  def setDuration(value: Double): Unit = js.native
  
  def setEnd(value: Date): Unit = js.native
  
  def setStart(value: Date): Unit = js.native
}
object BootstrapTimeInterval {
  
  @scala.inline
  def apply(
    contains: BootstrapTimeInterval => Boolean,
    equals_ : BootstrapTimeInterval => Boolean,
    getAllDay: () => Boolean,
    getDuration: () => Double,
    getEnd: () => Date,
    getStart: () => Date,
    instance: js.Any,
    intersectsWith: BootstrapTimeInterval => Boolean,
    intersectsWithExcludingBounds: BootstrapTimeInterval => Boolean,
    setAllDay: Boolean => Unit,
    setDuration: Double => Unit,
    setEnd: Date => Unit,
    setStart: Date => Unit
  ): BootstrapTimeInterval = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getAllDay = js.Any.fromFunction0(getAllDay), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), instance = instance.asInstanceOf[js.Any], intersectsWith = js.Any.fromFunction1(intersectsWith), intersectsWithExcludingBounds = js.Any.fromFunction1(intersectsWithExcludingBounds), setAllDay = js.Any.fromFunction1(setAllDay), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setStart = js.Any.fromFunction1(setStart))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[BootstrapTimeInterval]
  }
  
  @scala.inline
  implicit class BootstrapTimeIntervalMutableBuilder[Self <: BootstrapTimeInterval] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals_(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllDay(value: () => Boolean): Self = StObject.set(x, "getAllDay", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEnd(value: () => Date): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStart(value: () => Date): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstance(value: js.Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntersectsWith(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "intersectsWith", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIntersectsWithExcludingBounds(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "intersectsWithExcludingBounds", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllDay(value: Boolean => Unit): Self = StObject.set(x, "setAllDay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDuration(value: Double => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetEnd(value: Date => Unit): Self = StObject.set(x, "setEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetStart(value: Date => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction1(value))
  }
}
