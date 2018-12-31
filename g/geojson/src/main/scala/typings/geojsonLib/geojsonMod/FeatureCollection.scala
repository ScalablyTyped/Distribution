package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureCollection[G /* <: GeometryObject | scala.Null */, P] extends GeoJsonObject {
  var features: js.Array[Feature[G, P]]
  @JSName("type")
  var type_FeatureCollection: geojsonLib.geojsonLibStrings.FeatureCollection
}

