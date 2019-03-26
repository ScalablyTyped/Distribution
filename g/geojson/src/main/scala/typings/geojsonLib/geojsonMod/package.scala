package typings
package geojsonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geojsonMod {
  type BBox = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  type GeoJsonGeometryTypes = js.UndefOr[geojsonLib.geojsonLibStrings.Point] with js.UndefOr[geojsonLib.geojsonLibStrings.MultiPoint] with js.UndefOr[geojsonLib.geojsonLibStrings.LineString] with js.UndefOr[geojsonLib.geojsonLibStrings.MultiLineString] with js.UndefOr[geojsonLib.geojsonLibStrings.Polygon] with js.UndefOr[geojsonLib.geojsonLibStrings.MultiPolygon] with js.UndefOr[geojsonLib.geojsonLibStrings.GeometryCollection]
  type GeoJsonProperties = org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null
  type GeoJsonTypes = js.UndefOr[geojsonLib.geojsonLibStrings.Point] with js.UndefOr[geojsonLib.geojsonLibStrings.MultiPoint] with js.UndefOr[geojsonLib.geojsonLibStrings.LineString] with js.UndefOr[geojsonLib.geojsonLibStrings.MultiLineString] with js.UndefOr[geojsonLib.geojsonLibStrings.Polygon] with js.UndefOr[geojsonLib.geojsonLibStrings.MultiPolygon] with js.UndefOr[geojsonLib.geojsonLibStrings.GeometryCollection] with js.UndefOr[geojsonLib.geojsonLibStrings.Feature] with js.UndefOr[geojsonLib.geojsonLibStrings.FeatureCollection]
  type GeometryObject = Geometry
  type Position = js.Array[scala.Double]
}
