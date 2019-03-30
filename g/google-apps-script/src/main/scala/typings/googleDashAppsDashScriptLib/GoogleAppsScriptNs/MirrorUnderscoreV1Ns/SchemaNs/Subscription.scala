package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscription extends js.Object {
  var callbackUrl: js.UndefOr[java.lang.String] = js.undefined
  var collection: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var notification: js.UndefOr[Notification] = js.undefined
  var operation: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var updated: js.UndefOr[java.lang.String] = js.undefined
  var userToken: js.UndefOr[java.lang.String] = js.undefined
  var verifyToken: js.UndefOr[java.lang.String] = js.undefined
}

object Subscription {
  @scala.inline
  def apply(
    callbackUrl: java.lang.String = null,
    collection: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    notification: Notification = null,
    operation: js.Array[java.lang.String] = null,
    updated: java.lang.String = null,
    userToken: java.lang.String = null,
    verifyToken: java.lang.String = null
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

