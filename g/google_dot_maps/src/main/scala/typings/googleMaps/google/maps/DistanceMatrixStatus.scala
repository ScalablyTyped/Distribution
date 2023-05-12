package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DistanceMatrixStatus extends StObject
@JSGlobal("google.maps.DistanceMatrixStatus")
@js.native
object DistanceMatrixStatus extends StObject {
  
  /**
    * The provided request was invalid.
    */
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with DistanceMatrixStatus
  
  /**
    * The request contains more than 25 origins, or more than 25 destinations.
    */
  @js.native
  sealed trait MAX_DIMENSIONS_EXCEEDED
    extends StObject
       with DistanceMatrixStatus
  
  /**
    * The product of origins and destinations exceeds the per-query limit.
    */
  @js.native
  sealed trait MAX_ELEMENTS_EXCEEDED
    extends StObject
       with DistanceMatrixStatus
  
  /**
    * The response contains a valid result.
    */
  @js.native
  sealed trait OK
    extends StObject
       with DistanceMatrixStatus
  
  /**
    * Too many elements have been requested within the allowed time period. The
    * request should succeed if you try again after some time.
    */
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with DistanceMatrixStatus
  
  /**
    * The service denied use of the Distance Matrix service by your web page.
    */
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with DistanceMatrixStatus
  
  /**
    * A Distance Matrix request could not be processed due to a server error.
    * The request may succeed if you try again.
    */
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with DistanceMatrixStatus
}
