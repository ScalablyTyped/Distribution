package typings.esriDashLeafletDashGeocoder.leafletMod.esri.Geocoding

import typings.leaflet.leafletMod.LatLngBoundsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeosearchProvider extends js.Object {
  def results(text: String, key: String, bounds: js.UndefOr[LatLngBoundsExpression], callback: GeosearchCallback): js.Any = js.native
  def results(text: String, key: String, bounds: Null, callback: GeosearchCallback): js.Any = js.native
  def suggestions(text: String, bounds: js.UndefOr[LatLngBoundsExpression], callback: GeosearchCallback): js.Any = js.native
  def suggestions(text: String, bounds: Null, callback: GeosearchCallback): js.Any = js.native
}

