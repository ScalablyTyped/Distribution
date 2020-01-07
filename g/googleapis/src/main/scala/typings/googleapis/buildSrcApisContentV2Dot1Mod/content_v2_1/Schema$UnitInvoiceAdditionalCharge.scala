package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

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
    * [required] Type of the additional charge.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$UnitInvoiceAdditionalCharge {
  @scala.inline
  def apply(additionalChargeAmount: Schema$Amount = null, `type`: String = null): Schema$UnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeAmount != null) __obj.updateDynamic("additionalChargeAmount")(additionalChargeAmount.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UnitInvoiceAdditionalCharge]
  }
}

