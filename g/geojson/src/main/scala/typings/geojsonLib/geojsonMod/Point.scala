package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Point
  extends GeoJsonObject
     with Geometry {
  var coordinates: Position
  @JSName("type")
  var type_Point: geojsonLib.geojsonLibStrings.Point
}

object Point {
  @scala.inline
  def apply(coordinates: Position, `type`: geojsonLib.geojsonLibStrings.Point, bbox: BBox = null): Point = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("coordinates")(coordinates)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Point]
  }
}

