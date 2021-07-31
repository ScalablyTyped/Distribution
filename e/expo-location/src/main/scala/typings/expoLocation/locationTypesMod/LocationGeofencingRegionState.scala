package typings.expoLocation.locationTypesMod

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
  
  @js.native
  sealed trait Inside
    extends StObject
       with LocationGeofencingRegionState
  /* 1 */ val Inside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Inside & Double = js.native
  
  @js.native
  sealed trait Outside
    extends StObject
       with LocationGeofencingRegionState
  /* 2 */ val Outside: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Outside & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with LocationGeofencingRegionState
  /* 0 */ val Unknown: typings.expoLocation.locationTypesMod.LocationGeofencingRegionState.Unknown & Double = js.native
}
