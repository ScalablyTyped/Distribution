package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object literals are accepted in place of <code>LatLngAltitude</code>
  * objects, as a convenience, in many places. These are converted to
  * <code>LatLngAltitude</code> objects when the Maps API encounters them.
  */
trait LatLngAltitudeLiteral
  extends StObject
     with LatLngLiteral {
  
  /**
    * Distance (in meters) above the ground surface. Negative value means
    * underneath the ground surface.
    * @defaultValue <code>0</code>
    */
  var altitude: Double
}
object LatLngAltitudeLiteral {
  
  inline def apply(altitude: Double, lat: Double, lng: Double): LatLngAltitudeLiteral = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngAltitudeLiteral]
  }
  
  extension [Self <: LatLngAltitudeLiteral](x: Self) {
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
  }
}
