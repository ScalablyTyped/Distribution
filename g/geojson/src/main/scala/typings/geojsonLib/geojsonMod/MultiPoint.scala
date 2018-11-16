package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MultiPoint extends GeometryObject {
  var coordinates: js.Array[Position]
  @JSName("type")
  var type_MultiPoint: geojsonLib.geojsonLibStrings.MultiPoint
}

