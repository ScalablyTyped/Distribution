package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TrafficModel extends StObject
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
  
  /**
    * Use historical traffic data to best estimate the time spent in traffic.
    */
  @js.native
  sealed trait BEST_GUESS
    extends StObject
       with TrafficModel
  
  /**
    * Use historical traffic data to make an optimistic estimate of what the
    * duration in traffic will be.
    */
  @js.native
  sealed trait OPTIMISTIC
    extends StObject
       with TrafficModel
  
  /**
    * Use historical traffic data to make a pessimistic estimate of what the
    * duration in traffic will be.
    */
  @js.native
  sealed trait PESSIMISTIC
    extends StObject
       with TrafficModel
}
