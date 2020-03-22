package typings.geolib

import typings.geolib.geolibNumbers.`0`
import typings.geolib.geolibNumbers.`1`
import typings.geolib.geolibStrings.lat
import typings.geolib.geolibStrings.latitude
import typings.geolib.geolibStrings.lng
import typings.geolib.geolibStrings.lon
import typings.geolib.geolibStrings.longitude
import typings.geolib.typesMod.AltitudeKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitudeLatitude extends js.Object {
  var altitude: AltitudeKeys
  var latitude: js.UndefOr[lat | typings.geolib.geolibStrings.latitude | `1`] = js.undefined
  var longitude: js.UndefOr[`0` | lng | lon | typings.geolib.geolibStrings.longitude] = js.undefined
}

object AnonAltitudeLatitude {
  @scala.inline
  def apply(
    altitude: AltitudeKeys,
    latitude: lat | latitude | `1` = null,
    longitude: `0` | lng | lon | longitude = null
  ): AnonAltitudeLatitude = {
    val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any])
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitudeLatitude]
  }
}

