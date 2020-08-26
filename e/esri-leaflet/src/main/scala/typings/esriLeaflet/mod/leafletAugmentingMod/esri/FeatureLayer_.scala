package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.Layer
import typings.leaflet.mod.PathOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@JSImport("leaflet", "esri.FeatureLayer")
@js.native
class FeatureLayer_ protected () extends Layer {
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
  def addFeature(feature: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
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
  def deleteFeature(id: String, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def deleteFeature(id: String, callback: ResponseCallbackHandler): this.type = js.native
  def deleteFeature(id: String, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
  def deleteFeature(id: Double): this.type = js.native
  def deleteFeature(id: Double, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
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
  def deleteFeatures(ids: js.Array[Double | String], callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
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
  def find(): Find_ = js.native
  /**
    * Given the id of a Feature return the layer on the map that represents it. This will usually be a Leaflet
    * vector layer like Polyline or Polygon, or a Leaflet Marker.
    */
  def getFeature(id: String): Layer = js.native
  def getFeature(id: Double): Layer = js.native
  /**
    *     Returns the current time range as an array like [from, to]
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
  def identify(): IdentifyFeatures_ = js.native
  /**
    * Requests metadata about this Feature Layer. Callback will be called with error and metadata.
    */
  def metadata(callback: CallbackHandler): this.type = js.native
  def metadata(callback: CallbackHandler, context: js.Any): this.type = js.native
  /**
    * Returns a new `L.esri.Query` object that can be used to query this service.
    */
  def query(): Query_ = js.native
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
    *     Given the ID of a feature, reset that feature to the original style.
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
  def setTimeRange(from: Date, to: Date, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def setTimeRange(from: Date, to: Date, callback: FeatureCallbackHandler): this.type = js.native
  def setTimeRange(from: Date, to: Date, callback: FeatureCallbackHandler, context: js.Any): this.type = js.native
  /**
    * Sets the new where option and refreshes the layer to reflect the new where filter. Accepts an optional
    * callback and function context.
    */
  def setWhere(where: String): this.type = js.native
  def setWhere(where: String, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
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
  def updateFeature(feature: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def updateFeature(feature: js.Any, callback: ResponseCallbackHandler): this.type = js.native
  def updateFeature(feature: js.Any, callback: ResponseCallbackHandler, context: js.Any): this.type = js.native
}

