package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLngLiteral
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  /**
    * The timestamp of the estimated completion time of the task.
    */
  var estimatedCompletionTime: js.Date | Null
  
  /**
    * Information specific to the last location update.
    */
  var latestVehicleLocationUpdate: VehicleLocationUpdate | Null
  
  /**
    * The task name in the format
    * &quot;providers/{provider_id}/tasks/{task_id}&quot;. The task_id must be
    * a unique identifier and not a tracking ID. To store a tracking ID of a
    * shipment, use the tracking_id field. Multiple tasks can have the same
    * tracking_id.
    */
  var name: String
  
  /**
    * The outcome of the task.
    */
  var outcome: String | Null
  
  /**
    * The location where the task was completed (from provider).
    */
  var outcomeLocation: LatLngLiteral | Null
  
  /**
    * The setter of the task outcome location (&#39;PROVIDER&#39; or
    * &#39;LAST_VEHICLE_LOCATION&#39;).
    */
  var outcomeLocationSource: String | Null
  
  /**
    * The timestamp of when the task&#39;s outcome was set (from provider).
    */
  var outcomeTime: js.Date | Null
  
  /**
    * The location where the task is to be completed.
    */
  var plannedLocation: LatLngLiteral | Null
  
  /**
    * Information about the segments left to be completed for this task.
    */
  var remainingVehicleJourneySegments: js.Array[VehicleJourneySegment]
  
  /**
    * The current execution state of the task.
    */
  var status: String
  
  /**
    * The time window during which the task should be completed.
    */
  var targetTimeWindow: TimeWindow | Null
  
  /**
    * The tracking ID of the shipment.
    */
  var trackingId: String | Null
  
  /**
    * The task type; for example, a break or shipment.
    */
  var `type`: String
  
  /**
    * The ID of the vehicle performing this task.
    */
  var vehicleId: String | Null
}
object Task {
  
  inline def apply(
    name: String,
    remainingVehicleJourneySegments: js.Array[VehicleJourneySegment],
    status: String,
    `type`: String
  ): Task = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], remainingVehicleJourneySegments = remainingVehicleJourneySegments.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], estimatedCompletionTime = null, latestVehicleLocationUpdate = null, outcome = null, outcomeLocation = null, outcomeLocationSource = null, outcomeTime = null, plannedLocation = null, targetTimeWindow = null, trackingId = null, vehicleId = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
    
    inline def setEstimatedCompletionTime(value: js.Date): Self = StObject.set(x, "estimatedCompletionTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedCompletionTimeNull: Self = StObject.set(x, "estimatedCompletionTime", null)
    
    inline def setLatestVehicleLocationUpdate(value: VehicleLocationUpdate): Self = StObject.set(x, "latestVehicleLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setLatestVehicleLocationUpdateNull: Self = StObject.set(x, "latestVehicleLocationUpdate", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOutcome(value: String): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeLocation(value: LatLngLiteral): Self = StObject.set(x, "outcomeLocation", value.asInstanceOf[js.Any])
    
    inline def setOutcomeLocationNull: Self = StObject.set(x, "outcomeLocation", null)
    
    inline def setOutcomeLocationSource(value: String): Self = StObject.set(x, "outcomeLocationSource", value.asInstanceOf[js.Any])
    
    inline def setOutcomeLocationSourceNull: Self = StObject.set(x, "outcomeLocationSource", null)
    
    inline def setOutcomeNull: Self = StObject.set(x, "outcome", null)
    
    inline def setOutcomeTime(value: js.Date): Self = StObject.set(x, "outcomeTime", value.asInstanceOf[js.Any])
    
    inline def setOutcomeTimeNull: Self = StObject.set(x, "outcomeTime", null)
    
    inline def setPlannedLocation(value: LatLngLiteral): Self = StObject.set(x, "plannedLocation", value.asInstanceOf[js.Any])
    
    inline def setPlannedLocationNull: Self = StObject.set(x, "plannedLocation", null)
    
    inline def setRemainingVehicleJourneySegments(value: js.Array[VehicleJourneySegment]): Self = StObject.set(x, "remainingVehicleJourneySegments", value.asInstanceOf[js.Any])
    
    inline def setRemainingVehicleJourneySegmentsVarargs(value: VehicleJourneySegment*): Self = StObject.set(x, "remainingVehicleJourneySegments", js.Array(value*))
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTargetTimeWindow(value: TimeWindow): Self = StObject.set(x, "targetTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setTargetTimeWindowNull: Self = StObject.set(x, "targetTimeWindow", null)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVehicleId(value: String): Self = StObject.set(x, "vehicleId", value.asInstanceOf[js.Any])
    
    inline def setVehicleIdNull: Self = StObject.set(x, "vehicleId", null)
  }
}
