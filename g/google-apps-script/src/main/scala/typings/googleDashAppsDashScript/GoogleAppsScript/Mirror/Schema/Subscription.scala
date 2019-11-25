package typings.googleDashAppsDashScript.GoogleAppsScript.Mirror.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var callbackUrl: js.UndefOr[String] = js.undefined
  var collection: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var notification: js.UndefOr[Notification] = js.undefined
  var operation: js.UndefOr[js.Array[String]] = js.undefined
  var updated: js.UndefOr[String] = js.undefined
  var userToken: js.UndefOr[String] = js.undefined
  var verifyToken: js.UndefOr[String] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    callbackUrl: String = null,
    collection: String = null,
    id: String = null,
    kind: String = null,
    notification: Notification = null,
    operation: js.Array[String] = null,
    updated: String = null,
    userToken: String = null,
    verifyToken: String = null
  ): Subscription = {
    val __obj = js.Dynamic.literal()
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl.asInstanceOf[js.Any])
    if (collection != null) __obj.updateDynamic("collection")(collection.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (notification != null) __obj.updateDynamic("notification")(notification.asInstanceOf[js.Any])
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (userToken != null) __obj.updateDynamic("userToken")(userToken.asInstanceOf[js.Any])
    if (verifyToken != null) __obj.updateDynamic("verifyToken")(verifyToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subscription]
  }
}

