package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.ContentUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderLegacyPromotionBenefit extends js.Object {
  var discount: js.UndefOr[Price] = js.undefined
  var offerIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subType: js.UndefOr[java.lang.String] = js.undefined
  var taxImpact: js.UndefOr[Price] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object OrderLegacyPromotionBenefit {
  @scala.inline
  def apply(
    discount: Price = null,
    offerIds: js.Array[java.lang.String] = null,
    subType: java.lang.String = null,
    taxImpact: Price = null,
    `type`: java.lang.String = null
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

