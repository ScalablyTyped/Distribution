package typings
package geojsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geojsonMod {
  type BBox = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  type GeoJsonGeometryTypes = /* import warning: ImportType.apply Failed type conversion: geojson.geojson.Geometry['type'] */ js.Any
  type GeoJsonProperties = org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null
  type GeoJsonTypes = /* import warning: ImportType.apply Failed type conversion: geojson.geojson.GeoJSON['type'] */ js.Any
  type GeometryObject = Geometry
  type Position = js.Array[scala.Double]
}
