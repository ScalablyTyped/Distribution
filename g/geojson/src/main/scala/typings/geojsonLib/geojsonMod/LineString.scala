package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait LineString extends GeometryObject {
  var coordinates: js.Array[Position]
  @JSName("type")
  var type_LineString: geojsonLib.geojsonLibStrings.LineString
}

