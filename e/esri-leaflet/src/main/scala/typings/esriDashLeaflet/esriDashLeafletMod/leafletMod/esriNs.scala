package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod

import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.BasemapLayerOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Basemaps
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.CallbackHandler
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.DynamicMapLayerOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.FeatureCallbackHandler
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.FeatureLayerOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.FeatureLayerServiceOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.FindOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.GeoJSONGeometry
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Geometry
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeaturesOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.ImageServiceOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.LayerOptionsBase
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.LeafletGeometry
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.MapServiceOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.QueryOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.RasterLayerOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.ResponseCallbackHandler
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.ServiceOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.SpatialReference
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.SpatialReferenceExpression
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.StyleCallback
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.TaskOptions
import typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.TiledMapLayerOptions
import typings.esriDashLeaflet.esriDashLeafletStrings.client
import typings.esriDashLeaflet.esriDashLeafletStrings.server
import typings.geojson.geojsonMod.LineString
import typings.geojson.geojsonMod.MultiLineString
import typings.geojson.geojsonMod.Polygon
import typings.leaflet.leafletMod.Canvas
import typings.leaflet.leafletMod.Class
import typings.leaflet.leafletMod.Evented
import typings.leaflet.leafletMod.GeoJSON
import typings.leaflet.leafletMod.ImageOverlay
import typings.leaflet.leafletMod.ImageOverlayOptions
import typings.leaflet.leafletMod.LatLng
import typings.leaflet.leafletMod.LatLngBounds
import typings.leaflet.leafletMod.LatLngExpression
import typings.leaflet.leafletMod.Layer
import typings.leaflet.leafletMod.Map
import typings.leaflet.leafletMod.Marker
import typings.leaflet.leafletMod.PathOptions
import typings.leaflet.leafletMod.Point
import typings.leaflet.leafletMod.Polyline
import typings.leaflet.leafletMod.PopupOptions
import typings.leaflet.leafletMod.SVG
import typings.leaflet.leafletMod.TileLayer
import typings.leaflet.leafletMod.TileLayerOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri-leaflet/leaflet", "esri")
@js.native
object esriNs extends js.Object {
  /**
    * `L.esri.BasemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
    * The Terms of Use for Esri hosted services apply to all Leaflet applications.
    */
  @js.native
  class BasemapLayer protected () extends TileLayer {
    def this(key: Basemaps) = this()
    def this(key: Basemaps, options: BasemapLayerOptions) = this()
  }
  
  /**
    * Options for `L.esri.BasemapLayer`
    */
  trait BasemapLayerOptions extends TileLayerOptions {
    /**
      * 	Will use this token to authenticate all calls to the service.
      *
      */
    var token: js.UndefOr[String] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.esriDashLeaflet.esriDashLeafletStrings.Streets
    - typings.esriDashLeaflet.esriDashLeafletStrings.Topographic
    - typings.esriDashLeaflet.esriDashLeafletStrings.NationalGeographic
    - typings.esriDashLeaflet.esriDashLeafletStrings.Oceans
    - typings.esriDashLeaflet.esriDashLeafletStrings.Gray
    - typings.esriDashLeaflet.esriDashLeafletStrings.DarkGray
    - typings.esriDashLeaflet.esriDashLeafletStrings.Imagery
    - typings.esriDashLeaflet.esriDashLeafletStrings.ShadedRelief
    - typings.esriDashLeaflet.esriDashLeafletStrings.Terrain
    - typings.esriDashLeaflet.esriDashLeafletStrings.USATopo
    - typings.esriDashLeaflet.esriDashLeafletStrings.OceansLabels
    - typings.esriDashLeaflet.esriDashLeafletStrings.GrayLabels
    - typings.esriDashLeaflet.esriDashLeafletStrings.DarkGrayLabels
    - typings.esriDashLeaflet.esriDashLeafletStrings.ImageryLabels
    - typings.esriDashLeaflet.esriDashLeafletStrings.ImageryClarity
    - typings.esriDashLeaflet.esriDashLeafletStrings.ImageryTransportation
    - typings.esriDashLeaflet.esriDashLeafletStrings.ShadedReliefLabels
    - typings.esriDashLeaflet.esriDashLeafletStrings.TerrainLabels
  */
  trait Basemaps extends js.Object
  
  /**
    * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. `L.esri.DynamicMapLayer` also
    * supports custom popups and identification of features.
    *
    * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
    * and pass back the image which was generated on the fly. They also expose capabilities for querying and
    * identifying individual features.
    */
  @js.native
  class DynamicMapLayer protected ()
    extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.RasterLayer {
    def this(options: DynamicMapLayerOptions) = this()
    /**
      * Uses the provided function to create a popup that will identify features whenever the map is clicked.
      * Your function will be passed a GeoJSON FeatureCollection of the features at the clicked location and
      * should return the appropriate HTML. If you do not want to open the popup when there are no results,
      * return false.
      */
    def bindPopup(fn: FeatureCallbackHandler): this.type = js.native
    def bindPopup(fn: FeatureCallbackHandler, popupOptions: PopupOptions): this.type = js.native
    /**
      * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
      * will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def find(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Find = js.native
    /**
      * Returns a JSON object representing the modified layer symbology being requested from the map service.
      */
    def getDynamicLayers(): js.Any = js.native
    /**
      * Returns the current layer definition(s) being used for rendering.
      */
    def getLayerDefs(): js.Any = js.native
    /**
      * Returns the array of visible layers specified in the layer constructor.
      */
    def getLayers(): js.Array[_] = js.native
    /**
      * Returns the current time options being used for rendering.
      */
    def getTimeOptions(): js.Any = js.native
    /**
      * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
      * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def identify(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Query = js.native
    /**
      * Used to insert raw dynamicLayers JSON in situations where you'd like to modify layer symbology defined in
      * the service itself.
      */
    def setDynamicLayers(layers: js.Any): this.type = js.native
    /**
      * Redraws the layer with the new layer definitions. Corresponds to the layerDefs option on the export API.
      */
    def setLayerDefs(layerDefs: js.Any): this.type = js.native
    /**
      * Redraws the layer to show the passed array of layer ids.
      */
    def setLayers(layers: js.Array[_]): this.type = js.native
    /**
      * Sets the current time options being used to render the layer. Corresponds to the layerTimeOptions option
      * on the export API.
      */
    def setTimeOptions(timeOptions: js.Any): this.type = js.native
  }
  
  /**
    * Options for `L.esri.DynamicMapLayer`
    */
  trait DynamicMapLayerOptions
    extends RasterLayerOptions
       with LayerOptionsBase {
    /**
      * If enabled, appends a timestamp to each request to ensure a fresh image is created server-side.
      */
    var disableCache: js.UndefOr[Boolean] = js.undefined
    /**
      * JSON object literal used to manipulate the layer symbology defined in the service itself. Requires a 10.1
      * (or above) map service which supports dynamicLayers requests.
      */
    var dynamicLayers: js.UndefOr[js.Any] = js.undefined
    /**
      * Output format of the image.
      * @default 'png24'
      */
    var format: js.UndefOr[String] = js.undefined
    /**
      * 	SQL filters to define what features will be included in the image rendered by the service. An object is
      * 	used with keys that map each query to its respective layer.
      *
      * { 3: "STATE_NAME='Kansas'", 9: "POP2007>25000" }
      */
    var layerDefs: js.UndefOr[js.Any] = js.undefined
    /**
      * An array of Layer IDs like [3,4,5] to show from the service.
      */
    var layers: js.UndefOr[js.Array[_]] = js.undefined
    /**
      * Allow the server to produce transparent images.
      */
    var transparent: js.UndefOr[Boolean] = js.undefined
  }
  
  // TODO: VirtualGrid extends support
  /**
    * `L.esri.FeatureLayer` is used to visualize, style, query and edit vector geographic data hosted in both
    * ArcGIS Online and published using ArcGIS Server. Copyright text from the service is added to map attribution
    * automatically.
    *
    * Feature Layers reference an individual data source in either a parent Map Service or Feature Service that can
    * contain multiple layers. You can see a sample Map Service URL below:
    * http://sampleserver6.arcgisonline.com/arcgis/rest/services/Hurricanes/MapServer
    *
    * This particular service includes two different data sources. The URL for the 'Hurricane Tracks' feature layer
    * will end in a number (representing its position among the other layers).
    * http://sampleserver6.arcgisonline.com/arcgis/rest/services/Hurricanes/MapServer/1
    *
    * Feature Layer URLs always end in a number (ex: /FeatureServer/{LAYER_ID} or /MapServer/{LAYER_ID}).
    *
    * You can create a new empty feature service with a single layer on the ArcGIS for Developers website or you
    * can use ArcGIS Online to create a Feature Service from a CSV or Shapefile
    *
    * `L.esri.FeatureLayer` divides the current map extent into a grid of individual cells and uses them to fire
    * queries to fetch nearby features. This technique is comparable to `MODE_ONDEMAND` in the ArcGIS API for
    * JavaScript.
    */
  @js.native
  class FeatureLayer protected () extends Layer {
    def this(options: FeatureLayerOptions) = this()
    /**
      * Adds a new feature to the feature layer. this also adds the feature to the map if creation is successful.
      *
      * Requires authentication as a user who has permission to edit the service in ArcGIS Online or the user who
      * created the service.
      *
      * Requires the Create capability be enabled on the service. You can check if creation exists by checking
      * the metadata of your service under capabilities.
      */
    // TODO: GeoJSONFeature<GeoJSON.GeometryObject>
    def addFeature(feature: js.Any): this.type = js.native
    def addFeature(feature: js.Any, callback: ResponseCallbackHandler): this.type = js.native
    def addFeature(feature: js.Any, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Authenticates this service with a new token and runs any pending requests that required a token.
      */
    def authenticate(token: String): this.type = js.native
    /**
      * Remove the feature with the provided id from the feature layer. This will also remove the feature from
      * the map if it exists.
      *
      * Requires authentication as a user who has permission to edit the service in ArcGIS Online or the user who
      * created the service.
      *
      * Requires the Delete capability be enabled on the service. You can check if this operation exists by
      * checking the metadata of your service under capabilities.
      */
    def deleteFeature(id: String): this.type = js.native
    def deleteFeature(id: String, callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeature(id: String, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    def deleteFeature(id: Double): this.type = js.native
    def deleteFeature(id: Double, callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeature(id: Double, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Removes an array of features with the provided ids from the feature layer. This will also remove the
      * features from the map if they exist.
      *
      * Requires authentication as a user who has permission to edit the service in ArcGIS Online or the user who
      * created the service.
      *
      * Requires the Delete capability be enabled on the service. You can check if this operation exists by
      * checking the metadata of your service under capabilities.
      */
    def deleteFeatures(ids: js.Array[Double | String]): this.type = js.native
    def deleteFeatures(ids: js.Array[Double | String], callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeatures(ids: js.Array[Double | String], callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Calls the passed function against every feature that is currently being displayed.
      */
    def eachActiveFeature(fn: js.Function1[/* feature */ js.Any, Unit]): this.type = js.native
    def eachActiveFeature(fn: js.Function1[/* feature */ js.Any, Unit], context: js.Any): this.type = js.native
    /**
      * Calls the passed function against every feature. The function will be passed the layer that represents
      * the feature.
      *
      * featureLayer.eachFeature(function(layer){ console.log(layer.feature.properties.NAME); });
      */
    def eachFeature(fn: js.Function1[/* feature */ js.Any, Unit]): this.type = js.native
    def eachFeature(fn: js.Function1[/* feature */ js.Any, Unit], context: js.Any): this.type = js.native
    /**
      * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
      * will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def find(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Find = js.native
    /**
      * Given the id of a Feature return the layer on the map that represents it. This will usually be a Leaflet
      * vector layer like Polyline or Polygon, or a Leaflet Marker.
      */
    def getFeature(id: String): Layer = js.native
    def getFeature(id: Double): Layer = js.native
    /**
      * 	Returns the current time range as an array like [from, to]
      */
    def getTimeRange(): js.Array[Date] = js.native
    /**
      * Returns the current where setting
      */
    def getWhere(): String = js.native
    /**
      * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
      * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def identify(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures = js.native
    /**
      * Requests metadata about this Feature Layer. Callback will be called with error and metadata.
      */
    def metadata(callback: CallbackHandler): this.type = js.native
    def metadata(callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Query = js.native
    /**
      * Redraws a feature with the provided id from the feature layer.
      */
    def redraw(id: String): this.type = js.native
    def redraw(id: Double): this.type = js.native
    /**
      * Redraws all features from the feature layer that exist on the map.
      */
    def refresh(): this.type = js.native
    /**
      * 	Given the ID of a feature, reset that feature to the original style.
      */
    def resetStyle(): this.type = js.native
    def setFeatureStyle(id: String, style: StyleCallback): this.type = js.native
    /**
      * Changes the style on a specfic feature.
      */
    def setFeatureStyle(id: String, style: PathOptions): this.type = js.native
    def setFeatureStyle(id: Double, style: StyleCallback): this.type = js.native
    def setFeatureStyle(id: Double, style: PathOptions): this.type = js.native
    def setStyle(style: StyleCallback): this.type = js.native
    /**
      * Sets the given path options to each layer that has a setStyle method. Can also be a Function that will
      * receive a feature argument and should return Path Options
      *
      * `featureLayer.setStyle({ color: 'white' })`
      * `featureLayer.setStyle(function(feature){ return { weight: feature.properties.pixelWidth };})`
      */
    def setStyle(style: PathOptions): this.type = js.native
    /**
      * Sets the current time filter applied to features. An optional callback is run upon completion if
      * timeFilterMode is set to 'server'. Also accepts function context as the last argument.
      */
    def setTimeRange(from: Date, to: Date): this.type = js.native
    def setTimeRange(from: Date, to: Date, callback: FeatureCallbackHandler): this.type = js.native
    def setTimeRange(from: Date, to: Date, callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Sets the new where option and refreshes the layer to reflect the new where filter. Accepts an optional
      * callback and function context.
      */
    def setWhere(where: String): this.type = js.native
    def setWhere(where: String, callback: FeatureCallbackHandler): this.type = js.native
    def setWhere(where: String, callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Update the provided feature on the Feature Layer. This also updates the feature on the map.
      *
      * Requires authentication as a user who has permission to edit the service in ArcGIS Online or the user who
      * created the service.
      *
      * Requires the Update capability be enabled on the service. You can check if this operation exists by
      * checking the metadata of your service under capabilities.
      */
    // TODO: GeoJSONFeature<GeoJSON.GeometryObject>
    def updateFeature(feature: js.Any): this.type = js.native
    def updateFeature(feature: js.Any, callback: ResponseCallbackHandler): this.type = js.native
    def updateFeature(feature: js.Any, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
  }
  
  /**
    * Options for FeatureLayer
    */
  trait FeatureLayerOptions extends LayerOptionsBase {
    /**
      * Will remove layers from the internal cache when they are removed from the map.
      */
    var cacheLayers: js.UndefOr[Boolean] = js.undefined
    /**
      * 	An array of fieldnames to pull from the service. Includes all fields by default. You should always
      * 	specify the name of the unique id for the service. Usually either `FID` or `OBJECTID`.
      */
    var fields: js.UndefOr[js.Array[String]] = js.undefined
    /**
      * 	When paired with to defines the time range of features to display. Requires the Feature Layer to be time
      * 	enabled.
      */
    var from: js.UndefOr[Date] = js.undefined
    /**
      * When utilizing esri-leaflet-renderers '2.0.2' or above, this option makes it possible to override the
      * symbology defined by the service itself.
      */
    var ignoreRenderer: js.UndefOr[Boolean] = js.undefined
    /**
      * Set this to false if your own service supports GeoJSON as an output format but you'd like to ask for
      * Geoservices JSON instead.
      */
    var isModern: js.UndefOr[Boolean] = js.undefined
    /**
      * Closest zoom level the layer will be displayed on the map. example: maxZoom:19
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    /**
      * Furthest zoom level the layer will be displayed on the map. example: minZoom:3
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    /**
      * 	Provides an opportunity to introspect individual GeoJSON features in the layer.
      */
    var onEachFeature: js.UndefOr[js.Function2[/* feature */ js.Any, /* layer */ Layer, Unit]] = js.undefined
    /**
      * Function that will be used for creating layers for GeoJSON points. If the option is not specified, simple
      * markers will be created). For point layers, custom panes should be passed through pointToLayer (example here).
      */
    var pointToLayer: js.UndefOr[js.Function2[/* feature */ js.Any, /* latLng */ LatLngExpression, Unit]] = js.undefined
    /**
      * How many digits of precision to request from the server. Wikipedia has a great reference of digit
      * precision to meters.
      */
    var precision: js.UndefOr[Double] = js.undefined
    /**
      * The vector renderer to use to draw the service. Usually L.svg() is preferable but setting to `L.canvas()`
      * can have performance benefits for large polygon layers.
      */
    var renderer: js.UndefOr[SVG | Canvas] = js.undefined
    /**
      * 	How much to simplify polygons and polylines. A higher value gives better performance, a lower value
      * 	gives a more accurate representation.
      */
    var simplifyFactor: js.UndefOr[Double] = js.undefined
    /**
      * Function that will be used to get style options for vector layers created for GeoJSON features.
      */
    var style: js.UndefOr[js.Function2[/* feature */ js.Any, /* layer */ Layer, Unit]] = js.undefined
    /**
      * The name of the field to lookup the time of the feature. Can be an object like
      * {start:'startTime', end:'endTime'} or a string like 'created'.
      */
    var timeField: js.UndefOr[js.Any] = js.undefined
    /**
      * Determines where features are filtered by time. By default features will be filtered by the server. If
      * set to 'client' all features are requested and filtered by the app before display.
      */
    var timeFilterMode: js.UndefOr[server | client] = js.undefined
    /**
      * When paired with from defines the time range of features to display. Requires the Feature Layer to be
      * time enabled.
      */
    var to: js.UndefOr[Date] = js.undefined
    /**
      * An optional expression to filter features server side. String values should be denoted using single
      * quotes ie: where: "FIELDNAME = 'field value'"; More information about valid SQL syntax can be found here.
      */
    var where: js.UndefOr[String] = js.undefined
  }
  
  /**
    * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
    * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
    * features from the service.
    */
  @js.native
  class FeatureLayerService protected ()
    extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Service {
    def this(options: FeatureLayerServiceOptions) = this()
    /**
      * Adds a new feature to the feature layer. this also adds the feature to the map if creation is successful.
      *
      * Requires authentication as a user who has permission to edit the service in ArcGIS Online or the user
      * who created the service.
      *
      * Requires the Create capability be enabled on the service. You can check if creation exists by checking
      * the metadata of your service under capabilities.
      */
    // TODO: GeoJSONFeature<GeoJSON.GeometryObject>
    def addFeature(feature: js.Any): this.type = js.native
    def addFeature(feature: js.Any, callback: ResponseCallbackHandler): this.type = js.native
    def addFeature(feature: js.Any, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Remove the feature with the provided id from the feature layer. This will also remove the feature from
      * the map if it exists.
      *
      * Requires authentication as a user who has permission to edit the service in ArcGIS Online or the user who
      * created the service.
      *
      * Requires the Delete capability be enabled on the service. You can check if this operation exists by
      * checking the metadata of your service under capabilities.
      */
    def deleteFeature(id: String): this.type = js.native
    def deleteFeature(id: String, callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeature(id: String, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    def deleteFeature(id: Double): this.type = js.native
    def deleteFeature(id: Double, callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeature(id: Double, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Removes an array of features with the provided ids from the feature layer. This will also remove the
      * features from the map if they exist.
      *
      * Requires authentication as a user who has permission to edit the service in ArcGIS Online or the user who
      * created the service.
      *
      * Requires the Delete capability be enabled on the service. You can check if this operation exists by
      * checking the metadata of your service under capabilities.
      */
    def deleteFeatures(ids: js.Array[Double | String]): this.type = js.native
    def deleteFeatures(ids: js.Array[Double | String], callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeatures(ids: js.Array[Double | String], callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this layer.
      */
    def query(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Query = js.native
    /**
      * Update the provided feature on the Feature Layer. This also updates the feature on the map.
      *
      * Requires authentication as a user who has permission to edit the service in ArcGIS Online or the user who
      * created the service.
      *
      * Requires the Update capability be enabled on the service. You can check if this operation exists by
      * checking the metadata of your service under capabilities.
      */
    // TODO: GeoJSONFeature<GeoJSON.GeometryObject>
    def updateFeature(feature: js.Any): this.type = js.native
    def updateFeature(feature: js.Any, callback: ResponseCallbackHandler): this.type = js.native
    def updateFeature(feature: js.Any, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
  }
  
  /**
    * `L.esri.Find` is an abstraction for the find API included in Map Services. It provides a chainable API for
    * building request parameters and executing find tasks.
    */
  @js.native
  class Find protected ()
    extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Task {
    def this(options: FindOptions) = this()
    def this(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.MapService) = this()
    /**
      * When true find task will search for a value that contains the searchText. When false it will do an exact
      * match on the searchText string. Default is true.
      */
    def contains(contains: Boolean): this.type = js.native
    /**
      * Property used for adding new layers or modifying the data source of existing ones in the current map
      * service.
      */
    def dynamicLayers(dynamicLayers: js.Any): this.type = js.native
    /**
      * 	An array or comma-separated list of field names to search. If not specified, all fields are searched.
      */
    def fields(fields: String): this.type = js.native
    def fields(fields: js.Array[String]): this.type = js.native
    /**
      * 	Add a layer definition to the find task.
      */
    def layerDef(id: Double, where: String): this.type = js.native
    /**
      * 	Layers to perform find task on. Accepts an array of layer IDs or comma-separated list.
      */
    def layers(layers: String): this.type = js.native
    def layers(layers: js.Array[String]): this.type = js.native
    /**
      * Specifies the maximum allowable offset to be used for generalizing geometries returned by the find task.
      */
    def maxAllowableOffset(maxAllowableOffset: Double): this.type = js.native
    /**
      * Specifies the number of decimal places in returned geometries.
      */
    def precision(precision: Double): this.type = js.native
    /**
      * Return geometry with results. Default is true.
      */
    def returnGeometry(returnGeometry: Boolean): this.type = js.native
    /**
      * Includes M values if the features have them. Default value is false. This parameter only applies if
      * `returnGeometry=true`.
      */
    def returnM(returnM: Boolean): this.type = js.native
    /**
      * Include Z values in the results. Default value is true. This parameter only applies if
      * `returnGeometry=true`.
      */
    def returnZ(returnZ: Boolean): this.type = js.native
    /**
      * Executes the find request with the current parameters, features will be passed to callback as a GeoJSON
      * FeatureCollection. Accepts an optional function context.
      */
    def run(callback: FeatureCallbackHandler): this.type = js.native
    def run(callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Simplify the geometries of the output features for the current map view. the factor parameter controls
      * the amount of simplification between `0` (no simplification) and `1`
      * (simplify to the most basic shape possible).
      */
    def simplify(map: Map, factor: Double): this.type = js.native
    /**
      * 	The well known ID (ex. 4326) for the results.
      */
    def spatialReference(sr: Double): this.type = js.native
    /**
      * Text that is searched across the layers and fields the user specifies.
      */
    def text(text: String): this.type = js.native
  }
  
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  @js.native
  class IdentifyFeatures protected ()
    extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Task {
    def this(options: IdentifyFeaturesOptions) = this()
    def this(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.ImageService) = this()
    /**
      * Identifies features at a given LatLng geometry can also be an instance of `L.Marker`, `L.Polygon`,
      * `L.Polyline`, `L.LatLngBounds`, `L.GeoJSON` or a valid GeoJSON object literal.
      */
    def at(geometry: Geometry): this.type = js.native
    /**
      * Identifies features within a given time range.
      */
    def between(from: Date, to: Date): this.type = js.native
    /**
      * Add a layer definition to the query.
      */
    def layerDef(id: Double, where: String): this.type = js.native
    /**
      * By default, only the topmost feature will be identified, but it is possible to specify both an
      * alternative strategy and array of individual layers. See the REST API documentation for more information
      * about valid combinations.
      *
      * ex: `.layers('all:0')`.
      */
    def layers(layers: String): this.type = js.native
    def layers(layers: js.Array[String]): this.type = js.native
    /**
      * The map to identify features on.
      */
    def on(map: Map): this.type = js.native
    /**
      * Return only this many decimal points of precision in the output geometries.
      */
    def precision(precision: Double): this.type = js.native
    /**
      * Return geometry with results. Default is true.
      */
    def returnGeometry(returnGeometry: Boolean): this.type = js.native
    /**
      * Executes the identify request with the current parameters, identified features will be passed to callback
      * as a GeoJSON FeatureCollection. Accepts an optional function context
      */
    def run(callback: FeatureCallbackHandler): this.type = js.native
    def run(callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Simplify the geometries of the output features for the current map view. the factor parameter controls
      * the amount of simplification between `0` (no simplification) and `1` (the most basic shape possible).
      */
    def simplify(map: Map, factor: Double): this.type = js.native
    /**
      * Buffer the identify area by a given number of screen pixels.
      */
    def tolerance(precision: Double): this.type = js.native
  }
  
  /**
    * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
    * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
    * service.
    */
  @js.native
  class ImageService protected ()
    extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Service {
    def this(options: ImageServiceOptions) = this()
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Query = js.native
  }
  
  trait LayerOptionsBase extends js.Object {
    /**
      * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying requests.
      */
    var proxy: js.UndefOr[String] = js.undefined
    /**
      * Will use this token to authenticate all calls to the service.
      */
    var token: js.UndefOr[String] = js.undefined
    /**
      * URL of the Map Service
      */
    var url: String
    /**
      * Dictates if the service should use CORS when making GET requests.
      */
    var useCors: js.UndefOr[Boolean] = js.undefined
  }
  
  /**
    * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
    * Server that allows you to make requests to the API, as well as query and identify published features.
    */
  @js.native
  class MapService protected ()
    extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Service {
    def this(options: MapServiceOptions) = this()
    /**
      * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
      * will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def find(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Find = js.native
    /**
      * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
      * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def identify(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Query = js.native
  }
  
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
  @js.native
  class Query protected ()
    extends typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Task {
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
  
  /**
    * A generic class representing an image layer. This class can be extended to provide support for making export requests from ArcGIS REST services.
    */
  @js.native
  abstract class RasterLayer () extends ImageOverlay {
    /**
      * Authenticates this service with a new token and runs any pending requests that required a token.
      */
    def authenticate(token: String): this.type = js.native
    /**
      * 	Returns the current opacity of the layer.
      */
    def getOpacity(): Double = js.native
    /**
      * Returns the current time range being used for rendering. Array [from, to];
      */
    def getTimeRange(): js.Array[Date] = js.native
    /**
      * Requests metadata about this Feature Layer. Callback will be called with error and metadata.
      */
    def metadata(callback: CallbackHandler): this.type = js.native
    def metadata(callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Used to make a fresh request to the service and draw the response.
      */
    def redraw(): this.type = js.native
    /**
      * Redraws the layer with he passed time range.
      */
    def setTimeRange(from: Date, to: Date): this.type = js.native
  }
  
  /**
    * Options for RasterLayer
    */
  trait RasterLayerOptions extends ImageOverlayOptions {
    /**
      * Server response content type.
      * @default 'image'
      */
    var f: js.UndefOr[String] = js.undefined
    /**
      * 	Closest zoom level the layer will be displayed on the map.
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    /**
      * Furthest zoom level the layer will be displayed on the map.
      */
    var minZoom: js.UndefOr[Double] = js.undefined
    /**
      * Position of the layer relative to other overlays.
      * @default 'front'
      */
    var position: js.UndefOr[String] = js.undefined
  }
  
  /**
    * A generic class representing a hosted resource on ArcGIS Online or ArcGIS Server. This class can be extended
    * to provide support for making requests and serves as a standard for authentication and proxying.
    */
  @js.native
  abstract class Service () extends Evented {
    /**
      * Authenticates this service with a new token and runs any pending requests that required a token.
      */
    def authenticate(token: String): this.type = js.native
    /**
      * Makes a GET request to the service. The service's URL will be combined with the path option and
      * parameters will be serialized to a query string. Accepts an optional function context for the callback.
      */
    def get(url: String): this.type = js.native
    def get(url: String, params: js.Any): this.type = js.native
    def get(url: String, params: js.Any, callback: CallbackHandler): this.type = js.native
    def get(url: String, params: js.Any, callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Requests metadata about this Feature Layer. Callback will be called with error and metadata.
      */
    def metadata(callback: CallbackHandler): this.type = js.native
    def metadata(callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Makes a POST request to the service. The service's URL will be combined with the path option and
      * parameters will be serialized. Accepts an optional function context for the callback.
      */
    def post(url: String): this.type = js.native
    def post(url: String, params: js.Any): this.type = js.native
    def post(url: String, params: js.Any, callback: CallbackHandler): this.type = js.native
    def post(url: String, params: js.Any, callback: CallbackHandler, context: js.Any): this.type = js.native
  }
  
  /**
    * Options for `L.esri.Service`
    */
  trait ServiceOptions extends js.Object {
    /**
      * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying POST requests.
      */
    var proxy: js.UndefOr[String] = js.undefined
    /**
      * Operation timeout
      */
    var timeout: js.UndefOr[Double] = js.undefined
    /**
      * URL of the ArcGIS service you would like to consume.
      */
    var url: js.UndefOr[String] = js.undefined
    /**
      * If this service should use CORS when making GET requests.
      */
    var useCors: js.UndefOr[Boolean] = js.undefined
  }
  
  trait SpatialReference extends js.Object {
    var wkid: js.UndefOr[Double] = js.undefined
    var wkt: js.UndefOr[String] = js.undefined
  }
  
  /**
    * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
    * ArcGIS Server Services like query, find and identify.
    */
  @js.native
  class Task protected () extends Class {
    def this(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Service) = this()
    def this(options: TaskOptions) = this()
    def format(returnUnformattedValues: Boolean): this.type = js.native
    /**
      * Makes a request to the associated service. The service's URL will be combined with the path option and
      * parameters will be serialized. Accepts an optional function context for the callback.
      */
    def request(url: String): this.type = js.native
    def request(url: String, params: js.Any): this.type = js.native
    def request(url: String, params: js.Any, callback: js.Any): this.type = js.native
    def request(url: String, params: js.Any, callback: js.Any, context: js.Any): this.type = js.native
    /**
      * Adds a token to this request if the service requires authentication. Will be added automatically if used
      * with a service.
      */
    def token(token: String): this.type = js.native
  }
  
  /**
    * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
    * service is added to map attribution automatically.
    */
  @js.native
  class TiledMapLayer protected () extends TileLayer {
    def this(options: TiledMapLayerOptions) = this()
    /**
      * Authenticates this service with a new token and runs any pending requests that required a token
      */
    def authenticate(token: String): this.type = js.native
    /**
      * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
      * will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def find(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Find = js.native
    /**
      * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
      * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def identify(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures = js.native
    /**
      * Requests metadata about this Feature Layer. Callback will be called with error and metadata.
      */
    def metadata(callback: CallbackHandler): this.type = js.native
    def metadata(callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Query = js.native
  }
  
  /**
    * Options for `L.esri.TiledMapLayer`
    */
  trait TiledMapLayerOptions
    extends TileLayerOptions
       with LayerOptionsBase {
    /**
      * If correctZoomLevels is enabled this controls the amount of tolerance for the difference at each scale
      * level for remapping tile levels.
      *
      * Default 0.1
      */
    var zoomOffsetAllowance: js.UndefOr[Double] = js.undefined
  }
  
  /**
    * `L.esri.basemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
    * The Terms of Use for Esri hosted services apply to all Leaflet applications.
    */
  def basemapLayer(key: Basemaps): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.BasemapLayer = js.native
  def basemapLayer(key: Basemaps, options: BasemapLayerOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.BasemapLayer = js.native
  /**
    * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. L.esri.DynamicMapLayer also supports
    * custom popups and identification of features.
    *
    * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
    * and pass back the image which was generated on the fly. They also expose capabilities for querying and
    * identifying individual features.
    */
  def dynamicMapLayer(options: DynamicMapLayerOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.DynamicMapLayer = js.native
  /**
    * `L.esri.FeatureLayer` is used to visualize, style, query and edit vector geographic data hosted in both
    * ArcGIS Online and published using ArcGIS Server. Copyright text from the service is added to map attribution
    * automatically.
    *
    * Feature Layers reference an individual data source in either a parent Map Service or Feature Service that can
    * contain multiple layers. You can see a sample Map Service URL below:
    * http://sampleserver6.arcgisonline.com/arcgis/rest/services/Hurricanes/MapServer
    *
    * This particular service includes two different data sources. The URL for the 'Hurricane Tracks' feature layer
    * will end in a number (representing its position among the other layers).
    * http://sampleserver6.arcgisonline.com/arcgis/rest/services/Hurricanes/MapServer/1
    *
    * Feature Layer URLs always end in a number (ex: /FeatureServer/{LAYER_ID} or /MapServer/{LAYER_ID}).
    *
    * You can create a new empty feature service with a single layer on the ArcGIS for Developers website or you
    * can use ArcGIS Online to create a Feature Service from a CSV or Shapefile
    *
    * L.esri.FeatureLayer divides the current map extent into a grid of individual cells and uses them to fire
    * queries to fetch nearby features. This technique is comparable to MODE_ONDEMAND in the ArcGIS API for
    * JavaScript.
    */
  def featureLayer(options: FeatureLayerOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.FeatureLayer = js.native
  /**
    * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
    * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
    * features from the service.
    */
  def featureLayerService(options: FeatureLayerServiceOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.FeatureLayerService = js.native
  /**
    * L.esri.Find is an abstraction for the find API included in Map Services. It provides a chainable API for
    * building request parameters and executing find tasks.
    */
  def find(options: FindOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Find = js.native
  def find(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.MapService): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Find = js.native
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  def identifyFeatures(options: IdentifyFeaturesOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures = js.native
  def identifyFeatures(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.ImageService): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures = js.native
  /**
    * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
    * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
    * service.
    */
  def imageService(options: ImageServiceOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.ImageService = js.native
  /**
    * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
    * Server that allows you to make requests to the API, as well as query and identify published features.
    */
  def mapService(options: MapServiceOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.MapService = js.native
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
  def query(options: QueryOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Query = js.native
  def task(options: typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Service): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Task = js.native
  /**
    * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
    * ArcGIS Server Services like query, find and identify.
    */
  def task(options: TaskOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.Task = js.native
  /**
    * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
    * service is added to map attribution automatically.
    */
  def tiledMapLayer(options: TiledMapLayerOptions): typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esriNs.TiledMapLayer = js.native
  type CallbackHandler = js.Function2[/* error */ js.Any, /* metadata */ js.Any, Unit]
  type FeatureCallbackHandler = js.Function3[
    /* error */ js.UndefOr[js.Any], 
    /* featureCollection */ js.UndefOr[js.Any], 
    /* response */ js.UndefOr[js.Any], 
    Unit
  ]
  /**
    * Options for FeatureLayerService
    */
  type FeatureLayerServiceOptions = ServiceOptions
  /**
    * Options for Find Task
    */
  type FindOptions = ServiceOptions
  type GeoJSONGeometry = typings.geojson.geojsonMod.Point | Polygon | LineString
  type Geometry = LeafletGeometry | GeoJSONGeometry
  /**
    * Options for IdentifyFeatures
    */
  type IdentifyFeaturesOptions = ServiceOptions
  /**
    * Options for ImageService
    */
  type ImageServiceOptions = ServiceOptions
  type LeafletGeometry = Marker[js.Any] | typings.leaflet.leafletMod.Polygon[js.Any] | (Polyline[LineString | MultiLineString, js.Any]) | LatLngExpression | LatLngBounds | GeoJSON[js.Any]
  /**
    * Options for MapService
    */
  type MapServiceOptions = ServiceOptions
  /**
    * Options for Query
    */
  type QueryOptions = TaskOptions
  type ResponseCallbackHandler = js.Function2[/* error */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], Unit]
  type SpatialReferenceExpression = Double | SpatialReference
  type StyleCallback = js.Function1[/* feature */ js.Any, js.Any]
  /**
    * Options for Task
    */
  type TaskOptions = ServiceOptions
}

