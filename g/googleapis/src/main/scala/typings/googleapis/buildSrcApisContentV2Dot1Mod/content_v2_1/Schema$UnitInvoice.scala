package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UnitInvoice extends js.Object {
  /**
    * Additional charges for a unit, e.g. shipping costs.
    */
  var additionalCharges: js.UndefOr[js.Array[Schema$UnitInvoiceAdditionalCharge]] = js.native
  /**
    * [required] Pre-tax or post-tax price of the unit depending on the
    * locality of the order.
    */
  var unitPrice: js.UndefOr[Schema$Price] = js.native
  /**
    * Tax amounts to apply to the unit price.
    */
  var unitPriceTaxes: js.UndefOr[js.Array[Schema$UnitInvoiceTaxLine]] = js.native
}

object Schema$UnitInvoice {
  @scala.inline
  def apply(
    additionalCharges: js.Array[Schema$UnitInvoiceAdditionalCharge] = null,
    unitPrice: Schema$Price = null,
    unitPriceTaxes: js.Array[Schema$UnitInvoiceTaxLine] = null
  ): Schema$UnitInvoice = {
    val __obj = js.Dynamic.literal()
    if (additionalCharges != null) __obj.updateDynamic("additionalCharges")(additionalCharges.asInstanceOf[js.Any])
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice.asInstanceOf[js.Any])
    if (unitPriceTaxes != null) __obj.updateDynamic("unitPriceTaxes")(unitPriceTaxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnitInvoice]
  }
}

