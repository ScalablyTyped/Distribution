package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notifications extends js.Object {
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[Notification]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var unreadNotificationsCount: js.UndefOr[scala.Double] = js.undefined
}

object Notifications {
  @scala.inline
  def apply(
    etag: java.lang.String = null,
    items: js.Array[Notification] = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    unreadNotificationsCount: scala.Int | scala.Double = null
  ): Notifications = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (unreadNotificationsCount != null) __obj.updateDynamic("unreadNotificationsCount")(unreadNotificationsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notifications]
  }
}

