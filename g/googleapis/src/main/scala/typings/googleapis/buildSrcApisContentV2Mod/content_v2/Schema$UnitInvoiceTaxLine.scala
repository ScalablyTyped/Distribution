package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UnitInvoiceTaxLine extends js.Object {
  /**
    * [required] Tax amount for the tax type.
    */
  var taxAmount: js.UndefOr[Schema$Price] = js.native
  /**
    * Optional name of the tax type. This should only be provided if taxType is
    * otherFeeTax.
    */
  var taxName: js.UndefOr[String] = js.native
  /**
    * [required] Type of the tax.
    */
  var taxType: js.UndefOr[String] = js.native
}

object Schema$UnitInvoiceTaxLine {
  @scala.inline
  def apply(taxAmount: Schema$Price = null, taxName: String = null, taxType: String = null): Schema$UnitInvoiceTaxLine = {
    val __obj = js.Dynamic.literal()
    if (taxAmount != null) __obj.updateDynamic("taxAmount")(taxAmount.asInstanceOf[js.Any])
    if (taxName != null) __obj.updateDynamic("taxName")(taxName.asInstanceOf[js.Any])
    if (taxType != null) __obj.updateDynamic("taxType")(taxType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnitInvoiceTaxLine]
  }
}

