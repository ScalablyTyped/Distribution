package typings.gapiDotClientDotContent.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersAcknowledgeRequest extends js.Object {
  /** The ID of the operation. Unique across all operations for a given order. */
  var operationId: js.UndefOr[String] = js.undefined
}

object OrdersAcknowledgeRequest {
  @scala.inline
  def apply(operationId: String = null): OrdersAcknowledgeRequest = {
    val __obj = js.Dynamic.literal()
    if (operationId != null) __obj.updateDynamic("operationId")(operationId)
    __obj.asInstanceOf[OrdersAcknowledgeRequest]
  }
}

