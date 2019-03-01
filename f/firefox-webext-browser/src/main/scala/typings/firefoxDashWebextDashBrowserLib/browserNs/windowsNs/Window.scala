package typings
package firefoxDashWebextDashBrowserLib.browserNs.windowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /** Whether the window is set to be always on top. */
  var alwaysOnTop: scala.Boolean
  /** Whether the window is currently the focused window. */
  var focused: scala.Boolean
  /**
    * The height of the window, including the frame, in pixels. Under some circumstances a Window may not be
    * assigned height property, for example when querying closed windows from the `sessions` API.
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may
    * not be assigned an ID, for example when querying windows using the `sessions` API, in which case a session
    * ID may be present.
    */
  var id: js.UndefOr[scala.Double] = js.undefined
  /** Whether the window is incognito. */
  var incognito: scala.Boolean
  /**
    * The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may
    * not be assigned left property, for example when querying closed windows from the `sessions` API.
    */
  var left: js.UndefOr[scala.Double] = js.undefined
  /** The session ID used to uniquely identify a Window obtained from the `sessions` API. */
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  /** The state of this browser window. */
  var state: js.UndefOr[WindowState] = js.undefined
  /** Array of `tabs.Tab` objects representing the current tabs in the window. */
  var tabs: js.UndefOr[js.Array[firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab]] = js.undefined
  /** The title of the window. Read-only. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may
    * not be assigned top property, for example when querying closed windows from the `sessions` API.
    */
  var top: js.UndefOr[scala.Double] = js.undefined
  /** The type of browser window this is. */
  var `type`: js.UndefOr[WindowType] = js.undefined
  /**
    * The width of the window, including the frame, in pixels. Under some circumstances a Window may not be
    * assigned width property, for example when querying closed windows from the `sessions` API.
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    alwaysOnTop: scala.Boolean,
    focused: scala.Boolean,
    incognito: scala.Boolean,
    height: scala.Int | scala.Double = null,
    id: scala.Int | scala.Double = null,
    left: scala.Int | scala.Double = null,
    sessionId: java.lang.String = null,
    state: WindowState = null,
    tabs: js.Array[firefoxDashWebextDashBrowserLib.browserNs.tabsNs.Tab] = null,
    title: java.lang.String = null,
    top: scala.Int | scala.Double = null,
    `type`: WindowType = null,
    width: scala.Int | scala.Double = null
  ): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alwaysOnTop")(alwaysOnTop)
    __obj.updateDynamic("focused")(focused)
    __obj.updateDynamic("incognito")(incognito)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId)
    if (state != null) __obj.updateDynamic("state")(state)
    if (tabs != null) __obj.updateDynamic("tabs")(tabs)
    if (title != null) __obj.updateDynamic("title")(title)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

