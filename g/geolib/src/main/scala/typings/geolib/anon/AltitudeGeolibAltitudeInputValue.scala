package typings.geolib.anon

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AltitudeGeolibAltitudeInputValue extends GeolibInputAltitude {
  var altitude: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object AltitudeGeolibAltitudeInputValue {
  @scala.inline
  def apply(altitude: js.UndefOr[GeolibAltitudeInputValue] = js.undefined): AltitudeGeolibAltitudeInputValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AltitudeGeolibAltitudeInputValue]
  }
}

