package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActive extends js.Object {
  /**
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused
    * (see `windows.update`). Defaults to `true`.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /** The CookieStoreId for the tab that opened this tab. */
  var cookieStoreId: js.UndefOr[String] = js.undefined
  /** Whether the tab is marked as 'discarded' when created. */
  var discarded: js.UndefOr[Boolean] = js.undefined
  /**
    * The position the tab should take in the window. The provided value will be clamped to between zero and the
    * number of tabs in the window.
    */
  var index: js.UndefOr[Double] = js.undefined
  /** Whether the document in the tab should be opened in reader mode. */
  var openInReaderMode: js.UndefOr[Boolean] = js.undefined
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as the newly
    * created tab.
    */
  var openerTabId: js.UndefOr[Double] = js.undefined
  /** Whether the tab should be pinned. Defaults to `false` */
  var pinned: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the tab should become the selected tab in the window. Defaults to `true`
    * @deprecated Please use _active_.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /** The title used for display if the tab is created in discarded mode. */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The URL to navigate the tab to initially. Fully-qualified URLs must include a scheme (i.e.
    * 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within
    * the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[String] = js.undefined
  /** The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonActive {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    cookieStoreId: String = null,
    discarded: js.UndefOr[Boolean] = js.undefined,
    index: Int | Double = null,
    openInReaderMode: js.UndefOr[Boolean] = js.undefined,
    openerTabId: Int | Double = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    url: String = null,
    windowId: Int | Double = null
  ): AnonActive = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (cookieStoreId != null) __obj.updateDynamic("cookieStoreId")(cookieStoreId.asInstanceOf[js.Any])
    if (!js.isUndefined(discarded)) __obj.updateDynamic("discarded")(discarded.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (!js.isUndefined(openInReaderMode)) __obj.updateDynamic("openInReaderMode")(openInReaderMode.asInstanceOf[js.Any])
    if (openerTabId != null) __obj.updateDynamic("openerTabId")(openerTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonActive]
  }
}

