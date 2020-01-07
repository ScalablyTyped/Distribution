package typings.googleapis.buildSrcApisContentV2Dot1Mod.content_v2_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$OrderPromotion extends js.Object {
  /**
    * Items which this promotion may be applied to. If empty, there are no
    * restrictions on applicable items and quantity.
    */
  var applicableItems: js.UndefOr[js.Array[Schema$OrderPromotionItem]] = js.native
  /**
    * Items which this promotion have been applied to.
    */
  var appliedItems: js.UndefOr[js.Array[Schema$OrderPromotionItem]] = js.native
  /**
    * The party funding the promotion.
    */
  var funder: js.UndefOr[String] = js.native
  /**
    * This field is used to identify promotions within merchants&#39; own
    * systems.
    */
  var merchantPromotionId: js.UndefOr[String] = js.native
  /**
    * Estimated discount applied to price. Amount is pre-tax or post-tax
    * depending on location of order.
    */
  var priceValue: js.UndefOr[Schema$Price] = js.native
  /**
    * A short title of the promotion to be shown on the checkout page.
    */
  var shortTitle: js.UndefOr[String] = js.native
  /**
    * The category of the promotion.
    */
  var subtype: js.UndefOr[String] = js.native
  /**
    * Estimated discount applied to tax (if allowed by law).
    */
  var taxValue: js.UndefOr[Schema$Price] = js.native
  /**
    * The title of the promotion.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The scope of the promotion.
    */
  var `type`: js.UndefOr[String] = js.native
}

object Schema$OrderPromotion {
  @scala.inline
  def apply(
    applicableItems: js.Array[Schema$OrderPromotionItem] = null,
    appliedItems: js.Array[Schema$OrderPromotionItem] = null,
    funder: String = null,
    merchantPromotionId: String = null,
    priceValue: Schema$Price = null,
    shortTitle: String = null,
    subtype: String = null,
    taxValue: Schema$Price = null,
    title: String = null,
    `type`: String = null
  ): Schema$OrderPromotion = {
    val __obj = js.Dynamic.literal()
    if (applicableItems != null) __obj.updateDynamic("applicableItems")(applicableItems.asInstanceOf[js.Any])
    if (appliedItems != null) __obj.updateDynamic("appliedItems")(appliedItems.asInstanceOf[js.Any])
    if (funder != null) __obj.updateDynamic("funder")(funder.asInstanceOf[js.Any])
    if (merchantPromotionId != null) __obj.updateDynamic("merchantPromotionId")(merchantPromotionId.asInstanceOf[js.Any])
    if (priceValue != null) __obj.updateDynamic("priceValue")(priceValue.asInstanceOf[js.Any])
    if (shortTitle != null) __obj.updateDynamic("shortTitle")(shortTitle.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (taxValue != null) __obj.updateDynamic("taxValue")(taxValue.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$OrderPromotion]
  }
}

