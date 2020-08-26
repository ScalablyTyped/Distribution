package typings.geojson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.geojson.mod.Point
  - typings.geojson.mod.MultiPoint
  - typings.geojson.mod.LineString
  - typings.geojson.mod.MultiLineString
  - typings.geojson.mod.Polygon
  - typings.geojson.mod.MultiPolygon
  - typings.geojson.mod.GeometryCollection
*/
trait Geometry extends js.Object

object Geometry {
  @scala.inline
  def MultiPolygon(
    coordinates: js.Array[js.Array[js.Array[Position]]],
    `type`: typings.geojson.geojsonStrings.MultiPolygon
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Point(coordinates: Position, `type`: typings.geojson.geojsonStrings.Point): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Polygon(coordinates: js.Array[js.Array[Position]], `type`: typings.geojson.geojsonStrings.Polygon): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def GeometryCollection(geometries: js.Array[Geometry], `type`: typings.geojson.geojsonStrings.GeometryCollection): Geometry = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiLineString(coordinates: js.Array[js.Array[Position]], `type`: typings.geojson.geojsonStrings.MultiLineString): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def LineString(coordinates: js.Array[Position], `type`: typings.geojson.geojsonStrings.LineString): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiPoint(coordinates: js.Array[Position], `type`: typings.geojson.geojsonStrings.MultiPoint): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

