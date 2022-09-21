package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * The details for a trip returned by Fleet Engine.
  */
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
  var name: String | Null
  
  /**
    * Number of passengers on this trip; does not include the driver.
    */
  var passengerCount: Double | Null
  
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
  var remainingWaypoints: js.Array[VehicleWaypoint] | Null
  
  /**
    * Current status of the trip. Possible values are UNKNOWN_TRIP_STATUS, NEW,
    * ENROUTE_TO_PICKUP, ARRIVED_AT_PICKUP,
    * ARRIVED_AT_INTERMEDIATE_DESTINATION, ENROUTE_TO_INTERMEDIATE_DESTINATION,
    * ENROUTE_TO_DROPOFF, COMPLETE, or CANCELED.
    */
  var status: String | Null
  
  /**
    * The type of the trip. Possible values are UNKNOWN_TRIP_TYPE, SHARED or
    * EXCLUSIVE.
    */
  var `type`: String | Null
  
  /**
    * ID of the vehicle making this trip.
    */
  var vehicleId: String | Null
}
object Trip {
  
  inline def apply(): Trip = {
    val __obj = js.Dynamic.literal(actualDropOffLocation = null, actualPickupLocation = null, dropOffTime = null, latestVehicleLocationUpdate = null, name = null, passengerCount = null, pickupTime = null, plannedDropOffLocation = null, plannedPickupLocation = null, remainingWaypoints = null, status = null, vehicleId = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[Trip]
  }
  
  extension [Self <: Trip](x: Self) {
    
    inline def setActualDropOffLocation(value: LatLngLiteral): Self = StObject.set(x, "actualDropOffLocation", value.asInstanceOf[js.Any])
    
    inline def setActualDropOffLocationNull: Self = StObject.set(x, "actualDropOffLocation", null)
    
    inline def setActualPickupLocation(value: LatLngLiteral): Self = StObject.set(x, "actualPickupLocation", value.asInstanceOf[js.Any])
    
    inline def setActualPickupLocationNull: Self = StObject.set(x, "actualPickupLocation", null)
    
    inline def setDropOffTime(value: js.Date): Self = StObject.set(x, "dropOffTime", value.asInstanceOf[js.Any])
    
    inline def setDropOffTimeNull: Self = StObject.set(x, "dropOffTime", null)
    
    inline def setLatestVehicleLocationUpdate(value: VehicleLocationUpdate): Self = StObject.set(x, "latestVehicleLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setLatestVehicleLocationUpdateNull: Self = StObject.set(x, "latestVehicleLocationUpdate", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setPassengerCount(value: Double): Self = StObject.set(x, "passengerCount", value.asInstanceOf[js.Any])
    
    inline def setPassengerCountNull: Self = StObject.set(x, "passengerCount", null)
    
    inline def setPickupTime(value: js.Date): Self = StObject.set(x, "pickupTime", value.asInstanceOf[js.Any])
    
    inline def setPickupTimeNull: Self = StObject.set(x, "pickupTime", null)
    
    inline def setPlannedDropOffLocation(value: LatLngLiteral): Self = StObject.set(x, "plannedDropOffLocation", value.asInstanceOf[js.Any])
    
    inline def setPlannedDropOffLocationNull: Self = StObject.set(x, "plannedDropOffLocation", null)
    
    inline def setPlannedPickupLocation(value: LatLngLiteral): Self = StObject.set(x, "plannedPickupLocation", value.asInstanceOf[js.Any])
    
    inline def setPlannedPickupLocationNull: Self = StObject.set(x, "plannedPickupLocation", null)
    
    inline def setRemainingWaypoints(value: js.Array[VehicleWaypoint]): Self = StObject.set(x, "remainingWaypoints", value.asInstanceOf[js.Any])
    
    inline def setRemainingWaypointsNull: Self = StObject.set(x, "remainingWaypoints", null)
    
    inline def setRemainingWaypointsVarargs(value: VehicleWaypoint*): Self = StObject.set(x, "remainingWaypoints", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setVehicleId(value: String): Self = StObject.set(x, "vehicleId", value.asInstanceOf[js.Any])
    
    inline def setVehicleIdNull: Self = StObject.set(x, "vehicleId", null)
  }
}
