package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPoint
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[Position]
  @JSName("type")
  var type_MultiPoint: geojsonLib.geojsonLibStrings.MultiPoint
}

object MultiPoint {
  @scala.inline
  def apply(
    coordinates: js.Array[Position],
    `type`: geojsonLib.geojsonLibStrings.MultiPoint,
    bbox: BBox = null
  ): MultiPoint = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPoint]
  }
}

