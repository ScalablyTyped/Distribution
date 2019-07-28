package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
}

object OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption {
  @scala.inline
  def apply(description: String = null, reason: String = null): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption]
  }
}

