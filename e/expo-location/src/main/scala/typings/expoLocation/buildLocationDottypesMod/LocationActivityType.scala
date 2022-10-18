package typings.expoLocation.buildLocationDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocationActivityType extends StObject
@JSImport("expo-location/build/Location.types", "LocationActivityType")
@js.native
object LocationActivityType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationActivityType & Double] = js.native
  
  /**
    * Intended for airborne activities. Fall backs to `ActivityType.Other` if
    * unsupported.
    * @platform ios 12+
    */
  @js.native
  sealed trait Airborne
    extends StObject
       with LocationActivityType
  /* 5 */ val Airborne: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Airborne & Double = js.native
  
  /**
    * Location updates are being used specifically during vehicular navigation to track location
    * changes to the automobile.
    */
  @js.native
  sealed trait AutomotiveNavigation
    extends StObject
       with LocationActivityType
  /* 2 */ val AutomotiveNavigation: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.AutomotiveNavigation & Double = js.native
  
  /**
    * Use this activity type if you track fitness activities such as walking, running, cycling,
    * and so on.
    */
  @js.native
  sealed trait Fitness
    extends StObject
       with LocationActivityType
  /* 3 */ val Fitness: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Fitness & Double = js.native
  
  /**
    * Default activity type. Use it if there is no other type that matches the activity you track.
    */
  @js.native
  sealed trait Other
    extends StObject
       with LocationActivityType
  /* 1 */ val Other: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.Other & Double = js.native
  
  /**
    * Activity type for movements for other types of vehicular navigation that are not automobile
    * related.
    */
  @js.native
  sealed trait OtherNavigation
    extends StObject
       with LocationActivityType
  /* 4 */ val OtherNavigation: typings.expoLocation.buildLocationDottypesMod.LocationActivityType.OtherNavigation & Double = js.native
}
