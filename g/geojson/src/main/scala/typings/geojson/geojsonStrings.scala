package typings.geojson

import typings.geojson.mod.GeoJsonGeometryTypes
import typings.geojson.mod.GeoJsonTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geojsonStrings {
  
  @js.native
  sealed trait Feature
    extends StObject
       with GeoJsonTypes
  inline def Feature: Feature = "Feature".asInstanceOf[Feature]
  
  @js.native
  sealed trait FeatureCollection
    extends StObject
       with GeoJsonTypes
  inline def FeatureCollection: FeatureCollection = "FeatureCollection".asInstanceOf[FeatureCollection]
  
  @js.native
  sealed trait GeometryCollection
    extends StObject
       with GeoJsonGeometryTypes
       with GeoJsonTypes
  inline def GeometryCollection: GeometryCollection = "GeometryCollection".asInstanceOf[GeometryCollection]
  
  @js.native
  sealed trait LineString
    extends StObject
       with GeoJsonGeometryTypes
       with GeoJsonTypes
  inline def LineString: LineString = "LineString".asInstanceOf[LineString]
  
  @js.native
  sealed trait MultiLineString
    extends StObject
       with GeoJsonGeometryTypes
       with GeoJsonTypes
  inline def MultiLineString: MultiLineString = "MultiLineString".asInstanceOf[MultiLineString]
  
  @js.native
  sealed trait MultiPoint
    extends StObject
       with GeoJsonGeometryTypes
       with GeoJsonTypes
  inline def MultiPoint: MultiPoint = "MultiPoint".asInstanceOf[MultiPoint]
  
  @js.native
  sealed trait MultiPolygon
    extends StObject
       with GeoJsonGeometryTypes
       with GeoJsonTypes
  inline def MultiPolygon: MultiPolygon = "MultiPolygon".asInstanceOf[MultiPolygon]
  
  @js.native
  sealed trait Point
    extends StObject
       with GeoJsonGeometryTypes
       with GeoJsonTypes
  inline def Point: Point = "Point".asInstanceOf[Point]
  
  @js.native
  sealed trait Polygon
    extends StObject
       with GeoJsonGeometryTypes
       with GeoJsonTypes
  inline def Polygon: Polygon = "Polygon".asInstanceOf[Polygon]
}
