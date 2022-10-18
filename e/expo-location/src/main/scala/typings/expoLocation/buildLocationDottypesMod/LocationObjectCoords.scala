package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationObjectCoords extends StObject {
  
  /**
    * The radius of uncertainty for the location, measured in meters. Can be `null` on Web if it's not available.
    */
  var accuracy: Double | Null
  
  /**
    * The altitude in meters above the WGS 84 reference ellipsoid. Can be `null` on Web if it's not available.
    */
  var altitude: Double | Null
  
  /**
    * The accuracy of the altitude value, in meters. Can be `null` on Web if it's not available.
    */
  var altitudeAccuracy: Double | Null
  
  /**
    * Horizontal direction of travel of this device, measured in degrees starting at due north and
    * continuing clockwise around the compass. Thus, north is 0 degrees, east is 90 degrees, south is
    * 180 degrees, and so on. Can be `null` on Web if it's not available.
    */
  var heading: Double | Null
  
  /**
    * The latitude in degrees.
    */
  var latitude: Double
  
  /**
    * The longitude in degrees.
    */
  var longitude: Double
  
  /**
    * The instantaneous speed of the device in meters per second. Can be `null` on Web if it's not available.
    */
  var speed: Double | Null
}
object LocationObjectCoords {
  
  inline def apply(latitude: Double, longitude: Double): LocationObjectCoords = {
    val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], accuracy = null, altitude = null, altitudeAccuracy = null, heading = null, speed = null)
    __obj.asInstanceOf[LocationObjectCoords]
  }
  
  extension [Self <: LocationObjectCoords](x: Self) {
    
    inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyNull: Self = StObject.set(x, "accuracy", null)
    
    inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    inline def setAltitudeAccuracyNull: Self = StObject.set(x, "altitudeAccuracy", null)
    
    inline def setAltitudeNull: Self = StObject.set(x, "altitude", null)
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedNull: Self = StObject.set(x, "speed", null)
  }
}
