package typings.googleapis.buildSrcApisContentV2Mod.content_v2

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
    * Deprecated.
    */
  var promotions: js.UndefOr[js.Array[Schema$Promotion]] = js.native
  /**
    * [required] Price of the unit, before applying taxes.
    */
  var unitPricePretax: js.UndefOr[Schema$Price] = js.native
  /**
    * Tax amounts to apply to the unit price.
    */
  var unitPriceTaxes: js.UndefOr[js.Array[Schema$UnitInvoiceTaxLine]] = js.native
}

object Schema$UnitInvoice {
  @scala.inline
  def apply(
    additionalCharges: js.Array[Schema$UnitInvoiceAdditionalCharge] = null,
    promotions: js.Array[Schema$Promotion] = null,
    unitPricePretax: Schema$Price = null,
    unitPriceTaxes: js.Array[Schema$UnitInvoiceTaxLine] = null
  ): Schema$UnitInvoice = {
    val __obj = js.Dynamic.literal()
    if (additionalCharges != null) __obj.updateDynamic("additionalCharges")(additionalCharges.asInstanceOf[js.Any])
    if (promotions != null) __obj.updateDynamic("promotions")(promotions.asInstanceOf[js.Any])
    if (unitPricePretax != null) __obj.updateDynamic("unitPricePretax")(unitPricePretax.asInstanceOf[js.Any])
    if (unitPriceTaxes != null) __obj.updateDynamic("unitPriceTaxes")(unitPriceTaxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnitInvoice]
  }
}

