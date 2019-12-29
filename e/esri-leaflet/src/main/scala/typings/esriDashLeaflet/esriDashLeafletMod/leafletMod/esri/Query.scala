package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.Map
import typings.leaflet.leafletMod.Point
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
  * a chainable API for building request parameters and executing queries.
  *
  * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
  * version of ArcGIS Server that hosts the service some of these options may not be available.
  */
@JSImport("leaflet", "esri.Query")
@js.native
class Query protected () extends Task {
  def this(options: QueryOptions) = this()
  /**
    * Queries features from the service that have a bounding box that intersects the bounding box of the passed
    * geometry object. geometry can be an instance of `L.Marker`, `L.Polygon`, `L.Polyline`, `L.LatLng`,
    * `L.LatLngBounds` and `L.GeoJSON`. It can also accept valid GeoJSON Point, Polyline, Polygon objects and
    * GeoJSON Feature objects containing Point, Polyline, Polygon.
    */
  def bboxIntersects(geometry: Geometry): this.type = js.native
  /**
    * Queries features within a given time range. Only available for Layers/Services with timeInfo in their
    * metadata.
    */
  def between(from: Date, to: Date): this.type = js.native
  /**
    * Executes the query request with the current parameters, passing only the LatLngBounds of all features
    * matching the query in the callback. Accepts an optional function context. Only available for Feature
    * Layers hosted on ArcGIS Online or ArcGIS Server 10.3.1.
    */
  def bounds(callback: FeatureCallbackHandler): this.type = js.native
  def bounds(callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
  /**
    * Queries features from the service that fully contain the passed geometry object. geometry can be an
    * instance of `L.Marker`, `L.Polygon`, `L.Polyline`, `L.LatLng`, `L.LatLngBounds` and `L.GeoJSON`. It can
    * also accept valid GeoJSON Point, Polyline, Polygon objects and GeoJSON Feature objects containing Point,
    * Polyline, Polygon.
    */
  def contains(geometry: Geometry): this.type = js.native
  /**
    * Executes the query request with the current parameters, passing only the number of features matching the
    * query to callback as an Integer. Accepts an optional function context.
    */
  def count(callback: FeatureCallbackHandler): this.type = js.native
  def count(callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
  /**
    * Return only specific feature IDs if they match other query parameters.
    */
  def featureIds(ids: js.Array[_]): this.type = js.native
  /**
    * An array of associated fields to request for each feature.
    */
  def fields(fields: String): this.type = js.native
  def fields(fields: js.Array[String]): this.type = js.native
  /**
    * Executes the query request with the current parameters, passing only an array of the feature ids matching
    * the query to callbackcallback. Accepts an optional function context.
    */
  def ids(callback: FeatureCallbackHandler): this.type = js.native
  def ids(callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
  /**
    * Queries features from the service that intersect (touch anywhere) the passed geometry object. geometry
    * can be an instance of `L.Marker`, `L.Polygon`, `L.Polyline`, `L.LatLng`, `L.LatLngBounds` and
    * `L.GeoJSON`. It can also accept valid GeoJSON Point, Polyline, Polygon objects and GeoJSON Feature
    * objects containing Point, Polyline, Polygon.
    */
  def intersects(geometry: Geometry): this.type = js.native
  def layer(layer: String): this.type = js.native
  /**
    * Used to select which layer inside a Map Service to perform the query on.
    *
    * Only available for Map Services.
    */
  def layer(layer: Double): this.type = js.native
  /**
    * Limit the number of results returned by this query, when combined with offset can be used for paging.
    *
    * Only available for Feature Layers hosted on ArcGIS Online or ArcGIS Server 10.3.
    */
  def limit(limit: Double): this.type = js.native
  /**
    * Queries features a given distance in meters around a LatLng.
    *
    * Only available for Feature Layers hosted on ArcGIS Online or ArcGIS Server 10.3 that include the
    * capability supportQueryWithDistance.
    */
  def nearby(latlng: LatLng, distance: Double): this.type = js.native
  /**
    * Define the offset of the results, when combined with limit can be used for paging.
    *
    * Only available for Feature Layers hosted on ArcGIS Online or ArcGIS Server 10.3.
    */
  def offset(offset: Double): this.type = js.native
  /**
    * Sort output features using values from an individual field. "ASC" (ascending) is the default sort order,
    * but "DESC" can be passed as an alternative. This method can be called more than once to apply advanced
    * sorting.
    */
  def orderBy(fieldName: String, order: String): this.type = js.native
  /**
    * Queries features from the service that overlap (touch but are not fully contained by) the passed geometry
    * object. geometry can be an instance of `L.Marker`, `L.Polygon`, `L.Polyline`, `L.LatLng`,
    * `L.LatLngBounds` and `L.GeoJSON`. It can also accept valid GeoJSON Point, Polyline, Polygon objects and
    * GeoJSON Feature objects containing Point, Polyline, Polygon.
    */
  def overlap(geometry: Geometry): this.type = js.native
  /**
    * Override the default pixelSize when querying an Image Service.
    *
    * Only available for Image Services.
    */
  def pixelSize(point: Point): this.type = js.native
  /**
    * Return only this many decimal points of precision in the output geometries.
    */
  def precision(precision: Double): this.type = js.native
  /**
    * Return geometry with results. Default is true.
    */
  def returnGeometry(returnGeometry: Boolean): this.type = js.native
  /**
    * Executes the query request with the current parameters, features will be passed to callback as a GeoJSON
    * FeatureCollection. Accepts an optional function context.
    */
  def run(callback: FeatureCallbackHandler): this.type = js.native
  def run(callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
  /**
    * Simplify the geometries of the output features for the current map view. the factor parameter controls
    * the amount of simplification between 0 (no simplification) and 1 (the most basic shape possible).
    */
  def simplify(map: Map, factor: Double): this.type = js.native
  /**
    * The WKID of a datum transformation for the server to apply when reprojecting output features.
    */
  def transform(datumTranformation: SpatialReferenceExpression): this.type = js.native
  /**
    * Adds a where clause to the query. String values should be denoted using single quotes ie:
    *
    * `query.where("FIELDNAME = 'field value'");`
    *
    * More info about valid SQL can be found here.
    */
  def where(where: String): this.type = js.native
  /**
    * Queries features from the service within (fully contained by) the passed geometry object. geometry can be
    * an instance of `L.Marker`, `L.Polygon`, `L.Polyline`, `L.LatLng`, `L.LatLngBounds` and `L.GeoJSON`. It
    * can also accept valid GeoJSON Point, Polyline, Polygon objects and GeoJSON Feature objects containing
    * Point, Polyline, Polygon.
    */
  def within(geometry: Geometry): this.type = js.native
}

@JSImport("leaflet", "esri.query")
@js.native
object query extends js.Object {
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
  def apply(options: QueryOptions): Query = js.native
}

