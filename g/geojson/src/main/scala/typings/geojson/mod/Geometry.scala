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
    `type`: typings.geojson.geojsonStrings.MultiPolygon,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Point(coordinates: Position, `type`: typings.geojson.geojsonStrings.Point, bbox: BBox = null): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def Polygon(
    coordinates: js.Array[js.Array[Position]],
    `type`: typings.geojson.geojsonStrings.Polygon,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def GeometryCollection(
    geometries: js.Array[Geometry],
    `type`: typings.geojson.geojsonStrings.GeometryCollection,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiLineString(
    coordinates: js.Array[js.Array[Position]],
    `type`: typings.geojson.geojsonStrings.MultiLineString,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def LineString(
    coordinates: js.Array[Position],
    `type`: typings.geojson.geojsonStrings.LineString,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
  @scala.inline
  def MultiPoint(
    coordinates: js.Array[Position],
    `type`: typings.geojson.geojsonStrings.MultiPoint,
    bbox: BBox = null
  ): Geometry = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (bbox != null) __obj.updateDynamic("bbox")(bbox.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

