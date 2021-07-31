package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeConsumerDisclosures extends StObject {
  
  /**
    * The GUID of the account associated with the consumer disclosure.
    */
  var accountEsignId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, indicates that the customer can withdraw their consent to the consumer disclosure when they decline to sign documents.
    * If these recipients sign documents sent to them from your account in the future, they will be required to agree to the terms in the disclosure. The default value is **false**.
    * **Note**: Only Admin users can change this setting.
    */
  var allowCDWithdraw: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowCDWithdraw` property is editable.
    *
    */
  var allowCDWithdrawMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If the customer needs to change their email address, this is the email address to which they should the change request.
    */
  var changeEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Other information about the requirements for the user to change their email address.
    *
    * Example:
    *
    * `We do not require any other information from you to change your email address.`
    */
  var changeEmailOther: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the company name used in the disclosure. The default value is the account name.
    *
    * However, if your account uses signing brands that specify a company name, you can substitute the brand's company name by setting the `useBrand` property to **true**.
    * Whenever an envelope is sent from the account that uses a signing brand with a specified `companyName`, that value is used in email notifications and in the signing experience.
    *
    * **Note**: This substitution only works if you use the default legal disclosure or if you apply the `companyName` to the merge fields in a custom ERSD.
    * You must also set the value of the `useBrand` property to **true**.
    *
    */
  var companyName: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number of the company associated with the consumer disclosure, as a free-formatted string.
    */
  var companyPhone: js.UndefOr[String] = js.undefined
  
  /**
    * The cost per page if the customer requests paper copies.
    *
    * Example:
    *
    * `0.0000`
    */
  var copyCostPerPage: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the fee collection method for cases in which the customer requires paper copies of the document.
    *
    * Maximum length: 255 characters.
    *
    * Example:
    *
    * `We will bill you for any fees at that time, if any.`
    */
  var copyFeeCollectionMethod: js.UndefOr[String] = js.undefined
  
  /**
    * The email address to which the customer should send a request for copies of a document.
    *
    * Maximum length: 100 characters.
    */
  var copyRequestEmail: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, indicates that the consumer disclosure is a custom disclosure. The default is **false**.
    */
  var custom: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true** (default), indicates that eSign is enabled.
    */
  var enableEsign: js.UndefOr[String] = js.undefined
  
  /**
    * The final, assembled text of the Electronic Record and Signature Disclosure that includes the appropriate `companyName` and other specifics.
    * It also includes the HTML tags used for formatting.
    */
  var esignAgreement: js.UndefOr[String] = js.undefined
  
  /**
    * The template for the Electronic Record and Signature Disclosure, which contains placeholders for information such as the `companyName`. It also includes the HTML tags used for formatting.
    *
    * **Note**: If you are switching to or updating a custom disclosure, you can edit both the text and the HTML formatting.
    */
  var esignText: js.UndefOr[String] = js.undefined
  
  /**
    * The simple type enumeration for the language to use when displaying the disclosure. The following languages are supported:
    *
    * - Arabic (`ar`)
    * - Bulgarian (`bg`)
    * - Czech (`cs`)
    * - Chinese Simplified (`zh_CN`)
    * - Chinese Traditional (`zh_TW`)
    * - Croatian (`hr`)
    * - Danish (`da`)
    * - Dutch (`nl`)
    * - English US (`en`)
    * - English UK (`en_GB`)
    * - Estonian (`et`)
    * - Farsi (`fa`)
    * - Finnish (`fi`)
    * - French (`fr`)
    * - French Canadian (`fr_CA`)
    * - German (`de`)
    * - Greek (`el`)
    * - Hebrew (`he`)
    * - Hindi (`hi`)
    * - Hungarian (`hu`)
    * - Bahasa Indonesian (`id`)
    * - Italian (`it`)
    * - Japanese (`ja`)
    * - Korean (`ko`)
    * - Latvian (`lv`)
    * - Lithuanian (`lt`)
    * - Bahasa Melayu (`ms`)
    * - Norwegian (`no`)
    * - Polish (`pl`)
    * - Portuguese (`pt`)
    * - Portuguese Brazil (`pt_BR`)
    * - Romanian (`ro`)
    * - Russian (`ru`)
    * - Serbian (`sr`)
    * - Slovak (`sk`)
    * - Slovenian (`sl`)
    * - Spanish (`es`)
    * - Spanish Latin America (`es_MX`)
    * - Swedish (`sv`)
    * - Thai (`th`)
    * - Turkish (`tr`)
    * - Ukrainian (`uk`)
    * - Vietnamese (`vi`)
    *
    * Additionally, you can automatically detect the browser language being used by the viewer and display the disclosure in that language by setting the value to `browser`.
    */
  var languageCode: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the  recipient must agree to the consumer disclosure. The value of this property is read only. It is calculated based on the account setting
    * `consumerDisclosureFrequency` and the user's actions.
    */
  var mustAgreeToEsign: js.UndefOr[String] = js.undefined
  
  /**
    * **Deprecated**.
    *
    * The `pdfId` property in the consumer_disclosure PUT request is deprecated. For security reasons going forward, any value provided in the request packet must be ignored.
    */
  var pdfId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, specifies that the company name in the signing brand is used for the disclosure. Whenever an envelope is sent from the account that uses a
    * signing brand with a specified company name, that value is used in email notifications and in the signing experience.
    *
    * When set to **false** (default), or if the signing brand does not specify a company name, the account name is used instead.
    *
    * **Note**: This substitution only works if you use the default legal disclosure or if you apply the `companyName` to the merge fields in a custom ERSD.
    */
  var useBrand: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, specifies that recipients in the same account as the sender must agree to eSign an Electronic Record and Signature Disclosure Statement.
    */
  var useConsumerDisclosureWithinAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `useConsumerDisclosureWithinAccount` property is editable.
    *
    */
  var useConsumerDisclosureWithinAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Contains the first address line of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 100 characters.
    */
  var withdrawAddressLine1: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the second address line of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 100 characters.
    */
  var withdrawAddressLine2: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true** (default), indicates that the customer can withdraw consent by email.
    */
  var withdrawByEmail: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, indicates that the customer can withdraw consent by postal mail. The default is **false**.
    */
  var withdrawByMail: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, indicates that the customer can withdraw consent by phone. The default is **false**.
    */
  var withdrawByPhone: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the city of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 50 characters.
    */
  var withdrawCity: js.UndefOr[String] = js.undefined
  
  /**
    * Text indicating the consequences of withdrawing consent.
    *
    * Maximum length: 255 characters.
    */
  var withdrawConsequences: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the email address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 100 characters.
    */
  var withdrawEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Contains any other information needed to withdraw consent.
    *
    * Maximum length: 255 characters.
    *
    * Example:
    *
    * `We do not need any other information from you to withdraw consent.`
    */
  var withdrawOther: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the phone number that a customer can call to register consent withdrawal notification as a free-formatted string.
    *
    * Maximum length: 20 characters.
    */
  var withdrawPhone: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the postal code of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 20 characters.
    */
  var withdrawPostalCode: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the state of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Example: `PA`
    */
  var withdrawState: js.UndefOr[String] = js.undefined
}
object EnvelopeConsumerDisclosures {
  
  @scala.inline
  def apply(): EnvelopeConsumerDisclosures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeConsumerDisclosures]
  }
  
  @scala.inline
  implicit class EnvelopeConsumerDisclosuresMutableBuilder[Self <: EnvelopeConsumerDisclosures] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountEsignId(value: String): Self = StObject.set(x, "accountEsignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountEsignIdUndefined: Self = StObject.set(x, "accountEsignId", js.undefined)
    
    @scala.inline
    def setAllowCDWithdraw(value: String): Self = StObject.set(x, "allowCDWithdraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCDWithdrawMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowCDWithdrawMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCDWithdrawMetadataUndefined: Self = StObject.set(x, "allowCDWithdrawMetadata", js.undefined)
    
    @scala.inline
    def setAllowCDWithdrawUndefined: Self = StObject.set(x, "allowCDWithdraw", js.undefined)
    
    @scala.inline
    def setChangeEmail(value: String): Self = StObject.set(x, "changeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeEmailOther(value: String): Self = StObject.set(x, "changeEmailOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeEmailOtherUndefined: Self = StObject.set(x, "changeEmailOther", js.undefined)
    
    @scala.inline
    def setChangeEmailUndefined: Self = StObject.set(x, "changeEmail", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = StObject.set(x, "companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyNameUndefined: Self = StObject.set(x, "companyName", js.undefined)
    
    @scala.inline
    def setCompanyPhone(value: String): Self = StObject.set(x, "companyPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanyPhoneUndefined: Self = StObject.set(x, "companyPhone", js.undefined)
    
    @scala.inline
    def setCopyCostPerPage(value: String): Self = StObject.set(x, "copyCostPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyCostPerPageUndefined: Self = StObject.set(x, "copyCostPerPage", js.undefined)
    
    @scala.inline
    def setCopyFeeCollectionMethod(value: String): Self = StObject.set(x, "copyFeeCollectionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyFeeCollectionMethodUndefined: Self = StObject.set(x, "copyFeeCollectionMethod", js.undefined)
    
    @scala.inline
    def setCopyRequestEmail(value: String): Self = StObject.set(x, "copyRequestEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyRequestEmailUndefined: Self = StObject.set(x, "copyRequestEmail", js.undefined)
    
    @scala.inline
    def setCustom(value: String): Self = StObject.set(x, "custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomUndefined: Self = StObject.set(x, "custom", js.undefined)
    
    @scala.inline
    def setEnableEsign(value: String): Self = StObject.set(x, "enableEsign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableEsignUndefined: Self = StObject.set(x, "enableEsign", js.undefined)
    
    @scala.inline
    def setEsignAgreement(value: String): Self = StObject.set(x, "esignAgreement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsignAgreementUndefined: Self = StObject.set(x, "esignAgreement", js.undefined)
    
    @scala.inline
    def setEsignText(value: String): Self = StObject.set(x, "esignText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEsignTextUndefined: Self = StObject.set(x, "esignText", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = StObject.set(x, "languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageCodeUndefined: Self = StObject.set(x, "languageCode", js.undefined)
    
    @scala.inline
    def setMustAgreeToEsign(value: String): Self = StObject.set(x, "mustAgreeToEsign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMustAgreeToEsignUndefined: Self = StObject.set(x, "mustAgreeToEsign", js.undefined)
    
    @scala.inline
    def setPdfId(value: String): Self = StObject.set(x, "pdfId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPdfIdUndefined: Self = StObject.set(x, "pdfId", js.undefined)
    
    @scala.inline
    def setUseBrand(value: String): Self = StObject.set(x, "useBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseBrandUndefined: Self = StObject.set(x, "useBrand", js.undefined)
    
    @scala.inline
    def setUseConsumerDisclosureWithinAccount(value: String): Self = StObject.set(x, "useConsumerDisclosureWithinAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseConsumerDisclosureWithinAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useConsumerDisclosureWithinAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseConsumerDisclosureWithinAccountMetadataUndefined: Self = StObject.set(x, "useConsumerDisclosureWithinAccountMetadata", js.undefined)
    
    @scala.inline
    def setUseConsumerDisclosureWithinAccountUndefined: Self = StObject.set(x, "useConsumerDisclosureWithinAccount", js.undefined)
    
    @scala.inline
    def setWithdrawAddressLine1(value: String): Self = StObject.set(x, "withdrawAddressLine1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawAddressLine1Undefined: Self = StObject.set(x, "withdrawAddressLine1", js.undefined)
    
    @scala.inline
    def setWithdrawAddressLine2(value: String): Self = StObject.set(x, "withdrawAddressLine2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawAddressLine2Undefined: Self = StObject.set(x, "withdrawAddressLine2", js.undefined)
    
    @scala.inline
    def setWithdrawByEmail(value: String): Self = StObject.set(x, "withdrawByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawByEmailUndefined: Self = StObject.set(x, "withdrawByEmail", js.undefined)
    
    @scala.inline
    def setWithdrawByMail(value: String): Self = StObject.set(x, "withdrawByMail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawByMailUndefined: Self = StObject.set(x, "withdrawByMail", js.undefined)
    
    @scala.inline
    def setWithdrawByPhone(value: String): Self = StObject.set(x, "withdrawByPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawByPhoneUndefined: Self = StObject.set(x, "withdrawByPhone", js.undefined)
    
    @scala.inline
    def setWithdrawCity(value: String): Self = StObject.set(x, "withdrawCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawCityUndefined: Self = StObject.set(x, "withdrawCity", js.undefined)
    
    @scala.inline
    def setWithdrawConsequences(value: String): Self = StObject.set(x, "withdrawConsequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawConsequencesUndefined: Self = StObject.set(x, "withdrawConsequences", js.undefined)
    
    @scala.inline
    def setWithdrawEmail(value: String): Self = StObject.set(x, "withdrawEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawEmailUndefined: Self = StObject.set(x, "withdrawEmail", js.undefined)
    
    @scala.inline
    def setWithdrawOther(value: String): Self = StObject.set(x, "withdrawOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawOtherUndefined: Self = StObject.set(x, "withdrawOther", js.undefined)
    
    @scala.inline
    def setWithdrawPhone(value: String): Self = StObject.set(x, "withdrawPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawPhoneUndefined: Self = StObject.set(x, "withdrawPhone", js.undefined)
    
    @scala.inline
    def setWithdrawPostalCode(value: String): Self = StObject.set(x, "withdrawPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawPostalCodeUndefined: Self = StObject.set(x, "withdrawPostalCode", js.undefined)
    
    @scala.inline
    def setWithdrawState(value: String): Self = StObject.set(x, "withdrawState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithdrawStateUndefined: Self = StObject.set(x, "withdrawState", js.undefined)
  }
}
