package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountConsumerDisclosures extends js.Object {
  
  /**
    * The GUID of the account associated with the consumer disclosure.
    */
  var accountEsignId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the customer can withdraw their consent to the consumer disclosure when they decline to sign documents.
    * If these recipients sign documents sent to them from your account in the future, they will be required to agree to the terms in the disclosure. The default value is **false**.
    * **Note**: Only Admin users can change this setting.
    */
  var allowCDWithdraw: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowCDWithdraw` property is editable.
    *
    */
  var allowCDWithdrawMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If the customer needs to change their email address, this is the email address to which they should the change request.
    *
    * Maximum length: 100 characters.
    */
  var changeEmail: js.UndefOr[String] = js.native
  
  /**
    * Other information about the requirements for the user to change their email address.
    *
    * Maximum length: 255 characters.
    *
    * Example:
    *
    * `We do not require any other information from you to change your email address.`
    */
  var changeEmailOther: js.UndefOr[String] = js.native
  
  /**
    * Specifies the company name used in the disclosure. The default value is the account name.
    *
    * However, if your account uses signing brands that specify a company name, you can substitute the brand's company name by setting the `useBrand` property to **true**.
    * Whenever an envelope is sent from the account that uses a signing brand with a specified `companyName`, that value is used in email notifications and in the signing experience.
    *
    * **Note**: This substitution only works if you use the default legal disclosure or if you apply the `companyName` to the merge fields in a custom ERSD.
    * You must also set the value of the `useBrand` property to **true**.
    */
  var companyName: js.UndefOr[String] = js.native
  
  /**
    * The phone number of the company associated with the consumer disclosure, as a free-formatted string.
    */
  var companyPhone: js.UndefOr[String] = js.native
  
  /**
    * The cost per page if the customer requests paper copies.
    *
    * Example:
    *
    * `0.0000`
    */
  var copyCostPerPage: js.UndefOr[String] = js.native
  
  /**
    * Specifies the fee collection method for cases in which the customer requires paper copies of the document.
    *
    * Maximum length: 255 characters.
    *
    * Example:
    *
    * `We will bill you for any fees at that time, if any.`
    */
  var copyFeeCollectionMethod: js.UndefOr[String] = js.native
  
  /**
    * The email address to which the customer should send a request for copies of a document.
    *
    * Maximum length: 100 characters.
    */
  var copyRequestEmail: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the consumer disclosure is a custom disclosure. The default is **false**.
    */
  var custom: js.UndefOr[String] = js.native
  
  /**
    * When set to **true** (default), indicates that eSign is enabled.
    */
  var enableEsign: js.UndefOr[String] = js.native
  
  /**
    * The final, assembled text of the Electronic Record and Signature Disclosure that includes the appropriate `companyName` and other specifics.
    * It also includes the HTML tags used for formatting.
    */
  var esignAgreement: js.UndefOr[String] = js.native
  
  /**
    * The template for the Electronic Record and Signature Disclosure, which contains placeholders for information such as the `companyName`.
    * It also includes the HTML tags used for formatting.
    *
    * **Note**: If you are switching to or updating a custom disclosure, you can edit both the text and the HTML formatting.
    */
  var esignText: js.UndefOr[String] = js.native
  
  /**
    * The code for the language version of the disclosure. The following languages are supported:
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
  var languageCode: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the  recipient must agree to the consumer disclosure. The value of this property is read only. It is calculated based on the account setting
    * `consumerDisclosureFrequency` and the user's actions.
    */
  var mustAgreeToEsign: js.UndefOr[String] = js.native
  
  /**
    * **Deprecated**.
    *
    * The `pdfId` property in the consumer_disclosure PUT request is deprecated. For security reasons going forward, any value provided in the request packet must be ignored.
    */
  var pdfId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, specifies that the company name in the signing brand is used for the disclosure. Whenever an envelope is sent from the account that uses a
    * signing brand with a specified company name, that value is used in email notifications and in the signing experience.
    *
    * When set to **false** (default), or if the signing brand does not specify a company name, the account name is used instead.
    *
    * **Note**: This substitution only works if you use the default legal disclosure or if you apply the `companyName` to the merge fields in a custom ERSD.
    */
  var useBrand: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, specifies that recipients in the same account as the sender must agree to eSign an Electronic Record and Signature Disclosure Statement.
    */
  var useConsumerDisclosureWithinAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `useConsumerDisclosureWithinAccount` property is editable.
    *
    */
  var useConsumerDisclosureWithinAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Contains the first address line of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 100 characters.
    */
  var withdrawAddressLine1: js.UndefOr[String] = js.native
  
  /**
    * Contains the second address line of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 100 characters.
    */
  var withdrawAddressLine2: js.UndefOr[String] = js.native
  
  /**
    * When set to **true** (default), indicates that the customer can withdraw consent by email.
    */
  var withdrawByEmail: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the customer can withdraw consent by postal mail. The default is **false**.
    */
  var withdrawByMail: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the customer can withdraw consent by phone. The default is **false**.
    */
  var withdrawByPhone: js.UndefOr[String] = js.native
  
  /**
    * Contains the city of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 50 characters.
    */
  var withdrawCity: js.UndefOr[String] = js.native
  
  /**
    * Text indicating the consequences of withdrawing consent.
    *
    * Maximum length: 255 characters.
    */
  var withdrawConsequences: js.UndefOr[String] = js.native
  
  /**
    * Contains the email address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 100 characters.
    */
  var withdrawEmail: js.UndefOr[String] = js.native
  
  /**
    * Contains any other information needed to withdraw consent.
    *
    * Maximum length: 255 characters.
    *
    * Example:
    *
    * `We do not need any other information from you to withdraw consent.`
    */
  var withdrawOther: js.UndefOr[String] = js.native
  
  /**
    * Contains the phone number that a customer can call to register consent withdrawal notification as a free-formatted string.
    *
    * Maximum length: 20 characters.
    */
  var withdrawPhone: js.UndefOr[String] = js.native
  
  /**
    * Contains the postal code of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Maximum length: 20 characters.
    */
  var withdrawPostalCode: js.UndefOr[String] = js.native
  
  /**
    * Contains the state of the postal address to which a customer can send a consent withdrawal notification.
    *
    * Example: `PA`
    */
  var withdrawState: js.UndefOr[String] = js.native
}
object AccountConsumerDisclosures {
  
  @scala.inline
  def apply(): AccountConsumerDisclosures = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountConsumerDisclosures]
  }
  
  @scala.inline
  implicit class AccountConsumerDisclosuresOps[Self <: AccountConsumerDisclosures] (val x: Self) extends AnyVal {
    
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
    def setAccountEsignId(value: String): Self = this.set("accountEsignId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountEsignId: Self = this.set("accountEsignId", js.undefined)
    
    @scala.inline
    def setAllowCDWithdraw(value: String): Self = this.set("allowCDWithdraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCDWithdraw: Self = this.set("allowCDWithdraw", js.undefined)
    
    @scala.inline
    def setAllowCDWithdrawMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowCDWithdrawMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCDWithdrawMetadata: Self = this.set("allowCDWithdrawMetadata", js.undefined)
    
    @scala.inline
    def setChangeEmail(value: String): Self = this.set("changeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeEmail: Self = this.set("changeEmail", js.undefined)
    
    @scala.inline
    def setChangeEmailOther(value: String): Self = this.set("changeEmailOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeEmailOther: Self = this.set("changeEmailOther", js.undefined)
    
    @scala.inline
    def setCompanyName(value: String): Self = this.set("companyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyName: Self = this.set("companyName", js.undefined)
    
    @scala.inline
    def setCompanyPhone(value: String): Self = this.set("companyPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanyPhone: Self = this.set("companyPhone", js.undefined)
    
    @scala.inline
    def setCopyCostPerPage(value: String): Self = this.set("copyCostPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyCostPerPage: Self = this.set("copyCostPerPage", js.undefined)
    
    @scala.inline
    def setCopyFeeCollectionMethod(value: String): Self = this.set("copyFeeCollectionMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyFeeCollectionMethod: Self = this.set("copyFeeCollectionMethod", js.undefined)
    
    @scala.inline
    def setCopyRequestEmail(value: String): Self = this.set("copyRequestEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyRequestEmail: Self = this.set("copyRequestEmail", js.undefined)
    
    @scala.inline
    def setCustom(value: String): Self = this.set("custom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    
    @scala.inline
    def setEnableEsign(value: String): Self = this.set("enableEsign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEsign: Self = this.set("enableEsign", js.undefined)
    
    @scala.inline
    def setEsignAgreement(value: String): Self = this.set("esignAgreement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsignAgreement: Self = this.set("esignAgreement", js.undefined)
    
    @scala.inline
    def setEsignText(value: String): Self = this.set("esignText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEsignText: Self = this.set("esignText", js.undefined)
    
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    
    @scala.inline
    def setMustAgreeToEsign(value: String): Self = this.set("mustAgreeToEsign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMustAgreeToEsign: Self = this.set("mustAgreeToEsign", js.undefined)
    
    @scala.inline
    def setPdfId(value: String): Self = this.set("pdfId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePdfId: Self = this.set("pdfId", js.undefined)
    
    @scala.inline
    def setUseBrand(value: String): Self = this.set("useBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBrand: Self = this.set("useBrand", js.undefined)
    
    @scala.inline
    def setUseConsumerDisclosureWithinAccount(value: String): Self = this.set("useConsumerDisclosureWithinAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseConsumerDisclosureWithinAccount: Self = this.set("useConsumerDisclosureWithinAccount", js.undefined)
    
    @scala.inline
    def setUseConsumerDisclosureWithinAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useConsumerDisclosureWithinAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseConsumerDisclosureWithinAccountMetadata: Self = this.set("useConsumerDisclosureWithinAccountMetadata", js.undefined)
    
    @scala.inline
    def setWithdrawAddressLine1(value: String): Self = this.set("withdrawAddressLine1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawAddressLine1: Self = this.set("withdrawAddressLine1", js.undefined)
    
    @scala.inline
    def setWithdrawAddressLine2(value: String): Self = this.set("withdrawAddressLine2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawAddressLine2: Self = this.set("withdrawAddressLine2", js.undefined)
    
    @scala.inline
    def setWithdrawByEmail(value: String): Self = this.set("withdrawByEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawByEmail: Self = this.set("withdrawByEmail", js.undefined)
    
    @scala.inline
    def setWithdrawByMail(value: String): Self = this.set("withdrawByMail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawByMail: Self = this.set("withdrawByMail", js.undefined)
    
    @scala.inline
    def setWithdrawByPhone(value: String): Self = this.set("withdrawByPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawByPhone: Self = this.set("withdrawByPhone", js.undefined)
    
    @scala.inline
    def setWithdrawCity(value: String): Self = this.set("withdrawCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawCity: Self = this.set("withdrawCity", js.undefined)
    
    @scala.inline
    def setWithdrawConsequences(value: String): Self = this.set("withdrawConsequences", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawConsequences: Self = this.set("withdrawConsequences", js.undefined)
    
    @scala.inline
    def setWithdrawEmail(value: String): Self = this.set("withdrawEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawEmail: Self = this.set("withdrawEmail", js.undefined)
    
    @scala.inline
    def setWithdrawOther(value: String): Self = this.set("withdrawOther", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawOther: Self = this.set("withdrawOther", js.undefined)
    
    @scala.inline
    def setWithdrawPhone(value: String): Self = this.set("withdrawPhone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawPhone: Self = this.set("withdrawPhone", js.undefined)
    
    @scala.inline
    def setWithdrawPostalCode(value: String): Self = this.set("withdrawPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawPostalCode: Self = this.set("withdrawPostalCode", js.undefined)
    
    @scala.inline
    def setWithdrawState(value: String): Self = this.set("withdrawState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithdrawState: Self = this.set("withdrawState", js.undefined)
  }
}
