package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Event object returned by the shipment location provider&#39;s update event.
  */
trait FleetEngineShipmentLocationProviderUpdateEvent extends StObject {
  
  /**
    * The task structure returned by the update. Unmodifiable.
    */
  var task: Task | Null
}
object FleetEngineShipmentLocationProviderUpdateEvent {
  
  inline def apply(): FleetEngineShipmentLocationProviderUpdateEvent = {
    val __obj = js.Dynamic.literal(task = null)
    __obj.asInstanceOf[FleetEngineShipmentLocationProviderUpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineShipmentLocationProviderUpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskNull: Self = StObject.set(x, "task", null)
  }
}
