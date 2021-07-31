package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountBillingPlanResponse extends StObject {
  
  /**
    * The billing address for the account.
    */
  var billingAddress: js.UndefOr[AccountAddress] = js.undefined
  
  /**
    * When set to **true**, the credit card address information is the same as that returned as the billing address.
    * If false, then the billing address is considered a billing contact address, and the credit card address can be different.
    */
  var billingAddressIsCreditCardAddress: js.UndefOr[String] = js.undefined
  
  /**
    * An object that contains details about the billing plan.
    */
  var billingPlan: js.UndefOr[AccountBillingPlan] = js.undefined
  
  /**
    * A complex type that has information about the credit card used to pay for this account.
    */
  var creditCardInformation: js.UndefOr[CreditCardInformation] = js.undefined
  
  /**
    * Information about the bank that processes direct debits for the payment plan.
    */
  var directDebitProcessorInformation: js.UndefOr[DirectDebitProcessorInformation] = js.undefined
  
  var downgradePlanInformation: js.UndefOr[DowngradePlanUpdateResponse] = js.undefined
  
  /**
    * The payment method used for the billing plan. Valid values are:
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
    * A complex type that contains properties for entering referral and discount information.
    */
  var referralInformation: js.UndefOr[ReferralInformation] = js.undefined
  
  /**
    * A list of billing plans that the current billing plan can be rolled into.
    */
  var successorPlans: js.UndefOr[js.Array[/* Contains information about a billing plan. */ BillingPlan]] = js.undefined
}
object AccountBillingPlanResponse {
  
  @scala.inline
  def apply(): AccountBillingPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountBillingPlanResponse]
  }
  
  @scala.inline
  implicit class AccountBillingPlanResponseMutableBuilder[Self <: AccountBillingPlanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBillingAddress(value: AccountAddress): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressIsCreditCardAddress(value: String): Self = StObject.set(x, "billingAddressIsCreditCardAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingAddressIsCreditCardAddressUndefined: Self = StObject.set(x, "billingAddressIsCreditCardAddress", js.undefined)
    
    @scala.inline
    def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    @scala.inline
    def setBillingPlan(value: AccountBillingPlan): Self = StObject.set(x, "billingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingPlanUndefined: Self = StObject.set(x, "billingPlan", js.undefined)
    
    @scala.inline
    def setCreditCardInformation(value: CreditCardInformation): Self = StObject.set(x, "creditCardInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreditCardInformationUndefined: Self = StObject.set(x, "creditCardInformation", js.undefined)
    
    @scala.inline
    def setDirectDebitProcessorInformation(value: DirectDebitProcessorInformation): Self = StObject.set(x, "directDebitProcessorInformation", value.asInstanceOf[js.Any])
    
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
