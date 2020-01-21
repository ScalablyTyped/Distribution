package typings.geolib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.geolib.AnonAlt
  - typings.geolib.AnonAltitudeGeolibAltitudeInputValue
  - typings.geolib.AnonElevation
  - typings.geolib.AnonElev
*/
trait GeolibInputAltitude extends js.Object

object GeolibInputAltitude {
  @scala.inline
  def AnonAlt(alt: Int | Double = null): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def AnonAltitudeGeolibAltitudeInputValue(altitude: Int | Double = null): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def AnonElevation(elevation: Int | Double = null): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def AnonElev(elev: Int | Double = null): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (elev != null) __obj.updateDynamic("elev")(elev.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
}

