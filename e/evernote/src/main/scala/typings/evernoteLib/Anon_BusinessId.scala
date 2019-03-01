package typings
package evernoteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BusinessId extends js.Object {
  var businessId: js.UndefOr[scala.Double] = js.undefined
  var businessName: js.UndefOr[java.lang.String] = js.undefined
  var businessRole: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.BusinessUserRole] = js.undefined
  var currency: js.UndefOr[java.lang.String] = js.undefined
  var lastFailedCharge: js.UndefOr[scala.Double] = js.undefined
  var lastFailedChargeReason: js.UndefOr[java.lang.String] = js.undefined
  var lastRequestedCharge: js.UndefOr[scala.Double] = js.undefined
  var lastSuccessfulCharge: js.UndefOr[scala.Double] = js.undefined
  var nextChargeDate: js.UndefOr[scala.Double] = js.undefined
  var nextPaymentDue: js.UndefOr[scala.Double] = js.undefined
  var premiumCommerceService: js.UndefOr[java.lang.String] = js.undefined
  var premiumLockUntil: js.UndefOr[scala.Double] = js.undefined
  var premiumOrderNumber: js.UndefOr[java.lang.String] = js.undefined
  var premiumServiceSKU: js.UndefOr[java.lang.String] = js.undefined
  var premiumServiceStart: js.UndefOr[scala.Double] = js.undefined
  var premiumServiceStatus: js.UndefOr[evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus] = js.undefined
  var premiumSubscriptionNumber: js.UndefOr[java.lang.String] = js.undefined
  var unitDiscount: js.UndefOr[scala.Double] = js.undefined
  var unitPrice: js.UndefOr[scala.Double] = js.undefined
  var updated: js.UndefOr[scala.Double] = js.undefined
  var uploadLimit: js.UndefOr[scala.Double] = js.undefined
  var uploadLimitEnd: js.UndefOr[scala.Double] = js.undefined
  var uploadLimitNextMonth: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BusinessId {
  @scala.inline
  def apply(
    businessId: scala.Int | scala.Double = null,
    businessName: java.lang.String = null,
    businessRole: evernoteLib.evernoteMod.EvernoteNs.BusinessUserRole = null,
    currency: java.lang.String = null,
    lastFailedCharge: scala.Int | scala.Double = null,
    lastFailedChargeReason: java.lang.String = null,
    lastRequestedCharge: scala.Int | scala.Double = null,
    lastSuccessfulCharge: scala.Int | scala.Double = null,
    nextChargeDate: scala.Int | scala.Double = null,
    nextPaymentDue: scala.Int | scala.Double = null,
    premiumCommerceService: java.lang.String = null,
    premiumLockUntil: scala.Int | scala.Double = null,
    premiumOrderNumber: java.lang.String = null,
    premiumServiceSKU: java.lang.String = null,
    premiumServiceStart: scala.Int | scala.Double = null,
    premiumServiceStatus: evernoteLib.evernoteMod.EvernoteNs.PremiumOrderStatus = null,
    premiumSubscriptionNumber: java.lang.String = null,
    unitDiscount: scala.Int | scala.Double = null,
    unitPrice: scala.Int | scala.Double = null,
    updated: scala.Int | scala.Double = null,
    uploadLimit: scala.Int | scala.Double = null,
    uploadLimitEnd: scala.Int | scala.Double = null,
    uploadLimitNextMonth: scala.Int | scala.Double = null
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

