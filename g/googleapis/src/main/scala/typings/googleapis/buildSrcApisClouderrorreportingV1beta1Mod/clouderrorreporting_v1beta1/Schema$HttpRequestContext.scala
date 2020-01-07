package typings.googleapis.buildSrcApisClouderrorreportingV1beta1Mod.clouderrorreporting_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * HTTP request data that is related to a reported error. This data should be
  * provided by the application when reporting an error, unless the error
  * report has been generated automatically from Google App Engine logs.
  */
@js.native
trait Schema$HttpRequestContext extends js.Object {
  /**
    * The type of HTTP request, such as `GET`, `POST`, etc.
    */
  var method: js.UndefOr[String] = js.native
  /**
    * The referrer information that is provided with the request.
    */
  var referrer: js.UndefOr[String] = js.native
  /**
    * The IP address from which the request originated. This can be IPv4, IPv6,
    * or a token which is derived from the IP address, depending on the data
    * that has been provided in the error report.
    */
  var remoteIp: js.UndefOr[String] = js.native
  /**
    * The HTTP response status code for the request.
    */
  var responseStatusCode: js.UndefOr[Double] = js.native
  /**
    * The URL of the request.
    */
  var url: js.UndefOr[String] = js.native
  /**
    * The user agent information that is provided with the request.
    */
  var userAgent: js.UndefOr[String] = js.native
}

object Schema$HttpRequestContext {
  @scala.inline
  def apply(
    method: String = null,
    referrer: String = null,
    remoteIp: String = null,
    responseStatusCode: Int | Double = null,
    url: String = null,
    userAgent: String = null
  ): Schema$HttpRequestContext = {
    val __obj = js.Dynamic.literal()
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (remoteIp != null) __obj.updateDynamic("remoteIp")(remoteIp.asInstanceOf[js.Any])
    if (responseStatusCode != null) __obj.updateDynamic("responseStatusCode")(responseStatusCode.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpRequestContext]
  }
}

