package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined geojson.geojson.Geometry['type'] */
/* Rewritten from type alias, can be one of: 
  - typings.geojson.geojsonStrings.GeometryCollection
  - typings.geojson.geojsonStrings.MultiPoint
  - typings.geojson.geojsonStrings.LineString
  - typings.geojson.geojsonStrings.Point
  - typings.geojson.geojsonStrings.Polygon
  - typings.geojson.geojsonStrings.MultiLineString
  - typings.geojson.geojsonStrings.MultiPolygon
*/
trait GeoJsonGeometryTypes extends js.Object

object GeoJsonGeometryTypes {
  @scala.inline
  def GeometryCollection: typings.geojson.geojsonStrings.GeometryCollection = this.cast("GeometryCollection")
  @scala.inline
  def LineString: typings.geojson.geojsonStrings.LineString = this.cast("LineString")
  @scala.inline
  def MultiLineString: typings.geojson.geojsonStrings.MultiLineString = this.cast("MultiLineString")
  @scala.inline
  def MultiPoint: typings.geojson.geojsonStrings.MultiPoint = this.cast("MultiPoint")
  @scala.inline
  def MultiPolygon: typings.geojson.geojsonStrings.MultiPolygon = this.cast("MultiPolygon")
  @scala.inline
  def Point: typings.geojson.geojsonStrings.Point = this.cast("Point")
  @scala.inline
  def Polygon: typings.geojson.geojsonStrings.Polygon = this.cast("Polygon")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

