package typings.googleAppsScript.GoogleAppsScript.URLFetch

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
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (!js.isUndefined(escaping)) __obj.updateDynamic("escaping")(escaping.asInstanceOf[js.Any])
    if (!js.isUndefined(followRedirects)) __obj.updateDynamic("followRedirects")(followRedirects.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (!js.isUndefined(muteHttpExceptions)) __obj.updateDynamic("muteHttpExceptions")(muteHttpExceptions.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (!js.isUndefined(useIntranet)) __obj.updateDynamic("useIntranet")(useIntranet.asInstanceOf[js.Any])
    if (!js.isUndefined(validateHttpsCertificates)) __obj.updateDynamic("validateHttpsCertificates")(validateHttpsCertificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLFetchRequest]
  }
}

