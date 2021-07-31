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
    var type_Feature: typings.geojson.geojsonStrings.Feature
  }
  object Feature {
    
    @scala.inline
    def apply[G /* <: Geometry | Null */, P](geometry: G, properties: P): Feature[G, P] = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[Feature[G, P]]
    }
    
    @scala.inline
    implicit class FeatureMutableBuilder[Self <: Feature[?, ?], G /* <: Geometry | Null */, P] (val x: Self & (Feature[G, P])) extends AnyVal {
      
      @scala.inline
      def setGeometry(value: G): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProperties(value: P): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.Feature): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FeatureCollection[G /* <: Geometry | Null */, P]
    extends StObject
       with GeoJsonObject {
    
    var features: js.Array[Feature[G, P]]
    
    @JSName("type")
    var type_FeatureCollection: typings.geojson.geojsonStrings.FeatureCollection
  }
  object FeatureCollection {
    
    @scala.inline
    def apply[G /* <: Geometry | Null */, P](features: js.Array[Feature[G, P]]): FeatureCollection[G, P] = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FeatureCollection")
      __obj.asInstanceOf[FeatureCollection[G, P]]
    }
    
    @scala.inline
    implicit class FeatureCollectionMutableBuilder[Self <: FeatureCollection[?, ?], G /* <: Geometry | Null */, P] (val x: Self & (FeatureCollection[G, P])) extends AnyVal {
      
      @scala.inline
      def setFeatures(value: js.Array[Feature[G, P]]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesVarargs(value: (Feature[G, P])*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJSON = Geometry | (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties])
  
  /* Inlined geojson.geojson.Geometry['type'] */
  /* Rewritten from type alias, can be one of: 
    - typings.geojson.geojsonStrings.MultiPolygon
    - typings.geojson.geojsonStrings.GeometryCollection
    - typings.geojson.geojsonStrings.MultiLineString
    - typings.geojson.geojsonStrings.LineString
    - typings.geojson.geojsonStrings.Point
    - typings.geojson.geojsonStrings.Polygon
    - typings.geojson.geojsonStrings.MultiPoint
  */
  trait GeoJsonGeometryTypes extends StObject
  object GeoJsonGeometryTypes {
    
    @scala.inline
    def GeometryCollection: typings.geojson.geojsonStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typings.geojson.geojsonStrings.GeometryCollection]
    
    @scala.inline
    def LineString: typings.geojson.geojsonStrings.LineString = "LineString".asInstanceOf[typings.geojson.geojsonStrings.LineString]
    
    @scala.inline
    def MultiLineString: typings.geojson.geojsonStrings.MultiLineString = "MultiLineString".asInstanceOf[typings.geojson.geojsonStrings.MultiLineString]
    
    @scala.inline
    def MultiPoint: typings.geojson.geojsonStrings.MultiPoint = "MultiPoint".asInstanceOf[typings.geojson.geojsonStrings.MultiPoint]
    
    @scala.inline
    def MultiPolygon: typings.geojson.geojsonStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typings.geojson.geojsonStrings.MultiPolygon]
    
    @scala.inline
    def Point: typings.geojson.geojsonStrings.Point = "Point".asInstanceOf[typings.geojson.geojsonStrings.Point]
    
    @scala.inline
    def Polygon: typings.geojson.geojsonStrings.Polygon = "Polygon".asInstanceOf[typings.geojson.geojsonStrings.Polygon]
  }
  
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
    
    @scala.inline
    def apply(`type`: GeoJsonTypes): GeoJsonObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeoJsonObject]
    }
    
    @scala.inline
    implicit class GeoJsonObjectMutableBuilder[Self <: GeoJsonObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBbox(value: BBox): Self = StObject.set(x, "bbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBboxUndefined: Self = StObject.set(x, "bbox", js.undefined)
      
      @scala.inline
      def setType(value: GeoJsonTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeoJsonProperties = StringDictionary[js.Any] | Null
  
  /* Inlined geojson.geojson.GeoJSON['type'] */
  /* Rewritten from type alias, can be one of: 
    - typings.geojson.geojsonStrings.MultiPolygon
    - typings.geojson.geojsonStrings.GeometryCollection
    - typings.geojson.geojsonStrings.MultiLineString
    - typings.geojson.geojsonStrings.LineString
    - typings.geojson.geojsonStrings.Point
    - typings.geojson.geojsonStrings.FeatureCollection
    - typings.geojson.geojsonStrings.Polygon
    - typings.geojson.geojsonStrings.MultiPoint
    - typings.geojson.geojsonStrings.Feature
  */
  trait GeoJsonTypes extends StObject
  object GeoJsonTypes {
    
    @scala.inline
    def Feature: typings.geojson.geojsonStrings.Feature = "Feature".asInstanceOf[typings.geojson.geojsonStrings.Feature]
    
    @scala.inline
    def FeatureCollection: typings.geojson.geojsonStrings.FeatureCollection = "FeatureCollection".asInstanceOf[typings.geojson.geojsonStrings.FeatureCollection]
    
    @scala.inline
    def GeometryCollection: typings.geojson.geojsonStrings.GeometryCollection = "GeometryCollection".asInstanceOf[typings.geojson.geojsonStrings.GeometryCollection]
    
    @scala.inline
    def LineString: typings.geojson.geojsonStrings.LineString = "LineString".asInstanceOf[typings.geojson.geojsonStrings.LineString]
    
    @scala.inline
    def MultiLineString: typings.geojson.geojsonStrings.MultiLineString = "MultiLineString".asInstanceOf[typings.geojson.geojsonStrings.MultiLineString]
    
    @scala.inline
    def MultiPoint: typings.geojson.geojsonStrings.MultiPoint = "MultiPoint".asInstanceOf[typings.geojson.geojsonStrings.MultiPoint]
    
    @scala.inline
    def MultiPolygon: typings.geojson.geojsonStrings.MultiPolygon = "MultiPolygon".asInstanceOf[typings.geojson.geojsonStrings.MultiPolygon]
    
    @scala.inline
    def Point: typings.geojson.geojsonStrings.Point = "Point".asInstanceOf[typings.geojson.geojsonStrings.Point]
    
    @scala.inline
    def Polygon: typings.geojson.geojsonStrings.Polygon = "Polygon".asInstanceOf[typings.geojson.geojsonStrings.Polygon]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.geojson.mod.Point
    - typings.geojson.mod.MultiPoint
    - typings.geojson.mod.LineString
    - typings.geojson.mod.MultiLineString
    - typings.geojson.mod.Polygon
    - typings.geojson.mod.MultiPolygon
    - typings.geojson.mod.GeometryCollection
  */
  trait Geometry extends StObject
  object Geometry {
    
    @scala.inline
    def GeometryCollection(geometries: js.Array[Geometry]): typings.geojson.mod.GeometryCollection = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[typings.geojson.mod.GeometryCollection]
    }
    
    @scala.inline
    def LineString(coordinates: js.Array[Position]): typings.geojson.mod.LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[typings.geojson.mod.LineString]
    }
    
    @scala.inline
    def MultiLineString(coordinates: js.Array[js.Array[Position]]): typings.geojson.mod.MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[typings.geojson.mod.MultiLineString]
    }
    
    @scala.inline
    def MultiPoint(coordinates: js.Array[Position]): typings.geojson.mod.MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[typings.geojson.mod.MultiPoint]
    }
    
    @scala.inline
    def MultiPolygon(coordinates: js.Array[js.Array[js.Array[Position]]]): typings.geojson.mod.MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[typings.geojson.mod.MultiPolygon]
    }
    
    @scala.inline
    def Point(coordinates: Position): typings.geojson.mod.Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[typings.geojson.mod.Point]
    }
    
    @scala.inline
    def Polygon(coordinates: js.Array[js.Array[Position]]): typings.geojson.mod.Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[typings.geojson.mod.Polygon]
    }
  }
  
  trait GeometryCollection
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var geometries: js.Array[Geometry]
    
    @JSName("type")
    var type_GeometryCollection: typings.geojson.geojsonStrings.GeometryCollection
  }
  object GeometryCollection {
    
    @scala.inline
    def apply(geometries: js.Array[Geometry]): GeometryCollection = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[GeometryCollection]
    }
    
    @scala.inline
    implicit class GeometryCollectionMutableBuilder[Self <: GeometryCollection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGeometries(value: js.Array[Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeometriesVarargs(value: Geometry*): Self = StObject.set(x, "geometries", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type GeometryObject = Geometry
  
  trait LineString
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_LineString: typings.geojson.geojsonStrings.LineString
  }
  object LineString {
    
    @scala.inline
    def apply(coordinates: js.Array[Position]): LineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("LineString")
      __obj.asInstanceOf[LineString]
    }
    
    @scala.inline
    implicit class LineStringMutableBuilder[Self <: LineString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.LineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiLineString
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_MultiLineString: typings.geojson.geojsonStrings.MultiLineString
  }
  object MultiLineString {
    
    @scala.inline
    def apply(coordinates: js.Array[js.Array[Position]]): MultiLineString = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiLineString")
      __obj.asInstanceOf[MultiLineString]
    }
    
    @scala.inline
    implicit class MultiLineStringMutableBuilder[Self <: MultiLineString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.MultiLineString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPoint
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[Position]
    
    @JSName("type")
    var type_MultiPoint: typings.geojson.geojsonStrings.MultiPoint
  }
  object MultiPoint {
    
    @scala.inline
    def apply(coordinates: js.Array[Position]): MultiPoint = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPoint")
      __obj.asInstanceOf[MultiPoint]
    }
    
    @scala.inline
    implicit class MultiPointMutableBuilder[Self <: MultiPoint] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[Position]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Position*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.MultiPoint): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MultiPolygon
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[js.Array[Position]]]
    
    @JSName("type")
    var type_MultiPolygon: typings.geojson.geojsonStrings.MultiPolygon
  }
  object MultiPolygon {
    
    @scala.inline
    def apply(coordinates: js.Array[js.Array[js.Array[Position]]]): MultiPolygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("MultiPolygon")
      __obj.asInstanceOf[MultiPolygon]
    }
    
    @scala.inline
    implicit class MultiPolygonMutableBuilder[Self <: MultiPolygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[js.Array[js.Array[Position]]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: js.Array[js.Array[Position]]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.MultiPolygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Point
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: Position
    
    @JSName("type")
    var type_Point: typings.geojson.geojsonStrings.Point
  }
  object Point {
    
    @scala.inline
    def apply(coordinates: Position): Point = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Point]
    }
    
    @scala.inline
    implicit class PointMutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: Position): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Polygon
    extends StObject
       with GeoJsonObject
       with Geometry {
    
    var coordinates: js.Array[js.Array[Position]]
    
    @JSName("type")
    var type_Polygon: typings.geojson.geojsonStrings.Polygon
  }
  object Polygon {
    
    @scala.inline
    def apply(coordinates: js.Array[js.Array[Position]]): Polygon = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Polygon")
      __obj.asInstanceOf[Polygon]
    }
    
    @scala.inline
    implicit class PolygonMutableBuilder[Self <: Polygon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCoordinates(value: js.Array[js.Array[Position]]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordinatesVarargs(value: js.Array[Position]*): Self = StObject.set(x, "coordinates", js.Array(value :_*))
      
      @scala.inline
      def setType(value: typings.geojson.geojsonStrings.Polygon): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Position = js.Array[Double]
}
