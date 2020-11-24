package typings.esriLeafletGeocoder.mod.esri.Geocoding

import typings.leaflet.mod.LatLngBoundsExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeosearchProvider extends js.Object {
  
  def results(text: String, key: String, bounds: js.UndefOr[LatLngBoundsExpression], callback: GeosearchCallback): js.Any = js.native
  def results(text: String, key: String, bounds: Null, callback: GeosearchCallback): js.Any = js.native
  
  def suggestions(text: String, bounds: js.UndefOr[LatLngBoundsExpression], callback: GeosearchCallback): js.Any = js.native
  def suggestions(text: String, bounds: Null, callback: GeosearchCallback): js.Any = js.native
}
