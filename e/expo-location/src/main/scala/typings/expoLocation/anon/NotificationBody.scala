package typings.expoLocation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotificationBody extends js.Object {
  var notificationBody: String
  var notificationColor: js.UndefOr[String] = js.undefined
  var notificationTitle: String
}

object NotificationBody {
  @scala.inline
  def apply(notificationBody: String, notificationTitle: String, notificationColor: String = null): NotificationBody = {
    val __obj = js.Dynamic.literal(notificationBody = notificationBody.asInstanceOf[js.Any], notificationTitle = notificationTitle.asInstanceOf[js.Any])
    if (notificationColor != null) __obj.updateDynamic("notificationColor")(notificationColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotificationBody]
  }
}

