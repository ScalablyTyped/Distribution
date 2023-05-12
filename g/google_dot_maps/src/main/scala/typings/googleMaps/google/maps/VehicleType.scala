package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VehicleType extends StObject
@JSGlobal("google.maps.VehicleType")
@js.native
object VehicleType extends StObject {
  
  /**
    * Bus.
    */
  @js.native
  sealed trait BUS
    extends StObject
       with VehicleType
  
  /**
    * A vehicle that operates on a cable, usually on the ground. Aerial cable
    * cars may be of the type <code>GONDOLA_LIFT</code>.
    */
  @js.native
  sealed trait CABLE_CAR
    extends StObject
       with VehicleType
  
  /**
    * Commuter rail.
    */
  @js.native
  sealed trait COMMUTER_TRAIN
    extends StObject
       with VehicleType
  
  /**
    * Ferry.
    */
  @js.native
  sealed trait FERRY
    extends StObject
       with VehicleType
  
  /**
    * A vehicle that is pulled up a steep incline by a cable.
    */
  @js.native
  sealed trait FUNICULAR
    extends StObject
       with VehicleType
  
  /**
    * An aerial cable car.
    */
  @js.native
  sealed trait GONDOLA_LIFT
    extends StObject
       with VehicleType
  
  /**
    * Heavy rail.
    */
  @js.native
  sealed trait HEAVY_RAIL
    extends StObject
       with VehicleType
  
  /**
    * High speed train.
    */
  @js.native
  sealed trait HIGH_SPEED_TRAIN
    extends StObject
       with VehicleType
  
  /**
    * Intercity bus.
    */
  @js.native
  sealed trait INTERCITY_BUS
    extends StObject
       with VehicleType
  
  /**
    * Light rail.
    */
  @js.native
  sealed trait METRO_RAIL
    extends StObject
       with VehicleType
  
  /**
    * Monorail.
    */
  @js.native
  sealed trait MONORAIL
    extends StObject
       with VehicleType
  
  /**
    * Other vehicles.
    */
  @js.native
  sealed trait OTHER
    extends StObject
       with VehicleType
  
  /**
    * Rail.
    */
  @js.native
  sealed trait RAIL
    extends StObject
       with VehicleType
  
  /**
    * Share taxi is a sort of bus transport with ability to drop off and pick
    * up passengers anywhere on its route. Generally share taxi uses minibus
    * vehicles.
    */
  @js.native
  sealed trait SHARE_TAXI
    extends StObject
       with VehicleType
  
  /**
    * Underground light rail.
    */
  @js.native
  sealed trait SUBWAY
    extends StObject
       with VehicleType
  
  /**
    * Above ground light rail.
    */
  @js.native
  sealed trait TRAM
    extends StObject
       with VehicleType
  
  /**
    * Trolleybus.
    */
  @js.native
  sealed trait TROLLEYBUS
    extends StObject
       with VehicleType
}
