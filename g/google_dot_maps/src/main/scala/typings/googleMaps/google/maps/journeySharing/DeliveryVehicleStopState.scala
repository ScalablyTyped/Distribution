package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeliveryVehicleStopState extends StObject
@JSGlobal("google.maps.journeySharing.DeliveryVehicleStopState")
@js.native
object DeliveryVehicleStopState extends StObject {
  
  /**
    * Arrived at stop. Assumes that when the vehicle is routing to the next
    * stop, that all previous stops have been completed.
    */
  @js.native
  sealed trait ARRIVED
    extends StObject
       with DeliveryVehicleStopState
  
  /**
    * Assigned and actively routing.
    */
  @js.native
  sealed trait ENROUTE
    extends StObject
       with DeliveryVehicleStopState
  
  /**
    * Created, but not actively routing.
    */
  @js.native
  sealed trait NEW
    extends StObject
       with DeliveryVehicleStopState
  
  /**
    * Unknown.
    */
  @js.native
  sealed trait UNSPECIFIED
    extends StObject
       with DeliveryVehicleStopState
}
