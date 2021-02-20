package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.PremiumOrderStatus
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailablePoints extends StObject {
  
  var availablePoints: js.UndefOr[Double] = js.native
  
  var businessId: js.UndefOr[Double] = js.native
  
  var businessName: js.UndefOr[String] = js.native
  
  var businessRole: js.UndefOr[BusinessUserRole] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var lastFailedCharge: js.UndefOr[Timestamp] = js.native
  
  var lastFailedChargeReason: js.UndefOr[String] = js.native
  
  var lastRequestedCharge: js.UndefOr[Timestamp] = js.native
  
  var lastSuccessfulCharge: js.UndefOr[Timestamp] = js.native
  
  var nextChargeDate: js.UndefOr[Timestamp] = js.native
  
  var nextPaymentDue: js.UndefOr[Timestamp] = js.native
  
  var premiumCommerceService: js.UndefOr[String] = js.native
  
  var premiumLockUntil: js.UndefOr[Timestamp] = js.native
  
  var premiumOrderNumber: js.UndefOr[String] = js.native
  
  var premiumServiceSKU: js.UndefOr[String] = js.native
  
  var premiumServiceStart: js.UndefOr[Timestamp] = js.native
  
  var premiumServiceStatus: js.UndefOr[PremiumOrderStatus] = js.native
  
  var premiumSubscriptionNumber: js.UndefOr[String] = js.native
  
  var unitDiscount: js.UndefOr[Double] = js.native
  
  var unitPrice: js.UndefOr[Double] = js.native
  
  var updated: js.UndefOr[Timestamp] = js.native
  
  var uploadLimitEnd: js.UndefOr[Timestamp] = js.native
  
  var uploadLimitNextMonth: js.UndefOr[Double] = js.native
}
object AvailablePoints {
  
  @scala.inline
  def apply(): AvailablePoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailablePoints]
  }
  
  @scala.inline
  implicit class AvailablePointsMutableBuilder[Self <: AvailablePoints] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailablePoints(value: Double): Self = StObject.set(x, "availablePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailablePointsUndefined: Self = StObject.set(x, "availablePoints", js.undefined)
    
    @scala.inline
    def setBusinessId(value: Double): Self = StObject.set(x, "businessId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessIdUndefined: Self = StObject.set(x, "businessId", js.undefined)
    
    @scala.inline
    def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessNameUndefined: Self = StObject.set(x, "businessName", js.undefined)
    
    @scala.inline
    def setBusinessRole(value: BusinessUserRole): Self = StObject.set(x, "businessRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBusinessRoleUndefined: Self = StObject.set(x, "businessRole", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setLastFailedCharge(value: Timestamp): Self = StObject.set(x, "lastFailedCharge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFailedChargeReason(value: String): Self = StObject.set(x, "lastFailedChargeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastFailedChargeReasonUndefined: Self = StObject.set(x, "lastFailedChargeReason", js.undefined)
    
    @scala.inline
    def setLastFailedChargeUndefined: Self = StObject.set(x, "lastFailedCharge", js.undefined)
    
    @scala.inline
    def setLastRequestedCharge(value: Timestamp): Self = StObject.set(x, "lastRequestedCharge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastRequestedChargeUndefined: Self = StObject.set(x, "lastRequestedCharge", js.undefined)
    
    @scala.inline
    def setLastSuccessfulCharge(value: Timestamp): Self = StObject.set(x, "lastSuccessfulCharge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastSuccessfulChargeUndefined: Self = StObject.set(x, "lastSuccessfulCharge", js.undefined)
    
    @scala.inline
    def setNextChargeDate(value: Timestamp): Self = StObject.set(x, "nextChargeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextChargeDateUndefined: Self = StObject.set(x, "nextChargeDate", js.undefined)
    
    @scala.inline
    def setNextPaymentDue(value: Timestamp): Self = StObject.set(x, "nextPaymentDue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPaymentDueUndefined: Self = StObject.set(x, "nextPaymentDue", js.undefined)
    
    @scala.inline
    def setPremiumCommerceService(value: String): Self = StObject.set(x, "premiumCommerceService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumCommerceServiceUndefined: Self = StObject.set(x, "premiumCommerceService", js.undefined)
    
    @scala.inline
    def setPremiumLockUntil(value: Timestamp): Self = StObject.set(x, "premiumLockUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumLockUntilUndefined: Self = StObject.set(x, "premiumLockUntil", js.undefined)
    
    @scala.inline
    def setPremiumOrderNumber(value: String): Self = StObject.set(x, "premiumOrderNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumOrderNumberUndefined: Self = StObject.set(x, "premiumOrderNumber", js.undefined)
    
    @scala.inline
    def setPremiumServiceSKU(value: String): Self = StObject.set(x, "premiumServiceSKU", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumServiceSKUUndefined: Self = StObject.set(x, "premiumServiceSKU", js.undefined)
    
    @scala.inline
    def setPremiumServiceStart(value: Timestamp): Self = StObject.set(x, "premiumServiceStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumServiceStartUndefined: Self = StObject.set(x, "premiumServiceStart", js.undefined)
    
    @scala.inline
    def setPremiumServiceStatus(value: PremiumOrderStatus): Self = StObject.set(x, "premiumServiceStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumServiceStatusUndefined: Self = StObject.set(x, "premiumServiceStatus", js.undefined)
    
    @scala.inline
    def setPremiumSubscriptionNumber(value: String): Self = StObject.set(x, "premiumSubscriptionNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPremiumSubscriptionNumberUndefined: Self = StObject.set(x, "premiumSubscriptionNumber", js.undefined)
    
    @scala.inline
    def setUnitDiscount(value: Double): Self = StObject.set(x, "unitDiscount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDiscountUndefined: Self = StObject.set(x, "unitDiscount", js.undefined)
    
    @scala.inline
    def setUnitPrice(value: Double): Self = StObject.set(x, "unitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitPriceUndefined: Self = StObject.set(x, "unitPrice", js.undefined)
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
    
    @scala.inline
    def setUploadLimitEnd(value: Timestamp): Self = StObject.set(x, "uploadLimitEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadLimitEndUndefined: Self = StObject.set(x, "uploadLimitEnd", js.undefined)
    
    @scala.inline
    def setUploadLimitNextMonth(value: Double): Self = StObject.set(x, "uploadLimitNextMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadLimitNextMonthUndefined: Self = StObject.set(x, "uploadLimitNextMonth", js.undefined)
  }
}
