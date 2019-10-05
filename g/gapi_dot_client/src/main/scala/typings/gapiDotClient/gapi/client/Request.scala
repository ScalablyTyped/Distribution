package typings.gapiDotClient.gapi.client

import typings.gapiDotClient.Anon_Body
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

@JSGlobal("gapi.client.request")
@js.native
object request extends js.Object {
  /**
    * Creates a HTTP request for making RESTful requests.
    * An object encapsulating the various arguments for this method.
    */
  def apply[T](args: Anon_Body): Request[T] = js.native
}

