package typings.electron.Electron

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeSendResponse extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * When provided, request will be made with these headers.
    */
  var requestHeaders: js.UndefOr[Record[String, String | js.Array[String]]] = js.undefined
}

object BeforeSendResponse {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    requestHeaders: Record[String, String | js.Array[String]] = null
  ): BeforeSendResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[BeforeSendResponse]
  }
}

