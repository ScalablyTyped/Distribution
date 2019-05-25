package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_0 extends js.Object {
  var altitude: geolibLib.esTypesMod.AltitudeKeys
  var latitude: js.UndefOr[
    geolibLib.geolibLibStrings.lat | geolibLib.geolibLibStrings.latitude | geolibLib.geolibLibNumbers.`1`
  ] = js.undefined
  var longitude: js.UndefOr[
    geolibLib.geolibLibNumbers.`0` | geolibLib.geolibLibStrings.lng | geolibLib.geolibLibStrings.lon | geolibLib.geolibLibStrings.longitude
  ] = js.undefined
}

object Anon_0 {
  @scala.inline
  def apply(
    altitude: geolibLib.esTypesMod.AltitudeKeys,
    latitude: geolibLib.geolibLibStrings.lat | geolibLib.geolibLibStrings.latitude | geolibLib.geolibLibNumbers.`1` = null,
    longitude: geolibLib.geolibLibNumbers.`0` | geolibLib.geolibLibStrings.lng | geolibLib.geolibLibStrings.lon | geolibLib.geolibLibStrings.longitude = null
  ): Anon_0 = {
    val __obj = js.Dynamic.literal(altitude = altitude)
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_0]
  }
}

