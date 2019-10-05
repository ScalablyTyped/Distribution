package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.webRequest.HttpHeaders
import typings.firefoxDashWebextDashBrowser.browser.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentUrlFrameIdFromCacheIp extends js.Object {
  /** URL of the page into which the requested resource will be loaded. */
  var documentUrl: js.UndefOr[String] = js.undefined
  /**
    * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a
    * subframe in which the request happens. If the document of a (sub-)frame is loaded (`type` is `main_frame` or
    * `sub_frame`), `frameId` indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique
    * within a tab.
    */
  var frameId: Double
  /** Indicates if this response was fetched from disk cache. */
  var fromCache: Boolean
  /**
    * The server IP address that the request was actually sent to. Note that it may be a literal IPv6 address.
    */
  var ip: js.UndefOr[String] = js.undefined
  /** Standard HTTP method. */
  var method: String
  /** URL of the resource that triggered this request. */
  var originUrl: js.UndefOr[String] = js.undefined
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: Double
  /** The new URL. */
  var redirectUrl: String
  /**
    * The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to
    * relate different events of the same request.
    */
  var requestId: String
  /** The HTTP response headers that were received along with this redirect. */
  var responseHeaders: js.UndefOr[HttpHeaders] = js.undefined
  /** Standard HTTP status code returned by the server. */
  var statusCode: Double
  /**
    * HTTP status line of the response or the 'HTTP/0.9 200 OK' string for HTTP/0.9 responses (i.e., responses
    * that lack a status line) or an empty string if there are no headers.
    */
  var statusLine: String
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: Double
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: Double
  /** How the requested resource will be used. */
  var `type`: ResourceType
  var url: String
}

object Anon_DocumentUrlFrameIdFromCacheIp {
  @scala.inline
  def apply(
    frameId: Double,
    fromCache: Boolean,
    method: String,
    parentFrameId: Double,
    redirectUrl: String,
    requestId: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: ResourceType,
    url: String,
    documentUrl: String = null,
    ip: String = null,
    originUrl: String = null,
    responseHeaders: HttpHeaders = null
  ): Anon_DocumentUrlFrameIdFromCacheIp = {
    val __obj = js.Dynamic.literal(frameId = frameId, fromCache = fromCache, method = method, parentFrameId = parentFrameId, redirectUrl = redirectUrl, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (documentUrl != null) __obj.updateDynamic("documentUrl")(documentUrl)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (originUrl != null) __obj.updateDynamic("originUrl")(originUrl)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[Anon_DocumentUrlFrameIdFromCacheIp]
  }
}

