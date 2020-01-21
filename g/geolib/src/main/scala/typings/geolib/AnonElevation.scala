package typings.geolib

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElevation extends GeolibInputAltitude {
  var elevation: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object AnonElevation {
  @scala.inline
  def apply(elevation: Int | Double = null): AnonElevation = {
    val __obj = js.Dynamic.literal()
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElevation]
  }
}

