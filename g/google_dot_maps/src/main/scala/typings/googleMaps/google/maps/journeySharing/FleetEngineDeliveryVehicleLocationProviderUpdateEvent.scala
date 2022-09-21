package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Event object returned by the delivery vehicle location provider&#39;s
  * update event.
  */
trait FleetEngineDeliveryVehicleLocationProviderUpdateEvent extends StObject {
  
  /**
    * The journey segments that have been completed by this vehicle.
    * Unmodifiable.
    */
  var completedVehicleJourneySegments: js.Array[VehicleJourneySegment] | Null
  
  /**
    * The delivery vehicle data structure returned by the update. Unmodifiable.
    */
  var deliveryVehicle: DeliveryVehicle | Null
  
  /**
    * The list of tasks served by this delivery vehicle. Unmodifiable.
    */
  var tasks: js.Array[Task] | Null
}
object FleetEngineDeliveryVehicleLocationProviderUpdateEvent {
  
  inline def apply(): FleetEngineDeliveryVehicleLocationProviderUpdateEvent = {
    val __obj = js.Dynamic.literal(completedVehicleJourneySegments = null, deliveryVehicle = null, tasks = null)
    __obj.asInstanceOf[FleetEngineDeliveryVehicleLocationProviderUpdateEvent]
  }
  
  extension [Self <: FleetEngineDeliveryVehicleLocationProviderUpdateEvent](x: Self) {
    
    inline def setCompletedVehicleJourneySegments(value: js.Array[VehicleJourneySegment]): Self = StObject.set(x, "completedVehicleJourneySegments", value.asInstanceOf[js.Any])
    
    inline def setCompletedVehicleJourneySegmentsNull: Self = StObject.set(x, "completedVehicleJourneySegments", null)
    
    inline def setCompletedVehicleJourneySegmentsVarargs(value: VehicleJourneySegment*): Self = StObject.set(x, "completedVehicleJourneySegments", js.Array(value*))
    
    inline def setDeliveryVehicle(value: DeliveryVehicle): Self = StObject.set(x, "deliveryVehicle", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleNull: Self = StObject.set(x, "deliveryVehicle", null)
    
    inline def setTasks(value: js.Array[Task]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksNull: Self = StObject.set(x, "tasks", null)
    
    inline def setTasksVarargs(value: Task*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
