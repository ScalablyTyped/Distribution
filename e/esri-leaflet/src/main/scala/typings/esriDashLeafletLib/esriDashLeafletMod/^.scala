package typings
package esriDashLeafletLib.esriDashLeafletMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri-leaflet", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * `L.esri.basemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
    * The Terms of Use for Esri hosted services apply to all Leaflet applications.
    */
  def basemapLayer(key: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Basemaps): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.BasemapLayer = js.native
  def basemapLayer(
    key: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Basemaps,
    options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.BasemapLayerOptions
  ): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.BasemapLayer = js.native
  /**
    * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. L.esri.DynamicMapLayer also supports
    * custom popups and identification of features.
    *
    * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
    * and pass back the image which was generated on the fly. They also expose capabilities for querying and
    * identifying individual features.
    */
  def dynamicMapLayer(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.DynamicMapLayerOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.DynamicMapLayer = js.native
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
  def featureLayer(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.FeatureLayerOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.FeatureLayer = js.native
  /**
    * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
    * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
    * features from the service.
    */
  def featureLayerService(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.FeatureLayerServiceOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.FeatureLayerService = js.native
  /**
    * L.esri.Find is an abstraction for the find API included in Map Services. It provides a chainable API for
    * building request parameters and executing find tasks.
    */
  def find(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.FindOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Find = js.native
  def find(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.MapService): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Find = js.native
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  def identifyFeatures(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeaturesOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures = js.native
  def identifyFeatures(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.ImageService): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.IdentifyFeatures = js.native
  /**
    * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
    * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
    * service.
    */
  def imageService(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.ImageServiceOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.ImageService = js.native
  /**
    * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
    * Server that allows you to make requests to the API, as well as query and identify published features.
    */
  def mapService(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.MapServiceOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.MapService = js.native
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
  def query(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.QueryOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Query = js.native
  def task(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Service): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Task = js.native
  /**
    * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
    * ArcGIS Server Services like query, find and identify.
    */
  def task(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.TaskOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.Task = js.native
  /**
    * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
    * service is added to map attribution automatically.
    */
  def tiledMapLayer(options: esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.TiledMapLayerOptions): esriDashLeafletLib.esriDashLeafletMod.leafletMod.esriNs.TiledMapLayer = js.native
}

