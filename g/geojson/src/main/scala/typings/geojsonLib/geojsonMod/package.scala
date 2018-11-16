package typings
package geojsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geojsonMod {
  type BBox = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  type GeoJsonGeometryTypes = geojsonLib.geojsonLibStrings.Point | geojsonLib.geojsonLibStrings.LineString | geojsonLib.geojsonLibStrings.MultiPoint | geojsonLib.geojsonLibStrings.Polygon | geojsonLib.geojsonLibStrings.MultiLineString | geojsonLib.geojsonLibStrings.MultiPolygon | geojsonLib.geojsonLibStrings.GeometryCollection
  type GeoJsonProperties = ScalablyTyped.runtime.StringDictionary[js.Any] | scala.Null
  type GeoJsonTypes = geojsonLib.geojsonLibStrings.FeatureCollection | geojsonLib.geojsonLibStrings.Feature | GeoJsonGeometryTypes
  type Geometry = Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection
  type Position = js.Array[scala.Double]
}
