package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationActivityType extends StObject
@JSImport("expo-location/build/Location.types", "LocationActivityType")
@js.native
object LocationActivityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationActivityType with Double] = js.native
  
  @js.native
  sealed trait Airborne extends LocationActivityType
  /* 5 */ val Airborne: typings.expoLocation.locationTypesMod.LocationActivityType.Airborne with Double = js.native
  
  @js.native
  sealed trait AutomotiveNavigation extends LocationActivityType
  /* 2 */ val AutomotiveNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.AutomotiveNavigation with Double = js.native
  
  @js.native
  sealed trait Fitness extends LocationActivityType
  /* 3 */ val Fitness: typings.expoLocation.locationTypesMod.LocationActivityType.Fitness with Double = js.native
  
  @js.native
  sealed trait Other extends LocationActivityType
  /* 1 */ val Other: typings.expoLocation.locationTypesMod.LocationActivityType.Other with Double = js.native
  
  @js.native
  sealed trait OtherNavigation extends LocationActivityType
  /* 4 */ val OtherNavigation: typings.expoLocation.locationTypesMod.LocationActivityType.OtherNavigation with Double = js.native
}
