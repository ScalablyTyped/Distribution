package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeocoderLocationType extends StObject
@JSGlobal("google.maps.GeocoderLocationType")
@js.native
object GeocoderLocationType extends StObject {
  
  /**
    * The returned result is approximate.
    */
  @js.native
  sealed trait APPROXIMATE
    extends StObject
       with GeocoderLocationType
  
  /**
    * The returned result is the geometric center of a result such a line (e.g.
    * street) or polygon (region).
    */
  @js.native
  sealed trait GEOMETRIC_CENTER
    extends StObject
       with GeocoderLocationType
  
  /**
    * The returned result reflects an approximation (usually on a road)
    * interpolated between two precise points (such as intersections).
    * Interpolated results are generally returned when rooftop geocodes are
    * unavailable for a street address.
    */
  @js.native
  sealed trait RANGE_INTERPOLATED
    extends StObject
       with GeocoderLocationType
  
  /**
    * The returned result reflects a precise geocode.
    */
  @js.native
  sealed trait ROOFTOP
    extends StObject
       with GeocoderLocationType
}
