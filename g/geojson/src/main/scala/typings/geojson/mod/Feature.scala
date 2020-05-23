package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature[G /* <: Geometry | Null */, P] extends GeoJsonObject {
  /**
    * The feature's geometry
    */
  var geometry: G
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * Properties associated with this feature.
    */
  var properties: P
  @JSName("type")
  var type_Feature: typings.geojson.geojsonStrings.Feature
}

object Feature {
  @scala.inline
  def apply[G, P](
    geometry: G,
    properties: P,
    `type`: typings.geojson.geojsonStrings.Feature,
    bbox: BBox = null,
    id: String | Double = null
  ): Feature[G, P] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature[G, P]]
  }
}

