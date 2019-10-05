package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "esri.Geocoding.ArcgisOnlineProvider")
@js.native
class ArcgisOnlineProvider ()
  extends GeocodeService
     with GeosearchProvider {
  def this(options: ArcgisOnlineProviderOptions) = this()
}

@JSImport("leaflet", "esri.Geocoding.arcgisOnlineProvider")
@js.native
object arcgisOnlineProvider extends js.Object {
  def apply(): ArcgisOnlineProvider = js.native
  def apply(options: ArcgisOnlineProviderOptions): ArcgisOnlineProvider = js.native
}

