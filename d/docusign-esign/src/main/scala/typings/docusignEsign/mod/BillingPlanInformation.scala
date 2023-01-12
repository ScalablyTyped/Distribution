package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingPlanInformation extends StObject {
  
  var appStoreReceipt: js.UndefOr[/* Contains information about an APP store receipt. */ AppStoreReceipt] = js.undefined
  
  /**
    * The billing address for the account.
    */
  var billingAddress: js.UndefOr[
    /* Contains information about the address associated with the account. */ AccountAddress
  ] = js.undefined
  
  /**
    * A complex type that has information about the credit card used to pay for this account.
    */
  var creditCardInformation: js.UndefOr[
    /* This object contains information about a credit card that is associated with an account. */ CreditCardInformation
  ] = js.undefined
  
  /**
    * Information about the bank that processes direct debits for the payment plan.
    */
  var directDebitProcessorInformation: js.UndefOr[
    /* Contains information about a bank that processes a customer's direct debit payments. */ DirectDebitProcessorInformation
  ] = js.undefined
  
  /**
    * (Optional) The user's reason for downgrading their billing plan.
    */
  var downgradeReason: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, customer support is provided as part of the account plan.
    */
  var enableSupport: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seats (users) included in the plan.
    */
  var includedSeats: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var incrementalSeats: js.UndefOr[String] = js.undefined
  
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
  var paymentMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the entity that processes payments for the billing plan.
    */
  var paymentProcessorInformation: js.UndefOr[PaymentProcessorInformation] = js.undefined
  
  /**
    * An object used to identify the features and attributes of the account being created.
    */
  var planInformation: js.UndefOr[
    /* An object used to identify the features and attributes of the account being created. */ PlanInformation
  ] = js.undefined
  
  /**
    * A complex type that contains properties for entering referral and discount information.
    */
  var referralInformation: js.UndefOr[ReferralInformation] = js.undefined
  
  /**
    * The renewal status of the account. Possible values are:
    *
    * - `auto`: The account automatically renews.
    * - `queued_for_close`: The account will be closed at the billingPeriodEndDate.
    * - queued_for_downgrade`: The account will be downgraded at the `billingPeriodEndDate`.
    */
  var renewalStatus: js.UndefOr[String] = js.undefined
  
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
}
object BillingPlanInformation {
  
  inline def apply(): BillingPlanInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlanInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillingPlanInformation] (val x: Self) extends AnyVal {
    
    inline def setAppStoreReceipt(value: /* Contains information about an APP store receipt. */ AppStoreReceipt): Self = StObject.set(x, "appStoreReceipt", value.asInstanceOf[js.Any])
    
    inline def setAppStoreReceiptUndefined: Self = StObject.set(x, "appStoreReceipt", js.undefined)
    
    inline def setBillingAddress(value: /* Contains information about the address associated with the account. */ AccountAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setCreditCardInformation(
      value: /* This object contains information about a credit card that is associated with an account. */ CreditCardInformation
    ): Self = StObject.set(x, "creditCardInformation", value.asInstanceOf[js.Any])
    
    inline def setCreditCardInformationUndefined: Self = StObject.set(x, "creditCardInformation", js.undefined)
    
    inline def setDirectDebitProcessorInformation(
      value: /* Contains information about a bank that processes a customer's direct debit payments. */ DirectDebitProcessorInformation
    ): Self = StObject.set(x, "directDebitProcessorInformation", value.asInstanceOf[js.Any])
    
    inline def setDirectDebitProcessorInformationUndefined: Self = StObject.set(x, "directDebitProcessorInformation", js.undefined)
    
    inline def setDowngradeReason(value: String): Self = StObject.set(x, "downgradeReason", value.asInstanceOf[js.Any])
    
    inline def setDowngradeReasonUndefined: Self = StObject.set(x, "downgradeReason", js.undefined)
    
    inline def setEnableSupport(value: String): Self = StObject.set(x, "enableSupport", value.asInstanceOf[js.Any])
    
    inline def setEnableSupportUndefined: Self = StObject.set(x, "enableSupport", js.undefined)
    
    inline def setIncludedSeats(value: String): Self = StObject.set(x, "includedSeats", value.asInstanceOf[js.Any])
    
    inline def setIncludedSeatsUndefined: Self = StObject.set(x, "includedSeats", js.undefined)
    
    inline def setIncrementalSeats(value: String): Self = StObject.set(x, "incrementalSeats", value.asInstanceOf[js.Any])
    
    inline def setIncrementalSeatsUndefined: Self = StObject.set(x, "incrementalSeats", js.undefined)
    
    inline def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setPaymentProcessorInformation(value: PaymentProcessorInformation): Self = StObject.set(x, "paymentProcessorInformation", value.asInstanceOf[js.Any])
    
    inline def setPaymentProcessorInformationUndefined: Self = StObject.set(x, "paymentProcessorInformation", js.undefined)
    
    inline def setPlanInformation(
      value: /* An object used to identify the features and attributes of the account being created. */ PlanInformation
    ): Self = StObject.set(x, "planInformation", value.asInstanceOf[js.Any])
    
    inline def setPlanInformationUndefined: Self = StObject.set(x, "planInformation", js.undefined)
    
    inline def setReferralInformation(value: ReferralInformation): Self = StObject.set(x, "referralInformation", value.asInstanceOf[js.Any])
    
    inline def setReferralInformationUndefined: Self = StObject.set(x, "referralInformation", js.undefined)
    
    inline def setRenewalStatus(value: String): Self = StObject.set(x, "renewalStatus", value.asInstanceOf[js.Any])
    
    inline def setRenewalStatusUndefined: Self = StObject.set(x, "renewalStatus", js.undefined)
    
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
  }
}
