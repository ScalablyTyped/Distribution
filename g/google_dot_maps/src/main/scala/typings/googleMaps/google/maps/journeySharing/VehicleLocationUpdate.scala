package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLng
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VehicleLocationUpdate extends StObject {
  
  /**
    * The heading of the update. 0 corresponds to north, 180 to south.
    */
  var heading: Double | Null
  
  /**
    * The location of the update.
    */
  var location: LatLngLiteral | Null | LatLng
  
  /**
    * The speed in kilometers per hour.
    */
  var speedKilometersPerHour: Double | Null
  
  /**
    * The time this update was received from the vehicle.
    */
  var time: js.Date | Null
}
object VehicleLocationUpdate {
  
  inline def apply(): VehicleLocationUpdate = {
    val __obj = js.Dynamic.literal(heading = null, location = null, speedKilometersPerHour = null, time = null)
    __obj.asInstanceOf[VehicleLocationUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VehicleLocationUpdate] (val x: Self) extends AnyVal {
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingNull: Self = StObject.set(x, "heading", null)
    
    inline def setLocation(value: LatLngLiteral | LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setSpeedKilometersPerHour(value: Double): Self = StObject.set(x, "speedKilometersPerHour", value.asInstanceOf[js.Any])
    
    inline def setSpeedKilometersPerHourNull: Self = StObject.set(x, "speedKilometersPerHour", null)
    
    inline def setTime(value: js.Date): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeNull: Self = StObject.set(x, "time", null)
  }
}
