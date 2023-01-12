package typings.googleMaps.google.maps.journeySharing

import typings.googleMaps.google.maps.MapsEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Delivery Vehicle Location Provider.
  */
trait FleetEngineDeliveryVehicleLocationProvider
  extends StObject
     with LocationProvider {
  
  /**
    * ID for the vehicle that this location provider observes. Set this field
    * to track a vehicle.
    */
  var deliveryVehicleId: String
  
  /**
    * Optionally allow users to display the task&#39;s outcome location.
    */
  var shouldShowOutcomeLocations: Boolean | Null
  
  /**
    * Optionally allow users to display fetched tasks.
    */
  var shouldShowTasks: Boolean | Null
  
  /**
    * This Field is read-only. Threshold for stale vehicle location. If the
    * last updated location for the vehicle is older than this threshold, the
    * vehicle will not be displayed.
    */
  var staleLocationThresholdMillis: Double
  
  /**
    * Returns the filter options to apply when fetching tasks.
    */
  var taskFilterOptions: FleetEngineTaskFilterOptions
}
object FleetEngineDeliveryVehicleLocationProvider {
  
  inline def apply(
    addListener: (String, js.Function) => MapsEventListener,
    deliveryVehicleId: String,
    staleLocationThresholdMillis: Double,
    taskFilterOptions: FleetEngineTaskFilterOptions
  ): FleetEngineDeliveryVehicleLocationProvider = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), deliveryVehicleId = deliveryVehicleId.asInstanceOf[js.Any], staleLocationThresholdMillis = staleLocationThresholdMillis.asInstanceOf[js.Any], taskFilterOptions = taskFilterOptions.asInstanceOf[js.Any], shouldShowOutcomeLocations = null, shouldShowTasks = null)
    __obj.asInstanceOf[FleetEngineDeliveryVehicleLocationProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineDeliveryVehicleLocationProvider] (val x: Self) extends AnyVal {
    
    inline def setDeliveryVehicleId(value: String): Self = StObject.set(x, "deliveryVehicleId", value.asInstanceOf[js.Any])
    
    inline def setShouldShowOutcomeLocations(value: Boolean): Self = StObject.set(x, "shouldShowOutcomeLocations", value.asInstanceOf[js.Any])
    
    inline def setShouldShowOutcomeLocationsNull: Self = StObject.set(x, "shouldShowOutcomeLocations", null)
    
    inline def setShouldShowTasks(value: Boolean): Self = StObject.set(x, "shouldShowTasks", value.asInstanceOf[js.Any])
    
    inline def setShouldShowTasksNull: Self = StObject.set(x, "shouldShowTasks", null)
    
    inline def setStaleLocationThresholdMillis(value: Double): Self = StObject.set(x, "staleLocationThresholdMillis", value.asInstanceOf[js.Any])
    
    inline def setTaskFilterOptions(value: FleetEngineTaskFilterOptions): Self = StObject.set(x, "taskFilterOptions", value.asInstanceOf[js.Any])
  }
}
