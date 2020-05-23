package typings.geolib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.geolib.anon.Alt
  - typings.geolib.anon.AltitudeGeolibAltitudeInputValue
  - typings.geolib.anon.Elevation
  - typings.geolib.anon.Elev
*/
trait GeolibInputAltitude extends js.Object

object GeolibInputAltitude {
  @scala.inline
  def Alt(alt: js.UndefOr[GeolibAltitudeInputValue] = js.undefined): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alt)) __obj.updateDynamic("alt")(alt.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def AltitudeGeolibAltitudeInputValue(altitude: js.UndefOr[GeolibAltitudeInputValue] = js.undefined): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(altitude)) __obj.updateDynamic("altitude")(altitude.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def Elevation(elevation: js.UndefOr[GeolibAltitudeInputValue] = js.undefined): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elevation)) __obj.updateDynamic("elevation")(elevation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def Elev(elev: js.UndefOr[GeolibAltitudeInputValue] = js.undefined): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(elev)) __obj.updateDynamic("elev")(elev.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
}

