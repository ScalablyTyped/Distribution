package typings.gapiDotClientDotYoutube.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoPoint extends js.Object {
  /** Altitude above the reference ellipsoid, in meters. */
  var altitude: js.UndefOr[Double] = js.undefined
  /** Latitude in degrees. */
  var latitude: js.UndefOr[Double] = js.undefined
  /** Longitude in degrees. */
  var longitude: js.UndefOr[Double] = js.undefined
}

object GeoPoint {
  @scala.inline
  def apply(altitude: Int | Double = null, latitude: Int | Double = null, longitude: Int | Double = null): GeoPoint = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPoint]
  }
}

