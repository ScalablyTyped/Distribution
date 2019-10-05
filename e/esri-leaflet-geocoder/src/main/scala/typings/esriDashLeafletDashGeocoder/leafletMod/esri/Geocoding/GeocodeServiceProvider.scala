package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "esri.Geocoding.GeocodeServiceProvider")
@js.native
class GeocodeServiceProvider ()
  extends GeocodeService
     with GeosearchProvider {
  def this(options: GeocodeServiceProviderOptions) = this()
}

@JSImport("leaflet", "esri.Geocoding.geocodeServiceProvider")
@js.native
object geocodeServiceProvider extends js.Object {
  def apply(): GeocodeServiceProvider = js.native
  def apply(options: GeocodeServiceProviderOptions): GeocodeServiceProvider = js.native
}

