package typings.esriLeaflet.mod

import typings.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayerServiceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri-leaflet", "featureLayerService")
@js.native
object featureLayerService extends js.Object {
  
  /**
    * `L.esri.FeatureLayerService` is an abstraction for interacting with Feature Layers running on ArcGIS Online
    * and ArcGIS Server that allows you to make requests to the API, as well as query, add, update and remove
    * features from the service.
    */
  def apply(options: FeatureLayerServiceOptions): typings.esriLeaflet.mod.leafletAugmentingMod.esri.FeatureLayerService_ = js.native
}
