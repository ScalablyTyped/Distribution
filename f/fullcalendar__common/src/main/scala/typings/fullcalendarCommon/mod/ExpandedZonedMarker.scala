package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpandedZonedMarker
  extends StObject
     with ZonedMarker {
  
  var array: js.Array[Double]
  
  var day: Double
  
  var hour: Double
  
  var millisecond: Double
  
  var minute: Double
  
  var month: Double
  
  var second: Double
  
  var year: Double
}
object ExpandedZonedMarker {
  
  inline def apply(
    array: js.Array[Double],
    day: Double,
    hour: Double,
    marker: js.Date,
    millisecond: Double,
    minute: Double,
    month: Double,
    second: Double,
    timeZoneOffset: Double,
    year: Double
  ): ExpandedZonedMarker = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], timeZoneOffset = timeZoneOffset.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandedZonedMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExpandedZonedMarker] (val x: Self) extends AnyVal {
    
    inline def setArray(value: js.Array[Double]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayVarargs(value: Double*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setHour(value: Double): Self = StObject.set(x, "hour", value.asInstanceOf[js.Any])
    
    inline def setMillisecond(value: Double): Self = StObject.set(x, "millisecond", value.asInstanceOf[js.Any])
    
    inline def setMinute(value: Double): Self = StObject.set(x, "minute", value.asInstanceOf[js.Any])
    
    inline def setMonth(value: Double): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
    
    inline def setSecond(value: Double): Self = StObject.set(x, "second", value.asInstanceOf[js.Any])
    
    inline def setYear(value: Double): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
