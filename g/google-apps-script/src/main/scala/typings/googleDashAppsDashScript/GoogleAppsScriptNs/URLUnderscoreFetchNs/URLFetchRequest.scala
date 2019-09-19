package typings.googleDashAppsDashScript.GoogleAppsScriptNs.URLUnderscoreFetchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait URLFetchRequest extends URLFetchRequestOptions {
  var url: String
}

object URLFetchRequest {
  @scala.inline
  def apply(
    url: String,
    contentType: String = null,
    escaping: js.UndefOr[Boolean] = js.undefined,
    followRedirects: js.UndefOr[Boolean] = js.undefined,
    headers: HttpHeaders = null,
    method: HttpMethod = null,
    muteHttpExceptions: js.UndefOr[Boolean] = js.undefined,
    payload: Payload = null,
    useIntranet: js.UndefOr[Boolean] = js.undefined,
    validateHttpsCertificates: js.UndefOr[Boolean] = js.undefined
  ): URLFetchRequest = {
    val __obj = js.Dynamic.literal(url = url)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (!js.isUndefined(escaping)) __obj.updateDynamic("escaping")(escaping)
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(muteHttpExceptions)) __obj.updateDynamic("muteHttpExceptions")(muteHttpExceptions)
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntranet)) __obj.updateDynamic("useIntranet")(useIntranet)
    if (!js.isUndefined(validateHttpsCertificates)) __obj.updateDynamic("validateHttpsCertificates")(validateHttpsCertificates)
    __obj.asInstanceOf[URLFetchRequest]
  }
}

