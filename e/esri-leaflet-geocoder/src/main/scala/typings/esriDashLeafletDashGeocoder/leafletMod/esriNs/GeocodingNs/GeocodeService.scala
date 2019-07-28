package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

import typings.esriDashLeaflet.esriDashLeafletMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding.GeocodeService")
@js.native
class GeocodeService () extends Service {
  def this(options: GeocodeServiceOptions) = this()
  def geocode(): Geocode = js.native
  def reverse(): ReverseGeocode = js.native
  def suggest(): Suggest = js.native
}

