package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MultiPolygon extends GeometryObject {
  var coordinates: js.Array[js.Array[js.Array[Position]]]
  @JSName("type")
  var type_MultiPolygon: geojsonLib.geojsonLibStrings.MultiPolygon
}

