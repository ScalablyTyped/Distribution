package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationGeofencingEventType extends js.Object
@JSImport("expo-location/build/Location.types", "LocationGeofencingEventType")
@js.native
object LocationGeofencingEventType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationGeofencingEventType with Double] = js.native
  
  @js.native
  sealed trait Enter extends LocationGeofencingEventType
  /* 1 */ @js.native
  object Enter extends TopLevel[Enter with Double]
  
  @js.native
  sealed trait Exit extends LocationGeofencingEventType
  /* 2 */ @js.native
  object Exit extends TopLevel[Exit with Double]
}
