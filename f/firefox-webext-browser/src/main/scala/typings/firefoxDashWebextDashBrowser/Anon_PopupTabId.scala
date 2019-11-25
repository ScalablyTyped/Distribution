package typings.firefoxDashWebextDashBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PopupTabId extends js.Object {
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: String | Null
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double
}

object Anon_PopupTabId {
  @scala.inline
  def apply(tabId: Double, popup: String = null): Anon_PopupTabId = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PopupTabId]
  }
}

