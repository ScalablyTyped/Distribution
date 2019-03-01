package typings
package geojsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geojsonMod {
  type BBox = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  type GeoJsonGeometryTypes = js.UndefOr[
    geojsonLib.geojsonLibStrings.Point | geojsonLib.geojsonLibStrings.MultiPoint | geojsonLib.geojsonLibStrings.LineString | geojsonLib.geojsonLibStrings.MultiLineString | geojsonLib.geojsonLibStrings.Polygon | geojsonLib.geojsonLibStrings.MultiPolygon | geojsonLib.geojsonLibStrings.GeometryCollection
  ]
  type GeoJsonProperties = org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null
  type GeoJsonTypes = js.UndefOr[
    geojsonLib.geojsonLibStrings.Point | geojsonLib.geojsonLibStrings.MultiPoint | geojsonLib.geojsonLibStrings.LineString | geojsonLib.geojsonLibStrings.MultiLineString | geojsonLib.geojsonLibStrings.Polygon | geojsonLib.geojsonLibStrings.MultiPolygon | geojsonLib.geojsonLibStrings.GeometryCollection | geojsonLib.geojsonLibStrings.Feature | geojsonLib.geojsonLibStrings.FeatureCollection
  ]
  type GeometryObject = Geometry
  type Position = js.Array[scala.Double]
}
