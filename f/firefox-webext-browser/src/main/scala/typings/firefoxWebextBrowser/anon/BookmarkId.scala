package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.contextMenus.OverrideContextContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkId extends js.Object {
  /** Required when context is 'bookmark'. Requires 'bookmark' permission. */
  var bookmarkId: js.UndefOr[String] = js.undefined
  /**
    * ContextType to override, to allow menu items from other extensions in the menu. Currently only 'bookmark'
    * and 'tab' are supported. showDefaults cannot be used with this option.
    */
  var context: js.UndefOr[OverrideContextContext] = js.undefined
  /** Whether to also include default menu items in the menu. */
  var showDefaults: js.UndefOr[Boolean] = js.undefined
  /** Required when context is 'tab'. Requires 'tabs' permission. */
  var tabId: js.UndefOr[Double] = js.undefined
}

object BookmarkId {
  @scala.inline
  def apply(
    bookmarkId: String = null,
    context: OverrideContextContext = null,
    showDefaults: js.UndefOr[Boolean] = js.undefined,
    tabId: js.UndefOr[Double] = js.undefined
  ): BookmarkId = {
    val __obj = js.Dynamic.literal()
    if (bookmarkId != null) __obj.updateDynamic("bookmarkId")(bookmarkId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(showDefaults)) __obj.updateDynamic("showDefaults")(showDefaults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkId]
  }
}

