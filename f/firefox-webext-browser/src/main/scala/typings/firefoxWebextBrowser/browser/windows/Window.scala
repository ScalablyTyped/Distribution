package typings.firefoxWebextBrowser.browser.windows

import typings.firefoxWebextBrowser.browser.tabs.Tab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  /** Whether the window is set to be always on top. */
  var alwaysOnTop: Boolean
  /** Whether the window is currently the focused window. */
  var focused: Boolean
  /**
    * The height of the window, including the frame, in pixels. Under some circumstances a Window may not be
    * assigned height property, for example when querying closed windows from the `sessions` API.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * The ID of the window. Window IDs are unique within a browser session. Under some circumstances a Window may
    * not be assigned an ID, for example when querying windows using the `sessions` API, in which case a session
    * ID may be present.
    */
  var id: js.UndefOr[Double] = js.undefined
  /** Whether the window is incognito. */
  var incognito: Boolean
  /**
    * The offset of the window from the left edge of the screen in pixels. Under some circumstances a Window may
    * not be assigned left property, for example when querying closed windows from the `sessions` API.
    */
  var left: js.UndefOr[Double] = js.undefined
  /** The session ID used to uniquely identify a Window obtained from the `sessions` API. */
  var sessionId: js.UndefOr[String] = js.undefined
  /** The state of this browser window. */
  var state: js.UndefOr[WindowState] = js.undefined
  /** Array of `tabs.Tab` objects representing the current tabs in the window. */
  var tabs: js.UndefOr[js.Array[Tab]] = js.undefined
  /** The title of the window. Read-only. */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The offset of the window from the top edge of the screen in pixels. Under some circumstances a Window may
    * not be assigned top property, for example when querying closed windows from the `sessions` API.
    */
  var top: js.UndefOr[Double] = js.undefined
  /** The type of browser window this is. */
  var `type`: js.UndefOr[WindowType] = js.undefined
  /**
    * The width of the window, including the frame, in pixels. Under some circumstances a Window may not be
    * assigned width property, for example when querying closed windows from the `sessions` API.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Window {
  @scala.inline
  def apply(
    alwaysOnTop: Boolean,
    focused: Boolean,
    incognito: Boolean,
    height: js.UndefOr[Double] = js.undefined,
    id: js.UndefOr[Double] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    sessionId: String = null,
    state: WindowState = null,
    tabs: js.Array[Tab] = null,
    title: String = null,
    top: js.UndefOr[Double] = js.undefined,
    `type`: WindowType = null,
    width: js.UndefOr[Double] = js.undefined
  ): Window = {
    val __obj = js.Dynamic.literal(alwaysOnTop = alwaysOnTop.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], incognito = incognito.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (sessionId != null) __obj.updateDynamic("sessionId")(sessionId.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tabs != null) __obj.updateDynamic("tabs")(tabs.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Window]
  }
}

