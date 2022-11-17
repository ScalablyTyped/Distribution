package typings.geojson

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type BBox = (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple6[Double, Double, Double, Double, Double, Double])
  
  trait Feature[G /* <: Geometry | Null */, P]
    extends StObject
       with GeoJsonObject {
    
    /**
      * The feature's geometry
      */
    var geometry: G
    
    /**
      * A value that uniquely identifies this feature in a
      * https://tools.ietf.org/html/rfc7946#section-3.2.
      */
    var id: js.UndefOr[String | Double] = js.undefined
    
    /**
      * Properties associated with this feature.
      */
    var properties: P
    
    @JSName("type")
    var type_Feature: "Feature"
  }
  object Feature {
    
    inline def apply[G /* <: Geometry | Null */, P](geometry: G, properties: P): Feature[G, P] = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[Feature[G, P]]
    }
    
    extension [Self <: Feature[?, ?], G /* <: Geometry | Null */, P](x: Self & (Feature[G, P])) {
      
      inline def setGeometry(value: G): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setType(value: "Feature"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureCollection[G /* <: Geometry | Null */, P]
    extends StObject
       with GeoJsonObject {
    
    var features: js.Array[Feature[G, P]]
    
    @JSName("type")
    var type_FeatureCollection: "FeatureCollection"
  }
  object FeatureCollection {
    
    inline def apply[G /* <: Geometry | Null */, P](features: js.Array[Feature[G, P]]): FeatureCollection[G, P] = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FeatureCollection")
      __obj.asInstanceOf[FeatureCollection[G, P]]
    }
    
    extension [Self <: FeatureCollection[?, ?], G /* <: Geometry | Null */, P](x: Self & (FeatureCollection[G, P])) {
      
      inline def setFeatures(value: js.Array[Feature[G, P]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: (Feature[G, P])*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setType(value: "FeatureCollection"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  
  object GeoJsonGeometryTypes {
    
    inline def GeometryCollection: "GeometryCollection" = "GeometryCollection".asInstanceOf["GeometryCollection"]
    
    inline def LineString: "LineString" = "LineString".asInstanceOf["LineString"]
    
    inline def MultiLineString: "MultiLineString" = "MultiLineString".asInstanceOf["MultiLineString"]
    
    inline def MultiPoint: "MultiPoint" = "MultiPoint".asInstanceOf["MultiPoint"]
    
    inline def MultiPolygon: "MultiPolygon" = "MultiPolygon".asInstanceOf["MultiPolygon"]
    
    inline def Point: "Point" = "Point".asInstanceOf["Point"]
    
    inline def Polygon: "Polygon" = "Polygon".asInstanceOf["Polygon"]
  }
  /* Inlined geojson.geojson.Geometry['type'] */
  type GeoJsonGeometryTypes = "MultiPolygon" | "GeometryCollection" | "MultiLineString" | "LineString" | "Point" | "Polygon" | "MultiPoint"
  
  trait GeoJsonObject extends StObject {
    
    /**
      * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
      * The value of the bbox member is an array of length 2*n where n is the number of dimensions
      * represented in the contained geometries, with all axes of the most southwesterly point
      * followed by all axes of the more northeasterly point.
      * The axes order of a bbox follows the axes order of geometries.
      * https://tools.ietf.org/html/rfc7946#section-5
      */
    var bbox: js.UndefOr[BBox] = js.undefined
    
    // Don't include foreign members directly into this type def.
    // in order to preserve type safety.
    // [key: string]: any;
    /**
      * Specifies the type of GeoJSON object.
      */
    var `type`: GeoJsonTypes
  }
  object GeoJsonObject {
    
    inline def apply(`type`: GeoJsonTypes): GeoJsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJsonObject]
    }
    
    extension [Self <: GeoJsonObject](x: Self) {
      
      inline def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      inline def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      inline def setType(value: GeoJsonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJsonProperties = StringDictionary[Any] | Null
  
  object GeoJsonTypes {
    
    inline def Feature: "Feature" = "Feature".asInstanceOf["Feature"]
    
    inline def FeatureCollection: "FeatureCollection" = "FeatureCollection".asInstanceOf["FeatureCollection"]
    
    inline def GeometryCollection: "GeometryCollection" = "GeometryCollection".asInstanceOf["GeometryCollection"]
    
    inline def LineString: "LineString" = "LineString".asInstanceOf["LineString"]
    
    inline def MultiLineString: "MultiLineString" = "MultiLineString".asInstanceOf["MultiLineString"]
    
    inline def MultiPoint: "MultiPoint" = "MultiPoint".asInstanceOf["MultiPoint"]
    
    inline def MultiPolygon: "MultiPolygon" = "MultiPolygon".asInstanceOf["MultiPolygon"]
    
    inline def Point: "Point" = "Point".asInstanceOf["Point"]
    
    inline def Polygon: "Polygon" = "Polygon".asInstanceOf["Polygon"]
  }
  /* Inlined geojson.geojson.GeoJSON['type'] */
  type GeoJsonTypes = "MultiPolygon" | "GeometryCollection" | "MultiLineString" | "LineString" | "Point" | "FeatureCollection" | "Polygon" | "MultiPoint" | "Feature"
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Geometry = geojson.geojson.Point | geojson.geojson.MultiPoint | geojson.geojson.LineString | geojson.geojson.MultiLineString | geojson.geojson.Polygon | geojson.geojson.MultiPolygon | geojson.geojson.GeometryCollection<geojson.geojson.Geometry>
  }}}
  to avoid circular code involving: 
  - geojson.geojson.GeoJSON
  - geojson.geojson.Geometry
  */
  type Geometry = Point | MultiPoint | LineString | MultiLineString | Polygon | MultiPolygon | GeometryCollection[Any]
  
  trait GeometryCollection[G /* <: Geometry */]
    extends StObject
       with GeoJsonObject {
    
    var geometries: js.Array[G]
    
    @JSName("type")
    var type_GeometryCollection: "GeometryCollection"
  }
  object GeometryCollection {
    
    inline def apply[G /* <: Geometry */](geometries: js.Array[G]): GeometryCollection[G] = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[GeometryCollection[G]]
    }
    
    extension [Self <: GeometryCollection[?], G /* <: Geometry */](x: Self & GeometryCollection[G]) {
      
      inline def setGeometries(value: js.Array[G]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      inline def setGeometriesVarargs(value: G*): Self = StObject.set(x, "geometries", js.Array(value*))
      
      inline def setType(value: "GeometryCollection"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type GeometryObject = geojson.geojson.Geometry
  }}}
  to avoid circular code involving: 
  - geojson.geojson.Geometry
  - geojson.geojson.GeometryObject
  */
  type GeometryObject = Any
  
  trait LineString
    extends StObject
       with GeoJsonObject {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_LineString: "LineString"
  }
  object LineString {
    
    inline def apply(coordinates: js.Array[Position]): LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[LineString]
    }
    
    extension [Self <: LineString](x: Self) {
      
      inline def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: "LineString"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiLineString
    extends StObject
       with GeoJsonObject {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_MultiLineString: "MultiLineString"
  }
  object MultiLineString {
    
    inline def apply(coordinates: js.Array[js.Array[Position]]): MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[MultiLineString]
    }
    
    extension [Self <: MultiLineString](x: Self) {
      
      inline def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: "MultiLineString"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPoint
    extends StObject
       with GeoJsonObject {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_MultiPoint: "MultiPoint"
  }
  object MultiPoint {
    
    inline def apply(coordinates: js.Array[Position]): MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[MultiPoint]
    }
    
    extension [Self <: MultiPoint](x: Self) {
      
      inline def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: "MultiPoint"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPolygon
    extends StObject
       with GeoJsonObject {
    
    var coordinates: js.Array[js.Array[js.Array[Position]]]
    
    @JSName("type")
    var type_MultiPolygon: "MultiPolygon"
  }
  object MultiPolygon {
    
    inline def apply(coordinates: js.Array[js.Array[js.Array[Position]]]): MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[MultiPolygon]
    }
    
    extension [Self <: MultiPolygon](x: Self) {
      
      inline def setCoordinates(value: js.Array[js.Array[js.Array[Position]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[js.Array[Position]]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: "MultiPolygon"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point
    extends StObject
       with GeoJsonObject {
    
    var coordinates: Position
    
    @JSName("type")
    var type_Point: "Point"
  }
  object Point {
    
    inline def apply(coordinates: Position): Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setCoordinates(value: Position): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: "Point"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon
    extends StObject
       with GeoJsonObject {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_Polygon: "Polygon"
  }
  object Polygon {
    
    inline def apply(coordinates: js.Array[js.Array[Position]]): Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[Polygon]
    }
    
    extension [Self <: Polygon](x: Self) {
      
      inline def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: "Polygon"): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Position = js.Array[Double]
}
