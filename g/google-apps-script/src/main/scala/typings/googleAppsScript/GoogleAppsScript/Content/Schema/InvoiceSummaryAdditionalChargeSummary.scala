package typings.googleAppsScript.GoogleAppsScript.Content.Schema

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
    if (totalAmount != null) __obj.updateDynamic("totalAmount")(totalAmount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvoiceSummaryAdditionalChargeSummary]
  }
}

