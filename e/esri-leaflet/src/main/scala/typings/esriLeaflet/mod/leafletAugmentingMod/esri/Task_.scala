package typings.esriLeaflet.mod.leafletAugmentingMod.esri

import typings.leaflet.mod.Class
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `L.esri.Task` is a generic class that provides the foundation for calling operations on ArcGIS Online and
  * ArcGIS Server Services like query, find and identify.
  */
@JSImport("leaflet", "esri.Task")
@js.native
class Task_ protected () extends Class {
  def this(options: Service) = this()
  def this(options: TaskOptions) = this()
  def format(returnUnformattedValues: Boolean): this.type = js.native
  /**
    * Makes a request to the associated service. The service's URL will be combined with the path option and
    * parameters will be serialized. Accepts an optional function context for the callback.
    */
  def request(url: String): this.type = js.native
  def request(url: String, params: js.Any): this.type = js.native
  def request(url: String, params: js.Any, callback: js.Any): this.type = js.native
  def request(url: String, params: js.Any, callback: js.Any, context: js.Any): this.type = js.native
  /**
    * Adds a token to this request if the service requires authentication. Will be added automatically if used
    * with a service.
    */
  def token(token: String): this.type = js.native
}

