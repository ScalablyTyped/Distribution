package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpeningHoursTime extends StObject {
  
  /** a number from 0–6, corresponding to the days of the week, starting on Sunday. For example, 2 means Tuesday. */
  var day: Double
  
  /**
    *  may contain a time of day in 24-hour hhmm format. Values are in the range 0000–2359. The `time`
    * will be reported in the place's time zone.
    */
  var time: js.UndefOr[String] = js.undefined
}
object OpeningHoursTime {
  
  inline def apply(day: Double): OpeningHoursTime = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHoursTime]
  }
  
  extension [Self <: OpeningHoursTime](x: Self) {
    
    inline def setDay(value: Double): Self = StObject.set(x, "day", value.asInstanceOf[js.Any])
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
