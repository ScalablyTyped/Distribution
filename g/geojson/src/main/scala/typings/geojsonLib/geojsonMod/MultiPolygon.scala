package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPolygon
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[js.Array[js.Array[Position]]]
  @JSName("type")
  var type_MultiPolygon: geojsonLib.geojsonLibStrings.MultiPolygon
}

object MultiPolygon {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[js.Array[Position]]],
    `type`: geojsonLib.geojsonLibStrings.MultiPolygon,
    bbox: BBox = null
  ): MultiPolygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiPolygon]
  }
}

