package typings.fhir.r5Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationPosition
  extends StObject
     with BackboneElement {
  
  /**
    * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below).
    */
  var altitude: js.UndefOr[Double] = js.undefined
  
  /**
    * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below).
    */
  var latitude: Double
  
  /**
    * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below).
    */
  var longitude: Double
}
object LocationPosition {
  
  inline def apply(latitude: Double, longitude: Double): LocationPosition = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationPosition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocationPosition] (val x: Self) extends AnyVal {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
