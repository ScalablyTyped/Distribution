package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferralInformation extends StObject {
  
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
  implicit class ReferralInformationMutableBuilder[Self <: ReferralInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisementId(value: String): Self = StObject.set(x, "advertisementId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisementIdUndefined: Self = StObject.set(x, "advertisementId", js.undefined)
    
    @scala.inline
    def setEnableSupport(value: String): Self = StObject.set(x, "enableSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableSupportUndefined: Self = StObject.set(x, "enableSupport", js.undefined)
    
    @scala.inline
    def setExternalOrgId(value: String): Self = StObject.set(x, "externalOrgId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalOrgIdUndefined: Self = StObject.set(x, "externalOrgId", js.undefined)
    
    @scala.inline
    def setGroupMemberId(value: String): Self = StObject.set(x, "groupMemberId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupMemberIdUndefined: Self = StObject.set(x, "groupMemberId", js.undefined)
    
    @scala.inline
    def setIdType(value: String): Self = StObject.set(x, "idType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdTypeUndefined: Self = StObject.set(x, "idType", js.undefined)
    
    @scala.inline
    def setIncludedSeats(value: String): Self = StObject.set(x, "includedSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludedSeatsUndefined: Self = StObject.set(x, "includedSeats", js.undefined)
    
    @scala.inline
    def setIndustry(value: String): Self = StObject.set(x, "industry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndustryUndefined: Self = StObject.set(x, "industry", js.undefined)
    
    @scala.inline
    def setPlanStartMonth(value: String): Self = StObject.set(x, "planStartMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanStartMonthUndefined: Self = StObject.set(x, "planStartMonth", js.undefined)
    
    @scala.inline
    def setPromoCode(value: String): Self = StObject.set(x, "promoCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPromoCodeUndefined: Self = StObject.set(x, "promoCode", js.undefined)
    
    @scala.inline
    def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherIdUndefined: Self = StObject.set(x, "publisherId", js.undefined)
    
    @scala.inline
    def setReferralCode(value: String): Self = StObject.set(x, "referralCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralCodeUndefined: Self = StObject.set(x, "referralCode", js.undefined)
    
    @scala.inline
    def setReferrerName(value: String): Self = StObject.set(x, "referrerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferrerNameUndefined: Self = StObject.set(x, "referrerName", js.undefined)
    
    @scala.inline
    def setSaleDiscountAmount(value: String): Self = StObject.set(x, "saleDiscountAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleDiscountAmountUndefined: Self = StObject.set(x, "saleDiscountAmount", js.undefined)
    
    @scala.inline
    def setSaleDiscountFixedAmount(value: String): Self = StObject.set(x, "saleDiscountFixedAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleDiscountFixedAmountUndefined: Self = StObject.set(x, "saleDiscountFixedAmount", js.undefined)
    
    @scala.inline
    def setSaleDiscountPercent(value: String): Self = StObject.set(x, "saleDiscountPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleDiscountPercentUndefined: Self = StObject.set(x, "saleDiscountPercent", js.undefined)
    
    @scala.inline
    def setSaleDiscountPeriods(value: String): Self = StObject.set(x, "saleDiscountPeriods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleDiscountPeriodsUndefined: Self = StObject.set(x, "saleDiscountPeriods", js.undefined)
    
    @scala.inline
    def setSaleDiscountSeatPriceOverride(value: String): Self = StObject.set(x, "saleDiscountSeatPriceOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaleDiscountSeatPriceOverrideUndefined: Self = StObject.set(x, "saleDiscountSeatPriceOverride", js.undefined)
    
    @scala.inline
    def setShopperId(value: String): Self = StObject.set(x, "shopperId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShopperIdUndefined: Self = StObject.set(x, "shopperId", js.undefined)
  }
}
