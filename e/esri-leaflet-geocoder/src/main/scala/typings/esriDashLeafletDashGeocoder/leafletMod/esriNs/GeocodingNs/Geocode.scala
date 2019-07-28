package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

import typings.esriDashLeaflet.esriDashLeafletMod.Service
import typings.esriDashLeaflet.esriDashLeafletMod.Task
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.TaskOptions
import typings.esriDashLeafletDashGeocoder.Anon_Results
import typings.leaflet.leafletMod.LatLngBoundsExpression
import typings.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding.Geocode")
@js.native
class Geocode () extends Task {
  def this(options: Service) = this()
  def this(options: TaskOptions) = this()
  def address(text: String): this.type = js.native
  def category(text: String): this.type = js.native
  def city(text: String): this.type = js.native
  def country(text: String): this.type = js.native
  def nearby(latlng: LatLngExpression, distance: Double): this.type = js.native
  def neighborhood(text: String): this.type = js.native
  def postal(text: String): this.type = js.native
  def region(text: String): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[js.Any], 
      /* results */ Anon_Results, 
      /* response */ js.Any, 
      Unit
    ]
  ): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[js.Any], 
      /* results */ Anon_Results, 
      /* response */ js.Any, 
      Unit
    ],
    context: js.Any
  ): this.type = js.native
  def subregion(text: String): this.type = js.native
  def text(text: String): this.type = js.native
  def within(bounds: LatLngBoundsExpression): this.type = js.native
}

