package typings.gapi.gapi.client

import typings.gapi.Anon_Body
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.HttpRequest")
@js.native
class HttpRequest[T] () extends HttpRequestPromise[T] {
  /**
    * Executes the request and runs the supplied callback on response.
    * @param callback The callback function which executes when the request succeeds or fails.
    */
  def execute(callback: js.Function2[/* jsonResp */ T, /* rawResp */ Anon_Body, _]): Unit = js.native
}

