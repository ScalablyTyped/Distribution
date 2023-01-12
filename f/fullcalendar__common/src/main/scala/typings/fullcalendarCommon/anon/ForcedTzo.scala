package typings.fullcalendarCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForcedTzo extends StObject {
  
  var forcedTzo: Any
  
  var isTimeUnspecified: Boolean
  
  var marker: js.Date
}
object ForcedTzo {
  
  inline def apply(forcedTzo: Any, isTimeUnspecified: Boolean, marker: js.Date): ForcedTzo = {
    val __obj = js.Dynamic.literal(forcedTzo = forcedTzo.asInstanceOf[js.Any], isTimeUnspecified = isTimeUnspecified.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForcedTzo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ForcedTzo] (val x: Self) extends AnyVal {
    
    inline def setForcedTzo(value: Any): Self = StObject.set(x, "forcedTzo", value.asInstanceOf[js.Any])
    
    inline def setIsTimeUnspecified(value: Boolean): Self = StObject.set(x, "isTimeUnspecified", value.asInstanceOf[js.Any])
    
    inline def setMarker(value: js.Date): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
  }
}
