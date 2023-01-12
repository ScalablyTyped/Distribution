package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Event object returned by the delivery fleet location provider&#39;s update
  * event.
  */
trait FleetEngineDeliveryFleetLocationProviderUpdateEvent extends StObject {
  
  /**
    * The list of delivery vehicles returned by the query. Unmodifiable.
    */
  var deliveryVehicles: js.Array[DeliveryVehicle] | Null
}
object FleetEngineDeliveryFleetLocationProviderUpdateEvent {
  
  inline def apply(): FleetEngineDeliveryFleetLocationProviderUpdateEvent = {
    val __obj = js.Dynamic.literal(deliveryVehicles = null)
    __obj.asInstanceOf[FleetEngineDeliveryFleetLocationProviderUpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FleetEngineDeliveryFleetLocationProviderUpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setDeliveryVehicles(value: js.Array[DeliveryVehicle]): Self = StObject.set(x, "deliveryVehicles", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehiclesNull: Self = StObject.set(x, "deliveryVehicles", null)
    
    inline def setDeliveryVehiclesVarargs(value: DeliveryVehicle*): Self = StObject.set(x, "deliveryVehicles", js.Array(value*))
  }
}
