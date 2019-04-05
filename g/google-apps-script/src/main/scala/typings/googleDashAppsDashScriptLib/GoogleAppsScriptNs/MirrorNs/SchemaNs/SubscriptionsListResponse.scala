package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.MirrorNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionsListResponse extends js.Object {
  var items: js.UndefOr[js.Array[Subscription]] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

object SubscriptionsListResponse {
  @scala.inline
  def apply(items: js.Array[Subscription] = null, kind: java.lang.String = null): SubscriptionsListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[SubscriptionsListResponse]
  }
}

