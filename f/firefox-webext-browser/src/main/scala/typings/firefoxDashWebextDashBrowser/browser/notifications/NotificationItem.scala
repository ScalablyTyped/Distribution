package typings.firefoxDashWebextDashBrowser.browser.notifications

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationItem extends js.Object {
  /** Additional details about this item. */
  var message: String
  /** Title of one item of a list notification. */
  var title: String
}

object NotificationItem {
  @scala.inline
  def apply(message: String, title: String): NotificationItem = {
    val __obj = js.Dynamic.literal(message = message, title = title)
  
    __obj.asInstanceOf[NotificationItem]
  }
}

