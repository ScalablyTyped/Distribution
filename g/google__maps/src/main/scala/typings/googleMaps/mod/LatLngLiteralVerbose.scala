package typings.googleMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngLiteralVerbose
  extends StObject
     with _LatLng {
  
  var latitude: Double
  
  var longitude: Double
}
object LatLngLiteralVerbose {
  
  inline def apply(latitude: Double, longitude: Double): LatLngLiteralVerbose = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngLiteralVerbose]
  }
  
  extension [Self <: LatLngLiteralVerbose](x: Self) {
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
