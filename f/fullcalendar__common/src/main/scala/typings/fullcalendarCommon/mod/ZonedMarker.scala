package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZonedMarker extends StObject {
  
  var marker: js.Date
  
  var timeZoneOffset: Double
}
object ZonedMarker {
  
  inline def apply(marker: js.Date, timeZoneOffset: Double): ZonedMarker = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any], timeZoneOffset = timeZoneOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZonedMarker]
  }
  
  extension [Self <: ZonedMarker](x: Self) {
    
    inline def setMarker(value: js.Date): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneOffset(value: Double): Self = StObject.set(x, "timeZoneOffset", value.asInstanceOf[js.Any])
  }
}
