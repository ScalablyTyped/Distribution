package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typings.esriDashLeaflet.esriDashLeafletMod.Service
import typings.esriDashLeaflet.esriDashLeafletMod.Task
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri.TaskOptions
import typings.esriDashLeafletDashGeocoder.Anon_Address
import typings.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "esri.Geocoding.ReverseGeocode")
@js.native
class ReverseGeocode () extends Task {
  def this(options: Service) = this()
  def this(options: TaskOptions) = this()
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
  def apply(options: Service): ReverseGeocode = js.native
  def apply(options: TaskOptions): ReverseGeocode = js.native
}

