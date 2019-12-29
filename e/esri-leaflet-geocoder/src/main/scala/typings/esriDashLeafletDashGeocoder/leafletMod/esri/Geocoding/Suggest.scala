package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typings.leaflet.leafletMod.LatLngBoundsExpression
import typings.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Task * / any */ @JSImport("leaflet", "esri.Geocoding.Suggest")
@js.native
class Suggest () extends js.Object {
  def this(options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any) = this()
  def category(text: String): this.type = js.native
  def nearby(latlng: LatLngExpression, distance: Double): this.type = js.native
  def run(
    callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ js.Any, /* response */ js.Any, Unit]
  ): this.type = js.native
  def run(
    callback: js.Function3[/* error */ js.UndefOr[js.Any], /* results */ js.Any, /* response */ js.Any, Unit],
    context: js.Any
  ): this.type = js.native
  def text(text: String): this.type = js.native
  def within(bounds: LatLngBoundsExpression): this.type = js.native
}

@JSImport("leaflet", "esri.Geocoding.suggest")
@js.native
object suggest extends js.Object {
  def apply(): Suggest = js.native
  def apply(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TaskOptions */ js.Any
  ): Suggest = js.native
}

