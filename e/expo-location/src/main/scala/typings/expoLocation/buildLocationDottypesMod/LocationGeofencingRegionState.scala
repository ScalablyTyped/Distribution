package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationGeofencingRegionState extends StObject
@JSImport("expo-location/build/Location.types", "LocationGeofencingRegionState")
@js.native
object LocationGeofencingRegionState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationGeofencingRegionState & Double] = js.native
  
  /**
    * Indicates that the device is inside the region.
    */
  @js.native
  sealed trait Inside
    extends StObject
       with LocationGeofencingRegionState
  /* 1 */ val Inside: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Inside & Double = js.native
  
  /**
    * Inverse of inside state.
    */
  @js.native
  sealed trait Outside
    extends StObject
       with LocationGeofencingRegionState
  /* 2 */ val Outside: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Outside & Double = js.native
  
  /**
    * Indicates that the device position related to the region is unknown.
    */
  @js.native
  sealed trait Unknown
    extends StObject
       with LocationGeofencingRegionState
  /* 0 */ val Unknown: typings.expoLocation.buildLocationDottypesMod.LocationGeofencingRegionState.Unknown & Double = js.native
}
