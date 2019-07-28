package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

import typings.esriDashLeaflet.esriDashLeafletMod.FeatureLayerService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding.FeatureLayerProvider")
@js.native
class FeatureLayerProvider ()
  extends FeatureLayerService
     with GeosearchProvider {
  def this(options: FeatureLayerProviderOptions) = this()
}

