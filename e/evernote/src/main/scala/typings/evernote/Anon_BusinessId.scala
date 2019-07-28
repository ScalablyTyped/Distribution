package typings.evernote

import typings.evernote.evernoteMod.EvernoteNs.BusinessUserRole
import typings.evernote.evernoteMod.EvernoteNs.PremiumOrderStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessId extends js.Object {
  var businessId: js.UndefOr[Double] = js.undefined
  var businessName: js.UndefOr[String] = js.undefined
  var businessRole: js.UndefOr[BusinessUserRole] = js.undefined
  var currency: js.UndefOr[String] = js.undefined
  var lastFailedCharge: js.UndefOr[Double] = js.undefined
  var lastFailedChargeReason: js.UndefOr[String] = js.undefined
  var lastRequestedCharge: js.UndefOr[Double] = js.undefined
  var lastSuccessfulCharge: js.UndefOr[Double] = js.undefined
  var nextChargeDate: js.UndefOr[Double] = js.undefined
  var nextPaymentDue: js.UndefOr[Double] = js.undefined
  var premiumCommerceService: js.UndefOr[String] = js.undefined
  var premiumLockUntil: js.UndefOr[Double] = js.undefined
  var premiumOrderNumber: js.UndefOr[String] = js.undefined
  var premiumServiceSKU: js.UndefOr[String] = js.undefined
  var premiumServiceStart: js.UndefOr[Double] = js.undefined
  var premiumServiceStatus: js.UndefOr[PremiumOrderStatus] = js.undefined
  var premiumSubscriptionNumber: js.UndefOr[String] = js.undefined
  var unitDiscount: js.UndefOr[Double] = js.undefined
  var unitPrice: js.UndefOr[Double] = js.undefined
  var updated: js.UndefOr[Double] = js.undefined
  var uploadLimit: js.UndefOr[Double] = js.undefined
  var uploadLimitEnd: js.UndefOr[Double] = js.undefined
  var uploadLimitNextMonth: js.UndefOr[Double] = js.undefined
}

object Anon_BusinessId {
  @scala.inline
  def apply(
    businessId: Int | Double = null,
    businessName: String = null,
    businessRole: BusinessUserRole = null,
    currency: String = null,
    lastFailedCharge: Int | Double = null,
    lastFailedChargeReason: String = null,
    lastRequestedCharge: Int | Double = null,
    lastSuccessfulCharge: Int | Double = null,
    nextChargeDate: Int | Double = null,
    nextPaymentDue: Int | Double = null,
    premiumCommerceService: String = null,
    premiumLockUntil: Int | Double = null,
    premiumOrderNumber: String = null,
    premiumServiceSKU: String = null,
    premiumServiceStart: Int | Double = null,
    premiumServiceStatus: PremiumOrderStatus = null,
    premiumSubscriptionNumber: String = null,
    unitDiscount: Int | Double = null,
    unitPrice: Int | Double = null,
    updated: Int | Double = null,
    uploadLimit: Int | Double = null,
    uploadLimitEnd: Int | Double = null,
    uploadLimitNextMonth: Int | Double = null
  ): Anon_BusinessId = {
    val __obj = js.Dynamic.literal()
    if (businessId != null) __obj.updateDynamic("businessId")(businessId.asInstanceOf[js.Any])
    if (businessName != null) __obj.updateDynamic("businessName")(businessName)
    if (businessRole != null) __obj.updateDynamic("businessRole")(businessRole)
    if (currency != null) __obj.updateDynamic("currency")(currency)
    if (lastFailedCharge != null) __obj.updateDynamic("lastFailedCharge")(lastFailedCharge.asInstanceOf[js.Any])
    if (lastFailedChargeReason != null) __obj.updateDynamic("lastFailedChargeReason")(lastFailedChargeReason)
    if (lastRequestedCharge != null) __obj.updateDynamic("lastRequestedCharge")(lastRequestedCharge.asInstanceOf[js.Any])
    if (lastSuccessfulCharge != null) __obj.updateDynamic("lastSuccessfulCharge")(lastSuccessfulCharge.asInstanceOf[js.Any])
    if (nextChargeDate != null) __obj.updateDynamic("nextChargeDate")(nextChargeDate.asInstanceOf[js.Any])
    if (nextPaymentDue != null) __obj.updateDynamic("nextPaymentDue")(nextPaymentDue.asInstanceOf[js.Any])
    if (premiumCommerceService != null) __obj.updateDynamic("premiumCommerceService")(premiumCommerceService)
    if (premiumLockUntil != null) __obj.updateDynamic("premiumLockUntil")(premiumLockUntil.asInstanceOf[js.Any])
    if (premiumOrderNumber != null) __obj.updateDynamic("premiumOrderNumber")(premiumOrderNumber)
    if (premiumServiceSKU != null) __obj.updateDynamic("premiumServiceSKU")(premiumServiceSKU)
    if (premiumServiceStart != null) __obj.updateDynamic("premiumServiceStart")(premiumServiceStart.asInstanceOf[js.Any])
    if (premiumServiceStatus != null) __obj.updateDynamic("premiumServiceStatus")(premiumServiceStatus)
    if (premiumSubscriptionNumber != null) __obj.updateDynamic("premiumSubscriptionNumber")(premiumSubscriptionNumber)
    if (unitDiscount != null) __obj.updateDynamic("unitDiscount")(unitDiscount.asInstanceOf[js.Any])
    if (unitPrice != null) __obj.updateDynamic("unitPrice")(unitPrice.asInstanceOf[js.Any])
    if (updated != null) __obj.updateDynamic("updated")(updated.asInstanceOf[js.Any])
    if (uploadLimit != null) __obj.updateDynamic("uploadLimit")(uploadLimit.asInstanceOf[js.Any])
    if (uploadLimitEnd != null) __obj.updateDynamic("uploadLimitEnd")(uploadLimitEnd.asInstanceOf[js.Any])
    if (uploadLimitNextMonth != null) __obj.updateDynamic("uploadLimitNextMonth")(uploadLimitNextMonth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BusinessId]
  }
}

