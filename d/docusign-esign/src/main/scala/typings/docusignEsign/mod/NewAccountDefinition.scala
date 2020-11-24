package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewAccountDefinition extends js.Object {
  
  /**
    * The account name for the new account.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * The list of
    * [account settings][accountsettings]
    * that determine
    * the features available for the account.
    * Note that some features are determined
    * by the plan used to create the account and cannot be overridden.
    *
    * [accountsettings]: https://developers.docusign.com/esign-rest-api/reference/Accounts/Accounts/create/#account-settings
    *
    */
  var accountSettings: js.UndefOr[
    /* Contains account settings information. Used in requests to set property values. Used in responses to report property values. */ AccountSettingsInformation
  ] = js.native
  
  /**
    * A complex type that contains the following information for the new account: `Street1`, `Street2`, `City`, `State`, `Zip`, `Phone`, and `Fax`.
    */
  var addressInformation: js.UndefOr[
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
    * The Distributor Code that you received from DocuSign.
    */
  var distributorCode: js.UndefOr[String] = js.native
  
  /**
    * The password for the `distributorCode`.
    */
  var distributorPassword: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var envelopePartitionId: js.UndefOr[String] = js.native
  
  /**
    * A complex type with the initial user information for the new account. Note that some user information is set internally based on the plan and cannot be overridden.
    */
  var initialUser: js.UndefOr[UserInformation] = js.native
  
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
    * Contains properties that map a DocuSign user to a social account such as Facebook or Yahoo.
    */
  var socialAccountInformation: js.UndefOr[SocialAccountInformation] = js.native
}
object NewAccountDefinition {
  
  @scala.inline
  def apply(): NewAccountDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NewAccountDefinition]
  }
  
  @scala.inline
  implicit class NewAccountDefinitionOps[Self <: NewAccountDefinition] (val x: Self) extends AnyVal {
    
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
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    
    @scala.inline
    def setAccountSettings(
      value: /* Contains account settings information. Used in requests to set property values. Used in responses to report property values. */ AccountSettingsInformation
    ): Self = this.set("accountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountSettings: Self = this.set("accountSettings", js.undefined)
    
    @scala.inline
    def setAddressInformation(value: /* Contains information about the address associated with the account. */ AccountAddress): Self = this.set("addressInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddressInformation: Self = this.set("addressInformation", js.undefined)
    
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
    def setDistributorCode(value: String): Self = this.set("distributorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributorCode: Self = this.set("distributorCode", js.undefined)
    
    @scala.inline
    def setDistributorPassword(value: String): Self = this.set("distributorPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributorPassword: Self = this.set("distributorPassword", js.undefined)
    
    @scala.inline
    def setEnvelopePartitionId(value: String): Self = this.set("envelopePartitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopePartitionId: Self = this.set("envelopePartitionId", js.undefined)
    
    @scala.inline
    def setInitialUser(value: UserInformation): Self = this.set("initialUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialUser: Self = this.set("initialUser", js.undefined)
    
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
    def setSocialAccountInformation(value: SocialAccountInformation): Self = this.set("socialAccountInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialAccountInformation: Self = this.set("socialAccountInformation", js.undefined)
  }
}
