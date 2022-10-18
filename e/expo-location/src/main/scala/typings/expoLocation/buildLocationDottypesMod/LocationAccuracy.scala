package typings.expoLocation.buildLocationDottypesMod

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
  
  /**
    * Accurate to within one hundred meters.
    */
  @js.native
  sealed trait Balanced
    extends StObject
       with LocationAccuracy
  /* 3 */ val Balanced: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Balanced & Double = js.native
  
  /**
    * The highest possible accuracy that uses additional sensor data to facilitate navigation apps.
    */
  @js.native
  sealed trait BestForNavigation
    extends StObject
       with LocationAccuracy
  /* 6 */ val BestForNavigation: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.BestForNavigation & Double = js.native
  
  /**
    * Accurate to within ten meters of the desired target.
    */
  @js.native
  sealed trait High
    extends StObject
       with LocationAccuracy
  /* 4 */ val High: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.High & Double = js.native
  
  /**
    * The best level of accuracy available.
    */
  @js.native
  sealed trait Highest
    extends StObject
       with LocationAccuracy
  /* 5 */ val Highest: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Highest & Double = js.native
  
  /**
    * Accurate to the nearest kilometer.
    */
  @js.native
  sealed trait Low
    extends StObject
       with LocationAccuracy
  /* 2 */ val Low: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Low & Double = js.native
  
  /**
    * Accurate to the nearest three kilometers.
    */
  @js.native
  sealed trait Lowest
    extends StObject
       with LocationAccuracy
  /* 1 */ val Lowest: typings.expoLocation.buildLocationDottypesMod.LocationAccuracy.Lowest & Double = js.native
}
