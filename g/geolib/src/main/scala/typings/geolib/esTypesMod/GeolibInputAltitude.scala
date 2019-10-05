package typings.geolib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeolibInputAltitude extends js.Object {
  var alt: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
  var altitude: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
  var elev: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
  var elevation: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object GeolibInputAltitude {
  @scala.inline
  def apply(
    alt: Int | Double = null,
    altitude: Int | Double = null,
    elev: Int | Double = null,
    elevation: Int | Double = null
  ): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    if (elev != null) __obj.updateDynamic("elev")(elev.asInstanceOf[js.Any])
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
}

