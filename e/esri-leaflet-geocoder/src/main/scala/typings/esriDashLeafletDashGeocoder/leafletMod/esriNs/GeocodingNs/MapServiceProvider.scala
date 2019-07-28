package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

import typings.esriDashLeaflet.esriDashLeafletMod.MapService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding.MapServiceProvider")
@js.native
class MapServiceProvider ()
  extends MapService
     with GeosearchProvider {
  def this(options: MapServiceProviderOptions) = this()
}

