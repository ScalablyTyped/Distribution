package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.ImageOverlay_
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A generic class representing an image layer. This class can be extended to provide support for making export requests from ArcGIS REST services.
  */
@JSImport("leaflet", "esri.RasterLayer")
@js.native
abstract class RasterLayer () extends ImageOverlay_ {
  
  /**
    * Authenticates this service with a new token and runs any pending requests that required a token.
    */
  def authenticate(token: String): this.type = js.native
  
  /**
    *     Returns the current opacity of the layer.
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
    * Redraws the layer with the passed time range.
    */
  def setTimeRange(from: Date, to: Date): this.type = js.native
}
