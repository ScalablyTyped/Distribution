package typings.geojson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BBox = (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]) | (js.Tuple6[scala.Double, scala.Double, scala.Double, scala.Double, scala.Double, scala.Double])
  type GeoJSON = typings.geojson.mod.Geometry | (typings.geojson.mod.Feature[typings.geojson.mod.Geometry, typings.geojson.mod.GeoJsonProperties]) | (typings.geojson.mod.FeatureCollection[typings.geojson.mod.Geometry, typings.geojson.mod.GeoJsonProperties])
  type GeoJsonGeometryTypes = /* import warning: importer.ImportType#apply Failed type conversion: geojson.geojson.Geometry['type'] */ js.Any
  type GeoJsonProperties = org.scalablytyped.runtime.StringDictionary[js.Any] | scala.Null
  type GeoJsonTypes = /* import warning: importer.ImportType#apply Failed type conversion: geojson.geojson.GeoJSON['type'] */ js.Any
  type GeometryObject = typings.geojson.mod.Geometry
  type Position = js.Array[scala.Double]
}
