package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

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
    if (discount != null) __obj.updateDynamic("discount")(discount.asInstanceOf[js.Any])
    if (offerIds != null) __obj.updateDynamic("offerIds")(offerIds.asInstanceOf[js.Any])
    if (subType != null) __obj.updateDynamic("subType")(subType.asInstanceOf[js.Any])
    if (taxImpact != null) __obj.updateDynamic("taxImpact")(taxImpact.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrderLegacyPromotionBenefit]
  }
}

