package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductsCustomBatchRequest extends js.Object {
  /** The request entries to be processed in the batch. */
  var entries: js.UndefOr[js.Array[ProductsCustomBatchRequestEntry]] = js.undefined
}

object ProductsCustomBatchRequest {
  @scala.inline
  def apply(entries: js.Array[ProductsCustomBatchRequestEntry] = null): ProductsCustomBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entries != null) __obj.updateDynamic("entries")(entries)
    __obj.asInstanceOf[ProductsCustomBatchRequest]
  }
}

