package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeometryCollection
  extends GeoJsonObject
     with Geometry {
  var geometries: js.Array[Geometry]
  @JSName("type")
  var type_GeometryCollection: geojsonLib.geojsonLibStrings.GeometryCollection
}

object GeometryCollection {
  @scala.inline
  def apply(
    geometries: js.Array[Geometry],
    `type`: geojsonLib.geojsonLibStrings.GeometryCollection,
    bbox: BBox = null
  ): GeometryCollection = {
    val __obj = js.Dynamic.literal(geometries = geometries)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryCollection]
  }
}

