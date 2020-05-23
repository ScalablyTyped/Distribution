package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersReceivedResponse extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * When provided, the server is assumed to have responded with these headers.
    */
  var responseHeaders: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
  /**
    * Should be provided when overriding `responseHeaders` to change header status
    * otherwise original response header's status will be used.
    */
  var statusLine: js.UndefOr[String] = js.undefined
}

object HeadersReceivedResponse {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    responseHeaders: Record[String, String | js.Array[String]] = null,
    statusLine: String = null
  ): HeadersReceivedResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.get.asInstanceOf[js.Any])
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders.asInstanceOf[js.Any])
    if (statusLine != null) __obj.updateDynamic("statusLine")(statusLine.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersReceivedResponse]
  }
}

