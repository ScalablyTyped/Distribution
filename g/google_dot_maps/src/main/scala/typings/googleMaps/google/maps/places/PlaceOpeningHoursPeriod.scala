package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceOpeningHoursPeriod extends StObject {
  
  /**
    * The closing time for the Place.
    */
  var close: js.UndefOr[PlaceOpeningHoursTime] = js.undefined
  
  /**
    * The opening time for the Place.
    */
  var open: PlaceOpeningHoursTime
}
object PlaceOpeningHoursPeriod {
  
  inline def apply(open: PlaceOpeningHoursTime): PlaceOpeningHoursPeriod = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaceOpeningHoursPeriod]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaceOpeningHoursPeriod] (val x: Self) extends AnyVal {
    
    inline def setClose(value: PlaceOpeningHoursTime): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: PlaceOpeningHoursTime): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
