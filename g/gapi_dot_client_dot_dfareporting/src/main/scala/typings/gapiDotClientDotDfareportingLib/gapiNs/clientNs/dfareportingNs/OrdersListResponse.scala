package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersListResponse extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "dfareporting#ordersListResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Pagination token to be used for the next list operation. */
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Order collection. */
  var orders: js.UndefOr[js.Array[Order]] = js.undefined
}

object OrdersListResponse {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null,
    orders: js.Array[Order] = null
  ): OrdersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (orders != null) __obj.updateDynamic("orders")(orders)
    __obj.asInstanceOf[OrdersListResponse]
  }
}

