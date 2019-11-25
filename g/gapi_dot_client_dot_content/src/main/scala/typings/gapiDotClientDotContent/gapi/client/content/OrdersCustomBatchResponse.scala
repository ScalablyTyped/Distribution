package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchResponse extends js.Object {
  /** The result of the execution of the batch requests. */
  var entries: js.UndefOr[js.Array[OrdersCustomBatchResponseEntry]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "content#ordersCustomBatchResponse". */
  var kind: js.UndefOr[String] = js.undefined
}

object OrdersCustomBatchResponse {
  @scala.inline
  def apply(entries: js.Array[OrdersCustomBatchResponseEntry] = null, kind: String = null): OrdersCustomBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCustomBatchResponse]
  }
}

