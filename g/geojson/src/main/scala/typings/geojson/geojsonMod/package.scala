package typings.geojson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object geojsonMod {
  import org.scalablytyped.runtime.StringDictionary

  type BBox = (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple6[Double, Double, Double, Double, Double, Double])
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  type GeoJsonGeometryTypes = /* import warning: importer.ImportType#apply Failed type conversion: geojson.geojson.Geometry['type'] */ js.Any
  type GeoJsonProperties = StringDictionary[js.Any] | Null
  type GeoJsonTypes = /* import warning: importer.ImportType#apply Failed type conversion: geojson.geojson.GeoJSON['type'] */ js.Any
  type GeometryObject = Geometry
  type Position = js.Array[Double]
}
