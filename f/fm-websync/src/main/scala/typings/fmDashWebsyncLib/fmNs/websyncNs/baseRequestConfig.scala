package typings
package fmDashWebsyncLib.fmNs.websyncNs

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
  var requestUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to ignore errors when parsing the server response. If true, any errors thrown while parsing the JSON response received from the server will be ignored.
    * Defaults to false.
    */
  var suppressErrors: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the request should be executed asynchronously. If true, the request will be executed synchronously if supported by the browser; otherwise,
    * it will be executed asynchronously. All browsers support synchronous requests if the request URL is the same domain as the page. Synchronous requests
    * are not supported in IE6 and IE7 for cross-domain environments. Defaults to false.
    */
  var sync: js.UndefOr[scala.Boolean] = js.undefined
}

object baseRequestConfig {
  @scala.inline
  def apply(
    meta: js.Any = null,
    requestUrl: java.lang.String = null,
    suppressErrors: js.UndefOr[scala.Boolean] = js.undefined,
    sync: js.UndefOr[scala.Boolean] = js.undefined
  ): baseRequestConfig = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    if (!js.isUndefined(suppressErrors)) __obj.updateDynamic("suppressErrors")(suppressErrors)
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync)
    __obj.asInstanceOf[baseRequestConfig]
  }
}

