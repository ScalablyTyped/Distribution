package typings.geolib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.geolib.Anon_Alt
  - typings.geolib.Anon_AltitudeGeolibAltitudeInputValue
  - typings.geolib.Anon_Elevation
  - typings.geolib.Anon_Elev
*/
trait GeolibInputAltitude extends js.Object

object GeolibInputAltitude {
  @scala.inline
  def Anon_Alt(alt: Int | Double = null): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def Anon_AltitudeGeolibAltitudeInputValue(altitude: Int | Double = null): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (altitude != null) __obj.updateDynamic("altitude")(altitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def Anon_Elevation(elevation: Int | Double = null): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (elevation != null) __obj.updateDynamic("elevation")(elevation.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
  @scala.inline
  def Anon_Elev(elev: Int | Double = null): GeolibInputAltitude = {
    val __obj = js.Dynamic.literal()
    if (elev != null) __obj.updateDynamic("elev")(elev.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolibInputAltitude]
  }
}

