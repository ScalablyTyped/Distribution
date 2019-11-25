package typings.expoDashLocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NotificationBody extends js.Object {
  var notificationBody: String
  var notificationColor: js.UndefOr[String] = js.undefined
  var notificationTitle: String
}

object Anon_NotificationBody {
  @scala.inline
  def apply(notificationBody: String, notificationTitle: String, notificationColor: String = null): Anon_NotificationBody = {
    val __obj = js.Dynamic.literal(notificationBody = notificationBody.asInstanceOf[js.Any], notificationTitle = notificationTitle.asInstanceOf[js.Any])
    if (notificationColor != null) __obj.updateDynamic("notificationColor")(notificationColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NotificationBody]
  }
}

