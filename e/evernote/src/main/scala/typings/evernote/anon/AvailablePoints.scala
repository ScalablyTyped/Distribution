package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.PremiumOrderStatus
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailablePoints extends StObject {
  
  var availablePoints: js.UndefOr[Double] = js.undefined
  
  var businessId: js.UndefOr[Double] = js.undefined
  
  var businessName: js.UndefOr[String] = js.undefined
  
  var businessRole: js.UndefOr[BusinessUserRole] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var lastFailedCharge: js.UndefOr[Timestamp] = js.undefined
  
  var lastFailedChargeReason: js.UndefOr[String] = js.undefined
  
  var lastRequestedCharge: js.UndefOr[Timestamp] = js.undefined
  
  var lastSuccessfulCharge: js.UndefOr[Timestamp] = js.undefined
  
  var nextChargeDate: js.UndefOr[Timestamp] = js.undefined
  
  var nextPaymentDue: js.UndefOr[Timestamp] = js.undefined
  
  var premiumCommerceService: js.UndefOr[String] = js.undefined
  
  var premiumLockUntil: js.UndefOr[Timestamp] = js.undefined
  
  var premiumOrderNumber: js.UndefOr[String] = js.undefined
  
  var premiumServiceSKU: js.UndefOr[String] = js.undefined
  
  var premiumServiceStart: js.UndefOr[Timestamp] = js.undefined
  
  var premiumServiceStatus: js.UndefOr[PremiumOrderStatus] = js.undefined
  
  var premiumSubscriptionNumber: js.UndefOr[String] = js.undefined
  
  var unitDiscount: js.UndefOr[Double] = js.undefined
  
  var unitPrice: js.UndefOr[Double] = js.undefined
  
  var updated: js.UndefOr[Timestamp] = js.undefined
  
  var uploadLimitEnd: js.UndefOr[Timestamp] = js.undefined
  
  var uploadLimitNextMonth: js.UndefOr[Double] = js.undefined
}
object AvailablePoints {
  
  inline def apply(): AvailablePoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailablePoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailablePoints] (val x: Self) extends AnyVal {
    
    inline def setAvailablePoints(value: Double): Self = StObject.set(x, "availablePoints", value.asInstanceOf[js.Any])
    
    inline def setAvailablePointsUndefined: Self = StObject.set(x, "availablePoints", js.undefined)
    
    inline def setBusinessId(value: Double): Self = StObject.set(x, "businessId", value.asInstanceOf[js.Any])
    
    inline def setBusinessIdUndefined: Self = StObject.set(x, "businessId", js.undefined)
    
    inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    inline def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
    
    inline def setBusinessRole(value: BusinessUserRole): Self = StObject.set(x, "businessRole", value.asInstanceOf[js.Any])
    
    inline def setBusinessRoleUndefined: Self = StObject.set(x, "businessRole", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setLastFailedCharge(value: Timestamp): Self = StObject.set(x, "lastFailedCharge", value.asInstanceOf[js.Any])
    
    inline def setLastFailedChargeReason(value: String): Self = StObject.set(x, "lastFailedChargeReason", value.asInstanceOf[js.Any])
    
    inline def setLastFailedChargeReasonUndefined: Self = StObject.set(x, "lastFailedChargeReason", js.undefined)
    
    inline def setLastFailedChargeUndefined: Self = StObject.set(x, "lastFailedCharge", js.undefined)
    
    inline def setLastRequestedCharge(value: Timestamp): Self = StObject.set(x, "lastRequestedCharge", value.asInstanceOf[js.Any])
    
    inline def setLastRequestedChargeUndefined: Self = StObject.set(x, "lastRequestedCharge", js.undefined)
    
    inline def setLastSuccessfulCharge(value: Timestamp): Self = StObject.set(x, "lastSuccessfulCharge", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulChargeUndefined: Self = StObject.set(x, "lastSuccessfulCharge", js.undefined)
    
    inline def setNextChargeDate(value: Timestamp): Self = StObject.set(x, "nextChargeDate", value.asInstanceOf[js.Any])
    
    inline def setNextChargeDateUndefined: Self = StObject.set(x, "nextChargeDate", js.undefined)
    
    inline def setNextPaymentDue(value: Timestamp): Self = StObject.set(x, "nextPaymentDue", value.asInstanceOf[js.Any])
    
    inline def setNextPaymentDueUndefined: Self = StObject.set(x, "nextPaymentDue", js.undefined)
    
    inline def setPremiumCommerceService(value: String): Self = StObject.set(x, "premiumCommerceService", value.asInstanceOf[js.Any])
    
    inline def setPremiumCommerceServiceUndefined: Self = StObject.set(x, "premiumCommerceService", js.undefined)
    
    inline def setPremiumLockUntil(value: Timestamp): Self = StObject.set(x, "premiumLockUntil", value.asInstanceOf[js.Any])
    
    inline def setPremiumLockUntilUndefined: Self = StObject.set(x, "premiumLockUntil", js.undefined)
    
    inline def setPremiumOrderNumber(value: String): Self = StObject.set(x, "premiumOrderNumber", value.asInstanceOf[js.Any])
    
    inline def setPremiumOrderNumberUndefined: Self = StObject.set(x, "premiumOrderNumber", js.undefined)
    
    inline def setPremiumServiceSKU(value: String): Self = StObject.set(x, "premiumServiceSKU", value.asInstanceOf[js.Any])
    
    inline def setPremiumServiceSKUUndefined: Self = StObject.set(x, "premiumServiceSKU", js.undefined)
    
    inline def setPremiumServiceStart(value: Timestamp): Self = StObject.set(x, "premiumServiceStart", value.asInstanceOf[js.Any])
    
    inline def setPremiumServiceStartUndefined: Self = StObject.set(x, "premiumServiceStart", js.undefined)
    
    inline def setPremiumServiceStatus(value: PremiumOrderStatus): Self = StObject.set(x, "premiumServiceStatus", value.asInstanceOf[js.Any])
    
    inline def setPremiumServiceStatusUndefined: Self = StObject.set(x, "premiumServiceStatus", js.undefined)
    
    inline def setPremiumSubscriptionNumber(value: String): Self = StObject.set(x, "premiumSubscriptionNumber", value.asInstanceOf[js.Any])
    
    inline def setPremiumSubscriptionNumberUndefined: Self = StObject.set(x, "premiumSubscriptionNumber", js.undefined)
    
    inline def setUnitDiscount(value: Double): Self = StObject.set(x, "unitDiscount", value.asInstanceOf[js.Any])
    
    inline def setUnitDiscountUndefined: Self = StObject.set(x, "unitDiscount", js.undefined)
    
    inline def setUnitPrice(value: Double): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    inline def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    inline def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    inline def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    inline def setUploadLimitEnd(value: Timestamp): Self = StObject.set(x, "uploadLimitEnd", value.asInstanceOf[js.Any])
    
    inline def setUploadLimitEndUndefined: Self = StObject.set(x, "uploadLimitEnd", js.undefined)
    
    inline def setUploadLimitNextMonth(value: Double): Self = StObject.set(x, "uploadLimitNextMonth", value.asInstanceOf[js.Any])
    
    inline def setUploadLimitNextMonthUndefined: Self = StObject.set(x, "uploadLimitNextMonth", js.undefined)
  }
}
