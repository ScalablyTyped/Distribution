package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Contains additional information needed to mint JSON Web Tokens.
  */
trait AuthTokenContext extends StObject {
  
  /**
    * When provided, the minted token should have a private
    * <code>DeliveryVehicleId</code> claim for the provided deliveryVehicleId.
    */
  var deliveryVehicleId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When provided, the minted token should have a private <code>TaskId</code>
    * claim for the provided taskId.
    */
  var taskId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When provided, the minted token should have a private
    * <code>TrackingId</code> claim for the provided trackingId.
    */
  var trackingId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When provided, the minted token should have a private <code>TripId</code>
    * claim for the provided tripId.
    */
  var tripId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * When provided, the minted token should have a private
    * <code>VehicleId</code> claim for the provided vehicleId.
    */
  var vehicleId: js.UndefOr[String | Null] = js.undefined
}
object AuthTokenContext {
  
  inline def apply(): AuthTokenContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthTokenContext]
  }
  
  extension [Self <: AuthTokenContext](x: Self) {
    
    inline def setDeliveryVehicleId(value: String): Self = StObject.set(x, "deliveryVehicleId", value.asInstanceOf[js.Any])
    
    inline def setDeliveryVehicleIdNull: Self = StObject.set(x, "deliveryVehicleId", null)
    
    inline def setDeliveryVehicleIdUndefined: Self = StObject.set(x, "deliveryVehicleId", js.undefined)
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    inline def setTaskIdNull: Self = StObject.set(x, "taskId", null)
    
    inline def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    inline def setTrackingId(value: String): Self = StObject.set(x, "trackingId", value.asInstanceOf[js.Any])
    
    inline def setTrackingIdNull: Self = StObject.set(x, "trackingId", null)
    
    inline def setTrackingIdUndefined: Self = StObject.set(x, "trackingId", js.undefined)
    
    inline def setTripId(value: String): Self = StObject.set(x, "tripId", value.asInstanceOf[js.Any])
    
    inline def setTripIdNull: Self = StObject.set(x, "tripId", null)
    
    inline def setTripIdUndefined: Self = StObject.set(x, "tripId", js.undefined)
    
    inline def setVehicleId(value: String): Self = StObject.set(x, "vehicleId", value.asInstanceOf[js.Any])
    
    inline def setVehicleIdNull: Self = StObject.set(x, "vehicleId", null)
    
    inline def setVehicleIdUndefined: Self = StObject.set(x, "vehicleId", js.undefined)
  }
}
