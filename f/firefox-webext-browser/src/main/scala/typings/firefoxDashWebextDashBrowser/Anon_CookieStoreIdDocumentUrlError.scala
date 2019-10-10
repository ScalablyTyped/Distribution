package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.webRequest.ResourceType
import typings.firefoxDashWebextDashBrowser.browser.webRequest.UrlClassification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CookieStoreIdDocumentUrlError extends js.Object {
  /** The cookie store ID of the contextual identity. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  /** URL of the page into which the requested resource will be loaded. */
  var documentUrl: js.UndefOr[String] = js.undefined
  /**
    * The error description. This string is _not_ guaranteed to remain backwards compatible between releases. You
    * must not parse and act based upon its content.
    */
  var error: String
  /**
    * The value 0 indicates that the request happens in the main frame; a positive value indicates the ID of a
    * subframe in which the request happens. If the document of a (sub-)frame is loaded (`type` is `main_frame` or
    * `sub_frame`), `frameId` indicates the ID of this frame, not the ID of the outer frame. Frame IDs are unique
    * within a tab.
    */
  var frameId: Double
  /** Indicates if this response was fetched from disk cache. */
  var fromCache: Boolean
  /** True for private browsing requests. */
  var incognito: js.UndefOr[Boolean] = js.undefined
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
  /**
    * The ID of the request. Request IDs are unique within a browser session. As a result, they could be used to
    * relate different events of the same request.
    */
  var requestId: String
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

object Anon_CookieStoreIdDocumentUrlError {
  @scala.inline
  def apply(
    error: String,
    frameId: Double,
    fromCache: Boolean,
    method: String,
    parentFrameId: Double,
    requestId: String,
    tabId: Double,
    timeStamp: Double,
    `type`: ResourceType,
    url: String,
    cookieStoreId: String = null,
    documentUrl: String = null,
    incognito: js.UndefOr[Boolean] = js.undefined,
    ip: String = null,
    originUrl: String = null,
    urlClassification: UrlClassification = null
  ): Anon_CookieStoreIdDocumentUrlError = {
    val __obj = js.Dynamic.literal(error = error, frameId = frameId, fromCache = fromCache, method = method, parentFrameId = parentFrameId, requestId = requestId, tabId = tabId, timeStamp = timeStamp, url = url)
    __obj.updateDynamic("type")(`type`)
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId)
    if (documentUrl != null) __obj.updateDynamic("documentUrl")(documentUrl)
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (originUrl != null) __obj.updateDynamic("originUrl")(originUrl)
    if (urlClassification != null) __obj.updateDynamic("urlClassification")(urlClassification)
    __obj.asInstanceOf[Anon_CookieStoreIdDocumentUrlError]
  }
}

