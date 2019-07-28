package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnitInvoiceAdditionalCharge extends js.Object {
  var additionalChargeAmount: js.UndefOr[Amount] = js.undefined
  var additionalChargePromotions: js.UndefOr[js.Array[Promotion]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object UnitInvoiceAdditionalCharge {
  @scala.inline
  def apply(
    additionalChargeAmount: Amount = null,
    additionalChargePromotions: js.Array[Promotion] = null,
    `type`: String = null
  ): UnitInvoiceAdditionalCharge = {
    val __obj = js.Dynamic.literal()
    if (additionalChargeAmount != null) __obj.updateDynamic("additionalChargeAmount")(additionalChargeAmount)
    if (additionalChargePromotions != null) __obj.updateDynamic("additionalChargePromotions")(additionalChargePromotions)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UnitInvoiceAdditionalCharge]
  }
}

