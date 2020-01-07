package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InvoiceSummaryAdditionalChargeSummary extends js.Object {
  /**
    * [required] Total additional charge for this type.
    */
  var totalAmount: js.UndefOr[Schema$Amount] = js.native
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$InvoiceSummaryAdditionalChargeSummary {
  @scala.inline
  def apply(totalAmount: Schema$Amount = null, `type`: String = null): Schema$InvoiceSummaryAdditionalChargeSummary = {
    val __obj = js.Dynamic.literal()
    if (totalAmount != null) __obj.updateDynamic("totalAmount")(totalAmount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InvoiceSummaryAdditionalChargeSummary]
  }
}

