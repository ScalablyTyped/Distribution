package typings.firefoxDashWebextDashBrowser

import typings.firefoxDashWebextDashBrowser.browser.extension.ViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TabId extends js.Object {
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

object Anon_TabId {
  @scala.inline
  def apply(tabId: Int | Double = null, `type`: ViewType = null, windowId: Int | Double = null): Anon_TabId = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TabId]
  }
}

