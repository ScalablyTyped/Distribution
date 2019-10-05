package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersReturnLineItemResponse extends js.Object {
  /** The status of the execution. */
  var executionStatus: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersReturnLineItemResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object OrdersReturnLineItemResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): OrdersReturnLineItemResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersReturnLineItemResponse]
  }
}

