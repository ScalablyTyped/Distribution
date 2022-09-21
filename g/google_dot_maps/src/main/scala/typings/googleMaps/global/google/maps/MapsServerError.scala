package typings.googleMaps.global.google.maps

import typings.googleMaps.google.maps.places.PlacesServiceStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a server-side error from a web service (i.e. the equivalent of a
  * 5xx code in HTTP).
  */
@JSGlobal("google.maps.MapsServerError")
@js.native
/**
  * Represents a server-side error from a web service (i.e. the equivalent of
  * a 5xx code in HTTP).
  */
open class MapsServerError ()
  extends StObject
     with typings.googleMaps.google.maps.MapsNetworkError {
  
  /**
    * Identifies the type of error produced by the API.
    */
  /* CompleteClass */
  var code: typings.googleMaps.google.maps.DirectionsStatus | typings.googleMaps.google.maps.DistanceMatrixStatus | typings.googleMaps.google.maps.ElevationStatus | typings.googleMaps.google.maps.GeocoderStatus | typings.googleMaps.google.maps.MaxZoomStatus | PlacesServiceStatus | typings.googleMaps.google.maps.StreetViewStatus = js.native
  
  /**
    * Represents the network service that responded with the error.
    */
  /* CompleteClass */
  var endpoint: typings.googleMaps.google.maps.MapsNetworkErrorEndpoint = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
}
