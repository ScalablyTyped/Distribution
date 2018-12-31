package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiLineString extends GeometryObject {
  var coordinates: js.Array[js.Array[Position]]
  @JSName("type")
  var type_MultiLineString: geojsonLib.geojsonLibStrings.MultiLineString
}

