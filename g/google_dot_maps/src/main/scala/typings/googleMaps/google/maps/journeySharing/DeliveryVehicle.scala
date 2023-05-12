package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StringDictionary
import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var name: String
  
  /**
    * The current navigation status of the vehicle.
    */
  var navigationStatus: String
  
  /**
    * The remaining driving distance in the current route segment, in meters.
    */
  var remainingDistanceMeters: Double
  
  /**
    * The remaining driving duration in the current route segment, in
    * milliseconds.
    */
  var remainingDurationMillis: Double | Null
  
  /**
    * The journey segments assigned to this delivery vehicle, starting from the
    * vehicle&#39;s most recently reported location.
    */
  var remainingVehicleJourneySegments: js.Array[VehicleJourneySegment]
}
object DeliveryVehicle {
  
  inline def apply(
    attributes: StringDictionary[String | Null],
    name: String,
    navigationStatus: String,
    remainingDistanceMeters: Double,
    remainingVehicleJourneySegments: js.Array[VehicleJourneySegment]
  ): DeliveryVehicle = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], navigationStatus = navigationStatus.asInstanceOf[js.Any], remainingDistanceMeters = remainingDistanceMeters.asInstanceOf[js.Any], remainingVehicleJourneySegments = remainingVehicleJourneySegments.asInstanceOf[js.Any], currentRouteSegmentEndPoint = null, latestVehicleLocationUpdate = null, remainingDurationMillis = null)
    __obj.asInstanceOf[DeliveryVehicle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeliveryVehicle] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: StringDictionary[String | Null]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setCurrentRouteSegmentEndPoint(value: LatLngLiteral): Self = StObject.set(x, "currentRouteSegmentEndPoint", value.asInstanceOf[js.Any])
    
    inline def setCurrentRouteSegmentEndPointNull: Self = StObject.set(x, "currentRouteSegmentEndPoint", null)
    
    inline def setLatestVehicleLocationUpdate(value: VehicleLocationUpdate): Self = StObject.set(x, "latestVehicleLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setLatestVehicleLocationUpdateNull: Self = StObject.set(x, "latestVehicleLocationUpdate", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNavigationStatus(value: String): Self = StObject.set(x, "navigationStatus", value.asInstanceOf[js.Any])
    
    inline def setRemainingDistanceMeters(value: Double): Self = StObject.set(x, "remainingDistanceMeters", value.asInstanceOf[js.Any])
    
    inline def setRemainingDurationMillis(value: Double): Self = StObject.set(x, "remainingDurationMillis", value.asInstanceOf[js.Any])
    
    inline def setRemainingDurationMillisNull: Self = StObject.set(x, "remainingDurationMillis", null)
    
    inline def setRemainingVehicleJourneySegments(value: js.Array[VehicleJourneySegment]): Self = StObject.set(x, "remainingVehicleJourneySegments", value.asInstanceOf[js.Any])
    
    inline def setRemainingVehicleJourneySegmentsVarargs(value: VehicleJourneySegment*): Self = StObject.set(x, "remainingVehicleJourneySegments", js.Array(value*))
  }
}
