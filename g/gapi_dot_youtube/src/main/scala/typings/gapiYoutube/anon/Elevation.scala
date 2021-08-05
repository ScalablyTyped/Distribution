package typings.gapiYoutube.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elevation extends StObject {
  
  /**
    * Altitude above the WGS 84 reference ellipsoid, in meters.
    */
  var elevation: Double
  
  /**
    * Latitude in degrees.
    */
  var latitude: Double
  
  /**
    * Longitude in degrees.
    */
  var longitude: Double
}
object Elevation {
  
  inline def apply(elevation: Double, latitude: Double, longitude: Double): Elevation = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elevation]
  }
  
  extension [Self <: Elevation](x: Self) {
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
  }
}
