package typings.esriDashLeaflet.esriDashLeafletMod.leafletMod.esri

import typings.leaflet.leafletMod.TileLayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
  * service is added to map attribution automatically.
  */
@JSImport("leaflet", "esri.TiledMapLayer")
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

@JSImport("leaflet", "esri.tiledMapLayer")
@js.native
object tiledMapLayer extends js.Object {
  /**
    * Access tiles from ArcGIS Online and ArcGIS Server to visualize and identify features. Copyright text from the
    * service is added to map attribution automatically.
    */
  def apply(options: TiledMapLayerOptions): TiledMapLayer = js.native
}

