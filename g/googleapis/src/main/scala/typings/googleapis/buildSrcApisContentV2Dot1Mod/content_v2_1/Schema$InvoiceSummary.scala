package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$InvoiceSummary extends js.Object {
  /**
    * Summary of the total amounts of the additional charges.
    */
  var additionalChargeSummaries: js.UndefOr[js.Array[Schema$InvoiceSummaryAdditionalChargeSummary]] = js.native
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[Schema$Amount] = js.native
}

object Schema$InvoiceSummary {
  @scala.inline
  def apply(
    additionalChargeSummaries: js.Array[Schema$InvoiceSummaryAdditionalChargeSummary] = null,
    productTotal: Schema$Amount = null
  ): Schema$InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeSummaries != null) __obj.updateDynamic("additionalChargeSummaries")(additionalChargeSummaries.asInstanceOf[js.Any])
    if (productTotal != null) __obj.updateDynamic("productTotal")(productTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InvoiceSummary]
  }
}

