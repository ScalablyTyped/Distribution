package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersShipLineItemsResponse extends js.Object {
  /** The status of the execution. */
  var executionStatus: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersShipLineItemsResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object OrdersShipLineItemsResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): OrdersShipLineItemsResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersShipLineItemsResponse]
  }
}

