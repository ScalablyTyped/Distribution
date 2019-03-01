package typings
package gapiDotClientDotLoggingLib.gapiNs.clientNs.loggingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequest extends js.Object {
  /** The number of HTTP response bytes inserted into cache. Set only when a cache fill was attempted. */
  var cacheFillBytes: js.UndefOr[java.lang.String] = js.undefined
  /** Whether or not an entity was served from cache (with or without validation). */
  var cacheHit: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not a cache lookup was attempted. */
  var cacheLookup: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether or not the response was validated with the origin server before being served from cache. This field is only meaningful if cache_hit is True. */
  var cacheValidatedWithOriginServer: js.UndefOr[scala.Boolean] = js.undefined
  /** The request processing latency on the server, from the time the request was received until the response was sent. */
  var latency: js.UndefOr[java.lang.String] = js.undefined
  /** Protocol used for the request. Examples: "HTTP/1.1", "HTTP/2", "websocket" */
  var protocol: js.UndefOr[java.lang.String] = js.undefined
  /** The referer URL of the request, as defined in HTTP/1.1 Header Field Definitions (http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html). */
  var referer: js.UndefOr[java.lang.String] = js.undefined
  /** The IP address (IPv4 or IPv6) of the client that issued the HTTP request. Examples: "192.168.1.1", "FE80::0202:B3FF:FE1E:8329". */
  var remoteIp: js.UndefOr[java.lang.String] = js.undefined
  /** The request method. Examples: "GET", "HEAD", "PUT", "POST". */
  var requestMethod: js.UndefOr[java.lang.String] = js.undefined
  /** The size of the HTTP request message in bytes, including the request headers and the request body. */
  var requestSize: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The scheme (http, https), the host name, the path and the query portion of the URL that was requested. Example:
    * "http://example.com/some/info?color=red".
    */
  var requestUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The size of the HTTP response message sent back to the client, in bytes, including the response headers and the response body. */
  var responseSize: js.UndefOr[java.lang.String] = js.undefined
  /** The IP address (IPv4 or IPv6) of the origin server that the request was sent to. */
  var serverIp: js.UndefOr[java.lang.String] = js.undefined
  /** The response code indicating the status of response. Examples: 200, 404. */
  var status: js.UndefOr[scala.Double] = js.undefined
  /** The user agent sent by the client. Example: "Mozilla/4.0 (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)". */
  var userAgent: js.UndefOr[java.lang.String] = js.undefined
}

object HttpRequest {
  @scala.inline
  def apply(
    cacheFillBytes: java.lang.String = null,
    cacheHit: js.UndefOr[scala.Boolean] = js.undefined,
    cacheLookup: js.UndefOr[scala.Boolean] = js.undefined,
    cacheValidatedWithOriginServer: js.UndefOr[scala.Boolean] = js.undefined,
    latency: java.lang.String = null,
    protocol: java.lang.String = null,
    referer: java.lang.String = null,
    remoteIp: java.lang.String = null,
    requestMethod: java.lang.String = null,
    requestSize: java.lang.String = null,
    requestUrl: java.lang.String = null,
    responseSize: java.lang.String = null,
    serverIp: java.lang.String = null,
    status: scala.Int | scala.Double = null,
    userAgent: java.lang.String = null
  ): HttpRequest = {
    val __obj = js.Dynamic.literal()
    if (cacheFillBytes != null) __obj.updateDynamic("cacheFillBytes")(cacheFillBytes)
    if (!js.isUndefined(cacheHit)) __obj.updateDynamic("cacheHit")(cacheHit)
    if (!js.isUndefined(cacheLookup)) __obj.updateDynamic("cacheLookup")(cacheLookup)
    if (!js.isUndefined(cacheValidatedWithOriginServer)) __obj.updateDynamic("cacheValidatedWithOriginServer")(cacheValidatedWithOriginServer)
    if (latency != null) __obj.updateDynamic("latency")(latency)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    if (referer != null) __obj.updateDynamic("referer")(referer)
    if (remoteIp != null) __obj.updateDynamic("remoteIp")(remoteIp)
    if (requestMethod != null) __obj.updateDynamic("requestMethod")(requestMethod)
    if (requestSize != null) __obj.updateDynamic("requestSize")(requestSize)
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl)
    if (responseSize != null) __obj.updateDynamic("responseSize")(responseSize)
    if (serverIp != null) __obj.updateDynamic("serverIp")(serverIp)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent)
    __obj.asInstanceOf[HttpRequest]
  }
}

