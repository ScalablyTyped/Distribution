package typings.geolib.anon

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elevation extends GeolibInputAltitude {
  var elevation: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object Elevation {
  @scala.inline
  def apply(elevation: js.UndefOr[GeolibAltitudeInputValue] = js.undefined): Elevation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elevation)) __obj.updateDynamic("elevation")(elevation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elevation]
  }
}

