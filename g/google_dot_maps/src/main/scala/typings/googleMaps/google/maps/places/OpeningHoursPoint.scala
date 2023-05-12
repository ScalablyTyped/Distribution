package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpeningHoursPoint extends StObject {
  
  /**
    * The day of the week, as a number in the range [0, 6], starting on Sunday.
    * For example, 2 means Tuesday.
    */
  var day: Double
  
  /**
    * The hour of the OpeningHoursPoint.time as a number, in the range [0, 23].
    * This will be reported in the Place’s time zone.
    */
  var hour: Double
  
  /**
    * The minute of the OpeningHoursPoint.time as a number, in the range [0,
    * 59]. This will be reported in the Place’s time zone.
    */
  var minute: Double
}
object OpeningHoursPoint {
  
  inline def apply(day: Double, hour: Double, minute: Double): OpeningHoursPoint = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHoursPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpeningHoursPoint] (val x: Self) extends AnyVal {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
  }
}
