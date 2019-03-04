package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Polygon
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[js.Array[Position]]
  @JSName("type")
  var type_Polygon: geojsonLib.geojsonLibStrings.Polygon
}

object Polygon {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[Position]],
    `type`: geojsonLib.geojsonLibStrings.Polygon,
    bbox: BBox = null
  ): Polygon = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
}

