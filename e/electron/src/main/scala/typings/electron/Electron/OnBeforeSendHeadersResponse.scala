package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBeforeSendHeadersResponse extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * When provided, request will be made with these headers.
    */
  var requestHeaders: js.UndefOr[RequestHeaders] = js.undefined
}

object OnBeforeSendHeadersResponse {
  @scala.inline
  def apply(cancel: js.UndefOr[Boolean] = js.undefined, requestHeaders: RequestHeaders = null): OnBeforeSendHeadersResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (requestHeaders != null) __obj.updateDynamic("requestHeaders")(requestHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnBeforeSendHeadersResponse]
  }
}

