package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents one period of a Google Ads ad extension schedule. For instance, if an ad extension were set up to only show on ads on weekdays
  * from 09:00 to 18:00, it would have five ExtensionSchedules: one for Monday 09:00 - 18:00, one for Tuesday 09:00 - 18:00, and so on.
  */
trait ExtensionSchedule extends StObject {
  
  /** Returns the day of week this schedule applies to. */
  def getDayOfWeek(): ExtensionScheduleDayOfWeekType
  
  /** Returns the ending hour of this schedule. */
  def getEndHour(): Double
  
  /** Returns the ending minute of this schedule. */
  def getEndMinute(): Double
  
  /** Returns the type of this entity as a String, in this case, "ExtensionSchedule". */
  def getEntityType(): String
  
  /** Returns the starting hour of this schedule. */
  def getStartHour(): Double
  
  /** Returns the starting minute of this schedule. */
  def getStartMinute(): Double
}
object ExtensionSchedule {
  
  inline def apply(
    getDayOfWeek: () => ExtensionScheduleDayOfWeekType,
    getEndHour: () => Double,
    getEndMinute: () => Double,
    getEntityType: () => String,
    getStartHour: () => Double,
    getStartMinute: () => Double
  ): ExtensionSchedule = {
    val __obj = js.Dynamic.literal(getDayOfWeek = js.Any.fromFunction0(getDayOfWeek), getEndHour = js.Any.fromFunction0(getEndHour), getEndMinute = js.Any.fromFunction0(getEndMinute), getEntityType = js.Any.fromFunction0(getEntityType), getStartHour = js.Any.fromFunction0(getStartHour), getStartMinute = js.Any.fromFunction0(getStartMinute))
    __obj.asInstanceOf[ExtensionSchedule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExtensionSchedule] (val x: Self) extends AnyVal {
    
    inline def setGetDayOfWeek(value: () => ExtensionScheduleDayOfWeekType): Self = StObject.set(x, "getDayOfWeek", js.Any.fromFunction0(value))
    
    inline def setGetEndHour(value: () => Double): Self = StObject.set(x, "getEndHour", js.Any.fromFunction0(value))
    
    inline def setGetEndMinute(value: () => Double): Self = StObject.set(x, "getEndMinute", js.Any.fromFunction0(value))
    
    inline def setGetEntityType(value: () => String): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    inline def setGetStartHour(value: () => Double): Self = StObject.set(x, "getStartHour", js.Any.fromFunction0(value))
    
    inline def setGetStartMinute(value: () => Double): Self = StObject.set(x, "getStartMinute", js.Any.fromFunction0(value))
  }
}
