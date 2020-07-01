package typings.firefoxWebextBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title extends js.Object {
  /** The id of the tab for which you want to modify the page action. */
  var tabId: Double
  /** The tooltip string. */
  var title: String | Null
}

object Title {
  @scala.inline
  def apply(tabId: Double, title: String = null): Title = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
}

