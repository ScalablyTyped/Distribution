package typings.googleMaps.global.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The assumptions to use when predicting duration in traffic. Specified as
  * part of a <code><a href="#DirectionsRequest">DirectionsRequest</a></code>
  * or <code><a href="#DistanceMatrixRequest">DistanceMatrixRequest</a></code>.
  * Specify these by value, or by using the constant&#39;s name. For example,
  * <code>'bestguess'</code> or
  * <code>google.maps.TrafficModel.BEST_GUESS</code>.
  */
@JSGlobal("google.maps.TrafficModel")
@js.native
object TrafficModel extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[typings.googleMaps.google.maps.TrafficModel & String] = js.native
  
  /* "bestguess" */ val BEST_GUESS: typings.googleMaps.google.maps.TrafficModel.BEST_GUESS & String = js.native
  
  /* "optimistic" */ val OPTIMISTIC: typings.googleMaps.google.maps.TrafficModel.OPTIMISTIC & String = js.native
  
  /* "pessimistic" */ val PESSIMISTIC: typings.googleMaps.google.maps.TrafficModel.PESSIMISTIC & String = js.native
}
