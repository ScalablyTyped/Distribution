package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationGeofencingEventType extends StObject
@JSImport("expo-location/build/Location.types", "LocationGeofencingEventType")
@js.native
object LocationGeofencingEventType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationGeofencingEventType with Double] = js.native
  
  @js.native
  sealed trait Enter extends LocationGeofencingEventType
  /* 1 */ val Enter: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Enter with Double = js.native
  
  @js.native
  sealed trait Exit extends LocationGeofencingEventType
  /* 2 */ val Exit: typings.expoLocation.locationTypesMod.LocationGeofencingEventType.Exit with Double = js.native
}
