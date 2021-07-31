package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationAccuracy extends StObject
@JSImport("expo-location/build/Location.types", "LocationAccuracy")
@js.native
object LocationAccuracy extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationAccuracy & Double] = js.native
  
  @js.native
  sealed trait Balanced
    extends StObject
       with LocationAccuracy
  /* 3 */ val Balanced: typings.expoLocation.locationTypesMod.LocationAccuracy.Balanced & Double = js.native
  
  @js.native
  sealed trait BestForNavigation
    extends StObject
       with LocationAccuracy
  /* 6 */ val BestForNavigation: typings.expoLocation.locationTypesMod.LocationAccuracy.BestForNavigation & Double = js.native
  
  @js.native
  sealed trait High
    extends StObject
       with LocationAccuracy
  /* 4 */ val High: typings.expoLocation.locationTypesMod.LocationAccuracy.High & Double = js.native
  
  @js.native
  sealed trait Highest
    extends StObject
       with LocationAccuracy
  /* 5 */ val Highest: typings.expoLocation.locationTypesMod.LocationAccuracy.Highest & Double = js.native
  
  @js.native
  sealed trait Low
    extends StObject
       with LocationAccuracy
  /* 2 */ val Low: typings.expoLocation.locationTypesMod.LocationAccuracy.Low & Double = js.native
  
  @js.native
  sealed trait Lowest
    extends StObject
       with LocationAccuracy
  /* 1 */ val Lowest: typings.expoLocation.locationTypesMod.LocationAccuracy.Lowest & Double = js.native
}
