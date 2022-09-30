package typings.geojsonVt

import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeoJsonGeometryTypes
import typings.geojsonVt.geojsonVtBooleans.`false`
import typings.geojsonVt.geojsonVtInts.`0`
import typings.geojsonVt.geojsonVtInts.`1`
import typings.geojsonVt.geojsonVtInts.`2`
import typings.geojsonVt.geojsonVtStrings.GeometryCollection
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(data: Data, options: Options): GeoJSONVT = (^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[GeoJSONVT]
  
  @JSImport("geojson-vt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait FeatureTypes extends StObject
  @JSImport("geojson-vt", "FeatureTypes")
  @js.native
  object FeatureTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FeatureTypes & Double] = js.native
    
    @js.native
    sealed trait Linestring
      extends StObject
         with FeatureTypes
    /* 1 */ val Linestring: typings.geojsonVt.mod.FeatureTypes.Linestring & Double = js.native
    
    @js.native
    sealed trait Point
      extends StObject
         with FeatureTypes
    /* 0 */ val Point: typings.geojsonVt.mod.FeatureTypes.Point & Double = js.native
    
    @js.native
    sealed trait Polygon
      extends StObject
         with FeatureTypes
    /* 2 */ val Polygon: typings.geojsonVt.mod.FeatureTypes.Polygon & Double = js.native
    
    @js.native
    sealed trait Unknown
      extends StObject
         with FeatureTypes
    /* 0 */ val Unknown: typings.geojsonVt.mod.FeatureTypes.Unknown & Double = js.native
  }
  
  type Data = GeoJSON
  
  /**
    * https://github.com/mapbox/vector-tile-spec/tree/master/2.1#42-features
    */
  trait Feature extends StObject {
    
    /**
      * A feature MUST contain a geometry field.
      */
    var geometry: js.Array[Geometry]
    
    /**
      * A feature MAY contain an id field. If a feature has an id field, the value of the id SHOULD be unique among the features of the parent layer.
      */
    var id: js.UndefOr[/* template literal string: ${number} */ String] = js.undefined
    
    /**
      * A feature MAY contain a tags field. Feature-level metadata, if any, SHOULD be stored in the tags field.
      */
    var tags: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * A feature MUST contain a type field as described in the Geometry Types section.
      */
    var `type`: FeatureTypes
  }
  object Feature {
    
    inline def apply(geometry: js.Array[Geometry], `type`: FeatureTypes): Feature = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feature]
    }
    
    extension [Self <: Feature](x: Self) {
      
      inline def setGeometry(value: js.Array[Geometry]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryVarargs(value: Geometry*): Self = StObject.set(x, "geometry", js.Array(value*))
      
      inline def setId(value: /* template literal string: ${number} */ String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setTags(value: Record[String, Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: FeatureTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Features = js.Array[Feature]
  
  @js.native
  trait GeoJSONVT extends StObject {
    
    def getTile(z: String, x: String, y: String): Null | Tile = js.native
    def getTile(z: String, x: String, y: Double): Null | Tile = js.native
    def getTile(z: String, x: Double, y: String): Null | Tile = js.native
    def getTile(z: String, x: Double, y: Double): Null | Tile = js.native
    def getTile(z: Double, x: String, y: String): Null | Tile = js.native
    def getTile(z: Double, x: String, y: Double): Null | Tile = js.native
    def getTile(z: Double, x: Double, y: String): Null | Tile = js.native
    /**
      * gets a tile based on coordinates
      * @param z z / zoom coordinate (supports both number or string input)
      * @param x x coordinate (supports both number or string input)
      * @param y y coordinate (supports both number or string input)
      */
    def getTile(z: Double, x: Double, y: Double): Null | Tile = js.native
    
    var options: Options = js.native
    
    /**
      * splits features from a parent tile to sub-tiles.
      * @param features
      * @param z z / zoom coordinate of the parent tile
      * @param x x coordinate of the parent tile
      * @param y y coordinate of the parent tile
      * @param cz z / zoom coordinate of the target tile
      * @param cx x coordinate of the target tile
      * @param cy y coordinate of the target tile
      */
    def splitTile(features: Tile, z: Double, x: Double, y: Double, cz: Double, cx: Double, cy: Double): Unit = js.native
    
    var stats: Record[/* template literal string: z${number} */ String, Double] = js.native
    
    var tileCoords: TileCoords = js.native
    
    /**
      * Resulting tiles conform to the JSON equivalent of the vector tile specification.
      * https://github.com/mapbox/vector-tile-spec/
      */
    var tiles: Record[/* template literal string: ${number} */ String, Tile] = js.native
    
    var total: Double = js.native
  }
  
  type Geometry = js.Tuple2[Double, Double]
  
  trait Options extends StObject {
    
    /** tile buffer on each side */
    var buffer: js.UndefOr[Double] = js.undefined
    
    /** logging level (0 to disable, 1 or 2) */
    var debug: js.UndefOr[`0` | `1` | `2`] = js.undefined
    
    /** tile extent (both width and height) */
    var extent: js.UndefOr[Double] = js.undefined
    
    /** whether to generate feature ids. Cannot be used with `promoteId` */
    var generateId: js.UndefOr[`false`] = js.undefined
    
    /** max number of points per tile in the index */
    var indexMaxPoints: js.UndefOr[Double] = js.undefined
    
    /** max zoom in the initial tile index */
    var indexMaxZoom: js.UndefOr[Double] = js.undefined
    
    /** whether to enable line metrics tracking for LineString/MultiLineString features */
    var lineMetrics: js.UndefOr[`false`] = js.undefined
    
    /** max zoom to preserve detail on; can't be higher than 24 */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /** name of a feature property to promote to feature.id. Cannot be used with `generateId` */
    var promoteId: js.UndefOr[Null | String] = js.undefined
    
    /** simplification tolerance (higher means simpler) */
    var tolerance: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      inline def setDebug(value: `0` | `1` | `2`): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setExtent(value: Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      inline def setGenerateId(value: `false`): Self = StObject.set(x, "generateId", value.asInstanceOf[js.Any])
      
      inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      inline def setIndexMaxPoints(value: Double): Self = StObject.set(x, "indexMaxPoints", value.asInstanceOf[js.Any])
      
      inline def setIndexMaxPointsUndefined: Self = StObject.set(x, "indexMaxPoints", js.undefined)
      
      inline def setIndexMaxZoom(value: Double): Self = StObject.set(x, "indexMaxZoom", value.asInstanceOf[js.Any])
      
      inline def setIndexMaxZoomUndefined: Self = StObject.set(x, "indexMaxZoom", js.undefined)
      
      inline def setLineMetrics(value: `false`): Self = StObject.set(x, "lineMetrics", value.asInstanceOf[js.Any])
      
      inline def setLineMetricsUndefined: Self = StObject.set(x, "lineMetrics", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setPromoteId(value: String): Self = StObject.set(x, "promoteId", value.asInstanceOf[js.Any])
      
      inline def setPromoteIdNull: Self = StObject.set(x, "promoteId", null)
      
      inline def setPromoteIdUndefined: Self = StObject.set(x, "promoteId", js.undefined)
      
      inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  trait Source extends StObject {
    
    var geometry: js.Array[js.Array[Double]]
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
    
    var tags: js.UndefOr[Record[String, Any]] = js.undefined
    
    var `type`: js.UndefOr[Exclude[GeoJsonGeometryTypes, GeometryCollection]] = js.undefined
  }
  object Source {
    
    inline def apply(geometry: js.Array[js.Array[Double]], maxX: Double, maxY: Double, minX: Double, minY: Double): Source = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setGeometry(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
      
      inline def setGeometryVarargs(value: js.Array[Double]*): Self = StObject.set(x, "geometry", js.Array(value*))
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setTags(value: Record[String, Any]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setType(value: Exclude[GeoJsonGeometryTypes, GeometryCollection]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /**
    * Resulting tiles conform to the JSON equivalent of the vector tile specification.
    * https://github.com/mapbox/vector-tile-spec/
    */
  trait Tile extends StObject {
    
    var features: Features
    
    var maxX: Double
    
    var maxY: Double
    
    var minX: Double
    
    var minY: Double
    
    var numFeatures: Double
    
    var numPoints: Double
    
    var numSimplified: Double
    
    var source: Source | Null
    
    // z2: number -- In the development/demo distribution this is z2, but in source code it is z?;
    var transformed: Boolean
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object Tile {
    
    inline def apply(
      features: Features,
      maxX: Double,
      maxY: Double,
      minX: Double,
      minY: Double,
      numFeatures: Double,
      numPoints: Double,
      numSimplified: Double,
      transformed: Boolean,
      x: Double,
      y: Double,
      z: Double
    ): Tile = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], maxX = maxX.asInstanceOf[js.Any], maxY = maxY.asInstanceOf[js.Any], minX = minX.asInstanceOf[js.Any], minY = minY.asInstanceOf[js.Any], numFeatures = numFeatures.asInstanceOf[js.Any], numPoints = numPoints.asInstanceOf[js.Any], numSimplified = numSimplified.asInstanceOf[js.Any], transformed = transformed.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any], source = null)
      __obj.asInstanceOf[Tile]
    }
    
    extension [Self <: Tile](x: Self) {
      
      inline def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: Feature*): Self = StObject.set(x, "features", js.Array(value*))
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setNumFeatures(value: Double): Self = StObject.set(x, "numFeatures", value.asInstanceOf[js.Any])
      
      inline def setNumPoints(value: Double): Self = StObject.set(x, "numPoints", value.asInstanceOf[js.Any])
      
      inline def setNumSimplified(value: Double): Self = StObject.set(x, "numSimplified", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Source): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setTransformed(value: Boolean): Self = StObject.set(x, "transformed", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  trait TileCoord extends StObject {
    
    var x: Double
    
    var y: Double
    
    var z: Double
  }
  object TileCoord {
    
    inline def apply(x: Double, y: Double, z: Double): TileCoord = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
      __obj.asInstanceOf[TileCoord]
    }
    
    extension [Self <: TileCoord](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    }
  }
  
  type TileCoords = js.Array[TileCoord]
}
