package typings.googleapis.buildSrcApisContentV2Mod.content_v2

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
    * Deprecated.
    */
  var customerBalance: js.UndefOr[Schema$Amount] = js.native
  /**
    * Deprecated.
    */
  var googleBalance: js.UndefOr[Schema$Amount] = js.native
  /**
    * Deprecated.
    */
  var merchantBalance: js.UndefOr[Schema$Amount] = js.native
  /**
    * [required] Total price for the product.
    */
  var productTotal: js.UndefOr[Schema$Amount] = js.native
  /**
    * Deprecated.
    */
  var promotionSummaries: js.UndefOr[js.Array[Schema$Promotion]] = js.native
}

object Schema$InvoiceSummary {
  @scala.inline
  def apply(
    additionalChargeSummaries: js.Array[Schema$InvoiceSummaryAdditionalChargeSummary] = null,
    customerBalance: Schema$Amount = null,
    googleBalance: Schema$Amount = null,
    merchantBalance: Schema$Amount = null,
    productTotal: Schema$Amount = null,
    promotionSummaries: js.Array[Schema$Promotion] = null
  ): Schema$InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeSummaries != null) __obj.updateDynamic("additionalChargeSummaries")(additionalChargeSummaries.asInstanceOf[js.Any])
    if (customerBalance != null) __obj.updateDynamic("customerBalance")(customerBalance.asInstanceOf[js.Any])
    if (googleBalance != null) __obj.updateDynamic("googleBalance")(googleBalance.asInstanceOf[js.Any])
    if (merchantBalance != null) __obj.updateDynamic("merchantBalance")(merchantBalance.asInstanceOf[js.Any])
    if (productTotal != null) __obj.updateDynamic("productTotal")(productTotal.asInstanceOf[js.Any])
    if (promotionSummaries != null) __obj.updateDynamic("promotionSummaries")(promotionSummaries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$InvoiceSummary]
  }
}

