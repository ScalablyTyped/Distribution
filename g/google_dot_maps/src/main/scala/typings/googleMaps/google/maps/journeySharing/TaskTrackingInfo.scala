package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.LatLng
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskTrackingInfo extends StObject {
  
  /**
    * The estimated arrival time to the stop location.
    */
  var estimatedArrivalTime: js.Date | Null
  
  /**
    * The estimated completion time of a Task.
    */
  var estimatedTaskCompletionTime: js.Date | Null
  
  /**
    * Information specific to the last location update.
    */
  var latestVehicleLocationUpdate: VehicleLocationUpdate | Null
  
  /**
    * The name in the format
    * &quot;providers/{provider_id}/taskTrackingInfo/{tracking_id}&quot;, where
    * <code>tracking_id</code> represents the tracking ID.
    */
  var name: String
  
  /**
    * The location where the Task will be completed.
    */
  var plannedLocation: LatLng | Null
  
  /**
    * The total remaining distance in meters to the <code>VehicleStop</code> of
    * interest.
    */
  var remainingDrivingDistanceMeters: Double | Null
  
  /**
    * Indicates the number of stops the vehicle remaining until the task stop
    * is reached, including the task stop. For example, if the vehicle&#39;s
    * next stop is the task stop, the value will be 1.
    */
  var remainingStopCount: Double | Null
  
  /**
    * A list of points which when connected forms a polyline of the
    * vehicle&#39;s expected route to the location of this task.
    */
  var routePolylinePoints: js.Array[LatLng] | Null
  
  /**
    * The current execution state of the Task.
    */
  var state: String | Null
  
  /**
    * The time window during which the task should be completed.
    */
  var targetTimeWindow: TimeWindow | Null
  
  /**
    * The outcome of attempting to execute a Task.
    */
  var taskOutcome: String | Null
  
  /**
    * The time when the Task&#39;s outcome was set by the provider.
    */
  var taskOutcomeTime: js.Date | Null
  
  /**
    * The tracking ID of a Task.<br> <ul> <li>Must be a valid Unicode
    * string.</li> <li>Limited to a maximum length of 64 characters.</li>
    * <li>Normalized according to <a
    * href="http://www.unicode.org/reports/tr15/">Unicode Normalization Form
    * C</a>.</li> <li>May not contain any of the following ASCII characters:
    * &#39;/&#39;, &#39;:&#39;, &#39;?&#39;, &#39;,&#39;, or
    * &#39;#&#39;.</li> </ul>
    */
  var trackingId: String
}
object TaskTrackingInfo {
  
  inline def apply(name: String, trackingId: String): TaskTrackingInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], trackingId = trackingId.asInstanceOf[js.Any], estimatedArrivalTime = null, estimatedTaskCompletionTime = null, latestVehicleLocationUpdate = null, plannedLocation = null, remainingDrivingDistanceMeters = null, remainingStopCount = null, routePolylinePoints = null, state = null, targetTimeWindow = null, taskOutcome = null, taskOutcomeTime = null)
    __obj.asInstanceOf[TaskTrackingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskTrackingInfo] (val x: Self) extends AnyVal {
    
    inline def setEstimatedArrivalTime(value: js.Date): Self = StObject.set(x, "estimatedArrivalTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedArrivalTimeNull: Self = StObject.set(x, "estimatedArrivalTime", null)
    
    inline def setEstimatedTaskCompletionTime(value: js.Date): Self = StObject.set(x, "estimatedTaskCompletionTime", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTaskCompletionTimeNull: Self = StObject.set(x, "estimatedTaskCompletionTime", null)
    
    inline def setLatestVehicleLocationUpdate(value: VehicleLocationUpdate): Self = StObject.set(x, "latestVehicleLocationUpdate", value.asInstanceOf[js.Any])
    
    inline def setLatestVehicleLocationUpdateNull: Self = StObject.set(x, "latestVehicleLocationUpdate", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlannedLocation(value: LatLng): Self = StObject.set(x, "plannedLocation", value.asInstanceOf[js.Any])
    
    inline def setPlannedLocationNull: Self = StObject.set(x, "plannedLocation", null)
    
    inline def setRemainingDrivingDistanceMeters(value: Double): Self = StObject.set(x, "remainingDrivingDistanceMeters", value.asInstanceOf[js.Any])
    
    inline def setRemainingDrivingDistanceMetersNull: Self = StObject.set(x, "remainingDrivingDistanceMeters", null)
    
    inline def setRemainingStopCount(value: Double): Self = StObject.set(x, "remainingStopCount", value.asInstanceOf[js.Any])
    
    inline def setRemainingStopCountNull: Self = StObject.set(x, "remainingStopCount", null)
    
    inline def setRoutePolylinePoints(value: js.Array[LatLng]): Self = StObject.set(x, "routePolylinePoints", value.asInstanceOf[js.Any])
    
    inline def setRoutePolylinePointsNull: Self = StObject.set(x, "routePolylinePoints", null)
    
    inline def setRoutePolylinePointsVarargs(value: LatLng*): Self = StObject.set(x, "routePolylinePoints", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setTargetTimeWindow(value: TimeWindow): Self = StObject.set(x, "targetTimeWindow", value.asInstanceOf[js.Any])
    
    inline def setTargetTimeWindowNull: Self = StObject.set(x, "targetTimeWindow", null)
    
    inline def setTaskOutcome(value: String): Self = StObject.set(x, "taskOutcome", value.asInstanceOf[js.Any])
    
    inline def setTaskOutcomeNull: Self = StObject.set(x, "taskOutcome", null)
    
    inline def setTaskOutcomeTime(value: js.Date): Self = StObject.set(x, "taskOutcomeTime", value.asInstanceOf[js.Any])
    
    inline def setTaskOutcomeTimeNull: Self = StObject.set(x, "taskOutcomeTime", null)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
  }
}
