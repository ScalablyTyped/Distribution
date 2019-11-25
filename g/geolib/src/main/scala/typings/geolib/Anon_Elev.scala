package typings.geolib

import typings.geolib.esTypesMod.GeolibAltitudeInputValue
import typings.geolib.esTypesMod.GeolibInputAltitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elev extends GeolibInputAltitude {
  var elev: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
}

object Anon_Elev {
  @scala.inline
  def apply(elev: Int | Double = null): Anon_Elev = {
    val __obj = js.Dynamic.literal()
    if (elev != null) __obj.updateDynamic("elev")(elev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Elev]
  }
}

