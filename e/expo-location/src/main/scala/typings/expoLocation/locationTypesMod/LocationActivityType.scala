package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationActivityType extends js.Object
@JSImport("expo-location/build/Location.types", "LocationActivityType")
@js.native
object LocationActivityType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationActivityType with Double] = js.native
  
  @js.native
  sealed trait Airborne extends LocationActivityType
  /* 5 */ @js.native
  object Airborne extends TopLevel[Airborne with Double]
  
  @js.native
  sealed trait AutomotiveNavigation extends LocationActivityType
  /* 2 */ @js.native
  object AutomotiveNavigation extends TopLevel[AutomotiveNavigation with Double]
  
  @js.native
  sealed trait Fitness extends LocationActivityType
  /* 3 */ @js.native
  object Fitness extends TopLevel[Fitness with Double]
  
  @js.native
  sealed trait Other extends LocationActivityType
  /* 1 */ @js.native
  object Other extends TopLevel[Other with Double]
  
  @js.native
  sealed trait OtherNavigation extends LocationActivityType
  /* 4 */ @js.native
  object OtherNavigation extends TopLevel[OtherNavigation with Double]
}
