package typings.googleMaps.google.maps.journeySharing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FleetEngineServiceType extends StObject
/**
  * Available only in the v=beta channel: https://goo.gle/3oAthT3.
  * Types of Fleet Engine services.
  */
@JSGlobal("google.maps.journeySharing.FleetEngineServiceType")
@js.native
object FleetEngineServiceType extends StObject {
  
  /**
    * Fleet Engine service used to access delivery vehicles.
    */
  @js.native
  sealed trait DELIVERY_VEHICLE_SERVICE
    extends StObject
       with FleetEngineServiceType
  
  /**
    * Fleet Engine service used to access task information.
    */
  @js.native
  sealed trait TASK_SERVICE
    extends StObject
       with FleetEngineServiceType
  
  /**
    * Fleet Engine service used to access trip information.
    */
  @js.native
  sealed trait TRIP_SERVICE
    extends StObject
       with FleetEngineServiceType
  
  /**
    * Unknown Fleet Engine service.
    */
  @js.native
  sealed trait UNKNOWN_SERVICE
    extends StObject
       with FleetEngineServiceType
}
