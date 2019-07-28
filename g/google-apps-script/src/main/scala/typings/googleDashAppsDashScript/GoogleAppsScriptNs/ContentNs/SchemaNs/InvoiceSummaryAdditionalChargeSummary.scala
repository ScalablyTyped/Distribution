package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvoiceSummaryAdditionalChargeSummary extends js.Object {
  var totalAmount: js.UndefOr[Amount] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object InvoiceSummaryAdditionalChargeSummary {
  @scala.inline
  def apply(totalAmount: Amount = null, `type`: String = null): InvoiceSummaryAdditionalChargeSummary = {
    val __obj = js.Dynamic.literal()
    if (totalAmount != null) __obj.updateDynamic("totalAmount")(totalAmount)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[InvoiceSummaryAdditionalChargeSummary]
  }
}

