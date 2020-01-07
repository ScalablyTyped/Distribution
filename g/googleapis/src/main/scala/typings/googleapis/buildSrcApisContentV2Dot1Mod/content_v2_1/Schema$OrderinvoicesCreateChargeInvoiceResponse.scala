package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderinvoicesCreateChargeInvoiceResponse extends js.Object {
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderinvoicesCreateChargeInvoiceResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object Schema$OrderinvoicesCreateChargeInvoiceResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): Schema$OrderinvoicesCreateChargeInvoiceResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderinvoicesCreateChargeInvoiceResponse]
  }
}

