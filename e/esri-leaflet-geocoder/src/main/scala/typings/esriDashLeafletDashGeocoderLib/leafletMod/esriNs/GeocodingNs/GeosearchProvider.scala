package typings
package esriDashLeafletDashGeocoderLib.leafletMod.esriNs.GeocodingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeosearchProvider extends js.Object {
  def results(
    text: java.lang.String,
    key: java.lang.String,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression | js.UndefOr[scala.Nothing],
    callback: GeosearchCallback
  ): esriDashLeafletLib.esriDashLeafletMod.Task = js.native
  def results(text: java.lang.String, key: java.lang.String, bounds: scala.Null, callback: GeosearchCallback): esriDashLeafletLib.esriDashLeafletMod.Task = js.native
  def suggestions(
    text: java.lang.String,
    bounds: leafletLib.leafletMod.LatLngBoundsExpression | js.UndefOr[scala.Nothing],
    callback: GeosearchCallback
  ): esriDashLeafletLib.esriDashLeafletMod.Task = js.native
  def suggestions(text: java.lang.String, bounds: scala.Null, callback: GeosearchCallback): esriDashLeafletLib.esriDashLeafletMod.Task = js.native
}

