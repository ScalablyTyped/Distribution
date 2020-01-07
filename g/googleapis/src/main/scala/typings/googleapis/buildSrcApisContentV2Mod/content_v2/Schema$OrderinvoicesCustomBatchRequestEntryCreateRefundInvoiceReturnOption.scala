package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption extends js.Object {
  /**
    * Optional description of the return reason.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * [required] Reason for the return.
    */
  var reason: js.UndefOr[String] = js.native
}

object Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption {
  @scala.inline
  def apply(description: String = null, reason: String = null): Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (reason != null) __obj.updateDynamic("reason")(reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderinvoicesCustomBatchRequestEntryCreateRefundInvoiceReturnOption]
  }
}

