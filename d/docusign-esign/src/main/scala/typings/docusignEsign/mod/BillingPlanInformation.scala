package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPlanInformation extends js.Object {
  
  var appStoreReceipt: js.UndefOr[/* Contains information about an APP store receipt. */ AppStoreReceipt] = js.native
  
  /**
    * The billing address for the account.
    */
  var billingAddress: js.UndefOr[
    /* Contains information about the address associated with the account. */ AccountAddress
  ] = js.native
  
  /**
    * A complex type that has information about the credit card used to pay for this account.
    */
  var creditCardInformation: js.UndefOr[
    /* This object contains information about a credit card that is associated with an account. */ CreditCardInformation
  ] = js.native
  
  /**
    * Information about the bank that processes direct debits for the payment plan.
    */
  var directDebitProcessorInformation: js.UndefOr[
    /* Contains information about a bank that processes a customer's direct debit payments. */ DirectDebitProcessorInformation
  ] = js.native
  
  /**
    * (Optional) The user's reason for downgrading their billing plan.
    */
  var downgradeReason: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, customer support is provided as part of the account plan.
    */
  var enableSupport: js.UndefOr[String] = js.native
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var incrementalSeats: js.UndefOr[String] = js.native
  
  /**
    * The payment method used for the billing plan. Valid values are:
    *
    * - `NotSupported`
    * - `CreditCard`
    * - `PurchaseOrder`
    * - `Premium`
    * - `Freemium`
    * - `FreeTrial`
    * - `AppStore`
    * - `DigitalExternal`
    * - `DirectDebit`
    */
  var paymentMethod: js.UndefOr[String] = js.native
  
  /**
    * Information about the entity that processes payments for the billing plan.
    */
  var paymentProcessorInformation: js.UndefOr[PaymentProcessorInformation] = js.native
  
  /**
    * An object used to identify the features and attributes of the account being created.
    */
  var planInformation: js.UndefOr[
    /* An object used to identify the features and attributes of the account being created. */ PlanInformation
  ] = js.native
  
  /**
    * A complex type that contains properties for entering referral and discount information.
    */
  var referralInformation: js.UndefOr[ReferralInformation] = js.native
  
  /**
    * The renewal status of the account. Possible values are:
    *
    * - `auto`: The account automatically renews.
    * - `queued_for_close`: The account will be closed at the billingPeriodEndDate.
    * - queued_for_downgrade`: The account will be downgraded at the `billingPeriodEndDate`.
    */
  var renewalStatus: js.UndefOr[String] = js.native
  
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
}
object BillingPlanInformation {
  
  @scala.inline
  def apply(): BillingPlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlanInformation]
  }
  
  @scala.inline
  implicit class BillingPlanInformationOps[Self <: BillingPlanInformation] (val x: Self) extends AnyVal {
    
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
    def setAppStoreReceipt(value: /* Contains information about an APP store receipt. */ AppStoreReceipt): Self = this.set("appStoreReceipt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppStoreReceipt: Self = this.set("appStoreReceipt", js.undefined)
    
    @scala.inline
    def setBillingAddress(value: /* Contains information about the address associated with the account. */ AccountAddress): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    
    @scala.inline
    def setCreditCardInformation(
      value: /* This object contains information about a credit card that is associated with an account. */ CreditCardInformation
    ): Self = this.set("creditCardInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditCardInformation: Self = this.set("creditCardInformation", js.undefined)
    
    @scala.inline
    def setDirectDebitProcessorInformation(
      value: /* Contains information about a bank that processes a customer's direct debit payments. */ DirectDebitProcessorInformation
    ): Self = this.set("directDebitProcessorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectDebitProcessorInformation: Self = this.set("directDebitProcessorInformation", js.undefined)
    
    @scala.inline
    def setDowngradeReason(value: String): Self = this.set("downgradeReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradeReason: Self = this.set("downgradeReason", js.undefined)
    
    @scala.inline
    def setEnableSupport(value: String): Self = this.set("enableSupport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSupport: Self = this.set("enableSupport", js.undefined)
    
    @scala.inline
    def setIncludedSeats(value: String): Self = this.set("includedSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedSeats: Self = this.set("includedSeats", js.undefined)
    
    @scala.inline
    def setIncrementalSeats(value: String): Self = this.set("incrementalSeats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncrementalSeats: Self = this.set("incrementalSeats", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    
    @scala.inline
    def setPaymentProcessorInformation(value: PaymentProcessorInformation): Self = this.set("paymentProcessorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentProcessorInformation: Self = this.set("paymentProcessorInformation", js.undefined)
    
    @scala.inline
    def setPlanInformation(
      value: /* An object used to identify the features and attributes of the account being created. */ PlanInformation
    ): Self = this.set("planInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanInformation: Self = this.set("planInformation", js.undefined)
    
    @scala.inline
    def setReferralInformation(value: ReferralInformation): Self = this.set("referralInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferralInformation: Self = this.set("referralInformation", js.undefined)
    
    @scala.inline
    def setRenewalStatus(value: String): Self = this.set("renewalStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenewalStatus: Self = this.set("renewalStatus", js.undefined)
    
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
  }
}
