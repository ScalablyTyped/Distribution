package typings
package geolibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_01 extends js.Object {
  var latitude: js.UndefOr[
    geolibLib.geolibLibStrings.lat | geolibLib.geolibLibStrings.latitude | geolibLib.geolibLibNumbers.`1`
  ] = js.undefined
  var longitude: js.UndefOr[
    geolibLib.geolibLibNumbers.`0` | geolibLib.geolibLibStrings.lng | geolibLib.geolibLibStrings.lon | geolibLib.geolibLibStrings.longitude
  ] = js.undefined
}

object Anon_01 {
  @scala.inline
  def apply(
    latitude: geolibLib.geolibLibStrings.lat | geolibLib.geolibLibStrings.latitude | geolibLib.geolibLibNumbers.`1` = null,
    longitude: geolibLib.geolibLibNumbers.`0` | geolibLib.geolibLibStrings.lng | geolibLib.geolibLibStrings.lon | geolibLib.geolibLibStrings.longitude = null
  ): Anon_01 = {
    val __obj = js.Dynamic.literal()
    if (latitude != null) __obj.updateDynamic("latitude")(latitude.asInstanceOf[js.Any])
    if (longitude != null) __obj.updateDynamic("longitude")(longitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_01]
  }
}

