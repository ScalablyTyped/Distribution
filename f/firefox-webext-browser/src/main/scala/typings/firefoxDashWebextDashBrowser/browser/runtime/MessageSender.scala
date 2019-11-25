package typings.firefoxDashWebextDashBrowser.browser.runtime

import typings.firefoxDashWebextDashBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object containing information about the script context that sent a message or request. */
trait MessageSender extends js.Object {
  /**
    * The frame that opened the connection. 0 for top-level frames, positive for child frames. This will only be
    * set when `tab` is set.
    */
  var frameId: js.UndefOr[Double] = js.undefined
  /** The ID of the extension or app that opened the connection, if any. */
  var id: js.UndefOr[String] = js.undefined
  /**
    * The `tabs.Tab` which opened the connection, if any. This property will **only** be present when the
    * connection was opened from a tab (including content scripts), and **only** if the receiver is an extension,
    * not an app.
    */
  var tab: js.UndefOr[Tab] = js.undefined
  /**
    * The TLS channel ID of the page or frame that opened the connection, if requested by the extension or app,
    * and if available.
    * @deprecated Unsupported on Firefox at this time.
    */
  var tlsChannelId: js.UndefOr[String] = js.undefined
  /**
    * The URL of the page or frame that opened the connection. If the sender is in an iframe, it will be iframe's
    * URL not the URL of the page which hosts it.
    */
  var url: js.UndefOr[String] = js.undefined
}

object MessageSender {
  @scala.inline
  def apply(
    frameId: Int | Double = null,
    id: String = null,
    tab: Tab = null,
    tlsChannelId: String = null,
    url: String = null
  ): MessageSender = {
    val __obj = js.Dynamic.literal()
    if (frameId != null) __obj.updateDynamic("frameId")(frameId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    if (tlsChannelId != null) __obj.updateDynamic("tlsChannelId")(tlsChannelId.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageSender]
  }
}

