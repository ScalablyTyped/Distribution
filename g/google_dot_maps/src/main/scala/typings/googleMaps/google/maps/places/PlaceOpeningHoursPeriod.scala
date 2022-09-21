package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines structured information about the opening hours of a Place.
  * <strong>Note:</strong> If a Place is <strong>always open</strong>, the
  * <code>close</code> section will be missing from the response. Clients can
  * rely on always-open being represented as an <code>open</code> period
  * containing <code>day</code> with value <code>0</code> and <code>time</code>
  * with value <code>"0000"</code>, and no <code>close</code>.</li>
  */
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
  
  extension [Self <: PlaceOpeningHoursPeriod](x: Self) {
    
    inline def setClose(value: PlaceOpeningHoursTime): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    inline def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    inline def setOpen(value: PlaceOpeningHoursTime): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
  }
}
