package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLegacyPromotion extends js.Object {
  var benefits: js.UndefOr[js.Array[OrderLegacyPromotionBenefit]] = js.undefined
  var effectiveDates: js.UndefOr[java.lang.String] = js.undefined
  var genericRedemptionCode: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var longTitle: js.UndefOr[java.lang.String] = js.undefined
  var productApplicability: js.UndefOr[java.lang.String] = js.undefined
  var redemptionChannel: js.UndefOr[java.lang.String] = js.undefined
}

object OrderLegacyPromotion {
  @scala.inline
  def apply(
    benefits: js.Array[OrderLegacyPromotionBenefit] = null,
    effectiveDates: java.lang.String = null,
    genericRedemptionCode: java.lang.String = null,
    id: java.lang.String = null,
    longTitle: java.lang.String = null,
    productApplicability: java.lang.String = null,
    redemptionChannel: java.lang.String = null
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

