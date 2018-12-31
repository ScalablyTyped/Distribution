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

