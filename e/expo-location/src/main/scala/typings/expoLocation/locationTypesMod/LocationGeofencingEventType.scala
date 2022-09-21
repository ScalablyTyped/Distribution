package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationGeofencingEventType extends StObject
@JSImport("expo-location/build/Location.types", "LocationGeofencingEventType")
@js.native
object LocationGeofencingEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationGeofencingEventType & Double] = js.native
  
  /**
    * Emitted when the device entered observed region.
    */
  @js.native
  sealed trait Enter
    extends StObject
       with LocationGeofencingEventType
  /* 1 */ val Enter: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Enter & Double = js.native
  
  /**
    * Occurs as soon as the device left observed region
    */
  @js.native
  sealed trait Exit
    extends StObject
       with LocationGeofencingEventType
  /* 2 */ val Exit: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Exit & Double = js.native
}
