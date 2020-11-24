package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationAccuracy extends js.Object
@JSImport("expo-location/build/Location.types", "LocationAccuracy")
@js.native
object LocationAccuracy extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationAccuracy with Double] = js.native
  
  @js.native
  sealed trait Balanced extends LocationAccuracy
  /* 3 */ @js.native
  object Balanced extends TopLevel[Balanced with Double]
  
  @js.native
  sealed trait BestForNavigation extends LocationAccuracy
  /* 6 */ @js.native
  object BestForNavigation extends TopLevel[BestForNavigation with Double]
  
  @js.native
  sealed trait High extends LocationAccuracy
  /* 4 */ @js.native
  object High extends TopLevel[High with Double]
  
  @js.native
  sealed trait Highest extends LocationAccuracy
  /* 5 */ @js.native
  object Highest extends TopLevel[Highest with Double]
  
  @js.native
  sealed trait Low extends LocationAccuracy
  /* 2 */ @js.native
  object Low extends TopLevel[Low with Double]
  
  @js.native
  sealed trait Lowest extends LocationAccuracy
  /* 1 */ @js.native
  object Lowest extends TopLevel[Lowest with Double]
}
