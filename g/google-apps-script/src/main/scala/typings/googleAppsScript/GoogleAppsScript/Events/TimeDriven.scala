package typings.googleAppsScript.GoogleAppsScript.Events

import typings.googleAppsScript.GoogleAppsScript.Script.AuthMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeDriven extends StObject {
  
  var authMode: AuthMode
  
  var `day-of-month`: Double
  
  var `day-of-week`: Double
  
  var hour: Double
  
  var minute: Double
  
  var month: Double
  
  var second: Double
  
  var timezone: String
  
  var triggerUid: String
  
  var `week-of-year`: Double
  
  var year: Double
}
object TimeDriven {
  
  inline def apply(
    authMode: AuthMode,
    `day-of-month`: Double,
    `day-of-week`: Double,
    hour: Double,
    minute: Double,
    month: Double,
    second: Double,
    timezone: String,
    triggerUid: String,
    `week-of-year`: Double,
    year: Double
  ): TimeDriven = {
    val __obj = js.Dynamic.literal(authMode = authMode.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], triggerUid = triggerUid.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.updateDynamic("day-of-month")(`day-of-month`.asInstanceOf[js.Any])
    __obj.updateDynamic("day-of-week")(`day-of-week`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-of-year")(`week-of-year`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeDriven]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeDriven] (val x: Self) extends AnyVal {
    
    inline def setAuthMode(value: AuthMode): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def `setDay-of-month`(value: Double): Self = StObject.set(x, "day-of-month", value.asInstanceOf[js.Any])
    
    inline def `setDay-of-week`(value: Double): Self = StObject.set(x, "day-of-week", value.asInstanceOf[js.Any])
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTriggerUid(value: String): Self = StObject.set(x, "triggerUid", value.asInstanceOf[js.Any])
    
    inline def `setWeek-of-year`(value: Double): Self = StObject.set(x, "week-of-year", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
