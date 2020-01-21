package typings.esriLeafletGeocoder.mod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service * / any */ @JSImport("leaflet", "esri.Geocoding.GeocodeService")
@js.native
class GeocodeService_ () extends js.Object {
  def this(options: GeocodeServiceOptions) = this()
  def geocode(): Geocode_ = js.native
  def reverse(): ReverseGeocode_ = js.native
  def suggest(): Suggest_ = js.native
}

