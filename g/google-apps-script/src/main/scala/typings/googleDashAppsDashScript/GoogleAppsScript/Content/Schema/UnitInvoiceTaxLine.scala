package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitInvoiceTaxLine extends js.Object {
  var taxAmount: js.UndefOr[Price] = js.undefined
  var taxName: js.UndefOr[String] = js.undefined
  var taxType: js.UndefOr[String] = js.undefined
}

object UnitInvoiceTaxLine {
  @scala.inline
  def apply(taxAmount: Price = null, taxName: String = null, taxType: String = null): UnitInvoiceTaxLine = {
    val __obj = js.Dynamic.literal()
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount)
    if (taxName != null) __obj.updateDynamic("taxName")(taxName)
    if (taxType != null) __obj.updateDynamic("taxType")(taxType)
    __obj.asInstanceOf[UnitInvoiceTaxLine]
  }
}

