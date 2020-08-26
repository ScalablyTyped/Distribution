package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.Evented
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A generic class representing a hosted resource on ArcGIS Online or ArcGIS Server. This class can be extended
  * to provide support for making requests and serves as a standard for authentication and proxying.
  */
@JSImport("leaflet", "esri.Service")
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
  def get(
    url: String,
    params: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def get(url: String, params: js.UndefOr[scala.Nothing], callback: CallbackHandler): this.type = js.native
  def get(url: String, params: js.UndefOr[scala.Nothing], callback: CallbackHandler, context: js.Any): this.type = js.native
  def get(url: String, params: js.Any): this.type = js.native
  def get(url: String, params: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
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
  def post(
    url: String,
    params: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): this.type = js.native
  def post(url: String, params: js.UndefOr[scala.Nothing], callback: CallbackHandler): this.type = js.native
  def post(url: String, params: js.UndefOr[scala.Nothing], callback: CallbackHandler, context: js.Any): this.type = js.native
  def post(url: String, params: js.Any): this.type = js.native
  def post(url: String, params: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): this.type = js.native
  def post(url: String, params: js.Any, callback: CallbackHandler): this.type = js.native
  def post(url: String, params: js.Any, callback: CallbackHandler, context: js.Any): this.type = js.native
}

