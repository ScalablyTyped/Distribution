package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.menus._OverrideContextContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BookmarkIdContext extends js.Object {
  /** Required when context is 'bookmark'. Requires 'bookmark' permission. */
  var bookmarkId: js.UndefOr[String] = js.undefined
  /**
    * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark'
    * and 'tab' are supported. showDefaults cannot be used with this option.
    */
  var context: js.UndefOr[_OverrideContextContext] = js.undefined
  /** Whether to also include default menu items in the menu. */
  var showDefaults: js.UndefOr[Boolean] = js.undefined
  /** Required when context is 'tab'. Requires 'tabs' permission. */
  var tabId: js.UndefOr[Double] = js.undefined
}

object Anon_BookmarkIdContext {
  @scala.inline
  def apply(
    bookmarkId: String = null,
    context: _OverrideContextContext = null,
    showDefaults: js.UndefOr[Boolean] = js.undefined,
    tabId: Int | Double = null
  ): Anon_BookmarkIdContext = {
    val __obj = js.Dynamic.literal()
    if (bookmarkId != null) __obj.updateDynamic("bookmarkId")(bookmarkId)
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(showDefaults)) __obj.updateDynamic("showDefaults")(showDefaults)
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BookmarkIdContext]
  }
}

