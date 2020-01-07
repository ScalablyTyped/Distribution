package typings.googleapis.buildSrcApisDfareportingV3Dot3Mod.dfareporting_v3_3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Order List Response
  */
@js.native
trait Schema$OrdersListResponse extends js.Object {
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#ordersListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to be used for the next list operation.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Order collection.
    */
  var orders: js.UndefOr[js.Array[Schema$Order]] = js.native
}

object Schema$OrdersListResponse {
  @scala.inline
  def apply(kind: String = null, nextPageToken: String = null, orders: js.Array[Schema$Order] = null): Schema$OrdersListResponse = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (orders != null) __obj.updateDynamic("orders")(orders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersListResponse]
  }
}

