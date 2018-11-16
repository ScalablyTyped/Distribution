package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding.GeocodeService")
@js.native
class GeocodeService ()
  extends esriDashLeafletLib.esriDashLeafletMod.Service {
  def this(options: GeocodeServiceOptions) = this()
  def geocode(): Geocode = js.native
  def reverse(): ReverseGeocode = js.native
  def suggest(): Suggest = js.native
}

