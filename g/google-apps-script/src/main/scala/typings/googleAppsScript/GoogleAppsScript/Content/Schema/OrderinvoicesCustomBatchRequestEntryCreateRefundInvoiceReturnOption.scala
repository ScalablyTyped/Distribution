package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var reason: js.UndefOr[String] = js.undefined
}

object OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption {
  @scala.inline
  def apply(description: String = null, reason: String = null): OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption]
  }
}

