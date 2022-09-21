package typings.googleMaps.google.maps.places

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PlacesServiceStatus extends StObject
/**
  * The status returned by the <code>PlacesService</code> on the completion of
  * its searches. Specify these by value, or by using the constant&#39;s name.
  * For example, <code>'OK'</code> or
  * <code>google.maps.places.PlacesServiceStatus.OK</code>.
  */
@JSGlobal("google.maps.places.PlacesServiceStatus")
@js.native
object PlacesServiceStatus extends StObject {
  
  /**
    * This request was invalid.
    */
  @js.native
  sealed trait INVALID_REQUEST
    extends StObject
       with PlacesServiceStatus
  
  /**
    * The place referenced was not found.
    */
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with PlacesServiceStatus
  
  /**
    * The response contains a valid result.
    */
  @js.native
  sealed trait OK
    extends StObject
       with PlacesServiceStatus
  
  /**
    * The application has gone over its request quota.
    */
  @js.native
  sealed trait OVER_QUERY_LIMIT
    extends StObject
       with PlacesServiceStatus
  
  /**
    * The application is not allowed to use the <code>PlacesService</code>.
    */
  @js.native
  sealed trait REQUEST_DENIED
    extends StObject
       with PlacesServiceStatus
  
  /**
    * The <code>PlacesService</code> request could not be processed due to a
    * server error. The request may succeed if you try again.
    */
  @js.native
  sealed trait UNKNOWN_ERROR
    extends StObject
       with PlacesServiceStatus
  
  /**
    * No result was found for this request.
    */
  @js.native
  sealed trait ZERO_RESULTS
    extends StObject
       with PlacesServiceStatus
}
