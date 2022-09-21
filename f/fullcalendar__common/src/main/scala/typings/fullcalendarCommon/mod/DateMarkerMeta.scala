package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateMarkerMeta extends StObject {
  
  var forcedTzo: Double | Null
  
  var isTimeUnspecified: Boolean
  
  var marker: js.Date
}
object DateMarkerMeta {
  
  inline def apply(isTimeUnspecified: Boolean, marker: js.Date): DateMarkerMeta = {
    val __obj = js.Dynamic.literal(isTimeUnspecified = isTimeUnspecified.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], forcedTzo = null)
    __obj.asInstanceOf[DateMarkerMeta]
  }
  
  extension [Self <: DateMarkerMeta](x: Self) {
    
    inline def setForcedTzo(value: Double): Self = StObject.set(x, "forcedTzo", value.asInstanceOf[js.Any])
    
    inline def setForcedTzoNull: Self = StObject.set(x, "forcedTzo", null)
    
    inline def setIsTimeUnspecified(value: Boolean): Self = StObject.set(x, "isTimeUnspecified", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: js.Date): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
