package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.windows.CreateType
import typings.firefoxWebextBrowser.browser.windows.WindowState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowScriptsToClose extends js.Object {
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

object AllowScriptsToClose {
  @scala.inline
  def apply(
    allowScriptsToClose: js.UndefOr[Boolean] = js.undefined,
    cookieStoreId: String = null,
    focused: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    incognito: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Double] = js.undefined,
    state: WindowState = null,
    tabId: js.UndefOr[Double] = js.undefined,
    titlePreface: String = null,
    top: js.UndefOr[Double] = js.undefined,
    `type`: CreateType = null,
    url: String | js.Array[String] = null,
    width: js.UndefOr[Double] = js.undefined
  ): AllowScriptsToClose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowScriptsToClose)) __obj.updateDynamic("allowScriptsToClose")(allowScriptsToClose.get.asInstanceOf[js.Any])
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito.get.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    if (titlePreface != null) __obj.updateDynamic("titlePreface")(titlePreface.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowScriptsToClose]
  }
}

