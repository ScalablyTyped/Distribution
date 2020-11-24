package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSettingsInformation extends js.Object {
  
  /**
    * Format of the string provided to a recipient in order to access an envelope.
    */
  var accessCodeFormat: js.UndefOr[
    /* object specifying the format of the string provided to a recipient in order to access an envelope. */ AccessCodeFormat
  ] = js.native
  
  /**
    * UTC date/time format for the account.
    */
  var accountDateTimeFormat: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `accountDateTimeFormat` property is editable.
    */
  var accountDateTimeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The name on the account.
    */
  var accountName: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `accountName` property is editable.
    */
  var accountNameMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * An object that specifies notifications (expirations and reminders) for the envelope.
    */
  var accountNotification: js.UndefOr[
    /* A complex element that specifies notifications (expirations and reminders) for the envelope. */ AccountNotification
  ] = js.native
  
  /**
    * An object that defines the settings to use in the UI.
    */
  var accountUISettings: js.UndefOr[
    /* An object that defines the options that are available to non-administrators in the UI. */ AccountUISettings
  ] = js.native
  
  /**
    * When set to **true**, [Signature Adoption Configuration](https://support.docusign.com/en/guides/ndse-admin-guide-signature-adopt-config) is enabled.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var adoptSigConfig: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `adoptSigConfig` property is editable.
    *
    */
  var adoptSigConfigMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**, the Advanced Correction feature is enabled for this account.
    */
  var advancedCorrect: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `advancedCorrect` property is editable.
    *
    */
  var advancedCorrectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the configured [Access Code Format](https://developers.docusign.com/esign-rest-api/reference/Accounts/Accounts/get#accessCodeFormat)
    * page is enabled for account administrators.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowAccessCodeFormat: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowAccessCodeFormat` property is editable.
    *
    */
  var allowAccessCodeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the account can be managed on a per-user basis.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowAccountManagementGranular: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowAccountManagementGranular` property is editable.
    *
    */
  var allowAccountManagementGranularMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether member names can be changed in the account.
    */
  var allowAccountMemberNameChange: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowAccountMemberNameChange` property is editable.
    *
    */
  var allowAccountMemberNameChangeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, [Conditional Routing](https://support.docusign.com/en/guides/ndse-user-guide-conditional-recipients) is enabled for the account as part of
    * DocuSign's Advanced Recipient Routing feature.
    */
  var allowAdvancedRecipientRoutingConditional: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the ` allowAdvancedRecipientRoutingConditional` property is editable.
    */
  var allowAdvancedRecipientRoutingConditionalMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    *   If **true**, an agent recipient can change the email addresses of recipients later in the signing order.
    *
    */
  var allowAgentNameEmailEdit: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowAgentNameEmailEdit` property is editable.
    *
    */
  var allowAgentNameEmailEditMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowAgreementActions: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `allowAgreementActions` property.
    */
  var allowAgreementActionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    *   If **true**, auto-navigation can be enabled for this account.
    *
    */
  var allowAutoNavSettings: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowAutoNavSettings` property is editable.
    *
    */
  var allowAutoNavSettingsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    *  If **true**, auto-tagging is enabled for the account.
    */
  var allowAutoTagging: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowAutoTagging` property is editable.
    */
  var allowAutoTaggingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, bulk send functionality is enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowBulkSend: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowBulkSend` property is editable.
    *
    */
  var allowBulkSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, indicates that the customer can withdraw their consent to the consumer disclosure when they decline to sign documents.
    * If these recipients sign documents sent to them from your account in the future, they will be required to agree to the terms in the disclosure.
    * The default value is **false**.
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
    * Boolean that specifies whether a Connect configuration can use HTTP listeners.
    */
  var allowConnectHttpListenerConfigs: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var allowConnectSendFinishLater: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowConnectSendFinishLater` property is editable.
    *
    */
  var allowConnectSendFinishLaterMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * the account has the ability to change the
    * [Consumer Disclosure](https://support.docusign.com/en/guides/ndse-admin-guide-legal-disclosure)
    * setting.
    *
    */
  var allowConsumerDisclosureOverride: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowConsumerDisclosureOverride` property is editable.
    *
    */
  var allowConsumerDisclosureOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, senders can download form data from the envelopes that they send.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowDataDownload: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowDataDownload` property is editable.
    *
    */
  var allowDataDownloadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether disclosure documents can be included in envelopes.
    */
  var allowDocumentDisclosures: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowDocumentDisclosures` property is editable.
    *
    */
  var allowDocumentDisclosuresMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the [Document Visibility](https://support.docusign.com/guides/ndse-user-guide-document-visibility) feature is enabled for the account.
    *
    */
  var allowDocumentVisibility: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowDocumentVisibility` property is editable.
    *
    */
  var allowDocumentVisibilityMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether notifications can include the envelope's signed document.
    */
  var allowDocumentsOnSignedEnvelopes: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowDocumentsOnSignedEnvelopes` property is editable.
    *
    */
  var allowDocumentsOnSignedEnvelopesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**,
    * [eHanko stamps](https://support.docusign.com/en/guides/ndse-user-guide-manage-your-stamps)
    * are enabled.
    *
    */
  var allowEHankoStamps: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowEHankoStamps` property is editable.
    *
    */
  var allowEHankoStampsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies whether eNote eOriginal integration is enabled.
    *
    */
  var allowENoteEOriginal: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowENoteEOriginal` property is editable.
    *
    */
  var allowENoteEOriginalMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the envelope correction feature is enabled.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowEnvelopeCorrect: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowEnvelopeCorrect` property is editable.
    *
    */
  var allowEnvelopeCorrectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies whether the account is able to
    * manage rules that [transfer ownership](https://support.docusign.com/en/guides/ndse-admin-guide-custody-transfer)
    * of envelopes within the same account.
    *
    *
    *
    *
    */
  var allowEnvelopeCustodyTransfer: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowEnvelopeCustodyTransfer` property is editable.
    *
    */
  var allowEnvelopeCustodyTransferMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies whether
    * [envelope custom fields](https://support.docusign.com/en/guides/ndse-user-guide-manage-custom-fields)
    * are enabled.
    *
    */
  var allowEnvelopeCustomFields: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowEnvelopeCustomFields` property is editable.
    *
    */
  var allowEnvelopeCustomFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, envelope publishing reporting is enabled.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowEnvelopePublishReporting: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowEnvelopePublishReporting` property is editable.
    *
    */
  var allowEnvelopePublishReportingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies whether the account has access to reports.
    *
    */
  var allowEnvelopeReporting: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowEnvelopeReporting` property is editable.
    *
    */
  var allowEnvelopeReportingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, signers are required to use Express Digital Signatures.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowExpressSignerCertificate: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowExpressSignerCertificate` property is editable.
    *
    */
  var allowExpressSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If the account plan does not include calculated fields, this setting allows an account to use them.
    *
    *
    */
  var allowExpression: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowExpression` property is editable.
    *
    */
  var allowExpressionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether resource files can be used for extended sending.
    */
  var allowExtendedSendingResourceFile: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowExtendedSendingResourceFile` property is editable.
    *
    */
  var allowExtendedSendingResourceFileMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account can
    * configure and use signature pads for their recipients.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowExternalSignaturePad: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowExternalSignaturePad` property is editable.
    *
    */
  var allowExternalSignaturePadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, IDV Level 1 is allowed. The default value is **false**.
    */
  var allowIDVLevel1: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowIDVLevel1` property is editable.
    */
  var allowIDVLevel1Metadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowIDVPlatform: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowIDVPlatform` property is editable.
    */
  var allowIDVPlatformMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account administrator can enable in-person signing.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    *
    */
  var allowInPerson: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowInPerson` property is editable.
    *
    */
  var allowInPersonMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, [Managed Stamps](https://support.docusign.com/en/guides/ndse-admin-guide-managed-stamps) are enabled.
    */
  var allowManagedStamps: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowManagedStamps` property is editable.
    *
    */
  var allowManagedStampsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the Document Markup feature is enabled.
    *
    * **Note**:  To use this feature, Document Markup must be enabled at both the account and envelope levels. Only Admin users can change this setting for at the account level.
    */
  var allowMarkup: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowMarkup` property is editable.
    *
    */
  var allowMarkupMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, account users can set their own
    * [time zone settings](https://support.docusign.com/en/articles/How-do-I-modify-time-zone-settings-for-my-account).
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowMemberTimeZone: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowMemberTimeZone` property is editable.
    *
    */
  var allowMemberTimeZoneMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account can use
    * [merge fields](https://support.docusign.com/en/guides/dfs-user-guide-merge-fields-user)
    * with DocuSign for Salesforce.
    *
    */
  var allowMergeFields: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowMergeFields` property is editable.
    *
    */
  var allowMergeFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies whether the account supports multiple brands.
    *
    */
  var allowMultipleBrandProfiles: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowMultipleBrandProfiles` property is editable.
    *
    */
  var allowMultipleBrandProfilesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, recipients can
    * upload multiple signer attachments with a single attachment.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowMultipleSignerAttachments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowMultipleSignerAttachments` property is editable.
    *
    */
  var allowMultipleSignerAttachmentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies whether users can use
    * international numbers
    * for phone authentication.
    *
    */
  var allowNonUSPhoneAuth: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowNonUSPhoneAuth` property is editable.
    *
    */
  var allowNonUSPhoneAuthMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowOcrOfEnvelopeDocuments: js.UndefOr[String] = js.native
  
  var allowOcrOfEnvelopeDocumentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * [offline signing](https://support.docusign.com/articles/Offline-access-with-the-DocuSign-Mobile-App-for-iOS-iPad-iPhone-iPod-Touch)
    * is enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowOfflineSigning: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowOfflineSigning` property is editable.
    *
    */
  var allowOfflineSigningMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, senders can use OpenTrust signer certificates.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowOpenTrustSignerCertificate: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowOpenTrustSignerCertificate` property is editable.
    *
    */
  var allowOpenTrustSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether [Organization Administration](https://developers.docusign.com/orgadmin-api) is enabled for the account.
    */
  var allowOrganizations: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowOrganizations` property is editable.
    *
    */
  var allowOrganizationsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, payment processing is enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowPaymentProcessing: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowPaymentProcessing` property is editable.
    *
    */
  var allowPaymentProcessingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, signers can use personal signer certificates.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowPersonalSignerCertificate: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowPersonalSignerCertificate` property is editable.
    *
    */
  var allowPersonalSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether users can override phone authentication.
    */
  var allowPhoneAuthOverride: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowPhoneAuthOverride` property is editable.
    *
    */
  var allowPhoneAuthOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether phone authentication is enabled for the account.
    */
  var allowPhoneAuthentication: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowPhoneAuthentication` property is editable.
    *
    */
  var allowPhoneAuthenticationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign. This property returns the value **false** when listing account settings. Read only.
    */
  var allowPrivateSigningGroups: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowPrivateSigningGroups` property is editable.
    *
    */
  var allowPrivateSigningGroupsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * an account administrator can to turn on reminders
    * and expiration defaults for the account.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowReminders: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowReminders` property is editable.
    *
    */
  var allowRemindersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * resource files can be uploaded in branding.
    *
    */
  var allowResourceFileBranding: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowResourceFileBranding` property is editable.
    *
    */
  var allowResourceFileBrandingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowSMSDelivery: js.UndefOr[String] = js.native
  
  var allowSMSDeliveryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * account administrators can
    * specify that signers are
    * required to use SAFE-BioPharma digital signatures.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowSafeBioPharmaSignerCertificate: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSafeBioPharmaSignerCertificate` property is editable.
    *
    */
  var allowSafeBioPharmaSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether a DocuSign Signature Appliance can be used with the account.
    */
  var allowSecurityAppliance: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSecurityAppliance` property is editable.
    *
    */
  var allowSecurityApplianceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * the account admin can enable the
    * Send to Certified Delivery
    * feature on the account.
    *
    */
  var allowSendToCertifiedDelivery: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSendToCertifiedDelivery` property is editable.
    *
    */
  var allowSendToCertifiedDeliveryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * the account admin can enable the Send to Intermediary
    * feature on the account.
    *
    */
  var allowSendToIntermediary: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSendToIntermediary` property is editable.
    *
    */
  var allowSendToIntermediaryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * the account can use templates.
    *
    */
  var allowServerTemplates: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowServerTemplates` property is editable.
    *
    */
  var allowServerTemplatesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowSetEmbeddedRecipientStartURL: js.UndefOr[String] = js.native
  
  var allowSetEmbeddedRecipientStartURLMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * shared tabs are enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowSharedTabs: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSharedTabs` property is editable.
    *
    */
  var allowSharedTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, recipients can sign documents from the home page.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowSignDocumentFromHomePage: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSignDocumentFromHomePage` property is editable.
    *
    */
  var allowSignDocumentFromHomePageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * the account administrator can enable
    * the Sign Now feature.
    *
    */
  var allowSignNow: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSignNow` property is editable.
    *
    */
  var allowSignNowMetadata: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, Signature Stamps are enabled.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowSignatureStamps: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSignatureStamps` property is editable.
    *
    */
  var allowSignatureStampsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the recipient of an envelope sent from this account can reassign it to another person.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowSignerReassign: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSignerReassign` property is editable.
    *
    */
  var allowSignerReassignMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, an account administrator can override the ability of an envelope recipient to reassign it to another person.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowSignerReassignOverride: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSignerReassignOverride` property is editable.
    *
    */
  var allowSignerReassignOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether Signing and App Extensions are allowed.
    */
  var allowSigningExtensions: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSigningExtensions` property is editable.
    *
    */
  var allowSigningExtensionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account allows signing groups. This setting is only shown in responses that list account settings. Read only.
    */
  var allowSigningGroups: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSigningGroups` property is editable.
    *
    */
  var allowSigningGroupsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether the account supports radio buttons on tabs [Radio CustomTabType](https://developers.docusign.com/esign-soap-api/reference/Sending-Group/Tab).
    */
  var allowSigningRadioDeselect: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSigningRadioDeselect` property is editable.
    *
    */
  var allowSigningRadioDeselectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Deprecated.
    */
  var allowSocialIdLogin: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var allowSocialIdLoginMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can include supplemental documents.
    */
  var allowSupplementalDocuments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSupplementalDocuments` property is editable.
    */
  var allowSupplementalDocumentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowUsersToAccessDirectory: js.UndefOr[String] = js.native
  
  var allowUsersToAccessDirectoryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowValueInsights: js.UndefOr[String] = js.native
  
  var allowValueInsightsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * This property determines how template anchor tabs are applied.
    *
    * Valid values are:
    *
    * - `document`: Anchor tabs are applied only to the document that you specify.
    * - `envelope`: Anchor tabs are applied to all of the documents in the envelope associated with the template.
    *
    * **Note**: When you are using the `anchorPopulationScope` property with a Composite Template, the value `document` is supported only with a single server template
    * and a single inline template.
    *
    *
    */
  var anchorPopulationScope: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `anchorPopulationScope` property is editable.
    *
    */
  var anchorPopulationScopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    *
    */
  var anchorTagVersionedPlacementEnabled: js.UndefOr[String] = js.native
  
  var anchorTagVersionedPlacementMetadataEnabled: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, envelope documents are included as a PDF file attachment to "signing completed" emails.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var attachCompletedEnvelope: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `attachCompletedEnvelope` property is editable.
    */
  var attachCompletedEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Sets when authentication checks are applied for recipient envelope access. This setting only applies to the following ID checks:
    *
    * - Phone Authentication
    * - SMS Authentication
    * - Knowledge-Based ID
    *
    * This setting takes one of the following options:
    *
    * - `initial_access`: The authentication check always applies the first time a recipient accesses the documents. Recipients are not asked to authenticate again
    * when they access the documents from the same browser on the same device. If the recipient attempts to access the documents from a different browser or a different device,
    * the recipient must pass authentication again. Once authenticated, that recipient is not challenged again on the new device or browser. The ability for a recipient to
    * skip authentication for documents is limited to documents sent from the same sending account.
    * - `each_access`: Authentication checks apply every time a recipient attempts to access the envelope. However, you can configure the Authentication Expiration setting
    * to allow recipients to skip authentication when they have recently passed authentication by setting a variable time frame.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var authenticationCheck: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `authenticationCheck` property is editable.
    *
    */
  var authenticationCheckMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies how auto-navigation works.
    * Valid values are:
    *
    * - `off`
    * - `required_fields`
    * - `required_and_blank_fields`
    * - `all_fields`
    * - `page_then_required_fields`
    * - `page_then_required_and_blank_fields`
    * - `page_then_all_fields`
    *
    */
  var autoNavRule: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `autoNavRule` property is editable.
    *
    */
  var autoNavRuleMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether to automatically provision a user membership in the account for accountless recipients. (Also known as Just-in-Time provisioning.)
    */
  var autoProvisionSignerAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `autoProvisionSignerAccount` property is editable.
    *
    */
  var autoProvisionSignerAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether BCC for Email Archive is enabled for the account. BCC for Email Archive allows you to set up an archive email address
    * so that a BCC copy of an envelope is sent only to that address.
    */
  var bccEmailArchive: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `bccEmailArchive` property is editable.
    *
    */
  var bccEmailArchiveMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    *
    */
  var betaSwitchConfiguration: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var betaSwitchConfigurationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The billing address for the account.
    */
  var billingAddress: js.UndefOr[/* Contains address information. */ AddressInformation] = js.native
  
  /**
    * Metadata that indicates whether the `billingAddress` property is editable.
    *
    */
  var billingAddressMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can use the bulk send feature for the account.
    */
  var bulkSend: js.UndefOr[String] = js.native
  
  var bulkSendMaxCopiesInBatch: js.UndefOr[String] = js.native
  
  var bulkSendMaxUnprocessedEnvelopesCount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `bulkSend` property is editable.
    *
    */
  var bulkSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, account administrators can self-brand their sending console through the DocuSign console.
    */
  var canSelfBrandSend: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `canSelfBrandSend` property is editable.
    *
    */
  var canSelfBrandSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, account administrators can self-brand their signing console through the DocuSign console.
    */
  var canSelfBrandSign: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `canSelfBrandSign` property is editable.
    *
    */
  var canSelfBrandSignMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var canUseSalesforceOAuth: js.UndefOr[String] = js.native
  
  var canUseSalesforceOAuthMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var captureVoiceRecording: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var captureVoiceRecordingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether to use a shorter/wider format when generating the CFR Part 11 signature image.
    */
  var cfrUseWideImage: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `cfrUseWideImage` property is editable.
    *
    */
  var cfrUseWideImageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var checkForMultipleAdminsOnAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `checkForMultipleAdminsOnAccount` property is editable.
    */
  var checkForMultipleAdminsOnAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether the signers of the envelopes from this account use a signature with a DocuSign chrome around it or not.
    */
  var chromeSignatureEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `chromeSignatureEnabled` property is editable.
    *
    */
  var chromeSignatureEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the text of comments is included in email notifications when a comment is posted.
    *
    * **Note**:  If the envelope requires additional recipient authentication, comment text is not included.
    */
  var commentEmailShowMessageText: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `commentEmailShowMessageText` property is editable.
    *
    */
  var commentEmailShowMessageTextMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true** and comments are enabled for the account, senders can disable comments for an envelope through the **Advanced Options** menu that
    * appears during the sending process.
    */
  var commentsAllowEnvelopeOverride: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `commentsAllowEnvelopeOverride` property is editable.
    *
    */
  var commentsAllowEnvelopeOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, conditional fields can be used in documents.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var conditionalFieldsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `conditionalFieldsEnabled` property is editable.
    *
    */
  var conditionalFieldsEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Speficies how often to display the consumer disclosure.
    *
    * Valid values are:
    *
    * - `once`: Per account, the supplemental document is displayed once only per `userId`.
    * - `always`: Per envelope, the supplemental document is displayed once only per `userId`.
    * - `each_access`: Per envelope, the supplemental document is displayed once only per `recipientId`.
    *
    */
  var consumerDisclosureFrequency: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `consumerDisclosureFrequency` property is editable.
    *
    */
  var consumerDisclosureFrequencyMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether to enable PDF form fields to get converted to DocuSign secure fields when the document is added or uploaded to an envelope.
    */
  var convertPdfFields: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `convertPdfFields` property is editable.
    *
    */
  var convertPdfFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies how data is shared for tabs with the same tabLabel. Valid values are:
    *
    * - `document`: Tabs in a document with the same label populate with the same data.
    * - `envelope`: Tabs in all documents in the envelope with the same label populate with the same data.
    *
    * This setting applies to the following tab types:
    *
    * - Check box
    * - Company
    * - Data field
    * - Drop-down list
    * - Full name
    * - Formula
    * - Note
    * - Title
    *
    * **Note**: Only Admin users can change this setting. Changing this setting affects envelopes that have been sent but not completed.
    */
  var dataPopulationScope: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `dataPopulationScope` property is editable.
    *
    */
  var dataPopulationScopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the mobile app distributor key is prevented from connecting for account users.
    */
  var disableMobileApp: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableMobileApp` property is editable.
    *
    */
  var disableMobileAppMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, push notifications are disabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var disableMobilePushNotifications: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableMobilePushNotifications` property is editable.
    *
    */
  var disableMobilePushNotificationsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, sending from a mobile application is disabled.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var disableMobileSending: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableMobileSending` property is editable.
    *
    */
  var disableMobileSendingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, account users cannot be logged into multiple sessions at the same time.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var disableMultipleSessions: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableMultipleSessions` property is editable.
    *
    */
  var disableMultipleSessionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var disablePurgeNotificationsForSenderMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, signers cannot view certificates of completion.
    */
  var disableSignerCertView: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableSignerCertView` property is editable.
    *
    */
  var disableSignerCertViewMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, signers cannot view envelope history.
    */
  var disableSignerHistoryView: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableSignerHistoryView` property is editable.
    *
    */
  var disableSignerHistoryViewMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the **Select Style** option is hidden from signers and they must draw their signature instead.
    */
  var disableStyleSignature: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableStyleSignature` property is editable.
    *
    */
  var disableStyleSignatureMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, signers cannot upload custom image files of their signature and initials.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var disableUploadSignature: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableUploadSignature` property is editable.
    *
    */
  var disableUploadSignatureMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the User Sharing feature is disabled for the account.
    */
  var disableUserSharing: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableUserSharing` property is editable.
    *
    */
  var disableUserSharingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether to display a Beta switch for your app.
    */
  var displayBetaSwitch: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `displayBetaSwitch` property is editable.
    *
    */
  var displayBetaSwitchMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Sets the account document upload restriction for non-account administrators. Valid values are:
    *
    * - `no_restrictions`: There are no restrictions on the type of documents that can be uploaded.
    * - `allow_pdf_only`: Non-administrators can only upload PDF files.
    * - `no_upload`: Non-administrators cannot upload files.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var documentConversionRestrictions: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `documentConversionRestrictions` property is editable.
    *
    */
  var documentConversionRestrictionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Sets a document retention period, which controls the number of days that DocuSign retains documents after they have reached a completed,declined, or voided state.
    * When document retention is enabled for the account, the default value is `356` days.
    */
  var documentRetention: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `documentRetention` property is editable.
    *
    */
  var documentRetentionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true** and `documentRetention` is set, document fields and metadata are also purged after the document retention period ends.
    * The default value is **false**.
    *
    * **Note**: Only Admins can change this setting.
    */
  var documentRetentionPurgeTabs: js.UndefOr[String] = js.native
  
  /**
    * Configures the Document Visibility feature for the account. Valid values are:
    *
    * - `Off`: Document Visibility is not active for the account.
    * - `MustSignToViewUnlessSenderAccount`: Document Visibility is enabled for all envelopes sent from the account. Any member of the sending account can view all of the
    * documents in an envelope.
    * - `MustSignToViewUnlessSender`: Document Visibility is enabled for all envelopes sent from the account. Only the sender can view all of the documents in an envelope.
    * - `SenderCanSetMustSignToViewUnlessSenderAccount`: The sender has the option to enable Document Visibility for an envelope. When enabled for an envelope,
    * all of the documents within it are still visible to any member of the sending account.
    * Vd- `SenderCanSetMustSignToViewUnlessSender`: The sender has the option to enable Document Visibility for an envelope. When enabled for an envelope,
    * all of the documents in the envelope are visible only to the sender.
    *
    * **Note**: For this configuration to take effect, `allowDocumentVisibility` must be set to **true**.
    */
  var documentVisibility: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `documentVisibility` property is editable.
    *
    */
  var documentVisibilityMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies the version of the email templates used in an account. If new signing is selected in a member's Admin page, the user is updated to the newest version (1.1),
    * the minimum version of email supported for the account.
    */
  var emailTemplateVersion: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `emailTemplateVersion` property is editable.
    *
    */
  var emailTemplateVersionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables Access Code Generator on the account.
    */
  var enableAccessCodeGenerator: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableAccessCodeGenerator` property is editable.
    *
    */
  var enableAccessCodeGeneratorMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables Advanced Payments for the account.
    */
  var enableAdvancedPayments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableAdvancedPayments` property is editable.
    *
    */
  var enableAdvancedPaymentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables advanced PowerForms for the account.
    */
  var enableAdvancedPowerForms: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableAdvancedPowerForms` property is editable.
    *
    */
  var enableAdvancedPowerFormsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables the account to set the AutoNav rule setting, which enables a sender to override the auto-navigation setting per envelope.
    *
    * **Note**: To change this setting, you must be a SysAdmin user or `EnableAutoNavByDSAdmin must be set.
    */
  var enableAutoNav: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableAutoNav` property is editable.
    *
    */
  var enableAutoNavMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, calculated fields are enabled for the account.
    *
    * **Note**: This setting can be changed only by Admin users, and only if the account-level setting `allowExpression` is set to **true**.
    */
  var enableCalculatedFields: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableCalculatedFields` property is editable.
    *
    */
  var enableCalculatedFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether clickwraps are enabled in your app. A [clickwrap](https://developers.docusign.com/click-api/guides/)
    * is an iframe that you embed in your own website or app.
    */
  var enableClickwraps: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableClickwraps` property is editable.
    *
    */
  var enableClickwrapsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var enableCommentsHistoryDownloadInSigning: js.UndefOr[String] = js.native
  
  var enableCommentsHistoryDownloadInSigningMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables customer satisfaction metric tracking for the account.
    */
  var enableCustomerSatisfactionMetricTracking: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableCustomerSatisfactionMetricTracking` property is editable.
    *
    */
  var enableCustomerSatisfactionMetricTrackingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableDSPro: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableDSPro` property is editable.
    *
    */
  var enableDSProMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, enables the account administrator to control envelope stamping for an account (stamping the `envelopeId` in the the document margins).
    *
    * **Note**: This setting can be changed only by Admin users, and only if the account-level setting `enableEnvelopeStampingByDSAdmin` is set to **true**.
    */
  var enableEnvelopeStampingByAccountAdmin: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableEnvelopeStampingByAccountAdmin` property is editable.
    *
    */
  var enableEnvelopeStampingByAccountAdminMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables the DocuSign administrator to control envelope stamping for an account (placement of the `envelopeId`).
    */
  var enableEnvelopeStampingByDSAdmin: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableEnvelopeStampingByDSAdmin` property is editable.
    *
    */
  var enableEnvelopeStampingByDSAdminMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var enableInBrowserEditor: js.UndefOr[String] = js.native
  
  var enableInBrowserEditorMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, payment processing is enabled for this account.
    *
    * **Note**: This setting can be changed only by Admin users, and only if the account-level setting `allowPaymentProcessing` is set.
    */
  var enablePaymentProcessing: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enablePaymentProcessing` property is editable.
    *
    */
  var enablePaymentProcessingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, enables PowerForms for the account.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var enablePowerForm: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, enables direct PowerForms for an account. Direct PowerForms are in-session PowerForms.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enablePowerFormDirect: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enablePowerFormDirect` property is editable.
    *
    */
  var enablePowerFormDirectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Metadata that indicates whether the `enablePowerForm` property is editable.
    *
    */
  var enablePowerFormMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableRecipientDomainValidation: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableRecipientDomainValidation` property is editable.
    *
    */
  var enableRecipientDomainValidationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Enables direct links to envelopes in reports for administrators in the following scopes:
    * - `NoEnvelopes`
    * - `AllEnvelopes`
    * - `OnlyOwnEnvelopes`
    */
  var enableReportLinks: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableReportLinks` property is editable.
    *
    */
  var enableReportLinksMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account can use the `requireSignOnPaper` option.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var enableRequireSignOnPaper: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableRequireSignOnPaper` property is editable.
    *
    */
  var enableRequireSignOnPaperMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, account administrators can reserve a web domain and users. Domains are organization-specific reserved internet domains, such as
    * `@exampledomain.com`. You can define policy settings for users of each reserved domain within your organization, export lists of domain users for audit purposes,
    * and manage domain users.
    *
    * - Domains may be claimed by an organization.
    * - When a domain is claimed by an organization, all users within that domain are added to the organization, even if they have trial or free accounts.
    * - You can set domain controls for all users of the domain.
    * - You can export information about your organization’s users that are associated with your reserved domains.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var enableReservedDomain: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableReservedDomain` property is editable.
    *
    */
  var enableReservedDomainMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables responsive signing.
    */
  var enableResponsiveSigning: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableResponsiveSigning` property is editable.
    *
    */
  var enableResponsiveSigningMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account can use SMS authentication.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var enableSMSAuthentication: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSMSAuthentication` property is editable.
    *
    */
  var enableSMSAuthenticationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, scheduled releases are enabled. The default value is **false**.
    */
  var enableScheduledRelease: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableScheduledRelease` property is editable.
    *
    */
  var enableScheduledReleaseMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var enableSearchUI: js.UndefOr[String] = js.native
  
  var enableSearchUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this account can use the Agent recipient type.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    */
  var enableSendToAgent: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSendToAgent` property is editable.
    *
    */
  var enableSendToAgentMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this account can use the Intermediary recipient type.
    *
    * **Note**: Only Admin users can change this setting, and only if `allowSendToIntermediary` is set.
    *
    */
  var enableSendToIntermediary: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSendToIntermediary` property is editable.
    *
    */
  var enableSendToIntermediaryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this account can use the Editor recipient type.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var enableSendToManage: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSendToManage` property is editable.
    *
    */
  var enableSendToManageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables fonts to be set on tags for the account.
    */
  var enableSendingTagsFontSettings: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSendingTagsFontSettings` property is editable.
    *
    */
  var enableSendingTagsFontSettingsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account can define the routing
    * order of recipients for envelopes sent by using the DocuSign API.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var enableSequentialSigningAPI: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSequentialSigningAPI` property is editable.
    *
    */
  var enableSequentialSigningAPIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account can define the routing order
    * of recipients for envelopes sent by using the DocuSign application.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    */
  var enableSequentialSigningUI: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSequentialSigningUI` property is editable.
    *
    */
  var enableSequentialSigningUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, a sender can allow signers to use the sign on paper option.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var enableSignOnPaper: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSignOnPaper` property is editable.
    *
    */
  var enableSignOnPaperMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, a user can override the default default account setting for the Sign on Paper option, which specifies whether
    * signers can sign documents on paper as an option to signing electronically.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enableSignOnPaperOverride: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSignOnPaperOverride` property is editable.
    *
    */
  var enableSignOnPaperOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, Sign with Notary functionality is enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enableSignWithNotary: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSignWithNotary` property is editable.
    *
    */
  var enableSignWithNotaryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, users can use the signing attachments feature to request attachments from signers.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enableSignerAttachments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSignerAttachments` property is editable.
    *
    */
  var enableSignerAttachmentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, enables comments for the account so that signers and recipients can make and respond to comments in documents
    * belonging to the envelopes that they are sent.
    */
  var enableSigningExtensionComments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSigningExtensionComments` property is editable.
    *
    */
  var enableSigningExtensionCommentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables conversation functionality.
    */
  var enableSigningExtensionConversations: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSigningExtensionConversations` property is editable.
    *
    */
  var enableSigningExtensionConversationsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, switches Signing Order to On by default for new envelopes.
    */
  var enableSigningOrderSettingsForAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSigningOrderSettingsForAccount` property is editable.
    *
    */
  var enableSigningOrderSettingsForAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, blockchain-based [Smart Contracts](https://www.docusign.com/products/blockchain) are enabled. The default value is **false**.
    */
  var enableSmartContracts: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSmartContracts` property is editable.
    */
  var enableSmartContractsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Deprecated.
    */
  var enableSocialIdLogin: js.UndefOr[String] = js.native
  
  /**
    * Deprecated.
    */
  var enableSocialIdLoginMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables strikethrough formatting in documents.
    */
  var enableStrikeThrough: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableStrikeThrough` property is editable.
    *
    */
  var enableStrikeThroughMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPoint: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPointMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, Vaulting is enabled for the account.
    */
  var enableVaulting: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableVaulting` property is editable.
    *
    */
  var enableVaultingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableWitnessing: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableWitnessing` property is editable.
    *
    */
  var enableWitnessingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the template name must be unique.
    */
  var enforceTemplateNameUniqueness: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enforceTemplateNameUniqueness` property is editable.
    *
    */
  var enforceTemplateNameUniquenessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Shows the envelope integration rule for the account, which indicates whether custom admins can enable Connect for their accounts. Enumeration values are:
    *
    * - `not_allowed`
    * - `full`
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var envelopeIntegrationAllowed: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `envelopeIntegrationAllowed` property is editable.
    *
    */
  var envelopeIntegrationAllowedMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, enables Connect for an account. Note that Connect integration requires additional configuration that must be set up for it to take effect;
    * this switch is only the on/off control for the account.
    *
    * **Note**: Only Admin users can change this setting, and only when `envelopeIntegrationAllowed` is set.
    */
  var envelopeIntegrationEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `envelopeIntegrationEnabled` property is editable.
    *
    */
  var envelopeIntegrationEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, envelopes sent by this account automatically have the envelope ID stamped in the document margins, unless the sender selects not
    * to have the documents stamped.
    */
  var envelopeStampingDefaultValue: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `envelopeStampingDefaultValue` property is editable.
    *
    */
  var envelopeStampingDefaultValueMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether a member of an account can express send (without tags) or must send with tags on documents.
    */
  var expressSend: js.UndefOr[String] = js.native
  
  /**
    * Boolean that specifies whether a member of an account can send templates without the tags being stripped out, even when the account is configured to let its
    * users express send only (they cannot use the tagger).
    */
  var expressSendAllowTabs: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `expressSendAllowTabs` property is editable.
    *
    */
  var expressSendAllowTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Metadata that indicates whether the `expressSend` property is editable.
    *
    */
  var expressSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * A list of external document sources such as DropBox and OneDrive.
    */
  var externalDocumentSources: js.UndefOr[
    /* A complex object specifying the external document sources. */ ExternalDocumentSources
  ] = js.native
  
  /**
    * Specifies the signature pad type.
    * Valid values are:
    *
    * - `none`
    * - `topaz`
    * - `e_padv9`
    * - `e_pad_integrisign`
    * - `topaz_sigplusextlite`
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var externalSignaturePadType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `externalSignaturePadType` property is editable.
    *
    */
  var externalSignaturePadTypeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, fax delivery to recipients is allowed for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var faxOutEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `faxOutEnabled` property is editable.
    *
    */
  var faxOutEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, HTML used to implement [Guided Forms](https://www.docusign.com/products/guided-forms) is enabled for the account.
    */
  var guidedFormsHtmlAllowed: js.UndefOr[String] = js.native
  
  var guidedFormsHtmlAllowedMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether to hide the account address in the Certificate of Completion.
    */
  var hideAccountAddressInCoC: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `hideAccountAddressInCoC` property is editable.
    *
    */
  var hideAccountAddressInCoCMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether to hide the pricing functionality for an account.
    */
  var hidePricing: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `hidePricing` property is editable.
    *
    */
  var hidePricingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * A list of ID check configuration objects.
    */
  var idCheckConfigurations: js.UndefOr[
    js.Array[/* A complex object specifying ID check configuration. */ IdCheckConfiguration]
  ] = js.native
  
  /**
    * Determines when a user's authentication with the account expires. Valid values are:
    *
    * - `always`: Users are required to authenticate each time.
    * - `variable`: If the authentication for a user is valid and falls within the value for the `idCheckExpireDays` property, the user is not required to authenticate again.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var idCheckExpire: js.UndefOr[String] = js.native
  
  /**
    * The number of days before user authentication credentials expire. A value of `0` specifies that users must re-authenticate for each new session.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var idCheckExpireDays: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `idCheckExpireDays` property is editable.
    *
    */
  var idCheckExpireDaysMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Metadata that indicates whether the `idCheckExpire` property is editable.
    *
    */
  var idCheckExpireMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The number of minutes before user authentication credentials expire.
    */
  var idCheckExpireMinutes: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `idCheckExpireMinutes` property is editable.
    *
    */
  var idCheckExpireMinutesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Indicates if authentication is configured for the account. Valid values are:
    *
    * - `always`: Authentication checks are performed on every envelope.
    * - `never`: Authentication checks are not performed on any envelopes.
    * - `optional`: Authentication is configurable per envelope.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var idCheckRequired: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `idCheckRequired` property is editable.
    *
    */
  var idCheckRequiredMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var identityVerification: js.UndefOr[
    js.Array[
      /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
    ]
  ] = js.native
  
  /**
    * Metadata that indicates whether the `identityVerification` property is editable.
    *
    */
  var identityVerificationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var ignoreErrorIfAnchorTabNotFound: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var ignoreErrorIfAnchorTabNotFoundMetadataEnabled: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * A text field containing the question that an in-person signing host uses to collect personal information from the recipient.
    * The recipient's response to this question is saved and can be viewed in the certificate associated with the envelope.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var inPersonIDCheckQuestion: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `inPersonIDCheckQuestion` property is editable.
    *
    */
  var inPersonIDCheckQuestionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, in-person signing is enabled for the account.
    */
  var inPersonSigningEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `inPersonSigningEnabled` property is editable.
    *
    */
  var inPersonSigningEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the account can send in-session (embedded) envelopes.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var inSessionEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `inSessionEnabled` property is editable.
    *
    */
  var inSessionEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, emails are not sent to the in-session (embedded) recipients on an envelope.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var inSessionSuppressEmails: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `inSessionSuppressEmails` property is editable.
    *
    */
  var inSessionSuppressEmailsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The maximum number of custom stamps.
    */
  var maxNumberOfCustomStamps: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of signing groups allowed on the account. The default value is `50`. This setting is only shown in responses that list account settings.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var maximumSigningGroups: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `maximumSigningGroups` property is editable.
    *
    */
  var maximumSigningGroupsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The maximum number of users per signing group. The default value is `50`. This setting is only shown in responses that list account settings.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var maximumUsersPerSigningGroup: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `maximumUsersPerSigningGroup` property is editable.
    *
    */
  var maximumUsersPerSigningGroupMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The number of minutes of inactivity before a mobile user is automatically logged out of the system. Valid values are `1` to `120` minutes. The default value is `20` minutes.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var mobileSessionTimeout: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `mobileSessionTimeout` property is editable.
    *
    */
  var mobileSessionTimeoutMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The number of active custom stamps associated with the account. DocuSign calculates this number automatically. This property is only visible to the DocuSign account manager.
    */
  var numberOfActiveCustomStamps: js.UndefOr[String] = js.native
  
  /**
    * Boolean that specifies whether to opt in for Signing v02 on Mobile Devices functionality.
    */
  var optInMobileSigningV02: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `optInMobileSigningV02` property is editable.
    *
    */
  var optInMobileSigningV02Metadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that allows envelope senders to opt out of the recipient signing auto-navigation feature and opt out of updating tab font color.
    */
  var optOutAutoNavTextAndTabColorUpdates: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `optOutAutoNavTextAndTabColorUpdates` property is editable.
    *
    */
  var optOutAutoNavTextAndTabColorUpdatesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether to allow envelope senders to opt out of using the new platform seal.
    */
  var optOutNewPlatformSeal: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `optOutNewPlatformSealPlatform` property is editable.
    *
    */
  var optOutNewPlatformSealPlatformMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, senders can allow recipients to provide a phone number for the Phone Authentication process.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var phoneAuthRecipientMayProvidePhoneNumber: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `phoneAuthRecipientMayProvidePhoneNumber` property is editable.
    *
    */
  var phoneAuthRecipientMayProvidePhoneNumberMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The policy for adding a digital certificate to downloaded, printed, and emailed documents.
    *
    * Possible values are:
    *
    * - `no_sign`
    * - `no_sign_allow_user_override`
    * - `yes_sign` (Specifies that PDF files downloaded from the platform are signed.)
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var pkiSignDownloadedPDFDocs: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `pkiSignDownloadedPDFDocs` property is editable.
    *
    */
  var pkiSignDownloadedPDFDocsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, recipients receiving envelopes from this account can override auto-navigation functionality.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var recipientSigningAutoNavigationControl: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `recipientSigningAutoNavigationControl` property is editable.
    *
    */
  var recipientSigningAutoNavigationControlMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * recipients receiving envelopes from this account
    * can sign offline.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var recipientsCanSignOffline: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `recipientsCanSignOffline` property is editable.
    *
    */
  var recipientsCanSignOfflineMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * recipients are required
    * to use a 21 CFR part 11-compliant signing experience.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var require21CFRpt11Compliance: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `require21CFRpt11Compliance` property is editable.
    *
    */
  var require21CFRpt11ComplianceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, signers who decline to sign an envelope sent from this account
    * are required to provide a reason for declining.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var requireDeclineReason: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `requireDeclineReason` property is editable.
    *
    */
  var requireDeclineReasonMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account requires external management of users.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var requireExternalUserManagement: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `requireExternalUserManagement` property is editable.
    *
    */
  var requireExternalUserManagementMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Sets the Digital Signature certificate requirements for sending envelopes.
    * Valid values are:
    *
    * - `none`: A Digital Signature certificate is not required.
    * - `docusign_express`: Signers must use a DocuSign Express certificate.
    * - `docusign_personal`: Signers must use a DocuSign personal certificate.
    * - `safe`
    * - `open_trust`: Signers must use an OpenTrust certificate.
    *
    */
  var requireSignerCertificateType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `requireSignerCertificateType` property is editable.
    *
    */
  var requireSignerCertificateTypeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The RSA account name.
    *
    * **Note**:
    * Only Admin users can change this setting. Modifying this value may disrupt
    * your ID Check capability.
    * Ensure you have the correct value before changing it.
    *
    */
  var rsaVeridAccountName: js.UndefOr[String] = js.native
  
  /**
    * The password for the RSA account.
    *
    *
    * **Note**:
    * Only Admin users can change this setting. Modifying this value may disrupt
    * your ID Check capability.
    * Ensure you have the correct value before changing it.
    *
    */
  var rsaVeridPassword: js.UndefOr[String] = js.native
  
  /**
    * The RSA rule set used with the account.
    *
    * **Note**:
    * Only Admin users can change this setting. Modifying this value may disrupt
    * your ID Check capability.
    * Ensure you have the correct value before changing it.
    *
    */
  var rsaVeridRuleset: js.UndefOr[String] = js.native
  
  /**
    * The user ID for the RSA account.
    *
    * **Note**:
    * Only Admin users can change this setting. Modifying this value may disrupt
    * your ID Check capability.
    * Ensure you have the correct value before changing it.
    *
    */
  var rsaVeridUserId: js.UndefOr[String] = js.native
  
  /**
    * Sets how self-signed documents are presented to the email recipients.
    * Valid values are:
    *
    * - `include_pdf`: A PDF of the completed document is attached to the email.
    * - `include_link`: A secure link to the self-signed documents is included
    *    in the email.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var selfSignedRecipientEmailDocument: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `selfSignedRecipientEmailDocument` property is editable.
    *
    */
  var selfSignedRecipientEmailDocumentMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the `selfSignedRecipientEmailDocument` user setting
    * can be set for an individual user.
    * The user setting overrides the account setting.
    *
    * **Note**: Only Admin users can change this account setting.
    *
    */
  var selfSignedRecipientEmailDocumentUserOverride: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `selfSignedRecipientEmailDocumentUserOverride` property is editable.
    *
    */
  var selfSignedRecipientEmailDocumentUserOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When true,
    * the account can use the
    * certified deliveries recipient type.
    *
    */
  var sendToCertifiedDeliveryEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `sendToCertifiedDeliveryEnabled` property is editable.
    *
    */
  var sendToCertifiedDeliveryEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, a signer can draw their signature in each
    * location where a sign or initial tab exists. This functionality
    * is typically used for mobile signing.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var senderCanSignInEachLocation: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `senderCanSignInEachLocation` property is editable.
    *
    */
  var senderCanSignInEachLocationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, a sender who is also a recipient of an envelope
    * must follow the authentication requirements for the envelope.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var senderMustAuthenticateSigning: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `senderMustAuthenticateSigning` property is editable.
    *
    */
  var senderMustAuthenticateSigningMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The account-wide default font color to use for the content of the tab.
    *
    * Valid values are:
    *
    * - `Black`
    * - `BrightBlue`
    * - `BrightRed`
    * - `DarkGreen`
    * - `DarkRed`
    * - `Gold`
    * - `Green`
    * - `NavyBlue`
    * - `Purple`
    * - `White`
    *
    */
  var sendingTagsFontColor: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `sendingTagsFontColor` property is editable.
    *
    */
  var sendingTagsFontColorMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The account-wide default font to be used for the tab value. Supported fonts include:
    *
    * - `Default`
    * - `Arial`
    * - `ArialNarrow`
    * - `Calibri`
    * - `CourierNew`
    * - `Garamond`
    * - `Georgia`
    * - `Helvetica`
    * - `LucidaConsole`
    * - `MSGothic`
    * - `MSMincho`
    * - `OCR-A`
    * - `Tahoma`
    * - `TimesNewRoman`
    * - `Trebuchet`
    * - `Verdana`
    */
  var sendingTagsFontName: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `sendingTagsFontName` property is editable.
    *
    */
  var sendingTagsFontNameMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The account-wide default font size used for the information in the tab:
    *
    * - `Size7`
    * - `Size8`
    * - `Size9`
    * - `Size10`
    * - `Size11`
    * - `Size12`
    * - `Size14`
    * - `Size16`
    * - `Size18`
    * - `Size20`
    * - `Size22`
    * - `Size24`
    * - `Size26`
    * - `Size28`
    * - `Size36`
    * - `Size48`
    * - `Size72`
    */
  var sendingTagsFontSize: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `sendingTagsFontSize` property is editable.
    *
    */
  var sendingTagsFontSizeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The amount of idle activity time, in minutes, before a user is automatically logged out of the system. The minimum setting is 20 minutes and the maximum setting is 120 minutes.
    *
    */
  var sessionTimeout: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `sessionTimeout` property is editable.
    *
    */
  var sessionTimeoutMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, senders can set the email language to use for
    * each recipient.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var setRecipEmailLang: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `setRecipEmailLang` property is editable.
    *
    */
  var setRecipEmailLangMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * setting a unique language for a recipient
    * not only affects the email language, but also the signing
    * language they are presented with. If **false**, only the email will
    * be affected when the sender specifies a unique language for a
    * recipient.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var setRecipSignLang: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `setRecipSignLang` property is editable.
    *
    */
  var setRecipSignLangMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether an account can use Shared Template Folders.
    */
  var sharedTemplateFolders: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `sharedTemplateFolders` property is editable.
    *
    */
  var sharedTemplateFoldersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether complete dialogs are displayed directly within an application in embedded signing sessions.
    */
  var showCompleteDialogInEmbeddedSession: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `showCompleteDialogInEmbeddedSession` property is editable.
    *
    */
  var showCompleteDialogInEmbeddedSessionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, Conditional Routing options display to senders during the sending experience.
    */
  var showConditionalRoutingOnSend: js.UndefOr[String] = js.native
  
  var showConditionalRoutingOnSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether conditional field options are initially displayed (before a user makes entries).
    */
  var showInitialConditionalFields: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `showInitialConditionalFields` property is editable.
    *
    */
  var showInitialConditionalFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether localized watermarks are displayed.
    */
  var showLocalizedWatermarks: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `showLocalizedWatermarks` property is editable.
    *
    */
  var showLocalizedWatermarksMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * show tutorials.
    *
    */
  var showTutorials: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `showTutorials` property is editable.
    *
    */
  var showTutorialsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The format for the signature date. Valid values are:
    *
    * - `d/M/yyyy`
    * - `dd-MM-yy`
    * - `dd-MMM-yy`
    * - `dd-MM-yyyy`
    * - `dd.MM.yyyy`
    * - `dd-MMM-yyyy`
    * - `dd MMMM yyyy`
    * - `M/d/yyyy`
    * - `MM-dd-yyyy`
    * - `MM/dd/yyyy`
    * - `MM/dd/yy`
    * - `MMM-dd-yyyy`
    * - `MMM d, yyyy`
    * - `MMMM d, yyyy`
    * - `yyyy-MM-dd`
    * - `yyyy-MMM-dd`
    * - `yyyy/MM/dd`
    * - `yyyy MMMM d`
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signDateFormat: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signDateFormat` property is editable.
    *
    */
  var signDateFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The format for the signature time. Valid values are:
    *
    * - `none`
    * - `HH:mm`
    * - `h:mm`
    * - `HH:mm:ss`
    * - `h:mm:ss`
    *
    */
  var signTimeFormat: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signTimeFormat` property is editable.
    *
    */
  var signTimeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * the time shows the AM or PM indicator.
    *
    */
  var signTimeShowAmPm: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signTimeShowAmPm` property is editable.
    *
    */
  var signTimeShowAmPmMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Names of electronic or digital signature providers that can be used.
    */
  var signatureProviders: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Metadata that indicates whether the `signatureProviders` property is editable.
    *
    */
  var signatureProvidersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * the Certificate of Completion is included in the PDF of the envelope documents
    * when it is downloaded.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerAttachCertificateToEnvelopePDF: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerAttachCertificateToEnvelopePDF` property is editable.
    *
    */
  var signerAttachCertificateToEnvelopePDFMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, signer attachments are added to the parent document
    * that contains the attachment.
    * The default behavior creates
    * a new document in the envelope for every signer attachment.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerAttachConcat: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerAttachConcat` property is editable.
    *
    */
  var signerAttachConcatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * a signer can create a DocuSign account
    * after signing.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerCanCreateAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerCanCreateAccount` property is editable.
    *
    */
  var signerCanCreateAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, recipients can sign on a mobile device.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerCanSignOnMobile: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerCanSignOnMobile` property is editable.
    *
    */
  var signerCanSignOnMobileMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, an "envelope complete" email is sent to an in-session
    * (embedded) or offline signer after DocuSign processes the envelope
    * if in-session emails are not suppressed.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerInSessionUseEnvelopeCompleteEmail: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerInSessionUseEnvelopeCompleteEmail` property is editable.
    *
    */
  var signerInSessionUseEnvelopeCompleteEmailMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Sets the login requirements for signers. Valid values are:
    *
    * - `login_not_required`: Signers are not required to log in.
    * - `login_required_if_account_holder`: If the signer has a DocuSign account,
    *   they must log in to sign the document.
    * - `login_required_per_session`: The sender cannot send an envelope to anyone
    *   who does not have a DocuSign account.
    * - `login_required_per_envelope`: The sender cannot send an envelope to anyone
    *   who does not have a DocuSign account, and the signer must also log in for
    *   each envelope they will sign.
    *
    *
    * **Note**: Only Admin users can change this setting. If you use Direct PowerForms
    * or captive (embedded signers), the "Account required" settings are bypassed for
    * those signers. If your workflow requires that the signer have an account,
    * you should not use those methods.
    *
    */
  var signerLoginRequirements: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerLoginRequirements` property is editable.
    *
    */
  var signerLoginRequirementsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, senders can only send an envelope to a recipient
    * that has a DocuSign account.
    *
    * **Note**: Only Account Administrators can change this setting.
    *
    */
  var signerMustHaveAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerMustHaveAccount` property is editable.
    *
    */
  var signerMustHaveAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * signers must log in to the DocuSign platform to sign an envelope.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerMustLoginToSign: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerMustLoginToSign` property is editable.
    *
    */
  var signerMustLoginToSignMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the initial values of all SecureFields are written
    * to the document when it is sent.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerShowSecureFieldInitialValues: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerShowSecureFieldInitialValues` property is editable.
    *
    */
  var signerShowSecureFieldInitialValuesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The number of minutes
    * that a signing session stays
    * alive without any activity.
    *
    */
  var signingSessionTimeout: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signingSessionTimeout` property is editable.
    *
    */
  var signingSessionTimeoutMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    *
    */
  var signingUiVersion: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signingUiVersionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, simplified sending is enabled for the account. The default value is **false**.
    */
  var simplifiedSendingEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `simplifiedSendingEnabled` property is editable.
    *
    */
  var simplifiedSendingEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * single sign-on (SSO) is enabled.
    *
    */
  var singleSignOnEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `singleSignOnEnabled` property is editable.
    *
    */
  var singleSignOnEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * do not require authentication prompt for viewing completed envelopes
    *
    */
  var skipAuthCompletedEnvelopes: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `skipAuthCompletedEnvelopes` property is editable.
    *
    */
  var skipAuthCompletedEnvelopesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * recipients can use
    * [social ids](https://support.docusign.com/guides/signer-authentication)
    * when signing
    *
    */
  var socialIdRecipAuth: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `socialIdRecipAuth` property is editable.
    *
    */
  var socialIdRecipAuthMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, senders can specify the visibility of the documents in an envelope at the recipient level.
    *
    */
  var specifyDocumentVisibility: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `specifyDocumentVisibility` property is editable.
    *
    */
  var specifyDocumentVisibilityMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * when initiating correction of an in-flight envelope
    * the sender starts in advanced correct mode.
    *
    */
  var startInAdvancedCorrect: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `startInAdvancedCorrect` property is editable.
    *
    */
  var startInAdvancedCorrectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, account users must accept supplemental documents when signing.
    */
  var supplementalDocumentsMustAccept: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustAccept` property is editable.
    *
    */
  var supplementalDocumentsMustAcceptMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, account users must both view and accept supplemental documents when signing.
    */
  var supplementalDocumentsMustRead: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustRead` property is editable.
    *
    */
  var supplementalDocumentsMustReadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, account users must view supplemental documents when signing.
    */
  var supplementalDocumentsMustView: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustView` property is editable.
    *
    */
  var supplementalDocumentsMustViewMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether or not API calls require a x509 cert in the header of the call.
    */
  var suppressCertificateEnforcement: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `suppressCertificateEnforcement` property is editable.
    *
    */
  var suppressCertificateEnforcementMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Account-wide tab settings.
    */
  var tabAccountSettings: js.UndefOr[TabAccountSettings] = js.native
  
  /**
    * Specifies the time zone
    * to use with the API.
    *
    * Valid values are:
    *
    * - `TZ_01_AfghanistanStandardTime`
    * - `TZ_02_AlaskanStandardTime`
    * - `TZ_03_ArabStandardTime`
    * - `TZ_04_ArabianStandardTime`
    * - `TZ_05_ArabicStandardTime`
    * - `TZ_06_ArgentinaStandardTime`
    * - `TZ_07_AtlanticStandardTime`
    * - `TZ_08_AUS_CentralStandardTime`
    * - `TZ_09_AUS_EasternStandardTime`
    * - `TZ_10_AzerbaijanStandardTime`
    * - `TZ_11_AzoresStandardTime`
    * - `TZ_12_BangladeshStandardTime`
    * - `TZ_13_CanadaCentralStandardTime`
    * - `TZ_14_CapeVerdeStandardTime`
    * - `TZ_15_CaucasusStandardTime`
    * - `TZ_16_CentralAustraliaStandardTime`
    * - `TZ_17_CentralAmericaStandardTime`
    * - `TZ_18_CentralAsiaStandardTime`
    * - `TZ_19_CentralBrazilianStandardTime`
    * - `TZ_20_CentralEuropeStandardTime`
    * - `TZ_21_CentralEuropeanStandardTime`
    * - `TZ_22_CentralPacificStandardTime`
    * - `TZ_23_CentralStandardTime`
    * - `TZ_24_CentralStandardTimeMexico`
    * - `TZ_25_ChinaStandardTime`
    * - `TZ_26_DatelineStandardTime`
    * - `TZ_27_E_AfricaStandardTime`
    * - `TZ_28_E_AustraliaStandardTime`
    * - `TZ_29_E_EuropeStandardTime`
    * - `TZ_30_E_SouthAmericaStandardTime`
    * - `TZ_31_EasternStandardTime`
    * - `TZ_32_EgyptStandardTime`
    * - `TZ_33_EkaterinburgStandardTime`
    * - `TZ_34_FijiStandardTime`
    * - `TZ_35_FLE_StandardTime`
    * - `TZ_36_GeorgianStandardTime`
    * - `TZ_37_GMT_StandardTime`
    * - `TZ_38_GreenlandStandardTime`
    * - `TZ_39_GreenwichStandardTime`
    * - `TZ_40_GTB_StandardTime`
    * - `TZ_41_HawaiianStandardTime`
    * - `TZ_42_IndiaStandardTime`
    * - `TZ_43_IranStandardTime`
    * - `TZ_44_IsraelStandardTime`
    * - `TZ_45_JordanStandardTime`
    * - `TZ_46_KaliningradStandardTime`
    * - `TZ_47_KamchatkaStandardTime`
    * - `TZ_48_KoreaStandardTime`
    * - `TZ_49_MagadanStandardTime`
    * - `TZ_50_MauritiusStandardTime`
    * - `TZ_51_MidAtlanticStandardTime`
    * - `TZ_52_MiddleEastStandardTime`
    * - `TZ_53_MontevideoStandardTime`
    * - `TZ_54_MoroccoStandardTime`
    * - `TZ_55_MountainStandardTime`
    * - `TZ_56_MountainStandardTimeMMexico`
    * - `TZ_57_MyanmarStandardTime`
    * - `TZ_58_N_CentralAsiaStandardTime`
    * - `TZ_59_NamibiaStandardTime`
    * - `TZ_60_NepalStandardTime`
    * - `TZ_61_NewZealandStandardTime`
    * - `TZ_62_NewfoundlandStandardTime`
    * - `TZ_63_NorthAsiaEastStandardTime`
    * - `TZ_64_NorthAsiaStandardTime`
    * - `TZ_65_PacificSAStandardTime`
    * - `TZ_66_PacificStandardTime`
    * - `TZ_67_PacificStandardTimeMexico`
    * - `TZ_68_PakistanStandardTime`
    * - `TZ_69_ParaguayStandardTime`
    * - `TZ_70_RomanceStandardTime`
    * - `TZ_71_RussianStandardTime`
    * - `TZ_72_SAEasternStandardTime`
    * - `TZ_73_SAPacificStandardTime`
    * - `TZ_74_SAWesternStandardTime`
    * - `TZ_75_SamoaStandardTime`
    * - `TZ_76_SE_AsiaStandardTime`
    * - `TZ_77_SingaporeStandardTime`
    * - `TZ_78_SouthAfricaStandardTime`
    * - `TZ_79_SriLankaStandardTime`
    * - `TZ_80_SyriaStandardTime`
    * - `TZ_81_TaipeiStandardTime`
    * - `TZ_82_TasmaniaStandardTime`
    * - `TZ_83_TokyoStandardTime`
    * - `TZ_84_TongaStandardTime`
    * - `TZ_85_TurkeyStandardTime`
    * - `TZ_86_UlaanbaatarStandardTime`
    * - `TZ_87_US_EasternStandardTime`
    * - `TZ_88_USMountainStandardTime`
    * - `TZ_89_VenezuelaStandardTime`
    * - `TZ_90_VladivostokStandardTime`
    * - `TZ_91_W_AustraliaStandardTime`
    * - `TZ_92_W_CentralAfricaStandardTime`
    * - `TZ_93_W_EuropeStandardTime`
    * - `TZ_94_WestAsiaStandardTime`
    * - `TZ_95_WestPacificStandardTime`
    * - `TZ_96_YakutskStandardTime`
    *
    */
  var timezoneOffsetAPI: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `timezoneOffsetAPI` property is editable.
    *
    */
  var timezoneOffsetAPIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies the time zone
    * to use in the UI.
    *
    * Valid values are:
    *
    * - `TZ_01_AfghanistanStandardTime`
    * - `TZ_02_AlaskanStandardTime`
    * - `TZ_03_ArabStandardTime`
    * - `TZ_04_ArabianStandardTime`
    * - `TZ_05_ArabicStandardTime`
    * - `TZ_06_ArgentinaStandardTime`
    * - `TZ_07_AtlanticStandardTime`
    * - `TZ_08_AUS_CentralStandardTime`
    * - `TZ_09_AUS_EasternStandardTime`
    * - `TZ_10_AzerbaijanStandardTime`
    * - `TZ_11_AzoresStandardTime`
    * - `TZ_12_BangladeshStandardTime`
    * - `TZ_13_CanadaCentralStandardTime`
    * - `TZ_14_CapeVerdeStandardTime`
    * - `TZ_15_CaucasusStandardTime`
    * - `TZ_16_CentralAustraliaStandardTime`
    * - `TZ_17_CentralAmericaStandardTime`
    * - `TZ_18_CentralAsiaStandardTime`
    * - `TZ_19_CentralBrazilianStandardTime`
    * - `TZ_20_CentralEuropeStandardTime`
    * - `TZ_21_CentralEuropeanStandardTime`
    * - `TZ_22_CentralPacificStandardTime`
    * - `TZ_23_CentralStandardTime`
    * - `TZ_24_CentralStandardTimeMexico`
    * - `TZ_25_ChinaStandardTime`
    * - `TZ_26_DatelineStandardTime`
    * - `TZ_27_E_AfricaStandardTime`
    * - `TZ_28_E_AustraliaStandardTime`
    * - `TZ_29_E_EuropeStandardTime`
    * - `TZ_30_E_SouthAmericaStandardTime`
    * - `TZ_31_EasternStandardTime`
    * - `TZ_32_EgyptStandardTime`
    * - `TZ_33_EkaterinburgStandardTime`
    * - `TZ_34_FijiStandardTime`
    * - `TZ_35_FLE_StandardTime`
    * - `TZ_36_GeorgianStandardTime`
    * - `TZ_37_GMT_StandardTime`
    * - `TZ_38_GreenlandStandardTime`
    * - `TZ_39_GreenwichStandardTime`
    * - `TZ_40_GTB_StandardTime`
    * - `TZ_41_HawaiianStandardTime`
    * - `TZ_42_IndiaStandardTime`
    * - `TZ_43_IranStandardTime`
    * - `TZ_44_IsraelStandardTime`
    * - `TZ_45_JordanStandardTime`
    * - `TZ_46_KaliningradStandardTime`
    * - `TZ_47_KamchatkaStandardTime`
    * - `TZ_48_KoreaStandardTime`
    * - `TZ_49_MagadanStandardTime`
    * - `TZ_50_MauritiusStandardTime`
    * - `TZ_51_MidAtlanticStandardTime`
    * - `TZ_52_MiddleEastStandardTime`
    * - `TZ_53_MontevideoStandardTime`
    * - `TZ_54_MoroccoStandardTime`
    * - `TZ_55_MountainStandardTime`
    * - `TZ_56_MountainStandardTimeMMexico`
    * - `TZ_57_MyanmarStandardTime`
    * - `TZ_58_N_CentralAsiaStandardTime`
    * - `TZ_59_NamibiaStandardTime`
    * - `TZ_60_NepalStandardTime`
    * - `TZ_61_NewZealandStandardTime`
    * - `TZ_62_NewfoundlandStandardTime`
    * - `TZ_63_NorthAsiaEastStandardTime`
    * - `TZ_64_NorthAsiaStandardTime`
    * - `TZ_65_PacificSAStandardTime`
    * - `TZ_66_PacificStandardTime`
    * - `TZ_67_PacificStandardTimeMexico`
    * - `TZ_68_PakistanStandardTime`
    * - `TZ_69_ParaguayStandardTime`
    * - `TZ_70_RomanceStandardTime`
    * - `TZ_71_RussianStandardTime`
    * - `TZ_72_SAEasternStandardTime`
    * - `TZ_73_SAPacificStandardTime`
    * - `TZ_74_SAWesternStandardTime`
    * - `TZ_75_SamoaStandardTime`
    * - `TZ_76_SE_AsiaStandardTime`
    * - `TZ_77_SingaporeStandardTime`
    * - `TZ_78_SouthAfricaStandardTime`
    * - `TZ_79_SriLankaStandardTime`
    * - `TZ_80_SyriaStandardTime`
    * - `TZ_81_TaipeiStandardTime`
    * - `TZ_82_TasmaniaStandardTime`
    * - `TZ_83_TokyoStandardTime`
    * - `TZ_84_TongaStandardTime`
    * - `TZ_85_TurkeyStandardTime`
    * - `TZ_86_UlaanbaatarStandardTime`
    * - `TZ_87_US_EasternStandardTime`
    * - `TZ_88_USMountainStandardTime`
    * - `TZ_89_VenezuelaStandardTime`
    * - `TZ_90_VladivostokStandardTime`
    * - `TZ_91_W_AustraliaStandardTime`
    * - `TZ_92_W_CentralAfricaStandardTime`
    * - `TZ_93_W_EuropeStandardTime`
    * - `TZ_94_WestAsiaStandardTime`
    * - `TZ_95_WestPacificStandardTime`
    * - `TZ_96_YakutskStandardTime`
    *
    */
  var timezoneOffsetUI: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `timezoneOffsetUI` property is editable.
    *
    */
  var timezoneOffsetUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    *
    */
  var universalSignatureOptIn: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    *
    */
  var useAccountLevelEmail: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `useAccountLevelEmail` property is editable.
    *
    */
  var useAccountLevelEmailMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the account uses an Electronic Record and
    * Signature Disclosure Statement.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var useConsumerDisclosure: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `useConsumerDisclosure` property is editable.
    *
    */
  var useConsumerDisclosureMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
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
    * Reserved for DocuSign.
    *
    */
  var useDerivedKeys: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `useDerivedKeys` property is editable.
    *
    */
  var useDerivedKeysMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * signers
    * are required to use Express Digital Signatures.
    *
    */
  var useDocuSignExpressSignerCertificate: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `useDocuSignExpressSignerCertificate` property is editable.
    *
    */
  var useDocuSignExpressSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var useMultiAppGroupsData: js.UndefOr[String] = js.native
  
  var useMultiAppGroupsDataMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    *
    */
  var useNewBlobForPdf: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `useNewBlobForPdf` property is editable.
    *
    */
  var useNewBlobForPdfMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * signers are
    * required to use SAFE digital signatures.
    *
    */
  var useSAFESignerCertificates: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `useSAFESignerCertificates` property is editable.
    *
    */
  var useSAFESignerCertificatesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether the account uses the digital signature provider platform to eSign.
    */
  var useSignatureProviderPlatform: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `useSignatureProviderPlatform` property is editable.
    *
    */
  var useSignatureProviderPlatformMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**,
    * the account can use the API.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    */
  var usesAPI: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `usesAPI` property is editable.
    *
    */
  var usesAPIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Boolean that specifies whether validations on recipient email domains are allowed.
    */
  var validationsAllowed: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationsAllowed` property is editable.
    *
    */
  var validationsAllowedMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Valid values are:
    *
    * - `docusign`
    * - `account`
    *
    */
  var validationsBrand: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationsBrand` property is editable.
    *
    */
  var validationsBrandMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Valid values are:
    *
    * - `none`
    * - `monthly`
    *
    */
  var validationsCadence: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationsCadence` property is editable.
    *
    */
  var validationsCadenceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * enables validations.
    *
    */
  var validationsEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationsEnabled` property is editable.
    *
    */
  var validationsEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Valid values are:
    *
    * - `none`
    * - `life_sciences_part11`
    *
    */
  var validationsReport: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `validationsReport` property is editable.
    *
    */
  var validationsReportMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * the
    * [watermark feature](https://support.docusign.com/en/articles/How-do-I-manage-the-watermark-for-In-Process-envelopes-sent-from-my-account)
    * is enabled for the account.
    *
    */
  var waterMarkEnabled: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `waterMarkEnabled` property is editable.
    *
    */
  var waterMarkEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * If **true**,
    * sent reminders are included in the envelope history.
    */
  var writeReminderToEnvelopeHistory: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `writeReminderToEnvelopeHistory` property is editable.
    *
    */
  var writeReminderToEnvelopeHistoryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The smallest screen allowed.
    */
  var wurflMinAllowableScreenSize: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `wurflMinAllowableScreenSize` property is editable.
    *
    */
  var wurflMinAllowableScreenSizeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object AccountSettingsInformation {
  
  @scala.inline
  def apply(): AccountSettingsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettingsInformation]
  }
  
  @scala.inline
  implicit class AccountSettingsInformationOps[Self <: AccountSettingsInformation] (val x: Self) extends AnyVal {
    
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
    def setAccessCodeFormat(
      value: /* object specifying the format of the string provided to a recipient in order to access an envelope. */ AccessCodeFormat
    ): Self = this.set("accessCodeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessCodeFormat: Self = this.set("accessCodeFormat", js.undefined)
    
    @scala.inline
    def setAccountDateTimeFormat(value: String): Self = this.set("accountDateTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountDateTimeFormat: Self = this.set("accountDateTimeFormat", js.undefined)
    
    @scala.inline
    def setAccountDateTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("accountDateTimeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountDateTimeFormatMetadata: Self = this.set("accountDateTimeFormatMetadata", js.undefined)
    
    @scala.inline
    def setAccountName(value: String): Self = this.set("accountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountName: Self = this.set("accountName", js.undefined)
    
    @scala.inline
    def setAccountNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("accountNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountNameMetadata: Self = this.set("accountNameMetadata", js.undefined)
    
    @scala.inline
    def setAccountNotification(
      value: /* A complex element that specifies notifications (expirations and reminders) for the envelope. */ AccountNotification
    ): Self = this.set("accountNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountNotification: Self = this.set("accountNotification", js.undefined)
    
    @scala.inline
    def setAccountUISettings(
      value: /* An object that defines the options that are available to non-administrators in the UI. */ AccountUISettings
    ): Self = this.set("accountUISettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountUISettings: Self = this.set("accountUISettings", js.undefined)
    
    @scala.inline
    def setAdoptSigConfig(value: String): Self = this.set("adoptSigConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdoptSigConfig: Self = this.set("adoptSigConfig", js.undefined)
    
    @scala.inline
    def setAdoptSigConfigMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("adoptSigConfigMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdoptSigConfigMetadata: Self = this.set("adoptSigConfigMetadata", js.undefined)
    
    @scala.inline
    def setAdvancedCorrect(value: String): Self = this.set("advancedCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedCorrect: Self = this.set("advancedCorrect", js.undefined)
    
    @scala.inline
    def setAdvancedCorrectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("advancedCorrectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedCorrectMetadata: Self = this.set("advancedCorrectMetadata", js.undefined)
    
    @scala.inline
    def setAllowAccessCodeFormat(value: String): Self = this.set("allowAccessCodeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAccessCodeFormat: Self = this.set("allowAccessCodeFormat", js.undefined)
    
    @scala.inline
    def setAllowAccessCodeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAccessCodeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAccessCodeFormatMetadata: Self = this.set("allowAccessCodeFormatMetadata", js.undefined)
    
    @scala.inline
    def setAllowAccountManagementGranular(value: String): Self = this.set("allowAccountManagementGranular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAccountManagementGranular: Self = this.set("allowAccountManagementGranular", js.undefined)
    
    @scala.inline
    def setAllowAccountManagementGranularMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAccountManagementGranularMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAccountManagementGranularMetadata: Self = this.set("allowAccountManagementGranularMetadata", js.undefined)
    
    @scala.inline
    def setAllowAccountMemberNameChange(value: String): Self = this.set("allowAccountMemberNameChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAccountMemberNameChange: Self = this.set("allowAccountMemberNameChange", js.undefined)
    
    @scala.inline
    def setAllowAccountMemberNameChangeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAccountMemberNameChangeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAccountMemberNameChangeMetadata: Self = this.set("allowAccountMemberNameChangeMetadata", js.undefined)
    
    @scala.inline
    def setAllowAdvancedRecipientRoutingConditional(value: String): Self = this.set("allowAdvancedRecipientRoutingConditional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAdvancedRecipientRoutingConditional: Self = this.set("allowAdvancedRecipientRoutingConditional", js.undefined)
    
    @scala.inline
    def setAllowAdvancedRecipientRoutingConditionalMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAdvancedRecipientRoutingConditionalMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAdvancedRecipientRoutingConditionalMetadata: Self = this.set("allowAdvancedRecipientRoutingConditionalMetadata", js.undefined)
    
    @scala.inline
    def setAllowAgentNameEmailEdit(value: String): Self = this.set("allowAgentNameEmailEdit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAgentNameEmailEdit: Self = this.set("allowAgentNameEmailEdit", js.undefined)
    
    @scala.inline
    def setAllowAgentNameEmailEditMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAgentNameEmailEditMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAgentNameEmailEditMetadata: Self = this.set("allowAgentNameEmailEditMetadata", js.undefined)
    
    @scala.inline
    def setAllowAgreementActions(value: String): Self = this.set("allowAgreementActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAgreementActions: Self = this.set("allowAgreementActions", js.undefined)
    
    @scala.inline
    def setAllowAgreementActionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAgreementActionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAgreementActionsMetadata: Self = this.set("allowAgreementActionsMetadata", js.undefined)
    
    @scala.inline
    def setAllowAutoNavSettings(value: String): Self = this.set("allowAutoNavSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoNavSettings: Self = this.set("allowAutoNavSettings", js.undefined)
    
    @scala.inline
    def setAllowAutoNavSettingsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAutoNavSettingsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoNavSettingsMetadata: Self = this.set("allowAutoNavSettingsMetadata", js.undefined)
    
    @scala.inline
    def setAllowAutoTagging(value: String): Self = this.set("allowAutoTagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoTagging: Self = this.set("allowAutoTagging", js.undefined)
    
    @scala.inline
    def setAllowAutoTaggingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAutoTaggingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoTaggingMetadata: Self = this.set("allowAutoTaggingMetadata", js.undefined)
    
    @scala.inline
    def setAllowBulkSend(value: String): Self = this.set("allowBulkSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBulkSend: Self = this.set("allowBulkSend", js.undefined)
    
    @scala.inline
    def setAllowBulkSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowBulkSendMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBulkSendMetadata: Self = this.set("allowBulkSendMetadata", js.undefined)
    
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
    def setAllowConnectHttpListenerConfigs(value: String): Self = this.set("allowConnectHttpListenerConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowConnectHttpListenerConfigs: Self = this.set("allowConnectHttpListenerConfigs", js.undefined)
    
    @scala.inline
    def setAllowConnectSendFinishLater(value: String): Self = this.set("allowConnectSendFinishLater", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowConnectSendFinishLater: Self = this.set("allowConnectSendFinishLater", js.undefined)
    
    @scala.inline
    def setAllowConnectSendFinishLaterMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowConnectSendFinishLaterMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowConnectSendFinishLaterMetadata: Self = this.set("allowConnectSendFinishLaterMetadata", js.undefined)
    
    @scala.inline
    def setAllowConsumerDisclosureOverride(value: String): Self = this.set("allowConsumerDisclosureOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowConsumerDisclosureOverride: Self = this.set("allowConsumerDisclosureOverride", js.undefined)
    
    @scala.inline
    def setAllowConsumerDisclosureOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowConsumerDisclosureOverrideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowConsumerDisclosureOverrideMetadata: Self = this.set("allowConsumerDisclosureOverrideMetadata", js.undefined)
    
    @scala.inline
    def setAllowDataDownload(value: String): Self = this.set("allowDataDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDataDownload: Self = this.set("allowDataDownload", js.undefined)
    
    @scala.inline
    def setAllowDataDownloadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowDataDownloadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDataDownloadMetadata: Self = this.set("allowDataDownloadMetadata", js.undefined)
    
    @scala.inline
    def setAllowDocumentDisclosures(value: String): Self = this.set("allowDocumentDisclosures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDocumentDisclosures: Self = this.set("allowDocumentDisclosures", js.undefined)
    
    @scala.inline
    def setAllowDocumentDisclosuresMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowDocumentDisclosuresMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDocumentDisclosuresMetadata: Self = this.set("allowDocumentDisclosuresMetadata", js.undefined)
    
    @scala.inline
    def setAllowDocumentVisibility(value: String): Self = this.set("allowDocumentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDocumentVisibility: Self = this.set("allowDocumentVisibility", js.undefined)
    
    @scala.inline
    def setAllowDocumentVisibilityMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowDocumentVisibilityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDocumentVisibilityMetadata: Self = this.set("allowDocumentVisibilityMetadata", js.undefined)
    
    @scala.inline
    def setAllowDocumentsOnSignedEnvelopes(value: String): Self = this.set("allowDocumentsOnSignedEnvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDocumentsOnSignedEnvelopes: Self = this.set("allowDocumentsOnSignedEnvelopes", js.undefined)
    
    @scala.inline
    def setAllowDocumentsOnSignedEnvelopesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowDocumentsOnSignedEnvelopesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDocumentsOnSignedEnvelopesMetadata: Self = this.set("allowDocumentsOnSignedEnvelopesMetadata", js.undefined)
    
    @scala.inline
    def setAllowEHankoStamps(value: String): Self = this.set("allowEHankoStamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEHankoStamps: Self = this.set("allowEHankoStamps", js.undefined)
    
    @scala.inline
    def setAllowEHankoStampsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEHankoStampsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEHankoStampsMetadata: Self = this.set("allowEHankoStampsMetadata", js.undefined)
    
    @scala.inline
    def setAllowENoteEOriginal(value: String): Self = this.set("allowENoteEOriginal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowENoteEOriginal: Self = this.set("allowENoteEOriginal", js.undefined)
    
    @scala.inline
    def setAllowENoteEOriginalMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowENoteEOriginalMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowENoteEOriginalMetadata: Self = this.set("allowENoteEOriginalMetadata", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeCorrect(value: String): Self = this.set("allowEnvelopeCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeCorrect: Self = this.set("allowEnvelopeCorrect", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeCorrectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEnvelopeCorrectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeCorrectMetadata: Self = this.set("allowEnvelopeCorrectMetadata", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeCustodyTransfer(value: String): Self = this.set("allowEnvelopeCustodyTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeCustodyTransfer: Self = this.set("allowEnvelopeCustodyTransfer", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeCustodyTransferMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEnvelopeCustodyTransferMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeCustodyTransferMetadata: Self = this.set("allowEnvelopeCustodyTransferMetadata", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeCustomFields(value: String): Self = this.set("allowEnvelopeCustomFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeCustomFields: Self = this.set("allowEnvelopeCustomFields", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeCustomFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEnvelopeCustomFieldsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeCustomFieldsMetadata: Self = this.set("allowEnvelopeCustomFieldsMetadata", js.undefined)
    
    @scala.inline
    def setAllowEnvelopePublishReporting(value: String): Self = this.set("allowEnvelopePublishReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopePublishReporting: Self = this.set("allowEnvelopePublishReporting", js.undefined)
    
    @scala.inline
    def setAllowEnvelopePublishReportingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEnvelopePublishReportingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopePublishReportingMetadata: Self = this.set("allowEnvelopePublishReportingMetadata", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeReporting(value: String): Self = this.set("allowEnvelopeReporting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeReporting: Self = this.set("allowEnvelopeReporting", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeReportingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEnvelopeReportingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeReportingMetadata: Self = this.set("allowEnvelopeReportingMetadata", js.undefined)
    
    @scala.inline
    def setAllowExpressSignerCertificate(value: String): Self = this.set("allowExpressSignerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExpressSignerCertificate: Self = this.set("allowExpressSignerCertificate", js.undefined)
    
    @scala.inline
    def setAllowExpressSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowExpressSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExpressSignerCertificateMetadata: Self = this.set("allowExpressSignerCertificateMetadata", js.undefined)
    
    @scala.inline
    def setAllowExpression(value: String): Self = this.set("allowExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExpression: Self = this.set("allowExpression", js.undefined)
    
    @scala.inline
    def setAllowExpressionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowExpressionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExpressionMetadata: Self = this.set("allowExpressionMetadata", js.undefined)
    
    @scala.inline
    def setAllowExtendedSendingResourceFile(value: String): Self = this.set("allowExtendedSendingResourceFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExtendedSendingResourceFile: Self = this.set("allowExtendedSendingResourceFile", js.undefined)
    
    @scala.inline
    def setAllowExtendedSendingResourceFileMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowExtendedSendingResourceFileMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExtendedSendingResourceFileMetadata: Self = this.set("allowExtendedSendingResourceFileMetadata", js.undefined)
    
    @scala.inline
    def setAllowExternalSignaturePad(value: String): Self = this.set("allowExternalSignaturePad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExternalSignaturePad: Self = this.set("allowExternalSignaturePad", js.undefined)
    
    @scala.inline
    def setAllowExternalSignaturePadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowExternalSignaturePadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowExternalSignaturePadMetadata: Self = this.set("allowExternalSignaturePadMetadata", js.undefined)
    
    @scala.inline
    def setAllowIDVLevel1(value: String): Self = this.set("allowIDVLevel1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowIDVLevel1: Self = this.set("allowIDVLevel1", js.undefined)
    
    @scala.inline
    def setAllowIDVLevel1Metadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowIDVLevel1Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowIDVLevel1Metadata: Self = this.set("allowIDVLevel1Metadata", js.undefined)
    
    @scala.inline
    def setAllowIDVPlatform(value: String): Self = this.set("allowIDVPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowIDVPlatform: Self = this.set("allowIDVPlatform", js.undefined)
    
    @scala.inline
    def setAllowIDVPlatformMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowIDVPlatformMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowIDVPlatformMetadata: Self = this.set("allowIDVPlatformMetadata", js.undefined)
    
    @scala.inline
    def setAllowInPerson(value: String): Self = this.set("allowInPerson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInPerson: Self = this.set("allowInPerson", js.undefined)
    
    @scala.inline
    def setAllowInPersonMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowInPersonMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInPersonMetadata: Self = this.set("allowInPersonMetadata", js.undefined)
    
    @scala.inline
    def setAllowManagedStamps(value: String): Self = this.set("allowManagedStamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowManagedStamps: Self = this.set("allowManagedStamps", js.undefined)
    
    @scala.inline
    def setAllowManagedStampsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowManagedStampsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowManagedStampsMetadata: Self = this.set("allowManagedStampsMetadata", js.undefined)
    
    @scala.inline
    def setAllowMarkup(value: String): Self = this.set("allowMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMarkup: Self = this.set("allowMarkup", js.undefined)
    
    @scala.inline
    def setAllowMarkupMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowMarkupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMarkupMetadata: Self = this.set("allowMarkupMetadata", js.undefined)
    
    @scala.inline
    def setAllowMemberTimeZone(value: String): Self = this.set("allowMemberTimeZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMemberTimeZone: Self = this.set("allowMemberTimeZone", js.undefined)
    
    @scala.inline
    def setAllowMemberTimeZoneMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowMemberTimeZoneMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMemberTimeZoneMetadata: Self = this.set("allowMemberTimeZoneMetadata", js.undefined)
    
    @scala.inline
    def setAllowMergeFields(value: String): Self = this.set("allowMergeFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMergeFields: Self = this.set("allowMergeFields", js.undefined)
    
    @scala.inline
    def setAllowMergeFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowMergeFieldsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMergeFieldsMetadata: Self = this.set("allowMergeFieldsMetadata", js.undefined)
    
    @scala.inline
    def setAllowMultipleBrandProfiles(value: String): Self = this.set("allowMultipleBrandProfiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleBrandProfiles: Self = this.set("allowMultipleBrandProfiles", js.undefined)
    
    @scala.inline
    def setAllowMultipleBrandProfilesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowMultipleBrandProfilesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleBrandProfilesMetadata: Self = this.set("allowMultipleBrandProfilesMetadata", js.undefined)
    
    @scala.inline
    def setAllowMultipleSignerAttachments(value: String): Self = this.set("allowMultipleSignerAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleSignerAttachments: Self = this.set("allowMultipleSignerAttachments", js.undefined)
    
    @scala.inline
    def setAllowMultipleSignerAttachmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowMultipleSignerAttachmentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultipleSignerAttachmentsMetadata: Self = this.set("allowMultipleSignerAttachmentsMetadata", js.undefined)
    
    @scala.inline
    def setAllowNonUSPhoneAuth(value: String): Self = this.set("allowNonUSPhoneAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNonUSPhoneAuth: Self = this.set("allowNonUSPhoneAuth", js.undefined)
    
    @scala.inline
    def setAllowNonUSPhoneAuthMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowNonUSPhoneAuthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowNonUSPhoneAuthMetadata: Self = this.set("allowNonUSPhoneAuthMetadata", js.undefined)
    
    @scala.inline
    def setAllowOcrOfEnvelopeDocuments(value: String): Self = this.set("allowOcrOfEnvelopeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOcrOfEnvelopeDocuments: Self = this.set("allowOcrOfEnvelopeDocuments", js.undefined)
    
    @scala.inline
    def setAllowOcrOfEnvelopeDocumentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowOcrOfEnvelopeDocumentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOcrOfEnvelopeDocumentsMetadata: Self = this.set("allowOcrOfEnvelopeDocumentsMetadata", js.undefined)
    
    @scala.inline
    def setAllowOfflineSigning(value: String): Self = this.set("allowOfflineSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOfflineSigning: Self = this.set("allowOfflineSigning", js.undefined)
    
    @scala.inline
    def setAllowOfflineSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowOfflineSigningMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOfflineSigningMetadata: Self = this.set("allowOfflineSigningMetadata", js.undefined)
    
    @scala.inline
    def setAllowOpenTrustSignerCertificate(value: String): Self = this.set("allowOpenTrustSignerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOpenTrustSignerCertificate: Self = this.set("allowOpenTrustSignerCertificate", js.undefined)
    
    @scala.inline
    def setAllowOpenTrustSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowOpenTrustSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOpenTrustSignerCertificateMetadata: Self = this.set("allowOpenTrustSignerCertificateMetadata", js.undefined)
    
    @scala.inline
    def setAllowOrganizations(value: String): Self = this.set("allowOrganizations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOrganizations: Self = this.set("allowOrganizations", js.undefined)
    
    @scala.inline
    def setAllowOrganizationsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowOrganizationsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOrganizationsMetadata: Self = this.set("allowOrganizationsMetadata", js.undefined)
    
    @scala.inline
    def setAllowPaymentProcessing(value: String): Self = this.set("allowPaymentProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPaymentProcessing: Self = this.set("allowPaymentProcessing", js.undefined)
    
    @scala.inline
    def setAllowPaymentProcessingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowPaymentProcessingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPaymentProcessingMetadata: Self = this.set("allowPaymentProcessingMetadata", js.undefined)
    
    @scala.inline
    def setAllowPersonalSignerCertificate(value: String): Self = this.set("allowPersonalSignerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPersonalSignerCertificate: Self = this.set("allowPersonalSignerCertificate", js.undefined)
    
    @scala.inline
    def setAllowPersonalSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowPersonalSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPersonalSignerCertificateMetadata: Self = this.set("allowPersonalSignerCertificateMetadata", js.undefined)
    
    @scala.inline
    def setAllowPhoneAuthOverride(value: String): Self = this.set("allowPhoneAuthOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPhoneAuthOverride: Self = this.set("allowPhoneAuthOverride", js.undefined)
    
    @scala.inline
    def setAllowPhoneAuthOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowPhoneAuthOverrideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPhoneAuthOverrideMetadata: Self = this.set("allowPhoneAuthOverrideMetadata", js.undefined)
    
    @scala.inline
    def setAllowPhoneAuthentication(value: String): Self = this.set("allowPhoneAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPhoneAuthentication: Self = this.set("allowPhoneAuthentication", js.undefined)
    
    @scala.inline
    def setAllowPhoneAuthenticationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowPhoneAuthenticationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPhoneAuthenticationMetadata: Self = this.set("allowPhoneAuthenticationMetadata", js.undefined)
    
    @scala.inline
    def setAllowPrivateSigningGroups(value: String): Self = this.set("allowPrivateSigningGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPrivateSigningGroups: Self = this.set("allowPrivateSigningGroups", js.undefined)
    
    @scala.inline
    def setAllowPrivateSigningGroupsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowPrivateSigningGroupsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPrivateSigningGroupsMetadata: Self = this.set("allowPrivateSigningGroupsMetadata", js.undefined)
    
    @scala.inline
    def setAllowReminders(value: String): Self = this.set("allowReminders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowReminders: Self = this.set("allowReminders", js.undefined)
    
    @scala.inline
    def setAllowRemindersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowRemindersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRemindersMetadata: Self = this.set("allowRemindersMetadata", js.undefined)
    
    @scala.inline
    def setAllowResourceFileBranding(value: String): Self = this.set("allowResourceFileBranding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowResourceFileBranding: Self = this.set("allowResourceFileBranding", js.undefined)
    
    @scala.inline
    def setAllowResourceFileBrandingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowResourceFileBrandingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowResourceFileBrandingMetadata: Self = this.set("allowResourceFileBrandingMetadata", js.undefined)
    
    @scala.inline
    def setAllowSMSDelivery(value: String): Self = this.set("allowSMSDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSMSDelivery: Self = this.set("allowSMSDelivery", js.undefined)
    
    @scala.inline
    def setAllowSMSDeliveryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSMSDeliveryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSMSDeliveryMetadata: Self = this.set("allowSMSDeliveryMetadata", js.undefined)
    
    @scala.inline
    def setAllowSafeBioPharmaSignerCertificate(value: String): Self = this.set("allowSafeBioPharmaSignerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSafeBioPharmaSignerCertificate: Self = this.set("allowSafeBioPharmaSignerCertificate", js.undefined)
    
    @scala.inline
    def setAllowSafeBioPharmaSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSafeBioPharmaSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSafeBioPharmaSignerCertificateMetadata: Self = this.set("allowSafeBioPharmaSignerCertificateMetadata", js.undefined)
    
    @scala.inline
    def setAllowSecurityAppliance(value: String): Self = this.set("allowSecurityAppliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSecurityAppliance: Self = this.set("allowSecurityAppliance", js.undefined)
    
    @scala.inline
    def setAllowSecurityApplianceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSecurityApplianceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSecurityApplianceMetadata: Self = this.set("allowSecurityApplianceMetadata", js.undefined)
    
    @scala.inline
    def setAllowSendToCertifiedDelivery(value: String): Self = this.set("allowSendToCertifiedDelivery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSendToCertifiedDelivery: Self = this.set("allowSendToCertifiedDelivery", js.undefined)
    
    @scala.inline
    def setAllowSendToCertifiedDeliveryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSendToCertifiedDeliveryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSendToCertifiedDeliveryMetadata: Self = this.set("allowSendToCertifiedDeliveryMetadata", js.undefined)
    
    @scala.inline
    def setAllowSendToIntermediary(value: String): Self = this.set("allowSendToIntermediary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSendToIntermediary: Self = this.set("allowSendToIntermediary", js.undefined)
    
    @scala.inline
    def setAllowSendToIntermediaryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSendToIntermediaryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSendToIntermediaryMetadata: Self = this.set("allowSendToIntermediaryMetadata", js.undefined)
    
    @scala.inline
    def setAllowServerTemplates(value: String): Self = this.set("allowServerTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowServerTemplates: Self = this.set("allowServerTemplates", js.undefined)
    
    @scala.inline
    def setAllowServerTemplatesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowServerTemplatesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowServerTemplatesMetadata: Self = this.set("allowServerTemplatesMetadata", js.undefined)
    
    @scala.inline
    def setAllowSetEmbeddedRecipientStartURL(value: String): Self = this.set("allowSetEmbeddedRecipientStartURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSetEmbeddedRecipientStartURL: Self = this.set("allowSetEmbeddedRecipientStartURL", js.undefined)
    
    @scala.inline
    def setAllowSetEmbeddedRecipientStartURLMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSetEmbeddedRecipientStartURLMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSetEmbeddedRecipientStartURLMetadata: Self = this.set("allowSetEmbeddedRecipientStartURLMetadata", js.undefined)
    
    @scala.inline
    def setAllowSharedTabs(value: String): Self = this.set("allowSharedTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSharedTabs: Self = this.set("allowSharedTabs", js.undefined)
    
    @scala.inline
    def setAllowSharedTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSharedTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSharedTabsMetadata: Self = this.set("allowSharedTabsMetadata", js.undefined)
    
    @scala.inline
    def setAllowSignDocumentFromHomePage(value: String): Self = this.set("allowSignDocumentFromHomePage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignDocumentFromHomePage: Self = this.set("allowSignDocumentFromHomePage", js.undefined)
    
    @scala.inline
    def setAllowSignDocumentFromHomePageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSignDocumentFromHomePageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignDocumentFromHomePageMetadata: Self = this.set("allowSignDocumentFromHomePageMetadata", js.undefined)
    
    @scala.inline
    def setAllowSignNow(value: String): Self = this.set("allowSignNow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignNow: Self = this.set("allowSignNow", js.undefined)
    
    @scala.inline
    def setAllowSignNowMetadata(value: String): Self = this.set("allowSignNowMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignNowMetadata: Self = this.set("allowSignNowMetadata", js.undefined)
    
    @scala.inline
    def setAllowSignatureStamps(value: String): Self = this.set("allowSignatureStamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignatureStamps: Self = this.set("allowSignatureStamps", js.undefined)
    
    @scala.inline
    def setAllowSignatureStampsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSignatureStampsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignatureStampsMetadata: Self = this.set("allowSignatureStampsMetadata", js.undefined)
    
    @scala.inline
    def setAllowSignerReassign(value: String): Self = this.set("allowSignerReassign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignerReassign: Self = this.set("allowSignerReassign", js.undefined)
    
    @scala.inline
    def setAllowSignerReassignMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSignerReassignMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignerReassignMetadata: Self = this.set("allowSignerReassignMetadata", js.undefined)
    
    @scala.inline
    def setAllowSignerReassignOverride(value: String): Self = this.set("allowSignerReassignOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignerReassignOverride: Self = this.set("allowSignerReassignOverride", js.undefined)
    
    @scala.inline
    def setAllowSignerReassignOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSignerReassignOverrideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignerReassignOverrideMetadata: Self = this.set("allowSignerReassignOverrideMetadata", js.undefined)
    
    @scala.inline
    def setAllowSigningExtensions(value: String): Self = this.set("allowSigningExtensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSigningExtensions: Self = this.set("allowSigningExtensions", js.undefined)
    
    @scala.inline
    def setAllowSigningExtensionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSigningExtensionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSigningExtensionsMetadata: Self = this.set("allowSigningExtensionsMetadata", js.undefined)
    
    @scala.inline
    def setAllowSigningGroups(value: String): Self = this.set("allowSigningGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSigningGroups: Self = this.set("allowSigningGroups", js.undefined)
    
    @scala.inline
    def setAllowSigningGroupsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSigningGroupsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSigningGroupsMetadata: Self = this.set("allowSigningGroupsMetadata", js.undefined)
    
    @scala.inline
    def setAllowSigningRadioDeselect(value: String): Self = this.set("allowSigningRadioDeselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSigningRadioDeselect: Self = this.set("allowSigningRadioDeselect", js.undefined)
    
    @scala.inline
    def setAllowSigningRadioDeselectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSigningRadioDeselectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSigningRadioDeselectMetadata: Self = this.set("allowSigningRadioDeselectMetadata", js.undefined)
    
    @scala.inline
    def setAllowSocialIdLogin(value: String): Self = this.set("allowSocialIdLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSocialIdLogin: Self = this.set("allowSocialIdLogin", js.undefined)
    
    @scala.inline
    def setAllowSocialIdLoginMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSocialIdLoginMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSocialIdLoginMetadata: Self = this.set("allowSocialIdLoginMetadata", js.undefined)
    
    @scala.inline
    def setAllowSupplementalDocuments(value: String): Self = this.set("allowSupplementalDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSupplementalDocuments: Self = this.set("allowSupplementalDocuments", js.undefined)
    
    @scala.inline
    def setAllowSupplementalDocumentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSupplementalDocumentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSupplementalDocumentsMetadata: Self = this.set("allowSupplementalDocumentsMetadata", js.undefined)
    
    @scala.inline
    def setAllowUsersToAccessDirectory(value: String): Self = this.set("allowUsersToAccessDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUsersToAccessDirectory: Self = this.set("allowUsersToAccessDirectory", js.undefined)
    
    @scala.inline
    def setAllowUsersToAccessDirectoryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowUsersToAccessDirectoryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUsersToAccessDirectoryMetadata: Self = this.set("allowUsersToAccessDirectoryMetadata", js.undefined)
    
    @scala.inline
    def setAllowValueInsights(value: String): Self = this.set("allowValueInsights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowValueInsights: Self = this.set("allowValueInsights", js.undefined)
    
    @scala.inline
    def setAllowValueInsightsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowValueInsightsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowValueInsightsMetadata: Self = this.set("allowValueInsightsMetadata", js.undefined)
    
    @scala.inline
    def setAnchorPopulationScope(value: String): Self = this.set("anchorPopulationScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPopulationScope: Self = this.set("anchorPopulationScope", js.undefined)
    
    @scala.inline
    def setAnchorPopulationScopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("anchorPopulationScopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPopulationScopeMetadata: Self = this.set("anchorPopulationScopeMetadata", js.undefined)
    
    @scala.inline
    def setAnchorTagVersionedPlacementEnabled(value: String): Self = this.set("anchorTagVersionedPlacementEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorTagVersionedPlacementEnabled: Self = this.set("anchorTagVersionedPlacementEnabled", js.undefined)
    
    @scala.inline
    def setAnchorTagVersionedPlacementMetadataEnabled(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("anchorTagVersionedPlacementMetadataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorTagVersionedPlacementMetadataEnabled: Self = this.set("anchorTagVersionedPlacementMetadataEnabled", js.undefined)
    
    @scala.inline
    def setAttachCompletedEnvelope(value: String): Self = this.set("attachCompletedEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachCompletedEnvelope: Self = this.set("attachCompletedEnvelope", js.undefined)
    
    @scala.inline
    def setAttachCompletedEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("attachCompletedEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachCompletedEnvelopeMetadata: Self = this.set("attachCompletedEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setAuthenticationCheck(value: String): Self = this.set("authenticationCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationCheck: Self = this.set("authenticationCheck", js.undefined)
    
    @scala.inline
    def setAuthenticationCheckMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("authenticationCheckMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthenticationCheckMetadata: Self = this.set("authenticationCheckMetadata", js.undefined)
    
    @scala.inline
    def setAutoNavRule(value: String): Self = this.set("autoNavRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNavRule: Self = this.set("autoNavRule", js.undefined)
    
    @scala.inline
    def setAutoNavRuleMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("autoNavRuleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNavRuleMetadata: Self = this.set("autoNavRuleMetadata", js.undefined)
    
    @scala.inline
    def setAutoProvisionSignerAccount(value: String): Self = this.set("autoProvisionSignerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoProvisionSignerAccount: Self = this.set("autoProvisionSignerAccount", js.undefined)
    
    @scala.inline
    def setAutoProvisionSignerAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("autoProvisionSignerAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoProvisionSignerAccountMetadata: Self = this.set("autoProvisionSignerAccountMetadata", js.undefined)
    
    @scala.inline
    def setBccEmailArchive(value: String): Self = this.set("bccEmailArchive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBccEmailArchive: Self = this.set("bccEmailArchive", js.undefined)
    
    @scala.inline
    def setBccEmailArchiveMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("bccEmailArchiveMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBccEmailArchiveMetadata: Self = this.set("bccEmailArchiveMetadata", js.undefined)
    
    @scala.inline
    def setBetaSwitchConfiguration(value: String): Self = this.set("betaSwitchConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetaSwitchConfiguration: Self = this.set("betaSwitchConfiguration", js.undefined)
    
    @scala.inline
    def setBetaSwitchConfigurationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("betaSwitchConfigurationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetaSwitchConfigurationMetadata: Self = this.set("betaSwitchConfigurationMetadata", js.undefined)
    
    @scala.inline
    def setBillingAddress(value: /* Contains address information. */ AddressInformation): Self = this.set("billingAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddress: Self = this.set("billingAddress", js.undefined)
    
    @scala.inline
    def setBillingAddressMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("billingAddressMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddressMetadata: Self = this.set("billingAddressMetadata", js.undefined)
    
    @scala.inline
    def setBulkSend(value: String): Self = this.set("bulkSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkSend: Self = this.set("bulkSend", js.undefined)
    
    @scala.inline
    def setBulkSendMaxCopiesInBatch(value: String): Self = this.set("bulkSendMaxCopiesInBatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkSendMaxCopiesInBatch: Self = this.set("bulkSendMaxCopiesInBatch", js.undefined)
    
    @scala.inline
    def setBulkSendMaxUnprocessedEnvelopesCount(value: String): Self = this.set("bulkSendMaxUnprocessedEnvelopesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkSendMaxUnprocessedEnvelopesCount: Self = this.set("bulkSendMaxUnprocessedEnvelopesCount", js.undefined)
    
    @scala.inline
    def setBulkSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("bulkSendMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkSendMetadata: Self = this.set("bulkSendMetadata", js.undefined)
    
    @scala.inline
    def setCanSelfBrandSend(value: String): Self = this.set("canSelfBrandSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSelfBrandSend: Self = this.set("canSelfBrandSend", js.undefined)
    
    @scala.inline
    def setCanSelfBrandSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canSelfBrandSendMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSelfBrandSendMetadata: Self = this.set("canSelfBrandSendMetadata", js.undefined)
    
    @scala.inline
    def setCanSelfBrandSign(value: String): Self = this.set("canSelfBrandSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSelfBrandSign: Self = this.set("canSelfBrandSign", js.undefined)
    
    @scala.inline
    def setCanSelfBrandSignMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canSelfBrandSignMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSelfBrandSignMetadata: Self = this.set("canSelfBrandSignMetadata", js.undefined)
    
    @scala.inline
    def setCanUseSalesforceOAuth(value: String): Self = this.set("canUseSalesforceOAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUseSalesforceOAuth: Self = this.set("canUseSalesforceOAuth", js.undefined)
    
    @scala.inline
    def setCanUseSalesforceOAuthMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canUseSalesforceOAuthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUseSalesforceOAuthMetadata: Self = this.set("canUseSalesforceOAuthMetadata", js.undefined)
    
    @scala.inline
    def setCaptureVoiceRecording(value: String): Self = this.set("captureVoiceRecording", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureVoiceRecording: Self = this.set("captureVoiceRecording", js.undefined)
    
    @scala.inline
    def setCaptureVoiceRecordingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("captureVoiceRecordingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaptureVoiceRecordingMetadata: Self = this.set("captureVoiceRecordingMetadata", js.undefined)
    
    @scala.inline
    def setCfrUseWideImage(value: String): Self = this.set("cfrUseWideImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCfrUseWideImage: Self = this.set("cfrUseWideImage", js.undefined)
    
    @scala.inline
    def setCfrUseWideImageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("cfrUseWideImageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCfrUseWideImageMetadata: Self = this.set("cfrUseWideImageMetadata", js.undefined)
    
    @scala.inline
    def setCheckForMultipleAdminsOnAccount(value: String): Self = this.set("checkForMultipleAdminsOnAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckForMultipleAdminsOnAccount: Self = this.set("checkForMultipleAdminsOnAccount", js.undefined)
    
    @scala.inline
    def setCheckForMultipleAdminsOnAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("checkForMultipleAdminsOnAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckForMultipleAdminsOnAccountMetadata: Self = this.set("checkForMultipleAdminsOnAccountMetadata", js.undefined)
    
    @scala.inline
    def setChromeSignatureEnabled(value: String): Self = this.set("chromeSignatureEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChromeSignatureEnabled: Self = this.set("chromeSignatureEnabled", js.undefined)
    
    @scala.inline
    def setChromeSignatureEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("chromeSignatureEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChromeSignatureEnabledMetadata: Self = this.set("chromeSignatureEnabledMetadata", js.undefined)
    
    @scala.inline
    def setCommentEmailShowMessageText(value: String): Self = this.set("commentEmailShowMessageText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentEmailShowMessageText: Self = this.set("commentEmailShowMessageText", js.undefined)
    
    @scala.inline
    def setCommentEmailShowMessageTextMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("commentEmailShowMessageTextMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentEmailShowMessageTextMetadata: Self = this.set("commentEmailShowMessageTextMetadata", js.undefined)
    
    @scala.inline
    def setCommentsAllowEnvelopeOverride(value: String): Self = this.set("commentsAllowEnvelopeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsAllowEnvelopeOverride: Self = this.set("commentsAllowEnvelopeOverride", js.undefined)
    
    @scala.inline
    def setCommentsAllowEnvelopeOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("commentsAllowEnvelopeOverrideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommentsAllowEnvelopeOverrideMetadata: Self = this.set("commentsAllowEnvelopeOverrideMetadata", js.undefined)
    
    @scala.inline
    def setConditionalFieldsEnabled(value: String): Self = this.set("conditionalFieldsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalFieldsEnabled: Self = this.set("conditionalFieldsEnabled", js.undefined)
    
    @scala.inline
    def setConditionalFieldsEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("conditionalFieldsEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConditionalFieldsEnabledMetadata: Self = this.set("conditionalFieldsEnabledMetadata", js.undefined)
    
    @scala.inline
    def setConsumerDisclosureFrequency(value: String): Self = this.set("consumerDisclosureFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerDisclosureFrequency: Self = this.set("consumerDisclosureFrequency", js.undefined)
    
    @scala.inline
    def setConsumerDisclosureFrequencyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("consumerDisclosureFrequencyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumerDisclosureFrequencyMetadata: Self = this.set("consumerDisclosureFrequencyMetadata", js.undefined)
    
    @scala.inline
    def setConvertPdfFields(value: String): Self = this.set("convertPdfFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertPdfFields: Self = this.set("convertPdfFields", js.undefined)
    
    @scala.inline
    def setConvertPdfFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("convertPdfFieldsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConvertPdfFieldsMetadata: Self = this.set("convertPdfFieldsMetadata", js.undefined)
    
    @scala.inline
    def setDataPopulationScope(value: String): Self = this.set("dataPopulationScope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPopulationScope: Self = this.set("dataPopulationScope", js.undefined)
    
    @scala.inline
    def setDataPopulationScopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("dataPopulationScopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataPopulationScopeMetadata: Self = this.set("dataPopulationScopeMetadata", js.undefined)
    
    @scala.inline
    def setDisableMobileApp(value: String): Self = this.set("disableMobileApp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMobileApp: Self = this.set("disableMobileApp", js.undefined)
    
    @scala.inline
    def setDisableMobileAppMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableMobileAppMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMobileAppMetadata: Self = this.set("disableMobileAppMetadata", js.undefined)
    
    @scala.inline
    def setDisableMobilePushNotifications(value: String): Self = this.set("disableMobilePushNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMobilePushNotifications: Self = this.set("disableMobilePushNotifications", js.undefined)
    
    @scala.inline
    def setDisableMobilePushNotificationsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableMobilePushNotificationsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMobilePushNotificationsMetadata: Self = this.set("disableMobilePushNotificationsMetadata", js.undefined)
    
    @scala.inline
    def setDisableMobileSending(value: String): Self = this.set("disableMobileSending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMobileSending: Self = this.set("disableMobileSending", js.undefined)
    
    @scala.inline
    def setDisableMobileSendingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableMobileSendingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMobileSendingMetadata: Self = this.set("disableMobileSendingMetadata", js.undefined)
    
    @scala.inline
    def setDisableMultipleSessions(value: String): Self = this.set("disableMultipleSessions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMultipleSessions: Self = this.set("disableMultipleSessions", js.undefined)
    
    @scala.inline
    def setDisableMultipleSessionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableMultipleSessionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMultipleSessionsMetadata: Self = this.set("disableMultipleSessionsMetadata", js.undefined)
    
    @scala.inline
    def setDisablePurgeNotificationsForSenderMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disablePurgeNotificationsForSenderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePurgeNotificationsForSenderMetadata: Self = this.set("disablePurgeNotificationsForSenderMetadata", js.undefined)
    
    @scala.inline
    def setDisableSignerCertView(value: String): Self = this.set("disableSignerCertView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSignerCertView: Self = this.set("disableSignerCertView", js.undefined)
    
    @scala.inline
    def setDisableSignerCertViewMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableSignerCertViewMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSignerCertViewMetadata: Self = this.set("disableSignerCertViewMetadata", js.undefined)
    
    @scala.inline
    def setDisableSignerHistoryView(value: String): Self = this.set("disableSignerHistoryView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSignerHistoryView: Self = this.set("disableSignerHistoryView", js.undefined)
    
    @scala.inline
    def setDisableSignerHistoryViewMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableSignerHistoryViewMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableSignerHistoryViewMetadata: Self = this.set("disableSignerHistoryViewMetadata", js.undefined)
    
    @scala.inline
    def setDisableStyleSignature(value: String): Self = this.set("disableStyleSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyleSignature: Self = this.set("disableStyleSignature", js.undefined)
    
    @scala.inline
    def setDisableStyleSignatureMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableStyleSignatureMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStyleSignatureMetadata: Self = this.set("disableStyleSignatureMetadata", js.undefined)
    
    @scala.inline
    def setDisableUploadSignature(value: String): Self = this.set("disableUploadSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableUploadSignature: Self = this.set("disableUploadSignature", js.undefined)
    
    @scala.inline
    def setDisableUploadSignatureMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableUploadSignatureMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableUploadSignatureMetadata: Self = this.set("disableUploadSignatureMetadata", js.undefined)
    
    @scala.inline
    def setDisableUserSharing(value: String): Self = this.set("disableUserSharing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableUserSharing: Self = this.set("disableUserSharing", js.undefined)
    
    @scala.inline
    def setDisableUserSharingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableUserSharingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableUserSharingMetadata: Self = this.set("disableUserSharingMetadata", js.undefined)
    
    @scala.inline
    def setDisplayBetaSwitch(value: String): Self = this.set("displayBetaSwitch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayBetaSwitch: Self = this.set("displayBetaSwitch", js.undefined)
    
    @scala.inline
    def setDisplayBetaSwitchMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("displayBetaSwitchMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayBetaSwitchMetadata: Self = this.set("displayBetaSwitchMetadata", js.undefined)
    
    @scala.inline
    def setDocumentConversionRestrictions(value: String): Self = this.set("documentConversionRestrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentConversionRestrictions: Self = this.set("documentConversionRestrictions", js.undefined)
    
    @scala.inline
    def setDocumentConversionRestrictionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("documentConversionRestrictionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentConversionRestrictionsMetadata: Self = this.set("documentConversionRestrictionsMetadata", js.undefined)
    
    @scala.inline
    def setDocumentRetention(value: String): Self = this.set("documentRetention", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentRetention: Self = this.set("documentRetention", js.undefined)
    
    @scala.inline
    def setDocumentRetentionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("documentRetentionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentRetentionMetadata: Self = this.set("documentRetentionMetadata", js.undefined)
    
    @scala.inline
    def setDocumentRetentionPurgeTabs(value: String): Self = this.set("documentRetentionPurgeTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentRetentionPurgeTabs: Self = this.set("documentRetentionPurgeTabs", js.undefined)
    
    @scala.inline
    def setDocumentVisibility(value: String): Self = this.set("documentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVisibility: Self = this.set("documentVisibility", js.undefined)
    
    @scala.inline
    def setDocumentVisibilityMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("documentVisibilityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVisibilityMetadata: Self = this.set("documentVisibilityMetadata", js.undefined)
    
    @scala.inline
    def setEmailTemplateVersion(value: String): Self = this.set("emailTemplateVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailTemplateVersion: Self = this.set("emailTemplateVersion", js.undefined)
    
    @scala.inline
    def setEmailTemplateVersionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("emailTemplateVersionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailTemplateVersionMetadata: Self = this.set("emailTemplateVersionMetadata", js.undefined)
    
    @scala.inline
    def setEnableAccessCodeGenerator(value: String): Self = this.set("enableAccessCodeGenerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAccessCodeGenerator: Self = this.set("enableAccessCodeGenerator", js.undefined)
    
    @scala.inline
    def setEnableAccessCodeGeneratorMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableAccessCodeGeneratorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAccessCodeGeneratorMetadata: Self = this.set("enableAccessCodeGeneratorMetadata", js.undefined)
    
    @scala.inline
    def setEnableAdvancedPayments(value: String): Self = this.set("enableAdvancedPayments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAdvancedPayments: Self = this.set("enableAdvancedPayments", js.undefined)
    
    @scala.inline
    def setEnableAdvancedPaymentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableAdvancedPaymentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAdvancedPaymentsMetadata: Self = this.set("enableAdvancedPaymentsMetadata", js.undefined)
    
    @scala.inline
    def setEnableAdvancedPowerForms(value: String): Self = this.set("enableAdvancedPowerForms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAdvancedPowerForms: Self = this.set("enableAdvancedPowerForms", js.undefined)
    
    @scala.inline
    def setEnableAdvancedPowerFormsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableAdvancedPowerFormsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAdvancedPowerFormsMetadata: Self = this.set("enableAdvancedPowerFormsMetadata", js.undefined)
    
    @scala.inline
    def setEnableAutoNav(value: String): Self = this.set("enableAutoNav", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoNav: Self = this.set("enableAutoNav", js.undefined)
    
    @scala.inline
    def setEnableAutoNavMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableAutoNavMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAutoNavMetadata: Self = this.set("enableAutoNavMetadata", js.undefined)
    
    @scala.inline
    def setEnableCalculatedFields(value: String): Self = this.set("enableCalculatedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCalculatedFields: Self = this.set("enableCalculatedFields", js.undefined)
    
    @scala.inline
    def setEnableCalculatedFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableCalculatedFieldsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCalculatedFieldsMetadata: Self = this.set("enableCalculatedFieldsMetadata", js.undefined)
    
    @scala.inline
    def setEnableClickwraps(value: String): Self = this.set("enableClickwraps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClickwraps: Self = this.set("enableClickwraps", js.undefined)
    
    @scala.inline
    def setEnableClickwrapsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableClickwrapsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableClickwrapsMetadata: Self = this.set("enableClickwrapsMetadata", js.undefined)
    
    @scala.inline
    def setEnableCommentsHistoryDownloadInSigning(value: String): Self = this.set("enableCommentsHistoryDownloadInSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCommentsHistoryDownloadInSigning: Self = this.set("enableCommentsHistoryDownloadInSigning", js.undefined)
    
    @scala.inline
    def setEnableCommentsHistoryDownloadInSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableCommentsHistoryDownloadInSigningMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCommentsHistoryDownloadInSigningMetadata: Self = this.set("enableCommentsHistoryDownloadInSigningMetadata", js.undefined)
    
    @scala.inline
    def setEnableCustomerSatisfactionMetricTracking(value: String): Self = this.set("enableCustomerSatisfactionMetricTracking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCustomerSatisfactionMetricTracking: Self = this.set("enableCustomerSatisfactionMetricTracking", js.undefined)
    
    @scala.inline
    def setEnableCustomerSatisfactionMetricTrackingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableCustomerSatisfactionMetricTrackingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCustomerSatisfactionMetricTrackingMetadata: Self = this.set("enableCustomerSatisfactionMetricTrackingMetadata", js.undefined)
    
    @scala.inline
    def setEnableDSPro(value: String): Self = this.set("enableDSPro", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDSPro: Self = this.set("enableDSPro", js.undefined)
    
    @scala.inline
    def setEnableDSProMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableDSProMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDSProMetadata: Self = this.set("enableDSProMetadata", js.undefined)
    
    @scala.inline
    def setEnableEnvelopeStampingByAccountAdmin(value: String): Self = this.set("enableEnvelopeStampingByAccountAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEnvelopeStampingByAccountAdmin: Self = this.set("enableEnvelopeStampingByAccountAdmin", js.undefined)
    
    @scala.inline
    def setEnableEnvelopeStampingByAccountAdminMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableEnvelopeStampingByAccountAdminMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEnvelopeStampingByAccountAdminMetadata: Self = this.set("enableEnvelopeStampingByAccountAdminMetadata", js.undefined)
    
    @scala.inline
    def setEnableEnvelopeStampingByDSAdmin(value: String): Self = this.set("enableEnvelopeStampingByDSAdmin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEnvelopeStampingByDSAdmin: Self = this.set("enableEnvelopeStampingByDSAdmin", js.undefined)
    
    @scala.inline
    def setEnableEnvelopeStampingByDSAdminMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableEnvelopeStampingByDSAdminMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableEnvelopeStampingByDSAdminMetadata: Self = this.set("enableEnvelopeStampingByDSAdminMetadata", js.undefined)
    
    @scala.inline
    def setEnableInBrowserEditor(value: String): Self = this.set("enableInBrowserEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInBrowserEditor: Self = this.set("enableInBrowserEditor", js.undefined)
    
    @scala.inline
    def setEnableInBrowserEditorMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableInBrowserEditorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableInBrowserEditorMetadata: Self = this.set("enableInBrowserEditorMetadata", js.undefined)
    
    @scala.inline
    def setEnablePaymentProcessing(value: String): Self = this.set("enablePaymentProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePaymentProcessing: Self = this.set("enablePaymentProcessing", js.undefined)
    
    @scala.inline
    def setEnablePaymentProcessingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enablePaymentProcessingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePaymentProcessingMetadata: Self = this.set("enablePaymentProcessingMetadata", js.undefined)
    
    @scala.inline
    def setEnablePowerForm(value: String): Self = this.set("enablePowerForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePowerForm: Self = this.set("enablePowerForm", js.undefined)
    
    @scala.inline
    def setEnablePowerFormDirect(value: String): Self = this.set("enablePowerFormDirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePowerFormDirect: Self = this.set("enablePowerFormDirect", js.undefined)
    
    @scala.inline
    def setEnablePowerFormDirectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enablePowerFormDirectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePowerFormDirectMetadata: Self = this.set("enablePowerFormDirectMetadata", js.undefined)
    
    @scala.inline
    def setEnablePowerFormMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enablePowerFormMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePowerFormMetadata: Self = this.set("enablePowerFormMetadata", js.undefined)
    
    @scala.inline
    def setEnableRecipientDomainValidation(value: String): Self = this.set("enableRecipientDomainValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRecipientDomainValidation: Self = this.set("enableRecipientDomainValidation", js.undefined)
    
    @scala.inline
    def setEnableRecipientDomainValidationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableRecipientDomainValidationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRecipientDomainValidationMetadata: Self = this.set("enableRecipientDomainValidationMetadata", js.undefined)
    
    @scala.inline
    def setEnableReportLinks(value: String): Self = this.set("enableReportLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableReportLinks: Self = this.set("enableReportLinks", js.undefined)
    
    @scala.inline
    def setEnableReportLinksMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableReportLinksMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableReportLinksMetadata: Self = this.set("enableReportLinksMetadata", js.undefined)
    
    @scala.inline
    def setEnableRequireSignOnPaper(value: String): Self = this.set("enableRequireSignOnPaper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRequireSignOnPaper: Self = this.set("enableRequireSignOnPaper", js.undefined)
    
    @scala.inline
    def setEnableRequireSignOnPaperMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableRequireSignOnPaperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRequireSignOnPaperMetadata: Self = this.set("enableRequireSignOnPaperMetadata", js.undefined)
    
    @scala.inline
    def setEnableReservedDomain(value: String): Self = this.set("enableReservedDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableReservedDomain: Self = this.set("enableReservedDomain", js.undefined)
    
    @scala.inline
    def setEnableReservedDomainMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableReservedDomainMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableReservedDomainMetadata: Self = this.set("enableReservedDomainMetadata", js.undefined)
    
    @scala.inline
    def setEnableResponsiveSigning(value: String): Self = this.set("enableResponsiveSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableResponsiveSigning: Self = this.set("enableResponsiveSigning", js.undefined)
    
    @scala.inline
    def setEnableResponsiveSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableResponsiveSigningMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableResponsiveSigningMetadata: Self = this.set("enableResponsiveSigningMetadata", js.undefined)
    
    @scala.inline
    def setEnableSMSAuthentication(value: String): Self = this.set("enableSMSAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSMSAuthentication: Self = this.set("enableSMSAuthentication", js.undefined)
    
    @scala.inline
    def setEnableSMSAuthenticationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSMSAuthenticationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSMSAuthenticationMetadata: Self = this.set("enableSMSAuthenticationMetadata", js.undefined)
    
    @scala.inline
    def setEnableScheduledRelease(value: String): Self = this.set("enableScheduledRelease", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScheduledRelease: Self = this.set("enableScheduledRelease", js.undefined)
    
    @scala.inline
    def setEnableScheduledReleaseMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableScheduledReleaseMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableScheduledReleaseMetadata: Self = this.set("enableScheduledReleaseMetadata", js.undefined)
    
    @scala.inline
    def setEnableSearchUI(value: String): Self = this.set("enableSearchUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSearchUI: Self = this.set("enableSearchUI", js.undefined)
    
    @scala.inline
    def setEnableSearchUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSearchUIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSearchUIMetadata: Self = this.set("enableSearchUIMetadata", js.undefined)
    
    @scala.inline
    def setEnableSendToAgent(value: String): Self = this.set("enableSendToAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSendToAgent: Self = this.set("enableSendToAgent", js.undefined)
    
    @scala.inline
    def setEnableSendToAgentMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSendToAgentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSendToAgentMetadata: Self = this.set("enableSendToAgentMetadata", js.undefined)
    
    @scala.inline
    def setEnableSendToIntermediary(value: String): Self = this.set("enableSendToIntermediary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSendToIntermediary: Self = this.set("enableSendToIntermediary", js.undefined)
    
    @scala.inline
    def setEnableSendToIntermediaryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSendToIntermediaryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSendToIntermediaryMetadata: Self = this.set("enableSendToIntermediaryMetadata", js.undefined)
    
    @scala.inline
    def setEnableSendToManage(value: String): Self = this.set("enableSendToManage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSendToManage: Self = this.set("enableSendToManage", js.undefined)
    
    @scala.inline
    def setEnableSendToManageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSendToManageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSendToManageMetadata: Self = this.set("enableSendToManageMetadata", js.undefined)
    
    @scala.inline
    def setEnableSendingTagsFontSettings(value: String): Self = this.set("enableSendingTagsFontSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSendingTagsFontSettings: Self = this.set("enableSendingTagsFontSettings", js.undefined)
    
    @scala.inline
    def setEnableSendingTagsFontSettingsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSendingTagsFontSettingsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSendingTagsFontSettingsMetadata: Self = this.set("enableSendingTagsFontSettingsMetadata", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningAPI(value: String): Self = this.set("enableSequentialSigningAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSequentialSigningAPI: Self = this.set("enableSequentialSigningAPI", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningAPIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSequentialSigningAPIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSequentialSigningAPIMetadata: Self = this.set("enableSequentialSigningAPIMetadata", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningUI(value: String): Self = this.set("enableSequentialSigningUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSequentialSigningUI: Self = this.set("enableSequentialSigningUI", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSequentialSigningUIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSequentialSigningUIMetadata: Self = this.set("enableSequentialSigningUIMetadata", js.undefined)
    
    @scala.inline
    def setEnableSignOnPaper(value: String): Self = this.set("enableSignOnPaper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignOnPaper: Self = this.set("enableSignOnPaper", js.undefined)
    
    @scala.inline
    def setEnableSignOnPaperMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSignOnPaperMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignOnPaperMetadata: Self = this.set("enableSignOnPaperMetadata", js.undefined)
    
    @scala.inline
    def setEnableSignOnPaperOverride(value: String): Self = this.set("enableSignOnPaperOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignOnPaperOverride: Self = this.set("enableSignOnPaperOverride", js.undefined)
    
    @scala.inline
    def setEnableSignOnPaperOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSignOnPaperOverrideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignOnPaperOverrideMetadata: Self = this.set("enableSignOnPaperOverrideMetadata", js.undefined)
    
    @scala.inline
    def setEnableSignWithNotary(value: String): Self = this.set("enableSignWithNotary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignWithNotary: Self = this.set("enableSignWithNotary", js.undefined)
    
    @scala.inline
    def setEnableSignWithNotaryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSignWithNotaryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignWithNotaryMetadata: Self = this.set("enableSignWithNotaryMetadata", js.undefined)
    
    @scala.inline
    def setEnableSignerAttachments(value: String): Self = this.set("enableSignerAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignerAttachments: Self = this.set("enableSignerAttachments", js.undefined)
    
    @scala.inline
    def setEnableSignerAttachmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSignerAttachmentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSignerAttachmentsMetadata: Self = this.set("enableSignerAttachmentsMetadata", js.undefined)
    
    @scala.inline
    def setEnableSigningExtensionComments(value: String): Self = this.set("enableSigningExtensionComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSigningExtensionComments: Self = this.set("enableSigningExtensionComments", js.undefined)
    
    @scala.inline
    def setEnableSigningExtensionCommentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSigningExtensionCommentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSigningExtensionCommentsMetadata: Self = this.set("enableSigningExtensionCommentsMetadata", js.undefined)
    
    @scala.inline
    def setEnableSigningExtensionConversations(value: String): Self = this.set("enableSigningExtensionConversations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSigningExtensionConversations: Self = this.set("enableSigningExtensionConversations", js.undefined)
    
    @scala.inline
    def setEnableSigningExtensionConversationsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSigningExtensionConversationsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSigningExtensionConversationsMetadata: Self = this.set("enableSigningExtensionConversationsMetadata", js.undefined)
    
    @scala.inline
    def setEnableSigningOrderSettingsForAccount(value: String): Self = this.set("enableSigningOrderSettingsForAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSigningOrderSettingsForAccount: Self = this.set("enableSigningOrderSettingsForAccount", js.undefined)
    
    @scala.inline
    def setEnableSigningOrderSettingsForAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSigningOrderSettingsForAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSigningOrderSettingsForAccountMetadata: Self = this.set("enableSigningOrderSettingsForAccountMetadata", js.undefined)
    
    @scala.inline
    def setEnableSmartContracts(value: String): Self = this.set("enableSmartContracts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSmartContracts: Self = this.set("enableSmartContracts", js.undefined)
    
    @scala.inline
    def setEnableSmartContractsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSmartContractsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSmartContractsMetadata: Self = this.set("enableSmartContractsMetadata", js.undefined)
    
    @scala.inline
    def setEnableSocialIdLogin(value: String): Self = this.set("enableSocialIdLogin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSocialIdLogin: Self = this.set("enableSocialIdLogin", js.undefined)
    
    @scala.inline
    def setEnableSocialIdLoginMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSocialIdLoginMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSocialIdLoginMetadata: Self = this.set("enableSocialIdLoginMetadata", js.undefined)
    
    @scala.inline
    def setEnableStrikeThrough(value: String): Self = this.set("enableStrikeThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableStrikeThrough: Self = this.set("enableStrikeThrough", js.undefined)
    
    @scala.inline
    def setEnableStrikeThroughMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableStrikeThroughMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableStrikeThroughMetadata: Self = this.set("enableStrikeThroughMetadata", js.undefined)
    
    @scala.inline
    def setEnableTransactionPoint(value: String): Self = this.set("enableTransactionPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTransactionPoint: Self = this.set("enableTransactionPoint", js.undefined)
    
    @scala.inline
    def setEnableTransactionPointMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableTransactionPointMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTransactionPointMetadata: Self = this.set("enableTransactionPointMetadata", js.undefined)
    
    @scala.inline
    def setEnableVaulting(value: String): Self = this.set("enableVaulting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableVaulting: Self = this.set("enableVaulting", js.undefined)
    
    @scala.inline
    def setEnableVaultingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableVaultingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableVaultingMetadata: Self = this.set("enableVaultingMetadata", js.undefined)
    
    @scala.inline
    def setEnableWitnessing(value: String): Self = this.set("enableWitnessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWitnessing: Self = this.set("enableWitnessing", js.undefined)
    
    @scala.inline
    def setEnableWitnessingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableWitnessingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWitnessingMetadata: Self = this.set("enableWitnessingMetadata", js.undefined)
    
    @scala.inline
    def setEnforceTemplateNameUniqueness(value: String): Self = this.set("enforceTemplateNameUniqueness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceTemplateNameUniqueness: Self = this.set("enforceTemplateNameUniqueness", js.undefined)
    
    @scala.inline
    def setEnforceTemplateNameUniquenessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enforceTemplateNameUniquenessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceTemplateNameUniquenessMetadata: Self = this.set("enforceTemplateNameUniquenessMetadata", js.undefined)
    
    @scala.inline
    def setEnvelopeIntegrationAllowed(value: String): Self = this.set("envelopeIntegrationAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIntegrationAllowed: Self = this.set("envelopeIntegrationAllowed", js.undefined)
    
    @scala.inline
    def setEnvelopeIntegrationAllowedMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("envelopeIntegrationAllowedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIntegrationAllowedMetadata: Self = this.set("envelopeIntegrationAllowedMetadata", js.undefined)
    
    @scala.inline
    def setEnvelopeIntegrationEnabled(value: String): Self = this.set("envelopeIntegrationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIntegrationEnabled: Self = this.set("envelopeIntegrationEnabled", js.undefined)
    
    @scala.inline
    def setEnvelopeIntegrationEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("envelopeIntegrationEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeIntegrationEnabledMetadata: Self = this.set("envelopeIntegrationEnabledMetadata", js.undefined)
    
    @scala.inline
    def setEnvelopeStampingDefaultValue(value: String): Self = this.set("envelopeStampingDefaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeStampingDefaultValue: Self = this.set("envelopeStampingDefaultValue", js.undefined)
    
    @scala.inline
    def setEnvelopeStampingDefaultValueMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("envelopeStampingDefaultValueMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeStampingDefaultValueMetadata: Self = this.set("envelopeStampingDefaultValueMetadata", js.undefined)
    
    @scala.inline
    def setExpressSend(value: String): Self = this.set("expressSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressSend: Self = this.set("expressSend", js.undefined)
    
    @scala.inline
    def setExpressSendAllowTabs(value: String): Self = this.set("expressSendAllowTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressSendAllowTabs: Self = this.set("expressSendAllowTabs", js.undefined)
    
    @scala.inline
    def setExpressSendAllowTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("expressSendAllowTabsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressSendAllowTabsMetadata: Self = this.set("expressSendAllowTabsMetadata", js.undefined)
    
    @scala.inline
    def setExpressSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("expressSendMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressSendMetadata: Self = this.set("expressSendMetadata", js.undefined)
    
    @scala.inline
    def setExternalDocumentSources(value: /* A complex object specifying the external document sources. */ ExternalDocumentSources): Self = this.set("externalDocumentSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalDocumentSources: Self = this.set("externalDocumentSources", js.undefined)
    
    @scala.inline
    def setExternalSignaturePadType(value: String): Self = this.set("externalSignaturePadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalSignaturePadType: Self = this.set("externalSignaturePadType", js.undefined)
    
    @scala.inline
    def setExternalSignaturePadTypeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("externalSignaturePadTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExternalSignaturePadTypeMetadata: Self = this.set("externalSignaturePadTypeMetadata", js.undefined)
    
    @scala.inline
    def setFaxOutEnabled(value: String): Self = this.set("faxOutEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxOutEnabled: Self = this.set("faxOutEnabled", js.undefined)
    
    @scala.inline
    def setFaxOutEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("faxOutEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxOutEnabledMetadata: Self = this.set("faxOutEnabledMetadata", js.undefined)
    
    @scala.inline
    def setGuidedFormsHtmlAllowed(value: String): Self = this.set("guidedFormsHtmlAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuidedFormsHtmlAllowed: Self = this.set("guidedFormsHtmlAllowed", js.undefined)
    
    @scala.inline
    def setGuidedFormsHtmlAllowedMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("guidedFormsHtmlAllowedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuidedFormsHtmlAllowedMetadata: Self = this.set("guidedFormsHtmlAllowedMetadata", js.undefined)
    
    @scala.inline
    def setHideAccountAddressInCoC(value: String): Self = this.set("hideAccountAddressInCoC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAccountAddressInCoC: Self = this.set("hideAccountAddressInCoC", js.undefined)
    
    @scala.inline
    def setHideAccountAddressInCoCMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("hideAccountAddressInCoCMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideAccountAddressInCoCMetadata: Self = this.set("hideAccountAddressInCoCMetadata", js.undefined)
    
    @scala.inline
    def setHidePricing(value: String): Self = this.set("hidePricing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePricing: Self = this.set("hidePricing", js.undefined)
    
    @scala.inline
    def setHidePricingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("hidePricingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidePricingMetadata: Self = this.set("hidePricingMetadata", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationsVarargs(value: (/* A complex object specifying ID check configuration. */ IdCheckConfiguration)*): Self = this.set("idCheckConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setIdCheckConfigurations(value: js.Array[/* A complex object specifying ID check configuration. */ IdCheckConfiguration]): Self = this.set("idCheckConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckConfigurations: Self = this.set("idCheckConfigurations", js.undefined)
    
    @scala.inline
    def setIdCheckExpire(value: String): Self = this.set("idCheckExpire", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckExpire: Self = this.set("idCheckExpire", js.undefined)
    
    @scala.inline
    def setIdCheckExpireDays(value: String): Self = this.set("idCheckExpireDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckExpireDays: Self = this.set("idCheckExpireDays", js.undefined)
    
    @scala.inline
    def setIdCheckExpireDaysMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("idCheckExpireDaysMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckExpireDaysMetadata: Self = this.set("idCheckExpireDaysMetadata", js.undefined)
    
    @scala.inline
    def setIdCheckExpireMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("idCheckExpireMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckExpireMetadata: Self = this.set("idCheckExpireMetadata", js.undefined)
    
    @scala.inline
    def setIdCheckExpireMinutes(value: String): Self = this.set("idCheckExpireMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckExpireMinutes: Self = this.set("idCheckExpireMinutes", js.undefined)
    
    @scala.inline
    def setIdCheckExpireMinutesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("idCheckExpireMinutesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckExpireMinutesMetadata: Self = this.set("idCheckExpireMinutesMetadata", js.undefined)
    
    @scala.inline
    def setIdCheckRequired(value: String): Self = this.set("idCheckRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckRequired: Self = this.set("idCheckRequired", js.undefined)
    
    @scala.inline
    def setIdCheckRequiredMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("idCheckRequiredMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckRequiredMetadata: Self = this.set("idCheckRequiredMetadata", js.undefined)
    
    @scala.inline
    def setIdentityVerificationVarargs(value: (/* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow)*): Self = this.set("identityVerification", js.Array(value :_*))
    
    @scala.inline
    def setIdentityVerification(
      value: js.Array[
          /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
        ]
    ): Self = this.set("identityVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityVerification: Self = this.set("identityVerification", js.undefined)
    
    @scala.inline
    def setIdentityVerificationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("identityVerificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityVerificationMetadata: Self = this.set("identityVerificationMetadata", js.undefined)
    
    @scala.inline
    def setIgnoreErrorIfAnchorTabNotFound(value: String): Self = this.set("ignoreErrorIfAnchorTabNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrorIfAnchorTabNotFound: Self = this.set("ignoreErrorIfAnchorTabNotFound", js.undefined)
    
    @scala.inline
    def setIgnoreErrorIfAnchorTabNotFoundMetadataEnabled(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("ignoreErrorIfAnchorTabNotFoundMetadataEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrorIfAnchorTabNotFoundMetadataEnabled: Self = this.set("ignoreErrorIfAnchorTabNotFoundMetadataEnabled", js.undefined)
    
    @scala.inline
    def setInPersonIDCheckQuestion(value: String): Self = this.set("inPersonIDCheckQuestion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPersonIDCheckQuestion: Self = this.set("inPersonIDCheckQuestion", js.undefined)
    
    @scala.inline
    def setInPersonIDCheckQuestionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("inPersonIDCheckQuestionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPersonIDCheckQuestionMetadata: Self = this.set("inPersonIDCheckQuestionMetadata", js.undefined)
    
    @scala.inline
    def setInPersonSigningEnabled(value: String): Self = this.set("inPersonSigningEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPersonSigningEnabled: Self = this.set("inPersonSigningEnabled", js.undefined)
    
    @scala.inline
    def setInPersonSigningEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("inPersonSigningEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPersonSigningEnabledMetadata: Self = this.set("inPersonSigningEnabledMetadata", js.undefined)
    
    @scala.inline
    def setInSessionEnabled(value: String): Self = this.set("inSessionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInSessionEnabled: Self = this.set("inSessionEnabled", js.undefined)
    
    @scala.inline
    def setInSessionEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("inSessionEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInSessionEnabledMetadata: Self = this.set("inSessionEnabledMetadata", js.undefined)
    
    @scala.inline
    def setInSessionSuppressEmails(value: String): Self = this.set("inSessionSuppressEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInSessionSuppressEmails: Self = this.set("inSessionSuppressEmails", js.undefined)
    
    @scala.inline
    def setInSessionSuppressEmailsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("inSessionSuppressEmailsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInSessionSuppressEmailsMetadata: Self = this.set("inSessionSuppressEmailsMetadata", js.undefined)
    
    @scala.inline
    def setMaxNumberOfCustomStamps(value: String): Self = this.set("maxNumberOfCustomStamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumberOfCustomStamps: Self = this.set("maxNumberOfCustomStamps", js.undefined)
    
    @scala.inline
    def setMaximumSigningGroups(value: String): Self = this.set("maximumSigningGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumSigningGroups: Self = this.set("maximumSigningGroups", js.undefined)
    
    @scala.inline
    def setMaximumSigningGroupsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("maximumSigningGroupsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumSigningGroupsMetadata: Self = this.set("maximumSigningGroupsMetadata", js.undefined)
    
    @scala.inline
    def setMaximumUsersPerSigningGroup(value: String): Self = this.set("maximumUsersPerSigningGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumUsersPerSigningGroup: Self = this.set("maximumUsersPerSigningGroup", js.undefined)
    
    @scala.inline
    def setMaximumUsersPerSigningGroupMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("maximumUsersPerSigningGroupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumUsersPerSigningGroupMetadata: Self = this.set("maximumUsersPerSigningGroupMetadata", js.undefined)
    
    @scala.inline
    def setMobileSessionTimeout(value: String): Self = this.set("mobileSessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileSessionTimeout: Self = this.set("mobileSessionTimeout", js.undefined)
    
    @scala.inline
    def setMobileSessionTimeoutMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("mobileSessionTimeoutMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileSessionTimeoutMetadata: Self = this.set("mobileSessionTimeoutMetadata", js.undefined)
    
    @scala.inline
    def setNumberOfActiveCustomStamps(value: String): Self = this.set("numberOfActiveCustomStamps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberOfActiveCustomStamps: Self = this.set("numberOfActiveCustomStamps", js.undefined)
    
    @scala.inline
    def setOptInMobileSigningV02(value: String): Self = this.set("optInMobileSigningV02", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptInMobileSigningV02: Self = this.set("optInMobileSigningV02", js.undefined)
    
    @scala.inline
    def setOptInMobileSigningV02Metadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("optInMobileSigningV02Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptInMobileSigningV02Metadata: Self = this.set("optInMobileSigningV02Metadata", js.undefined)
    
    @scala.inline
    def setOptOutAutoNavTextAndTabColorUpdates(value: String): Self = this.set("optOutAutoNavTextAndTabColorUpdates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptOutAutoNavTextAndTabColorUpdates: Self = this.set("optOutAutoNavTextAndTabColorUpdates", js.undefined)
    
    @scala.inline
    def setOptOutAutoNavTextAndTabColorUpdatesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("optOutAutoNavTextAndTabColorUpdatesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptOutAutoNavTextAndTabColorUpdatesMetadata: Self = this.set("optOutAutoNavTextAndTabColorUpdatesMetadata", js.undefined)
    
    @scala.inline
    def setOptOutNewPlatformSeal(value: String): Self = this.set("optOutNewPlatformSeal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptOutNewPlatformSeal: Self = this.set("optOutNewPlatformSeal", js.undefined)
    
    @scala.inline
    def setOptOutNewPlatformSealPlatformMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("optOutNewPlatformSealPlatformMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptOutNewPlatformSealPlatformMetadata: Self = this.set("optOutNewPlatformSealPlatformMetadata", js.undefined)
    
    @scala.inline
    def setPhoneAuthRecipientMayProvidePhoneNumber(value: String): Self = this.set("phoneAuthRecipientMayProvidePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneAuthRecipientMayProvidePhoneNumber: Self = this.set("phoneAuthRecipientMayProvidePhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneAuthRecipientMayProvidePhoneNumberMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("phoneAuthRecipientMayProvidePhoneNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneAuthRecipientMayProvidePhoneNumberMetadata: Self = this.set("phoneAuthRecipientMayProvidePhoneNumberMetadata", js.undefined)
    
    @scala.inline
    def setPkiSignDownloadedPDFDocs(value: String): Self = this.set("pkiSignDownloadedPDFDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkiSignDownloadedPDFDocs: Self = this.set("pkiSignDownloadedPDFDocs", js.undefined)
    
    @scala.inline
    def setPkiSignDownloadedPDFDocsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("pkiSignDownloadedPDFDocsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkiSignDownloadedPDFDocsMetadata: Self = this.set("pkiSignDownloadedPDFDocsMetadata", js.undefined)
    
    @scala.inline
    def setRecipientSigningAutoNavigationControl(value: String): Self = this.set("recipientSigningAutoNavigationControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientSigningAutoNavigationControl: Self = this.set("recipientSigningAutoNavigationControl", js.undefined)
    
    @scala.inline
    def setRecipientSigningAutoNavigationControlMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("recipientSigningAutoNavigationControlMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientSigningAutoNavigationControlMetadata: Self = this.set("recipientSigningAutoNavigationControlMetadata", js.undefined)
    
    @scala.inline
    def setRecipientsCanSignOffline(value: String): Self = this.set("recipientsCanSignOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientsCanSignOffline: Self = this.set("recipientsCanSignOffline", js.undefined)
    
    @scala.inline
    def setRecipientsCanSignOfflineMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("recipientsCanSignOfflineMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientsCanSignOfflineMetadata: Self = this.set("recipientsCanSignOfflineMetadata", js.undefined)
    
    @scala.inline
    def setRequire21CFRpt11Compliance(value: String): Self = this.set("require21CFRpt11Compliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire21CFRpt11Compliance: Self = this.set("require21CFRpt11Compliance", js.undefined)
    
    @scala.inline
    def setRequire21CFRpt11ComplianceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("require21CFRpt11ComplianceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequire21CFRpt11ComplianceMetadata: Self = this.set("require21CFRpt11ComplianceMetadata", js.undefined)
    
    @scala.inline
    def setRequireDeclineReason(value: String): Self = this.set("requireDeclineReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireDeclineReason: Self = this.set("requireDeclineReason", js.undefined)
    
    @scala.inline
    def setRequireDeclineReasonMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("requireDeclineReasonMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireDeclineReasonMetadata: Self = this.set("requireDeclineReasonMetadata", js.undefined)
    
    @scala.inline
    def setRequireExternalUserManagement(value: String): Self = this.set("requireExternalUserManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireExternalUserManagement: Self = this.set("requireExternalUserManagement", js.undefined)
    
    @scala.inline
    def setRequireExternalUserManagementMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("requireExternalUserManagementMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireExternalUserManagementMetadata: Self = this.set("requireExternalUserManagementMetadata", js.undefined)
    
    @scala.inline
    def setRequireSignerCertificateType(value: String): Self = this.set("requireSignerCertificateType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSignerCertificateType: Self = this.set("requireSignerCertificateType", js.undefined)
    
    @scala.inline
    def setRequireSignerCertificateTypeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("requireSignerCertificateTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSignerCertificateTypeMetadata: Self = this.set("requireSignerCertificateTypeMetadata", js.undefined)
    
    @scala.inline
    def setRsaVeridAccountName(value: String): Self = this.set("rsaVeridAccountName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRsaVeridAccountName: Self = this.set("rsaVeridAccountName", js.undefined)
    
    @scala.inline
    def setRsaVeridPassword(value: String): Self = this.set("rsaVeridPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRsaVeridPassword: Self = this.set("rsaVeridPassword", js.undefined)
    
    @scala.inline
    def setRsaVeridRuleset(value: String): Self = this.set("rsaVeridRuleset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRsaVeridRuleset: Self = this.set("rsaVeridRuleset", js.undefined)
    
    @scala.inline
    def setRsaVeridUserId(value: String): Self = this.set("rsaVeridUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRsaVeridUserId: Self = this.set("rsaVeridUserId", js.undefined)
    
    @scala.inline
    def setSelfSignedRecipientEmailDocument(value: String): Self = this.set("selfSignedRecipientEmailDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfSignedRecipientEmailDocument: Self = this.set("selfSignedRecipientEmailDocument", js.undefined)
    
    @scala.inline
    def setSelfSignedRecipientEmailDocumentMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("selfSignedRecipientEmailDocumentMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfSignedRecipientEmailDocumentMetadata: Self = this.set("selfSignedRecipientEmailDocumentMetadata", js.undefined)
    
    @scala.inline
    def setSelfSignedRecipientEmailDocumentUserOverride(value: String): Self = this.set("selfSignedRecipientEmailDocumentUserOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfSignedRecipientEmailDocumentUserOverride: Self = this.set("selfSignedRecipientEmailDocumentUserOverride", js.undefined)
    
    @scala.inline
    def setSelfSignedRecipientEmailDocumentUserOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("selfSignedRecipientEmailDocumentUserOverrideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfSignedRecipientEmailDocumentUserOverrideMetadata: Self = this.set("selfSignedRecipientEmailDocumentUserOverrideMetadata", js.undefined)
    
    @scala.inline
    def setSendToCertifiedDeliveryEnabled(value: String): Self = this.set("sendToCertifiedDeliveryEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendToCertifiedDeliveryEnabled: Self = this.set("sendToCertifiedDeliveryEnabled", js.undefined)
    
    @scala.inline
    def setSendToCertifiedDeliveryEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("sendToCertifiedDeliveryEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendToCertifiedDeliveryEnabledMetadata: Self = this.set("sendToCertifiedDeliveryEnabledMetadata", js.undefined)
    
    @scala.inline
    def setSenderCanSignInEachLocation(value: String): Self = this.set("senderCanSignInEachLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderCanSignInEachLocation: Self = this.set("senderCanSignInEachLocation", js.undefined)
    
    @scala.inline
    def setSenderCanSignInEachLocationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("senderCanSignInEachLocationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderCanSignInEachLocationMetadata: Self = this.set("senderCanSignInEachLocationMetadata", js.undefined)
    
    @scala.inline
    def setSenderMustAuthenticateSigning(value: String): Self = this.set("senderMustAuthenticateSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderMustAuthenticateSigning: Self = this.set("senderMustAuthenticateSigning", js.undefined)
    
    @scala.inline
    def setSenderMustAuthenticateSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("senderMustAuthenticateSigningMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderMustAuthenticateSigningMetadata: Self = this.set("senderMustAuthenticateSigningMetadata", js.undefined)
    
    @scala.inline
    def setSendingTagsFontColor(value: String): Self = this.set("sendingTagsFontColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingTagsFontColor: Self = this.set("sendingTagsFontColor", js.undefined)
    
    @scala.inline
    def setSendingTagsFontColorMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("sendingTagsFontColorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingTagsFontColorMetadata: Self = this.set("sendingTagsFontColorMetadata", js.undefined)
    
    @scala.inline
    def setSendingTagsFontName(value: String): Self = this.set("sendingTagsFontName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingTagsFontName: Self = this.set("sendingTagsFontName", js.undefined)
    
    @scala.inline
    def setSendingTagsFontNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("sendingTagsFontNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingTagsFontNameMetadata: Self = this.set("sendingTagsFontNameMetadata", js.undefined)
    
    @scala.inline
    def setSendingTagsFontSize(value: String): Self = this.set("sendingTagsFontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingTagsFontSize: Self = this.set("sendingTagsFontSize", js.undefined)
    
    @scala.inline
    def setSendingTagsFontSizeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("sendingTagsFontSizeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendingTagsFontSizeMetadata: Self = this.set("sendingTagsFontSizeMetadata", js.undefined)
    
    @scala.inline
    def setSessionTimeout(value: String): Self = this.set("sessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeout: Self = this.set("sessionTimeout", js.undefined)
    
    @scala.inline
    def setSessionTimeoutMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("sessionTimeoutMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSessionTimeoutMetadata: Self = this.set("sessionTimeoutMetadata", js.undefined)
    
    @scala.inline
    def setSetRecipEmailLang(value: String): Self = this.set("setRecipEmailLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRecipEmailLang: Self = this.set("setRecipEmailLang", js.undefined)
    
    @scala.inline
    def setSetRecipEmailLangMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("setRecipEmailLangMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRecipEmailLangMetadata: Self = this.set("setRecipEmailLangMetadata", js.undefined)
    
    @scala.inline
    def setSetRecipSignLang(value: String): Self = this.set("setRecipSignLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRecipSignLang: Self = this.set("setRecipSignLang", js.undefined)
    
    @scala.inline
    def setSetRecipSignLangMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("setRecipSignLangMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetRecipSignLangMetadata: Self = this.set("setRecipSignLangMetadata", js.undefined)
    
    @scala.inline
    def setSharedTemplateFolders(value: String): Self = this.set("sharedTemplateFolders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedTemplateFolders: Self = this.set("sharedTemplateFolders", js.undefined)
    
    @scala.inline
    def setSharedTemplateFoldersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("sharedTemplateFoldersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSharedTemplateFoldersMetadata: Self = this.set("sharedTemplateFoldersMetadata", js.undefined)
    
    @scala.inline
    def setShowCompleteDialogInEmbeddedSession(value: String): Self = this.set("showCompleteDialogInEmbeddedSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCompleteDialogInEmbeddedSession: Self = this.set("showCompleteDialogInEmbeddedSession", js.undefined)
    
    @scala.inline
    def setShowCompleteDialogInEmbeddedSessionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("showCompleteDialogInEmbeddedSessionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCompleteDialogInEmbeddedSessionMetadata: Self = this.set("showCompleteDialogInEmbeddedSessionMetadata", js.undefined)
    
    @scala.inline
    def setShowConditionalRoutingOnSend(value: String): Self = this.set("showConditionalRoutingOnSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowConditionalRoutingOnSend: Self = this.set("showConditionalRoutingOnSend", js.undefined)
    
    @scala.inline
    def setShowConditionalRoutingOnSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("showConditionalRoutingOnSendMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowConditionalRoutingOnSendMetadata: Self = this.set("showConditionalRoutingOnSendMetadata", js.undefined)
    
    @scala.inline
    def setShowInitialConditionalFields(value: String): Self = this.set("showInitialConditionalFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInitialConditionalFields: Self = this.set("showInitialConditionalFields", js.undefined)
    
    @scala.inline
    def setShowInitialConditionalFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("showInitialConditionalFieldsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowInitialConditionalFieldsMetadata: Self = this.set("showInitialConditionalFieldsMetadata", js.undefined)
    
    @scala.inline
    def setShowLocalizedWatermarks(value: String): Self = this.set("showLocalizedWatermarks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLocalizedWatermarks: Self = this.set("showLocalizedWatermarks", js.undefined)
    
    @scala.inline
    def setShowLocalizedWatermarksMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("showLocalizedWatermarksMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowLocalizedWatermarksMetadata: Self = this.set("showLocalizedWatermarksMetadata", js.undefined)
    
    @scala.inline
    def setShowTutorials(value: String): Self = this.set("showTutorials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTutorials: Self = this.set("showTutorials", js.undefined)
    
    @scala.inline
    def setShowTutorialsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("showTutorialsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTutorialsMetadata: Self = this.set("showTutorialsMetadata", js.undefined)
    
    @scala.inline
    def setSignDateFormat(value: String): Self = this.set("signDateFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignDateFormat: Self = this.set("signDateFormat", js.undefined)
    
    @scala.inline
    def setSignDateFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signDateFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignDateFormatMetadata: Self = this.set("signDateFormatMetadata", js.undefined)
    
    @scala.inline
    def setSignTimeFormat(value: String): Self = this.set("signTimeFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignTimeFormat: Self = this.set("signTimeFormat", js.undefined)
    
    @scala.inline
    def setSignTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signTimeFormatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignTimeFormatMetadata: Self = this.set("signTimeFormatMetadata", js.undefined)
    
    @scala.inline
    def setSignTimeShowAmPm(value: String): Self = this.set("signTimeShowAmPm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignTimeShowAmPm: Self = this.set("signTimeShowAmPm", js.undefined)
    
    @scala.inline
    def setSignTimeShowAmPmMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signTimeShowAmPmMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignTimeShowAmPmMetadata: Self = this.set("signTimeShowAmPmMetadata", js.undefined)
    
    @scala.inline
    def setSignatureProvidersVarargs(value: String*): Self = this.set("signatureProviders", js.Array(value :_*))
    
    @scala.inline
    def setSignatureProviders(value: js.Array[String]): Self = this.set("signatureProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProviders: Self = this.set("signatureProviders", js.undefined)
    
    @scala.inline
    def setSignatureProvidersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signatureProvidersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureProvidersMetadata: Self = this.set("signatureProvidersMetadata", js.undefined)
    
    @scala.inline
    def setSignerAttachCertificateToEnvelopePDF(value: String): Self = this.set("signerAttachCertificateToEnvelopePDF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerAttachCertificateToEnvelopePDF: Self = this.set("signerAttachCertificateToEnvelopePDF", js.undefined)
    
    @scala.inline
    def setSignerAttachCertificateToEnvelopePDFMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerAttachCertificateToEnvelopePDFMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerAttachCertificateToEnvelopePDFMetadata: Self = this.set("signerAttachCertificateToEnvelopePDFMetadata", js.undefined)
    
    @scala.inline
    def setSignerAttachConcat(value: String): Self = this.set("signerAttachConcat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerAttachConcat: Self = this.set("signerAttachConcat", js.undefined)
    
    @scala.inline
    def setSignerAttachConcatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerAttachConcatMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerAttachConcatMetadata: Self = this.set("signerAttachConcatMetadata", js.undefined)
    
    @scala.inline
    def setSignerCanCreateAccount(value: String): Self = this.set("signerCanCreateAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerCanCreateAccount: Self = this.set("signerCanCreateAccount", js.undefined)
    
    @scala.inline
    def setSignerCanCreateAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerCanCreateAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerCanCreateAccountMetadata: Self = this.set("signerCanCreateAccountMetadata", js.undefined)
    
    @scala.inline
    def setSignerCanSignOnMobile(value: String): Self = this.set("signerCanSignOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerCanSignOnMobile: Self = this.set("signerCanSignOnMobile", js.undefined)
    
    @scala.inline
    def setSignerCanSignOnMobileMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerCanSignOnMobileMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerCanSignOnMobileMetadata: Self = this.set("signerCanSignOnMobileMetadata", js.undefined)
    
    @scala.inline
    def setSignerInSessionUseEnvelopeCompleteEmail(value: String): Self = this.set("signerInSessionUseEnvelopeCompleteEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerInSessionUseEnvelopeCompleteEmail: Self = this.set("signerInSessionUseEnvelopeCompleteEmail", js.undefined)
    
    @scala.inline
    def setSignerInSessionUseEnvelopeCompleteEmailMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerInSessionUseEnvelopeCompleteEmailMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerInSessionUseEnvelopeCompleteEmailMetadata: Self = this.set("signerInSessionUseEnvelopeCompleteEmailMetadata", js.undefined)
    
    @scala.inline
    def setSignerLoginRequirements(value: String): Self = this.set("signerLoginRequirements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerLoginRequirements: Self = this.set("signerLoginRequirements", js.undefined)
    
    @scala.inline
    def setSignerLoginRequirementsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerLoginRequirementsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerLoginRequirementsMetadata: Self = this.set("signerLoginRequirementsMetadata", js.undefined)
    
    @scala.inline
    def setSignerMustHaveAccount(value: String): Self = this.set("signerMustHaveAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerMustHaveAccount: Self = this.set("signerMustHaveAccount", js.undefined)
    
    @scala.inline
    def setSignerMustHaveAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerMustHaveAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerMustHaveAccountMetadata: Self = this.set("signerMustHaveAccountMetadata", js.undefined)
    
    @scala.inline
    def setSignerMustLoginToSign(value: String): Self = this.set("signerMustLoginToSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerMustLoginToSign: Self = this.set("signerMustLoginToSign", js.undefined)
    
    @scala.inline
    def setSignerMustLoginToSignMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerMustLoginToSignMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerMustLoginToSignMetadata: Self = this.set("signerMustLoginToSignMetadata", js.undefined)
    
    @scala.inline
    def setSignerShowSecureFieldInitialValues(value: String): Self = this.set("signerShowSecureFieldInitialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerShowSecureFieldInitialValues: Self = this.set("signerShowSecureFieldInitialValues", js.undefined)
    
    @scala.inline
    def setSignerShowSecureFieldInitialValuesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signerShowSecureFieldInitialValuesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerShowSecureFieldInitialValuesMetadata: Self = this.set("signerShowSecureFieldInitialValuesMetadata", js.undefined)
    
    @scala.inline
    def setSigningSessionTimeout(value: String): Self = this.set("signingSessionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningSessionTimeout: Self = this.set("signingSessionTimeout", js.undefined)
    
    @scala.inline
    def setSigningSessionTimeoutMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signingSessionTimeoutMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningSessionTimeoutMetadata: Self = this.set("signingSessionTimeoutMetadata", js.undefined)
    
    @scala.inline
    def setSigningUiVersion(value: String): Self = this.set("signingUiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningUiVersion: Self = this.set("signingUiVersion", js.undefined)
    
    @scala.inline
    def setSigningUiVersionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signingUiVersionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningUiVersionMetadata: Self = this.set("signingUiVersionMetadata", js.undefined)
    
    @scala.inline
    def setSimplifiedSendingEnabled(value: String): Self = this.set("simplifiedSendingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimplifiedSendingEnabled: Self = this.set("simplifiedSendingEnabled", js.undefined)
    
    @scala.inline
    def setSimplifiedSendingEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("simplifiedSendingEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimplifiedSendingEnabledMetadata: Self = this.set("simplifiedSendingEnabledMetadata", js.undefined)
    
    @scala.inline
    def setSingleSignOnEnabled(value: String): Self = this.set("singleSignOnEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleSignOnEnabled: Self = this.set("singleSignOnEnabled", js.undefined)
    
    @scala.inline
    def setSingleSignOnEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("singleSignOnEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleSignOnEnabledMetadata: Self = this.set("singleSignOnEnabledMetadata", js.undefined)
    
    @scala.inline
    def setSkipAuthCompletedEnvelopes(value: String): Self = this.set("skipAuthCompletedEnvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipAuthCompletedEnvelopes: Self = this.set("skipAuthCompletedEnvelopes", js.undefined)
    
    @scala.inline
    def setSkipAuthCompletedEnvelopesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("skipAuthCompletedEnvelopesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipAuthCompletedEnvelopesMetadata: Self = this.set("skipAuthCompletedEnvelopesMetadata", js.undefined)
    
    @scala.inline
    def setSocialIdRecipAuth(value: String): Self = this.set("socialIdRecipAuth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialIdRecipAuth: Self = this.set("socialIdRecipAuth", js.undefined)
    
    @scala.inline
    def setSocialIdRecipAuthMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("socialIdRecipAuthMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialIdRecipAuthMetadata: Self = this.set("socialIdRecipAuthMetadata", js.undefined)
    
    @scala.inline
    def setSpecifyDocumentVisibility(value: String): Self = this.set("specifyDocumentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecifyDocumentVisibility: Self = this.set("specifyDocumentVisibility", js.undefined)
    
    @scala.inline
    def setSpecifyDocumentVisibilityMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("specifyDocumentVisibilityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecifyDocumentVisibilityMetadata: Self = this.set("specifyDocumentVisibilityMetadata", js.undefined)
    
    @scala.inline
    def setStartInAdvancedCorrect(value: String): Self = this.set("startInAdvancedCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartInAdvancedCorrect: Self = this.set("startInAdvancedCorrect", js.undefined)
    
    @scala.inline
    def setStartInAdvancedCorrectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("startInAdvancedCorrectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartInAdvancedCorrectMetadata: Self = this.set("startInAdvancedCorrectMetadata", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustAccept(value: String): Self = this.set("supplementalDocumentsMustAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementalDocumentsMustAccept: Self = this.set("supplementalDocumentsMustAccept", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustAcceptMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("supplementalDocumentsMustAcceptMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementalDocumentsMustAcceptMetadata: Self = this.set("supplementalDocumentsMustAcceptMetadata", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustRead(value: String): Self = this.set("supplementalDocumentsMustRead", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementalDocumentsMustRead: Self = this.set("supplementalDocumentsMustRead", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustReadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("supplementalDocumentsMustReadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementalDocumentsMustReadMetadata: Self = this.set("supplementalDocumentsMustReadMetadata", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustView(value: String): Self = this.set("supplementalDocumentsMustView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementalDocumentsMustView: Self = this.set("supplementalDocumentsMustView", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentsMustViewMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("supplementalDocumentsMustViewMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementalDocumentsMustViewMetadata: Self = this.set("supplementalDocumentsMustViewMetadata", js.undefined)
    
    @scala.inline
    def setSuppressCertificateEnforcement(value: String): Self = this.set("suppressCertificateEnforcement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressCertificateEnforcement: Self = this.set("suppressCertificateEnforcement", js.undefined)
    
    @scala.inline
    def setSuppressCertificateEnforcementMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("suppressCertificateEnforcementMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressCertificateEnforcementMetadata: Self = this.set("suppressCertificateEnforcementMetadata", js.undefined)
    
    @scala.inline
    def setTabAccountSettings(value: TabAccountSettings): Self = this.set("tabAccountSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabAccountSettings: Self = this.set("tabAccountSettings", js.undefined)
    
    @scala.inline
    def setTimezoneOffsetAPI(value: String): Self = this.set("timezoneOffsetAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneOffsetAPI: Self = this.set("timezoneOffsetAPI", js.undefined)
    
    @scala.inline
    def setTimezoneOffsetAPIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timezoneOffsetAPIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneOffsetAPIMetadata: Self = this.set("timezoneOffsetAPIMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneOffsetUI(value: String): Self = this.set("timezoneOffsetUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneOffsetUI: Self = this.set("timezoneOffsetUI", js.undefined)
    
    @scala.inline
    def setTimezoneOffsetUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timezoneOffsetUIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneOffsetUIMetadata: Self = this.set("timezoneOffsetUIMetadata", js.undefined)
    
    @scala.inline
    def setUniversalSignatureOptIn(value: String): Self = this.set("universalSignatureOptIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniversalSignatureOptIn: Self = this.set("universalSignatureOptIn", js.undefined)
    
    @scala.inline
    def setUseAccountLevelEmail(value: String): Self = this.set("useAccountLevelEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAccountLevelEmail: Self = this.set("useAccountLevelEmail", js.undefined)
    
    @scala.inline
    def setUseAccountLevelEmailMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useAccountLevelEmailMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseAccountLevelEmailMetadata: Self = this.set("useAccountLevelEmailMetadata", js.undefined)
    
    @scala.inline
    def setUseConsumerDisclosure(value: String): Self = this.set("useConsumerDisclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseConsumerDisclosure: Self = this.set("useConsumerDisclosure", js.undefined)
    
    @scala.inline
    def setUseConsumerDisclosureMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useConsumerDisclosureMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseConsumerDisclosureMetadata: Self = this.set("useConsumerDisclosureMetadata", js.undefined)
    
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
    def setUseDerivedKeys(value: String): Self = this.set("useDerivedKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDerivedKeys: Self = this.set("useDerivedKeys", js.undefined)
    
    @scala.inline
    def setUseDerivedKeysMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useDerivedKeysMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDerivedKeysMetadata: Self = this.set("useDerivedKeysMetadata", js.undefined)
    
    @scala.inline
    def setUseDocuSignExpressSignerCertificate(value: String): Self = this.set("useDocuSignExpressSignerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDocuSignExpressSignerCertificate: Self = this.set("useDocuSignExpressSignerCertificate", js.undefined)
    
    @scala.inline
    def setUseDocuSignExpressSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useDocuSignExpressSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDocuSignExpressSignerCertificateMetadata: Self = this.set("useDocuSignExpressSignerCertificateMetadata", js.undefined)
    
    @scala.inline
    def setUseMultiAppGroupsData(value: String): Self = this.set("useMultiAppGroupsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMultiAppGroupsData: Self = this.set("useMultiAppGroupsData", js.undefined)
    
    @scala.inline
    def setUseMultiAppGroupsDataMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useMultiAppGroupsDataMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMultiAppGroupsDataMetadata: Self = this.set("useMultiAppGroupsDataMetadata", js.undefined)
    
    @scala.inline
    def setUseNewBlobForPdf(value: String): Self = this.set("useNewBlobForPdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewBlobForPdf: Self = this.set("useNewBlobForPdf", js.undefined)
    
    @scala.inline
    def setUseNewBlobForPdfMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useNewBlobForPdfMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewBlobForPdfMetadata: Self = this.set("useNewBlobForPdfMetadata", js.undefined)
    
    @scala.inline
    def setUseSAFESignerCertificates(value: String): Self = this.set("useSAFESignerCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSAFESignerCertificates: Self = this.set("useSAFESignerCertificates", js.undefined)
    
    @scala.inline
    def setUseSAFESignerCertificatesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useSAFESignerCertificatesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSAFESignerCertificatesMetadata: Self = this.set("useSAFESignerCertificatesMetadata", js.undefined)
    
    @scala.inline
    def setUseSignatureProviderPlatform(value: String): Self = this.set("useSignatureProviderPlatform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSignatureProviderPlatform: Self = this.set("useSignatureProviderPlatform", js.undefined)
    
    @scala.inline
    def setUseSignatureProviderPlatformMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useSignatureProviderPlatformMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSignatureProviderPlatformMetadata: Self = this.set("useSignatureProviderPlatformMetadata", js.undefined)
    
    @scala.inline
    def setUsesAPI(value: String): Self = this.set("usesAPI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsesAPI: Self = this.set("usesAPI", js.undefined)
    
    @scala.inline
    def setUsesAPIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("usesAPIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsesAPIMetadata: Self = this.set("usesAPIMetadata", js.undefined)
    
    @scala.inline
    def setValidationsAllowed(value: String): Self = this.set("validationsAllowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsAllowed: Self = this.set("validationsAllowed", js.undefined)
    
    @scala.inline
    def setValidationsAllowedMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("validationsAllowedMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsAllowedMetadata: Self = this.set("validationsAllowedMetadata", js.undefined)
    
    @scala.inline
    def setValidationsBrand(value: String): Self = this.set("validationsBrand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsBrand: Self = this.set("validationsBrand", js.undefined)
    
    @scala.inline
    def setValidationsBrandMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("validationsBrandMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsBrandMetadata: Self = this.set("validationsBrandMetadata", js.undefined)
    
    @scala.inline
    def setValidationsCadence(value: String): Self = this.set("validationsCadence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsCadence: Self = this.set("validationsCadence", js.undefined)
    
    @scala.inline
    def setValidationsCadenceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("validationsCadenceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsCadenceMetadata: Self = this.set("validationsCadenceMetadata", js.undefined)
    
    @scala.inline
    def setValidationsEnabled(value: String): Self = this.set("validationsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsEnabled: Self = this.set("validationsEnabled", js.undefined)
    
    @scala.inline
    def setValidationsEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("validationsEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsEnabledMetadata: Self = this.set("validationsEnabledMetadata", js.undefined)
    
    @scala.inline
    def setValidationsReport(value: String): Self = this.set("validationsReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsReport: Self = this.set("validationsReport", js.undefined)
    
    @scala.inline
    def setValidationsReportMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("validationsReportMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationsReportMetadata: Self = this.set("validationsReportMetadata", js.undefined)
    
    @scala.inline
    def setWaterMarkEnabled(value: String): Self = this.set("waterMarkEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterMarkEnabled: Self = this.set("waterMarkEnabled", js.undefined)
    
    @scala.inline
    def setWaterMarkEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("waterMarkEnabledMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaterMarkEnabledMetadata: Self = this.set("waterMarkEnabledMetadata", js.undefined)
    
    @scala.inline
    def setWriteReminderToEnvelopeHistory(value: String): Self = this.set("writeReminderToEnvelopeHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteReminderToEnvelopeHistory: Self = this.set("writeReminderToEnvelopeHistory", js.undefined)
    
    @scala.inline
    def setWriteReminderToEnvelopeHistoryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("writeReminderToEnvelopeHistoryMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteReminderToEnvelopeHistoryMetadata: Self = this.set("writeReminderToEnvelopeHistoryMetadata", js.undefined)
    
    @scala.inline
    def setWurflMinAllowableScreenSize(value: String): Self = this.set("wurflMinAllowableScreenSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWurflMinAllowableScreenSize: Self = this.set("wurflMinAllowableScreenSize", js.undefined)
    
    @scala.inline
    def setWurflMinAllowableScreenSizeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("wurflMinAllowableScreenSizeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWurflMinAllowableScreenSizeMetadata: Self = this.set("wurflMinAllowableScreenSizeMetadata", js.undefined)
  }
}
