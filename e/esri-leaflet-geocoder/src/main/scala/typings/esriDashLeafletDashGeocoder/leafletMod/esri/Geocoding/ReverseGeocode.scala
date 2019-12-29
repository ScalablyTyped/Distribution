package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typings.esriDashLeafletDashGeocoder.Anon_Address
import typings.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.ReverseGeocode")
@js.native
class ReverseGeocode () extends js.Object {
  def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
  def distance(distance: Double): this.type = js.native
  def language(language: String): this.type = js.native
  def latlng(latlng: LatLngExpression): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[js.Any], 
      /* results */ Anon_Address, 
      /* response */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[js.Any], 
      /* results */ Anon_Address, 
      /* response */ js.Any, 
      Unit
    ],
    context: js.Any
  ): this.type = js.native
}

@JSImport("leaflet", "esri.Geocoding.reverseGeocode")
@js.native
object reverseGeocode extends js.Object {
  def apply(): ReverseGeocode = js.native
  def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any
  ): ReverseGeocode = js.native
}

