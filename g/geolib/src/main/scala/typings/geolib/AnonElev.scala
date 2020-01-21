package typings.geolib

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElev extends GeolibInputAltitude {
  var elev: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object AnonElev {
  @scala.inline
  def apply(elev: Int | Double = null): AnonElev = {
    val __obj = js.Dynamic.literal()
    if (elev != null) __obj.updateDynamic("elev")(elev.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElev]
  }
}

