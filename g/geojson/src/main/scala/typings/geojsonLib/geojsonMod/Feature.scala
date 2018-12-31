package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feature[G /* <: GeometryObject | scala.Null */, P] extends GeoJsonObject {
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

