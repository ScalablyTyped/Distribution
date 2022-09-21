package typings.googleMaps.google.maps

import typings.googleMaps.google.maps.places.PlacesServiceStatus
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Base class for managing network errors in Maps.
  */
trait MapsNetworkError
  extends StObject
     with Error {
  
  /**
    * Identifies the type of error produced by the API.
    */
  var code: DirectionsStatus | DistanceMatrixStatus | ElevationStatus | GeocoderStatus | MaxZoomStatus | PlacesServiceStatus | StreetViewStatus
  
  /**
    * Represents the network service that responded with the error.
    */
  var endpoint: MapsNetworkErrorEndpoint
}
object MapsNetworkError {
  
  inline def apply(
    code: DirectionsStatus | DistanceMatrixStatus | ElevationStatus | GeocoderStatus | MaxZoomStatus | PlacesServiceStatus | StreetViewStatus,
    endpoint: MapsNetworkErrorEndpoint,
    message: String,
    name: String
  ): MapsNetworkError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapsNetworkError]
  }
  
  extension [Self <: MapsNetworkError](x: Self) {
    
    inline def setCode(
      value: DirectionsStatus | DistanceMatrixStatus | ElevationStatus | GeocoderStatus | MaxZoomStatus | PlacesServiceStatus | StreetViewStatus
    ): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: MapsNetworkErrorEndpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
  }
}
