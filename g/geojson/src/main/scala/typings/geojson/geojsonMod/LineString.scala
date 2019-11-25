package typings.geojson.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineString
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[Position]
  @JSName("type")
  var type_LineString: typings.geojson.geojsonStrings.LineString
}

object LineString {
  @scala.inline
  def apply(
    coordinates: js.Array[Position],
    `type`: typings.geojson.geojsonStrings.LineString,
    bbox: BBox = null
  ): LineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineString]
  }
}

