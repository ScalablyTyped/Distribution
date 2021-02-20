package typings.geojson

import typings.geojson.mod.GeoJsonGeometryTypes
import typings.geojson.mod.GeoJsonTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geojsonStrings {
  
  @js.native
  sealed trait Feature extends GeoJsonTypes
  @scala.inline
  def Feature: Feature = "Feature".asInstanceOf[Feature]
  
  @js.native
  sealed trait FeatureCollection extends GeoJsonTypes
  @scala.inline
  def FeatureCollection: FeatureCollection = "FeatureCollection".asInstanceOf[FeatureCollection]
  
  @js.native
  sealed trait GeometryCollection
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  @scala.inline
  def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  
  @js.native
  sealed trait LineString
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  @scala.inline
  def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait MultiLineString
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  @scala.inline
  def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @js.native
  sealed trait MultiPoint
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  @scala.inline
  def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @js.native
  sealed trait MultiPolygon
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  @scala.inline
  def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @js.native
  sealed trait Point
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  @scala.inline
  def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon
    extends GeoJsonGeometryTypes
       with GeoJsonTypes
  @scala.inline
  def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
}
