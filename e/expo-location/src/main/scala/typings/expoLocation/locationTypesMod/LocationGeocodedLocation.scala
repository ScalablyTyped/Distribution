package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationGeocodedLocation extends StObject {
  
  var accuracy: js.UndefOr[Double] = js.undefined
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var latitude: Double
  
  var longitude: Double
}
object LocationGeocodedLocation {
  
  inline def apply(latitude: Double, longitude: Double): LocationGeocodedLocation = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationGeocodedLocation]
  }
  
  extension [Self <: LocationGeocodedLocation](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
