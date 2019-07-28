package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browserNs.windowsNs.CreateType
import typings.firefoxDashWebextDashBrowser.browserNs.windowsNs.WindowState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowScriptsToClose extends js.Object {
  /** Allow scripts to close the window. */
  var allowScriptsToClose: js.UndefOr[Boolean] = js.undefined
  /** The CookieStoreId to use for all tabs that were created when the window is opened. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  /**
    * If true, opens an active window. If false, opens an inactive window.
    * @deprecated Unsupported on Firefox at this time.
    */
  var focused: js.UndefOr[Boolean] = js.undefined
  /**
    * The height in pixels of the new window, including the frame. If not specified defaults to a natural height.
    */
  var height: js.UndefOr[Double] = js.undefined
  /** Whether the new window should be an incognito window. */
  var incognito: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of pixels to position the new window from the left edge of the screen. If not specified, the new
    * window is offset naturally from the last focused window. This value is ignored for panels.
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    * The initial state of the window. The 'minimized', 'maximized' and 'fullscreen' states cannot be combined
    * with 'left', 'top', 'width' or 'height'.
    */
  var state: js.UndefOr[WindowState] = js.undefined
  /** The id of the tab for which you want to adopt to the new window. */
  var tabId: js.UndefOr[Double] = js.undefined
  /** A string to add to the beginning of the window title. */
  var titlePreface: js.UndefOr[String] = js.undefined
  /**
    * The number of pixels to position the new window from the top edge of the screen. If not specified, the new
    * window is offset naturally from the last focused window. This value is ignored for panels.
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    * Specifies what type of browser window to create. The 'panel' and 'detached_panel' types create a popup
    * unless the '--enable-panels' flag is set.
    */
  var `type`: js.UndefOr[CreateType] = js.undefined
  /**
    * A URL or array of URLs to open as tabs in the window. Fully-qualified URLs must include a scheme (i.e.
    * 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within
    * the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * The width in pixels of the new window, including the frame. If not specified defaults to a natural width.
    */
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_AllowScriptsToClose {
  @scala.inline
  def apply(
    allowScriptsToClose: js.UndefOr[Boolean] = js.undefined,
    cookieStoreId: String = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    incognito: js.UndefOr[Boolean] = js.undefined,
    left: Int | Double = null,
    state: WindowState = null,
    tabId: Int | Double = null,
    titlePreface: String = null,
    top: Int | Double = null,
    `type`: CreateType = null,
    url: String | js.Array[String] = null,
    width: Int | Double = null
  ): Anon_AllowScriptsToClose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowScriptsToClose)) __obj.updateDynamic("allowScriptsToClose")(allowScriptsToClose)
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId)
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (titlePreface != null) __obj.updateDynamic("titlePreface")(titlePreface)
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AllowScriptsToClose]
  }
}

