package typings.gapiDotClientDotAndroidpublisher.gapiNs.clientNs.androidpublisherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InappproductsBatchRequest extends js.Object {
  var entrys: js.UndefOr[js.Array[InappproductsBatchRequestEntry]] = js.undefined
}

object InappproductsBatchRequest {
  @scala.inline
  def apply(entrys: js.Array[InappproductsBatchRequestEntry] = null): InappproductsBatchRequest = {
    val __obj = js.Dynamic.literal()
    if (entrys != null) __obj.updateDynamic("entrys")(entrys)
    __obj.asInstanceOf[InappproductsBatchRequest]
  }
}

