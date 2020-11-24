package typings.docusignEsign.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountInformation extends js.Object {
  
  /**
    * The GUID associated with the account ID.
    */
  var accountIdGuid: js.UndefOr[String] = js.native
  
  /**
    * The name on the account.
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
    * When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.
    */
  var allowTransactionRooms: js.UndefOr[String] = js.native
  
  /**
    * Number of days remaining in the current billing period.
    */
  var billingPeriodDaysRemaining: js.UndefOr[String] = js.native
  
  /**
    * The billing period end date in UTC timedate format.
    */
  var billingPeriodEndDate: js.UndefOr[String] = js.native
  
  /**
    * The number of envelopes that can be sent in the current billing period (can be unlimited).
    */
  var billingPeriodEnvelopesAllowed: js.UndefOr[String] = js.native
  
  /**
    * The number of envelopes that have been sent in the current billing period.
    */
  var billingPeriodEnvelopesSent: js.UndefOr[String] = js.native
  
  /**
    * The billing period start date in UTC timedate format.
    */
  var billingPeriodStartDate: js.UndefOr[String] = js.native
  
  /**
    * The type of billing method on the account. Valid values are:
    *
    * - `direct`
    * - `web`
    */
  var billingProfile: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, specifies that you can upgrade the account through the API. For GET methods, you must set the `include_metadata` query parameter to **true**
    * for this property to appear in the response.
    */
  var canUpgrade: js.UndefOr[String] = js.native
  
  var connectPermission: js.UndefOr[String] = js.native
  
  /**
    * The creation date of the account in UTC timedate format.
    */
  var createdDate: js.UndefOr[String] = js.native
  
  /**
    * The currency code for the account, based on the [ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
    */
  var currencyCode: js.UndefOr[String] = js.native
  
  /**
    * ID of the plan used to create this account.
    */
  var currentPlanId: js.UndefOr[String] = js.native
  
  /**
    * The code that identifies the billing plan groups and plans for the new account.
    */
  var distributorCode: js.UndefOr[String] = js.native
  
  /**
    * URL of the landing page used to create the account.
    */
  var docuSignLandingUrl: js.UndefOr[String] = js.native
  
  var dssValues: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * When **true**, the ability to send envelopes is blocked. When **false**, envelopes can be sent.
    */
  var envelopeSendingBlocked: js.UndefOr[String] = js.native
  
  /**
    * The price of sending an envelope, represented in the account's local currency.
    */
  var envelopeUnitPrice: js.UndefOr[String] = js.native
  
  /**
    * The Account ID displayed on the user's Account page.
    */
  var externalAccountId: js.UndefOr[String] = js.native
  
  /**
    *  A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.
    */
  var forgottenPasswordQuestionsCount: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the account has been downgraded from a premium account type. Otherwise **false**.
    */
  var isDowngrade: js.UndefOr[String] = js.native
  
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
    * Identifies the type of plan. Examples include:
    *
    * - `business`
    * - `corporate`
    * - `enterprise`
    * - `free`
    */
  var planClassification: js.UndefOr[String] = js.native
  
  /**
    * The date that the current plan will end.
    */
  var planEndDate: js.UndefOr[String] = js.native
  
  /**
    * The name of the billing plan used for the account.
    *
    * Examples:
    *
    * - `Personal - Annual`
    * - `Unlimited Envelope Subscription - Annual Billing`
    */
  var planName: js.UndefOr[String] = js.native
  
  /**
    * The date that the Account started using the current plan.
    */
  var planStartDate: js.UndefOr[String] = js.native
  
  var recipientDomains: js.UndefOr[js.Array[RecipientDomain]] = js.native
  
  /**
    * The number of active users the account can have at one time.
    */
  var seatsAllowed: js.UndefOr[String] = js.native
  
  /**
    * The number of users currently active on the account.
    */
  var seatsInUse: js.UndefOr[String] = js.native
  
  /**
    * The status of the account content per (Title 21 CFR Part 11)
    * [https://www.fda.gov/regulatory-information/search-fda-guidance-documents/part-11-electronic-records-electronic-signatures-scope-and-application].
    * This regulation defines the criteria under which electronic records and electronic signatures are considered trustworthy.
    */
  var status21CFRPart11: js.UndefOr[String] = js.native
  
  /**
    * The date on which the account was suspended.
    */
  var suspensionDate: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether the account is currently suspended.
    */
  var suspensionStatus: js.UndefOr[String] = js.native
}
object AccountInformation {
  
  @scala.inline
  def apply(): AccountInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInformation]
  }
  
  @scala.inline
  implicit class AccountInformationOps[Self <: AccountInformation] (val x: Self) extends AnyVal {
    
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
    def setAccountIdGuid(value: String): Self = this.set("accountIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountIdGuid: Self = this.set("accountIdGuid", js.undefined)
    
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
    def setAllowTransactionRooms(value: String): Self = this.set("allowTransactionRooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTransactionRooms: Self = this.set("allowTransactionRooms", js.undefined)
    
    @scala.inline
    def setBillingPeriodDaysRemaining(value: String): Self = this.set("billingPeriodDaysRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPeriodDaysRemaining: Self = this.set("billingPeriodDaysRemaining", js.undefined)
    
    @scala.inline
    def setBillingPeriodEndDate(value: String): Self = this.set("billingPeriodEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPeriodEndDate: Self = this.set("billingPeriodEndDate", js.undefined)
    
    @scala.inline
    def setBillingPeriodEnvelopesAllowed(value: String): Self = this.set("billingPeriodEnvelopesAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPeriodEnvelopesAllowed: Self = this.set("billingPeriodEnvelopesAllowed", js.undefined)
    
    @scala.inline
    def setBillingPeriodEnvelopesSent(value: String): Self = this.set("billingPeriodEnvelopesSent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPeriodEnvelopesSent: Self = this.set("billingPeriodEnvelopesSent", js.undefined)
    
    @scala.inline
    def setBillingPeriodStartDate(value: String): Self = this.set("billingPeriodStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingPeriodStartDate: Self = this.set("billingPeriodStartDate", js.undefined)
    
    @scala.inline
    def setBillingProfile(value: String): Self = this.set("billingProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingProfile: Self = this.set("billingProfile", js.undefined)
    
    @scala.inline
    def setCanUpgrade(value: String): Self = this.set("canUpgrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUpgrade: Self = this.set("canUpgrade", js.undefined)
    
    @scala.inline
    def setConnectPermission(value: String): Self = this.set("connectPermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectPermission: Self = this.set("connectPermission", js.undefined)
    
    @scala.inline
    def setCreatedDate(value: String): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDate: Self = this.set("createdDate", js.undefined)
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrencyCode: Self = this.set("currencyCode", js.undefined)
    
    @scala.inline
    def setCurrentPlanId(value: String): Self = this.set("currentPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentPlanId: Self = this.set("currentPlanId", js.undefined)
    
    @scala.inline
    def setDistributorCode(value: String): Self = this.set("distributorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributorCode: Self = this.set("distributorCode", js.undefined)
    
    @scala.inline
    def setDocuSignLandingUrl(value: String): Self = this.set("docuSignLandingUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocuSignLandingUrl: Self = this.set("docuSignLandingUrl", js.undefined)
    
    @scala.inline
    def setDssValues(value: StringDictionary[String]): Self = this.set("dssValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDssValues: Self = this.set("dssValues", js.undefined)
    
    @scala.inline
    def setEnvelopeSendingBlocked(value: String): Self = this.set("envelopeSendingBlocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeSendingBlocked: Self = this.set("envelopeSendingBlocked", js.undefined)
    
    @scala.inline
    def setEnvelopeUnitPrice(value: String): Self = this.set("envelopeUnitPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeUnitPrice: Self = this.set("envelopeUnitPrice", js.undefined)
    
    @scala.inline
    def setExternalAccountId(value: String): Self = this.set("externalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalAccountId: Self = this.set("externalAccountId", js.undefined)
    
    @scala.inline
    def setForgottenPasswordQuestionsCount(value: String): Self = this.set("forgottenPasswordQuestionsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForgottenPasswordQuestionsCount: Self = this.set("forgottenPasswordQuestionsCount", js.undefined)
    
    @scala.inline
    def setIsDowngrade(value: String): Self = this.set("isDowngrade", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDowngrade: Self = this.set("isDowngrade", js.undefined)
    
    @scala.inline
    def setPaymentMethod(value: String): Self = this.set("paymentMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaymentMethod: Self = this.set("paymentMethod", js.undefined)
    
    @scala.inline
    def setPlanClassification(value: String): Self = this.set("planClassification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanClassification: Self = this.set("planClassification", js.undefined)
    
    @scala.inline
    def setPlanEndDate(value: String): Self = this.set("planEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanEndDate: Self = this.set("planEndDate", js.undefined)
    
    @scala.inline
    def setPlanName(value: String): Self = this.set("planName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanName: Self = this.set("planName", js.undefined)
    
    @scala.inline
    def setPlanStartDate(value: String): Self = this.set("planStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlanStartDate: Self = this.set("planStartDate", js.undefined)
    
    @scala.inline
    def setRecipientDomainsVarargs(value: RecipientDomain*): Self = this.set("recipientDomains", js.Array(value :_*))
    
    @scala.inline
    def setRecipientDomains(value: js.Array[RecipientDomain]): Self = this.set("recipientDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientDomains: Self = this.set("recipientDomains", js.undefined)
    
    @scala.inline
    def setSeatsAllowed(value: String): Self = this.set("seatsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeatsAllowed: Self = this.set("seatsAllowed", js.undefined)
    
    @scala.inline
    def setSeatsInUse(value: String): Self = this.set("seatsInUse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeatsInUse: Self = this.set("seatsInUse", js.undefined)
    
    @scala.inline
    def setStatus21CFRPart11(value: String): Self = this.set("status21CFRPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus21CFRPart11: Self = this.set("status21CFRPart11", js.undefined)
    
    @scala.inline
    def setSuspensionDate(value: String): Self = this.set("suspensionDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionDate: Self = this.set("suspensionDate", js.undefined)
    
    @scala.inline
    def setSuspensionStatus(value: String): Self = this.set("suspensionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuspensionStatus: Self = this.set("suspensionStatus", js.undefined)
  }
}
