package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.TileLayer_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
  * service is added to map attribution automatically.
  */
@JSImport("leaflet", "esri.TiledMapLayer")
@js.native
class TiledMapLayer_ protected () extends TileLayer_ {
  def this(options: TiledMapLayerOptions) = this()
  
  /**
    * Authenticates this service with a new token and runs any pending requests that required a token
    */
  def authenticate(token: String): this.type = js.native
  
  /**
    * Returns a new `L.esri.services.Find` object that can be used to find features. Your callback function
    * will be passed a GeoJSON FeatureCollection with the results or an error.
    */
  def find(): Find_ = js.native
  
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
}
