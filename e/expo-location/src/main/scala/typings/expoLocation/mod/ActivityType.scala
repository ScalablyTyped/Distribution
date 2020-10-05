package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("expo-location", "ActivityType")
@js.native
object ActivityType extends js.Object {
  /* 5 */ val Airborne: typings.expoLocation.mod.LocationActivityType.Airborne with Double = js.native
  /* 2 */ val AutomotiveNavigation: typings.expoLocation.mod.LocationActivityType.AutomotiveNavigation with Double = js.native
  /* 3 */ val Fitness: typings.expoLocation.mod.LocationActivityType.Fitness with Double = js.native
  /* 1 */ val Other: typings.expoLocation.mod.LocationActivityType.Other with Double = js.native
  /* 4 */ val OtherNavigation: typings.expoLocation.mod.LocationActivityType.OtherNavigation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationActivityType with Double] = js.native
}

