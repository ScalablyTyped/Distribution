package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountBillingPlanResponse extends js.Object {
  
  /**
    * The billing address for the account.
    */
  var billingAddress: js.UndefOr[AccountAddress] = js.native
  
  /**
    * When set to **true**, the credit card address information is the same as that returned as the billing address.
    * If false, then the billing address is considered a billing contact address, and the credit card address can be different.
    */
  var billingAddressIsCreditCardAddress: js.UndefOr[String] = js.native
  
  /**
    * An object that contains details about the billing plan.
    */
  var billingPlan: js.UndefOr[AccountBillingPlan] = js.native
  
  /**
    * A complex type that has information about the credit card used to pay for this account.
    */
  var creditCardInformation: js.UndefOr[CreditCardInformation] = js.native
  
  /**
    * Information about the bank that processes direct debits for the payment plan.
    */
  var directDebitProcessorInformation: js.UndefOr[DirectDebitProcessorInformation] = js.native
  
  var downgradePlanInformation: js.UndefOr[DowngradePlanUpdateResponse] = js.native
  
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
  var paymentMethod: js.UndefOr[String] = js.native
  
  /**
    * Information about the entity that processes payments for the billing plan.
    */
  var paymentProcessorInformation: js.UndefOr[PaymentProcessorInformation] = js.native
  
  /**
    * A complex type that contains properties for entering referral and discount information.
    */
  var referralInformation: js.UndefOr[ReferralInformation] = js.native
  
  /**
    * A list of billing plans that the current billing plan can be rolled into.
    */
  var successorPlans: js.UndefOr[js.Array[/* Contains information about a billing plan. */ BillingPlan]] = js.native
}
object AccountBillingPlanResponse {
  
  @scala.inline
  def apply(): AccountBillingPlanResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountBillingPlanResponse]
  }
  
  @scala.inline
  implicit class AccountBillingPlanResponseOps[Self <: AccountBillingPlanResponse] (val x: Self) extends AnyVal {
    
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
    def setBillingAddress(value: AccountAddress): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    
    @scala.inline
    def setBillingAddressIsCreditCardAddress(value: String): Self = this.set("billingAddressIsCreditCardAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddressIsCreditCardAddress: Self = this.set("billingAddressIsCreditCardAddress", js.undefined)
    
    @scala.inline
    def setBillingPlan(value: AccountBillingPlan): Self = this.set("billingPlan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPlan: Self = this.set("billingPlan", js.undefined)
    
    @scala.inline
    def setCreditCardInformation(value: CreditCardInformation): Self = this.set("creditCardInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreditCardInformation: Self = this.set("creditCardInformation", js.undefined)
    
    @scala.inline
    def setDirectDebitProcessorInformation(value: DirectDebitProcessorInformation): Self = this.set("directDebitProcessorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectDebitProcessorInformation: Self = this.set("directDebitProcessorInformation", js.undefined)
    
    @scala.inline
    def setDowngradePlanInformation(value: DowngradePlanUpdateResponse): Self = this.set("downgradePlanInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDowngradePlanInformation: Self = this.set("downgradePlanInformation", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    
    @scala.inline
    def setPaymentProcessorInformation(value: PaymentProcessorInformation): Self = this.set("paymentProcessorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentProcessorInformation: Self = this.set("paymentProcessorInformation", js.undefined)
    
    @scala.inline
    def setReferralInformation(value: ReferralInformation): Self = this.set("referralInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReferralInformation: Self = this.set("referralInformation", js.undefined)
    
    @scala.inline
    def setSuccessorPlansVarargs(value: (/* Contains information about a billing plan. */ BillingPlan)*): Self = this.set("successorPlans", js.Array(value :_*))
    
    @scala.inline
    def setSuccessorPlans(value: js.Array[/* Contains information about a billing plan. */ BillingPlan]): Self = this.set("successorPlans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessorPlans: Self = this.set("successorPlans", js.undefined)
  }
}
