package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferralInformation extends js.Object {
  
  /**
    * A complex type that contains the following information for entering referral and discount information. The following items are included in the
    * referral information (all string content): enableSupport, includedSeats, saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount,
    * saleDiscountPeriods, saleDiscountSeatPriceOverride, planStartMonth, referralCode, referrerName, advertisementId, publisherId, shopperId,
    * promoCode, groupMemberId, idType, and industry.
    *
    * ###### Note: saleDiscountPercent, saleDiscountAmount, saleDiscountFixedAmount, saleDiscountPeriods, and saleDiscountSeatPriceOverride are reserved for DoucSign use only.
    *
    */
  var advertisementId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, customer support is provided as part of the account plan.
    */
  var enableSupport: js.UndefOr[String] = js.native
  
  /**
    * An optional external id for the referral.
    */
  var externalOrgId: js.UndefOr[String] = js.native
  
  var groupMemberId: js.UndefOr[String] = js.native
  
  var idType: js.UndefOr[String] = js.native
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.native
  
  /**
    * The name of the industry associated with the referral.
    *
    * Example: `Accounting`
    */
  var industry: js.UndefOr[String] = js.native
  
  var planStartMonth: js.UndefOr[String] = js.native
  
  var promoCode: js.UndefOr[String] = js.native
  
  var publisherId: js.UndefOr[String] = js.native
  
  var referralCode: js.UndefOr[String] = js.native
  
  /**
    * The name of the referrer.
    */
  var referrerName: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountAmount: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountFixedAmount: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountPercent: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountPeriods: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountSeatPriceOverride: js.UndefOr[String] = js.native
  
  var shopperId: js.UndefOr[String] = js.native
}
object ReferralInformation {
  
  @scala.inline
  def apply(): ReferralInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferralInformation]
  }
  
  @scala.inline
  implicit class ReferralInformationOps[Self <: ReferralInformation] (val x: Self) extends AnyVal {
    
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
    def setAdvertisementId(value: String): Self = this.set("advertisementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvertisementId: Self = this.set("advertisementId", js.undefined)
    
    @scala.inline
    def setEnableSupport(value: String): Self = this.set("enableSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSupport: Self = this.set("enableSupport", js.undefined)
    
    @scala.inline
    def setExternalOrgId(value: String): Self = this.set("externalOrgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalOrgId: Self = this.set("externalOrgId", js.undefined)
    
    @scala.inline
    def setGroupMemberId(value: String): Self = this.set("groupMemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupMemberId: Self = this.set("groupMemberId", js.undefined)
    
    @scala.inline
    def setIdType(value: String): Self = this.set("idType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdType: Self = this.set("idType", js.undefined)
    
    @scala.inline
    def setIncludedSeats(value: String): Self = this.set("includedSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedSeats: Self = this.set("includedSeats", js.undefined)
    
    @scala.inline
    def setIndustry(value: String): Self = this.set("industry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndustry: Self = this.set("industry", js.undefined)
    
    @scala.inline
    def setPlanStartMonth(value: String): Self = this.set("planStartMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanStartMonth: Self = this.set("planStartMonth", js.undefined)
    
    @scala.inline
    def setPromoCode(value: String): Self = this.set("promoCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromoCode: Self = this.set("promoCode", js.undefined)
    
    @scala.inline
    def setPublisherId(value: String): Self = this.set("publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublisherId: Self = this.set("publisherId", js.undefined)
    
    @scala.inline
    def setReferralCode(value: String): Self = this.set("referralCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferralCode: Self = this.set("referralCode", js.undefined)
    
    @scala.inline
    def setReferrerName(value: String): Self = this.set("referrerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferrerName: Self = this.set("referrerName", js.undefined)
    
    @scala.inline
    def setSaleDiscountAmount(value: String): Self = this.set("saleDiscountAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaleDiscountAmount: Self = this.set("saleDiscountAmount", js.undefined)
    
    @scala.inline
    def setSaleDiscountFixedAmount(value: String): Self = this.set("saleDiscountFixedAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaleDiscountFixedAmount: Self = this.set("saleDiscountFixedAmount", js.undefined)
    
    @scala.inline
    def setSaleDiscountPercent(value: String): Self = this.set("saleDiscountPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaleDiscountPercent: Self = this.set("saleDiscountPercent", js.undefined)
    
    @scala.inline
    def setSaleDiscountPeriods(value: String): Self = this.set("saleDiscountPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaleDiscountPeriods: Self = this.set("saleDiscountPeriods", js.undefined)
    
    @scala.inline
    def setSaleDiscountSeatPriceOverride(value: String): Self = this.set("saleDiscountSeatPriceOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaleDiscountSeatPriceOverride: Self = this.set("saleDiscountSeatPriceOverride", js.undefined)
    
    @scala.inline
    def setShopperId(value: String): Self = this.set("shopperId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShopperId: Self = this.set("shopperId", js.undefined)
  }
}
