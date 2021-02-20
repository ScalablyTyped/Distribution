package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NewAccountDefinition extends StObject {
  
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
  implicit class NewAccountDefinitionMutableBuilder[Self <: NewAccountDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    @scala.inline
    def setAccountSettings(
      value: /* Contains account settings information. Used in requests to set property values. Used in responses to report property values. */ AccountSettingsInformation
    ): Self = StObject.set(x, "accountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountSettingsUndefined: Self = StObject.set(x, "accountSettings", js.undefined)
    
    @scala.inline
    def setAddressInformation(value: /* Contains information about the address associated with the account. */ AccountAddress): Self = StObject.set(x, "addressInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressInformationUndefined: Self = StObject.set(x, "addressInformation", js.undefined)
    
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
    def setDistributorCode(value: String): Self = StObject.set(x, "distributorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorCodeUndefined: Self = StObject.set(x, "distributorCode", js.undefined)
    
    @scala.inline
    def setDistributorPassword(value: String): Self = StObject.set(x, "distributorPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributorPasswordUndefined: Self = StObject.set(x, "distributorPassword", js.undefined)
    
    @scala.inline
    def setEnvelopePartitionId(value: String): Self = StObject.set(x, "envelopePartitionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopePartitionIdUndefined: Self = StObject.set(x, "envelopePartitionId", js.undefined)
    
    @scala.inline
    def setInitialUser(value: UserInformation): Self = StObject.set(x, "initialUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialUserUndefined: Self = StObject.set(x, "initialUser", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    @scala.inline
    def setPaymentProcessorInformation(value: PaymentProcessorInformation): Self = StObject.set(x, "paymentProcessorInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaymentProcessorInformationUndefined: Self = StObject.set(x, "paymentProcessorInformation", js.undefined)
    
    @scala.inline
    def setPlanInformation(
      value: /* An object used to identify the features and attributes of the account being created. */ PlanInformation
    ): Self = StObject.set(x, "planInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanInformationUndefined: Self = StObject.set(x, "planInformation", js.undefined)
    
    @scala.inline
    def setReferralInformation(value: ReferralInformation): Self = StObject.set(x, "referralInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReferralInformationUndefined: Self = StObject.set(x, "referralInformation", js.undefined)
    
    @scala.inline
    def setSocialAccountInformation(value: SocialAccountInformation): Self = StObject.set(x, "socialAccountInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialAccountInformationUndefined: Self = StObject.set(x, "socialAccountInformation", js.undefined)
  }
}
