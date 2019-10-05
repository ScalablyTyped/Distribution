package typings.electron.Electron

import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamProtocolResponse extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/stream-protocol-response
  /**
    * A Node.js readable stream representing the response body.
    */
  var data: ReadableStream
  /**
    * An object containing the response headers.
    */
  var headers: Headers
  /**
    * The HTTP response code.
    */
  var statusCode: Double
}

object StreamProtocolResponse {
  @scala.inline
  def apply(data: ReadableStream, headers: Headers, statusCode: Double): StreamProtocolResponse = {
    val __obj = js.Dynamic.literal(data = data, headers = headers, statusCode = statusCode)
  
    __obj.asInstanceOf[StreamProtocolResponse]
  }
}

