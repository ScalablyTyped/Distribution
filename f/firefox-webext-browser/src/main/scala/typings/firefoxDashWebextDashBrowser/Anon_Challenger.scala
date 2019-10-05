package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.webRequest.HttpHeaders
import typings.firefoxDashWebextDashBrowser.browser.webRequest.ResourceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Challenger extends js.Object {
  /** The server requesting authentication. */
  var challenger: Anon_Host
  /** URL of the page into which the requested resource will be loaded. */
  var documentUrl: js.UndefOr[String] = js.undefined
  /**
    * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a
    * subframe in which the request happens. If the document of a (sub-)frame is loaded (`type` is `main_frame` or
    * `sub_frame`), `frameId` indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique
    * within a tab.
    */
  var frameId: Double
  /** True for Proxy-Authenticate, false for WWW-Authenticate. */
  var isProxy: Boolean
  /** Standard HTTP method. */
  var method: String
  /** URL of the resource that triggered this request. */
  var originUrl: js.UndefOr[String] = js.undefined
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: Double
  /** The authentication realm provided by the server, if there is one. */
  var realm: js.UndefOr[String] = js.undefined
  /**
    * The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to
    * relate different events of the same request.
    */
  var requestId: String
  /** The HTTP response headers that were received along with this response. */
  var responseHeaders: js.UndefOr[HttpHeaders] = js.undefined
  /** The authentication scheme, e.g. Basic or Digest. */
  var scheme: String
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

object Anon_Challenger {
  @scala.inline
  def apply(
    challenger: Anon_Host,
    frameId: Double,
    isProxy: Boolean,
    method: String,
    parentFrameId: Double,
    requestId: String,
    scheme: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: ResourceType,
    url: String,
    documentUrl: String = null,
    originUrl: String = null,
    realm: String = null,
    responseHeaders: HttpHeaders = null
  ): Anon_Challenger = {
    val __obj = js.Dynamic.literal(challenger = challenger, frameId = frameId, isProxy = isProxy, method = method, parentFrameId = parentFrameId, requestId = requestId, scheme = scheme, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (documentUrl != null) __obj.updateDynamic("documentUrl")(documentUrl)
    if (originUrl != null) __obj.updateDynamic("originUrl")(originUrl)
    if (realm != null) __obj.updateDynamic("realm")(realm)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    __obj.asInstanceOf[Anon_Challenger]
  }
}

