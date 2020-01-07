package typings.googleapis.buildSrcApisAdminDirectoryUnderscoreV1Mod.admin_directory_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for notifications list response.
  */
@js.native
trait Schema$Notifications extends js.Object {
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * List of notifications in this page.
    */
  var items: js.UndefOr[js.Array[Schema$Notification]] = js.native
  /**
    * The type of the resource.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Token for fetching the next page of notifications.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Number of unread notification for the domain.
    */
  var unreadNotificationsCount: js.UndefOr[Double] = js.native
}

object Schema$Notifications {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Schema$Notification] = null,
    kind: String = null,
    nextPageToken: String = null,
    unreadNotificationsCount: Int | Double = null
  ): Schema$Notifications = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (unreadNotificationsCount != null) __obj.updateDynamic("unreadNotificationsCount")(unreadNotificationsCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Notifications]
  }
}

