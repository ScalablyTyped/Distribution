package typings.gapiDotClient.gapiNs.clientNs

import typings.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object encapsulating an HTTP request. This object is not instantiated directly, rather it is returned by gapi.client.request.
  */
@js.native
trait Request[T] extends PromiseLike[Response[T]] {
  /**
    * Executes the request and runs the supplied callback on response.
    * @param callback The callback function which executes when the request succeeds or fails.
    */
  def execute(callback: js.Function1[/* response */ Response[T], _]): Unit = js.native
}

