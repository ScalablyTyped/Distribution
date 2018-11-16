package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("leaflet.esri.Geocoding.ReverseGeocode")
@js.native
class ReverseGeocode ()
  extends esriDashLeafletLib.esriDashLeafletMod.Task {
  def this(options: esriDashLeafletLib.esriDashLeafletMod.Service) = this()
  def this(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.TaskOptions) = this()
  def distance(distance: scala.Double): this.type = js.native
  def language(language: java.lang.String): this.type = js.native
  def latlng(latlng: leafletLib.leafletMod.LatLngExpression): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[_], 
      /* results */ esriDashLeafletDashGeocoderLib.Anon_Latlng, 
      /* response */ js.Any, 
      scala.Unit
    ]
  ): this.type = js.native
  def run(
    callback: js.Function3[
      /* error */ js.UndefOr[_], 
      /* results */ esriDashLeafletDashGeocoderLib.Anon_Latlng, 
      /* response */ js.Any, 
      scala.Unit
    ],
    context: js.Any
  ): this.type = js.native
}

