package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollection[G /* <: Geometry | Null */, P] extends GeoJsonObject {
  var features: js.Array[Feature[G, P]]
  @JSName("type")
  var type_FeatureCollection: typings.geojson.geojsonStrings.FeatureCollection
}

object FeatureCollection {
  @scala.inline
  def apply[/* <: typings.geojson.mod.Geometry | scala.Null */ G, P](
    features: js.Array[Feature[G, P]],
    `type`: typings.geojson.geojsonStrings.FeatureCollection,
    bbox: BBox = null
  ): FeatureCollection[G, P] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureCollection[G, P]]
  }
}

