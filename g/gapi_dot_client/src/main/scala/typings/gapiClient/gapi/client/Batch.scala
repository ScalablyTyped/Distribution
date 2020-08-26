package typings.gapiClient.gapi.client

import typings.gapiClient.anon.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents an HTTP Batch operation. Individual HTTP requests are added with the add method and the batch is executed using execute.
  */
@js.native
trait Batch[T]
  extends js.Promise[Response[ResponseMap[T]]] {
  /**
    * Adds a gapi.client.Request to the batch.
    * @param request The HTTP request to add to this batch.
    * @param opt_params extra parameters for this batch entry.
    */
  def add[T](request: Request[T]): Unit = js.native
  def add[T](request: Request[T], opt_params: Callback[T]): Unit = js.native
  /**
    * Executes all requests in the batch. The supplied callback is executed on success or failure.
    * @param callback The callback to execute when the batch returns.
    */
  def execute(callback: js.Function2[/* responseMap */ ResponseMap[T], /* rawBatchResponse */ String, _]): Unit = js.native
}

