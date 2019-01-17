package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon extends GeoJsonObject {
  var coordinates: js.Array[js.Array[Position]]
  @JSName("type")
  var type_Polygon: geojsonLib.geojsonLibStrings.Polygon
}

