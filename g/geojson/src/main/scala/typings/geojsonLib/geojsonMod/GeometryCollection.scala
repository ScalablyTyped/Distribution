package typings
package geojsonLib.geojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GeometryCollection extends GeometryObject {
  var geometries: js.Array[Geometry]
  @JSName("type")
  var type_GeometryCollection: geojsonLib.geojsonLibStrings.GeometryCollection
}

