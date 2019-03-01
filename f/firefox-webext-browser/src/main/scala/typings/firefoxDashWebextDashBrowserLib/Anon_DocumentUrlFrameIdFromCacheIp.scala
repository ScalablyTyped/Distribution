package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocumentUrlFrameIdFromCacheIp extends js.Object {
  /** URL of the page into which the requested resource will be loaded. */
  var documentUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a
    * subframe in which the request happens. If the document of a (sub-)frame is loaded (`type` is `main_frame` or
    * `sub_frame`), `frameId` indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique
    * within a tab.
    */
  var frameId: scala.Double
  /** Indicates if this response was fetched from disk cache. */
  var fromCache: scala.Boolean
  /**
    * The server IP address that the request was actually sent to. Note that it may be a literal IPv6 address.
    */
  var ip: js.UndefOr[java.lang.String] = js.undefined
  /** Standard HTTP method. */
  var method: java.lang.String
  /** URL of the resource that triggered this request. */
  var originUrl: js.UndefOr[java.lang.String] = js.undefined
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: scala.Double
  /** The new URL. */
  var redirectUrl: java.lang.String
  /**
    * The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to
    * relate different events of the same request.
    */
  var requestId: java.lang.String
  /** The HTTP response headers that were received along with this redirect. */
  var responseHeaders: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.webRequestNs.HttpHeaders] = js.undefined
  /** Standard HTTP status code returned by the server. */
  var statusCode: scala.Double
  /**
    * HTTP status line of the response or the 'HTTP/0.9 200 OK' string for HTTP/0.9 responses (i.e., responses
    * that lack a status line) or an empty string if there are no headers.
    */
  var statusLine: java.lang.String
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: scala.Double
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: scala.Double
  /** How the requested resource will be used. */
  var `type`: firefoxDashWebextDashBrowserLib.browserNs.webRequestNs.ResourceType
  var url: java.lang.String
}

object Anon_DocumentUrlFrameIdFromCacheIp {
  @scala.inline
  def apply(
    frameId: scala.Double,
    fromCache: scala.Boolean,
    method: java.lang.String,
    parentFrameId: scala.Double,
    redirectUrl: java.lang.String,
    requestId: java.lang.String,
    statusCode: scala.Double,
    statusLine: java.lang.String,
    tabId: scala.Double,
    timeStamp: scala.Double,
    `type`: firefoxDashWebextDashBrowserLib.browserNs.webRequestNs.ResourceType,
    url: java.lang.String,
    documentUrl: java.lang.String = null,
    ip: java.lang.String = null,
    originUrl: java.lang.String = null,
    responseHeaders: firefoxDashWebextDashBrowserLib.browserNs.webRequestNs.HttpHeaders = null
  ): Anon_DocumentUrlFrameIdFromCacheIp = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("frameId")(frameId)
    __obj.updateDynamic("fromCache")(fromCache)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("parentFrameId")(parentFrameId)
    __obj.updateDynamic("redirectUrl")(redirectUrl)
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.updateDynamic("statusLine")(statusLine)
    __obj.updateDynamic("tabId")(tabId)
    __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.updateDynamic("url")(url)
    if (documentUrl != null) __obj.updateDynamic("documentUrl")(documentUrl)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (originUrl != null) __obj.updateDynamic("originUrl")(originUrl)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[Anon_DocumentUrlFrameIdFromCacheIp]
  }
}

