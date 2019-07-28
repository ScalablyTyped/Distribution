package typings.googleDashAppsDashScript.GoogleAppsScriptNs.DfareportingNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersListResponse extends js.Object {
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var orders: js.UndefOr[js.Array[Order]] = js.undefined
}

object OrdersListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, orders: js.Array[Order] = null): OrdersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (orders != null) __obj.updateDynamic("orders")(orders)
    __obj.asInstanceOf[OrdersListResponse]
  }
}

