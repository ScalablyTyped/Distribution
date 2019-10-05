package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderPromotionBenefit extends js.Object {
  /** The discount in the order price when the promotion is applied. */
  var discount: js.UndefOr[Price] = js.undefined
  /** The OfferId(s) that were purchased in this order and map to this specific benefit of the promotion. */
  var offerIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Further describes the benefit of the promotion. Note that we will expand on this enumeration as we support new promotion sub-types. */
  var subType: js.UndefOr[String] = js.undefined
  /** The impact on tax when the promotion is applied. */
  var taxImpact: js.UndefOr[Price] = js.undefined
  /** Describes whether the promotion applies to products (e.g. 20% off) or to shipping (e.g. Free Shipping). */
  var `type`: js.UndefOr[String] = js.undefined
}

object OrderPromotionBenefit {
  @scala.inline
  def apply(
    discount: Price = null,
    offerIds: js.Array[String] = null,
    subType: String = null,
    taxImpact: Price = null,
    `type`: String = null
  ): OrderPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    if (discount != null) __obj.updateDynamic("discount")(discount)
    if (offerIds != null) __obj.updateDynamic("offerIds")(offerIds)
    if (subType != null) __obj.updateDynamic("subType")(subType)
    if (taxImpact != null) __obj.updateDynamic("taxImpact")(taxImpact)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[OrderPromotionBenefit]
  }
}

