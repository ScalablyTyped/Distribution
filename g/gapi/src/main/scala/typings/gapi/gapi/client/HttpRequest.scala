package typings.gapi.gapi.client

import typings.gapi.anon.Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpRequest[T] extends HttpRequestPromise[T] {
  /**
    * Executes the request and runs the supplied callback on response.
    * @param callback The callback function which executes when the request succeeds or fails.
    */
  def execute(callback: js.Function2[/* jsonResp */ T, /* rawResp */ Body, _]): Unit = js.native
}

