package typings
package geolibLib.esTypesMod

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
    alt: js.UndefOr[GeolibAltitudeInputValue] = js.undefined,
    altitude: js.UndefOr[GeolibAltitudeInputValue] = js.undefined,
    elev: js.UndefOr[GeolibAltitudeInputValue] = js.undefined,
    elevation: js.UndefOr[GeolibAltitudeInputValue] = js.undefined
  ): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alt)) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude)
    if (!js.isUndefined(elev)) __obj.updateDynamic("elev")(elev)
    if (!js.isUndefined(elevation)) __obj.updateDynamic("elevation")(elevation)
    __obj.asInstanceOf[GeolibInputAltitude]
  }
}

