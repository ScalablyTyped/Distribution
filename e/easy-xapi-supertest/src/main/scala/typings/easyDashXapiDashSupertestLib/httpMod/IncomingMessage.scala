package typings
package easyDashXapiDashSupertestLib.httpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IncomingMessage
  extends easyDashXapiDashSupertestLib.streamMod.Readable {
  var headers: js.Any = js.native
  var httpVersion: java.lang.String = js.native
  /**
    * Only valid for request obtained from http.Server.
    */
  var method: js.UndefOr[java.lang.String] = js.native
  var rawHeaders: js.Array[java.lang.String] = js.native
  var rawTrailers: js.Any = js.native
  var socket: easyDashXapiDashSupertestLib.netMod.Socket = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusCode: js.UndefOr[scala.Double] = js.native
  /**
    * Only valid for response obtained from http.ClientRequest.
    */
  var statusMessage: js.UndefOr[java.lang.String] = js.native
  var trailers: js.Any = js.native
  /**
    * Only valid for request obtained from http.Server.
    */
  var url: js.UndefOr[java.lang.String] = js.native
  def setTimeout(msecs: scala.Double, callback: js.Function): easyDashXapiDashSupertestLib.NodeJSNs.Timer = js.native
}

