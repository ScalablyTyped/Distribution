package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typings.esriDashLeaflet.esriDashLeafletMod.FeatureLayerService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "esri.Geocoding.FeatureLayerProvider")
@js.native
class FeatureLayerProvider ()
  extends FeatureLayerService
     with GeosearchProvider {
  def this(options: FeatureLayerProviderOptions) = this()
}

@JSImport("leaflet", "esri.Geocoding.featureLayerProvider")
@js.native
object featureLayerProvider extends js.Object {
  def apply(): FeatureLayerProvider = js.native
  def apply(options: FeatureLayerProviderOptions): FeatureLayerProvider = js.native
}

