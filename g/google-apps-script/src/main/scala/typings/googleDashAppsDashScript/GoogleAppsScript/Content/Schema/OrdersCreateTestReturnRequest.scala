package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCreateTestReturnRequest extends js.Object {
  var items: js.UndefOr[js.Array[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]] = js.undefined
}

object OrdersCreateTestReturnRequest {
  @scala.inline
  def apply(items: js.Array[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem] = null): OrdersCreateTestReturnRequest = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCreateTestReturnRequest]
  }
}

