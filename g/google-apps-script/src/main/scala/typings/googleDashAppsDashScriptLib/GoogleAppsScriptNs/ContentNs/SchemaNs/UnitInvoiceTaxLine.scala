package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitInvoiceTaxLine extends js.Object {
  var taxAmount: js.UndefOr[Price] = js.undefined
  var taxName: js.UndefOr[java.lang.String] = js.undefined
  var taxType: js.UndefOr[java.lang.String] = js.undefined
}

object UnitInvoiceTaxLine {
  @scala.inline
  def apply(taxAmount: Price = null, taxName: java.lang.String = null, taxType: java.lang.String = null): UnitInvoiceTaxLine = {
    val __obj = js.Dynamic.literal()
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount)
    if (taxName != null) __obj.updateDynamic("taxName")(taxName)
    if (taxType != null) __obj.updateDynamic("taxType")(taxType)
    __obj.asInstanceOf[UnitInvoiceTaxLine]
  }
}

