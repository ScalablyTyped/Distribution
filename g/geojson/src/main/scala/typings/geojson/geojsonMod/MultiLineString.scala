package typings.geojson.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiLineString
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[js.Array[Position]]
  @JSName("type")
  var type_MultiLineString: typings.geojson.geojsonStrings.MultiLineString
}

object MultiLineString {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[Position]],
    `type`: typings.geojson.geojsonStrings.MultiLineString,
    bbox: BBox = null
  ): MultiLineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLineString]
  }
}

