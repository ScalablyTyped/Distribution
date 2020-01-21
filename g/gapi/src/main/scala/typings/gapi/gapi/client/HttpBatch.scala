package typings.gapi.gapi.client

import typings.gapi.AnonCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.HttpBatch")
@js.native
class HttpBatch () extends js.Object {
  /**
    * Adds a gapi.client.HttpRequest to the batch.
    * @param httpRequest The HTTP request to add to this batch.
    * @param opt_params extra parameters for this batch entry.
    */
  def add(httpRequest: HttpRequest[_]): Unit = js.native
  def add(httpRequest: HttpRequest[_], opt_params: AnonCallback): Unit = js.native
  /**
    * Executes all requests in the batch. The supplied callback is executed on success or failure.
    * @param callback The callback to execute when the batch returns.
    */
  def execute(callback: js.Function2[/* responseMap */ js.Any, /* rawBatchResponse */ String, _]): Unit = js.native
}

