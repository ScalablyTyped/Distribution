package typings.gapiDotClientDotContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrderPromotion extends js.Object {
  var benefits: js.UndefOr[js.Array[OrderPromotionBenefit]] = js.undefined
  /**
    * The date and time frame when the promotion is active and ready for validation review. Note that the promotion live time may be delayed for a few hours
    * due to the validation review.
    * Start date and end date are separated by a forward slash (/). The start date is specified by the format (YYYY-MM-DD), followed by the letter ?T?, the
    * time of the day when the sale starts (in Greenwich Mean Time, GMT), followed by an expression of the time zone for the sale. The end date is in the
    * same format.
    */
  var effectiveDates: js.UndefOr[String] = js.undefined
  /** Optional. The text code that corresponds to the promotion when applied on the retailer?s website. */
  var genericRedemptionCode: js.UndefOr[String] = js.undefined
  /** The unique ID of the promotion. */
  var id: js.UndefOr[String] = js.undefined
  /** The full title of the promotion. */
  var longTitle: js.UndefOr[String] = js.undefined
  /** Whether the promotion is applicable to all products or only specific products. */
  var productApplicability: js.UndefOr[String] = js.undefined
  /** Indicates that the promotion is valid online. */
  var redemptionChannel: js.UndefOr[String] = js.undefined
}

object OrderPromotion {
  @scala.inline
  def apply(
    benefits: js.Array[OrderPromotionBenefit] = null,
    effectiveDates: String = null,
    genericRedemptionCode: String = null,
    id: String = null,
    longTitle: String = null,
    productApplicability: String = null,
    redemptionChannel: String = null
  ): OrderPromotion = {
    val __obj = js.Dynamic.literal()
    if (benefits != null) __obj.updateDynamic("benefits")(benefits)
    if (effectiveDates != null) __obj.updateDynamic("effectiveDates")(effectiveDates)
    if (genericRedemptionCode != null) __obj.updateDynamic("genericRedemptionCode")(genericRedemptionCode)
    if (id != null) __obj.updateDynamic("id")(id)
    if (longTitle != null) __obj.updateDynamic("longTitle")(longTitle)
    if (productApplicability != null) __obj.updateDynamic("productApplicability")(productApplicability)
    if (redemptionChannel != null) __obj.updateDynamic("redemptionChannel")(redemptionChannel)
    __obj.asInstanceOf[OrderPromotion]
  }
}

