package typings.electron.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnHeadersReceivedResponse extends js.Object {
  var cancel: js.UndefOr[Boolean] = js.undefined
  /**
    * When provided, the server is assumed to have responded with these headers.
    */
  var responseHeaders: js.UndefOr[ResponseHeaders] = js.undefined
  /**
    * Should be provided when overriding responseHeaders to change header status
    * otherwise original response header's status will be used.
    */
  var statusLine: js.UndefOr[String] = js.undefined
}

object OnHeadersReceivedResponse {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    responseHeaders: ResponseHeaders = null,
    statusLine: String = null
  ): OnHeadersReceivedResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (statusLine != null) __obj.updateDynamic("statusLine")(statusLine)
    __obj.asInstanceOf[OnHeadersReceivedResponse]
  }
}

