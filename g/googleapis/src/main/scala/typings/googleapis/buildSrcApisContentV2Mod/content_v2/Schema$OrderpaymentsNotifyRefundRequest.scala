package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderpaymentsNotifyRefundRequest extends js.Object {
  /**
    * Deprecated. Please use invoiceIds instead.
    */
  var invoiceId: js.UndefOr[String] = js.native
  /**
    * Invoice IDs from the orderinvoices service that correspond to the refund.
    */
  var invoiceIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Whether refund was successful.
    */
  var refundState: js.UndefOr[String] = js.native
}

object Schema$OrderpaymentsNotifyRefundRequest {
  @scala.inline
  def apply(invoiceId: String = null, invoiceIds: js.Array[String] = null, refundState: String = null): Schema$OrderpaymentsNotifyRefundRequest = {
    val __obj = js.Dynamic.literal()
    if (invoiceId != null) __obj.updateDynamic("invoiceId")(invoiceId.asInstanceOf[js.Any])
    if (invoiceIds != null) __obj.updateDynamic("invoiceIds")(invoiceIds.asInstanceOf[js.Any])
    if (refundState != null) __obj.updateDynamic("refundState")(refundState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderpaymentsNotifyRefundRequest]
  }
}

