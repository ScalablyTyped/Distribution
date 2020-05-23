package typings.evernote.anon

import typings.evernote.mod.Types.BusinessUserRole
import typings.evernote.mod.Types.PremiumOrderStatus
import typings.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AvailablePoints extends js.Object {
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
  @scala.inline
  def apply(
    availablePoints: js.UndefOr[Double] = js.undefined,
    businessId: js.UndefOr[Double] = js.undefined,
    businessName: String = null,
    businessRole: BusinessUserRole = null,
    currency: String = null,
    lastFailedCharge: js.UndefOr[Timestamp] = js.undefined,
    lastFailedChargeReason: String = null,
    lastRequestedCharge: js.UndefOr[Timestamp] = js.undefined,
    lastSuccessfulCharge: js.UndefOr[Timestamp] = js.undefined,
    nextChargeDate: js.UndefOr[Timestamp] = js.undefined,
    nextPaymentDue: js.UndefOr[Timestamp] = js.undefined,
    premiumCommerceService: String = null,
    premiumLockUntil: js.UndefOr[Timestamp] = js.undefined,
    premiumOrderNumber: String = null,
    premiumServiceSKU: String = null,
    premiumServiceStart: js.UndefOr[Timestamp] = js.undefined,
    premiumServiceStatus: PremiumOrderStatus = null,
    premiumSubscriptionNumber: String = null,
    unitDiscount: js.UndefOr[Double] = js.undefined,
    unitPrice: js.UndefOr[Double] = js.undefined,
    updated: js.UndefOr[Timestamp] = js.undefined,
    uploadLimitEnd: js.UndefOr[Timestamp] = js.undefined,
    uploadLimitNextMonth: js.UndefOr[Double] = js.undefined
  ): AvailablePoints = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(availablePoints)) __obj.updateDynamic("availablePoints")(availablePoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(businessId)) __obj.updateDynamic("businessId")(businessId.get.asInstanceOf[js.Any])
    if (businessName != null) __obj.updateDynamic("businessName")(businessName.asInstanceOf[js.Any])
    if (businessRole != null) __obj.updateDynamic("businessRole")(businessRole.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (!js.isUndefined(lastFailedCharge)) __obj.updateDynamic("lastFailedCharge")(lastFailedCharge.get.asInstanceOf[js.Any])
    if (lastFailedChargeReason != null) __obj.updateDynamic("lastFailedChargeReason")(lastFailedChargeReason.asInstanceOf[js.Any])
    if (!js.isUndefined(lastRequestedCharge)) __obj.updateDynamic("lastRequestedCharge")(lastRequestedCharge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lastSuccessfulCharge)) __obj.updateDynamic("lastSuccessfulCharge")(lastSuccessfulCharge.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextChargeDate)) __obj.updateDynamic("nextChargeDate")(nextChargeDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nextPaymentDue)) __obj.updateDynamic("nextPaymentDue")(nextPaymentDue.get.asInstanceOf[js.Any])
    if (premiumCommerceService != null) __obj.updateDynamic("premiumCommerceService")(premiumCommerceService.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumLockUntil)) __obj.updateDynamic("premiumLockUntil")(premiumLockUntil.get.asInstanceOf[js.Any])
    if (premiumOrderNumber != null) __obj.updateDynamic("premiumOrderNumber")(premiumOrderNumber.asInstanceOf[js.Any])
    if (premiumServiceSKU != null) __obj.updateDynamic("premiumServiceSKU")(premiumServiceSKU.asInstanceOf[js.Any])
    if (!js.isUndefined(premiumServiceStart)) __obj.updateDynamic("premiumServiceStart")(premiumServiceStart.get.asInstanceOf[js.Any])
    if (premiumServiceStatus != null) __obj.updateDynamic("premiumServiceStatus")(premiumServiceStatus.asInstanceOf[js.Any])
    if (premiumSubscriptionNumber != null) __obj.updateDynamic("premiumSubscriptionNumber")(premiumSubscriptionNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(unitDiscount)) __obj.updateDynamic("unitDiscount")(unitDiscount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(unitPrice)) __obj.updateDynamic("unitPrice")(unitPrice.get.asInstanceOf[js.Any])
    if (!js.isUndefined(updated)) __obj.updateDynamic("updated")(updated.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadLimitEnd)) __obj.updateDynamic("uploadLimitEnd")(uploadLimitEnd.get.asInstanceOf[js.Any])
    if (!js.isUndefined(uploadLimitNextMonth)) __obj.updateDynamic("uploadLimitNextMonth")(uploadLimitNextMonth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailablePoints]
  }
}

