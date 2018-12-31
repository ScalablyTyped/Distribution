package typings
package esriDashLeafletLib.esriDashLeafletMod.leafletMod

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
  class BasemapLayer protected ()
    extends leafletLib.leafletMod.TileLayer {
    def this(key: Basemaps) = this()
    def this(key: Basemaps, options: BasemapLayerOptions) = this()
  }
  
  /**
    * Options for `L.esri.BasemapLayer`
    */
  trait BasemapLayerOptions
    extends leafletLib.leafletMod.TileLayerOptions {
    /**
      * 	Will use this token to authenticate all calls to the service.
      *
      */
    var token: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. `L.esri.DynamicMapLayer` also
    * supports custom popups and identification of features.
    *
    * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
    * and pass back the image which was generated on the fly. They also expose capabilities for querying and
    * identifying individual features.
    */
  @js.native
  class DynamicMapLayer protected () extends RasterLayer {
    def this(options: DynamicMapLayerOptions) = this()
    /**
      * Uses the provided function to create a popup that will identify features whenever the map is clicked.
      * Your function will be passed a GeoJSON FeatureCollection of the features at the clicked location and
      * should return the appropriate HTML. If you do not want to open the popup when there are no results,
      * return false.
      */
    def bindPopup(fn: FeatureCallbackHandler): this.type = js.native
    def bindPopup(fn: FeatureCallbackHandler, popupOptions: leafletLib.leafletMod.PopupOptions): this.type = js.native
    /**
      * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
      * will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def find(): Find = js.native
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
    def identify(): IdentifyFeatures = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): Query = js.native
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
    var disableCache: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * JSON object literal used to manipulate the layer symbology defined in the service itself. Requires a 10.1
      * (or above) map service which supports dynamicLayers requests.
      */
    var dynamicLayers: js.UndefOr[js.Any] = js.undefined
    /**
      * Output format of the image.
      * @default 'png24'
      */
    var format: js.UndefOr[java.lang.String] = js.undefined
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
    var transparent: js.UndefOr[scala.Boolean] = js.undefined
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
  class FeatureLayer protected ()
    extends leafletLib.leafletMod.Layer {
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
    def authenticate(token: java.lang.String): this.type = js.native
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
    def deleteFeature(id: java.lang.String): this.type = js.native
    def deleteFeature(id: java.lang.String, callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeature(id: java.lang.String, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    def deleteFeature(id: scala.Double): this.type = js.native
    def deleteFeature(id: scala.Double, callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeature(id: scala.Double, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
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
    def deleteFeatures(ids: js.Array[scala.Double | java.lang.String]): this.type = js.native
    def deleteFeatures(ids: js.Array[scala.Double | java.lang.String], callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeatures(ids: js.Array[scala.Double | java.lang.String], callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Calls the passed function against every feature that is currently being displayed.
      */
    def eachActiveFeature(fn: js.Function1[/* feature */ js.Any, scala.Unit]): this.type = js.native
    def eachActiveFeature(fn: js.Function1[/* feature */ js.Any, scala.Unit], context: js.Any): this.type = js.native
    /**
      * Calls the passed function against every feature. The function will be passed the layer that represents
      * the feature.
      *
      * featureLayer.eachFeature(function(layer){ console.log(layer.feature.properties.NAME); });
      */
    def eachFeature(fn: js.Function1[/* feature */ js.Any, scala.Unit]): this.type = js.native
    def eachFeature(fn: js.Function1[/* feature */ js.Any, scala.Unit], context: js.Any): this.type = js.native
    /**
      * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
      * will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def find(): Find = js.native
    /**
      * Given the id of a Feature return the layer on the map that represents it. This will usually be a Leaflet
      * vector layer like Polyline or Polygon, or a Leaflet Marker.
      */
    def getFeature(id: java.lang.String): leafletLib.leafletMod.Layer = js.native
    def getFeature(id: scala.Double): leafletLib.leafletMod.Layer = js.native
    /**
      * 	Returns the current time range as an array like [from, to]
      */
    def getTimeRange(): js.Array[stdLib.Date] = js.native
    /**
      * Returns the current where setting
      */
    def getWhere(): java.lang.String = js.native
    /**
      * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
      * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def identify(): IdentifyFeatures = js.native
    /**
      * Requests metadata about this Feature Layer. Callback will be called with error and metadata.
      */
    def metadata(callback: CallbackHandler): this.type = js.native
    def metadata(callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): Query = js.native
    /**
      * Redraws a feature with the provided id from the feature layer.
      */
    def redraw(id: java.lang.String): this.type = js.native
    def redraw(id: scala.Double): this.type = js.native
    /**
      * Redraws all features from the feature layer that exist on the map.
      */
    def refresh(): this.type = js.native
    /**
      * 	Given the ID of a feature, reset that feature to the original style.
      */
    def resetStyle(): this.type = js.native
    def setFeatureStyle(id: java.lang.String, style: StyleCallback): this.type = js.native
    /**
      * Changes the style on a specfic feature.
      */
    def setFeatureStyle(id: java.lang.String, style: leafletLib.leafletMod.PathOptions): this.type = js.native
    def setFeatureStyle(id: scala.Double, style: StyleCallback): this.type = js.native
    def setFeatureStyle(id: scala.Double, style: leafletLib.leafletMod.PathOptions): this.type = js.native
    def setStyle(style: StyleCallback): this.type = js.native
    /**
      * Sets the given path options to each layer that has a setStyle method. Can also be a Function that will
      * receive a feature argument and should return Path Options
      *
      * `featureLayer.setStyle({ color: 'white' })`
      * `featureLayer.setStyle(function(feature){ return { weight: feature.properties.pixelWidth };})`
      */
    def setStyle(style: leafletLib.leafletMod.PathOptions): this.type = js.native
    /**
      * Sets the current time filter applied to features. An optional callback is run upon completion if
      * timeFilterMode is set to 'server'. Also accepts function context as the last argument.
      */
    def setTimeRange(from: stdLib.Date, to: stdLib.Date): this.type = js.native
    def setTimeRange(from: stdLib.Date, to: stdLib.Date, callback: FeatureCallbackHandler): this.type = js.native
    def setTimeRange(from: stdLib.Date, to: stdLib.Date, callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Sets the new where option and refreshes the layer to reflect the new where filter. Accepts an optional
      * callback and function context.
      */
    def setWhere(where: java.lang.String): this.type = js.native
    def setWhere(where: java.lang.String, callback: FeatureCallbackHandler): this.type = js.native
    def setWhere(where: java.lang.String, callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
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
    var cacheLayers: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * 	An array of fieldnames to pull from the service. Includes all fields by default. You should always
      * 	specify the name of the unique id for the service. Usually either `FID` or `OBJECTID`.
      */
    var fields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * 	When paired with to defines the time range of features to display. Requires the Feature Layer to be time
      * 	enabled.
      */
    var from: js.UndefOr[stdLib.Date] = js.undefined
    /**
      * When utilizing esri-leaflet-renderers '2.0.2' or above, this option makes it possible to override the
      * symbology defined by the service itself.
      */
    var ignoreRenderer: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Set this to false if your own service supports GeoJSON as an output format but you'd like to ask for
      * Geoservices JSON instead.
      */
    var isModern: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Closest zoom level the layer will be displayed on the map. example: maxZoom:19
      */
    var maxZoom: js.UndefOr[scala.Double] = js.undefined
    /**
      * Furthest zoom level the layer will be displayed on the map. example: minZoom:3
      */
    var minZoom: js.UndefOr[scala.Double] = js.undefined
    /**
      * 	Provides an opportunity to introspect individual GeoJSON features in the layer.
      */
    var onEachFeature: js.UndefOr[
        js.Function2[/* feature */ js.Any, /* layer */ leafletLib.leafletMod.Layer, scala.Unit]
      ] = js.undefined
    /**
      * Function that will be used for creating layers for GeoJSON points. If the option is not specified, simple
      * markers will be created). For point layers, custom panes should be passed through pointToLayer (example here).
      */
    var pointToLayer: js.UndefOr[
        js.Function2[
          /* feature */ js.Any, 
          /* latLng */ leafletLib.leafletMod.LatLngExpression, 
          scala.Unit
        ]
      ] = js.undefined
    /**
      * How many digits of precision to request from the server. Wikipedia has a great reference of digit
      * precision to meters.
      */
    var precision: js.UndefOr[scala.Double] = js.undefined
    /**
      * The vector renderer to use to draw the service. Usually L.svg() is preferable but setting to `L.canvas()`
      * can have performance benefits for large polygon layers.
      */
    var renderer: js.UndefOr[leafletLib.leafletMod.SVG | leafletLib.leafletMod.Canvas] = js.undefined
    /**
      * 	How much to simplify polygons and polylines. A higher value gives better performance, a lower value
      * 	gives a more accurate representation.
      */
    var simplifyFactor: js.UndefOr[scala.Double] = js.undefined
    /**
      * Function that will be used to get style options for vector layers created for GeoJSON features.
      */
    var style: js.UndefOr[
        js.Function2[/* feature */ js.Any, /* layer */ leafletLib.leafletMod.Layer, scala.Unit]
      ] = js.undefined
    /**
      * The name of the field to lookup the time of the feature. Can be an object like
      * {start:'startTime', end:'endTime'} or a string like 'created'.
      */
    var timeField: js.UndefOr[js.Any] = js.undefined
    /**
      * Determines where features are filtered by time. By default features will be filtered by the server. If
      * set to 'client' all features are requested and filtered by the app before display.
      */
    var timeFilterMode: js.UndefOr[
        esriDashLeafletLib.esriDashLeafletLibStrings.server | esriDashLeafletLib.esriDashLeafletLibStrings.client
      ] = js.undefined
    /**
      * When paired with from defines the time range of features to display. Requires the Feature Layer to be
      * time enabled.
      */
    var to: js.UndefOr[stdLib.Date] = js.undefined
    /**
      * An optional expression to filter features server side. String values should be denoted using single
      * quotes ie: where: "FIELDNAME = 'field value'"; More information about valid SQL syntax can be found here.
      */
    var where: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
    * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
    * features from the service.
    */
  @js.native
  class FeatureLayerService protected () extends Service {
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
    def deleteFeature(id: java.lang.String): this.type = js.native
    def deleteFeature(id: java.lang.String, callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeature(id: java.lang.String, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    def deleteFeature(id: scala.Double): this.type = js.native
    def deleteFeature(id: scala.Double, callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeature(id: scala.Double, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
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
    def deleteFeatures(ids: js.Array[scala.Double | java.lang.String]): this.type = js.native
    def deleteFeatures(ids: js.Array[scala.Double | java.lang.String], callback: ResponseCallbackHandler): this.type = js.native
    def deleteFeatures(ids: js.Array[scala.Double | java.lang.String], callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this layer.
      */
    def query(): Query = js.native
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
  class Find protected () extends Task {
    def this(options: FindOptions) = this()
    def this(options: MapService) = this()
    /**
      * When true find task will search for a value that contains the searchText. When false it will do an exact
      * match on the searchText string. Default is true.
      */
    def contains(contains: scala.Boolean): this.type = js.native
    /**
      * Property used for adding new layers or modifying the data source of existing ones in the current map
      * service.
      */
    def dynamicLayers(dynamicLayers: js.Any): this.type = js.native
    /**
      * 	An array or comma-separated list of field names to search. If not specified, all fields are searched.
      */
    def fields(fields: java.lang.String): this.type = js.native
    def fields(fields: js.Array[java.lang.String]): this.type = js.native
    /**
      * 	Add a layer definition to the find task.
      */
    def layerDef(id: scala.Double, where: java.lang.String): this.type = js.native
    /**
      * 	Layers to perform find task on. Accepts an array of layer IDs or comma-separated list.
      */
    def layers(layers: java.lang.String): this.type = js.native
    def layers(layers: js.Array[java.lang.String]): this.type = js.native
    /**
      * Specifies the maximum allowable offset to be used for generalizing geometries returned by the find task.
      */
    def maxAllowableOffset(maxAllowableOffset: scala.Double): this.type = js.native
    /**
      * Specifies the number of decimal places in returned geometries.
      */
    def precision(precision: scala.Double): this.type = js.native
    /**
      * Return geometry with results. Default is true.
      */
    def returnGeometry(returnGeometry: scala.Boolean): this.type = js.native
    /**
      * Includes M values if the features have them. Default value is false. This parameter only applies if
      * `returnGeometry=true`.
      */
    def returnM(returnM: scala.Boolean): this.type = js.native
    /**
      * Include Z values in the results. Default value is true. This parameter only applies if
      * `returnGeometry=true`.
      */
    def returnZ(returnZ: scala.Boolean): this.type = js.native
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
    def simplify(map: leafletLib.leafletMod.Map, factor: scala.Double): this.type = js.native
    /**
      * 	The well known ID (ex. 4326) for the results.
      */
    def spatialReference(sr: scala.Double): this.type = js.native
    /**
      * Text that is searched across the layers and fields the user specifies.
      */
    def text(text: java.lang.String): this.type = js.native
  }
  
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  @js.native
  class IdentifyFeatures protected () extends Task {
    def this(options: IdentifyFeaturesOptions) = this()
    def this(options: ImageService) = this()
    /**
      * Identifies features at a given LatLng geometry can also be an instance of `L.Marker`, `L.Polygon`,
      * `L.Polyline`, `L.LatLngBounds`, `L.GeoJSON` or a valid GeoJSON object literal.
      */
    def at(geometry: Geometry): this.type = js.native
    /**
      * Identifies features within a given time range.
      */
    def between(from: stdLib.Date, to: stdLib.Date): this.type = js.native
    /**
      * Add a layer definition to the query.
      */
    def layerDef(id: scala.Double, where: java.lang.String): this.type = js.native
    /**
      * By default, only the topmost feature will be identified, but it is possible to specify both an
      * alternative strategy and array of individual layers. See the REST API documentation for more information
      * about valid combinations.
      *
      * ex: `.layers('all:0')`.
      */
    def layers(layers: java.lang.String): this.type = js.native
    def layers(layers: js.Array[java.lang.String]): this.type = js.native
    /**
      * The map to identify features on.
      */
    def on(map: leafletLib.leafletMod.Map): this.type = js.native
    /**
      * Return only this many decimal points of precision in the output geometries.
      */
    def precision(precision: scala.Double): this.type = js.native
    /**
      * Return geometry with results. Default is true.
      */
    def returnGeometry(returnGeometry: scala.Boolean): this.type = js.native
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
    def simplify(map: leafletLib.leafletMod.Map, factor: scala.Double): this.type = js.native
    /**
      * Buffer the identify area by a given number of screen pixels.
      */
    def tolerance(precision: scala.Double): this.type = js.native
  }
  
  /**
    * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
    * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
    * service.
    */
  @js.native
  class ImageService protected () extends Service {
    def this(options: ImageServiceOptions) = this()
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): Query = js.native
  }
  
  trait LayerOptionsBase extends js.Object {
    /**
      * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying requests.
      */
    var proxy: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Will use this token to authenticate all calls to the service.
      */
    var token: js.UndefOr[java.lang.String] = js.undefined
    /**
      * URL of the Map Service
      */
    var url: java.lang.String
    /**
      * Dictates if the service should use CORS when making GET requests.
      */
    var useCors: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  /**
    * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
    * Server that allows you to make requests to the API, as well as query and identify published features.
    */
  @js.native
  class MapService protected () extends Service {
    def this(options: MapServiceOptions) = this()
    /**
      * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
      * will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def find(): Find = js.native
    /**
      * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
      * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def identify(): IdentifyFeatures = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): Query = js.native
  }
  
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
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
    def between(from: stdLib.Date, to: stdLib.Date): this.type = js.native
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
    def fields(fields: java.lang.String): this.type = js.native
    def fields(fields: js.Array[java.lang.String]): this.type = js.native
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
    def layer(layer: java.lang.String): this.type = js.native
    /**
      * Used to select which layer inside a Map Service to perform the query on.
      *
      * Only available for Map Services.
      */
    def layer(layer: scala.Double): this.type = js.native
    /**
      * Limit the number of results returned by this query, when combined with offset can be used for paging.
      *
      * Only available for Feature Layers hosted on ArcGIS Online or ArcGIS Server 10.3.
      */
    def limit(limit: scala.Double): this.type = js.native
    /**
      * Queries features a given distance in meters around a LatLng.
      *
      * Only available for Feature Layers hosted on ArcGIS Online or ArcGIS Server 10.3 that include the
      * capability supportQueryWithDistance.
      */
    def nearby(latlng: leafletLib.leafletMod.LatLng, distance: scala.Double): this.type = js.native
    /**
      * Define the offset of the results, when combined with limit can be used for paging.
      *
      * Only available for Feature Layers hosted on ArcGIS Online or ArcGIS Server 10.3.
      */
    def offset(offset: scala.Double): this.type = js.native
    /**
      * Sort output features using values from an individual field. "ASC" (ascending) is the default sort order,
      * but "DESC" can be passed as an alternative. This method can be called more than once to apply advanced
      * sorting.
      */
    def orderBy(fieldName: java.lang.String, order: java.lang.String): this.type = js.native
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
    def pixelSize(point: leafletLib.leafletMod.Point): this.type = js.native
    /**
      * Return only this many decimal points of precision in the output geometries.
      */
    def precision(precision: scala.Double): this.type = js.native
    /**
      * Return geometry with results. Default is true.
      */
    def returnGeometry(returnGeometry: scala.Boolean): this.type = js.native
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
    def simplify(map: leafletLib.leafletMod.Map, factor: scala.Double): this.type = js.native
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
    def where(where: java.lang.String): this.type = js.native
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
  abstract class RasterLayer ()
    extends leafletLib.leafletMod.ImageOverlay {
    /**
      * Authenticates this service with a new token and runs any pending requests that required a token.
      */
    def authenticate(token: java.lang.String): this.type = js.native
    /**
      * 	Returns the current opacity of the layer.
      */
    def getOpacity(): scala.Double = js.native
    /**
      * Returns the current time range being used for rendering. Array [from, to];
      */
    def getTimeRange(): js.Array[stdLib.Date] = js.native
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
    def setTimeRange(from: stdLib.Date, to: stdLib.Date): this.type = js.native
  }
  
  /**
    * Options for RasterLayer
    */
  trait RasterLayerOptions
    extends leafletLib.leafletMod.ImageOverlayOptions {
    /**
      * Server response content type.
      * @default 'image'
      */
    var f: js.UndefOr[java.lang.String] = js.undefined
    /**
      * 	Closest zoom level the layer will be displayed on the map.
      */
    var maxZoom: js.UndefOr[scala.Double] = js.undefined
    /**
      * Furthest zoom level the layer will be displayed on the map.
      */
    var minZoom: js.UndefOr[scala.Double] = js.undefined
    /**
      * Position of the layer relative to other overlays.
      * @default 'front'
      */
    var position: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * A generic class representing a hosted resource on ArcGIS Online or ArcGIS Server. This class can be extended
    * to provide support for making requests and serves as a standard for authentication and proxying.
    */
  @js.native
  abstract class Service ()
    extends leafletLib.leafletMod.Evented {
    /**
      * Authenticates this service with a new token and runs any pending requests that required a token.
      */
    def authenticate(token: java.lang.String): this.type = js.native
    /**
      * Makes a GET request to the service. The service's URL will be combined with the path option and
      * parameters will be serialized to a query string. Accepts an optional function context for the callback.
      */
    def get(url: java.lang.String): this.type = js.native
    def get(url: java.lang.String, params: js.Any): this.type = js.native
    def get(url: java.lang.String, params: js.Any, callback: CallbackHandler): this.type = js.native
    def get(url: java.lang.String, params: js.Any, callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Requests metadata about this Feature Layer. Callback will be called with error and metadata.
      */
    def metadata(callback: CallbackHandler): this.type = js.native
    def metadata(callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Makes a POST request to the service. The service's URL will be combined with the path option and
      * parameters will be serialized. Accepts an optional function context for the callback.
      */
    def post(url: java.lang.String): this.type = js.native
    def post(url: java.lang.String, params: js.Any): this.type = js.native
    def post(url: java.lang.String, params: js.Any, callback: CallbackHandler): this.type = js.native
    def post(url: java.lang.String, params: js.Any, callback: CallbackHandler, context: js.Any): this.type = js.native
  }
  
  /**
    * Options for `L.esri.Service`
    */
  trait ServiceOptions extends js.Object {
    /**
      * URL of an ArcGIS API for JavaScript proxy or ArcGIS Resource Proxy to use for proxying POST requests.
      */
    var proxy: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Operation timeout
      */
    var timeout: js.UndefOr[scala.Double] = js.undefined
    /**
      * URL of the ArcGIS service you would like to consume.
      */
    var url: js.UndefOr[java.lang.String] = js.undefined
    /**
      * If this service should use CORS when making GET requests.
      */
    var useCors: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait SpatialReference extends js.Object {
    var wkid: js.UndefOr[scala.Double] = js.undefined
    var wkt: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
    * ArcGIS Server Services like query, find and identify.
    */
  @js.native
  class Task protected ()
    extends leafletLib.leafletMod.Class {
    def this(options: Service) = this()
    def this(options: TaskOptions) = this()
    def format(returnUnformattedValues: scala.Boolean): this.type = js.native
    /**
      * Makes a request to the associated service. The service's URL will be combined with the path option and
      * parameters will be serialized. Accepts an optional function context for the callback.
      */
    def request(url: java.lang.String): this.type = js.native
    def request(url: java.lang.String, params: js.Any): this.type = js.native
    def request(url: java.lang.String, params: js.Any, callback: js.Any): this.type = js.native
    def request(url: java.lang.String, params: js.Any, callback: js.Any, context: js.Any): this.type = js.native
    /**
      * Adds a token to this request if the service requires authentication. Will be added automatically if used
      * with a service.
      */
    def token(token: java.lang.String): this.type = js.native
  }
  
  /**
    * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
    * service is added to map attribution automatically.
    */
  @js.native
  class TiledMapLayer protected ()
    extends leafletLib.leafletMod.TileLayer {
    def this(options: TiledMapLayerOptions) = this()
    /**
      * Authenticates this service with a new token and runs any pending requests that required a token
      */
    def authenticate(token: java.lang.String): this.type = js.native
    /**
      * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
      * will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def find(): Find = js.native
    /**
      * Returns a new `L.esri.services.IdentifyFeatures` object that can be used to identify features on this
      * layer. Your callback function will be passed a GeoJSON FeatureCollection with the results or an error.
      */
    def identify(): IdentifyFeatures = js.native
    /**
      * Requests metadata about this Feature Layer. Callback will be called with error and metadata.
      */
    def metadata(callback: CallbackHandler): this.type = js.native
    def metadata(callback: CallbackHandler, context: js.Any): this.type = js.native
    /**
      * Returns a new `L.esri.Query` object that can be used to query this service.
      */
    def query(): Query = js.native
  }
  
  /**
    * Options for `L.esri.TiledMapLayer`
    */
  trait TiledMapLayerOptions
    extends leafletLib.leafletMod.TileLayerOptions
       with LayerOptionsBase {
    /**
      * If correctZoomLevels is enabled this controls the amount of tolerance for the difference at each scale
      * level for remapping tile levels.
      *
      * Default 0.1
      */
    var zoomOffsetAllowance: js.UndefOr[scala.Double] = js.undefined
  }
  
  /**
    * `L.esri.basemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
    * The Terms of Use for Esri hosted services apply to all Leaflet applications.
    */
  def basemapLayer(key: Basemaps): BasemapLayer = js.native
  def basemapLayer(key: Basemaps, options: BasemapLayerOptions): BasemapLayer = js.native
  /**
    * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. L.esri.DynamicMapLayer also supports
    * custom popups and identification of features.
    *
    * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
    * and pass back the image which was generated on the fly. They also expose capabilities for querying and
    * identifying individual features.
    */
  def dynamicMapLayer(options: DynamicMapLayerOptions): DynamicMapLayer = js.native
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
  def featureLayer(options: FeatureLayerOptions): FeatureLayer = js.native
  /**
    * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
    * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
    * features from the service.
    */
  def featureLayerService(options: FeatureLayerServiceOptions): FeatureLayerService = js.native
  /**
    * L.esri.Find is an abstraction for the find API included in Map Services. It provides a chainable API for
    * building request parameters and executing find tasks.
    */
  def find(options: FindOptions): Find = js.native
  def find(options: MapService): Find = js.native
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  def identifyFeatures(options: IdentifyFeaturesOptions): IdentifyFeatures = js.native
  def identifyFeatures(options: ImageService): IdentifyFeatures = js.native
  /**
    * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
    * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
    * service.
    */
  def imageService(options: ImageServiceOptions): ImageService = js.native
  /**
    * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
    * Server that allows you to make requests to the API, as well as query and identify published features.
    */
  def mapService(options: MapServiceOptions): MapService = js.native
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
  def query(options: QueryOptions): Query = js.native
  def task(options: Service): Task = js.native
  /**
    * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
    * ArcGIS Server Services like query, find and identify.
    */
  def task(options: TaskOptions): Task = js.native
  /**
    * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
    * service is added to map attribution automatically.
    */
  def tiledMapLayer(options: TiledMapLayerOptions): TiledMapLayer = js.native
  type Basemaps = esriDashLeafletLib.esriDashLeafletLibStrings.Streets | esriDashLeafletLib.esriDashLeafletLibStrings.Topographic | esriDashLeafletLib.esriDashLeafletLibStrings.NationalGeographic | esriDashLeafletLib.esriDashLeafletLibStrings.Oceans | esriDashLeafletLib.esriDashLeafletLibStrings.Gray | esriDashLeafletLib.esriDashLeafletLibStrings.DarkGray | esriDashLeafletLib.esriDashLeafletLibStrings.Imagery | esriDashLeafletLib.esriDashLeafletLibStrings.ShadedRelief | esriDashLeafletLib.esriDashLeafletLibStrings.Terrain | esriDashLeafletLib.esriDashLeafletLibStrings.USATopo | esriDashLeafletLib.esriDashLeafletLibStrings.OceansLabels | esriDashLeafletLib.esriDashLeafletLibStrings.GrayLabels | esriDashLeafletLib.esriDashLeafletLibStrings.DarkGrayLabels | esriDashLeafletLib.esriDashLeafletLibStrings.ImageryLabels | esriDashLeafletLib.esriDashLeafletLibStrings.ImageryClarity | esriDashLeafletLib.esriDashLeafletLibStrings.ImageryTransportation | esriDashLeafletLib.esriDashLeafletLibStrings.ShadedReliefLabels | esriDashLeafletLib.esriDashLeafletLibStrings.TerrainLabels
  type CallbackHandler = js.Function2[/* error */ js.Any, /* metadata */ js.Any, scala.Unit]
  type FeatureCallbackHandler = js.Function3[
    /* error */ js.UndefOr[js.Any], 
    /* featureCollection */ js.UndefOr[js.Any], 
    /* response */ js.UndefOr[js.Any], 
    scala.Unit
  ]
  /**
    * Options for FeatureLayerService
    */
  type FeatureLayerServiceOptions = ServiceOptions
  /**
    * Options for Find Task
    */
  type FindOptions = ServiceOptions
  type GeoJSONGeometry = geojsonLib.geojsonMod.Point | geojsonLib.geojsonMod.Polygon | geojsonLib.geojsonMod.LineString
  type Geometry = LeafletGeometry | GeoJSONGeometry
  /**
    * Options for IdentifyFeatures
    */
  type IdentifyFeaturesOptions = ServiceOptions
  /**
    * Options for ImageService
    */
  type ImageServiceOptions = ServiceOptions
  type LeafletGeometry = leafletLib.leafletMod.Marker[js.Any] | leafletLib.leafletMod.Polygon[js.Any] | (leafletLib.leafletMod.Polyline[geojsonLib.geojsonMod.LineString | geojsonLib.geojsonMod.MultiLineString, js.Any]) | leafletLib.leafletMod.LatLngExpression | leafletLib.leafletMod.LatLngBounds | leafletLib.leafletMod.GeoJSON[js.Any]
  /**
    * Options for MapService
    */
  type MapServiceOptions = ServiceOptions
  /**
    * Options for Query
    */
  type QueryOptions = TaskOptions
  type ResponseCallbackHandler = js.Function2[/* error */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], scala.Unit]
  type SpatialReferenceExpression = scala.Double | SpatialReference
  type StyleCallback = js.Function1[/* feature */ js.Any, js.Any]
  /**
    * Options for Task
    */
  type TaskOptions = ServiceOptions
}

