package typings
package geolibLib.geolibNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PositionWithElevation extends PositionAsDecimal {
  var elevation: js.UndefOr[scala.Double] = js.undefined
}

object PositionWithElevation {
  @scala.inline
  def apply(latitude: scala.Double, longitude: scala.Double, elevation: scala.Int | scala.Double = null): PositionWithElevation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("latitude")(latitude)
    __obj.updateDynamic("longitude")(longitude)
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PositionWithElevation]
  }
}

