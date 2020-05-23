package typings.geolib.anon

import typings.geolib.typesMod.GeolibAltitudeInputValue
import typings.geolib.typesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Elev extends GeolibInputAltitude {
  var elev: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object Elev {
  @scala.inline
  def apply(elev: js.UndefOr[GeolibAltitudeInputValue] = js.undefined): Elev = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elev)) __obj.updateDynamic("elev")(elev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elev]
  }
}

