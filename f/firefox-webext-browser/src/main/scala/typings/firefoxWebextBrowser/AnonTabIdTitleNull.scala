package typings.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTabIdTitleNull extends js.Object {
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double
  /** The tooltip string. */
  var title: String | Null
}

object AnonTabIdTitleNull {
  @scala.inline
  def apply(tabId: Double, title: String = null): AnonTabIdTitleNull = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabIdTitleNull]
  }
}

