package typings.easyXHeaders.httpMod

import typings.easyXHeaders.NodeJS.Timer
import typings.easyXHeaders.netMod.Socket
import typings.easyXHeaders.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingMessage extends Readable {
  var headers: js.Any = js.native
  var httpVersion: String = js.native
  /**
    * Only valid for request obtained from http.Server.
    */
  var method: js.UndefOr[String] = js.native
  var rawHeaders: js.Array[String] = js.native
  var rawTrailers: js.Any = js.native
  var socket: Socket = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusCode: js.UndefOr[Double] = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusMessage: js.UndefOr[String] = js.native
  var trailers: js.Any = js.native
  /**
    * Only valid for request obtained from http.Server.
    */
  var url: js.UndefOr[String] = js.native
  def setTimeout(msecs: Double, callback: js.Function): Timer = js.native
}

