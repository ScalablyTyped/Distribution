package typings.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductAmount extends js.Object {
  var priceAmount: js.UndefOr[Price] = js.undefined
  var remittedTaxAmount: js.UndefOr[Price] = js.undefined
  var taxAmount: js.UndefOr[Price] = js.undefined
}

object ProductAmount {
  @scala.inline
  def apply(priceAmount: Price = null, remittedTaxAmount: Price = null, taxAmount: Price = null): ProductAmount = {
    val __obj = js.Dynamic.literal()
    if (priceAmount != null) __obj.updateDynamic("priceAmount")(priceAmount.asInstanceOf[js.Any])
    if (remittedTaxAmount != null) __obj.updateDynamic("remittedTaxAmount")(remittedTaxAmount.asInstanceOf[js.Any])
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductAmount]
  }
}

