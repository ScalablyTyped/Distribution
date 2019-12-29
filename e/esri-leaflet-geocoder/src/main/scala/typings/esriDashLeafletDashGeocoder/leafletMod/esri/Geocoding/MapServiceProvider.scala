package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MapService * / any */ @JSImport("leaflet", "esri.Geocoding.MapServiceProvider")
@js.native
class MapServiceProvider () extends GeosearchProvider {
  def this(options: MapServiceProviderOptions) = this()
}

@JSImport("leaflet", "esri.Geocoding.mapServiceProvider")
@js.native
object mapServiceProvider extends js.Object {
  def apply(): MapServiceProvider = js.native
  def apply(options: MapServiceProviderOptions): MapServiceProvider = js.native
}

