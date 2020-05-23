package typings.gapiClientClouderrorreporting.gapi.client.clouderrorreporting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestContext extends js.Object {
  /** The type of HTTP request, such as `GET`, `POST`, etc. */
  var method: js.UndefOr[String] = js.undefined
  /** The referrer information that is provided with the request. */
  var referrer: js.UndefOr[String] = js.undefined
  /**
    * The IP address from which the request originated.
    * This can be IPv4, IPv6, or a token which is derived from the
    * IP address, depending on the data that has been provided
    * in the error report.
    */
  var remoteIp: js.UndefOr[String] = js.undefined
  /** The HTTP response status code for the request. */
  var responseStatusCode: js.UndefOr[Double] = js.undefined
  /** The URL of the request. */
  var url: js.UndefOr[String] = js.undefined
  /** The user agent information that is provided with the request. */
  var userAgent: js.UndefOr[String] = js.undefined
}

object HttpRequestContext {
  @scala.inline
  def apply(
    method: String = null,
    referrer: String = null,
    remoteIp: String = null,
    responseStatusCode: js.UndefOr[Double] = js.undefined,
    url: String = null,
    userAgent: String = null
  ): HttpRequestContext = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (remoteIp != null) __obj.updateDynamic("remoteIp")(remoteIp.asInstanceOf[js.Any])
    if (!js.isUndefined(responseStatusCode)) __obj.updateDynamic("responseStatusCode")(responseStatusCode.get.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestContext]
  }
}

