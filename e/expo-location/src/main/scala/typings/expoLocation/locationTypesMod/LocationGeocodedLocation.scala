package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationGeocodedLocation extends StObject {
  
  /**
    * The radius of uncertainty for the location, measured in meters.
    */
  var accuracy: js.UndefOr[Double] = js.undefined
  
  /**
    * The altitude in meters above the WGS 84 reference ellipsoid.
    */
  var altitude: js.UndefOr[Double] = js.undefined
  
  /**
    * The latitude in degrees.
    */
  var latitude: Double
  
  /**
    * The longitude in degrees.
    */
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
