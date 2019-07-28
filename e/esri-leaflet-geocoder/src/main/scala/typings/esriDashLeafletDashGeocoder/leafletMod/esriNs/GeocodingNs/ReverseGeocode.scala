package typings.esriDashLeafletDashGeocoder.leafletMod.esriNs.GeocodingNs

import typings.esriDashLeaflet.esriDashLeafletMod.Service
import typings.esriDashLeaflet.esriDashLeafletMod.Task
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.TaskOptions
import typings.esriDashLeafletDashGeocoder.Anon_Address
import typings.leaflet.leafletMod.LatLngExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding.ReverseGeocode")
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

