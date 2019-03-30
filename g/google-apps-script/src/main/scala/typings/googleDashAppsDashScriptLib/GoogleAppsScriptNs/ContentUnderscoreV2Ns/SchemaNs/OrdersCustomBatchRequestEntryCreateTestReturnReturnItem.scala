package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrdersCustomBatchRequestEntryCreateTestReturnReturnItem extends js.Object {
  var lineItemId: js.UndefOr[java.lang.String] = js.undefined
  var quantity: js.UndefOr[scala.Double] = js.undefined
}

object OrdersCustomBatchRequestEntryCreateTestReturnReturnItem {
  @scala.inline
  def apply(lineItemId: java.lang.String = null, quantity: scala.Int | scala.Double = null): OrdersCustomBatchRequestEntryCreateTestReturnReturnItem = {
    val __obj = js.Dynamic.literal()
    if (lineItemId != null) __obj.updateDynamic("lineItemId")(lineItemId)
    if (quantity != null) __obj.updateDynamic("quantity")(quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrdersCustomBatchRequestEntryCreateTestReturnReturnItem]
  }
}

