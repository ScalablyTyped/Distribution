package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpeningHoursPeriod extends StObject {
  
  /**
    * The closing time for the Place.
    */
  var close: OpeningHoursPoint | Null
  
  /**
    * The opening time for the Place.
    */
  var open: OpeningHoursPoint
}
object OpeningHoursPeriod {
  
  inline def apply(open: OpeningHoursPoint): OpeningHoursPeriod = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], close = null)
    __obj.asInstanceOf[OpeningHoursPeriod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpeningHoursPeriod] (val x: Self) extends AnyVal {
    
    inline def setClose(value: OpeningHoursPoint): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseNull: Self = StObject.set(x, "close", null)
    
    inline def setOpen(value: OpeningHoursPoint): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
