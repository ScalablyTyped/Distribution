package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding.Suggest")
@js.native
class Suggest ()
  extends esriDashLeafletLib.esriDashLeafletMod.Task {
  def this(options: esriDashLeafletLib.esriDashLeafletMod.Service) = this()
  def this(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.TaskOptions) = this()
  def category(text: java.lang.String): this.type = js.native
  def nearby(latlng: leafletLib.leafletMod.LatLngExpression, distance: scala.Double): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[js.Any], 
      /* results */ js.Any, 
      /* response */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[js.Any], 
      /* results */ js.Any, 
      /* response */ js.Any, 
      scala.Unit
    ],
    context: js.Any
  ): this.type = js.native
  def text(text: java.lang.String): this.type = js.native
  def within(bounds: leafletLib.leafletMod.LatLngBoundsExpression): this.type = js.native
}

