package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  var advertisementId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, customer support is provided as part of the account plan.
    */
  var enableSupport: js.UndefOr[String] = js.undefined
  
  /**
    * An optional external id for the referral.
    */
  var externalOrgId: js.UndefOr[String] = js.undefined
  
  var groupMemberId: js.UndefOr[String] = js.undefined
  
  var idType: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the industry associated with the referral.
    *
    * Example: `Accounting`
    */
  var industry: js.UndefOr[String] = js.undefined
  
  var planStartMonth: js.UndefOr[String] = js.undefined
  
  var promoCode: js.UndefOr[String] = js.undefined
  
  var publisherId: js.UndefOr[String] = js.undefined
  
  var referralCode: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the referrer.
    */
  var referrerName: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountAmount: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountFixedAmount: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountPercent: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountPeriods: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var saleDiscountSeatPriceOverride: js.UndefOr[String] = js.undefined
  
  var shopperId: js.UndefOr[String] = js.undefined
}
object ReferralInformation {
  
  inline def apply(): ReferralInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReferralInformation]
  }
  
  extension [Self <: ReferralInformation](x: Self) {
    
    inline def setAdvertisementId(value: String): Self = StObject.set(x, "advertisementId", value.asInstanceOf[js.Any])
    
    inline def setAdvertisementIdUndefined: Self = StObject.set(x, "advertisementId", js.undefined)
    
    inline def setEnableSupport(value: String): Self = StObject.set(x, "enableSupport", value.asInstanceOf[js.Any])
    
    inline def setEnableSupportUndefined: Self = StObject.set(x, "enableSupport", js.undefined)
    
    inline def setExternalOrgId(value: String): Self = StObject.set(x, "externalOrgId", value.asInstanceOf[js.Any])
    
    inline def setExternalOrgIdUndefined: Self = StObject.set(x, "externalOrgId", js.undefined)
    
    inline def setGroupMemberId(value: String): Self = StObject.set(x, "groupMemberId", value.asInstanceOf[js.Any])
    
    inline def setGroupMemberIdUndefined: Self = StObject.set(x, "groupMemberId", js.undefined)
    
    inline def setIdType(value: String): Self = StObject.set(x, "idType", value.asInstanceOf[js.Any])
    
    inline def setIdTypeUndefined: Self = StObject.set(x, "idType", js.undefined)
    
    inline def setIncludedSeats(value: String): Self = StObject.set(x, "includedSeats", value.asInstanceOf[js.Any])
    
    inline def setIncludedSeatsUndefined: Self = StObject.set(x, "includedSeats", js.undefined)
    
    inline def setIndustry(value: String): Self = StObject.set(x, "industry", value.asInstanceOf[js.Any])
    
    inline def setIndustryUndefined: Self = StObject.set(x, "industry", js.undefined)
    
    inline def setPlanStartMonth(value: String): Self = StObject.set(x, "planStartMonth", value.asInstanceOf[js.Any])
    
    inline def setPlanStartMonthUndefined: Self = StObject.set(x, "planStartMonth", js.undefined)
    
    inline def setPromoCode(value: String): Self = StObject.set(x, "promoCode", value.asInstanceOf[js.Any])
    
    inline def setPromoCodeUndefined: Self = StObject.set(x, "promoCode", js.undefined)
    
    inline def setPublisherId(value: String): Self = StObject.set(x, "publisherId", value.asInstanceOf[js.Any])
    
    inline def setPublisherIdUndefined: Self = StObject.set(x, "publisherId", js.undefined)
    
    inline def setReferralCode(value: String): Self = StObject.set(x, "referralCode", value.asInstanceOf[js.Any])
    
    inline def setReferralCodeUndefined: Self = StObject.set(x, "referralCode", js.undefined)
    
    inline def setReferrerName(value: String): Self = StObject.set(x, "referrerName", value.asInstanceOf[js.Any])
    
    inline def setReferrerNameUndefined: Self = StObject.set(x, "referrerName", js.undefined)
    
    inline def setSaleDiscountAmount(value: String): Self = StObject.set(x, "saleDiscountAmount", value.asInstanceOf[js.Any])
    
    inline def setSaleDiscountAmountUndefined: Self = StObject.set(x, "saleDiscountAmount", js.undefined)
    
    inline def setSaleDiscountFixedAmount(value: String): Self = StObject.set(x, "saleDiscountFixedAmount", value.asInstanceOf[js.Any])
    
    inline def setSaleDiscountFixedAmountUndefined: Self = StObject.set(x, "saleDiscountFixedAmount", js.undefined)
    
    inline def setSaleDiscountPercent(value: String): Self = StObject.set(x, "saleDiscountPercent", value.asInstanceOf[js.Any])
    
    inline def setSaleDiscountPercentUndefined: Self = StObject.set(x, "saleDiscountPercent", js.undefined)
    
    inline def setSaleDiscountPeriods(value: String): Self = StObject.set(x, "saleDiscountPeriods", value.asInstanceOf[js.Any])
    
    inline def setSaleDiscountPeriodsUndefined: Self = StObject.set(x, "saleDiscountPeriods", js.undefined)
    
    inline def setSaleDiscountSeatPriceOverride(value: String): Self = StObject.set(x, "saleDiscountSeatPriceOverride", value.asInstanceOf[js.Any])
    
    inline def setSaleDiscountSeatPriceOverrideUndefined: Self = StObject.set(x, "saleDiscountSeatPriceOverride", js.undefined)
    
    inline def setShopperId(value: String): Self = StObject.set(x, "shopperId", value.asInstanceOf[js.Any])
    
    inline def setShopperIdUndefined: Self = StObject.set(x, "shopperId", js.undefined)
  }
}
