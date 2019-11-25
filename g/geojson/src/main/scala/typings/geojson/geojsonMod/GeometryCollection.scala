package typings.geojson.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryCollection
  extends GeoJsonObject
     with Geometry {
  var geometries: js.Array[Geometry]
  @JSName("type")
  var type_GeometryCollection: typings.geojson.geojsonStrings.GeometryCollection
}

object GeometryCollection {
  @scala.inline
  def apply(
    geometries: js.Array[Geometry],
    `type`: typings.geojson.geojsonStrings.GeometryCollection,
    bbox: BBox = null
  ): GeometryCollection = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryCollection]
  }
}

