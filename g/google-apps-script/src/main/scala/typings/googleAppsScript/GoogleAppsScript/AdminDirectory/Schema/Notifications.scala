package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Notification]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var unreadNotificationsCount: js.UndefOr[Double] = js.undefined
}

object Notifications {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Notification] = null,
    kind: String = null,
    nextPageToken: String = null,
    unreadNotificationsCount: Int | Double = null
  ): Notifications = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (unreadNotificationsCount != null) __obj.updateDynamic("unreadNotificationsCount")(unreadNotificationsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
}

