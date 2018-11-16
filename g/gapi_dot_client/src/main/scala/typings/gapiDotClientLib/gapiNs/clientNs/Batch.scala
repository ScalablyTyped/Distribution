package typings
package gapiDotClientLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Represents an HTTP Batch operation. Individual HTTP requests are added with the add method and the batch is executed using execute.
         */
@js.native
trait Batch[T]
  extends stdLib.PromiseLike[Response[ResponseMap[T]]] {
  /**
               * Adds a gapi.client.Request to the batch.
               * @param request The HTTP request to add to this batch.
               * @param opt_params extra parameters for this batch entry.
               */
  def add[T](request: Request[T]): scala.Unit = js.native
  /**
               * Adds a gapi.client.Request to the batch.
               * @param request The HTTP request to add to this batch.
               * @param opt_params extra parameters for this batch entry.
               */
  def add[T](request: Request[T], opt_params: gapiDotClientLib.Anon_Callback[T]): scala.Unit = js.native
  /**
               * Executes all requests in the batch. The supplied callback is executed on success or failure.
               * @param callback The callback to execute when the batch returns.
               */
  def execute(
    callback: js.Function2[/* responseMap */ ResponseMap[T], /* rawBatchResponse */ java.lang.String, _]
  ): scala.Unit = js.native
}

