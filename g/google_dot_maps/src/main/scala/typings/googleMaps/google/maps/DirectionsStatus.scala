package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DirectionsStatus extends StObject
/**
  * The status returned by the <code>DirectionsService</code> on the completion
  * of a call to <code>route()</code>. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.DirectionsStatus.OK</code>.
  */
@JSGlobal("google.maps.DirectionsStatus")
@js.native
object DirectionsStatus extends StObject {
  
  /**
    * The <code>DirectionsRequest</code> provided was invalid.
    */
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with DirectionsStatus
  
  /**
    * Too many <code>DirectionsWaypoint</code>s were provided in the
    * <code>DirectionsRequest</code>. See the <a
    * href="https://developers.google.com/maps/documentation/javascript/directions#UsageLimits">
    * developer&#39;s guide</a> for the maximum number of waypoints allowed.
    */
  @js.native
  sealed trait MAX_WAYPOINTS_EXCEEDED
    extends StObject
       with DirectionsStatus
  
  /**
    * At least one of the origin, destination, or waypoints could not be
    * geocoded.
    */
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with DirectionsStatus
  
  /**
    * The response contains a valid <code>DirectionsResult</code>.
    */
  @js.native
  sealed trait OK
    extends StObject
       with DirectionsStatus
  
  /**
    * The webpage has gone over the requests limit in too short a period of
    * time.
    */
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with DirectionsStatus
  
  /**
    * The webpage is not allowed to use the directions service.
    */
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with DirectionsStatus
  
  /**
    * A directions request could not be processed due to a server error. The
    * request may succeed if you try again.
    */
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with DirectionsStatus
  
  /**
    * No route could be found between the origin and destination.
    */
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with DirectionsStatus
}
