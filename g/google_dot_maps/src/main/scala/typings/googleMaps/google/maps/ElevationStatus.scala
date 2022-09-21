package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ElevationStatus extends StObject
/**
  * The status returned by the <code>ElevationService</code> upon completion of
  * an elevation request. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.ElevationStatus.OK</code>.
  */
@JSGlobal("google.maps.ElevationStatus")
@js.native
object ElevationStatus extends StObject {
  
  /**
    * The request was invalid.
    */
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with ElevationStatus
  
  /**
    * The request did not encounter any errors.
    */
  @js.native
  sealed trait OK
    extends StObject
       with ElevationStatus
  
  /**
    * The webpage has gone over the requests limit in too short a period of
    * time.
    */
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with ElevationStatus
  
  /**
    * The webpage is not allowed to use the elevation service.
    */
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with ElevationStatus
  
  /**
    * The elevation request could not be successfully processed, yet the exact
    * reason for the failure is not known.
    */
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with ElevationStatus
}
