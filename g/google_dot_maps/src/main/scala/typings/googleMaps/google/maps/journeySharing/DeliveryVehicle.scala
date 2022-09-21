package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StringDictionary
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * The details for a delivery vehicle returned by Fleet Engine.
  */
trait DeliveryVehicle extends StObject {
  
  /**
    * Custom delivery vehicle attributes.
    */
  var attributes: StringDictionary[String | Null]
  
  /**
    * The location where the current route segment ends.
    */
  var currentRouteSegmentEndPoint: LatLngLiteral | Null
  
  /**
    * The last reported location of the delivery vehicle.
    */
  var latestVehicleLocationUpdate: VehicleLocationUpdate | Null
  
  /**
    * In the format
    * &quot;providers/{provider_id}/deliveryVehicles/{delivery_vehicle_id}&quot;.
    * The delivery_vehicle_id must be a unique identifier.
    */
  var name: String | Null
  
  /**
    * The current navigation status of the vehicle.
    */
  var navigationStatus: String | Null
  
  /**
    * The remaining driving distance in the current route segment, in meters.
    */
  var remainingDistanceMeters: Double | Null
  
  /**
    * The remaining driving duration in the current route segment, in
    * milliseconds.
    */
  var remainingDurationMillis: Double | Null
  
  /**
    * The journey segments assigned to this delivery vehicle, starting from the
    * vehicle&#39;s most recently reported location.
    */
  var remainingVehicleJourneySegments: js.Array[VehicleJourneySegment] | Null
}
object DeliveryVehicle {
  
  inline def apply(attributes: StringDictionary[String | Null]): DeliveryVehicle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], currentRouteSegmentEndPoint = null, latestVehicleLocationUpdate = null, name = null, navigationStatus = null, remainingDistanceMeters = null, remainingDurationMillis = null, remainingVehicleJourneySegments = null)
    __obj.asInstanceOf[DeliveryVehicle]
  }
  
  extension [Self <: DeliveryVehicle](x: Self) {
    
    inline def setAttributes(value: StringDictionary[String | Null]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCurrentRouteSegmentEndPoint(value: LatLngLiteral): Self = StObject.set(x, "currentRouteSegmentEndPoint", value.asInstanceOf[js.Any])
    
    inline def setCurrentRouteSegmentEndPointNull: Self = StObject.set(x, "currentRouteSegmentEndPoint", null)
    
    inline def setLatestVehicleLocationUpdate(value: VehicleLocationUpdate): Self = StObject.set(x, "latestVehicleLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setLatestVehicleLocationUpdateNull: Self = StObject.set(x, "latestVehicleLocationUpdate", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNavigationStatus(value: String): Self = StObject.set(x, "navigationStatus", value.asInstanceOf[js.Any])
    
    inline def setNavigationStatusNull: Self = StObject.set(x, "navigationStatus", null)
    
    inline def setRemainingDistanceMeters(value: Double): Self = StObject.set(x, "remainingDistanceMeters", value.asInstanceOf[js.Any])
    
    inline def setRemainingDistanceMetersNull: Self = StObject.set(x, "remainingDistanceMeters", null)
    
    inline def setRemainingDurationMillis(value: Double): Self = StObject.set(x, "remainingDurationMillis", value.asInstanceOf[js.Any])
    
    inline def setRemainingDurationMillisNull: Self = StObject.set(x, "remainingDurationMillis", null)
    
    inline def setRemainingVehicleJourneySegments(value: js.Array[VehicleJourneySegment]): Self = StObject.set(x, "remainingVehicleJourneySegments", value.asInstanceOf[js.Any])
    
    inline def setRemainingVehicleJourneySegmentsNull: Self = StObject.set(x, "remainingVehicleJourneySegments", null)
    
    inline def setRemainingVehicleJourneySegmentsVarargs(value: VehicleJourneySegment*): Self = StObject.set(x, "remainingVehicleJourneySegments", js.Array(value*))
  }
}
