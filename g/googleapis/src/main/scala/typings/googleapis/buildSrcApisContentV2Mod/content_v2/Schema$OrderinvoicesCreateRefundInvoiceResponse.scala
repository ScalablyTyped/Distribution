package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderinvoicesCreateRefundInvoiceResponse extends js.Object {
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderinvoicesCreateRefundInvoiceResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$OrderinvoicesCreateRefundInvoiceResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): Schema$OrderinvoicesCreateRefundInvoiceResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderinvoicesCreateRefundInvoiceResponse]
  }
}

