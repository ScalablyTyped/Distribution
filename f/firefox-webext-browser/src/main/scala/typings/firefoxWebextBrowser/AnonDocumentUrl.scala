package typings.firefoxWebextBrowser

import typings.firefoxWebextBrowser.browser.webRequest.ResourceType
import typings.firefoxWebextBrowser.browser.webRequest.UrlClassification
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDocumentUrl extends js.Object {
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
  /** Contains the HTTP request body data. Only provided if extraInfoSpec contains 'requestBody'. */
  var requestBody: js.UndefOr[AnonFormData] = js.undefined
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

object AnonDocumentUrl {
  @scala.inline
  def apply(
    frameId: Double,
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
    originUrl: String = null,
    requestBody: AnonFormData = null,
    urlClassification: UrlClassification = null
  ): AnonDocumentUrl = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parentFrameId = parentFrameId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId.asInstanceOf[js.Any])
    if (documentUrl != null) __obj.updateDynamic("documentUrl")(documentUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito.asInstanceOf[js.Any])
    if (originUrl != null) __obj.updateDynamic("originUrl")(originUrl.asInstanceOf[js.Any])
    if (requestBody != null) __obj.updateDynamic("requestBody")(requestBody.asInstanceOf[js.Any])
    if (urlClassification != null) __obj.updateDynamic("urlClassification")(urlClassification.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDocumentUrl]
  }
}

