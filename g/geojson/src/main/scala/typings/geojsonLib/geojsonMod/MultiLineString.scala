package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiLineString
  extends GeoJsonObject
     with Geometry {
  var coordinates: js.Array[js.Array[Position]]
  @JSName("type")
  var type_MultiLineString: geojsonLib.geojsonLibStrings.MultiLineString
}

object MultiLineString {
  @scala.inline
  def apply(
    coordinates: js.Array[js.Array[Position]],
    `type`: geojsonLib.geojsonLibStrings.MultiLineString,
    bbox: BBox = null
  ): MultiLineString = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("coordinates")(coordinates)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiLineString]
  }
}

