package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderPromotionBenefit extends js.Object {
  /** The discount in the order price when the promotion is applied. */
  var discount: js.UndefOr[Price] = js.native
  /** The OfferId(s) that were purchased in this order and map to this specific benefit of the promotion. */
  var offerIds: js.UndefOr[js.Array[String]] = js.native
  /** Further describes the benefit of the promotion. Note that we will expand on this enumeration as we support new promotion sub-types. */
  var subType: js.UndefOr[String] = js.native
  /** The impact on tax when the promotion is applied. */
  var taxImpact: js.UndefOr[Price] = js.native
  /** Describes whether the promotion applies to products (e.g. 20% off) or to shipping (e.g. Free Shipping). */
  var `type`: js.UndefOr[String] = js.native
}

object OrderPromotionBenefit {
  @scala.inline
  def apply(): OrderPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPromotionBenefit]
  }
  @scala.inline
  implicit class OrderPromotionBenefitOps[Self <: OrderPromotionBenefit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiscount(value: Price): Self = this.set("discount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiscount: Self = this.set("discount", js.undefined)
    @scala.inline
    def setOfferIdsVarargs(value: String*): Self = this.set("offerIds", js.Array(value :_*))
    @scala.inline
    def setOfferIds(value: js.Array[String]): Self = this.set("offerIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOfferIds: Self = this.set("offerIds", js.undefined)
    @scala.inline
    def setSubType(value: String): Self = this.set("subType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubType: Self = this.set("subType", js.undefined)
    @scala.inline
    def setTaxImpact(value: Price): Self = this.set("taxImpact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaxImpact: Self = this.set("taxImpact", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

