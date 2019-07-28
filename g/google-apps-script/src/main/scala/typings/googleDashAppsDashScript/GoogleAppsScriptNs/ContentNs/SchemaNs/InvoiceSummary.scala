package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceSummary extends js.Object {
  var additionalChargeSummaries: js.UndefOr[js.Array[InvoiceSummaryAdditionalChargeSummary]] = js.undefined
  var customerBalance: js.UndefOr[Amount] = js.undefined
  var googleBalance: js.UndefOr[Amount] = js.undefined
  var merchantBalance: js.UndefOr[Amount] = js.undefined
  var productTotal: js.UndefOr[Amount] = js.undefined
  var promotionSummaries: js.UndefOr[js.Array[Promotion]] = js.undefined
}

object InvoiceSummary {
  @scala.inline
  def apply(
    additionalChargeSummaries: js.Array[InvoiceSummaryAdditionalChargeSummary] = null,
    customerBalance: Amount = null,
    googleBalance: Amount = null,
    merchantBalance: Amount = null,
    productTotal: Amount = null,
    promotionSummaries: js.Array[Promotion] = null
  ): InvoiceSummary = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeSummaries != null) __obj.updateDynamic("additionalChargeSummaries")(additionalChargeSummaries)
    if (customerBalance != null) __obj.updateDynamic("customerBalance")(customerBalance)
    if (googleBalance != null) __obj.updateDynamic("googleBalance")(googleBalance)
    if (merchantBalance != null) __obj.updateDynamic("merchantBalance")(merchantBalance)
    if (productTotal != null) __obj.updateDynamic("productTotal")(productTotal)
    if (promotionSummaries != null) __obj.updateDynamic("promotionSummaries")(promotionSummaries)
    __obj.asInstanceOf[InvoiceSummary]
  }
}

