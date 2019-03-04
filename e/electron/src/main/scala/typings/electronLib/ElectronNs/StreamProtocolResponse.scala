package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamProtocolResponse extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/stream-protocol-response
  /**
    * A Node.js readable stream representing the response body.
    */
  var data: nodeLib.NodeJSNs.ReadableStream
  /**
    * An object containing the response headers.
    */
  var headers: Headers
  /**
    * The HTTP response code.
    */
  var statusCode: scala.Double
}

object StreamProtocolResponse {
  @scala.inline
  def apply(data: nodeLib.NodeJSNs.ReadableStream, headers: Headers, statusCode: scala.Double): StreamProtocolResponse = {
    val __obj = js.Dynamic.literal(data = data, headers = headers, statusCode = statusCode)
  
    __obj.asInstanceOf[StreamProtocolResponse]
  }
}

