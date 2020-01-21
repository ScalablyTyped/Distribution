package typings.expoLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNotificationBody extends js.Object {
  var notificationBody: String
  var notificationColor: js.UndefOr[String] = js.undefined
  var notificationTitle: String
}

object AnonNotificationBody {
  @scala.inline
  def apply(notificationBody: String, notificationTitle: String, notificationColor: String = null): AnonNotificationBody = {
    val __obj = js.Dynamic.literal(notificationBody = notificationBody.asInstanceOf[js.Any], notificationTitle = notificationTitle.asInstanceOf[js.Any])
    if (notificationColor != null) __obj.updateDynamic("notificationColor")(notificationColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNotificationBody]
  }
}

