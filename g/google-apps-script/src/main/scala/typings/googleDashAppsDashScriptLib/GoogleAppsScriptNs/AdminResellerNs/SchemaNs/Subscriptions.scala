package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminResellerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subscriptions extends js.Object {
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  var subscriptions: js.UndefOr[js.Array[Subscription]] = js.undefined
}

object Subscriptions {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    subscriptions: js.Array[Subscription] = null
  ): Subscriptions = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (subscriptions != null) __obj.updateDynamic("subscriptions")(subscriptions)
    __obj.asInstanceOf[Subscriptions]
  }
}

