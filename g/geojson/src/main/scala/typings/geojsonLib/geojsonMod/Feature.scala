package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature[G /* <: Geometry | scala.Null */, P] extends GeoJsonObject {
  /**
    * The feature's geometry
    */
  var geometry: G
  /**
    * A value that uniquely identifies this feature in a
    * https://tools.ietf.org/html/rfc7946#section-3.2.
    */
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Properties associated with this feature.
    */
  var properties: P
  @JSName("type")
  var type_Feature: geojsonLib.geojsonLibStrings.Feature
}

object Feature {
  @scala.inline
  def apply[G /* <: Geometry | scala.Null */, P](
    geometry: G,
    properties: P,
    `type`: geojsonLib.geojsonLibStrings.Feature,
    bbox: BBox = null,
    id: java.lang.String | scala.Double = null
  ): Feature[G, P] = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feature[G, P]]
  }
}

