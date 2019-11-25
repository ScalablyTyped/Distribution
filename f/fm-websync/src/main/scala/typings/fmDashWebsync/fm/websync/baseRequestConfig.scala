package typings.fmDashWebsync.fm.websync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait baseRequestConfig extends js.Object {
  /**
    * Extra meta data to associate with the request/response.
    */
  var meta: js.UndefOr[js.Any] = js.undefined
  /**
    * The URL of the proxy to use for this request.
    */
  var requestUrl: js.UndefOr[String] = js.undefined
  /**
    * Whether to ignore errors when parsing the server response. If true, any errors thrown while parsing the JSON response received from the server will be ignored.
    * Defaults to false.
    */
  var suppressErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the request should be executed asynchronously. If true, the request will be executed synchronously if supported by the browser; otherwise,
    * it will be executed asynchronously. All browsers support synchronous requests if the request URL is the same domain as the page. Synchronous requests
    * are not supported in IE6 and IE7 for cross-domain environments. Defaults to false.
    */
  var sync: js.UndefOr[Boolean] = js.undefined
}

object baseRequestConfig {
  @scala.inline
  def apply(
    meta: js.Any = null,
    requestUrl: String = null,
    suppressErrors: js.UndefOr[Boolean] = js.undefined,
    sync: js.UndefOr[Boolean] = js.undefined
  ): baseRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[baseRequestConfig]
  }
}

