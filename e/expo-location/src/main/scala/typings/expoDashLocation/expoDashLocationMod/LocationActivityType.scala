package typings.expoDashLocation.expoDashLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocationActivityType extends js.Object

@JSImport("expo-location", "LocationActivityType")
@js.native
object LocationActivityType extends js.Object {
  @js.native
  sealed trait Airborne extends LocationActivityType
  
  @js.native
  sealed trait AutomotiveNavigation extends LocationActivityType
  
  @js.native
  sealed trait Fitness extends LocationActivityType
  
  @js.native
  sealed trait Other extends LocationActivityType
  
  @js.native
  sealed trait OtherNavigation extends LocationActivityType
  
}

