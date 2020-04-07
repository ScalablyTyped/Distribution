package typings.geojson

import typings.geojson.mod.GeoJsonGeometryTypes
import typings.geojson.mod.GeoJsonTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object geojsonStrings {
  @js.native
  sealed trait Feature extends GeoJsonTypes
  
  @js.native
  sealed trait FeatureCollection extends GeoJsonTypes
  
  @js.native
  sealed trait GeometryCollection
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  
  @js.native
  sealed trait LineString
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  
  @js.native
  sealed trait MultiLineString
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  
  @js.native
  sealed trait MultiPoint
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  
  @js.native
  sealed trait MultiPolygon
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  
  @js.native
  sealed trait Point
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  
  @js.native
  sealed trait Polygon
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  
  @scala.inline
  def Feature: Feature = "Feature".asInstanceOf[Feature]
  @scala.inline
  def FeatureCollection: FeatureCollection = "FeatureCollection".asInstanceOf[FeatureCollection]
  @scala.inline
  def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  @scala.inline
  def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  @scala.inline
  def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  @scala.inline
  def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  @scala.inline
  def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
}

