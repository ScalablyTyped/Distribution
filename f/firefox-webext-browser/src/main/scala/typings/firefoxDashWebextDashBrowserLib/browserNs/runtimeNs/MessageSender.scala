package typings
package firefoxDashWebextDashBrowserLib.browserNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object containing information about the script context that sent a message or request. */

trait MessageSender extends js.Object {
  /**
           * The frame that opened the connection. 0 for top-level frames, positive for child frames. This will only be
           * set when `tab` is set.
           */
  var frameId: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the extension or app that opened the connection, if any. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The `tabs.Tab` which opened the connection, if any. This property will **only** be present when the
           * connection was opened from a tab (including content scripts), and **only** if the receiver is an extension,
           * not an app.
           */
  var tab: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab] = js.undefined
  /**
           * The TLS channel ID of the page or frame that opened the connection, if requested by the extension or app,
           * and if available.
           * @deprecated Unsupported on Firefox at this time.
           */
  var tlsChannelId: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The URL of the page or frame that opened the connection. If the sender is in an iframe, it will be iframe's
           * URL not the URL of the page which hosts it.
           */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

