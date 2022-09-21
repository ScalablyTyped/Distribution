package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.TravelMode & String] = js.native
  
  /* "BICYCLING" */ val BICYCLING: typings.googleMaps.google.maps.TravelMode.BICYCLING & String = js.native
  
  /* "DRIVING" */ val DRIVING: typings.googleMaps.google.maps.TravelMode.DRIVING & String = js.native
  
  /* "TRANSIT" */ val TRANSIT: typings.googleMaps.google.maps.TravelMode.TRANSIT & String = js.native
  
  /* "WALKING" */ val WALKING: typings.googleMaps.google.maps.TravelMode.WALKING & String = js.native
}
