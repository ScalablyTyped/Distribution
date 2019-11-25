package typings.atGoogleMaps.atGoogleMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolocationResponse extends js.Object {
  /** The accuracy of the estimated location, in meters. This represents the radius of a circle around the given location. */
  var accuracy: Double
  /** The user's estimated latitude and longitude, in degrees. Contains one `lat` and one `lng` subfield. */
  var location: LatLngLiteral
}

object GeolocationResponse {
  @scala.inline
  def apply(accuracy: Double, location: LatLngLiteral): GeolocationResponse = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GeolocationResponse]
  }
}

