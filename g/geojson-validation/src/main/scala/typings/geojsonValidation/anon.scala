package typings.geojsonValidation

import typings.geojsonValidation.mod.GeoJSONValidator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bbox extends StObject {
    
    def Bbox(geoJSONObject: Any): js.Array[String]
    def Bbox(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("Bbox")
    var Bbox_Original: GeoJSONValidator
    
    def Feature(geoJSONObject: Any): js.Array[String]
    def Feature(geoJSONObject: Any, trace: Boolean): js.Array[String]
    
    def FeatureCollection(geoJSONObject: Any): js.Array[String]
    def FeatureCollection(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("FeatureCollection")
    var FeatureCollection_Original: GeoJSONValidator
    
    @JSName("Feature")
    var Feature_Original: GeoJSONValidator
    
    def GeoJSON(geoJSONObject: Any): js.Array[String]
    def GeoJSON(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("GeoJSON")
    var GeoJSON_Original: GeoJSONValidator
    
    def GeometryCollection(geoJSONObject: Any): js.Array[String]
    def GeometryCollection(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("GeometryCollection")
    var GeometryCollection_Original: GeoJSONValidator
    
    def GeometryObject(geoJSONObject: Any): js.Array[String]
    def GeometryObject(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("GeometryObject")
    var GeometryObject_Original: GeoJSONValidator
    
    def LineString(geoJSONObject: Any): js.Array[String]
    def LineString(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("LineString")
    var LineString_Original: GeoJSONValidator
    
    def MultiLineString(geoJSONObject: Any): js.Array[String]
    def MultiLineString(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("MultiLineString")
    var MultiLineString_Original: GeoJSONValidator
    
    def MultiPoint(geoJSONObject: Any): js.Array[String]
    def MultiPoint(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("MultiPoint")
    var MultiPoint_Original: GeoJSONValidator
    
    def MultiPolygon(geoJSONObject: Any): js.Array[String]
    def MultiPolygon(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("MultiPolygon")
    var MultiPolygon_Original: GeoJSONValidator
    
    def Point(geoJSONObject: Any): js.Array[String]
    def Point(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("Point")
    var Point_Original: GeoJSONValidator
    
    def Polygon(geoJSONObject: Any): js.Array[String]
    def Polygon(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("Polygon")
    var Polygon_Original: GeoJSONValidator
    
    def Position(geoJSONObject: Any): js.Array[String]
    def Position(geoJSONObject: Any, trace: Boolean): js.Array[String]
    @JSName("Position")
    var Position_Original: GeoJSONValidator
  }
  object Bbox {
    
    inline def apply(
      Bbox: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      Feature: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      FeatureCollection: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      GeoJSON: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      GeometryCollection: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      GeometryObject: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      LineString: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      MultiLineString: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      MultiPoint: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      MultiPolygon: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      Point: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      Polygon: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String],
      Position: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]
    ): Bbox = {
      val __obj = js.Dynamic.literal(Bbox = js.Any.fromFunction2(Bbox), Feature = js.Any.fromFunction2(Feature), FeatureCollection = js.Any.fromFunction2(FeatureCollection), GeoJSON = js.Any.fromFunction2(GeoJSON), GeometryCollection = js.Any.fromFunction2(GeometryCollection), GeometryObject = js.Any.fromFunction2(GeometryObject), LineString = js.Any.fromFunction2(LineString), MultiLineString = js.Any.fromFunction2(MultiLineString), MultiPoint = js.Any.fromFunction2(MultiPoint), MultiPolygon = js.Any.fromFunction2(MultiPolygon), Point = js.Any.fromFunction2(Point), Polygon = js.Any.fromFunction2(Polygon), Position = js.Any.fromFunction2(Position))
      __obj.asInstanceOf[Bbox]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bbox] (val x: Self) extends AnyVal {
      
      inline def setBbox(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "Bbox", js.Any.fromFunction2(value))
      
      inline def setFeature(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "Feature", js.Any.fromFunction2(value))
      
      inline def setFeatureCollection(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "FeatureCollection", js.Any.fromFunction2(value))
      
      inline def setGeoJSON(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "GeoJSON", js.Any.fromFunction2(value))
      
      inline def setGeometryCollection(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "GeometryCollection", js.Any.fromFunction2(value))
      
      inline def setGeometryObject(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "GeometryObject", js.Any.fromFunction2(value))
      
      inline def setLineString(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "LineString", js.Any.fromFunction2(value))
      
      inline def setMultiLineString(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "MultiLineString", js.Any.fromFunction2(value))
      
      inline def setMultiPoint(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "MultiPoint", js.Any.fromFunction2(value))
      
      inline def setMultiPolygon(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "MultiPolygon", js.Any.fromFunction2(value))
      
      inline def setPoint(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "Point", js.Any.fromFunction2(value))
      
      inline def setPolygon(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "Polygon", js.Any.fromFunction2(value))
      
      inline def setPosition(value: (/* geoJSONObject */ Any, /* trace */ js.UndefOr[Boolean]) => js.Array[String]): Self = StObject.set(x, "Position", js.Any.fromFunction2(value))
    }
  }
}
