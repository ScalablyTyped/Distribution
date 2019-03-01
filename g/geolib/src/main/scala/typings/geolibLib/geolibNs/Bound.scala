package typings
package geolibLib.geolibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bound extends js.Object {
  var maxElev: js.UndefOr[scala.Double] = js.undefined
  var maxLat: scala.Double
  var maxLng: scala.Double
  var minElev: js.UndefOr[scala.Double] = js.undefined
  var minLat: scala.Double
  var minLng: scala.Double
}

object Bound {
  @scala.inline
  def apply(
    maxLat: scala.Double,
    maxLng: scala.Double,
    minLat: scala.Double,
    minLng: scala.Double,
    maxElev: scala.Int | scala.Double = null,
    minElev: scala.Int | scala.Double = null
  ): Bound = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxLat")(maxLat)
    __obj.updateDynamic("maxLng")(maxLng)
    __obj.updateDynamic("minLat")(minLat)
    __obj.updateDynamic("minLng")(minLng)
    if (maxElev != null) __obj.updateDynamic("maxElev")(maxElev.asInstanceOf[js.Any])
    if (minElev != null) __obj.updateDynamic("minElev")(minElev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bound]
  }
}

