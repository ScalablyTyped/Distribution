package typings.electron.Electron

import typings.node.NodeJS.ReadableStream
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamProtocolResponse extends js.Object {
  // Docs: http://electronjs.org/docs/api/structures/stream-protocol-response
  /**
    * A Node.js readable stream representing the response body.
    */
  var data: ReadableStream | Null = js.native
  /**
    * An object containing the response headers.
    */
  var headers: js.UndefOr[Record[String, String | js.Array[String]]] = js.native
  /**
    * The HTTP response code.
    */
  var statusCode: js.UndefOr[Double] = js.native
}

object StreamProtocolResponse {
  @scala.inline
  def apply(): StreamProtocolResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProtocolResponse]
  }
  @scala.inline
  implicit class StreamProtocolResponseOps[Self <: StreamProtocolResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: ReadableStream): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    @scala.inline
    def setHeaders(value: Record[String, String | js.Array[String]]): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
  
}

