package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.PremiumOrderStatus
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailablePoints extends js.Object {
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
  implicit class AvailablePointsOps[Self <: AvailablePoints] (val x: Self) extends AnyVal {
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
    def setAvailablePoints(value: Double): Self = this.set("availablePoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailablePoints: Self = this.set("availablePoints", js.undefined)
    @scala.inline
    def setBusinessId(value: Double): Self = this.set("businessId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessId: Self = this.set("businessId", js.undefined)
    @scala.inline
    def setBusinessName(value: String): Self = this.set("businessName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessName: Self = this.set("businessName", js.undefined)
    @scala.inline
    def setBusinessRole(value: BusinessUserRole): Self = this.set("businessRole", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusinessRole: Self = this.set("businessRole", js.undefined)
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setLastFailedCharge(value: Timestamp): Self = this.set("lastFailedCharge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFailedCharge: Self = this.set("lastFailedCharge", js.undefined)
    @scala.inline
    def setLastFailedChargeReason(value: String): Self = this.set("lastFailedChargeReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastFailedChargeReason: Self = this.set("lastFailedChargeReason", js.undefined)
    @scala.inline
    def setLastRequestedCharge(value: Timestamp): Self = this.set("lastRequestedCharge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastRequestedCharge: Self = this.set("lastRequestedCharge", js.undefined)
    @scala.inline
    def setLastSuccessfulCharge(value: Timestamp): Self = this.set("lastSuccessfulCharge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastSuccessfulCharge: Self = this.set("lastSuccessfulCharge", js.undefined)
    @scala.inline
    def setNextChargeDate(value: Timestamp): Self = this.set("nextChargeDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextChargeDate: Self = this.set("nextChargeDate", js.undefined)
    @scala.inline
    def setNextPaymentDue(value: Timestamp): Self = this.set("nextPaymentDue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPaymentDue: Self = this.set("nextPaymentDue", js.undefined)
    @scala.inline
    def setPremiumCommerceService(value: String): Self = this.set("premiumCommerceService", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremiumCommerceService: Self = this.set("premiumCommerceService", js.undefined)
    @scala.inline
    def setPremiumLockUntil(value: Timestamp): Self = this.set("premiumLockUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremiumLockUntil: Self = this.set("premiumLockUntil", js.undefined)
    @scala.inline
    def setPremiumOrderNumber(value: String): Self = this.set("premiumOrderNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremiumOrderNumber: Self = this.set("premiumOrderNumber", js.undefined)
    @scala.inline
    def setPremiumServiceSKU(value: String): Self = this.set("premiumServiceSKU", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremiumServiceSKU: Self = this.set("premiumServiceSKU", js.undefined)
    @scala.inline
    def setPremiumServiceStart(value: Timestamp): Self = this.set("premiumServiceStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremiumServiceStart: Self = this.set("premiumServiceStart", js.undefined)
    @scala.inline
    def setPremiumServiceStatus(value: PremiumOrderStatus): Self = this.set("premiumServiceStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremiumServiceStatus: Self = this.set("premiumServiceStatus", js.undefined)
    @scala.inline
    def setPremiumSubscriptionNumber(value: String): Self = this.set("premiumSubscriptionNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremiumSubscriptionNumber: Self = this.set("premiumSubscriptionNumber", js.undefined)
    @scala.inline
    def setUnitDiscount(value: Double): Self = this.set("unitDiscount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitDiscount: Self = this.set("unitDiscount", js.undefined)
    @scala.inline
    def setUnitPrice(value: Double): Self = this.set("unitPrice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnitPrice: Self = this.set("unitPrice", js.undefined)
    @scala.inline
    def setUpdated(value: Timestamp): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUploadLimitEnd(value: Timestamp): Self = this.set("uploadLimitEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadLimitEnd: Self = this.set("uploadLimitEnd", js.undefined)
    @scala.inline
    def setUploadLimitNextMonth(value: Double): Self = this.set("uploadLimitNextMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadLimitNextMonth: Self = this.set("uploadLimitNextMonth", js.undefined)
  }
  
}

