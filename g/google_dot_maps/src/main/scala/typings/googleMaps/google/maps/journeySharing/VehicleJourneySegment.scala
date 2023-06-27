package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VehicleJourneySegment extends StObject {
  
  /**
    * The travel distance from the previous stop to this stop, in meters.
    */
  var drivingDistanceMeters: Double | Null
  
  /**
    * The travel time from the previous stop this stop, in milliseconds.
    */
  var drivingDurationMillis: Double | Null
  
  /**
    * The path from the previous stop (or the vehicle&#39;s current location,
    * if this stop is the first in the list of stops) to this stop.
    */
  var path: js.Array[LatLngLiteral] | Null
  
  /**
    * Information about the stop.
    */
  var stop: DeliveryVehicleStop | Null
}
object VehicleJourneySegment {
  
  inline def apply(): VehicleJourneySegment = {
    val __obj = js.Dynamic.literal(drivingDistanceMeters = null, drivingDurationMillis = null, path = null, stop = null)
    __obj.asInstanceOf[VehicleJourneySegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VehicleJourneySegment] (val x: Self) extends AnyVal {
    
    inline def setDrivingDistanceMeters(value: Double): Self = StObject.set(x, "drivingDistanceMeters", value.asInstanceOf[js.Any])
    
    inline def setDrivingDistanceMetersNull: Self = StObject.set(x, "drivingDistanceMeters", null)
    
    inline def setDrivingDurationMillis(value: Double): Self = StObject.set(x, "drivingDurationMillis", value.asInstanceOf[js.Any])
    
    inline def setDrivingDurationMillisNull: Self = StObject.set(x, "drivingDurationMillis", null)
    
    inline def setPath(value: js.Array[LatLngLiteral]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathVarargs(value: LatLngLiteral*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setStop(value: DeliveryVehicleStop): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    inline def setStopNull: Self = StObject.set(x, "stop", null)
  }
}
