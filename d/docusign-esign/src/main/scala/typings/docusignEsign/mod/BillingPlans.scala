package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BillingPlans extends StObject {
  
  /**
    * The billing address for the account.
    */
  var billingAddress: js.UndefOr[
    /* Contains information about the address associated with the account. */ AccountAddress
  ] = js.native
  
  /**
    * When set to **true**, the credit card address information is the same as that returned as the billing address.
    * If false, then the billing address is considered a billing contact address, and the credit card address can be different.
    */
  var billingAddressIsCreditCardAddress: js.UndefOr[String] = js.native
  
  /**
    * An object that contains details about the billing plan.
    */
  var billingPlan: js.UndefOr[/* Contains information about an account billing plan. */ AccountBillingPlan] = js.native
  
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
  
  var downgradePlanInformation: js.UndefOr[DowngradePlanUpdateResponse] = js.native
  
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
    * Contains information describing discounts and promotions.
    */
  var referralInformation: js.UndefOr[ReferralInformation] = js.native
  
  /**
    * A list of billing plans that the current billing plan can be rolled into.
    */
  var successorPlans: js.UndefOr[js.Array[/* Contains information about a billing plan. */ BillingPlan]] = js.native
}
object BillingPlans {
  
  @scala.inline
  def apply(): BillingPlans = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BillingPlans]
  }
  
  @scala.inline
  implicit class BillingPlansMutableBuilder[Self <: BillingPlans] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAddress(value: /* Contains information about the address associated with the account. */ AccountAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressIsCreditCardAddress(value: String): Self = StObject.set(x, "billingAddressIsCreditCardAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressIsCreditCardAddressUndefined: Self = StObject.set(x, "billingAddressIsCreditCardAddress", js.undefined)
    
    @scala.inline
    def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    @scala.inline
    def setBillingPlan(value: /* Contains information about an account billing plan. */ AccountBillingPlan): Self = StObject.set(x, "billingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPlanUndefined: Self = StObject.set(x, "billingPlan", js.undefined)
    
    @scala.inline
    def setCreditCardInformation(
      value: /* This object contains information about a credit card that is associated with an account. */ CreditCardInformation
    ): Self = StObject.set(x, "creditCardInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditCardInformationUndefined: Self = StObject.set(x, "creditCardInformation", js.undefined)
    
    @scala.inline
    def setDirectDebitProcessorInformation(
      value: /* Contains information about a bank that processes a customer's direct debit payments. */ DirectDebitProcessorInformation
    ): Self = StObject.set(x, "directDebitProcessorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectDebitProcessorInformationUndefined: Self = StObject.set(x, "directDebitProcessorInformation", js.undefined)
    
    @scala.inline
    def setDowngradePlanInformation(value: DowngradePlanUpdateResponse): Self = StObject.set(x, "downgradePlanInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDowngradePlanInformationUndefined: Self = StObject.set(x, "downgradePlanInformation", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setPaymentProcessorInformation(value: PaymentProcessorInformation): Self = StObject.set(x, "paymentProcessorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentProcessorInformationUndefined: Self = StObject.set(x, "paymentProcessorInformation", js.undefined)
    
    @scala.inline
    def setReferralInformation(value: ReferralInformation): Self = StObject.set(x, "referralInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralInformationUndefined: Self = StObject.set(x, "referralInformation", js.undefined)
    
    @scala.inline
    def setSuccessorPlans(value: js.Array[/* Contains information about a billing plan. */ BillingPlan]): Self = StObject.set(x, "successorPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessorPlansUndefined: Self = StObject.set(x, "successorPlans", js.undefined)
    
    @scala.inline
    def setSuccessorPlansVarargs(value: (/* Contains information about a billing plan. */ BillingPlan)*): Self = StObject.set(x, "successorPlans", js.Array(value :_*))
  }
}
