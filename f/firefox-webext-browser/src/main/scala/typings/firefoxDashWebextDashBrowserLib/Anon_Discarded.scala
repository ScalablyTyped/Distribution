package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Discarded extends js.Object {
  /**
    * Whether the tab should become the active tab in the window. Does not affect whether the window is focused
    * (see `windows.update`). Defaults to `true`.
    */
  var active: js.UndefOr[scala.Boolean] = js.undefined
  /** The CookieStoreId for the tab that opened this tab. */
  var cookieStoreId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the tab is marked as 'discarded' when created. */
  var discarded: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The position the tab should take in the window. The provided value will be clamped to between zero and the
    * number of tabs in the window.
    */
  var index: js.UndefOr[scala.Double] = js.undefined
  /** Whether the document in the tab should be opened in reader mode. */
  var openInReaderMode: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The ID of the tab that opened this tab. If specified, the opener tab must be in the same window as the newly
    * created tab.
    */
  var openerTabId: js.UndefOr[scala.Double] = js.undefined
  /** Whether the tab should be pinned. Defaults to `false` */
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether the tab should become the selected tab in the window. Defaults to `true`
    * @deprecated Please use _active_.
    */
  var selected: js.UndefOr[scala.Boolean] = js.undefined
  /** The title used for display if the tab is created in discarded mode. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL to navigate the tab to initially. Fully-qualified URLs must include a scheme (i.e.
    * 'http://www.google.com', not 'www.google.com'). Relative URLs will be relative to the current page within
    * the extension. Defaults to the New Tab Page.
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The window to create the new tab in. Defaults to the current window. */
  var windowId: js.UndefOr[scala.Double] = js.undefined
}

