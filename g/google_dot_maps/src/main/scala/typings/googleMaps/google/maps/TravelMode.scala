package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TravelMode extends StObject
/**
  * The valid travel modes that can be specified in a
  * <code>DirectionsRequest</code> as well as the travel modes returned in a
  * <code>DirectionsStep</code>. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'BICYCLING'</code> or
  * <code>google.maps.TravelMode.BICYCLING</code>.
  */
@JSGlobal("google.maps.TravelMode")
@js.native
object TravelMode extends StObject {
  
  /**
    * Specifies a bicycling directions request.
    */
  @js.native
  sealed trait BICYCLING
    extends StObject
       with TravelMode
  
  /**
    * Specifies a driving directions request.
    */
  @js.native
  sealed trait DRIVING
    extends StObject
       with TravelMode
  
  /**
    * Specifies a transit directions request.
    */
  @js.native
  sealed trait TRANSIT
    extends StObject
       with TravelMode
  
  /**
    * Specifies a walking directions request.
    */
  @js.native
  sealed trait WALKING
    extends StObject
       with TravelMode
}
