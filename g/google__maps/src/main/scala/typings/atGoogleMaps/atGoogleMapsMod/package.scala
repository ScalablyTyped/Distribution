package typings.atGoogleMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGoogleMapsMod {
  import typings.atGoogleMaps.atGoogleMapsStrings.timeout

  type GoogleMapsClientEndpoint[Request, Response] = js.Function2[
    /* query */ Request, 
    /* callback */ js.UndefOr[ResponseCallback[Response]], 
    RequestHandle[Response]
  ]
  /* Rewritten from type alias, can be one of: 
    - typings.atGoogleMaps.atGoogleMapsMod.LatLngArray
    - typings.atGoogleMaps.atGoogleMapsMod.LatLngString
    - typings.atGoogleMaps.atGoogleMapsMod.LatLngLiteral
    - typings.atGoogleMaps.atGoogleMapsMod.LatLngLiteralVerbose
  */
  type LatLng = _LatLng | LatLngArray | LatLngString
  type LatLngArray = js.Tuple2[Double, Double]
  type LatLngString = String
  type PlacePhotoResponse = String
  type ResponseCallback[T] = js.Function2[/* err */ timeout | ClientResponse[T], /* response */ ClientResponse[T], Unit]
  type ReverseGeocodingResponse = GeocodingResponse[ReverseGeocodingResponseStatus]
}
