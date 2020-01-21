package typings.expoLocation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocationAccuracy extends js.Object

@JSImport("expo-location", "LocationAccuracy")
@js.native
object LocationAccuracy extends js.Object {
  @js.native
  sealed trait Balanced extends LocationAccuracy
  
  @js.native
  sealed trait BestForNavigation extends LocationAccuracy
  
  @js.native
  sealed trait High extends LocationAccuracy
  
  @js.native
  sealed trait Highest extends LocationAccuracy
  
  @js.native
  sealed trait Low extends LocationAccuracy
  
  @js.native
  sealed trait Lowest extends LocationAccuracy
  
}

