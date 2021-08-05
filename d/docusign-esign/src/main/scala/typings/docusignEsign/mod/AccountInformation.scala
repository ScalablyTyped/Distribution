package typings.docusignEsign.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInformation extends StObject {
  
  /**
    * The GUID associated with the account ID.
    */
  var accountIdGuid: js.UndefOr[String] = js.undefined
  
  /**
    * The name on the account.
    */
  var accountName: js.UndefOr[String] = js.undefined
  
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
  ] = js.undefined
  
  /**
    * When set to **true**, the transaction rooms feature exposed through the Workspaces API is enabled.
    */
  var allowTransactionRooms: js.UndefOr[String] = js.undefined
  
  /**
    * Number of days remaining in the current billing period.
    */
  var billingPeriodDaysRemaining: js.UndefOr[String] = js.undefined
  
  /**
    * The billing period end date in UTC timedate format.
    */
  var billingPeriodEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * The number of envelopes that can be sent in the current billing period (can be unlimited).
    */
  var billingPeriodEnvelopesAllowed: js.UndefOr[String] = js.undefined
  
  /**
    * The number of envelopes that have been sent in the current billing period.
    */
  var billingPeriodEnvelopesSent: js.UndefOr[String] = js.undefined
  
  /**
    * The billing period start date in UTC timedate format.
    */
  var billingPeriodStartDate: js.UndefOr[String] = js.undefined
  
  /**
    * The type of billing method on the account. Valid values are:
    *
    * - `direct`
    * - `web`
    */
  var billingProfile: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, specifies that you can upgrade the account through the API. For GET methods, you must set the `include_metadata` query parameter to **true**
    * for this property to appear in the response.
    */
  var canUpgrade: js.UndefOr[String] = js.undefined
  
  var connectPermission: js.UndefOr[String] = js.undefined
  
  /**
    * The creation date of the account in UTC timedate format.
    */
  var createdDate: js.UndefOr[String] = js.undefined
  
  /**
    * The currency code for the account, based on the [ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  
  /**
    * ID of the plan used to create this account.
    */
  var currentPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * The code that identifies the billing plan groups and plans for the new account.
    */
  var distributorCode: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the landing page used to create the account.
    */
  var docuSignLandingUrl: js.UndefOr[String] = js.undefined
  
  var dssValues: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * When **true**, the ability to send envelopes is blocked. When **false**, envelopes can be sent.
    */
  var envelopeSendingBlocked: js.UndefOr[String] = js.undefined
  
  /**
    * The price of sending an envelope, represented in the account's local currency.
    */
  var envelopeUnitPrice: js.UndefOr[String] = js.undefined
  
  /**
    * The Account ID displayed on the user's Account page.
    */
  var externalAccountId: js.UndefOr[String] = js.undefined
  
  /**
    *  A complex element that contains up to four Question/Answer pairs for forgotten password information for a user.
    */
  var forgottenPasswordQuestionsCount: js.UndefOr[String] = js.undefined
  
  /**
    * When **true**, the account has been downgraded from a premium account type. Otherwise **false**.
    */
  var isDowngrade: js.UndefOr[String] = js.undefined
  
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
    * Identifies the type of plan. Examples include:
    *
    * - `business`
    * - `corporate`
    * - `enterprise`
    * - `free`
    */
  var planClassification: js.UndefOr[String] = js.undefined
  
  /**
    * The date that the current plan will end.
    */
  var planEndDate: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the billing plan used for the account.
    *
    * Examples:
    *
    * - `Personal - Annual`
    * - `Unlimited Envelope Subscription - Annual Billing`
    */
  var planName: js.UndefOr[String] = js.undefined
  
  /**
    * The date that the Account started using the current plan.
    */
  var planStartDate: js.UndefOr[String] = js.undefined
  
  var recipientDomains: js.UndefOr[js.Array[RecipientDomain]] = js.undefined
  
  /**
    * The number of active users the account can have at one time.
    */
  var seatsAllowed: js.UndefOr[String] = js.undefined
  
  /**
    * The number of users currently active on the account.
    */
  var seatsInUse: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the account content per (Title 21 CFR Part 11)
    * [https://www.fda.gov/regulatory-information/search-fda-guidance-documents/part-11-electronic-records-electronic-signatures-scope-and-application].
    * This regulation defines the criteria under which electronic records and electronic signatures are considered trustworthy.
    */
  var status21CFRPart11: js.UndefOr[String] = js.undefined
  
  /**
    * The date on which the account was suspended.
    */
  var suspensionDate: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the account is currently suspended.
    */
  var suspensionStatus: js.UndefOr[String] = js.undefined
}
object AccountInformation {
  
  inline def apply(): AccountInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInformation]
  }
  
  extension [Self <: AccountInformation](x: Self) {
    
    inline def setAccountIdGuid(value: String): Self = StObject.set(x, "accountIdGuid", value.asInstanceOf[js.Any])
    
    inline def setAccountIdGuidUndefined: Self = StObject.set(x, "accountIdGuid", js.undefined)
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setAccountSettings(
      value: /* Contains account settings information. Used in requests to set property values. Used in responses to report property values. */ AccountSettingsInformation
    ): Self = StObject.set(x, "accountSettings", value.asInstanceOf[js.Any])
    
    inline def setAccountSettingsUndefined: Self = StObject.set(x, "accountSettings", js.undefined)
    
    inline def setAllowTransactionRooms(value: String): Self = StObject.set(x, "allowTransactionRooms", value.asInstanceOf[js.Any])
    
    inline def setAllowTransactionRoomsUndefined: Self = StObject.set(x, "allowTransactionRooms", js.undefined)
    
    inline def setBillingPeriodDaysRemaining(value: String): Self = StObject.set(x, "billingPeriodDaysRemaining", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodDaysRemainingUndefined: Self = StObject.set(x, "billingPeriodDaysRemaining", js.undefined)
    
    inline def setBillingPeriodEndDate(value: String): Self = StObject.set(x, "billingPeriodEndDate", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodEndDateUndefined: Self = StObject.set(x, "billingPeriodEndDate", js.undefined)
    
    inline def setBillingPeriodEnvelopesAllowed(value: String): Self = StObject.set(x, "billingPeriodEnvelopesAllowed", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodEnvelopesAllowedUndefined: Self = StObject.set(x, "billingPeriodEnvelopesAllowed", js.undefined)
    
    inline def setBillingPeriodEnvelopesSent(value: String): Self = StObject.set(x, "billingPeriodEnvelopesSent", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodEnvelopesSentUndefined: Self = StObject.set(x, "billingPeriodEnvelopesSent", js.undefined)
    
    inline def setBillingPeriodStartDate(value: String): Self = StObject.set(x, "billingPeriodStartDate", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodStartDateUndefined: Self = StObject.set(x, "billingPeriodStartDate", js.undefined)
    
    inline def setBillingProfile(value: String): Self = StObject.set(x, "billingProfile", value.asInstanceOf[js.Any])
    
    inline def setBillingProfileUndefined: Self = StObject.set(x, "billingProfile", js.undefined)
    
    inline def setCanUpgrade(value: String): Self = StObject.set(x, "canUpgrade", value.asInstanceOf[js.Any])
    
    inline def setCanUpgradeUndefined: Self = StObject.set(x, "canUpgrade", js.undefined)
    
    inline def setConnectPermission(value: String): Self = StObject.set(x, "connectPermission", value.asInstanceOf[js.Any])
    
    inline def setConnectPermissionUndefined: Self = StObject.set(x, "connectPermission", js.undefined)
    
    inline def setCreatedDate(value: String): Self = StObject.set(x, "createdDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "createdDate", js.undefined)
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCodeUndefined: Self = StObject.set(x, "currencyCode", js.undefined)
    
    inline def setCurrentPlanId(value: String): Self = StObject.set(x, "currentPlanId", value.asInstanceOf[js.Any])
    
    inline def setCurrentPlanIdUndefined: Self = StObject.set(x, "currentPlanId", js.undefined)
    
    inline def setDistributorCode(value: String): Self = StObject.set(x, "distributorCode", value.asInstanceOf[js.Any])
    
    inline def setDistributorCodeUndefined: Self = StObject.set(x, "distributorCode", js.undefined)
    
    inline def setDocuSignLandingUrl(value: String): Self = StObject.set(x, "docuSignLandingUrl", value.asInstanceOf[js.Any])
    
    inline def setDocuSignLandingUrlUndefined: Self = StObject.set(x, "docuSignLandingUrl", js.undefined)
    
    inline def setDssValues(value: StringDictionary[String]): Self = StObject.set(x, "dssValues", value.asInstanceOf[js.Any])
    
    inline def setDssValuesUndefined: Self = StObject.set(x, "dssValues", js.undefined)
    
    inline def setEnvelopeSendingBlocked(value: String): Self = StObject.set(x, "envelopeSendingBlocked", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeSendingBlockedUndefined: Self = StObject.set(x, "envelopeSendingBlocked", js.undefined)
    
    inline def setEnvelopeUnitPrice(value: String): Self = StObject.set(x, "envelopeUnitPrice", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUnitPriceUndefined: Self = StObject.set(x, "envelopeUnitPrice", js.undefined)
    
    inline def setExternalAccountId(value: String): Self = StObject.set(x, "externalAccountId", value.asInstanceOf[js.Any])
    
    inline def setExternalAccountIdUndefined: Self = StObject.set(x, "externalAccountId", js.undefined)
    
    inline def setForgottenPasswordQuestionsCount(value: String): Self = StObject.set(x, "forgottenPasswordQuestionsCount", value.asInstanceOf[js.Any])
    
    inline def setForgottenPasswordQuestionsCountUndefined: Self = StObject.set(x, "forgottenPasswordQuestionsCount", js.undefined)
    
    inline def setIsDowngrade(value: String): Self = StObject.set(x, "isDowngrade", value.asInstanceOf[js.Any])
    
    inline def setIsDowngradeUndefined: Self = StObject.set(x, "isDowngrade", js.undefined)
    
    inline def setPaymentMethod(value: String): Self = StObject.set(x, "paymentMethod", value.asInstanceOf[js.Any])
    
    inline def setPaymentMethodUndefined: Self = StObject.set(x, "paymentMethod", js.undefined)
    
    inline def setPlanClassification(value: String): Self = StObject.set(x, "planClassification", value.asInstanceOf[js.Any])
    
    inline def setPlanClassificationUndefined: Self = StObject.set(x, "planClassification", js.undefined)
    
    inline def setPlanEndDate(value: String): Self = StObject.set(x, "planEndDate", value.asInstanceOf[js.Any])
    
    inline def setPlanEndDateUndefined: Self = StObject.set(x, "planEndDate", js.undefined)
    
    inline def setPlanName(value: String): Self = StObject.set(x, "planName", value.asInstanceOf[js.Any])
    
    inline def setPlanNameUndefined: Self = StObject.set(x, "planName", js.undefined)
    
    inline def setPlanStartDate(value: String): Self = StObject.set(x, "planStartDate", value.asInstanceOf[js.Any])
    
    inline def setPlanStartDateUndefined: Self = StObject.set(x, "planStartDate", js.undefined)
    
    inline def setRecipientDomains(value: js.Array[RecipientDomain]): Self = StObject.set(x, "recipientDomains", value.asInstanceOf[js.Any])
    
    inline def setRecipientDomainsUndefined: Self = StObject.set(x, "recipientDomains", js.undefined)
    
    inline def setRecipientDomainsVarargs(value: RecipientDomain*): Self = StObject.set(x, "recipientDomains", js.Array(value :_*))
    
    inline def setSeatsAllowed(value: String): Self = StObject.set(x, "seatsAllowed", value.asInstanceOf[js.Any])
    
    inline def setSeatsAllowedUndefined: Self = StObject.set(x, "seatsAllowed", js.undefined)
    
    inline def setSeatsInUse(value: String): Self = StObject.set(x, "seatsInUse", value.asInstanceOf[js.Any])
    
    inline def setSeatsInUseUndefined: Self = StObject.set(x, "seatsInUse", js.undefined)
    
    inline def setStatus21CFRPart11(value: String): Self = StObject.set(x, "status21CFRPart11", value.asInstanceOf[js.Any])
    
    inline def setStatus21CFRPart11Undefined: Self = StObject.set(x, "status21CFRPart11", js.undefined)
    
    inline def setSuspensionDate(value: String): Self = StObject.set(x, "suspensionDate", value.asInstanceOf[js.Any])
    
    inline def setSuspensionDateUndefined: Self = StObject.set(x, "suspensionDate", js.undefined)
    
    inline def setSuspensionStatus(value: String): Self = StObject.set(x, "suspensionStatus", value.asInstanceOf[js.Any])
    
    inline def setSuspensionStatusUndefined: Self = StObject.set(x, "suspensionStatus", js.undefined)
  }
}
