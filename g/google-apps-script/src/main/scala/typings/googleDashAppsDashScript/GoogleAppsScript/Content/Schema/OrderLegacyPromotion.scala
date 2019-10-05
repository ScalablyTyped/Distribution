package typings.googleDashAppsDashScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLegacyPromotion extends js.Object {
  var benefits: js.UndefOr[js.Array[OrderLegacyPromotionBenefit]] = js.undefined
  var effectiveDates: js.UndefOr[String] = js.undefined
  var genericRedemptionCode: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var longTitle: js.UndefOr[String] = js.undefined
  var productApplicability: js.UndefOr[String] = js.undefined
  var redemptionChannel: js.UndefOr[String] = js.undefined
}

object OrderLegacyPromotion {
  @scala.inline
  def apply(
    benefits: js.Array[OrderLegacyPromotionBenefit] = null,
    effectiveDates: String = null,
    genericRedemptionCode: String = null,
    id: String = null,
    longTitle: String = null,
    productApplicability: String = null,
    redemptionChannel: String = null
  ): OrderLegacyPromotion = {
    val __obj = js.Dynamic.literal()
    if (benefits != null) __obj.updateDynamic("benefits")(benefits)
    if (effectiveDates != null) __obj.updateDynamic("effectiveDates")(effectiveDates)
    if (genericRedemptionCode != null) __obj.updateDynamic("genericRedemptionCode")(genericRedemptionCode)
    if (id != null) __obj.updateDynamic("id")(id)
    if (longTitle != null) __obj.updateDynamic("longTitle")(longTitle)
    if (productApplicability != null) __obj.updateDynamic("productApplicability")(productApplicability)
    if (redemptionChannel != null) __obj.updateDynamic("redemptionChannel")(redemptionChannel)
    __obj.asInstanceOf[OrderLegacyPromotion]
  }
}

