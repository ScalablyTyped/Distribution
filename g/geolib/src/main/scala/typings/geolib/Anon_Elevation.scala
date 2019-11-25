package typings.geolib

import typings.geolib.esTypesMod.GeolibAltitudeInputValue
import typings.geolib.esTypesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elevation extends GeolibInputAltitude {
  var elevation: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object Anon_Elevation {
  @scala.inline
  def apply(elevation: Int | Double = null): Anon_Elevation = {
    val __obj = js.Dynamic.literal()
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Elevation]
  }
}

