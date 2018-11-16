package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_State extends js.Object {
  /**
           * If true, causes the window to be displayed in a manner that draws the user's attention to the window,
           * without changing the focused window. The effect lasts until the user changes focus to the window. This
           * option has no effect if the window already has focus. Set to false to cancel a previous draw attention
           * request.
           */
  var drawAttention: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * If true, brings the window to the front. If false, brings the next window in the z-order to the front.
           */
  var focused: js.UndefOr[scala.Boolean] = js.undefined
  /** The height to resize the window to in pixels. This value is ignored for panels. */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
           * The offset from the left edge of the screen to move the window to in pixels. This value is ignored for
           * panels.
           */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
           * The new state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined with
           * 'left', 'top', 'width' or 'height'.
           */
  var state: js.UndefOr[firefoxDashWebextDashBrowserLib.browserNs.windowsNs.WindowState] = js.undefined
  /** A string to add to the beginning of the window title. */
  var titlePreface: js.UndefOr[java.lang.String] = js.undefined
  /**
           * The offset from the top edge of the screen to move the window to in pixels. This value is ignored for panels.
           */
  var top: js.UndefOr[scala.Double] = js.undefined
  /** The width to resize the window to in pixels. This value is ignored for panels. */
  var width: js.UndefOr[scala.Double] = js.undefined
}

