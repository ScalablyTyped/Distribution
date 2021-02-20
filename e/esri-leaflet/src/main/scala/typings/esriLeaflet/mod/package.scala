package typings.esriLeaflet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * `L.esri.basemapLayer` is used to display Esri hosted basemaps and attributes data providers appropriately.
    * The Terms of Use for Esri hosted services apply to all Leaflet applications.
    */
  @scala.inline
  def basemapLayer(key: typings.esriLeaflet.mod.leafletAugmentingMod.esri.Basemaps): typings.esriLeaflet.mod.leafletAugmentingMod.esri.BasemapLayer_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("basemapLayer")(key.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.BasemapLayer_]
  @scala.inline
  def basemapLayer(
    key: typings.esriLeaflet.mod.leafletAugmentingMod.esri.Basemaps,
    options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.BasemapLayerOptions
  ): typings.esriLeaflet.mod.leafletAugmentingMod.esri.BasemapLayer_ = (typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("basemapLayer")(key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.BasemapLayer_]
  
  /**
    * Render and visualize Map Services from ArcGIS Online and ArcGIS Server. L.esri.DynamicMapLayer also supports
    * custom popups and identification of features.
    *
    * Map Services are used when its preferable to ask the server to draw layers at a particular location and scale
    * and pass back the image which was generated on the fly. They also expose capabilities for querying and
    * identifying individual features.
    */
  @scala.inline
  def dynamicMapLayer(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.DynamicMapLayerOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.DynamicMapLayer_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("dynamicMapLayer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.DynamicMapLayer_]
  
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
  @scala.inline
  def featureLayer(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayerOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayer_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("featureLayer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayer_]
  
  /**
    * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
    * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
    * features from the service.
    */
  @scala.inline
  def featureLayerService(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayerServiceOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayerService_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("featureLayerService")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayerService_]
  
  /**
    * L.esri.Find is an abstraction for the find API included in Map Services. It provides a chainable API for
    * building request parameters and executing find tasks.
    */
  @scala.inline
  def find(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.FindOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Find_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.Find_]
  @scala.inline
  def find(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.MapService_): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Find_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("find")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.Find_]
  
  /**
    * `L.esri.IdentifyFeatures` is an abstraction for the Identify API found in Map Services. It provides a
    * chainable API for building request parameters and executing the request.
    */
  @scala.inline
  def identifyFeatures(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.IdentifyFeaturesOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.IdentifyFeatures_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("identifyFeatures")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.IdentifyFeatures_]
  @scala.inline
  def identifyFeatures(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.ImageService_): typings.esriLeaflet.mod.leafletAugmentingMod.esri.IdentifyFeatures_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("identifyFeatures")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.IdentifyFeatures_]
  
  /**
    * `L.esri.ImageService` is an abstraction for interacting with Image Services running on ArcGIS Online and
    * ArcGIS Server that allows you to make requests to the API, as well as query and identify features on the
    * service.
    */
  @scala.inline
  def imageService(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.ImageServiceOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.ImageService_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("imageService")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.ImageService_]
  
  /**
    * `L.esri.MapService` is an abstraction for interacting with Map Services running on ArcGIS Online and ArcGIS
    * Server that allows you to make requests to the API, as well as query and identify published features.
    */
  @scala.inline
  def mapService(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.MapServiceOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.MapService_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("mapService")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.MapService_]
  
  /**
    * `L.esri.Query` is an abstraction for the query API included in Feature Layers and Image Services. It provides
    * a chainable API for building request parameters and executing queries.
    *
    * Note Depending on the type of service you are querying (Feature Layer, Map Service, Image Service) and the
    * version of ArcGIS Server that hosts the service some of these options may not be available.
    */
  @scala.inline
  def query(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.QueryOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Query_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("query")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.Query_]
  
  @scala.inline
  def task(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.Service): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Task_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("task")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.Task_]
  /**
    * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
    * ArcGIS Server Services like query, find and identify.
    */
  @scala.inline
  def task(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.TaskOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.Task_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("task")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.Task_]
  
  /**
    * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
    * service is added to map attribution automatically.
    */
  @scala.inline
  def tiledMapLayer(options: typings.esriLeaflet.mod.leafletAugmentingMod.esri.TiledMapLayerOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.TiledMapLayer_ = typings.esriLeaflet.mod.^.asInstanceOf[js.Dynamic].applyDynamic("tiledMapLayer")(options.asInstanceOf[js.Any]).asInstanceOf[typings.esriLeaflet.mod.leafletAugmentingMod.esri.TiledMapLayer_]
}
