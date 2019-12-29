package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeatureLayerService * / any */ @JSImport("leaflet", "esri.Geocoding.FeatureLayerProvider")
@js.native
class FeatureLayerProvider () extends GeosearchProvider {
  def this(options: FeatureLayerProviderOptions) = this()
}

@JSImport("leaflet", "esri.Geocoding.featureLayerProvider")
@js.native
object featureLayerProvider extends js.Object {
  def apply(): FeatureLayerProvider = js.native
  def apply(options: FeatureLayerProviderOptions): FeatureLayerProvider = js.native
}

