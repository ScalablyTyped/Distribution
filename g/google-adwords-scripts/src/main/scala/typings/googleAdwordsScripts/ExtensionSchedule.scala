package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Video
// Non-entity
trait ExtensionSchedule extends StObject {
  
  def getDayOfWeek(): DayOfWeekString
  
  def getEndHour(): Double
  
  def getEndMinute(): Double
  
  def getStartHour(): Double
  
  def getStartMinute(): Double
}
object ExtensionSchedule {
  
  inline def apply(
    getDayOfWeek: () => DayOfWeekString,
    getEndHour: () => Double,
    getEndMinute: () => Double,
    getStartHour: () => Double,
    getStartMinute: () => Double
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal(getDayOfWeek = js.Any.fromFunction0(getDayOfWeek), getEndHour = js.Any.fromFunction0(getEndHour), getEndMinute = js.Any.fromFunction0(getEndMinute), getStartHour = js.Any.fromFunction0(getStartHour), getStartMinute = js.Any.fromFunction0(getStartMinute))
    __obj.asInstanceOf[ExtensionSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionSchedule] (val x: Self) extends AnyVal {
    
    inline def setGetDayOfWeek(value: () => DayOfWeekString): Self = StObject.set(x, "getDayOfWeek", js.Any.fromFunction0(value))
    
    inline def setGetEndHour(value: () => Double): Self = StObject.set(x, "getEndHour", js.Any.fromFunction0(value))
    
    inline def setGetEndMinute(value: () => Double): Self = StObject.set(x, "getEndMinute", js.Any.fromFunction0(value))
    
    inline def setGetStartHour(value: () => Double): Self = StObject.set(x, "getStartHour", js.Any.fromFunction0(value))
    
    inline def setGetStartMinute(value: () => Double): Self = StObject.set(x, "getStartMinute", js.Any.fromFunction0(value))
  }
}
