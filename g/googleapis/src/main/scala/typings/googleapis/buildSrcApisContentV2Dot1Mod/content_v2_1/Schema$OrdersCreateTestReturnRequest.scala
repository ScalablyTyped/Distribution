package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrdersCreateTestReturnRequest extends js.Object {
  /**
    * Returned items.
    */
  var items: js.UndefOr[js.Array[Schema$OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.native
}

object Schema$OrdersCreateTestReturnRequest {
  @scala.inline
  def apply(items: js.Array[Schema$OrdersCustomBatchRequestEntryCreateTestReturnReturnItem] = null): Schema$OrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrdersCreateTestReturnRequest]
  }
}

