package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StreetViewPreference extends StObject
@JSGlobal("google.maps.StreetViewPreference")
@js.native
object StreetViewPreference extends StObject {
  
  /**
    * Return the Street View panorama that is considered most likely to be what
    * the user wants to see. The best result is determined by algorithms based
    * on user research and parameters such as recognised points of interest,
    * image quality, and distance from the given location.
    */
  @js.native
  sealed trait BEST
    extends StObject
       with StreetViewPreference
  
  /**
    * Return the Street View panorama that is the shortest distance from the
    * provided location. This works well only within a limited radius. The
    * recommended radius is 1km or less.
    */
  @js.native
  sealed trait NEAREST
    extends StObject
       with StreetViewPreference
}
