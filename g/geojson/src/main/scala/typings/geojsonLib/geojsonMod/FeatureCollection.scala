package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollection[G /* <: Geometry | scala.Null */, P] extends GeoJsonObject {
  var features: js.Array[Feature[G, P]]
  @JSName("type")
  var type_FeatureCollection: geojsonLib.geojsonLibStrings.FeatureCollection
}

object FeatureCollection {
  @scala.inline
  def apply[G /* <: Geometry | scala.Null */, P](
    features: js.Array[Feature[G, P]],
    `type`: geojsonLib.geojsonLibStrings.FeatureCollection,
    bbox: BBox = null
  ): FeatureCollection[G, P] = {
    val __obj = js.Dynamic.literal(features = features)
    __obj.updateDynamic("type")(`type`)
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollection[G, P]]
  }
}

