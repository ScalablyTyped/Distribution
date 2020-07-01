package typings.firefoxWebextBrowser.anon

import typings.firefoxWebextBrowser.browser.extension.ViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  /** Find a view according to a tab id. If this field is omitted, returns all views. */
  var tabId: js.UndefOr[Double] = js.undefined
  /**
    * The type of view to get. If omitted, returns all views (including background pages and tabs). Valid values:
    * 'tab', 'popup', 'sidebar'.
    */
  var `type`: js.UndefOr[ViewType] = js.undefined
  /** The window to restrict the search to. If omitted, returns all views. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object Type {
  @scala.inline
  def apply(
    tabId: js.UndefOr[Double] = js.undefined,
    `type`: ViewType = null,
    windowId: js.UndefOr[Double] = js.undefined
  ): Type = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(tabId)) __obj.updateDynamic("tabId")(tabId.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(windowId)) __obj.updateDynamic("windowId")(windowId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

