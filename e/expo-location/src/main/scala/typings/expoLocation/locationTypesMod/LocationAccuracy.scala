package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationAccuracy extends StObject
@JSImport("expo-location/build/Location.types", "LocationAccuracy")
@js.native
object LocationAccuracy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationAccuracy with Double] = js.native
  
  @js.native
  sealed trait Balanced extends LocationAccuracy
  /* 3 */ val Balanced: typings.expoLocation.locationTypesMod.LocationAccuracy.Balanced with Double = js.native
  
  @js.native
  sealed trait BestForNavigation extends LocationAccuracy
  /* 6 */ val BestForNavigation: typings.expoLocation.locationTypesMod.LocationAccuracy.BestForNavigation with Double = js.native
  
  @js.native
  sealed trait High extends LocationAccuracy
  /* 4 */ val High: typings.expoLocation.locationTypesMod.LocationAccuracy.High with Double = js.native
  
  @js.native
  sealed trait Highest extends LocationAccuracy
  /* 5 */ val Highest: typings.expoLocation.locationTypesMod.LocationAccuracy.Highest with Double = js.native
  
  @js.native
  sealed trait Low extends LocationAccuracy
  /* 2 */ val Low: typings.expoLocation.locationTypesMod.LocationAccuracy.Low with Double = js.native
  
  @js.native
  sealed trait Lowest extends LocationAccuracy
  /* 1 */ val Lowest: typings.expoLocation.locationTypesMod.LocationAccuracy.Lowest with Double = js.native
}
