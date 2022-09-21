package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsTimeUnspecified extends StObject {
  
  var isTimeUnspecified: Boolean
  
  var marker: js.Date
  
  var timeZoneOffset: Any
}
object IsTimeUnspecified {
  
  inline def apply(isTimeUnspecified: Boolean, marker: js.Date, timeZoneOffset: Any): IsTimeUnspecified = {
    val __obj = js.Dynamic.literal(isTimeUnspecified = isTimeUnspecified.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], timeZoneOffset = timeZoneOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsTimeUnspecified]
  }
  
  extension [Self <: IsTimeUnspecified](x: Self) {
    
    inline def setIsTimeUnspecified(value: Boolean): Self = StObject.set(x, "isTimeUnspecified", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: js.Date): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneOffset(value: Any): Self = StObject.set(x, "timeZoneOffset", value.asInstanceOf[js.Any])
  }
}
