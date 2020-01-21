package typings.geolib

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltitudeGeolibAltitudeInputValue extends GeolibInputAltitude {
  var altitude: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object AnonAltitudeGeolibAltitudeInputValue {
  @scala.inline
  def apply(altitude: Int | Double = null): AnonAltitudeGeolibAltitudeInputValue = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltitudeGeolibAltitudeInputValue]
  }
}

