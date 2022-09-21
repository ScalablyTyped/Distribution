package typings.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GeocoderStatus extends StObject
/**
  * The status returned by the <code>Geocoder</code> on the completion of a
  * call to <code>geocode()</code>. Specify these by value, or by using the
  * constant&#39;s name. For example, <code>'OK'</code> or
  * <code>google.maps.GeocoderStatus.OK</code>.
  */
@JSGlobal("google.maps.GeocoderStatus")
@js.native
object GeocoderStatus extends StObject {
  
  /**
    * There was a problem contacting the Google servers.
    */
  @js.native
  sealed trait ERROR
    extends StObject
       with GeocoderStatus
  
  /**
    * This <code>GeocoderRequest</code> was invalid.
    */
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with GeocoderStatus
  
  /**
    * The response contains a valid <code>GeocoderResponse</code>.
    */
  @js.native
  sealed trait OK
    extends StObject
       with GeocoderStatus
  
  /**
    * The webpage has gone over the requests limit in too short a period of
    * time.
    */
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with GeocoderStatus
  
  /**
    * The webpage is not allowed to use the geocoder.
    */
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with GeocoderStatus
  
  /**
    * A geocoding request could not be processed due to a server error. The
    * request may succeed if you try again.
    */
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with GeocoderStatus
  
  /**
    * No result was found for this <code>GeocoderRequest</code>.
    */
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with GeocoderStatus
}
