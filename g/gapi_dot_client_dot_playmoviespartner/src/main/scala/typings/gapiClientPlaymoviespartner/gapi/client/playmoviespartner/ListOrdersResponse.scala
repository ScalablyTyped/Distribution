package typings.gapiClientPlaymoviespartner.gapi.client.playmoviespartner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOrdersResponse extends js.Object {
  /** See _List methods rules_ for info about this field. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** List of Orders that match the request criteria. */
  var orders: js.UndefOr[js.Array[Order]] = js.undefined
  /** See _List methods rules_ for more information about this field. */
  var totalSize: js.UndefOr[Double] = js.undefined
}

object ListOrdersResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    orders: js.Array[Order] = null,
    totalSize: js.UndefOr[Double] = js.undefined
  ): ListOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (orders != null) __obj.updateDynamic("orders")(orders.asInstanceOf[js.Any])
    if (!js.isUndefined(totalSize)) __obj.updateDynamic("totalSize")(totalSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOrdersResponse]
  }
}

