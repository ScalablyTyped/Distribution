package typings.googleapis.buildSrcApisContentV2Mod.content_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UnitInvoiceAdditionalCharge extends js.Object {
  /**
    * [required] Amount of the additional charge.
    */
  var additionalChargeAmount: js.UndefOr[Schema$Amount] = js.native
  /**
    * Deprecated.
    */
  var additionalChargePromotions: js.UndefOr[js.Array[Schema$Promotion]] = js.native
  /**
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$UnitInvoiceAdditionalCharge {
  @scala.inline
  def apply(
    additionalChargeAmount: Schema$Amount = null,
    additionalChargePromotions: js.Array[Schema$Promotion] = null,
    `type`: String = null
  ): Schema$UnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeAmount != null) __obj.updateDynamic("additionalChargeAmount")(additionalChargeAmount.asInstanceOf[js.Any])
    if (additionalChargePromotions != null) __obj.updateDynamic("additionalChargePromotions")(additionalChargePromotions.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnitInvoiceAdditionalCharge]
  }
}

