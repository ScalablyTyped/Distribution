package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trip extends StObject {
  
  /**
    * Location where the customer was dropped off.
    */
  var actualDropOffLocation: LatLngLiteral | Null
  
  /**
    * Location where the customer was picked up.
    */
  var actualPickupLocation: LatLngLiteral | Null
  
  /**
    * The estimated future time when the passengers will be dropped off, or the
    * actual time when they were dropped off.
    */
  var dropOffTime: js.Date | Null
  
  /**
    * Information specific to the last location update.
    */
  var latestVehicleLocationUpdate: VehicleLocationUpdate | Null
  
  /**
    * In the format &quot;providers/{provider_id}/trips/{trip_id}&quot;. The
    * trip_id must be a unique identifier.
    */
  var name: String
  
  /**
    * Number of passengers on this trip; does not include the driver.
    */
  var passengerCount: Double
  
  /**
    * The estimated future time when the passengers will be picked up, or the
    * actual time when they were picked up.
    */
  var pickupTime: js.Date | Null
  
  /**
    * Location where the customer indicates they will be dropped off.
    */
  var plannedDropOffLocation: LatLngLiteral | Null
  
  /**
    * Location where customer indicates they will be picked up.
    */
  var plannedPickupLocation: LatLngLiteral | Null
  
  /**
    * An array of waypoints indicating the path from the current location to
    * the drop-off point.
    */
  var remainingWaypoints: js.Array[VehicleWaypoint]
  
  /**
    * Current status of the trip. Possible values are UNKNOWN_TRIP_STATUS, NEW,
    * ENROUTE_TO_PICKUP, ARRIVED_AT_PICKUP,
    * ARRIVED_AT_INTERMEDIATE_DESTINATION, ENROUTE_TO_INTERMEDIATE_DESTINATION,
    * ENROUTE_TO_DROPOFF, COMPLETE, or CANCELED.
    */
  var status: String
  
  /**
    * The type of the trip. Possible values are UNKNOWN_TRIP_TYPE, SHARED or
    * EXCLUSIVE.
    */
  var `type`: String
  
  /**
    * ID of the vehicle making this trip.
    */
  var vehicleId: String
}
object Trip {
  
  inline def apply(
    name: String,
    passengerCount: Double,
    remainingWaypoints: js.Array[VehicleWaypoint],
    status: String,
    `type`: String,
    vehicleId: String
  ): Trip = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], passengerCount = passengerCount.asInstanceOf[js.Any], remainingWaypoints = remainingWaypoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vehicleId = vehicleId.asInstanceOf[js.Any], actualDropOffLocation = null, actualPickupLocation = null, dropOffTime = null, latestVehicleLocationUpdate = null, pickupTime = null, plannedDropOffLocation = null, plannedPickupLocation = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Trip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Trip] (val x: Self) extends AnyVal {
    
    inline def setActualDropOffLocation(value: LatLngLiteral): Self = StObject.set(x, "actualDropOffLocation", value.asInstanceOf[js.Any])
    
    inline def setActualDropOffLocationNull: Self = StObject.set(x, "actualDropOffLocation", null)
    
    inline def setActualPickupLocation(value: LatLngLiteral): Self = StObject.set(x, "actualPickupLocation", value.asInstanceOf[js.Any])
    
    inline def setActualPickupLocationNull: Self = StObject.set(x, "actualPickupLocation", null)
    
    inline def setDropOffTime(value: js.Date): Self = StObject.set(x, "dropOffTime", value.asInstanceOf[js.Any])
    
    inline def setDropOffTimeNull: Self = StObject.set(x, "dropOffTime", null)
    
    inline def setLatestVehicleLocationUpdate(value: VehicleLocationUpdate): Self = StObject.set(x, "latestVehicleLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setLatestVehicleLocationUpdateNull: Self = StObject.set(x, "latestVehicleLocationUpdate", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPassengerCount(value: Double): Self = StObject.set(x, "passengerCount", value.asInstanceOf[js.Any])
    
    inline def setPickupTime(value: js.Date): Self = StObject.set(x, "pickupTime", value.asInstanceOf[js.Any])
    
    inline def setPickupTimeNull: Self = StObject.set(x, "pickupTime", null)
    
    inline def setPlannedDropOffLocation(value: LatLngLiteral): Self = StObject.set(x, "plannedDropOffLocation", value.asInstanceOf[js.Any])
    
    inline def setPlannedDropOffLocationNull: Self = StObject.set(x, "plannedDropOffLocation", null)
    
    inline def setPlannedPickupLocation(value: LatLngLiteral): Self = StObject.set(x, "plannedPickupLocation", value.asInstanceOf[js.Any])
    
    inline def setPlannedPickupLocationNull: Self = StObject.set(x, "plannedPickupLocation", null)
    
    inline def setRemainingWaypoints(value: js.Array[VehicleWaypoint]): Self = StObject.set(x, "remainingWaypoints", value.asInstanceOf[js.Any])
    
    inline def setRemainingWaypointsVarargs(value: VehicleWaypoint*): Self = StObject.set(x, "remainingWaypoints", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVehicleId(value: String): Self = StObject.set(x, "vehicleId", value.asInstanceOf[js.Any])
  }
}
