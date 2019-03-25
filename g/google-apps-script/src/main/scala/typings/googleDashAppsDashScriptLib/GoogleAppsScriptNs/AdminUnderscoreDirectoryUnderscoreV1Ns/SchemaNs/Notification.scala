package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Notification extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var fromAddress: js.UndefOr[java.lang.String] = js.undefined
  var isUnread: js.UndefOr[scala.Boolean] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var notificationId: js.UndefOr[java.lang.String] = js.undefined
  var sendTime: js.UndefOr[java.lang.String] = js.undefined
  var subject: js.UndefOr[java.lang.String] = js.undefined
}

object Notification {
  @scala.inline
  def apply(
    body: java.lang.String = null,
    etag: java.lang.String = null,
    fromAddress: java.lang.String = null,
    isUnread: js.UndefOr[scala.Boolean] = js.undefined,
    kind: java.lang.String = null,
    notificationId: java.lang.String = null,
    sendTime: java.lang.String = null,
    subject: java.lang.String = null
  ): Notification = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (fromAddress != null) __obj.updateDynamic("fromAddress")(fromAddress)
    if (!js.isUndefined(isUnread)) __obj.updateDynamic("isUnread")(isUnread)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (notificationId != null) __obj.updateDynamic("notificationId")(notificationId)
    if (sendTime != null) __obj.updateDynamic("sendTime")(sendTime)
    if (subject != null) __obj.updateDynamic("subject")(subject)
    __obj.asInstanceOf[Notification]
  }
}

