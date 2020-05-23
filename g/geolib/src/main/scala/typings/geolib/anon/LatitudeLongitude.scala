package typings.geolib.anon

import typings.geolib.geolibNumbers.`0`
import typings.geolib.geolibNumbers.`1`
import typings.geolib.geolibStrings.lat
import typings.geolib.geolibStrings.latitude
import typings.geolib.geolibStrings.lng
import typings.geolib.geolibStrings.lon
import typings.geolib.geolibStrings.longitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LatitudeLongitude extends js.Object {
  var latitude: js.UndefOr[lat | typings.geolib.geolibStrings.latitude | `1`] = js.undefined
  var longitude: js.UndefOr[`0` | lng | lon | typings.geolib.geolibStrings.longitude] = js.undefined
}

object LatitudeLongitude {
  @scala.inline
  def apply(latitude: lat | latitude | `1` = null, longitude: `0` | lng | lon | longitude = null): LatitudeLongitude = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatitudeLongitude]
  }
}

