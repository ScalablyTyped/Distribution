package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.webRequest.HttpHeaders
import typings.firefoxDashWebextDashBrowser.browser.webRequest.ResourceType
import typings.firefoxDashWebextDashBrowser.browser.webRequest.UrlClassification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieStoreIdDocumentUrlFrameIdIncognito extends js.Object {
  /** The cookie store ID of the contextual identity. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  /** URL of the page into which the requested resource will be loaded. */
  var documentUrl: js.UndefOr[String] = js.undefined
  /**
    * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a
    * subframe in which the request happens. If the document of a (sub-)frame is loaded (`type` is `main_frame` or
    * `sub_frame`), `frameId` indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique
    * within a tab.
    */
  var frameId: Double
  /** True for private browsing requests. */
  var incognito: js.UndefOr[Boolean] = js.undefined
  /** Standard HTTP method. */
  var method: String
  /** URL of the resource that triggered this request. */
  var originUrl: js.UndefOr[String] = js.undefined
  /** ID of frame that wraps the frame which sent the request. Set to -1 if no parent frame exists. */
  var parentFrameId: Double
  /**
    * The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to
    * relate different events of the same request.
    */
  var requestId: String
  /** The HTTP response headers that have been received with this response. */
  var responseHeaders: js.UndefOr[HttpHeaders] = js.undefined
  /** Standard HTTP status code returned by the server. */
  var statusCode: Double
  /**
    * HTTP status line of the response or the 'HTTP/0.9 200 OK' string for HTTP/0.9 responses (i.e., responses
    * that lack a status line).
    */
  var statusLine: String
  /** The ID of the tab in which the request takes place. Set to -1 if the request isn't related to a tab. */
  var tabId: Double
  /** The time when this signal is triggered, in milliseconds since the epoch. */
  var timeStamp: Double
  /** How the requested resource will be used. */
  var `type`: ResourceType
  var url: String
  /** Tracking classification if the request has been classified. */
  var urlClassification: js.UndefOr[UrlClassification] = js.undefined
}

object Anon_CookieStoreIdDocumentUrlFrameIdIncognito {
  @scala.inline
  def apply(
    frameId: Double,
    method: String,
    parentFrameId: Double,
    requestId: String,
    statusCode: Double,
    statusLine: String,
    tabId: Double,
    timeStamp: Double,
    `type`: ResourceType,
    url: String,
    cookieStoreId: String = null,
    documentUrl: String = null,
    incognito: js.UndefOr[Boolean] = js.undefined,
    originUrl: String = null,
    responseHeaders: HttpHeaders = null,
    urlClassification: UrlClassification = null
  ): Anon_CookieStoreIdDocumentUrlFrameIdIncognito = {
    val __obj = js.Dynamic.literal(frameId = frameId, method = method, parentFrameId = parentFrameId, requestId = requestId, statusCode = statusCode, statusLine = statusLine, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId)
    if (documentUrl != null) __obj.updateDynamic("documentUrl")(documentUrl)
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    if (originUrl != null) __obj.updateDynamic("originUrl")(originUrl)
    if (responseHeaders != null) __obj.updateDynamic("responseHeaders")(responseHeaders)
    if (urlClassification != null) __obj.updateDynamic("urlClassification")(urlClassification)
    __obj.asInstanceOf[Anon_CookieStoreIdDocumentUrlFrameIdIncognito]
  }
}

