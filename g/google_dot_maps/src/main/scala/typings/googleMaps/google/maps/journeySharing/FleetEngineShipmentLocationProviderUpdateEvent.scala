package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetEngineShipmentLocationProviderUpdateEvent extends StObject {
  
  /**
    * The task tracking info structure returned by the update. Unmodifiable.
    */
  var taskTrackingInfo: TaskTrackingInfo | Null
}
object FleetEngineShipmentLocationProviderUpdateEvent {
  
  inline def apply(): FleetEngineShipmentLocationProviderUpdateEvent = {
    val __obj = js.Dynamic.literal(taskTrackingInfo = null)
    __obj.asInstanceOf[FleetEngineShipmentLocationProviderUpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineShipmentLocationProviderUpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setTaskTrackingInfo(value: TaskTrackingInfo): Self = StObject.set(x, "taskTrackingInfo", value.asInstanceOf[js.Any])
    
    inline def setTaskTrackingInfoNull: Self = StObject.set(x, "taskTrackingInfo", null)
  }
}
