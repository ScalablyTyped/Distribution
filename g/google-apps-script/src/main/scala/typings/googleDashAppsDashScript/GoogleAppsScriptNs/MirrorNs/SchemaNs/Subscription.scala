package typings.googleDashAppsDashScript.GoogleAppsScriptNs.MirrorNs.SchemaNs

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
    if (callbackUrl != null) __obj.updateDynamic("callbackUrl")(callbackUrl)
    if (collection != null) __obj.updateDynamic("collection")(collection)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (notification != null) __obj.updateDynamic("notification")(notification)
    if (operation != null) __obj.updateDynamic("operation")(operation)
    if (updated != null) __obj.updateDynamic("updated")(updated)
    if (userToken != null) __obj.updateDynamic("userToken")(userToken)
    if (verifyToken != null) __obj.updateDynamic("verifyToken")(verifyToken)
    __obj.asInstanceOf[Subscription]
  }
}

