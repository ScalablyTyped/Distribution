package typings
package atGoogleMapsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atGoogleMapsMod {
  type GoogleMapsClientEndpoint[Request, Response] = js.Function2[
    /* query */ Request, 
    /* callback */ js.UndefOr[ResponseCallback[Response]], 
    RequestHandle[Response]
  ]
  type LatLng = _LatLng | LatLngArray | LatLngString
  type LatLngArray = js.Tuple2[scala.Double, scala.Double]
  type LatLngString = java.lang.String
  type PlacePhotoResponse = java.lang.String
  type ResponseCallback[T] = js.Function2[
    /* err */ atGoogleMapsLib.atGoogleMapsLibStrings.timeout | ClientResponse[T], 
    /* response */ ClientResponse[T], 
    scala.Unit
  ]
  type ReverseGeocodingResponse = GeocodingResponse[ReverseGeocodingResponseStatus]
}
