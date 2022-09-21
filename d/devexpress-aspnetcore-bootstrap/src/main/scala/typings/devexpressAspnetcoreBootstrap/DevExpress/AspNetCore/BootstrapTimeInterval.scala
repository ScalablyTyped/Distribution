package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapTimeInterval extends StObject {
  
  def contains(interval: BootstrapTimeInterval): Boolean
  
  def equals(interval: BootstrapTimeInterval): Boolean
  
  def getAllDay(): Boolean
  
  def getDuration(): Double
  
  def getEnd(): js.Date
  
  def getStart(): js.Date
  
  /* protected */ val instance: Any
  
  def intersectsWith(interval: BootstrapTimeInterval): Boolean
  
  def intersectsWithExcludingBounds(interval: BootstrapTimeInterval): Boolean
  
  def setAllDay(allDayValue: Boolean): Unit
  
  def setDuration(value: Double): Unit
  
  def setEnd(value: js.Date): Unit
  
  def setStart(value: js.Date): Unit
}
object BootstrapTimeInterval {
  
  inline def apply(
    contains: BootstrapTimeInterval => Boolean,
    equals_ : BootstrapTimeInterval => Boolean,
    getAllDay: () => Boolean,
    getDuration: () => Double,
    getEnd: () => js.Date,
    getStart: () => js.Date,
    instance: Any,
    intersectsWith: BootstrapTimeInterval => Boolean,
    intersectsWithExcludingBounds: BootstrapTimeInterval => Boolean,
    setAllDay: Boolean => Unit,
    setDuration: Double => Unit,
    setEnd: js.Date => Unit,
    setStart: js.Date => Unit
  ): BootstrapTimeInterval = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getAllDay = js.Any.fromFunction0(getAllDay), getDuration = js.Any.fromFunction0(getDuration), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), instance = instance.asInstanceOf[js.Any], intersectsWith = js.Any.fromFunction1(intersectsWith), intersectsWithExcludingBounds = js.Any.fromFunction1(intersectsWithExcludingBounds), setAllDay = js.Any.fromFunction1(setAllDay), setDuration = js.Any.fromFunction1(setDuration), setEnd = js.Any.fromFunction1(setEnd), setStart = js.Any.fromFunction1(setStart))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[BootstrapTimeInterval]
  }
  
  extension [Self <: BootstrapTimeInterval](x: Self) {
    
    inline def setContains(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setEquals_(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetAllDay(value: () => Boolean): Self = StObject.set(x, "getAllDay", js.Any.fromFunction0(value))
    
    inline def setGetDuration(value: () => Double): Self = StObject.set(x, "getDuration", js.Any.fromFunction0(value))
    
    inline def setGetEnd(value: () => js.Date): Self = StObject.set(x, "getEnd", js.Any.fromFunction0(value))
    
    inline def setGetStart(value: () => js.Date): Self = StObject.set(x, "getStart", js.Any.fromFunction0(value))
    
    inline def setInstance(value: Any): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    inline def setIntersectsWith(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "intersectsWith", js.Any.fromFunction1(value))
    
    inline def setIntersectsWithExcludingBounds(value: BootstrapTimeInterval => Boolean): Self = StObject.set(x, "intersectsWithExcludingBounds", js.Any.fromFunction1(value))
    
    inline def setSetAllDay(value: Boolean => Unit): Self = StObject.set(x, "setAllDay", js.Any.fromFunction1(value))
    
    inline def setSetDuration(value: Double => Unit): Self = StObject.set(x, "setDuration", js.Any.fromFunction1(value))
    
    inline def setSetEnd(value: js.Date => Unit): Self = StObject.set(x, "setEnd", js.Any.fromFunction1(value))
    
    inline def setSetStart(value: js.Date => Unit): Self = StObject.set(x, "setStart", js.Any.fromFunction1(value))
  }
}
