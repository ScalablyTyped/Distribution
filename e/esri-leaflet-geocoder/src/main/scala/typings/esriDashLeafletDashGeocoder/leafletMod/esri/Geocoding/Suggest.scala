package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typings.esriDashLeaflet.esriDashLeafletMod.Service
import typings.esriDashLeaflet.esriDashLeafletMod.Task
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.TaskOptions
import typings.leaflet.leafletMod.LatLngBoundsExpression
import typings.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "esri.Geocoding.Suggest")
@js.native
class Suggest () extends Task {
  def this(options: Service) = this()
  def this(options: TaskOptions) = this()
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
  def apply(options: Service): Suggest = js.native
  def apply(options: TaskOptions): Suggest = js.native
}

