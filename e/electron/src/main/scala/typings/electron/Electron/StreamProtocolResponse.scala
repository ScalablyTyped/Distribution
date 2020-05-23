package typings.electron.Electron

import typings.node.NodeJS.ReadableStream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamProtocolResponse extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/stream-protocol-response
  /**
    * A Node.js readable stream representing the response body.
    */
  var data: ReadableStream | Null
  /**
    * An object containing the response headers.
    */
  var headers: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  /**
    * The HTTP response code.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
}

object StreamProtocolResponse {
  @scala.inline
  def apply(
    data: ReadableStream = null,
    headers: Record[String, String | js.Array[String]] = null,
    statusCode: js.UndefOr[Double] = js.undefined
  ): StreamProtocolResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(statusCode)) __obj.updateDynamic("statusCode")(statusCode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProtocolResponse]
  }
}

