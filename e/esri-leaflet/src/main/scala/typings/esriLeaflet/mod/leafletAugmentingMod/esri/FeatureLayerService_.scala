package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
  * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
  * features from the service.
  */
@JSImport("leaflet", "esri.FeatureLayerService")
@js.native
class FeatureLayerService_ protected () extends Service {
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
  def addFeature(feature: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
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
    * Returns a new `L.esri.Query` object that can be used to query this layer.
    */
  def query(): Query_ = js.native
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

