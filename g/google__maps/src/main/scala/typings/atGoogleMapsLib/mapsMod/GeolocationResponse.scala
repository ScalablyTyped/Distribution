package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeolocationResponse extends js.Object {
  /** The accuracy of the estimated location, in meters. This represents the radius of a circle around the given location. */
  var accuracy: scala.Double
  /** The user's estimated latitude and longitude, in degrees. Contains one `lat` and one `lng` subfield. */
  var location: LatLngLiteral
}

