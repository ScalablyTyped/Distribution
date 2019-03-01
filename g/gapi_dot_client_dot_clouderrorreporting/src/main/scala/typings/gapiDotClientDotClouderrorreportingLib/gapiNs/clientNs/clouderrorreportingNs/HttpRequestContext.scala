package typings
package gapiDotClientDotClouderrorreportingLib.gapiNs.clientNs.clouderrorreportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestContext extends js.Object {
  /** The type of HTTP request, such as `GET`, `POST`, etc. */
  var method: js.UndefOr[java.lang.String] = js.undefined
  /** The referrer information that is provided with the request. */
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The IP address from which the request originated.
    * This can be IPv4, IPv6, or a token which is derived from the
    * IP address, depending on the data that has been provided
    * in the error report.
    */
  var remoteIp: js.UndefOr[java.lang.String] = js.undefined
  /** The HTTP response status code for the request. */
  var responseStatusCode: js.UndefOr[scala.Double] = js.undefined
  /** The URL of the request. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The user agent information that is provided with the request. */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object HttpRequestContext {
  @scala.inline
  def apply(
    method: java.lang.String = null,
    referrer: java.lang.String = null,
    remoteIp: java.lang.String = null,
    responseStatusCode: scala.Int | scala.Double = null,
    url: java.lang.String = null,
    userAgent: java.lang.String = null
  ): HttpRequestContext = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (remoteIp != null) __obj.updateDynamic("remoteIp")(remoteIp)
    if (responseStatusCode != null) __obj.updateDynamic("responseStatusCode")(responseStatusCode.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url)
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[HttpRequestContext]
  }
}

