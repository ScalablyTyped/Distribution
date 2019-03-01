package typings
package firefoxDashWebextDashBrowserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PopupTabId extends js.Object {
  /** The html file to show in a popup. If set to the empty string (''), no popup is shown. */
  var popup: java.lang.String | scala.Null
  /** The id of the tab for which you want to modify the page action. */
  var tabId: scala.Double
}

object Anon_PopupTabId {
  @scala.inline
  def apply(tabId: scala.Double, popup: java.lang.String = null): Anon_PopupTabId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tabId")(tabId)
    if (popup != null) __obj.updateDynamic("popup")(popup)
    __obj.asInstanceOf[Anon_PopupTabId]
  }
}

