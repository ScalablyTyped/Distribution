package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var body: js.UndefOr[String] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var fromAddress: js.UndefOr[String] = js.undefined
  var isUnread: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var notificationId: js.UndefOr[String] = js.undefined
  var sendTime: js.UndefOr[String] = js.undefined
  var subject: js.UndefOr[String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    body: String = null,
    etag: String = null,
    fromAddress: String = null,
    isUnread: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    notificationId: String = null,
    sendTime: String = null,
    subject: String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (fromAddress != null) __obj.updateDynamic("fromAddress")(fromAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnread)) __obj.updateDynamic("isUnread")(isUnread.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notificationId != null) __obj.updateDynamic("notificationId")(notificationId.asInstanceOf[js.Any])
    if (sendTime != null) __obj.updateDynamic("sendTime")(sendTime.asInstanceOf[js.Any])
    if (subject != null) __obj.updateDynamic("subject")(subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Notification]
  }
}

