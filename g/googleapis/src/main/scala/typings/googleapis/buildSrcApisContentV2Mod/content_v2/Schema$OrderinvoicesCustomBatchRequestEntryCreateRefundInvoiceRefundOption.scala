package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption extends js.Object {
  /**
    * Optional description of the refund reason.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [required] Reason for the refund.
    */
  var reason: js.UndefOr[String] = js.native
}

object Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption {
  @scala.inline
  def apply(description: String = null, reason: String = null): Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceRefundOption]
  }
}

