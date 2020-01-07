package typings.googleapis.buildSrcApisLoggingV2Mod.logging_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A common proto for logging HTTP requests. Only contains semantics defined
  * by the HTTP specification. Product-specific logging information MUST be
  * defined in a separate message.
  */
@js.native
trait Schema$HttpRequest extends js.Object {
  /**
    * The number of HTTP response bytes inserted into cache. Set only when a
    * cache fill was attempted.
    */
  var cacheFillBytes: js.UndefOr[String] = js.native
  /**
    * Whether or not an entity was served from cache (with or without
    * validation).
    */
  var cacheHit: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not a cache lookup was attempted.
    */
  var cacheLookup: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the response was validated with the origin server before
    * being served from cache. This field is only meaningful if cache_hit is
    * True.
    */
  var cacheValidatedWithOriginServer: js.UndefOr[Boolean] = js.native
  /**
    * The request processing latency on the server, from the time the request
    * was received until the response was sent.
    */
  var latency: js.UndefOr[String] = js.native
  /**
    * Protocol used for the request. Examples: &quot;HTTP/1.1&quot;,
    * &quot;HTTP/2&quot;, &quot;websocket&quot;
    */
  var protocol: js.UndefOr[String] = js.native
  /**
    * The referer URL of the request, as defined in HTTP/1.1 Header Field
    * Definitions (http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html).
    */
  var referer: js.UndefOr[String] = js.native
  /**
    * The IP address (IPv4 or IPv6) of the client that issued the HTTP request.
    * Examples: &quot;192.168.1.1&quot;, &quot;FE80::0202:B3FF:FE1E:8329&quot;.
    */
  var remoteIp: js.UndefOr[String] = js.native
  /**
    * The request method. Examples: &quot;GET&quot;, &quot;HEAD&quot;,
    * &quot;PUT&quot;, &quot;POST&quot;.
    */
  var requestMethod: js.UndefOr[String] = js.native
  /**
    * The size of the HTTP request message in bytes, including the request
    * headers and the request body.
    */
  var requestSize: js.UndefOr[String] = js.native
  /**
    * The scheme (http, https), the host name, the path and the query portion
    * of the URL that was requested. Example:
    * &quot;http://example.com/some/info?color=red&quot;.
    */
  var requestUrl: js.UndefOr[String] = js.native
  /**
    * The size of the HTTP response message sent back to the client, in bytes,
    * including the response headers and the response body.
    */
  var responseSize: js.UndefOr[String] = js.native
  /**
    * The IP address (IPv4 or IPv6) of the origin server that the request was
    * sent to.
    */
  var serverIp: js.UndefOr[String] = js.native
  /**
    * The response code indicating the status of response. Examples: 200, 404.
    */
  var status: js.UndefOr[Double] = js.native
  /**
    * The user agent sent by the client. Example: &quot;Mozilla/4.0
    * (compatible; MSIE 6.0; Windows 98; Q312461; .NET CLR 1.0.3705)&quot;.
    */
  var userAgent: js.UndefOr[String] = js.native
}

object Schema$HttpRequest {
  @scala.inline
  def apply(
    cacheFillBytes: String = null,
    cacheHit: js.UndefOr[Boolean] = js.undefined,
    cacheLookup: js.UndefOr[Boolean] = js.undefined,
    cacheValidatedWithOriginServer: js.UndefOr[Boolean] = js.undefined,
    latency: String = null,
    protocol: String = null,
    referer: String = null,
    remoteIp: String = null,
    requestMethod: String = null,
    requestSize: String = null,
    requestUrl: String = null,
    responseSize: String = null,
    serverIp: String = null,
    status: Int | Double = null,
    userAgent: String = null
  ): Schema$HttpRequest = {
    val __obj = js.Dynamic.literal()
    if (cacheFillBytes != null) __obj.updateDynamic("cacheFillBytes")(cacheFillBytes.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheHit)) __obj.updateDynamic("cacheHit")(cacheHit.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheLookup)) __obj.updateDynamic("cacheLookup")(cacheLookup.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheValidatedWithOriginServer)) __obj.updateDynamic("cacheValidatedWithOriginServer")(cacheValidatedWithOriginServer.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (referer != null) __obj.updateDynamic("referer")(referer.asInstanceOf[js.Any])
    if (remoteIp != null) __obj.updateDynamic("remoteIp")(remoteIp.asInstanceOf[js.Any])
    if (requestMethod != null) __obj.updateDynamic("requestMethod")(requestMethod.asInstanceOf[js.Any])
    if (requestSize != null) __obj.updateDynamic("requestSize")(requestSize.asInstanceOf[js.Any])
    if (requestUrl != null) __obj.updateDynamic("requestUrl")(requestUrl.asInstanceOf[js.Any])
    if (responseSize != null) __obj.updateDynamic("responseSize")(responseSize.asInstanceOf[js.Any])
    if (serverIp != null) __obj.updateDynamic("serverIp")(serverIp.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (userAgent != null) __obj.updateDynamic("userAgent")(userAgent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HttpRequest]
  }
}

