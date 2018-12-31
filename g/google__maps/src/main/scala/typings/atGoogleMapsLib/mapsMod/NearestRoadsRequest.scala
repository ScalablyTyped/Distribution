package typings
package atGoogleMapsLib.mapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestRoadsRequest extends js.Object {
  /**
    * A list of latitude/longitude pairs. Latitude and longitude values should be separated by commas.
    * Coordinates should be separated by the pipe character: "|".
    * For example: `points=60.170880,24.942795|60.170879,24.942796|60.170877,24.942796`.
    */
  var points: js.Array[LatLng]
}

