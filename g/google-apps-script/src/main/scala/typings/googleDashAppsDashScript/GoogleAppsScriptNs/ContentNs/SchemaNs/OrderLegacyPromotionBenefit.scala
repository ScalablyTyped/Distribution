package typings.googleDashAppsDashScript.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLegacyPromotionBenefit extends js.Object {
  var discount: js.UndefOr[Price] = js.undefined
  var offerIds: js.UndefOr[js.Array[String]] = js.undefined
  var subType: js.UndefOr[String] = js.undefined
  var taxImpact: js.UndefOr[Price] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object OrderLegacyPromotionBenefit {
  @scala.inline
  def apply(
    discount: Price = null,
    offerIds: js.Array[String] = null,
    subType: String = null,
    taxImpact: Price = null,
    `type`: String = null
  ): OrderLegacyPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    if (discount != null) __obj.updateDynamic("discount")(discount)
    if (offerIds != null) __obj.updateDynamic("offerIds")(offerIds)
    if (subType != null) __obj.updateDynamic("subType")(subType)
    if (taxImpact != null) __obj.updateDynamic("taxImpact")(taxImpact)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrderLegacyPromotionBenefit]
  }
}

