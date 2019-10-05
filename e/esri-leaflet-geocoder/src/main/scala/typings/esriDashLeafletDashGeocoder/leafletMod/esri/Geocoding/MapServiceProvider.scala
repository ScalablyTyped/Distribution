package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typings.esriDashLeaflet.esriDashLeafletMod.MapService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "esri.Geocoding.MapServiceProvider")
@js.native
class MapServiceProvider ()
  extends MapService
     with GeosearchProvider {
  def this(options: MapServiceProviderOptions) = this()
}

@JSImport("leaflet", "esri.Geocoding.mapServiceProvider")
@js.native
object mapServiceProvider extends js.Object {
  def apply(): MapServiceProvider = js.native
  def apply(options: MapServiceProviderOptions): MapServiceProvider = js.native
}

