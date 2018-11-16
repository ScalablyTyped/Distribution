package typings
package gapiLib.gapiNs.clientNs

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
  def add(httpRequest: HttpRequest[_]): scala.Unit = js.native
  /**
           * Adds a gapi.client.HttpRequest to the batch.
           * @param httpRequest The HTTP request to add to this batch.
           * @param opt_params extra parameters for this batch entry.
           */
  def add(httpRequest: HttpRequest[_], opt_params: gapiLib.Anon_Callback): scala.Unit = js.native
  /**
           * Executes all requests in the batch. The supplied callback is executed on success or failure.
           * @param callback The callback to execute when the batch returns.
           */
  def execute(callback: js.Function2[/* responseMap */ js.Any, /* rawBatchResponse */ java.lang.String, _]): scala.Unit = js.native
}

