package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchResponseEntry extends js.Object {
  /** The ID of the request entry this entry responds to. */
  var batchId: js.UndefOr[Double] = js.undefined
  /** A list of errors defined if and only if the request failed. */
  var errors: js.UndefOr[Errors] = js.undefined
  /** The status of the execution. Only defined if the method is not get or getByMerchantOrderId and if the request was successful. */
  var executionStatus: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCustomBatchResponseEntry". */
  var kind: js.UndefOr[String] = js.undefined
  /** The retrieved order. Only defined if the method is get and if the request was successful. */
  var order: js.UndefOr[Order] = js.undefined
}

object OrdersCustomBatchResponseEntry {
  @scala.inline
  def apply(
    batchId: Int | Double = null,
    errors: Errors = null,
    executionStatus: String = null,
    kind: String = null,
    order: Order = null
  ): OrdersCustomBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (batchId != null) __obj.updateDynamic("batchId")(batchId.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (order != null) __obj.updateDynamic("order")(order)
    __obj.asInstanceOf[OrdersCustomBatchResponseEntry]
  }
}

