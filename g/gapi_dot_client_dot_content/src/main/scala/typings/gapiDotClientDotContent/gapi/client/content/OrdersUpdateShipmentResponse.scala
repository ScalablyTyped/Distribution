package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersUpdateShipmentResponse extends js.Object {
  /** The status of the execution. */
  var executionStatus: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersUpdateShipmentResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object OrdersUpdateShipmentResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): OrdersUpdateShipmentResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    __obj.asInstanceOf[OrdersUpdateShipmentResponse]
  }
}

