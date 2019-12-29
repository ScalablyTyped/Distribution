package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Service * / any */ @JSImport("leaflet", "esri.Geocoding.GeocodeService")
@js.native
class GeocodeService () extends js.Object {
  def this(options: GeocodeServiceOptions) = this()
  def geocode(): Geocode = js.native
  def reverse(): ReverseGeocode = js.native
  def suggest(): Suggest = js.native
}

@JSImport("leaflet", "esri.Geocoding.geocodeService")
@js.native
object geocodeService extends js.Object {
  def apply(): GeocodeService = js.native
  def apply(options: GeocodeServiceOptions): GeocodeService = js.native
}

