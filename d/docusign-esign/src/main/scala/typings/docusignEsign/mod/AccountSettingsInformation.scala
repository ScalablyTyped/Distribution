package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettingsInformation extends StObject {
  
  /**
    * Format of the string provided to a recipient in order to access an envelope.
    */
  var accessCodeFormat: js.UndefOr[
    /* object specifying the format of the string provided to a recipient in order to access an envelope. */ AccessCodeFormat
  ] = js.undefined
  
  /**
    * UTC date/time format for the account.
    */
  var accountDateTimeFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `accountDateTimeFormat` property is editable.
    */
  var accountDateTimeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The name on the account.
    */
  var accountName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `accountName` property is editable.
    */
  var accountNameMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * An object that specifies notifications (expirations and reminders) for the envelope.
    */
  var accountNotification: js.UndefOr[
    /* A complex element that specifies notifications (expirations and reminders) for the envelope. */ AccountNotification
  ] = js.undefined
  
  /**
    * An object that defines the settings to use in the UI.
    */
  var accountUISettings: js.UndefOr[
    /* An object that defines the options that are available to non-administrators in the UI. */ AccountUISettings
  ] = js.undefined
  
  /**
    * When set to **true**, [Signature Adoption Configuration](https://support.docusign.com/en/guides/ndse-admin-guide-signature-adopt-config) is enabled.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var adoptSigConfig: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `adoptSigConfig` property is editable.
    *
    */
  var adoptSigConfigMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**, the Advanced Correction feature is enabled for this account.
    */
  var advancedCorrect: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `advancedCorrect` property is editable.
    *
    */
  var advancedCorrectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the configured [Access Code Format](https://developers.docusign.com/esign-rest-api/reference/Accounts/Accounts/get#accessCodeFormat)
    * page is enabled for account administrators.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowAccessCodeFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowAccessCodeFormat` property is editable.
    *
    */
  var allowAccessCodeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the account can be managed on a per-user basis.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowAccountManagementGranular: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowAccountManagementGranular` property is editable.
    *
    */
  var allowAccountManagementGranularMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether member names can be changed in the account.
    */
  var allowAccountMemberNameChange: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowAccountMemberNameChange` property is editable.
    *
    */
  var allowAccountMemberNameChangeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, [Conditional Routing](https://support.docusign.com/en/guides/ndse-user-guide-conditional-recipients) is enabled for the account as part of
    * DocuSign's Advanced Recipient Routing feature.
    */
  var allowAdvancedRecipientRoutingConditional: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the ` allowAdvancedRecipientRoutingConditional` property is editable.
    */
  var allowAdvancedRecipientRoutingConditionalMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    *   If **true**, an agent recipient can change the email addresses of recipients later in the signing order.
    *
    */
  var allowAgentNameEmailEdit: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowAgentNameEmailEdit` property is editable.
    *
    */
  var allowAgentNameEmailEditMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowAgreementActions: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the `allowAgreementActions` property.
    */
  var allowAgreementActionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    *   If **true**, auto-navigation can be enabled for this account.
    *
    */
  var allowAutoNavSettings: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowAutoNavSettings` property is editable.
    *
    */
  var allowAutoNavSettingsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    *  If **true**, auto-tagging is enabled for the account.
    */
  var allowAutoTagging: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowAutoTagging` property is editable.
    */
  var allowAutoTaggingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, bulk send functionality is enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowBulkSend: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowBulkSend` property is editable.
    *
    */
  var allowBulkSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, indicates that the customer can withdraw their consent to the consumer disclosure when they decline to sign documents.
    * If these recipients sign documents sent to them from your account in the future, they will be required to agree to the terms in the disclosure.
    * The default value is **false**.
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
    * Boolean that specifies whether a Connect configuration can use HTTP listeners.
    */
  var allowConnectHttpListenerConfigs: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var allowConnectSendFinishLater: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowConnectSendFinishLater` property is editable.
    *
    */
  var allowConnectSendFinishLaterMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * the account has the ability to change the
    * [Consumer Disclosure](https://support.docusign.com/en/guides/ndse-admin-guide-legal-disclosure)
    * setting.
    *
    */
  var allowConsumerDisclosureOverride: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowConsumerDisclosureOverride` property is editable.
    *
    */
  var allowConsumerDisclosureOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, senders can download form data from the envelopes that they send.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowDataDownload: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowDataDownload` property is editable.
    *
    */
  var allowDataDownloadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether disclosure documents can be included in envelopes.
    */
  var allowDocumentDisclosures: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowDocumentDisclosures` property is editable.
    *
    */
  var allowDocumentDisclosuresMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the [Document Visibility](https://support.docusign.com/guides/ndse-user-guide-document-visibility) feature is enabled for the account.
    *
    */
  var allowDocumentVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowDocumentVisibility` property is editable.
    *
    */
  var allowDocumentVisibilityMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether notifications can include the envelope's signed document.
    */
  var allowDocumentsOnSignedEnvelopes: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowDocumentsOnSignedEnvelopes` property is editable.
    *
    */
  var allowDocumentsOnSignedEnvelopesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**,
    * [eHanko stamps](https://support.docusign.com/en/guides/ndse-user-guide-manage-your-stamps)
    * are enabled.
    *
    */
  var allowEHankoStamps: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowEHankoStamps` property is editable.
    *
    */
  var allowEHankoStampsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies whether eNote eOriginal integration is enabled.
    *
    */
  var allowENoteEOriginal: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowENoteEOriginal` property is editable.
    *
    */
  var allowENoteEOriginalMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the envelope correction feature is enabled.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowEnvelopeCorrect: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowEnvelopeCorrect` property is editable.
    *
    */
  var allowEnvelopeCorrectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies whether the account is able to
    * manage rules that [transfer ownership](https://support.docusign.com/en/guides/ndse-admin-guide-custody-transfer)
    * of envelopes within the same account.
    *
    *
    *
    *
    */
  var allowEnvelopeCustodyTransfer: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowEnvelopeCustodyTransfer` property is editable.
    *
    */
  var allowEnvelopeCustodyTransferMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies whether
    * [envelope custom fields](https://support.docusign.com/en/guides/ndse-user-guide-manage-custom-fields)
    * are enabled.
    *
    */
  var allowEnvelopeCustomFields: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowEnvelopeCustomFields` property is editable.
    *
    */
  var allowEnvelopeCustomFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, envelope publishing reporting is enabled.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowEnvelopePublishReporting: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowEnvelopePublishReporting` property is editable.
    *
    */
  var allowEnvelopePublishReportingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies whether the account has access to reports.
    *
    */
  var allowEnvelopeReporting: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowEnvelopeReporting` property is editable.
    *
    */
  var allowEnvelopeReportingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, signers are required to use Express Digital Signatures.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowExpressSignerCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowExpressSignerCertificate` property is editable.
    *
    */
  var allowExpressSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If the account plan does not include calculated fields, this setting allows an account to use them.
    *
    *
    */
  var allowExpression: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowExpression` property is editable.
    *
    */
  var allowExpressionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether resource files can be used for extended sending.
    */
  var allowExtendedSendingResourceFile: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowExtendedSendingResourceFile` property is editable.
    *
    */
  var allowExtendedSendingResourceFileMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account can
    * configure and use signature pads for their recipients.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowExternalSignaturePad: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowExternalSignaturePad` property is editable.
    *
    */
  var allowExternalSignaturePadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, IDV Level 1 is allowed. The default value is **false**.
    */
  var allowIDVLevel1: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowIDVLevel1` property is editable.
    */
  var allowIDVLevel1Metadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowIDVPlatform: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowIDVPlatform` property is editable.
    */
  var allowIDVPlatformMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account administrator can enable in-person signing.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    *
    */
  var allowInPerson: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowInPerson` property is editable.
    *
    */
  var allowInPersonMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, [Managed Stamps](https://support.docusign.com/en/guides/ndse-admin-guide-managed-stamps) are enabled.
    */
  var allowManagedStamps: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowManagedStamps` property is editable.
    *
    */
  var allowManagedStampsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the Document Markup feature is enabled.
    *
    * **Note**:  To use this feature, Document Markup must be enabled at both the account and envelope levels. Only Admin users can change this setting for at the account level.
    */
  var allowMarkup: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowMarkup` property is editable.
    *
    */
  var allowMarkupMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, account users can set their own
    * [time zone settings](https://support.docusign.com/en/articles/How-do-I-modify-time-zone-settings-for-my-account).
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowMemberTimeZone: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowMemberTimeZone` property is editable.
    *
    */
  var allowMemberTimeZoneMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account can use
    * [merge fields](https://support.docusign.com/en/guides/dfs-user-guide-merge-fields-user)
    * with DocuSign for Salesforce.
    *
    */
  var allowMergeFields: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowMergeFields` property is editable.
    *
    */
  var allowMergeFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies whether the account supports multiple brands.
    *
    */
  var allowMultipleBrandProfiles: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowMultipleBrandProfiles` property is editable.
    *
    */
  var allowMultipleBrandProfilesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, recipients can
    * upload multiple signer attachments with a single attachment.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowMultipleSignerAttachments: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowMultipleSignerAttachments` property is editable.
    *
    */
  var allowMultipleSignerAttachmentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies whether users can use
    * international numbers
    * for phone authentication.
    *
    */
  var allowNonUSPhoneAuth: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowNonUSPhoneAuth` property is editable.
    *
    */
  var allowNonUSPhoneAuthMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowOcrOfEnvelopeDocuments: js.UndefOr[String] = js.undefined
  
  var allowOcrOfEnvelopeDocumentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * [offline signing](https://support.docusign.com/articles/Offline-access-with-the-DocuSign-Mobile-App-for-iOS-iPad-iPhone-iPod-Touch)
    * is enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowOfflineSigning: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowOfflineSigning` property is editable.
    *
    */
  var allowOfflineSigningMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, senders can use OpenTrust signer certificates.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowOpenTrustSignerCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowOpenTrustSignerCertificate` property is editable.
    *
    */
  var allowOpenTrustSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether [Organization Administration](https://developers.docusign.com/orgadmin-api) is enabled for the account.
    */
  var allowOrganizations: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowOrganizations` property is editable.
    *
    */
  var allowOrganizationsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, payment processing is enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowPaymentProcessing: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowPaymentProcessing` property is editable.
    *
    */
  var allowPaymentProcessingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, signers can use personal signer certificates.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowPersonalSignerCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowPersonalSignerCertificate` property is editable.
    *
    */
  var allowPersonalSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether users can override phone authentication.
    */
  var allowPhoneAuthOverride: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowPhoneAuthOverride` property is editable.
    *
    */
  var allowPhoneAuthOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether phone authentication is enabled for the account.
    */
  var allowPhoneAuthentication: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowPhoneAuthentication` property is editable.
    *
    */
  var allowPhoneAuthenticationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign. This property returns the value **false** when listing account settings. Read only.
    */
  var allowPrivateSigningGroups: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowPrivateSigningGroups` property is editable.
    *
    */
  var allowPrivateSigningGroupsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * an account administrator can to turn on reminders
    * and expiration defaults for the account.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowReminders: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowReminders` property is editable.
    *
    */
  var allowRemindersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * resource files can be uploaded in branding.
    *
    */
  var allowResourceFileBranding: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowResourceFileBranding` property is editable.
    *
    */
  var allowResourceFileBrandingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowSMSDelivery: js.UndefOr[String] = js.undefined
  
  var allowSMSDeliveryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * account administrators can
    * specify that signers are
    * required to use SAFE-BioPharma digital signatures.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowSafeBioPharmaSignerCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSafeBioPharmaSignerCertificate` property is editable.
    *
    */
  var allowSafeBioPharmaSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether a DocuSign Signature Appliance can be used with the account.
    */
  var allowSecurityAppliance: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSecurityAppliance` property is editable.
    *
    */
  var allowSecurityApplianceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * the account admin can enable the
    * Send to Certified Delivery
    * feature on the account.
    *
    */
  var allowSendToCertifiedDelivery: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSendToCertifiedDelivery` property is editable.
    *
    */
  var allowSendToCertifiedDeliveryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * the account admin can enable the Send to Intermediary
    * feature on the account.
    *
    */
  var allowSendToIntermediary: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSendToIntermediary` property is editable.
    *
    */
  var allowSendToIntermediaryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * the account can use templates.
    *
    */
  var allowServerTemplates: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowServerTemplates` property is editable.
    *
    */
  var allowServerTemplatesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowSetEmbeddedRecipientStartURL: js.UndefOr[String] = js.undefined
  
  var allowSetEmbeddedRecipientStartURLMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * shared tabs are enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowSharedTabs: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSharedTabs` property is editable.
    *
    */
  var allowSharedTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, recipients can sign documents from the home page.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowSignDocumentFromHomePage: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSignDocumentFromHomePage` property is editable.
    *
    */
  var allowSignDocumentFromHomePageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * the account administrator can enable
    * the Sign Now feature.
    *
    */
  var allowSignNow: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSignNow` property is editable.
    *
    */
  var allowSignNowMetadata: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, Signature Stamps are enabled.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowSignatureStamps: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSignatureStamps` property is editable.
    *
    */
  var allowSignatureStampsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the recipient of an envelope sent from this account can reassign it to another person.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var allowSignerReassign: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSignerReassign` property is editable.
    *
    */
  var allowSignerReassignMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, an account administrator can override the ability of an envelope recipient to reassign it to another person.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var allowSignerReassignOverride: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSignerReassignOverride` property is editable.
    *
    */
  var allowSignerReassignOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether Signing and App Extensions are allowed.
    */
  var allowSigningExtensions: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSigningExtensions` property is editable.
    *
    */
  var allowSigningExtensionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account allows signing groups. This setting is only shown in responses that list account settings. Read only.
    */
  var allowSigningGroups: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSigningGroups` property is editable.
    *
    */
  var allowSigningGroupsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether the account supports radio buttons on tabs [Radio CustomTabType](https://developers.docusign.com/esign-soap-api/reference/Sending-Group/Tab).
    */
  var allowSigningRadioDeselect: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSigningRadioDeselect` property is editable.
    *
    */
  var allowSigningRadioDeselectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Deprecated.
    */
  var allowSocialIdLogin: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var allowSocialIdLoginMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, this user can include supplemental documents.
    */
  var allowSupplementalDocuments: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSupplementalDocuments` property is editable.
    */
  var allowSupplementalDocumentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowUsersToAccessDirectory: js.UndefOr[String] = js.undefined
  
  var allowUsersToAccessDirectoryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowValueInsights: js.UndefOr[String] = js.undefined
  
  var allowValueInsightsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var anchorPopulationScope: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `anchorPopulationScope` property is editable.
    *
    */
  var anchorPopulationScopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    *
    */
  var anchorTagVersionedPlacementEnabled: js.UndefOr[String] = js.undefined
  
  var anchorTagVersionedPlacementMetadataEnabled: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, envelope documents are included as a PDF file attachment to "signing completed" emails.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var attachCompletedEnvelope: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `attachCompletedEnvelope` property is editable.
    */
  var attachCompletedEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var authenticationCheck: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `authenticationCheck` property is editable.
    *
    */
  var authenticationCheckMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var autoNavRule: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `autoNavRule` property is editable.
    *
    */
  var autoNavRuleMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether to automatically provision a user membership in the account for accountless recipients. (Also known as Just-in-Time provisioning.)
    */
  var autoProvisionSignerAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `autoProvisionSignerAccount` property is editable.
    *
    */
  var autoProvisionSignerAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether BCC for Email Archive is enabled for the account. BCC for Email Archive allows you to set up an archive email address
    * so that a BCC copy of an envelope is sent only to that address.
    */
  var bccEmailArchive: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `bccEmailArchive` property is editable.
    *
    */
  var bccEmailArchiveMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    *
    */
  var betaSwitchConfiguration: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var betaSwitchConfigurationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The billing address for the account.
    */
  var billingAddress: js.UndefOr[/* Contains address information. */ AddressInformation] = js.undefined
  
  /**
    * Metadata that indicates whether the `billingAddress` property is editable.
    *
    */
  var billingAddressMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, this user can use the bulk send feature for the account.
    */
  var bulkSend: js.UndefOr[String] = js.undefined
  
  var bulkSendMaxCopiesInBatch: js.UndefOr[String] = js.undefined
  
  var bulkSendMaxUnprocessedEnvelopesCount: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `bulkSend` property is editable.
    *
    */
  var bulkSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, account administrators can self-brand their sending console through the DocuSign console.
    */
  var canSelfBrandSend: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `canSelfBrandSend` property is editable.
    *
    */
  var canSelfBrandSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, account administrators can self-brand their signing console through the DocuSign console.
    */
  var canSelfBrandSign: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `canSelfBrandSign` property is editable.
    *
    */
  var canSelfBrandSignMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var canUseSalesforceOAuth: js.UndefOr[String] = js.undefined
  
  var canUseSalesforceOAuthMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var captureVoiceRecording: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var captureVoiceRecordingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether to use a shorter/wider format when generating the CFR Part 11 signature image.
    */
  var cfrUseWideImage: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `cfrUseWideImage` property is editable.
    *
    */
  var cfrUseWideImageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var checkForMultipleAdminsOnAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `checkForMultipleAdminsOnAccount` property is editable.
    */
  var checkForMultipleAdminsOnAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether the signers of the envelopes from this account use a signature with a DocuSign chrome around it or not.
    */
  var chromeSignatureEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `chromeSignatureEnabled` property is editable.
    *
    */
  var chromeSignatureEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the text of comments is included in email notifications when a comment is posted.
    *
    * **Note**:  If the envelope requires additional recipient authentication, comment text is not included.
    */
  var commentEmailShowMessageText: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `commentEmailShowMessageText` property is editable.
    *
    */
  var commentEmailShowMessageTextMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true** and comments are enabled for the account, senders can disable comments for an envelope through the **Advanced Options** menu that
    * appears during the sending process.
    */
  var commentsAllowEnvelopeOverride: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `commentsAllowEnvelopeOverride` property is editable.
    *
    */
  var commentsAllowEnvelopeOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, conditional fields can be used in documents.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var conditionalFieldsEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `conditionalFieldsEnabled` property is editable.
    *
    */
  var conditionalFieldsEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var consumerDisclosureFrequency: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `consumerDisclosureFrequency` property is editable.
    *
    */
  var consumerDisclosureFrequencyMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether to enable PDF form fields to get converted to DocuSign secure fields when the document is added or uploaded to an envelope.
    */
  var convertPdfFields: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `convertPdfFields` property is editable.
    *
    */
  var convertPdfFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var dataPopulationScope: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `dataPopulationScope` property is editable.
    *
    */
  var dataPopulationScopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the mobile app distributor key is prevented from connecting for account users.
    */
  var disableMobileApp: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableMobileApp` property is editable.
    *
    */
  var disableMobileAppMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, push notifications are disabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var disableMobilePushNotifications: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableMobilePushNotifications` property is editable.
    *
    */
  var disableMobilePushNotificationsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, sending from a mobile application is disabled.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var disableMobileSending: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableMobileSending` property is editable.
    *
    */
  var disableMobileSendingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, account users cannot be logged into multiple sessions at the same time.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var disableMultipleSessions: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableMultipleSessions` property is editable.
    *
    */
  var disableMultipleSessionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var disablePurgeNotificationsForSenderMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, signers cannot view certificates of completion.
    */
  var disableSignerCertView: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableSignerCertView` property is editable.
    *
    */
  var disableSignerCertViewMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, signers cannot view envelope history.
    */
  var disableSignerHistoryView: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableSignerHistoryView` property is editable.
    *
    */
  var disableSignerHistoryViewMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the **Select Style** option is hidden from signers and they must draw their signature instead.
    */
  var disableStyleSignature: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableStyleSignature` property is editable.
    *
    */
  var disableStyleSignatureMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, signers cannot upload custom image files of their signature and initials.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var disableUploadSignature: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableUploadSignature` property is editable.
    *
    */
  var disableUploadSignatureMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the User Sharing feature is disabled for the account.
    */
  var disableUserSharing: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableUserSharing` property is editable.
    *
    */
  var disableUserSharingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether to display a Beta switch for your app.
    */
  var displayBetaSwitch: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `displayBetaSwitch` property is editable.
    *
    */
  var displayBetaSwitchMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var documentConversionRestrictions: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `documentConversionRestrictions` property is editable.
    *
    */
  var documentConversionRestrictionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Sets a document retention period, which controls the number of days that DocuSign retains documents after they have reached a completed,declined, or voided state.
    * When document retention is enabled for the account, the default value is `356` days.
    */
  var documentRetention: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `documentRetention` property is editable.
    *
    */
  var documentRetentionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true** and `documentRetention` is set, document fields and metadata are also purged after the document retention period ends.
    * The default value is **false**.
    *
    * **Note**: Only Admins can change this setting.
    */
  var documentRetentionPurgeTabs: js.UndefOr[String] = js.undefined
  
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
  var documentVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `documentVisibility` property is editable.
    *
    */
  var documentVisibilityMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies the version of the email templates used in an account. If new signing is selected in a member's Admin page, the user is updated to the newest version (1.1),
    * the minimum version of email supported for the account.
    */
  var emailTemplateVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `emailTemplateVersion` property is editable.
    *
    */
  var emailTemplateVersionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables Access Code Generator on the account.
    */
  var enableAccessCodeGenerator: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableAccessCodeGenerator` property is editable.
    *
    */
  var enableAccessCodeGeneratorMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables Advanced Payments for the account.
    */
  var enableAdvancedPayments: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableAdvancedPayments` property is editable.
    *
    */
  var enableAdvancedPaymentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables advanced PowerForms for the account.
    */
  var enableAdvancedPowerForms: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableAdvancedPowerForms` property is editable.
    *
    */
  var enableAdvancedPowerFormsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables the account to set the AutoNav rule setting, which enables a sender to override the auto-navigation setting per envelope.
    *
    * **Note**: To change this setting, you must be a SysAdmin user or `EnableAutoNavByDSAdmin must be set.
    */
  var enableAutoNav: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableAutoNav` property is editable.
    *
    */
  var enableAutoNavMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, calculated fields are enabled for the account.
    *
    * **Note**: This setting can be changed only by Admin users, and only if the account-level setting `allowExpression` is set to **true**.
    */
  var enableCalculatedFields: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableCalculatedFields` property is editable.
    *
    */
  var enableCalculatedFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether clickwraps are enabled in your app. A [clickwrap](https://developers.docusign.com/click-api/guides/)
    * is an iframe that you embed in your own website or app.
    */
  var enableClickwraps: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableClickwraps` property is editable.
    *
    */
  var enableClickwrapsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var enableCommentsHistoryDownloadInSigning: js.UndefOr[String] = js.undefined
  
  var enableCommentsHistoryDownloadInSigningMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables customer satisfaction metric tracking for the account.
    */
  var enableCustomerSatisfactionMetricTracking: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableCustomerSatisfactionMetricTracking` property is editable.
    *
    */
  var enableCustomerSatisfactionMetricTrackingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var enableDSPro: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableDSPro` property is editable.
    *
    */
  var enableDSProMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, enables the account administrator to control envelope stamping for an account (stamping the `envelopeId` in the the document margins).
    *
    * **Note**: This setting can be changed only by Admin users, and only if the account-level setting `enableEnvelopeStampingByDSAdmin` is set to **true**.
    */
  var enableEnvelopeStampingByAccountAdmin: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableEnvelopeStampingByAccountAdmin` property is editable.
    *
    */
  var enableEnvelopeStampingByAccountAdminMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables the DocuSign administrator to control envelope stamping for an account (placement of the `envelopeId`).
    */
  var enableEnvelopeStampingByDSAdmin: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableEnvelopeStampingByDSAdmin` property is editable.
    *
    */
  var enableEnvelopeStampingByDSAdminMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var enableInBrowserEditor: js.UndefOr[String] = js.undefined
  
  var enableInBrowserEditorMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, payment processing is enabled for this account.
    *
    * **Note**: This setting can be changed only by Admin users, and only if the account-level setting `allowPaymentProcessing` is set.
    */
  var enablePaymentProcessing: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enablePaymentProcessing` property is editable.
    *
    */
  var enablePaymentProcessingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, enables PowerForms for the account.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var enablePowerForm: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, enables direct PowerForms for an account. Direct PowerForms are in-session PowerForms.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enablePowerFormDirect: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enablePowerFormDirect` property is editable.
    *
    */
  var enablePowerFormDirectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Metadata that indicates whether the `enablePowerForm` property is editable.
    *
    */
  var enablePowerFormMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var enableRecipientDomainValidation: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableRecipientDomainValidation` property is editable.
    *
    */
  var enableRecipientDomainValidationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Enables direct links to envelopes in reports for administrators in the following scopes:
    * - `NoEnvelopes`
    * - `AllEnvelopes`
    * - `OnlyOwnEnvelopes`
    */
  var enableReportLinks: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableReportLinks` property is editable.
    *
    */
  var enableReportLinksMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account can use the `requireSignOnPaper` option.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var enableRequireSignOnPaper: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableRequireSignOnPaper` property is editable.
    *
    */
  var enableRequireSignOnPaperMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var enableReservedDomain: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableReservedDomain` property is editable.
    *
    */
  var enableReservedDomainMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables responsive signing.
    */
  var enableResponsiveSigning: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableResponsiveSigning` property is editable.
    *
    */
  var enableResponsiveSigningMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account can use SMS authentication.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var enableSMSAuthentication: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSMSAuthentication` property is editable.
    *
    */
  var enableSMSAuthenticationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, scheduled releases are enabled. The default value is **false**.
    */
  var enableScheduledRelease: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableScheduledRelease` property is editable.
    *
    */
  var enableScheduledReleaseMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var enableSearchUI: js.UndefOr[String] = js.undefined
  
  var enableSearchUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, this account can use the Agent recipient type.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    */
  var enableSendToAgent: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSendToAgent` property is editable.
    *
    */
  var enableSendToAgentMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, this account can use the Intermediary recipient type.
    *
    * **Note**: Only Admin users can change this setting, and only if `allowSendToIntermediary` is set.
    *
    */
  var enableSendToIntermediary: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSendToIntermediary` property is editable.
    *
    */
  var enableSendToIntermediaryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, this account can use the Editor recipient type.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var enableSendToManage: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSendToManage` property is editable.
    *
    */
  var enableSendToManageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables fonts to be set on tags for the account.
    */
  var enableSendingTagsFontSettings: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSendingTagsFontSettings` property is editable.
    *
    */
  var enableSendingTagsFontSettingsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account can define the routing
    * order of recipients for envelopes sent by using the DocuSign API.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var enableSequentialSigningAPI: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSequentialSigningAPI` property is editable.
    *
    */
  var enableSequentialSigningAPIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account can define the routing order
    * of recipients for envelopes sent by using the DocuSign application.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    */
  var enableSequentialSigningUI: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSequentialSigningUI` property is editable.
    *
    */
  var enableSequentialSigningUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, a sender can allow signers to use the sign on paper option.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var enableSignOnPaper: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSignOnPaper` property is editable.
    *
    */
  var enableSignOnPaperMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, a user can override the default default account setting for the Sign on Paper option, which specifies whether
    * signers can sign documents on paper as an option to signing electronically.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enableSignOnPaperOverride: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSignOnPaperOverride` property is editable.
    *
    */
  var enableSignOnPaperOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, Sign with Notary functionality is enabled for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enableSignWithNotary: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSignWithNotary` property is editable.
    *
    */
  var enableSignWithNotaryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, users can use the signing attachments feature to request attachments from signers.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var enableSignerAttachments: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSignerAttachments` property is editable.
    *
    */
  var enableSignerAttachmentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, enables comments for the account so that signers and recipients can make and respond to comments in documents
    * belonging to the envelopes that they are sent.
    */
  var enableSigningExtensionComments: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSigningExtensionComments` property is editable.
    *
    */
  var enableSigningExtensionCommentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables conversation functionality.
    */
  var enableSigningExtensionConversations: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSigningExtensionConversations` property is editable.
    *
    */
  var enableSigningExtensionConversationsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, switches Signing Order to On by default for new envelopes.
    */
  var enableSigningOrderSettingsForAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSigningOrderSettingsForAccount` property is editable.
    *
    */
  var enableSigningOrderSettingsForAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, blockchain-based [Smart Contracts](https://www.docusign.com/products/blockchain) are enabled. The default value is **false**.
    */
  var enableSmartContracts: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSmartContracts` property is editable.
    */
  var enableSmartContractsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Deprecated.
    */
  var enableSocialIdLogin: js.UndefOr[String] = js.undefined
  
  /**
    * Deprecated.
    */
  var enableSocialIdLoginMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables strikethrough formatting in documents.
    */
  var enableStrikeThrough: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableStrikeThrough` property is editable.
    *
    */
  var enableStrikeThroughMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPoint: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPointMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, Vaulting is enabled for the account.
    */
  var enableVaulting: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableVaulting` property is editable.
    *
    */
  var enableVaultingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var enableWitnessing: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableWitnessing` property is editable.
    *
    */
  var enableWitnessingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the template name must be unique.
    */
  var enforceTemplateNameUniqueness: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enforceTemplateNameUniqueness` property is editable.
    *
    */
  var enforceTemplateNameUniquenessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Shows the envelope integration rule for the account, which indicates whether custom admins can enable Connect for their accounts. Enumeration values are:
    *
    * - `not_allowed`
    * - `full`
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var envelopeIntegrationAllowed: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `envelopeIntegrationAllowed` property is editable.
    *
    */
  var envelopeIntegrationAllowedMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, enables Connect for an account. Note that Connect integration requires additional configuration that must be set up for it to take effect;
    * this switch is only the on/off control for the account.
    *
    * **Note**: Only Admin users can change this setting, and only when `envelopeIntegrationAllowed` is set.
    */
  var envelopeIntegrationEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `envelopeIntegrationEnabled` property is editable.
    *
    */
  var envelopeIntegrationEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, envelopes sent by this account automatically have the envelope ID stamped in the document margins, unless the sender selects not
    * to have the documents stamped.
    */
  var envelopeStampingDefaultValue: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `envelopeStampingDefaultValue` property is editable.
    *
    */
  var envelopeStampingDefaultValueMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether a member of an account can express send (without tags) or must send with tags on documents.
    */
  var expressSend: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean that specifies whether a member of an account can send templates without the tags being stripped out, even when the account is configured to let its
    * users express send only (they cannot use the tagger).
    */
  var expressSendAllowTabs: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `expressSendAllowTabs` property is editable.
    *
    */
  var expressSendAllowTabsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Metadata that indicates whether the `expressSend` property is editable.
    *
    */
  var expressSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * A list of external document sources such as DropBox and OneDrive.
    */
  var externalDocumentSources: js.UndefOr[
    /* A complex object specifying the external document sources. */ ExternalDocumentSources
  ] = js.undefined
  
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
  var externalSignaturePadType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `externalSignaturePadType` property is editable.
    *
    */
  var externalSignaturePadTypeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, fax delivery to recipients is allowed for the account.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var faxOutEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `faxOutEnabled` property is editable.
    *
    */
  var faxOutEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, HTML used to implement [Guided Forms](https://www.docusign.com/products/guided-forms) is enabled for the account.
    */
  var guidedFormsHtmlAllowed: js.UndefOr[String] = js.undefined
  
  var guidedFormsHtmlAllowedMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether to hide the account address in the Certificate of Completion.
    */
  var hideAccountAddressInCoC: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `hideAccountAddressInCoC` property is editable.
    *
    */
  var hideAccountAddressInCoCMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether to hide the pricing functionality for an account.
    */
  var hidePricing: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `hidePricing` property is editable.
    *
    */
  var hidePricingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * A list of ID check configuration objects.
    */
  var idCheckConfigurations: js.UndefOr[
    js.Array[/* A complex object specifying ID check configuration. */ IdCheckConfiguration]
  ] = js.undefined
  
  /**
    * Determines when a user's authentication with the account expires. Valid values are:
    *
    * - `always`: Users are required to authenticate each time.
    * - `variable`: If the authentication for a user is valid and falls within the value for the `idCheckExpireDays` property, the user is not required to authenticate again.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var idCheckExpire: js.UndefOr[String] = js.undefined
  
  /**
    * The number of days before user authentication credentials expire. A value of `0` specifies that users must re-authenticate for each new session.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var idCheckExpireDays: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `idCheckExpireDays` property is editable.
    *
    */
  var idCheckExpireDaysMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Metadata that indicates whether the `idCheckExpire` property is editable.
    *
    */
  var idCheckExpireMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The number of minutes before user authentication credentials expire.
    */
  var idCheckExpireMinutes: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `idCheckExpireMinutes` property is editable.
    *
    */
  var idCheckExpireMinutesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Indicates if authentication is configured for the account. Valid values are:
    *
    * - `always`: Authentication checks are performed on every envelope.
    * - `never`: Authentication checks are not performed on any envelopes.
    * - `optional`: Authentication is configurable per envelope.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var idCheckRequired: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `idCheckRequired` property is editable.
    *
    */
  var idCheckRequiredMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var identityVerification: js.UndefOr[
    js.Array[
      /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
    ]
  ] = js.undefined
  
  /**
    * Metadata that indicates whether the `identityVerification` property is editable.
    *
    */
  var identityVerificationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var ignoreErrorIfAnchorTabNotFound: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var ignoreErrorIfAnchorTabNotFoundMetadataEnabled: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * A text field containing the question that an in-person signing host uses to collect personal information from the recipient.
    * The recipient's response to this question is saved and can be viewed in the certificate associated with the envelope.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var inPersonIDCheckQuestion: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `inPersonIDCheckQuestion` property is editable.
    *
    */
  var inPersonIDCheckQuestionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, in-person signing is enabled for the account.
    */
  var inPersonSigningEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `inPersonSigningEnabled` property is editable.
    *
    */
  var inPersonSigningEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the account can send in-session (embedded) envelopes.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var inSessionEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `inSessionEnabled` property is editable.
    *
    */
  var inSessionEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, emails are not sent to the in-session (embedded) recipients on an envelope.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var inSessionSuppressEmails: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `inSessionSuppressEmails` property is editable.
    *
    */
  var inSessionSuppressEmailsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The maximum number of custom stamps.
    */
  var maxNumberOfCustomStamps: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of signing groups allowed on the account. The default value is `50`. This setting is only shown in responses that list account settings.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var maximumSigningGroups: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `maximumSigningGroups` property is editable.
    *
    */
  var maximumSigningGroupsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The maximum number of users per signing group. The default value is `50`. This setting is only shown in responses that list account settings.
    *
    * **Note**: Only SysAdmin users can change this setting.
    */
  var maximumUsersPerSigningGroup: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `maximumUsersPerSigningGroup` property is editable.
    *
    */
  var maximumUsersPerSigningGroupMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The number of minutes of inactivity before a mobile user is automatically logged out of the system. Valid values are `1` to `120` minutes. The default value is `20` minutes.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var mobileSessionTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `mobileSessionTimeout` property is editable.
    *
    */
  var mobileSessionTimeoutMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The number of active custom stamps associated with the account. DocuSign calculates this number automatically. This property is only visible to the DocuSign account manager.
    */
  var numberOfActiveCustomStamps: js.UndefOr[String] = js.undefined
  
  /**
    * Boolean that specifies whether to opt in for Signing v02 on Mobile Devices functionality.
    */
  var optInMobileSigningV02: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `optInMobileSigningV02` property is editable.
    *
    */
  var optInMobileSigningV02Metadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that allows envelope senders to opt out of the recipient signing auto-navigation feature and opt out of updating tab font color.
    */
  var optOutAutoNavTextAndTabColorUpdates: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `optOutAutoNavTextAndTabColorUpdates` property is editable.
    *
    */
  var optOutAutoNavTextAndTabColorUpdatesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether to allow envelope senders to opt out of using the new platform seal.
    */
  var optOutNewPlatformSeal: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `optOutNewPlatformSealPlatform` property is editable.
    *
    */
  var optOutNewPlatformSealPlatformMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, senders can allow recipients to provide a phone number for the Phone Authentication process.
    *
    * **Note**: Only Admin users can change this setting.
    */
  var phoneAuthRecipientMayProvidePhoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `phoneAuthRecipientMayProvidePhoneNumber` property is editable.
    *
    */
  var phoneAuthRecipientMayProvidePhoneNumberMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var pkiSignDownloadedPDFDocs: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `pkiSignDownloadedPDFDocs` property is editable.
    *
    */
  var pkiSignDownloadedPDFDocsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, recipients receiving envelopes from this account can override auto-navigation functionality.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var recipientSigningAutoNavigationControl: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `recipientSigningAutoNavigationControl` property is editable.
    *
    */
  var recipientSigningAutoNavigationControlMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * recipients receiving envelopes from this account
    * can sign offline.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var recipientsCanSignOffline: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `recipientsCanSignOffline` property is editable.
    *
    */
  var recipientsCanSignOfflineMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * recipients are required
    * to use a 21 CFR part 11-compliant signing experience.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var require21CFRpt11Compliance: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `require21CFRpt11Compliance` property is editable.
    *
    */
  var require21CFRpt11ComplianceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, signers who decline to sign an envelope sent from this account
    * are required to provide a reason for declining.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var requireDeclineReason: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `requireDeclineReason` property is editable.
    *
    */
  var requireDeclineReasonMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account requires external management of users.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var requireExternalUserManagement: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `requireExternalUserManagement` property is editable.
    *
    */
  var requireExternalUserManagementMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var requireSignerCertificateType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `requireSignerCertificateType` property is editable.
    *
    */
  var requireSignerCertificateTypeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The RSA account name.
    *
    * **Note**:
    * Only Admin users can change this setting. Modifying this value may disrupt
    * your ID Check capability.
    * Ensure you have the correct value before changing it.
    *
    */
  var rsaVeridAccountName: js.UndefOr[String] = js.undefined
  
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
  var rsaVeridPassword: js.UndefOr[String] = js.undefined
  
  /**
    * The RSA rule set used with the account.
    *
    * **Note**:
    * Only Admin users can change this setting. Modifying this value may disrupt
    * your ID Check capability.
    * Ensure you have the correct value before changing it.
    *
    */
  var rsaVeridRuleset: js.UndefOr[String] = js.undefined
  
  /**
    * The user ID for the RSA account.
    *
    * **Note**:
    * Only Admin users can change this setting. Modifying this value may disrupt
    * your ID Check capability.
    * Ensure you have the correct value before changing it.
    *
    */
  var rsaVeridUserId: js.UndefOr[String] = js.undefined
  
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
  var selfSignedRecipientEmailDocument: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `selfSignedRecipientEmailDocument` property is editable.
    *
    */
  var selfSignedRecipientEmailDocumentMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the `selfSignedRecipientEmailDocument` user setting
    * can be set for an individual user.
    * The user setting overrides the account setting.
    *
    * **Note**: Only Admin users can change this account setting.
    *
    */
  var selfSignedRecipientEmailDocumentUserOverride: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `selfSignedRecipientEmailDocumentUserOverride` property is editable.
    *
    */
  var selfSignedRecipientEmailDocumentUserOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When true,
    * the account can use the
    * certified deliveries recipient type.
    *
    */
  var sendToCertifiedDeliveryEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `sendToCertifiedDeliveryEnabled` property is editable.
    *
    */
  var sendToCertifiedDeliveryEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, a signer can draw their signature in each
    * location where a sign or initial tab exists. This functionality
    * is typically used for mobile signing.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var senderCanSignInEachLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `senderCanSignInEachLocation` property is editable.
    *
    */
  var senderCanSignInEachLocationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, a sender who is also a recipient of an envelope
    * must follow the authentication requirements for the envelope.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var senderMustAuthenticateSigning: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `senderMustAuthenticateSigning` property is editable.
    *
    */
  var senderMustAuthenticateSigningMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var sendingTagsFontColor: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `sendingTagsFontColor` property is editable.
    *
    */
  var sendingTagsFontColorMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var sendingTagsFontName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `sendingTagsFontName` property is editable.
    *
    */
  var sendingTagsFontNameMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var sendingTagsFontSize: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `sendingTagsFontSize` property is editable.
    *
    */
  var sendingTagsFontSizeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The amount of idle activity time, in minutes, before a user is automatically logged out of the system. The minimum setting is 20 minutes and the maximum setting is 120 minutes.
    *
    */
  var sessionTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `sessionTimeout` property is editable.
    *
    */
  var sessionTimeoutMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, senders can set the email language to use for
    * each recipient.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var setRecipEmailLang: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `setRecipEmailLang` property is editable.
    *
    */
  var setRecipEmailLangMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var setRecipSignLang: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `setRecipSignLang` property is editable.
    *
    */
  var setRecipSignLangMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether an account can use Shared Template Folders.
    */
  var sharedTemplateFolders: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `sharedTemplateFolders` property is editable.
    *
    */
  var sharedTemplateFoldersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether complete dialogs are displayed directly within an application in embedded signing sessions.
    */
  var showCompleteDialogInEmbeddedSession: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `showCompleteDialogInEmbeddedSession` property is editable.
    *
    */
  var showCompleteDialogInEmbeddedSessionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, Conditional Routing options display to senders during the sending experience.
    */
  var showConditionalRoutingOnSend: js.UndefOr[String] = js.undefined
  
  var showConditionalRoutingOnSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether conditional field options are initially displayed (before a user makes entries).
    */
  var showInitialConditionalFields: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `showInitialConditionalFields` property is editable.
    *
    */
  var showInitialConditionalFieldsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether localized watermarks are displayed.
    */
  var showLocalizedWatermarks: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `showLocalizedWatermarks` property is editable.
    *
    */
  var showLocalizedWatermarksMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * show tutorials.
    *
    */
  var showTutorials: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `showTutorials` property is editable.
    *
    */
  var showTutorialsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var signDateFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signDateFormat` property is editable.
    *
    */
  var signDateFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var signTimeFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signTimeFormat` property is editable.
    *
    */
  var signTimeFormatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * the time shows the AM or PM indicator.
    *
    */
  var signTimeShowAmPm: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signTimeShowAmPm` property is editable.
    *
    */
  var signTimeShowAmPmMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Names of electronic or digital signature providers that can be used.
    */
  var signatureProviders: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Metadata that indicates whether the `signatureProviders` property is editable.
    *
    */
  var signatureProvidersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * the Certificate of Completion is included in the PDF of the envelope documents
    * when it is downloaded.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerAttachCertificateToEnvelopePDF: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerAttachCertificateToEnvelopePDF` property is editable.
    *
    */
  var signerAttachCertificateToEnvelopePDFMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, signer attachments are added to the parent document
    * that contains the attachment.
    * The default behavior creates
    * a new document in the envelope for every signer attachment.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerAttachConcat: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerAttachConcat` property is editable.
    *
    */
  var signerAttachConcatMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * a signer can create a DocuSign account
    * after signing.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerCanCreateAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerCanCreateAccount` property is editable.
    *
    */
  var signerCanCreateAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, recipients can sign on a mobile device.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerCanSignOnMobile: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerCanSignOnMobile` property is editable.
    *
    */
  var signerCanSignOnMobileMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, an "envelope complete" email is sent to an in-session
    * (embedded) or offline signer after DocuSign processes the envelope
    * if in-session emails are not suppressed.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerInSessionUseEnvelopeCompleteEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerInSessionUseEnvelopeCompleteEmail` property is editable.
    *
    */
  var signerInSessionUseEnvelopeCompleteEmailMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var signerLoginRequirements: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerLoginRequirements` property is editable.
    *
    */
  var signerLoginRequirementsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, senders can only send an envelope to a recipient
    * that has a DocuSign account.
    *
    * **Note**: Only Account Administrators can change this setting.
    *
    */
  var signerMustHaveAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerMustHaveAccount` property is editable.
    *
    */
  var signerMustHaveAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * signers must log in to the DocuSign platform to sign an envelope.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerMustLoginToSign: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerMustLoginToSign` property is editable.
    *
    */
  var signerMustLoginToSignMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the initial values of all SecureFields are written
    * to the document when it is sent.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerShowSecureFieldInitialValues: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerShowSecureFieldInitialValues` property is editable.
    *
    */
  var signerShowSecureFieldInitialValuesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The number of minutes
    * that a signing session stays
    * alive without any activity.
    *
    */
  var signingSessionTimeout: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signingSessionTimeout` property is editable.
    *
    */
  var signingSessionTimeoutMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    *
    */
  var signingUiVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var signingUiVersionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, simplified sending is enabled for the account. The default value is **false**.
    */
  var simplifiedSendingEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `simplifiedSendingEnabled` property is editable.
    *
    */
  var simplifiedSendingEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * single sign-on (SSO) is enabled.
    *
    */
  var singleSignOnEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `singleSignOnEnabled` property is editable.
    *
    */
  var singleSignOnEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * do not require authentication prompt for viewing completed envelopes
    *
    */
  var skipAuthCompletedEnvelopes: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `skipAuthCompletedEnvelopes` property is editable.
    *
    */
  var skipAuthCompletedEnvelopesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * recipients can use
    * [social ids](https://support.docusign.com/guides/signer-authentication)
    * when signing
    *
    */
  var socialIdRecipAuth: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `socialIdRecipAuth` property is editable.
    *
    */
  var socialIdRecipAuthMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, senders can specify the visibility of the documents in an envelope at the recipient level.
    *
    */
  var specifyDocumentVisibility: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `specifyDocumentVisibility` property is editable.
    *
    */
  var specifyDocumentVisibilityMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * when initiating correction of an in-flight envelope
    * the sender starts in advanced correct mode.
    *
    */
  var startInAdvancedCorrect: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `startInAdvancedCorrect` property is editable.
    *
    */
  var startInAdvancedCorrectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, account users must accept supplemental documents when signing.
    */
  var supplementalDocumentsMustAccept: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustAccept` property is editable.
    *
    */
  var supplementalDocumentsMustAcceptMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, account users must both view and accept supplemental documents when signing.
    */
  var supplementalDocumentsMustRead: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustRead` property is editable.
    *
    */
  var supplementalDocumentsMustReadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, account users must view supplemental documents when signing.
    */
  var supplementalDocumentsMustView: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `supplementalDocumentsMustView` property is editable.
    *
    */
  var supplementalDocumentsMustViewMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether or not API calls require a x509 cert in the header of the call.
    */
  var suppressCertificateEnforcement: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `suppressCertificateEnforcement` property is editable.
    *
    */
  var suppressCertificateEnforcementMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Account-wide tab settings.
    */
  var tabAccountSettings: js.UndefOr[TabAccountSettings] = js.undefined
  
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
  var timezoneOffsetAPI: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `timezoneOffsetAPI` property is editable.
    *
    */
  var timezoneOffsetAPIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
  var timezoneOffsetUI: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `timezoneOffsetUI` property is editable.
    *
    */
  var timezoneOffsetUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    *
    */
  var universalSignatureOptIn: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    *
    */
  var useAccountLevelEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `useAccountLevelEmail` property is editable.
    *
    */
  var useAccountLevelEmailMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**, the account uses an Electronic Record and
    * Signature Disclosure Statement.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var useConsumerDisclosure: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `useConsumerDisclosure` property is editable.
    *
    */
  var useConsumerDisclosureMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
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
    * Reserved for DocuSign.
    *
    */
  var useDerivedKeys: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `useDerivedKeys` property is editable.
    *
    */
  var useDerivedKeysMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * signers
    * are required to use Express Digital Signatures.
    *
    */
  var useDocuSignExpressSignerCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `useDocuSignExpressSignerCertificate` property is editable.
    *
    */
  var useDocuSignExpressSignerCertificateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var useMultiAppGroupsData: js.UndefOr[String] = js.undefined
  
  var useMultiAppGroupsDataMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    *
    */
  var useNewBlobForPdf: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `useNewBlobForPdf` property is editable.
    *
    */
  var useNewBlobForPdfMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * signers are
    * required to use SAFE digital signatures.
    *
    */
  var useSAFESignerCertificates: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `useSAFESignerCertificates` property is editable.
    *
    */
  var useSAFESignerCertificatesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether the account uses the digital signature provider platform to eSign.
    */
  var useSignatureProviderPlatform: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `useSignatureProviderPlatform` property is editable.
    *
    */
  var useSignatureProviderPlatformMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When set to **true**,
    * the account can use the API.
    *
    * **Note**: Only SysAdmin users can change this setting.
    *
    */
  var usesAPI: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `usesAPI` property is editable.
    *
    */
  var usesAPIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Boolean that specifies whether validations on recipient email domains are allowed.
    */
  var validationsAllowed: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `validationsAllowed` property is editable.
    *
    */
  var validationsAllowedMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Valid values are:
    *
    * - `docusign`
    * - `account`
    *
    */
  var validationsBrand: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `validationsBrand` property is editable.
    *
    */
  var validationsBrandMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Valid values are:
    *
    * - `none`
    * - `monthly`
    *
    */
  var validationsCadence: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `validationsCadence` property is editable.
    *
    */
  var validationsCadenceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * enables validations.
    *
    */
  var validationsEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `validationsEnabled` property is editable.
    *
    */
  var validationsEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Valid values are:
    *
    * - `none`
    * - `life_sciences_part11`
    *
    */
  var validationsReport: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `validationsReport` property is editable.
    *
    */
  var validationsReportMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * the
    * [watermark feature](https://support.docusign.com/en/articles/How-do-I-manage-the-watermark-for-In-Process-envelopes-sent-from-my-account)
    * is enabled for the account.
    *
    */
  var waterMarkEnabled: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `waterMarkEnabled` property is editable.
    *
    */
  var waterMarkEnabledMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * If **true**,
    * sent reminders are included in the envelope history.
    */
  var writeReminderToEnvelopeHistory: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `writeReminderToEnvelopeHistory` property is editable.
    *
    */
  var writeReminderToEnvelopeHistoryMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The smallest screen allowed.
    */
  var wurflMinAllowableScreenSize: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `wurflMinAllowableScreenSize` property is editable.
    *
    */
  var wurflMinAllowableScreenSizeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
}
object AccountSettingsInformation {
  
  inline def apply(): AccountSettingsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettingsInformation]
  }
  
  extension [Self <: AccountSettingsInformation](x: Self) {
    
    inline def setAccessCodeFormat(
      value: /* object specifying the format of the string provided to a recipient in order to access an envelope. */ AccessCodeFormat
    ): Self = StObject.set(x, "accessCodeFormat", value.asInstanceOf[js.Any])
    
    inline def setAccessCodeFormatUndefined: Self = StObject.set(x, "accessCodeFormat", js.undefined)
    
    inline def setAccountDateTimeFormat(value: String): Self = StObject.set(x, "accountDateTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setAccountDateTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "accountDateTimeFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setAccountDateTimeFormatMetadataUndefined: Self = StObject.set(x, "accountDateTimeFormatMetadata", js.undefined)
    
    inline def setAccountDateTimeFormatUndefined: Self = StObject.set(x, "accountDateTimeFormat", js.undefined)
    
    inline def setAccountName(value: String): Self = StObject.set(x, "accountName", value.asInstanceOf[js.Any])
    
    inline def setAccountNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "accountNameMetadata", value.asInstanceOf[js.Any])
    
    inline def setAccountNameMetadataUndefined: Self = StObject.set(x, "accountNameMetadata", js.undefined)
    
    inline def setAccountNameUndefined: Self = StObject.set(x, "accountName", js.undefined)
    
    inline def setAccountNotification(
      value: /* A complex element that specifies notifications (expirations and reminders) for the envelope. */ AccountNotification
    ): Self = StObject.set(x, "accountNotification", value.asInstanceOf[js.Any])
    
    inline def setAccountNotificationUndefined: Self = StObject.set(x, "accountNotification", js.undefined)
    
    inline def setAccountUISettings(
      value: /* An object that defines the options that are available to non-administrators in the UI. */ AccountUISettings
    ): Self = StObject.set(x, "accountUISettings", value.asInstanceOf[js.Any])
    
    inline def setAccountUISettingsUndefined: Self = StObject.set(x, "accountUISettings", js.undefined)
    
    inline def setAdoptSigConfig(value: String): Self = StObject.set(x, "adoptSigConfig", value.asInstanceOf[js.Any])
    
    inline def setAdoptSigConfigMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "adoptSigConfigMetadata", value.asInstanceOf[js.Any])
    
    inline def setAdoptSigConfigMetadataUndefined: Self = StObject.set(x, "adoptSigConfigMetadata", js.undefined)
    
    inline def setAdoptSigConfigUndefined: Self = StObject.set(x, "adoptSigConfig", js.undefined)
    
    inline def setAdvancedCorrect(value: String): Self = StObject.set(x, "advancedCorrect", value.asInstanceOf[js.Any])
    
    inline def setAdvancedCorrectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "advancedCorrectMetadata", value.asInstanceOf[js.Any])
    
    inline def setAdvancedCorrectMetadataUndefined: Self = StObject.set(x, "advancedCorrectMetadata", js.undefined)
    
    inline def setAdvancedCorrectUndefined: Self = StObject.set(x, "advancedCorrect", js.undefined)
    
    inline def setAllowAccessCodeFormat(value: String): Self = StObject.set(x, "allowAccessCodeFormat", value.asInstanceOf[js.Any])
    
    inline def setAllowAccessCodeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAccessCodeFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAccessCodeFormatMetadataUndefined: Self = StObject.set(x, "allowAccessCodeFormatMetadata", js.undefined)
    
    inline def setAllowAccessCodeFormatUndefined: Self = StObject.set(x, "allowAccessCodeFormat", js.undefined)
    
    inline def setAllowAccountManagementGranular(value: String): Self = StObject.set(x, "allowAccountManagementGranular", value.asInstanceOf[js.Any])
    
    inline def setAllowAccountManagementGranularMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAccountManagementGranularMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAccountManagementGranularMetadataUndefined: Self = StObject.set(x, "allowAccountManagementGranularMetadata", js.undefined)
    
    inline def setAllowAccountManagementGranularUndefined: Self = StObject.set(x, "allowAccountManagementGranular", js.undefined)
    
    inline def setAllowAccountMemberNameChange(value: String): Self = StObject.set(x, "allowAccountMemberNameChange", value.asInstanceOf[js.Any])
    
    inline def setAllowAccountMemberNameChangeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAccountMemberNameChangeMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAccountMemberNameChangeMetadataUndefined: Self = StObject.set(x, "allowAccountMemberNameChangeMetadata", js.undefined)
    
    inline def setAllowAccountMemberNameChangeUndefined: Self = StObject.set(x, "allowAccountMemberNameChange", js.undefined)
    
    inline def setAllowAdvancedRecipientRoutingConditional(value: String): Self = StObject.set(x, "allowAdvancedRecipientRoutingConditional", value.asInstanceOf[js.Any])
    
    inline def setAllowAdvancedRecipientRoutingConditionalMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAdvancedRecipientRoutingConditionalMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAdvancedRecipientRoutingConditionalMetadataUndefined: Self = StObject.set(x, "allowAdvancedRecipientRoutingConditionalMetadata", js.undefined)
    
    inline def setAllowAdvancedRecipientRoutingConditionalUndefined: Self = StObject.set(x, "allowAdvancedRecipientRoutingConditional", js.undefined)
    
    inline def setAllowAgentNameEmailEdit(value: String): Self = StObject.set(x, "allowAgentNameEmailEdit", value.asInstanceOf[js.Any])
    
    inline def setAllowAgentNameEmailEditMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAgentNameEmailEditMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAgentNameEmailEditMetadataUndefined: Self = StObject.set(x, "allowAgentNameEmailEditMetadata", js.undefined)
    
    inline def setAllowAgentNameEmailEditUndefined: Self = StObject.set(x, "allowAgentNameEmailEdit", js.undefined)
    
    inline def setAllowAgreementActions(value: String): Self = StObject.set(x, "allowAgreementActions", value.asInstanceOf[js.Any])
    
    inline def setAllowAgreementActionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAgreementActionsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAgreementActionsMetadataUndefined: Self = StObject.set(x, "allowAgreementActionsMetadata", js.undefined)
    
    inline def setAllowAgreementActionsUndefined: Self = StObject.set(x, "allowAgreementActions", js.undefined)
    
    inline def setAllowAutoNavSettings(value: String): Self = StObject.set(x, "allowAutoNavSettings", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoNavSettingsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAutoNavSettingsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoNavSettingsMetadataUndefined: Self = StObject.set(x, "allowAutoNavSettingsMetadata", js.undefined)
    
    inline def setAllowAutoNavSettingsUndefined: Self = StObject.set(x, "allowAutoNavSettings", js.undefined)
    
    inline def setAllowAutoTagging(value: String): Self = StObject.set(x, "allowAutoTagging", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoTaggingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAutoTaggingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoTaggingMetadataUndefined: Self = StObject.set(x, "allowAutoTaggingMetadata", js.undefined)
    
    inline def setAllowAutoTaggingUndefined: Self = StObject.set(x, "allowAutoTagging", js.undefined)
    
    inline def setAllowBulkSend(value: String): Self = StObject.set(x, "allowBulkSend", value.asInstanceOf[js.Any])
    
    inline def setAllowBulkSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowBulkSendMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowBulkSendMetadataUndefined: Self = StObject.set(x, "allowBulkSendMetadata", js.undefined)
    
    inline def setAllowBulkSendUndefined: Self = StObject.set(x, "allowBulkSend", js.undefined)
    
    inline def setAllowCDWithdraw(value: String): Self = StObject.set(x, "allowCDWithdraw", value.asInstanceOf[js.Any])
    
    inline def setAllowCDWithdrawMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowCDWithdrawMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowCDWithdrawMetadataUndefined: Self = StObject.set(x, "allowCDWithdrawMetadata", js.undefined)
    
    inline def setAllowCDWithdrawUndefined: Self = StObject.set(x, "allowCDWithdraw", js.undefined)
    
    inline def setAllowConnectHttpListenerConfigs(value: String): Self = StObject.set(x, "allowConnectHttpListenerConfigs", value.asInstanceOf[js.Any])
    
    inline def setAllowConnectHttpListenerConfigsUndefined: Self = StObject.set(x, "allowConnectHttpListenerConfigs", js.undefined)
    
    inline def setAllowConnectSendFinishLater(value: String): Self = StObject.set(x, "allowConnectSendFinishLater", value.asInstanceOf[js.Any])
    
    inline def setAllowConnectSendFinishLaterMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowConnectSendFinishLaterMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowConnectSendFinishLaterMetadataUndefined: Self = StObject.set(x, "allowConnectSendFinishLaterMetadata", js.undefined)
    
    inline def setAllowConnectSendFinishLaterUndefined: Self = StObject.set(x, "allowConnectSendFinishLater", js.undefined)
    
    inline def setAllowConsumerDisclosureOverride(value: String): Self = StObject.set(x, "allowConsumerDisclosureOverride", value.asInstanceOf[js.Any])
    
    inline def setAllowConsumerDisclosureOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowConsumerDisclosureOverrideMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowConsumerDisclosureOverrideMetadataUndefined: Self = StObject.set(x, "allowConsumerDisclosureOverrideMetadata", js.undefined)
    
    inline def setAllowConsumerDisclosureOverrideUndefined: Self = StObject.set(x, "allowConsumerDisclosureOverride", js.undefined)
    
    inline def setAllowDataDownload(value: String): Self = StObject.set(x, "allowDataDownload", value.asInstanceOf[js.Any])
    
    inline def setAllowDataDownloadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowDataDownloadMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowDataDownloadMetadataUndefined: Self = StObject.set(x, "allowDataDownloadMetadata", js.undefined)
    
    inline def setAllowDataDownloadUndefined: Self = StObject.set(x, "allowDataDownload", js.undefined)
    
    inline def setAllowDocumentDisclosures(value: String): Self = StObject.set(x, "allowDocumentDisclosures", value.asInstanceOf[js.Any])
    
    inline def setAllowDocumentDisclosuresMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowDocumentDisclosuresMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowDocumentDisclosuresMetadataUndefined: Self = StObject.set(x, "allowDocumentDisclosuresMetadata", js.undefined)
    
    inline def setAllowDocumentDisclosuresUndefined: Self = StObject.set(x, "allowDocumentDisclosures", js.undefined)
    
    inline def setAllowDocumentVisibility(value: String): Self = StObject.set(x, "allowDocumentVisibility", value.asInstanceOf[js.Any])
    
    inline def setAllowDocumentVisibilityMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowDocumentVisibilityMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowDocumentVisibilityMetadataUndefined: Self = StObject.set(x, "allowDocumentVisibilityMetadata", js.undefined)
    
    inline def setAllowDocumentVisibilityUndefined: Self = StObject.set(x, "allowDocumentVisibility", js.undefined)
    
    inline def setAllowDocumentsOnSignedEnvelopes(value: String): Self = StObject.set(x, "allowDocumentsOnSignedEnvelopes", value.asInstanceOf[js.Any])
    
    inline def setAllowDocumentsOnSignedEnvelopesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowDocumentsOnSignedEnvelopesMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowDocumentsOnSignedEnvelopesMetadataUndefined: Self = StObject.set(x, "allowDocumentsOnSignedEnvelopesMetadata", js.undefined)
    
    inline def setAllowDocumentsOnSignedEnvelopesUndefined: Self = StObject.set(x, "allowDocumentsOnSignedEnvelopes", js.undefined)
    
    inline def setAllowEHankoStamps(value: String): Self = StObject.set(x, "allowEHankoStamps", value.asInstanceOf[js.Any])
    
    inline def setAllowEHankoStampsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEHankoStampsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowEHankoStampsMetadataUndefined: Self = StObject.set(x, "allowEHankoStampsMetadata", js.undefined)
    
    inline def setAllowEHankoStampsUndefined: Self = StObject.set(x, "allowEHankoStamps", js.undefined)
    
    inline def setAllowENoteEOriginal(value: String): Self = StObject.set(x, "allowENoteEOriginal", value.asInstanceOf[js.Any])
    
    inline def setAllowENoteEOriginalMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowENoteEOriginalMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowENoteEOriginalMetadataUndefined: Self = StObject.set(x, "allowENoteEOriginalMetadata", js.undefined)
    
    inline def setAllowENoteEOriginalUndefined: Self = StObject.set(x, "allowENoteEOriginal", js.undefined)
    
    inline def setAllowEnvelopeCorrect(value: String): Self = StObject.set(x, "allowEnvelopeCorrect", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeCorrectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEnvelopeCorrectMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeCorrectMetadataUndefined: Self = StObject.set(x, "allowEnvelopeCorrectMetadata", js.undefined)
    
    inline def setAllowEnvelopeCorrectUndefined: Self = StObject.set(x, "allowEnvelopeCorrect", js.undefined)
    
    inline def setAllowEnvelopeCustodyTransfer(value: String): Self = StObject.set(x, "allowEnvelopeCustodyTransfer", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeCustodyTransferMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEnvelopeCustodyTransferMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeCustodyTransferMetadataUndefined: Self = StObject.set(x, "allowEnvelopeCustodyTransferMetadata", js.undefined)
    
    inline def setAllowEnvelopeCustodyTransferUndefined: Self = StObject.set(x, "allowEnvelopeCustodyTransfer", js.undefined)
    
    inline def setAllowEnvelopeCustomFields(value: String): Self = StObject.set(x, "allowEnvelopeCustomFields", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeCustomFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEnvelopeCustomFieldsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeCustomFieldsMetadataUndefined: Self = StObject.set(x, "allowEnvelopeCustomFieldsMetadata", js.undefined)
    
    inline def setAllowEnvelopeCustomFieldsUndefined: Self = StObject.set(x, "allowEnvelopeCustomFields", js.undefined)
    
    inline def setAllowEnvelopePublishReporting(value: String): Self = StObject.set(x, "allowEnvelopePublishReporting", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopePublishReportingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEnvelopePublishReportingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopePublishReportingMetadataUndefined: Self = StObject.set(x, "allowEnvelopePublishReportingMetadata", js.undefined)
    
    inline def setAllowEnvelopePublishReportingUndefined: Self = StObject.set(x, "allowEnvelopePublishReporting", js.undefined)
    
    inline def setAllowEnvelopeReporting(value: String): Self = StObject.set(x, "allowEnvelopeReporting", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeReportingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEnvelopeReportingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeReportingMetadataUndefined: Self = StObject.set(x, "allowEnvelopeReportingMetadata", js.undefined)
    
    inline def setAllowEnvelopeReportingUndefined: Self = StObject.set(x, "allowEnvelopeReporting", js.undefined)
    
    inline def setAllowExpressSignerCertificate(value: String): Self = StObject.set(x, "allowExpressSignerCertificate", value.asInstanceOf[js.Any])
    
    inline def setAllowExpressSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowExpressSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowExpressSignerCertificateMetadataUndefined: Self = StObject.set(x, "allowExpressSignerCertificateMetadata", js.undefined)
    
    inline def setAllowExpressSignerCertificateUndefined: Self = StObject.set(x, "allowExpressSignerCertificate", js.undefined)
    
    inline def setAllowExpression(value: String): Self = StObject.set(x, "allowExpression", value.asInstanceOf[js.Any])
    
    inline def setAllowExpressionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowExpressionMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowExpressionMetadataUndefined: Self = StObject.set(x, "allowExpressionMetadata", js.undefined)
    
    inline def setAllowExpressionUndefined: Self = StObject.set(x, "allowExpression", js.undefined)
    
    inline def setAllowExtendedSendingResourceFile(value: String): Self = StObject.set(x, "allowExtendedSendingResourceFile", value.asInstanceOf[js.Any])
    
    inline def setAllowExtendedSendingResourceFileMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowExtendedSendingResourceFileMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowExtendedSendingResourceFileMetadataUndefined: Self = StObject.set(x, "allowExtendedSendingResourceFileMetadata", js.undefined)
    
    inline def setAllowExtendedSendingResourceFileUndefined: Self = StObject.set(x, "allowExtendedSendingResourceFile", js.undefined)
    
    inline def setAllowExternalSignaturePad(value: String): Self = StObject.set(x, "allowExternalSignaturePad", value.asInstanceOf[js.Any])
    
    inline def setAllowExternalSignaturePadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowExternalSignaturePadMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowExternalSignaturePadMetadataUndefined: Self = StObject.set(x, "allowExternalSignaturePadMetadata", js.undefined)
    
    inline def setAllowExternalSignaturePadUndefined: Self = StObject.set(x, "allowExternalSignaturePad", js.undefined)
    
    inline def setAllowIDVLevel1(value: String): Self = StObject.set(x, "allowIDVLevel1", value.asInstanceOf[js.Any])
    
    inline def setAllowIDVLevel1Metadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowIDVLevel1Metadata", value.asInstanceOf[js.Any])
    
    inline def setAllowIDVLevel1MetadataUndefined: Self = StObject.set(x, "allowIDVLevel1Metadata", js.undefined)
    
    inline def setAllowIDVLevel1Undefined: Self = StObject.set(x, "allowIDVLevel1", js.undefined)
    
    inline def setAllowIDVPlatform(value: String): Self = StObject.set(x, "allowIDVPlatform", value.asInstanceOf[js.Any])
    
    inline def setAllowIDVPlatformMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowIDVPlatformMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowIDVPlatformMetadataUndefined: Self = StObject.set(x, "allowIDVPlatformMetadata", js.undefined)
    
    inline def setAllowIDVPlatformUndefined: Self = StObject.set(x, "allowIDVPlatform", js.undefined)
    
    inline def setAllowInPerson(value: String): Self = StObject.set(x, "allowInPerson", value.asInstanceOf[js.Any])
    
    inline def setAllowInPersonMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowInPersonMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowInPersonMetadataUndefined: Self = StObject.set(x, "allowInPersonMetadata", js.undefined)
    
    inline def setAllowInPersonUndefined: Self = StObject.set(x, "allowInPerson", js.undefined)
    
    inline def setAllowManagedStamps(value: String): Self = StObject.set(x, "allowManagedStamps", value.asInstanceOf[js.Any])
    
    inline def setAllowManagedStampsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowManagedStampsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowManagedStampsMetadataUndefined: Self = StObject.set(x, "allowManagedStampsMetadata", js.undefined)
    
    inline def setAllowManagedStampsUndefined: Self = StObject.set(x, "allowManagedStamps", js.undefined)
    
    inline def setAllowMarkup(value: String): Self = StObject.set(x, "allowMarkup", value.asInstanceOf[js.Any])
    
    inline def setAllowMarkupMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowMarkupMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowMarkupMetadataUndefined: Self = StObject.set(x, "allowMarkupMetadata", js.undefined)
    
    inline def setAllowMarkupUndefined: Self = StObject.set(x, "allowMarkup", js.undefined)
    
    inline def setAllowMemberTimeZone(value: String): Self = StObject.set(x, "allowMemberTimeZone", value.asInstanceOf[js.Any])
    
    inline def setAllowMemberTimeZoneMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowMemberTimeZoneMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowMemberTimeZoneMetadataUndefined: Self = StObject.set(x, "allowMemberTimeZoneMetadata", js.undefined)
    
    inline def setAllowMemberTimeZoneUndefined: Self = StObject.set(x, "allowMemberTimeZone", js.undefined)
    
    inline def setAllowMergeFields(value: String): Self = StObject.set(x, "allowMergeFields", value.asInstanceOf[js.Any])
    
    inline def setAllowMergeFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowMergeFieldsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowMergeFieldsMetadataUndefined: Self = StObject.set(x, "allowMergeFieldsMetadata", js.undefined)
    
    inline def setAllowMergeFieldsUndefined: Self = StObject.set(x, "allowMergeFields", js.undefined)
    
    inline def setAllowMultipleBrandProfiles(value: String): Self = StObject.set(x, "allowMultipleBrandProfiles", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleBrandProfilesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowMultipleBrandProfilesMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleBrandProfilesMetadataUndefined: Self = StObject.set(x, "allowMultipleBrandProfilesMetadata", js.undefined)
    
    inline def setAllowMultipleBrandProfilesUndefined: Self = StObject.set(x, "allowMultipleBrandProfiles", js.undefined)
    
    inline def setAllowMultipleSignerAttachments(value: String): Self = StObject.set(x, "allowMultipleSignerAttachments", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleSignerAttachmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowMultipleSignerAttachmentsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowMultipleSignerAttachmentsMetadataUndefined: Self = StObject.set(x, "allowMultipleSignerAttachmentsMetadata", js.undefined)
    
    inline def setAllowMultipleSignerAttachmentsUndefined: Self = StObject.set(x, "allowMultipleSignerAttachments", js.undefined)
    
    inline def setAllowNonUSPhoneAuth(value: String): Self = StObject.set(x, "allowNonUSPhoneAuth", value.asInstanceOf[js.Any])
    
    inline def setAllowNonUSPhoneAuthMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowNonUSPhoneAuthMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowNonUSPhoneAuthMetadataUndefined: Self = StObject.set(x, "allowNonUSPhoneAuthMetadata", js.undefined)
    
    inline def setAllowNonUSPhoneAuthUndefined: Self = StObject.set(x, "allowNonUSPhoneAuth", js.undefined)
    
    inline def setAllowOcrOfEnvelopeDocuments(value: String): Self = StObject.set(x, "allowOcrOfEnvelopeDocuments", value.asInstanceOf[js.Any])
    
    inline def setAllowOcrOfEnvelopeDocumentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowOcrOfEnvelopeDocumentsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowOcrOfEnvelopeDocumentsMetadataUndefined: Self = StObject.set(x, "allowOcrOfEnvelopeDocumentsMetadata", js.undefined)
    
    inline def setAllowOcrOfEnvelopeDocumentsUndefined: Self = StObject.set(x, "allowOcrOfEnvelopeDocuments", js.undefined)
    
    inline def setAllowOfflineSigning(value: String): Self = StObject.set(x, "allowOfflineSigning", value.asInstanceOf[js.Any])
    
    inline def setAllowOfflineSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowOfflineSigningMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowOfflineSigningMetadataUndefined: Self = StObject.set(x, "allowOfflineSigningMetadata", js.undefined)
    
    inline def setAllowOfflineSigningUndefined: Self = StObject.set(x, "allowOfflineSigning", js.undefined)
    
    inline def setAllowOpenTrustSignerCertificate(value: String): Self = StObject.set(x, "allowOpenTrustSignerCertificate", value.asInstanceOf[js.Any])
    
    inline def setAllowOpenTrustSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowOpenTrustSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowOpenTrustSignerCertificateMetadataUndefined: Self = StObject.set(x, "allowOpenTrustSignerCertificateMetadata", js.undefined)
    
    inline def setAllowOpenTrustSignerCertificateUndefined: Self = StObject.set(x, "allowOpenTrustSignerCertificate", js.undefined)
    
    inline def setAllowOrganizations(value: String): Self = StObject.set(x, "allowOrganizations", value.asInstanceOf[js.Any])
    
    inline def setAllowOrganizationsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowOrganizationsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowOrganizationsMetadataUndefined: Self = StObject.set(x, "allowOrganizationsMetadata", js.undefined)
    
    inline def setAllowOrganizationsUndefined: Self = StObject.set(x, "allowOrganizations", js.undefined)
    
    inline def setAllowPaymentProcessing(value: String): Self = StObject.set(x, "allowPaymentProcessing", value.asInstanceOf[js.Any])
    
    inline def setAllowPaymentProcessingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowPaymentProcessingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowPaymentProcessingMetadataUndefined: Self = StObject.set(x, "allowPaymentProcessingMetadata", js.undefined)
    
    inline def setAllowPaymentProcessingUndefined: Self = StObject.set(x, "allowPaymentProcessing", js.undefined)
    
    inline def setAllowPersonalSignerCertificate(value: String): Self = StObject.set(x, "allowPersonalSignerCertificate", value.asInstanceOf[js.Any])
    
    inline def setAllowPersonalSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowPersonalSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowPersonalSignerCertificateMetadataUndefined: Self = StObject.set(x, "allowPersonalSignerCertificateMetadata", js.undefined)
    
    inline def setAllowPersonalSignerCertificateUndefined: Self = StObject.set(x, "allowPersonalSignerCertificate", js.undefined)
    
    inline def setAllowPhoneAuthOverride(value: String): Self = StObject.set(x, "allowPhoneAuthOverride", value.asInstanceOf[js.Any])
    
    inline def setAllowPhoneAuthOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowPhoneAuthOverrideMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowPhoneAuthOverrideMetadataUndefined: Self = StObject.set(x, "allowPhoneAuthOverrideMetadata", js.undefined)
    
    inline def setAllowPhoneAuthOverrideUndefined: Self = StObject.set(x, "allowPhoneAuthOverride", js.undefined)
    
    inline def setAllowPhoneAuthentication(value: String): Self = StObject.set(x, "allowPhoneAuthentication", value.asInstanceOf[js.Any])
    
    inline def setAllowPhoneAuthenticationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowPhoneAuthenticationMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowPhoneAuthenticationMetadataUndefined: Self = StObject.set(x, "allowPhoneAuthenticationMetadata", js.undefined)
    
    inline def setAllowPhoneAuthenticationUndefined: Self = StObject.set(x, "allowPhoneAuthentication", js.undefined)
    
    inline def setAllowPrivateSigningGroups(value: String): Self = StObject.set(x, "allowPrivateSigningGroups", value.asInstanceOf[js.Any])
    
    inline def setAllowPrivateSigningGroupsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowPrivateSigningGroupsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowPrivateSigningGroupsMetadataUndefined: Self = StObject.set(x, "allowPrivateSigningGroupsMetadata", js.undefined)
    
    inline def setAllowPrivateSigningGroupsUndefined: Self = StObject.set(x, "allowPrivateSigningGroups", js.undefined)
    
    inline def setAllowReminders(value: String): Self = StObject.set(x, "allowReminders", value.asInstanceOf[js.Any])
    
    inline def setAllowRemindersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowRemindersMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowRemindersMetadataUndefined: Self = StObject.set(x, "allowRemindersMetadata", js.undefined)
    
    inline def setAllowRemindersUndefined: Self = StObject.set(x, "allowReminders", js.undefined)
    
    inline def setAllowResourceFileBranding(value: String): Self = StObject.set(x, "allowResourceFileBranding", value.asInstanceOf[js.Any])
    
    inline def setAllowResourceFileBrandingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowResourceFileBrandingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowResourceFileBrandingMetadataUndefined: Self = StObject.set(x, "allowResourceFileBrandingMetadata", js.undefined)
    
    inline def setAllowResourceFileBrandingUndefined: Self = StObject.set(x, "allowResourceFileBranding", js.undefined)
    
    inline def setAllowSMSDelivery(value: String): Self = StObject.set(x, "allowSMSDelivery", value.asInstanceOf[js.Any])
    
    inline def setAllowSMSDeliveryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSMSDeliveryMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSMSDeliveryMetadataUndefined: Self = StObject.set(x, "allowSMSDeliveryMetadata", js.undefined)
    
    inline def setAllowSMSDeliveryUndefined: Self = StObject.set(x, "allowSMSDelivery", js.undefined)
    
    inline def setAllowSafeBioPharmaSignerCertificate(value: String): Self = StObject.set(x, "allowSafeBioPharmaSignerCertificate", value.asInstanceOf[js.Any])
    
    inline def setAllowSafeBioPharmaSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSafeBioPharmaSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSafeBioPharmaSignerCertificateMetadataUndefined: Self = StObject.set(x, "allowSafeBioPharmaSignerCertificateMetadata", js.undefined)
    
    inline def setAllowSafeBioPharmaSignerCertificateUndefined: Self = StObject.set(x, "allowSafeBioPharmaSignerCertificate", js.undefined)
    
    inline def setAllowSecurityAppliance(value: String): Self = StObject.set(x, "allowSecurityAppliance", value.asInstanceOf[js.Any])
    
    inline def setAllowSecurityApplianceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSecurityApplianceMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSecurityApplianceMetadataUndefined: Self = StObject.set(x, "allowSecurityApplianceMetadata", js.undefined)
    
    inline def setAllowSecurityApplianceUndefined: Self = StObject.set(x, "allowSecurityAppliance", js.undefined)
    
    inline def setAllowSendToCertifiedDelivery(value: String): Self = StObject.set(x, "allowSendToCertifiedDelivery", value.asInstanceOf[js.Any])
    
    inline def setAllowSendToCertifiedDeliveryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSendToCertifiedDeliveryMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSendToCertifiedDeliveryMetadataUndefined: Self = StObject.set(x, "allowSendToCertifiedDeliveryMetadata", js.undefined)
    
    inline def setAllowSendToCertifiedDeliveryUndefined: Self = StObject.set(x, "allowSendToCertifiedDelivery", js.undefined)
    
    inline def setAllowSendToIntermediary(value: String): Self = StObject.set(x, "allowSendToIntermediary", value.asInstanceOf[js.Any])
    
    inline def setAllowSendToIntermediaryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSendToIntermediaryMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSendToIntermediaryMetadataUndefined: Self = StObject.set(x, "allowSendToIntermediaryMetadata", js.undefined)
    
    inline def setAllowSendToIntermediaryUndefined: Self = StObject.set(x, "allowSendToIntermediary", js.undefined)
    
    inline def setAllowServerTemplates(value: String): Self = StObject.set(x, "allowServerTemplates", value.asInstanceOf[js.Any])
    
    inline def setAllowServerTemplatesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowServerTemplatesMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowServerTemplatesMetadataUndefined: Self = StObject.set(x, "allowServerTemplatesMetadata", js.undefined)
    
    inline def setAllowServerTemplatesUndefined: Self = StObject.set(x, "allowServerTemplates", js.undefined)
    
    inline def setAllowSetEmbeddedRecipientStartURL(value: String): Self = StObject.set(x, "allowSetEmbeddedRecipientStartURL", value.asInstanceOf[js.Any])
    
    inline def setAllowSetEmbeddedRecipientStartURLMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSetEmbeddedRecipientStartURLMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSetEmbeddedRecipientStartURLMetadataUndefined: Self = StObject.set(x, "allowSetEmbeddedRecipientStartURLMetadata", js.undefined)
    
    inline def setAllowSetEmbeddedRecipientStartURLUndefined: Self = StObject.set(x, "allowSetEmbeddedRecipientStartURL", js.undefined)
    
    inline def setAllowSharedTabs(value: String): Self = StObject.set(x, "allowSharedTabs", value.asInstanceOf[js.Any])
    
    inline def setAllowSharedTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSharedTabsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSharedTabsMetadataUndefined: Self = StObject.set(x, "allowSharedTabsMetadata", js.undefined)
    
    inline def setAllowSharedTabsUndefined: Self = StObject.set(x, "allowSharedTabs", js.undefined)
    
    inline def setAllowSignDocumentFromHomePage(value: String): Self = StObject.set(x, "allowSignDocumentFromHomePage", value.asInstanceOf[js.Any])
    
    inline def setAllowSignDocumentFromHomePageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSignDocumentFromHomePageMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSignDocumentFromHomePageMetadataUndefined: Self = StObject.set(x, "allowSignDocumentFromHomePageMetadata", js.undefined)
    
    inline def setAllowSignDocumentFromHomePageUndefined: Self = StObject.set(x, "allowSignDocumentFromHomePage", js.undefined)
    
    inline def setAllowSignNow(value: String): Self = StObject.set(x, "allowSignNow", value.asInstanceOf[js.Any])
    
    inline def setAllowSignNowMetadata(value: String): Self = StObject.set(x, "allowSignNowMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSignNowMetadataUndefined: Self = StObject.set(x, "allowSignNowMetadata", js.undefined)
    
    inline def setAllowSignNowUndefined: Self = StObject.set(x, "allowSignNow", js.undefined)
    
    inline def setAllowSignatureStamps(value: String): Self = StObject.set(x, "allowSignatureStamps", value.asInstanceOf[js.Any])
    
    inline def setAllowSignatureStampsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSignatureStampsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSignatureStampsMetadataUndefined: Self = StObject.set(x, "allowSignatureStampsMetadata", js.undefined)
    
    inline def setAllowSignatureStampsUndefined: Self = StObject.set(x, "allowSignatureStamps", js.undefined)
    
    inline def setAllowSignerReassign(value: String): Self = StObject.set(x, "allowSignerReassign", value.asInstanceOf[js.Any])
    
    inline def setAllowSignerReassignMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSignerReassignMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSignerReassignMetadataUndefined: Self = StObject.set(x, "allowSignerReassignMetadata", js.undefined)
    
    inline def setAllowSignerReassignOverride(value: String): Self = StObject.set(x, "allowSignerReassignOverride", value.asInstanceOf[js.Any])
    
    inline def setAllowSignerReassignOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSignerReassignOverrideMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSignerReassignOverrideMetadataUndefined: Self = StObject.set(x, "allowSignerReassignOverrideMetadata", js.undefined)
    
    inline def setAllowSignerReassignOverrideUndefined: Self = StObject.set(x, "allowSignerReassignOverride", js.undefined)
    
    inline def setAllowSignerReassignUndefined: Self = StObject.set(x, "allowSignerReassign", js.undefined)
    
    inline def setAllowSigningExtensions(value: String): Self = StObject.set(x, "allowSigningExtensions", value.asInstanceOf[js.Any])
    
    inline def setAllowSigningExtensionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSigningExtensionsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSigningExtensionsMetadataUndefined: Self = StObject.set(x, "allowSigningExtensionsMetadata", js.undefined)
    
    inline def setAllowSigningExtensionsUndefined: Self = StObject.set(x, "allowSigningExtensions", js.undefined)
    
    inline def setAllowSigningGroups(value: String): Self = StObject.set(x, "allowSigningGroups", value.asInstanceOf[js.Any])
    
    inline def setAllowSigningGroupsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSigningGroupsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSigningGroupsMetadataUndefined: Self = StObject.set(x, "allowSigningGroupsMetadata", js.undefined)
    
    inline def setAllowSigningGroupsUndefined: Self = StObject.set(x, "allowSigningGroups", js.undefined)
    
    inline def setAllowSigningRadioDeselect(value: String): Self = StObject.set(x, "allowSigningRadioDeselect", value.asInstanceOf[js.Any])
    
    inline def setAllowSigningRadioDeselectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSigningRadioDeselectMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSigningRadioDeselectMetadataUndefined: Self = StObject.set(x, "allowSigningRadioDeselectMetadata", js.undefined)
    
    inline def setAllowSigningRadioDeselectUndefined: Self = StObject.set(x, "allowSigningRadioDeselect", js.undefined)
    
    inline def setAllowSocialIdLogin(value: String): Self = StObject.set(x, "allowSocialIdLogin", value.asInstanceOf[js.Any])
    
    inline def setAllowSocialIdLoginMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSocialIdLoginMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSocialIdLoginMetadataUndefined: Self = StObject.set(x, "allowSocialIdLoginMetadata", js.undefined)
    
    inline def setAllowSocialIdLoginUndefined: Self = StObject.set(x, "allowSocialIdLogin", js.undefined)
    
    inline def setAllowSupplementalDocuments(value: String): Self = StObject.set(x, "allowSupplementalDocuments", value.asInstanceOf[js.Any])
    
    inline def setAllowSupplementalDocumentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSupplementalDocumentsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSupplementalDocumentsMetadataUndefined: Self = StObject.set(x, "allowSupplementalDocumentsMetadata", js.undefined)
    
    inline def setAllowSupplementalDocumentsUndefined: Self = StObject.set(x, "allowSupplementalDocuments", js.undefined)
    
    inline def setAllowUsersToAccessDirectory(value: String): Self = StObject.set(x, "allowUsersToAccessDirectory", value.asInstanceOf[js.Any])
    
    inline def setAllowUsersToAccessDirectoryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowUsersToAccessDirectoryMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowUsersToAccessDirectoryMetadataUndefined: Self = StObject.set(x, "allowUsersToAccessDirectoryMetadata", js.undefined)
    
    inline def setAllowUsersToAccessDirectoryUndefined: Self = StObject.set(x, "allowUsersToAccessDirectory", js.undefined)
    
    inline def setAllowValueInsights(value: String): Self = StObject.set(x, "allowValueInsights", value.asInstanceOf[js.Any])
    
    inline def setAllowValueInsightsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowValueInsightsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowValueInsightsMetadataUndefined: Self = StObject.set(x, "allowValueInsightsMetadata", js.undefined)
    
    inline def setAllowValueInsightsUndefined: Self = StObject.set(x, "allowValueInsights", js.undefined)
    
    inline def setAnchorPopulationScope(value: String): Self = StObject.set(x, "anchorPopulationScope", value.asInstanceOf[js.Any])
    
    inline def setAnchorPopulationScopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "anchorPopulationScopeMetadata", value.asInstanceOf[js.Any])
    
    inline def setAnchorPopulationScopeMetadataUndefined: Self = StObject.set(x, "anchorPopulationScopeMetadata", js.undefined)
    
    inline def setAnchorPopulationScopeUndefined: Self = StObject.set(x, "anchorPopulationScope", js.undefined)
    
    inline def setAnchorTagVersionedPlacementEnabled(value: String): Self = StObject.set(x, "anchorTagVersionedPlacementEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnchorTagVersionedPlacementEnabledUndefined: Self = StObject.set(x, "anchorTagVersionedPlacementEnabled", js.undefined)
    
    inline def setAnchorTagVersionedPlacementMetadataEnabled(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "anchorTagVersionedPlacementMetadataEnabled", value.asInstanceOf[js.Any])
    
    inline def setAnchorTagVersionedPlacementMetadataEnabledUndefined: Self = StObject.set(x, "anchorTagVersionedPlacementMetadataEnabled", js.undefined)
    
    inline def setAttachCompletedEnvelope(value: String): Self = StObject.set(x, "attachCompletedEnvelope", value.asInstanceOf[js.Any])
    
    inline def setAttachCompletedEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "attachCompletedEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    inline def setAttachCompletedEnvelopeMetadataUndefined: Self = StObject.set(x, "attachCompletedEnvelopeMetadata", js.undefined)
    
    inline def setAttachCompletedEnvelopeUndefined: Self = StObject.set(x, "attachCompletedEnvelope", js.undefined)
    
    inline def setAuthenticationCheck(value: String): Self = StObject.set(x, "authenticationCheck", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationCheckMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "authenticationCheckMetadata", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationCheckMetadataUndefined: Self = StObject.set(x, "authenticationCheckMetadata", js.undefined)
    
    inline def setAuthenticationCheckUndefined: Self = StObject.set(x, "authenticationCheck", js.undefined)
    
    inline def setAutoNavRule(value: String): Self = StObject.set(x, "autoNavRule", value.asInstanceOf[js.Any])
    
    inline def setAutoNavRuleMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "autoNavRuleMetadata", value.asInstanceOf[js.Any])
    
    inline def setAutoNavRuleMetadataUndefined: Self = StObject.set(x, "autoNavRuleMetadata", js.undefined)
    
    inline def setAutoNavRuleUndefined: Self = StObject.set(x, "autoNavRule", js.undefined)
    
    inline def setAutoProvisionSignerAccount(value: String): Self = StObject.set(x, "autoProvisionSignerAccount", value.asInstanceOf[js.Any])
    
    inline def setAutoProvisionSignerAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "autoProvisionSignerAccountMetadata", value.asInstanceOf[js.Any])
    
    inline def setAutoProvisionSignerAccountMetadataUndefined: Self = StObject.set(x, "autoProvisionSignerAccountMetadata", js.undefined)
    
    inline def setAutoProvisionSignerAccountUndefined: Self = StObject.set(x, "autoProvisionSignerAccount", js.undefined)
    
    inline def setBccEmailArchive(value: String): Self = StObject.set(x, "bccEmailArchive", value.asInstanceOf[js.Any])
    
    inline def setBccEmailArchiveMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "bccEmailArchiveMetadata", value.asInstanceOf[js.Any])
    
    inline def setBccEmailArchiveMetadataUndefined: Self = StObject.set(x, "bccEmailArchiveMetadata", js.undefined)
    
    inline def setBccEmailArchiveUndefined: Self = StObject.set(x, "bccEmailArchive", js.undefined)
    
    inline def setBetaSwitchConfiguration(value: String): Self = StObject.set(x, "betaSwitchConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBetaSwitchConfigurationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "betaSwitchConfigurationMetadata", value.asInstanceOf[js.Any])
    
    inline def setBetaSwitchConfigurationMetadataUndefined: Self = StObject.set(x, "betaSwitchConfigurationMetadata", js.undefined)
    
    inline def setBetaSwitchConfigurationUndefined: Self = StObject.set(x, "betaSwitchConfiguration", js.undefined)
    
    inline def setBillingAddress(value: /* Contains address information. */ AddressInformation): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "billingAddressMetadata", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressMetadataUndefined: Self = StObject.set(x, "billingAddressMetadata", js.undefined)
    
    inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
    
    inline def setBulkSend(value: String): Self = StObject.set(x, "bulkSend", value.asInstanceOf[js.Any])
    
    inline def setBulkSendMaxCopiesInBatch(value: String): Self = StObject.set(x, "bulkSendMaxCopiesInBatch", value.asInstanceOf[js.Any])
    
    inline def setBulkSendMaxCopiesInBatchUndefined: Self = StObject.set(x, "bulkSendMaxCopiesInBatch", js.undefined)
    
    inline def setBulkSendMaxUnprocessedEnvelopesCount(value: String): Self = StObject.set(x, "bulkSendMaxUnprocessedEnvelopesCount", value.asInstanceOf[js.Any])
    
    inline def setBulkSendMaxUnprocessedEnvelopesCountUndefined: Self = StObject.set(x, "bulkSendMaxUnprocessedEnvelopesCount", js.undefined)
    
    inline def setBulkSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "bulkSendMetadata", value.asInstanceOf[js.Any])
    
    inline def setBulkSendMetadataUndefined: Self = StObject.set(x, "bulkSendMetadata", js.undefined)
    
    inline def setBulkSendUndefined: Self = StObject.set(x, "bulkSend", js.undefined)
    
    inline def setCanSelfBrandSend(value: String): Self = StObject.set(x, "canSelfBrandSend", value.asInstanceOf[js.Any])
    
    inline def setCanSelfBrandSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canSelfBrandSendMetadata", value.asInstanceOf[js.Any])
    
    inline def setCanSelfBrandSendMetadataUndefined: Self = StObject.set(x, "canSelfBrandSendMetadata", js.undefined)
    
    inline def setCanSelfBrandSendUndefined: Self = StObject.set(x, "canSelfBrandSend", js.undefined)
    
    inline def setCanSelfBrandSign(value: String): Self = StObject.set(x, "canSelfBrandSign", value.asInstanceOf[js.Any])
    
    inline def setCanSelfBrandSignMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canSelfBrandSignMetadata", value.asInstanceOf[js.Any])
    
    inline def setCanSelfBrandSignMetadataUndefined: Self = StObject.set(x, "canSelfBrandSignMetadata", js.undefined)
    
    inline def setCanSelfBrandSignUndefined: Self = StObject.set(x, "canSelfBrandSign", js.undefined)
    
    inline def setCanUseSalesforceOAuth(value: String): Self = StObject.set(x, "canUseSalesforceOAuth", value.asInstanceOf[js.Any])
    
    inline def setCanUseSalesforceOAuthMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canUseSalesforceOAuthMetadata", value.asInstanceOf[js.Any])
    
    inline def setCanUseSalesforceOAuthMetadataUndefined: Self = StObject.set(x, "canUseSalesforceOAuthMetadata", js.undefined)
    
    inline def setCanUseSalesforceOAuthUndefined: Self = StObject.set(x, "canUseSalesforceOAuth", js.undefined)
    
    inline def setCaptureVoiceRecording(value: String): Self = StObject.set(x, "captureVoiceRecording", value.asInstanceOf[js.Any])
    
    inline def setCaptureVoiceRecordingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "captureVoiceRecordingMetadata", value.asInstanceOf[js.Any])
    
    inline def setCaptureVoiceRecordingMetadataUndefined: Self = StObject.set(x, "captureVoiceRecordingMetadata", js.undefined)
    
    inline def setCaptureVoiceRecordingUndefined: Self = StObject.set(x, "captureVoiceRecording", js.undefined)
    
    inline def setCfrUseWideImage(value: String): Self = StObject.set(x, "cfrUseWideImage", value.asInstanceOf[js.Any])
    
    inline def setCfrUseWideImageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "cfrUseWideImageMetadata", value.asInstanceOf[js.Any])
    
    inline def setCfrUseWideImageMetadataUndefined: Self = StObject.set(x, "cfrUseWideImageMetadata", js.undefined)
    
    inline def setCfrUseWideImageUndefined: Self = StObject.set(x, "cfrUseWideImage", js.undefined)
    
    inline def setCheckForMultipleAdminsOnAccount(value: String): Self = StObject.set(x, "checkForMultipleAdminsOnAccount", value.asInstanceOf[js.Any])
    
    inline def setCheckForMultipleAdminsOnAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "checkForMultipleAdminsOnAccountMetadata", value.asInstanceOf[js.Any])
    
    inline def setCheckForMultipleAdminsOnAccountMetadataUndefined: Self = StObject.set(x, "checkForMultipleAdminsOnAccountMetadata", js.undefined)
    
    inline def setCheckForMultipleAdminsOnAccountUndefined: Self = StObject.set(x, "checkForMultipleAdminsOnAccount", js.undefined)
    
    inline def setChromeSignatureEnabled(value: String): Self = StObject.set(x, "chromeSignatureEnabled", value.asInstanceOf[js.Any])
    
    inline def setChromeSignatureEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "chromeSignatureEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setChromeSignatureEnabledMetadataUndefined: Self = StObject.set(x, "chromeSignatureEnabledMetadata", js.undefined)
    
    inline def setChromeSignatureEnabledUndefined: Self = StObject.set(x, "chromeSignatureEnabled", js.undefined)
    
    inline def setCommentEmailShowMessageText(value: String): Self = StObject.set(x, "commentEmailShowMessageText", value.asInstanceOf[js.Any])
    
    inline def setCommentEmailShowMessageTextMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "commentEmailShowMessageTextMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommentEmailShowMessageTextMetadataUndefined: Self = StObject.set(x, "commentEmailShowMessageTextMetadata", js.undefined)
    
    inline def setCommentEmailShowMessageTextUndefined: Self = StObject.set(x, "commentEmailShowMessageText", js.undefined)
    
    inline def setCommentsAllowEnvelopeOverride(value: String): Self = StObject.set(x, "commentsAllowEnvelopeOverride", value.asInstanceOf[js.Any])
    
    inline def setCommentsAllowEnvelopeOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "commentsAllowEnvelopeOverrideMetadata", value.asInstanceOf[js.Any])
    
    inline def setCommentsAllowEnvelopeOverrideMetadataUndefined: Self = StObject.set(x, "commentsAllowEnvelopeOverrideMetadata", js.undefined)
    
    inline def setCommentsAllowEnvelopeOverrideUndefined: Self = StObject.set(x, "commentsAllowEnvelopeOverride", js.undefined)
    
    inline def setConditionalFieldsEnabled(value: String): Self = StObject.set(x, "conditionalFieldsEnabled", value.asInstanceOf[js.Any])
    
    inline def setConditionalFieldsEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "conditionalFieldsEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setConditionalFieldsEnabledMetadataUndefined: Self = StObject.set(x, "conditionalFieldsEnabledMetadata", js.undefined)
    
    inline def setConditionalFieldsEnabledUndefined: Self = StObject.set(x, "conditionalFieldsEnabled", js.undefined)
    
    inline def setConsumerDisclosureFrequency(value: String): Self = StObject.set(x, "consumerDisclosureFrequency", value.asInstanceOf[js.Any])
    
    inline def setConsumerDisclosureFrequencyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "consumerDisclosureFrequencyMetadata", value.asInstanceOf[js.Any])
    
    inline def setConsumerDisclosureFrequencyMetadataUndefined: Self = StObject.set(x, "consumerDisclosureFrequencyMetadata", js.undefined)
    
    inline def setConsumerDisclosureFrequencyUndefined: Self = StObject.set(x, "consumerDisclosureFrequency", js.undefined)
    
    inline def setConvertPdfFields(value: String): Self = StObject.set(x, "convertPdfFields", value.asInstanceOf[js.Any])
    
    inline def setConvertPdfFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "convertPdfFieldsMetadata", value.asInstanceOf[js.Any])
    
    inline def setConvertPdfFieldsMetadataUndefined: Self = StObject.set(x, "convertPdfFieldsMetadata", js.undefined)
    
    inline def setConvertPdfFieldsUndefined: Self = StObject.set(x, "convertPdfFields", js.undefined)
    
    inline def setDataPopulationScope(value: String): Self = StObject.set(x, "dataPopulationScope", value.asInstanceOf[js.Any])
    
    inline def setDataPopulationScopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "dataPopulationScopeMetadata", value.asInstanceOf[js.Any])
    
    inline def setDataPopulationScopeMetadataUndefined: Self = StObject.set(x, "dataPopulationScopeMetadata", js.undefined)
    
    inline def setDataPopulationScopeUndefined: Self = StObject.set(x, "dataPopulationScope", js.undefined)
    
    inline def setDisableMobileApp(value: String): Self = StObject.set(x, "disableMobileApp", value.asInstanceOf[js.Any])
    
    inline def setDisableMobileAppMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableMobileAppMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableMobileAppMetadataUndefined: Self = StObject.set(x, "disableMobileAppMetadata", js.undefined)
    
    inline def setDisableMobileAppUndefined: Self = StObject.set(x, "disableMobileApp", js.undefined)
    
    inline def setDisableMobilePushNotifications(value: String): Self = StObject.set(x, "disableMobilePushNotifications", value.asInstanceOf[js.Any])
    
    inline def setDisableMobilePushNotificationsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableMobilePushNotificationsMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableMobilePushNotificationsMetadataUndefined: Self = StObject.set(x, "disableMobilePushNotificationsMetadata", js.undefined)
    
    inline def setDisableMobilePushNotificationsUndefined: Self = StObject.set(x, "disableMobilePushNotifications", js.undefined)
    
    inline def setDisableMobileSending(value: String): Self = StObject.set(x, "disableMobileSending", value.asInstanceOf[js.Any])
    
    inline def setDisableMobileSendingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableMobileSendingMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableMobileSendingMetadataUndefined: Self = StObject.set(x, "disableMobileSendingMetadata", js.undefined)
    
    inline def setDisableMobileSendingUndefined: Self = StObject.set(x, "disableMobileSending", js.undefined)
    
    inline def setDisableMultipleSessions(value: String): Self = StObject.set(x, "disableMultipleSessions", value.asInstanceOf[js.Any])
    
    inline def setDisableMultipleSessionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableMultipleSessionsMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableMultipleSessionsMetadataUndefined: Self = StObject.set(x, "disableMultipleSessionsMetadata", js.undefined)
    
    inline def setDisableMultipleSessionsUndefined: Self = StObject.set(x, "disableMultipleSessions", js.undefined)
    
    inline def setDisablePurgeNotificationsForSenderMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disablePurgeNotificationsForSenderMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisablePurgeNotificationsForSenderMetadataUndefined: Self = StObject.set(x, "disablePurgeNotificationsForSenderMetadata", js.undefined)
    
    inline def setDisableSignerCertView(value: String): Self = StObject.set(x, "disableSignerCertView", value.asInstanceOf[js.Any])
    
    inline def setDisableSignerCertViewMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableSignerCertViewMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableSignerCertViewMetadataUndefined: Self = StObject.set(x, "disableSignerCertViewMetadata", js.undefined)
    
    inline def setDisableSignerCertViewUndefined: Self = StObject.set(x, "disableSignerCertView", js.undefined)
    
    inline def setDisableSignerHistoryView(value: String): Self = StObject.set(x, "disableSignerHistoryView", value.asInstanceOf[js.Any])
    
    inline def setDisableSignerHistoryViewMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableSignerHistoryViewMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableSignerHistoryViewMetadataUndefined: Self = StObject.set(x, "disableSignerHistoryViewMetadata", js.undefined)
    
    inline def setDisableSignerHistoryViewUndefined: Self = StObject.set(x, "disableSignerHistoryView", js.undefined)
    
    inline def setDisableStyleSignature(value: String): Self = StObject.set(x, "disableStyleSignature", value.asInstanceOf[js.Any])
    
    inline def setDisableStyleSignatureMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableStyleSignatureMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableStyleSignatureMetadataUndefined: Self = StObject.set(x, "disableStyleSignatureMetadata", js.undefined)
    
    inline def setDisableStyleSignatureUndefined: Self = StObject.set(x, "disableStyleSignature", js.undefined)
    
    inline def setDisableUploadSignature(value: String): Self = StObject.set(x, "disableUploadSignature", value.asInstanceOf[js.Any])
    
    inline def setDisableUploadSignatureMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableUploadSignatureMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableUploadSignatureMetadataUndefined: Self = StObject.set(x, "disableUploadSignatureMetadata", js.undefined)
    
    inline def setDisableUploadSignatureUndefined: Self = StObject.set(x, "disableUploadSignature", js.undefined)
    
    inline def setDisableUserSharing(value: String): Self = StObject.set(x, "disableUserSharing", value.asInstanceOf[js.Any])
    
    inline def setDisableUserSharingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableUserSharingMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableUserSharingMetadataUndefined: Self = StObject.set(x, "disableUserSharingMetadata", js.undefined)
    
    inline def setDisableUserSharingUndefined: Self = StObject.set(x, "disableUserSharing", js.undefined)
    
    inline def setDisplayBetaSwitch(value: String): Self = StObject.set(x, "displayBetaSwitch", value.asInstanceOf[js.Any])
    
    inline def setDisplayBetaSwitchMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "displayBetaSwitchMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisplayBetaSwitchMetadataUndefined: Self = StObject.set(x, "displayBetaSwitchMetadata", js.undefined)
    
    inline def setDisplayBetaSwitchUndefined: Self = StObject.set(x, "displayBetaSwitch", js.undefined)
    
    inline def setDocumentConversionRestrictions(value: String): Self = StObject.set(x, "documentConversionRestrictions", value.asInstanceOf[js.Any])
    
    inline def setDocumentConversionRestrictionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "documentConversionRestrictionsMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentConversionRestrictionsMetadataUndefined: Self = StObject.set(x, "documentConversionRestrictionsMetadata", js.undefined)
    
    inline def setDocumentConversionRestrictionsUndefined: Self = StObject.set(x, "documentConversionRestrictions", js.undefined)
    
    inline def setDocumentRetention(value: String): Self = StObject.set(x, "documentRetention", value.asInstanceOf[js.Any])
    
    inline def setDocumentRetentionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "documentRetentionMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentRetentionMetadataUndefined: Self = StObject.set(x, "documentRetentionMetadata", js.undefined)
    
    inline def setDocumentRetentionPurgeTabs(value: String): Self = StObject.set(x, "documentRetentionPurgeTabs", value.asInstanceOf[js.Any])
    
    inline def setDocumentRetentionPurgeTabsUndefined: Self = StObject.set(x, "documentRetentionPurgeTabs", js.undefined)
    
    inline def setDocumentRetentionUndefined: Self = StObject.set(x, "documentRetention", js.undefined)
    
    inline def setDocumentVisibility(value: String): Self = StObject.set(x, "documentVisibility", value.asInstanceOf[js.Any])
    
    inline def setDocumentVisibilityMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "documentVisibilityMetadata", value.asInstanceOf[js.Any])
    
    inline def setDocumentVisibilityMetadataUndefined: Self = StObject.set(x, "documentVisibilityMetadata", js.undefined)
    
    inline def setDocumentVisibilityUndefined: Self = StObject.set(x, "documentVisibility", js.undefined)
    
    inline def setEmailTemplateVersion(value: String): Self = StObject.set(x, "emailTemplateVersion", value.asInstanceOf[js.Any])
    
    inline def setEmailTemplateVersionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "emailTemplateVersionMetadata", value.asInstanceOf[js.Any])
    
    inline def setEmailTemplateVersionMetadataUndefined: Self = StObject.set(x, "emailTemplateVersionMetadata", js.undefined)
    
    inline def setEmailTemplateVersionUndefined: Self = StObject.set(x, "emailTemplateVersion", js.undefined)
    
    inline def setEnableAccessCodeGenerator(value: String): Self = StObject.set(x, "enableAccessCodeGenerator", value.asInstanceOf[js.Any])
    
    inline def setEnableAccessCodeGeneratorMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableAccessCodeGeneratorMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableAccessCodeGeneratorMetadataUndefined: Self = StObject.set(x, "enableAccessCodeGeneratorMetadata", js.undefined)
    
    inline def setEnableAccessCodeGeneratorUndefined: Self = StObject.set(x, "enableAccessCodeGenerator", js.undefined)
    
    inline def setEnableAdvancedPayments(value: String): Self = StObject.set(x, "enableAdvancedPayments", value.asInstanceOf[js.Any])
    
    inline def setEnableAdvancedPaymentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableAdvancedPaymentsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableAdvancedPaymentsMetadataUndefined: Self = StObject.set(x, "enableAdvancedPaymentsMetadata", js.undefined)
    
    inline def setEnableAdvancedPaymentsUndefined: Self = StObject.set(x, "enableAdvancedPayments", js.undefined)
    
    inline def setEnableAdvancedPowerForms(value: String): Self = StObject.set(x, "enableAdvancedPowerForms", value.asInstanceOf[js.Any])
    
    inline def setEnableAdvancedPowerFormsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableAdvancedPowerFormsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableAdvancedPowerFormsMetadataUndefined: Self = StObject.set(x, "enableAdvancedPowerFormsMetadata", js.undefined)
    
    inline def setEnableAdvancedPowerFormsUndefined: Self = StObject.set(x, "enableAdvancedPowerForms", js.undefined)
    
    inline def setEnableAutoNav(value: String): Self = StObject.set(x, "enableAutoNav", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoNavMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableAutoNavMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableAutoNavMetadataUndefined: Self = StObject.set(x, "enableAutoNavMetadata", js.undefined)
    
    inline def setEnableAutoNavUndefined: Self = StObject.set(x, "enableAutoNav", js.undefined)
    
    inline def setEnableCalculatedFields(value: String): Self = StObject.set(x, "enableCalculatedFields", value.asInstanceOf[js.Any])
    
    inline def setEnableCalculatedFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableCalculatedFieldsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableCalculatedFieldsMetadataUndefined: Self = StObject.set(x, "enableCalculatedFieldsMetadata", js.undefined)
    
    inline def setEnableCalculatedFieldsUndefined: Self = StObject.set(x, "enableCalculatedFields", js.undefined)
    
    inline def setEnableClickwraps(value: String): Self = StObject.set(x, "enableClickwraps", value.asInstanceOf[js.Any])
    
    inline def setEnableClickwrapsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableClickwrapsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableClickwrapsMetadataUndefined: Self = StObject.set(x, "enableClickwrapsMetadata", js.undefined)
    
    inline def setEnableClickwrapsUndefined: Self = StObject.set(x, "enableClickwraps", js.undefined)
    
    inline def setEnableCommentsHistoryDownloadInSigning(value: String): Self = StObject.set(x, "enableCommentsHistoryDownloadInSigning", value.asInstanceOf[js.Any])
    
    inline def setEnableCommentsHistoryDownloadInSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableCommentsHistoryDownloadInSigningMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableCommentsHistoryDownloadInSigningMetadataUndefined: Self = StObject.set(x, "enableCommentsHistoryDownloadInSigningMetadata", js.undefined)
    
    inline def setEnableCommentsHistoryDownloadInSigningUndefined: Self = StObject.set(x, "enableCommentsHistoryDownloadInSigning", js.undefined)
    
    inline def setEnableCustomerSatisfactionMetricTracking(value: String): Self = StObject.set(x, "enableCustomerSatisfactionMetricTracking", value.asInstanceOf[js.Any])
    
    inline def setEnableCustomerSatisfactionMetricTrackingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableCustomerSatisfactionMetricTrackingMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableCustomerSatisfactionMetricTrackingMetadataUndefined: Self = StObject.set(x, "enableCustomerSatisfactionMetricTrackingMetadata", js.undefined)
    
    inline def setEnableCustomerSatisfactionMetricTrackingUndefined: Self = StObject.set(x, "enableCustomerSatisfactionMetricTracking", js.undefined)
    
    inline def setEnableDSPro(value: String): Self = StObject.set(x, "enableDSPro", value.asInstanceOf[js.Any])
    
    inline def setEnableDSProMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableDSProMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableDSProMetadataUndefined: Self = StObject.set(x, "enableDSProMetadata", js.undefined)
    
    inline def setEnableDSProUndefined: Self = StObject.set(x, "enableDSPro", js.undefined)
    
    inline def setEnableEnvelopeStampingByAccountAdmin(value: String): Self = StObject.set(x, "enableEnvelopeStampingByAccountAdmin", value.asInstanceOf[js.Any])
    
    inline def setEnableEnvelopeStampingByAccountAdminMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableEnvelopeStampingByAccountAdminMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableEnvelopeStampingByAccountAdminMetadataUndefined: Self = StObject.set(x, "enableEnvelopeStampingByAccountAdminMetadata", js.undefined)
    
    inline def setEnableEnvelopeStampingByAccountAdminUndefined: Self = StObject.set(x, "enableEnvelopeStampingByAccountAdmin", js.undefined)
    
    inline def setEnableEnvelopeStampingByDSAdmin(value: String): Self = StObject.set(x, "enableEnvelopeStampingByDSAdmin", value.asInstanceOf[js.Any])
    
    inline def setEnableEnvelopeStampingByDSAdminMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableEnvelopeStampingByDSAdminMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableEnvelopeStampingByDSAdminMetadataUndefined: Self = StObject.set(x, "enableEnvelopeStampingByDSAdminMetadata", js.undefined)
    
    inline def setEnableEnvelopeStampingByDSAdminUndefined: Self = StObject.set(x, "enableEnvelopeStampingByDSAdmin", js.undefined)
    
    inline def setEnableInBrowserEditor(value: String): Self = StObject.set(x, "enableInBrowserEditor", value.asInstanceOf[js.Any])
    
    inline def setEnableInBrowserEditorMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableInBrowserEditorMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableInBrowserEditorMetadataUndefined: Self = StObject.set(x, "enableInBrowserEditorMetadata", js.undefined)
    
    inline def setEnableInBrowserEditorUndefined: Self = StObject.set(x, "enableInBrowserEditor", js.undefined)
    
    inline def setEnablePaymentProcessing(value: String): Self = StObject.set(x, "enablePaymentProcessing", value.asInstanceOf[js.Any])
    
    inline def setEnablePaymentProcessingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enablePaymentProcessingMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnablePaymentProcessingMetadataUndefined: Self = StObject.set(x, "enablePaymentProcessingMetadata", js.undefined)
    
    inline def setEnablePaymentProcessingUndefined: Self = StObject.set(x, "enablePaymentProcessing", js.undefined)
    
    inline def setEnablePowerForm(value: String): Self = StObject.set(x, "enablePowerForm", value.asInstanceOf[js.Any])
    
    inline def setEnablePowerFormDirect(value: String): Self = StObject.set(x, "enablePowerFormDirect", value.asInstanceOf[js.Any])
    
    inline def setEnablePowerFormDirectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enablePowerFormDirectMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnablePowerFormDirectMetadataUndefined: Self = StObject.set(x, "enablePowerFormDirectMetadata", js.undefined)
    
    inline def setEnablePowerFormDirectUndefined: Self = StObject.set(x, "enablePowerFormDirect", js.undefined)
    
    inline def setEnablePowerFormMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enablePowerFormMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnablePowerFormMetadataUndefined: Self = StObject.set(x, "enablePowerFormMetadata", js.undefined)
    
    inline def setEnablePowerFormUndefined: Self = StObject.set(x, "enablePowerForm", js.undefined)
    
    inline def setEnableRecipientDomainValidation(value: String): Self = StObject.set(x, "enableRecipientDomainValidation", value.asInstanceOf[js.Any])
    
    inline def setEnableRecipientDomainValidationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableRecipientDomainValidationMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableRecipientDomainValidationMetadataUndefined: Self = StObject.set(x, "enableRecipientDomainValidationMetadata", js.undefined)
    
    inline def setEnableRecipientDomainValidationUndefined: Self = StObject.set(x, "enableRecipientDomainValidation", js.undefined)
    
    inline def setEnableReportLinks(value: String): Self = StObject.set(x, "enableReportLinks", value.asInstanceOf[js.Any])
    
    inline def setEnableReportLinksMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableReportLinksMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableReportLinksMetadataUndefined: Self = StObject.set(x, "enableReportLinksMetadata", js.undefined)
    
    inline def setEnableReportLinksUndefined: Self = StObject.set(x, "enableReportLinks", js.undefined)
    
    inline def setEnableRequireSignOnPaper(value: String): Self = StObject.set(x, "enableRequireSignOnPaper", value.asInstanceOf[js.Any])
    
    inline def setEnableRequireSignOnPaperMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableRequireSignOnPaperMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableRequireSignOnPaperMetadataUndefined: Self = StObject.set(x, "enableRequireSignOnPaperMetadata", js.undefined)
    
    inline def setEnableRequireSignOnPaperUndefined: Self = StObject.set(x, "enableRequireSignOnPaper", js.undefined)
    
    inline def setEnableReservedDomain(value: String): Self = StObject.set(x, "enableReservedDomain", value.asInstanceOf[js.Any])
    
    inline def setEnableReservedDomainMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableReservedDomainMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableReservedDomainMetadataUndefined: Self = StObject.set(x, "enableReservedDomainMetadata", js.undefined)
    
    inline def setEnableReservedDomainUndefined: Self = StObject.set(x, "enableReservedDomain", js.undefined)
    
    inline def setEnableResponsiveSigning(value: String): Self = StObject.set(x, "enableResponsiveSigning", value.asInstanceOf[js.Any])
    
    inline def setEnableResponsiveSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableResponsiveSigningMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableResponsiveSigningMetadataUndefined: Self = StObject.set(x, "enableResponsiveSigningMetadata", js.undefined)
    
    inline def setEnableResponsiveSigningUndefined: Self = StObject.set(x, "enableResponsiveSigning", js.undefined)
    
    inline def setEnableSMSAuthentication(value: String): Self = StObject.set(x, "enableSMSAuthentication", value.asInstanceOf[js.Any])
    
    inline def setEnableSMSAuthenticationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSMSAuthenticationMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSMSAuthenticationMetadataUndefined: Self = StObject.set(x, "enableSMSAuthenticationMetadata", js.undefined)
    
    inline def setEnableSMSAuthenticationUndefined: Self = StObject.set(x, "enableSMSAuthentication", js.undefined)
    
    inline def setEnableScheduledRelease(value: String): Self = StObject.set(x, "enableScheduledRelease", value.asInstanceOf[js.Any])
    
    inline def setEnableScheduledReleaseMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableScheduledReleaseMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableScheduledReleaseMetadataUndefined: Self = StObject.set(x, "enableScheduledReleaseMetadata", js.undefined)
    
    inline def setEnableScheduledReleaseUndefined: Self = StObject.set(x, "enableScheduledRelease", js.undefined)
    
    inline def setEnableSearchUI(value: String): Self = StObject.set(x, "enableSearchUI", value.asInstanceOf[js.Any])
    
    inline def setEnableSearchUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSearchUIMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSearchUIMetadataUndefined: Self = StObject.set(x, "enableSearchUIMetadata", js.undefined)
    
    inline def setEnableSearchUIUndefined: Self = StObject.set(x, "enableSearchUI", js.undefined)
    
    inline def setEnableSendToAgent(value: String): Self = StObject.set(x, "enableSendToAgent", value.asInstanceOf[js.Any])
    
    inline def setEnableSendToAgentMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSendToAgentMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSendToAgentMetadataUndefined: Self = StObject.set(x, "enableSendToAgentMetadata", js.undefined)
    
    inline def setEnableSendToAgentUndefined: Self = StObject.set(x, "enableSendToAgent", js.undefined)
    
    inline def setEnableSendToIntermediary(value: String): Self = StObject.set(x, "enableSendToIntermediary", value.asInstanceOf[js.Any])
    
    inline def setEnableSendToIntermediaryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSendToIntermediaryMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSendToIntermediaryMetadataUndefined: Self = StObject.set(x, "enableSendToIntermediaryMetadata", js.undefined)
    
    inline def setEnableSendToIntermediaryUndefined: Self = StObject.set(x, "enableSendToIntermediary", js.undefined)
    
    inline def setEnableSendToManage(value: String): Self = StObject.set(x, "enableSendToManage", value.asInstanceOf[js.Any])
    
    inline def setEnableSendToManageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSendToManageMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSendToManageMetadataUndefined: Self = StObject.set(x, "enableSendToManageMetadata", js.undefined)
    
    inline def setEnableSendToManageUndefined: Self = StObject.set(x, "enableSendToManage", js.undefined)
    
    inline def setEnableSendingTagsFontSettings(value: String): Self = StObject.set(x, "enableSendingTagsFontSettings", value.asInstanceOf[js.Any])
    
    inline def setEnableSendingTagsFontSettingsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSendingTagsFontSettingsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSendingTagsFontSettingsMetadataUndefined: Self = StObject.set(x, "enableSendingTagsFontSettingsMetadata", js.undefined)
    
    inline def setEnableSendingTagsFontSettingsUndefined: Self = StObject.set(x, "enableSendingTagsFontSettings", js.undefined)
    
    inline def setEnableSequentialSigningAPI(value: String): Self = StObject.set(x, "enableSequentialSigningAPI", value.asInstanceOf[js.Any])
    
    inline def setEnableSequentialSigningAPIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSequentialSigningAPIMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSequentialSigningAPIMetadataUndefined: Self = StObject.set(x, "enableSequentialSigningAPIMetadata", js.undefined)
    
    inline def setEnableSequentialSigningAPIUndefined: Self = StObject.set(x, "enableSequentialSigningAPI", js.undefined)
    
    inline def setEnableSequentialSigningUI(value: String): Self = StObject.set(x, "enableSequentialSigningUI", value.asInstanceOf[js.Any])
    
    inline def setEnableSequentialSigningUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSequentialSigningUIMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSequentialSigningUIMetadataUndefined: Self = StObject.set(x, "enableSequentialSigningUIMetadata", js.undefined)
    
    inline def setEnableSequentialSigningUIUndefined: Self = StObject.set(x, "enableSequentialSigningUI", js.undefined)
    
    inline def setEnableSignOnPaper(value: String): Self = StObject.set(x, "enableSignOnPaper", value.asInstanceOf[js.Any])
    
    inline def setEnableSignOnPaperMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSignOnPaperMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSignOnPaperMetadataUndefined: Self = StObject.set(x, "enableSignOnPaperMetadata", js.undefined)
    
    inline def setEnableSignOnPaperOverride(value: String): Self = StObject.set(x, "enableSignOnPaperOverride", value.asInstanceOf[js.Any])
    
    inline def setEnableSignOnPaperOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSignOnPaperOverrideMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSignOnPaperOverrideMetadataUndefined: Self = StObject.set(x, "enableSignOnPaperOverrideMetadata", js.undefined)
    
    inline def setEnableSignOnPaperOverrideUndefined: Self = StObject.set(x, "enableSignOnPaperOverride", js.undefined)
    
    inline def setEnableSignOnPaperUndefined: Self = StObject.set(x, "enableSignOnPaper", js.undefined)
    
    inline def setEnableSignWithNotary(value: String): Self = StObject.set(x, "enableSignWithNotary", value.asInstanceOf[js.Any])
    
    inline def setEnableSignWithNotaryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSignWithNotaryMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSignWithNotaryMetadataUndefined: Self = StObject.set(x, "enableSignWithNotaryMetadata", js.undefined)
    
    inline def setEnableSignWithNotaryUndefined: Self = StObject.set(x, "enableSignWithNotary", js.undefined)
    
    inline def setEnableSignerAttachments(value: String): Self = StObject.set(x, "enableSignerAttachments", value.asInstanceOf[js.Any])
    
    inline def setEnableSignerAttachmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSignerAttachmentsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSignerAttachmentsMetadataUndefined: Self = StObject.set(x, "enableSignerAttachmentsMetadata", js.undefined)
    
    inline def setEnableSignerAttachmentsUndefined: Self = StObject.set(x, "enableSignerAttachments", js.undefined)
    
    inline def setEnableSigningExtensionComments(value: String): Self = StObject.set(x, "enableSigningExtensionComments", value.asInstanceOf[js.Any])
    
    inline def setEnableSigningExtensionCommentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSigningExtensionCommentsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSigningExtensionCommentsMetadataUndefined: Self = StObject.set(x, "enableSigningExtensionCommentsMetadata", js.undefined)
    
    inline def setEnableSigningExtensionCommentsUndefined: Self = StObject.set(x, "enableSigningExtensionComments", js.undefined)
    
    inline def setEnableSigningExtensionConversations(value: String): Self = StObject.set(x, "enableSigningExtensionConversations", value.asInstanceOf[js.Any])
    
    inline def setEnableSigningExtensionConversationsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSigningExtensionConversationsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSigningExtensionConversationsMetadataUndefined: Self = StObject.set(x, "enableSigningExtensionConversationsMetadata", js.undefined)
    
    inline def setEnableSigningExtensionConversationsUndefined: Self = StObject.set(x, "enableSigningExtensionConversations", js.undefined)
    
    inline def setEnableSigningOrderSettingsForAccount(value: String): Self = StObject.set(x, "enableSigningOrderSettingsForAccount", value.asInstanceOf[js.Any])
    
    inline def setEnableSigningOrderSettingsForAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSigningOrderSettingsForAccountMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSigningOrderSettingsForAccountMetadataUndefined: Self = StObject.set(x, "enableSigningOrderSettingsForAccountMetadata", js.undefined)
    
    inline def setEnableSigningOrderSettingsForAccountUndefined: Self = StObject.set(x, "enableSigningOrderSettingsForAccount", js.undefined)
    
    inline def setEnableSmartContracts(value: String): Self = StObject.set(x, "enableSmartContracts", value.asInstanceOf[js.Any])
    
    inline def setEnableSmartContractsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSmartContractsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSmartContractsMetadataUndefined: Self = StObject.set(x, "enableSmartContractsMetadata", js.undefined)
    
    inline def setEnableSmartContractsUndefined: Self = StObject.set(x, "enableSmartContracts", js.undefined)
    
    inline def setEnableSocialIdLogin(value: String): Self = StObject.set(x, "enableSocialIdLogin", value.asInstanceOf[js.Any])
    
    inline def setEnableSocialIdLoginMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSocialIdLoginMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSocialIdLoginMetadataUndefined: Self = StObject.set(x, "enableSocialIdLoginMetadata", js.undefined)
    
    inline def setEnableSocialIdLoginUndefined: Self = StObject.set(x, "enableSocialIdLogin", js.undefined)
    
    inline def setEnableStrikeThrough(value: String): Self = StObject.set(x, "enableStrikeThrough", value.asInstanceOf[js.Any])
    
    inline def setEnableStrikeThroughMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableStrikeThroughMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableStrikeThroughMetadataUndefined: Self = StObject.set(x, "enableStrikeThroughMetadata", js.undefined)
    
    inline def setEnableStrikeThroughUndefined: Self = StObject.set(x, "enableStrikeThrough", js.undefined)
    
    inline def setEnableTransactionPoint(value: String): Self = StObject.set(x, "enableTransactionPoint", value.asInstanceOf[js.Any])
    
    inline def setEnableTransactionPointMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableTransactionPointMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableTransactionPointMetadataUndefined: Self = StObject.set(x, "enableTransactionPointMetadata", js.undefined)
    
    inline def setEnableTransactionPointUndefined: Self = StObject.set(x, "enableTransactionPoint", js.undefined)
    
    inline def setEnableVaulting(value: String): Self = StObject.set(x, "enableVaulting", value.asInstanceOf[js.Any])
    
    inline def setEnableVaultingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableVaultingMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableVaultingMetadataUndefined: Self = StObject.set(x, "enableVaultingMetadata", js.undefined)
    
    inline def setEnableVaultingUndefined: Self = StObject.set(x, "enableVaulting", js.undefined)
    
    inline def setEnableWitnessing(value: String): Self = StObject.set(x, "enableWitnessing", value.asInstanceOf[js.Any])
    
    inline def setEnableWitnessingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableWitnessingMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableWitnessingMetadataUndefined: Self = StObject.set(x, "enableWitnessingMetadata", js.undefined)
    
    inline def setEnableWitnessingUndefined: Self = StObject.set(x, "enableWitnessing", js.undefined)
    
    inline def setEnforceTemplateNameUniqueness(value: String): Self = StObject.set(x, "enforceTemplateNameUniqueness", value.asInstanceOf[js.Any])
    
    inline def setEnforceTemplateNameUniquenessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enforceTemplateNameUniquenessMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnforceTemplateNameUniquenessMetadataUndefined: Self = StObject.set(x, "enforceTemplateNameUniquenessMetadata", js.undefined)
    
    inline def setEnforceTemplateNameUniquenessUndefined: Self = StObject.set(x, "enforceTemplateNameUniqueness", js.undefined)
    
    inline def setEnvelopeIntegrationAllowed(value: String): Self = StObject.set(x, "envelopeIntegrationAllowed", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIntegrationAllowedMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "envelopeIntegrationAllowedMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIntegrationAllowedMetadataUndefined: Self = StObject.set(x, "envelopeIntegrationAllowedMetadata", js.undefined)
    
    inline def setEnvelopeIntegrationAllowedUndefined: Self = StObject.set(x, "envelopeIntegrationAllowed", js.undefined)
    
    inline def setEnvelopeIntegrationEnabled(value: String): Self = StObject.set(x, "envelopeIntegrationEnabled", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIntegrationEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "envelopeIntegrationEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIntegrationEnabledMetadataUndefined: Self = StObject.set(x, "envelopeIntegrationEnabledMetadata", js.undefined)
    
    inline def setEnvelopeIntegrationEnabledUndefined: Self = StObject.set(x, "envelopeIntegrationEnabled", js.undefined)
    
    inline def setEnvelopeStampingDefaultValue(value: String): Self = StObject.set(x, "envelopeStampingDefaultValue", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeStampingDefaultValueMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "envelopeStampingDefaultValueMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeStampingDefaultValueMetadataUndefined: Self = StObject.set(x, "envelopeStampingDefaultValueMetadata", js.undefined)
    
    inline def setEnvelopeStampingDefaultValueUndefined: Self = StObject.set(x, "envelopeStampingDefaultValue", js.undefined)
    
    inline def setExpressSend(value: String): Self = StObject.set(x, "expressSend", value.asInstanceOf[js.Any])
    
    inline def setExpressSendAllowTabs(value: String): Self = StObject.set(x, "expressSendAllowTabs", value.asInstanceOf[js.Any])
    
    inline def setExpressSendAllowTabsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "expressSendAllowTabsMetadata", value.asInstanceOf[js.Any])
    
    inline def setExpressSendAllowTabsMetadataUndefined: Self = StObject.set(x, "expressSendAllowTabsMetadata", js.undefined)
    
    inline def setExpressSendAllowTabsUndefined: Self = StObject.set(x, "expressSendAllowTabs", js.undefined)
    
    inline def setExpressSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "expressSendMetadata", value.asInstanceOf[js.Any])
    
    inline def setExpressSendMetadataUndefined: Self = StObject.set(x, "expressSendMetadata", js.undefined)
    
    inline def setExpressSendUndefined: Self = StObject.set(x, "expressSend", js.undefined)
    
    inline def setExternalDocumentSources(value: /* A complex object specifying the external document sources. */ ExternalDocumentSources): Self = StObject.set(x, "externalDocumentSources", value.asInstanceOf[js.Any])
    
    inline def setExternalDocumentSourcesUndefined: Self = StObject.set(x, "externalDocumentSources", js.undefined)
    
    inline def setExternalSignaturePadType(value: String): Self = StObject.set(x, "externalSignaturePadType", value.asInstanceOf[js.Any])
    
    inline def setExternalSignaturePadTypeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "externalSignaturePadTypeMetadata", value.asInstanceOf[js.Any])
    
    inline def setExternalSignaturePadTypeMetadataUndefined: Self = StObject.set(x, "externalSignaturePadTypeMetadata", js.undefined)
    
    inline def setExternalSignaturePadTypeUndefined: Self = StObject.set(x, "externalSignaturePadType", js.undefined)
    
    inline def setFaxOutEnabled(value: String): Self = StObject.set(x, "faxOutEnabled", value.asInstanceOf[js.Any])
    
    inline def setFaxOutEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "faxOutEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setFaxOutEnabledMetadataUndefined: Self = StObject.set(x, "faxOutEnabledMetadata", js.undefined)
    
    inline def setFaxOutEnabledUndefined: Self = StObject.set(x, "faxOutEnabled", js.undefined)
    
    inline def setGuidedFormsHtmlAllowed(value: String): Self = StObject.set(x, "guidedFormsHtmlAllowed", value.asInstanceOf[js.Any])
    
    inline def setGuidedFormsHtmlAllowedMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "guidedFormsHtmlAllowedMetadata", value.asInstanceOf[js.Any])
    
    inline def setGuidedFormsHtmlAllowedMetadataUndefined: Self = StObject.set(x, "guidedFormsHtmlAllowedMetadata", js.undefined)
    
    inline def setGuidedFormsHtmlAllowedUndefined: Self = StObject.set(x, "guidedFormsHtmlAllowed", js.undefined)
    
    inline def setHideAccountAddressInCoC(value: String): Self = StObject.set(x, "hideAccountAddressInCoC", value.asInstanceOf[js.Any])
    
    inline def setHideAccountAddressInCoCMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "hideAccountAddressInCoCMetadata", value.asInstanceOf[js.Any])
    
    inline def setHideAccountAddressInCoCMetadataUndefined: Self = StObject.set(x, "hideAccountAddressInCoCMetadata", js.undefined)
    
    inline def setHideAccountAddressInCoCUndefined: Self = StObject.set(x, "hideAccountAddressInCoC", js.undefined)
    
    inline def setHidePricing(value: String): Self = StObject.set(x, "hidePricing", value.asInstanceOf[js.Any])
    
    inline def setHidePricingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "hidePricingMetadata", value.asInstanceOf[js.Any])
    
    inline def setHidePricingMetadataUndefined: Self = StObject.set(x, "hidePricingMetadata", js.undefined)
    
    inline def setHidePricingUndefined: Self = StObject.set(x, "hidePricing", js.undefined)
    
    inline def setIdCheckConfigurations(value: js.Array[/* A complex object specifying ID check configuration. */ IdCheckConfiguration]): Self = StObject.set(x, "idCheckConfigurations", value.asInstanceOf[js.Any])
    
    inline def setIdCheckConfigurationsUndefined: Self = StObject.set(x, "idCheckConfigurations", js.undefined)
    
    inline def setIdCheckConfigurationsVarargs(value: (/* A complex object specifying ID check configuration. */ IdCheckConfiguration)*): Self = StObject.set(x, "idCheckConfigurations", js.Array(value*))
    
    inline def setIdCheckExpire(value: String): Self = StObject.set(x, "idCheckExpire", value.asInstanceOf[js.Any])
    
    inline def setIdCheckExpireDays(value: String): Self = StObject.set(x, "idCheckExpireDays", value.asInstanceOf[js.Any])
    
    inline def setIdCheckExpireDaysMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "idCheckExpireDaysMetadata", value.asInstanceOf[js.Any])
    
    inline def setIdCheckExpireDaysMetadataUndefined: Self = StObject.set(x, "idCheckExpireDaysMetadata", js.undefined)
    
    inline def setIdCheckExpireDaysUndefined: Self = StObject.set(x, "idCheckExpireDays", js.undefined)
    
    inline def setIdCheckExpireMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "idCheckExpireMetadata", value.asInstanceOf[js.Any])
    
    inline def setIdCheckExpireMetadataUndefined: Self = StObject.set(x, "idCheckExpireMetadata", js.undefined)
    
    inline def setIdCheckExpireMinutes(value: String): Self = StObject.set(x, "idCheckExpireMinutes", value.asInstanceOf[js.Any])
    
    inline def setIdCheckExpireMinutesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "idCheckExpireMinutesMetadata", value.asInstanceOf[js.Any])
    
    inline def setIdCheckExpireMinutesMetadataUndefined: Self = StObject.set(x, "idCheckExpireMinutesMetadata", js.undefined)
    
    inline def setIdCheckExpireMinutesUndefined: Self = StObject.set(x, "idCheckExpireMinutes", js.undefined)
    
    inline def setIdCheckExpireUndefined: Self = StObject.set(x, "idCheckExpire", js.undefined)
    
    inline def setIdCheckRequired(value: String): Self = StObject.set(x, "idCheckRequired", value.asInstanceOf[js.Any])
    
    inline def setIdCheckRequiredMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "idCheckRequiredMetadata", value.asInstanceOf[js.Any])
    
    inline def setIdCheckRequiredMetadataUndefined: Self = StObject.set(x, "idCheckRequiredMetadata", js.undefined)
    
    inline def setIdCheckRequiredUndefined: Self = StObject.set(x, "idCheckRequired", js.undefined)
    
    inline def setIdentityVerification(
      value: js.Array[
          /* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow
        ]
    ): Self = StObject.set(x, "identityVerification", value.asInstanceOf[js.Any])
    
    inline def setIdentityVerificationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "identityVerificationMetadata", value.asInstanceOf[js.Any])
    
    inline def setIdentityVerificationMetadataUndefined: Self = StObject.set(x, "identityVerificationMetadata", js.undefined)
    
    inline def setIdentityVerificationUndefined: Self = StObject.set(x, "identityVerification", js.undefined)
    
    inline def setIdentityVerificationVarargs(value: (/* Specifies an Identity Verification workflow. */ AccountIdentityVerificationWorkflow)*): Self = StObject.set(x, "identityVerification", js.Array(value*))
    
    inline def setIgnoreErrorIfAnchorTabNotFound(value: String): Self = StObject.set(x, "ignoreErrorIfAnchorTabNotFound", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorIfAnchorTabNotFoundMetadataEnabled(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "ignoreErrorIfAnchorTabNotFoundMetadataEnabled", value.asInstanceOf[js.Any])
    
    inline def setIgnoreErrorIfAnchorTabNotFoundMetadataEnabledUndefined: Self = StObject.set(x, "ignoreErrorIfAnchorTabNotFoundMetadataEnabled", js.undefined)
    
    inline def setIgnoreErrorIfAnchorTabNotFoundUndefined: Self = StObject.set(x, "ignoreErrorIfAnchorTabNotFound", js.undefined)
    
    inline def setInPersonIDCheckQuestion(value: String): Self = StObject.set(x, "inPersonIDCheckQuestion", value.asInstanceOf[js.Any])
    
    inline def setInPersonIDCheckQuestionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "inPersonIDCheckQuestionMetadata", value.asInstanceOf[js.Any])
    
    inline def setInPersonIDCheckQuestionMetadataUndefined: Self = StObject.set(x, "inPersonIDCheckQuestionMetadata", js.undefined)
    
    inline def setInPersonIDCheckQuestionUndefined: Self = StObject.set(x, "inPersonIDCheckQuestion", js.undefined)
    
    inline def setInPersonSigningEnabled(value: String): Self = StObject.set(x, "inPersonSigningEnabled", value.asInstanceOf[js.Any])
    
    inline def setInPersonSigningEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "inPersonSigningEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setInPersonSigningEnabledMetadataUndefined: Self = StObject.set(x, "inPersonSigningEnabledMetadata", js.undefined)
    
    inline def setInPersonSigningEnabledUndefined: Self = StObject.set(x, "inPersonSigningEnabled", js.undefined)
    
    inline def setInSessionEnabled(value: String): Self = StObject.set(x, "inSessionEnabled", value.asInstanceOf[js.Any])
    
    inline def setInSessionEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "inSessionEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setInSessionEnabledMetadataUndefined: Self = StObject.set(x, "inSessionEnabledMetadata", js.undefined)
    
    inline def setInSessionEnabledUndefined: Self = StObject.set(x, "inSessionEnabled", js.undefined)
    
    inline def setInSessionSuppressEmails(value: String): Self = StObject.set(x, "inSessionSuppressEmails", value.asInstanceOf[js.Any])
    
    inline def setInSessionSuppressEmailsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "inSessionSuppressEmailsMetadata", value.asInstanceOf[js.Any])
    
    inline def setInSessionSuppressEmailsMetadataUndefined: Self = StObject.set(x, "inSessionSuppressEmailsMetadata", js.undefined)
    
    inline def setInSessionSuppressEmailsUndefined: Self = StObject.set(x, "inSessionSuppressEmails", js.undefined)
    
    inline def setMaxNumberOfCustomStamps(value: String): Self = StObject.set(x, "maxNumberOfCustomStamps", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfCustomStampsUndefined: Self = StObject.set(x, "maxNumberOfCustomStamps", js.undefined)
    
    inline def setMaximumSigningGroups(value: String): Self = StObject.set(x, "maximumSigningGroups", value.asInstanceOf[js.Any])
    
    inline def setMaximumSigningGroupsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "maximumSigningGroupsMetadata", value.asInstanceOf[js.Any])
    
    inline def setMaximumSigningGroupsMetadataUndefined: Self = StObject.set(x, "maximumSigningGroupsMetadata", js.undefined)
    
    inline def setMaximumSigningGroupsUndefined: Self = StObject.set(x, "maximumSigningGroups", js.undefined)
    
    inline def setMaximumUsersPerSigningGroup(value: String): Self = StObject.set(x, "maximumUsersPerSigningGroup", value.asInstanceOf[js.Any])
    
    inline def setMaximumUsersPerSigningGroupMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "maximumUsersPerSigningGroupMetadata", value.asInstanceOf[js.Any])
    
    inline def setMaximumUsersPerSigningGroupMetadataUndefined: Self = StObject.set(x, "maximumUsersPerSigningGroupMetadata", js.undefined)
    
    inline def setMaximumUsersPerSigningGroupUndefined: Self = StObject.set(x, "maximumUsersPerSigningGroup", js.undefined)
    
    inline def setMobileSessionTimeout(value: String): Self = StObject.set(x, "mobileSessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setMobileSessionTimeoutMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "mobileSessionTimeoutMetadata", value.asInstanceOf[js.Any])
    
    inline def setMobileSessionTimeoutMetadataUndefined: Self = StObject.set(x, "mobileSessionTimeoutMetadata", js.undefined)
    
    inline def setMobileSessionTimeoutUndefined: Self = StObject.set(x, "mobileSessionTimeout", js.undefined)
    
    inline def setNumberOfActiveCustomStamps(value: String): Self = StObject.set(x, "numberOfActiveCustomStamps", value.asInstanceOf[js.Any])
    
    inline def setNumberOfActiveCustomStampsUndefined: Self = StObject.set(x, "numberOfActiveCustomStamps", js.undefined)
    
    inline def setOptInMobileSigningV02(value: String): Self = StObject.set(x, "optInMobileSigningV02", value.asInstanceOf[js.Any])
    
    inline def setOptInMobileSigningV02Metadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "optInMobileSigningV02Metadata", value.asInstanceOf[js.Any])
    
    inline def setOptInMobileSigningV02MetadataUndefined: Self = StObject.set(x, "optInMobileSigningV02Metadata", js.undefined)
    
    inline def setOptInMobileSigningV02Undefined: Self = StObject.set(x, "optInMobileSigningV02", js.undefined)
    
    inline def setOptOutAutoNavTextAndTabColorUpdates(value: String): Self = StObject.set(x, "optOutAutoNavTextAndTabColorUpdates", value.asInstanceOf[js.Any])
    
    inline def setOptOutAutoNavTextAndTabColorUpdatesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "optOutAutoNavTextAndTabColorUpdatesMetadata", value.asInstanceOf[js.Any])
    
    inline def setOptOutAutoNavTextAndTabColorUpdatesMetadataUndefined: Self = StObject.set(x, "optOutAutoNavTextAndTabColorUpdatesMetadata", js.undefined)
    
    inline def setOptOutAutoNavTextAndTabColorUpdatesUndefined: Self = StObject.set(x, "optOutAutoNavTextAndTabColorUpdates", js.undefined)
    
    inline def setOptOutNewPlatformSeal(value: String): Self = StObject.set(x, "optOutNewPlatformSeal", value.asInstanceOf[js.Any])
    
    inline def setOptOutNewPlatformSealPlatformMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "optOutNewPlatformSealPlatformMetadata", value.asInstanceOf[js.Any])
    
    inline def setOptOutNewPlatformSealPlatformMetadataUndefined: Self = StObject.set(x, "optOutNewPlatformSealPlatformMetadata", js.undefined)
    
    inline def setOptOutNewPlatformSealUndefined: Self = StObject.set(x, "optOutNewPlatformSeal", js.undefined)
    
    inline def setPhoneAuthRecipientMayProvidePhoneNumber(value: String): Self = StObject.set(x, "phoneAuthRecipientMayProvidePhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneAuthRecipientMayProvidePhoneNumberMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "phoneAuthRecipientMayProvidePhoneNumberMetadata", value.asInstanceOf[js.Any])
    
    inline def setPhoneAuthRecipientMayProvidePhoneNumberMetadataUndefined: Self = StObject.set(x, "phoneAuthRecipientMayProvidePhoneNumberMetadata", js.undefined)
    
    inline def setPhoneAuthRecipientMayProvidePhoneNumberUndefined: Self = StObject.set(x, "phoneAuthRecipientMayProvidePhoneNumber", js.undefined)
    
    inline def setPkiSignDownloadedPDFDocs(value: String): Self = StObject.set(x, "pkiSignDownloadedPDFDocs", value.asInstanceOf[js.Any])
    
    inline def setPkiSignDownloadedPDFDocsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "pkiSignDownloadedPDFDocsMetadata", value.asInstanceOf[js.Any])
    
    inline def setPkiSignDownloadedPDFDocsMetadataUndefined: Self = StObject.set(x, "pkiSignDownloadedPDFDocsMetadata", js.undefined)
    
    inline def setPkiSignDownloadedPDFDocsUndefined: Self = StObject.set(x, "pkiSignDownloadedPDFDocs", js.undefined)
    
    inline def setRecipientSigningAutoNavigationControl(value: String): Self = StObject.set(x, "recipientSigningAutoNavigationControl", value.asInstanceOf[js.Any])
    
    inline def setRecipientSigningAutoNavigationControlMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "recipientSigningAutoNavigationControlMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecipientSigningAutoNavigationControlMetadataUndefined: Self = StObject.set(x, "recipientSigningAutoNavigationControlMetadata", js.undefined)
    
    inline def setRecipientSigningAutoNavigationControlUndefined: Self = StObject.set(x, "recipientSigningAutoNavigationControl", js.undefined)
    
    inline def setRecipientsCanSignOffline(value: String): Self = StObject.set(x, "recipientsCanSignOffline", value.asInstanceOf[js.Any])
    
    inline def setRecipientsCanSignOfflineMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "recipientsCanSignOfflineMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecipientsCanSignOfflineMetadataUndefined: Self = StObject.set(x, "recipientsCanSignOfflineMetadata", js.undefined)
    
    inline def setRecipientsCanSignOfflineUndefined: Self = StObject.set(x, "recipientsCanSignOffline", js.undefined)
    
    inline def setRequire21CFRpt11Compliance(value: String): Self = StObject.set(x, "require21CFRpt11Compliance", value.asInstanceOf[js.Any])
    
    inline def setRequire21CFRpt11ComplianceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "require21CFRpt11ComplianceMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequire21CFRpt11ComplianceMetadataUndefined: Self = StObject.set(x, "require21CFRpt11ComplianceMetadata", js.undefined)
    
    inline def setRequire21CFRpt11ComplianceUndefined: Self = StObject.set(x, "require21CFRpt11Compliance", js.undefined)
    
    inline def setRequireDeclineReason(value: String): Self = StObject.set(x, "requireDeclineReason", value.asInstanceOf[js.Any])
    
    inline def setRequireDeclineReasonMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "requireDeclineReasonMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequireDeclineReasonMetadataUndefined: Self = StObject.set(x, "requireDeclineReasonMetadata", js.undefined)
    
    inline def setRequireDeclineReasonUndefined: Self = StObject.set(x, "requireDeclineReason", js.undefined)
    
    inline def setRequireExternalUserManagement(value: String): Self = StObject.set(x, "requireExternalUserManagement", value.asInstanceOf[js.Any])
    
    inline def setRequireExternalUserManagementMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "requireExternalUserManagementMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequireExternalUserManagementMetadataUndefined: Self = StObject.set(x, "requireExternalUserManagementMetadata", js.undefined)
    
    inline def setRequireExternalUserManagementUndefined: Self = StObject.set(x, "requireExternalUserManagement", js.undefined)
    
    inline def setRequireSignerCertificateType(value: String): Self = StObject.set(x, "requireSignerCertificateType", value.asInstanceOf[js.Any])
    
    inline def setRequireSignerCertificateTypeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "requireSignerCertificateTypeMetadata", value.asInstanceOf[js.Any])
    
    inline def setRequireSignerCertificateTypeMetadataUndefined: Self = StObject.set(x, "requireSignerCertificateTypeMetadata", js.undefined)
    
    inline def setRequireSignerCertificateTypeUndefined: Self = StObject.set(x, "requireSignerCertificateType", js.undefined)
    
    inline def setRsaVeridAccountName(value: String): Self = StObject.set(x, "rsaVeridAccountName", value.asInstanceOf[js.Any])
    
    inline def setRsaVeridAccountNameUndefined: Self = StObject.set(x, "rsaVeridAccountName", js.undefined)
    
    inline def setRsaVeridPassword(value: String): Self = StObject.set(x, "rsaVeridPassword", value.asInstanceOf[js.Any])
    
    inline def setRsaVeridPasswordUndefined: Self = StObject.set(x, "rsaVeridPassword", js.undefined)
    
    inline def setRsaVeridRuleset(value: String): Self = StObject.set(x, "rsaVeridRuleset", value.asInstanceOf[js.Any])
    
    inline def setRsaVeridRulesetUndefined: Self = StObject.set(x, "rsaVeridRuleset", js.undefined)
    
    inline def setRsaVeridUserId(value: String): Self = StObject.set(x, "rsaVeridUserId", value.asInstanceOf[js.Any])
    
    inline def setRsaVeridUserIdUndefined: Self = StObject.set(x, "rsaVeridUserId", js.undefined)
    
    inline def setSelfSignedRecipientEmailDocument(value: String): Self = StObject.set(x, "selfSignedRecipientEmailDocument", value.asInstanceOf[js.Any])
    
    inline def setSelfSignedRecipientEmailDocumentMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "selfSignedRecipientEmailDocumentMetadata", value.asInstanceOf[js.Any])
    
    inline def setSelfSignedRecipientEmailDocumentMetadataUndefined: Self = StObject.set(x, "selfSignedRecipientEmailDocumentMetadata", js.undefined)
    
    inline def setSelfSignedRecipientEmailDocumentUndefined: Self = StObject.set(x, "selfSignedRecipientEmailDocument", js.undefined)
    
    inline def setSelfSignedRecipientEmailDocumentUserOverride(value: String): Self = StObject.set(x, "selfSignedRecipientEmailDocumentUserOverride", value.asInstanceOf[js.Any])
    
    inline def setSelfSignedRecipientEmailDocumentUserOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "selfSignedRecipientEmailDocumentUserOverrideMetadata", value.asInstanceOf[js.Any])
    
    inline def setSelfSignedRecipientEmailDocumentUserOverrideMetadataUndefined: Self = StObject.set(x, "selfSignedRecipientEmailDocumentUserOverrideMetadata", js.undefined)
    
    inline def setSelfSignedRecipientEmailDocumentUserOverrideUndefined: Self = StObject.set(x, "selfSignedRecipientEmailDocumentUserOverride", js.undefined)
    
    inline def setSendToCertifiedDeliveryEnabled(value: String): Self = StObject.set(x, "sendToCertifiedDeliveryEnabled", value.asInstanceOf[js.Any])
    
    inline def setSendToCertifiedDeliveryEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "sendToCertifiedDeliveryEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setSendToCertifiedDeliveryEnabledMetadataUndefined: Self = StObject.set(x, "sendToCertifiedDeliveryEnabledMetadata", js.undefined)
    
    inline def setSendToCertifiedDeliveryEnabledUndefined: Self = StObject.set(x, "sendToCertifiedDeliveryEnabled", js.undefined)
    
    inline def setSenderCanSignInEachLocation(value: String): Self = StObject.set(x, "senderCanSignInEachLocation", value.asInstanceOf[js.Any])
    
    inline def setSenderCanSignInEachLocationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "senderCanSignInEachLocationMetadata", value.asInstanceOf[js.Any])
    
    inline def setSenderCanSignInEachLocationMetadataUndefined: Self = StObject.set(x, "senderCanSignInEachLocationMetadata", js.undefined)
    
    inline def setSenderCanSignInEachLocationUndefined: Self = StObject.set(x, "senderCanSignInEachLocation", js.undefined)
    
    inline def setSenderMustAuthenticateSigning(value: String): Self = StObject.set(x, "senderMustAuthenticateSigning", value.asInstanceOf[js.Any])
    
    inline def setSenderMustAuthenticateSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "senderMustAuthenticateSigningMetadata", value.asInstanceOf[js.Any])
    
    inline def setSenderMustAuthenticateSigningMetadataUndefined: Self = StObject.set(x, "senderMustAuthenticateSigningMetadata", js.undefined)
    
    inline def setSenderMustAuthenticateSigningUndefined: Self = StObject.set(x, "senderMustAuthenticateSigning", js.undefined)
    
    inline def setSendingTagsFontColor(value: String): Self = StObject.set(x, "sendingTagsFontColor", value.asInstanceOf[js.Any])
    
    inline def setSendingTagsFontColorMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "sendingTagsFontColorMetadata", value.asInstanceOf[js.Any])
    
    inline def setSendingTagsFontColorMetadataUndefined: Self = StObject.set(x, "sendingTagsFontColorMetadata", js.undefined)
    
    inline def setSendingTagsFontColorUndefined: Self = StObject.set(x, "sendingTagsFontColor", js.undefined)
    
    inline def setSendingTagsFontName(value: String): Self = StObject.set(x, "sendingTagsFontName", value.asInstanceOf[js.Any])
    
    inline def setSendingTagsFontNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "sendingTagsFontNameMetadata", value.asInstanceOf[js.Any])
    
    inline def setSendingTagsFontNameMetadataUndefined: Self = StObject.set(x, "sendingTagsFontNameMetadata", js.undefined)
    
    inline def setSendingTagsFontNameUndefined: Self = StObject.set(x, "sendingTagsFontName", js.undefined)
    
    inline def setSendingTagsFontSize(value: String): Self = StObject.set(x, "sendingTagsFontSize", value.asInstanceOf[js.Any])
    
    inline def setSendingTagsFontSizeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "sendingTagsFontSizeMetadata", value.asInstanceOf[js.Any])
    
    inline def setSendingTagsFontSizeMetadataUndefined: Self = StObject.set(x, "sendingTagsFontSizeMetadata", js.undefined)
    
    inline def setSendingTagsFontSizeUndefined: Self = StObject.set(x, "sendingTagsFontSize", js.undefined)
    
    inline def setSessionTimeout(value: String): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "sessionTimeoutMetadata", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutMetadataUndefined: Self = StObject.set(x, "sessionTimeoutMetadata", js.undefined)
    
    inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
    
    inline def setSetRecipEmailLang(value: String): Self = StObject.set(x, "setRecipEmailLang", value.asInstanceOf[js.Any])
    
    inline def setSetRecipEmailLangMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "setRecipEmailLangMetadata", value.asInstanceOf[js.Any])
    
    inline def setSetRecipEmailLangMetadataUndefined: Self = StObject.set(x, "setRecipEmailLangMetadata", js.undefined)
    
    inline def setSetRecipEmailLangUndefined: Self = StObject.set(x, "setRecipEmailLang", js.undefined)
    
    inline def setSetRecipSignLang(value: String): Self = StObject.set(x, "setRecipSignLang", value.asInstanceOf[js.Any])
    
    inline def setSetRecipSignLangMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "setRecipSignLangMetadata", value.asInstanceOf[js.Any])
    
    inline def setSetRecipSignLangMetadataUndefined: Self = StObject.set(x, "setRecipSignLangMetadata", js.undefined)
    
    inline def setSetRecipSignLangUndefined: Self = StObject.set(x, "setRecipSignLang", js.undefined)
    
    inline def setSharedTemplateFolders(value: String): Self = StObject.set(x, "sharedTemplateFolders", value.asInstanceOf[js.Any])
    
    inline def setSharedTemplateFoldersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "sharedTemplateFoldersMetadata", value.asInstanceOf[js.Any])
    
    inline def setSharedTemplateFoldersMetadataUndefined: Self = StObject.set(x, "sharedTemplateFoldersMetadata", js.undefined)
    
    inline def setSharedTemplateFoldersUndefined: Self = StObject.set(x, "sharedTemplateFolders", js.undefined)
    
    inline def setShowCompleteDialogInEmbeddedSession(value: String): Self = StObject.set(x, "showCompleteDialogInEmbeddedSession", value.asInstanceOf[js.Any])
    
    inline def setShowCompleteDialogInEmbeddedSessionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "showCompleteDialogInEmbeddedSessionMetadata", value.asInstanceOf[js.Any])
    
    inline def setShowCompleteDialogInEmbeddedSessionMetadataUndefined: Self = StObject.set(x, "showCompleteDialogInEmbeddedSessionMetadata", js.undefined)
    
    inline def setShowCompleteDialogInEmbeddedSessionUndefined: Self = StObject.set(x, "showCompleteDialogInEmbeddedSession", js.undefined)
    
    inline def setShowConditionalRoutingOnSend(value: String): Self = StObject.set(x, "showConditionalRoutingOnSend", value.asInstanceOf[js.Any])
    
    inline def setShowConditionalRoutingOnSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "showConditionalRoutingOnSendMetadata", value.asInstanceOf[js.Any])
    
    inline def setShowConditionalRoutingOnSendMetadataUndefined: Self = StObject.set(x, "showConditionalRoutingOnSendMetadata", js.undefined)
    
    inline def setShowConditionalRoutingOnSendUndefined: Self = StObject.set(x, "showConditionalRoutingOnSend", js.undefined)
    
    inline def setShowInitialConditionalFields(value: String): Self = StObject.set(x, "showInitialConditionalFields", value.asInstanceOf[js.Any])
    
    inline def setShowInitialConditionalFieldsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "showInitialConditionalFieldsMetadata", value.asInstanceOf[js.Any])
    
    inline def setShowInitialConditionalFieldsMetadataUndefined: Self = StObject.set(x, "showInitialConditionalFieldsMetadata", js.undefined)
    
    inline def setShowInitialConditionalFieldsUndefined: Self = StObject.set(x, "showInitialConditionalFields", js.undefined)
    
    inline def setShowLocalizedWatermarks(value: String): Self = StObject.set(x, "showLocalizedWatermarks", value.asInstanceOf[js.Any])
    
    inline def setShowLocalizedWatermarksMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "showLocalizedWatermarksMetadata", value.asInstanceOf[js.Any])
    
    inline def setShowLocalizedWatermarksMetadataUndefined: Self = StObject.set(x, "showLocalizedWatermarksMetadata", js.undefined)
    
    inline def setShowLocalizedWatermarksUndefined: Self = StObject.set(x, "showLocalizedWatermarks", js.undefined)
    
    inline def setShowTutorials(value: String): Self = StObject.set(x, "showTutorials", value.asInstanceOf[js.Any])
    
    inline def setShowTutorialsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "showTutorialsMetadata", value.asInstanceOf[js.Any])
    
    inline def setShowTutorialsMetadataUndefined: Self = StObject.set(x, "showTutorialsMetadata", js.undefined)
    
    inline def setShowTutorialsUndefined: Self = StObject.set(x, "showTutorials", js.undefined)
    
    inline def setSignDateFormat(value: String): Self = StObject.set(x, "signDateFormat", value.asInstanceOf[js.Any])
    
    inline def setSignDateFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signDateFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignDateFormatMetadataUndefined: Self = StObject.set(x, "signDateFormatMetadata", js.undefined)
    
    inline def setSignDateFormatUndefined: Self = StObject.set(x, "signDateFormat", js.undefined)
    
    inline def setSignTimeFormat(value: String): Self = StObject.set(x, "signTimeFormat", value.asInstanceOf[js.Any])
    
    inline def setSignTimeFormatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signTimeFormatMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignTimeFormatMetadataUndefined: Self = StObject.set(x, "signTimeFormatMetadata", js.undefined)
    
    inline def setSignTimeFormatUndefined: Self = StObject.set(x, "signTimeFormat", js.undefined)
    
    inline def setSignTimeShowAmPm(value: String): Self = StObject.set(x, "signTimeShowAmPm", value.asInstanceOf[js.Any])
    
    inline def setSignTimeShowAmPmMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signTimeShowAmPmMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignTimeShowAmPmMetadataUndefined: Self = StObject.set(x, "signTimeShowAmPmMetadata", js.undefined)
    
    inline def setSignTimeShowAmPmUndefined: Self = StObject.set(x, "signTimeShowAmPm", js.undefined)
    
    inline def setSignatureProviders(value: js.Array[String]): Self = StObject.set(x, "signatureProviders", value.asInstanceOf[js.Any])
    
    inline def setSignatureProvidersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signatureProvidersMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignatureProvidersMetadataUndefined: Self = StObject.set(x, "signatureProvidersMetadata", js.undefined)
    
    inline def setSignatureProvidersUndefined: Self = StObject.set(x, "signatureProviders", js.undefined)
    
    inline def setSignatureProvidersVarargs(value: String*): Self = StObject.set(x, "signatureProviders", js.Array(value*))
    
    inline def setSignerAttachCertificateToEnvelopePDF(value: String): Self = StObject.set(x, "signerAttachCertificateToEnvelopePDF", value.asInstanceOf[js.Any])
    
    inline def setSignerAttachCertificateToEnvelopePDFMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerAttachCertificateToEnvelopePDFMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerAttachCertificateToEnvelopePDFMetadataUndefined: Self = StObject.set(x, "signerAttachCertificateToEnvelopePDFMetadata", js.undefined)
    
    inline def setSignerAttachCertificateToEnvelopePDFUndefined: Self = StObject.set(x, "signerAttachCertificateToEnvelopePDF", js.undefined)
    
    inline def setSignerAttachConcat(value: String): Self = StObject.set(x, "signerAttachConcat", value.asInstanceOf[js.Any])
    
    inline def setSignerAttachConcatMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerAttachConcatMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerAttachConcatMetadataUndefined: Self = StObject.set(x, "signerAttachConcatMetadata", js.undefined)
    
    inline def setSignerAttachConcatUndefined: Self = StObject.set(x, "signerAttachConcat", js.undefined)
    
    inline def setSignerCanCreateAccount(value: String): Self = StObject.set(x, "signerCanCreateAccount", value.asInstanceOf[js.Any])
    
    inline def setSignerCanCreateAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerCanCreateAccountMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerCanCreateAccountMetadataUndefined: Self = StObject.set(x, "signerCanCreateAccountMetadata", js.undefined)
    
    inline def setSignerCanCreateAccountUndefined: Self = StObject.set(x, "signerCanCreateAccount", js.undefined)
    
    inline def setSignerCanSignOnMobile(value: String): Self = StObject.set(x, "signerCanSignOnMobile", value.asInstanceOf[js.Any])
    
    inline def setSignerCanSignOnMobileMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerCanSignOnMobileMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerCanSignOnMobileMetadataUndefined: Self = StObject.set(x, "signerCanSignOnMobileMetadata", js.undefined)
    
    inline def setSignerCanSignOnMobileUndefined: Self = StObject.set(x, "signerCanSignOnMobile", js.undefined)
    
    inline def setSignerInSessionUseEnvelopeCompleteEmail(value: String): Self = StObject.set(x, "signerInSessionUseEnvelopeCompleteEmail", value.asInstanceOf[js.Any])
    
    inline def setSignerInSessionUseEnvelopeCompleteEmailMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerInSessionUseEnvelopeCompleteEmailMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerInSessionUseEnvelopeCompleteEmailMetadataUndefined: Self = StObject.set(x, "signerInSessionUseEnvelopeCompleteEmailMetadata", js.undefined)
    
    inline def setSignerInSessionUseEnvelopeCompleteEmailUndefined: Self = StObject.set(x, "signerInSessionUseEnvelopeCompleteEmail", js.undefined)
    
    inline def setSignerLoginRequirements(value: String): Self = StObject.set(x, "signerLoginRequirements", value.asInstanceOf[js.Any])
    
    inline def setSignerLoginRequirementsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerLoginRequirementsMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerLoginRequirementsMetadataUndefined: Self = StObject.set(x, "signerLoginRequirementsMetadata", js.undefined)
    
    inline def setSignerLoginRequirementsUndefined: Self = StObject.set(x, "signerLoginRequirements", js.undefined)
    
    inline def setSignerMustHaveAccount(value: String): Self = StObject.set(x, "signerMustHaveAccount", value.asInstanceOf[js.Any])
    
    inline def setSignerMustHaveAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerMustHaveAccountMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerMustHaveAccountMetadataUndefined: Self = StObject.set(x, "signerMustHaveAccountMetadata", js.undefined)
    
    inline def setSignerMustHaveAccountUndefined: Self = StObject.set(x, "signerMustHaveAccount", js.undefined)
    
    inline def setSignerMustLoginToSign(value: String): Self = StObject.set(x, "signerMustLoginToSign", value.asInstanceOf[js.Any])
    
    inline def setSignerMustLoginToSignMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerMustLoginToSignMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerMustLoginToSignMetadataUndefined: Self = StObject.set(x, "signerMustLoginToSignMetadata", js.undefined)
    
    inline def setSignerMustLoginToSignUndefined: Self = StObject.set(x, "signerMustLoginToSign", js.undefined)
    
    inline def setSignerShowSecureFieldInitialValues(value: String): Self = StObject.set(x, "signerShowSecureFieldInitialValues", value.asInstanceOf[js.Any])
    
    inline def setSignerShowSecureFieldInitialValuesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signerShowSecureFieldInitialValuesMetadata", value.asInstanceOf[js.Any])
    
    inline def setSignerShowSecureFieldInitialValuesMetadataUndefined: Self = StObject.set(x, "signerShowSecureFieldInitialValuesMetadata", js.undefined)
    
    inline def setSignerShowSecureFieldInitialValuesUndefined: Self = StObject.set(x, "signerShowSecureFieldInitialValues", js.undefined)
    
    inline def setSigningSessionTimeout(value: String): Self = StObject.set(x, "signingSessionTimeout", value.asInstanceOf[js.Any])
    
    inline def setSigningSessionTimeoutMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signingSessionTimeoutMetadata", value.asInstanceOf[js.Any])
    
    inline def setSigningSessionTimeoutMetadataUndefined: Self = StObject.set(x, "signingSessionTimeoutMetadata", js.undefined)
    
    inline def setSigningSessionTimeoutUndefined: Self = StObject.set(x, "signingSessionTimeout", js.undefined)
    
    inline def setSigningUiVersion(value: String): Self = StObject.set(x, "signingUiVersion", value.asInstanceOf[js.Any])
    
    inline def setSigningUiVersionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signingUiVersionMetadata", value.asInstanceOf[js.Any])
    
    inline def setSigningUiVersionMetadataUndefined: Self = StObject.set(x, "signingUiVersionMetadata", js.undefined)
    
    inline def setSigningUiVersionUndefined: Self = StObject.set(x, "signingUiVersion", js.undefined)
    
    inline def setSimplifiedSendingEnabled(value: String): Self = StObject.set(x, "simplifiedSendingEnabled", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedSendingEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "simplifiedSendingEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setSimplifiedSendingEnabledMetadataUndefined: Self = StObject.set(x, "simplifiedSendingEnabledMetadata", js.undefined)
    
    inline def setSimplifiedSendingEnabledUndefined: Self = StObject.set(x, "simplifiedSendingEnabled", js.undefined)
    
    inline def setSingleSignOnEnabled(value: String): Self = StObject.set(x, "singleSignOnEnabled", value.asInstanceOf[js.Any])
    
    inline def setSingleSignOnEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "singleSignOnEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setSingleSignOnEnabledMetadataUndefined: Self = StObject.set(x, "singleSignOnEnabledMetadata", js.undefined)
    
    inline def setSingleSignOnEnabledUndefined: Self = StObject.set(x, "singleSignOnEnabled", js.undefined)
    
    inline def setSkipAuthCompletedEnvelopes(value: String): Self = StObject.set(x, "skipAuthCompletedEnvelopes", value.asInstanceOf[js.Any])
    
    inline def setSkipAuthCompletedEnvelopesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "skipAuthCompletedEnvelopesMetadata", value.asInstanceOf[js.Any])
    
    inline def setSkipAuthCompletedEnvelopesMetadataUndefined: Self = StObject.set(x, "skipAuthCompletedEnvelopesMetadata", js.undefined)
    
    inline def setSkipAuthCompletedEnvelopesUndefined: Self = StObject.set(x, "skipAuthCompletedEnvelopes", js.undefined)
    
    inline def setSocialIdRecipAuth(value: String): Self = StObject.set(x, "socialIdRecipAuth", value.asInstanceOf[js.Any])
    
    inline def setSocialIdRecipAuthMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "socialIdRecipAuthMetadata", value.asInstanceOf[js.Any])
    
    inline def setSocialIdRecipAuthMetadataUndefined: Self = StObject.set(x, "socialIdRecipAuthMetadata", js.undefined)
    
    inline def setSocialIdRecipAuthUndefined: Self = StObject.set(x, "socialIdRecipAuth", js.undefined)
    
    inline def setSpecifyDocumentVisibility(value: String): Self = StObject.set(x, "specifyDocumentVisibility", value.asInstanceOf[js.Any])
    
    inline def setSpecifyDocumentVisibilityMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "specifyDocumentVisibilityMetadata", value.asInstanceOf[js.Any])
    
    inline def setSpecifyDocumentVisibilityMetadataUndefined: Self = StObject.set(x, "specifyDocumentVisibilityMetadata", js.undefined)
    
    inline def setSpecifyDocumentVisibilityUndefined: Self = StObject.set(x, "specifyDocumentVisibility", js.undefined)
    
    inline def setStartInAdvancedCorrect(value: String): Self = StObject.set(x, "startInAdvancedCorrect", value.asInstanceOf[js.Any])
    
    inline def setStartInAdvancedCorrectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "startInAdvancedCorrectMetadata", value.asInstanceOf[js.Any])
    
    inline def setStartInAdvancedCorrectMetadataUndefined: Self = StObject.set(x, "startInAdvancedCorrectMetadata", js.undefined)
    
    inline def setStartInAdvancedCorrectUndefined: Self = StObject.set(x, "startInAdvancedCorrect", js.undefined)
    
    inline def setSupplementalDocumentsMustAccept(value: String): Self = StObject.set(x, "supplementalDocumentsMustAccept", value.asInstanceOf[js.Any])
    
    inline def setSupplementalDocumentsMustAcceptMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "supplementalDocumentsMustAcceptMetadata", value.asInstanceOf[js.Any])
    
    inline def setSupplementalDocumentsMustAcceptMetadataUndefined: Self = StObject.set(x, "supplementalDocumentsMustAcceptMetadata", js.undefined)
    
    inline def setSupplementalDocumentsMustAcceptUndefined: Self = StObject.set(x, "supplementalDocumentsMustAccept", js.undefined)
    
    inline def setSupplementalDocumentsMustRead(value: String): Self = StObject.set(x, "supplementalDocumentsMustRead", value.asInstanceOf[js.Any])
    
    inline def setSupplementalDocumentsMustReadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "supplementalDocumentsMustReadMetadata", value.asInstanceOf[js.Any])
    
    inline def setSupplementalDocumentsMustReadMetadataUndefined: Self = StObject.set(x, "supplementalDocumentsMustReadMetadata", js.undefined)
    
    inline def setSupplementalDocumentsMustReadUndefined: Self = StObject.set(x, "supplementalDocumentsMustRead", js.undefined)
    
    inline def setSupplementalDocumentsMustView(value: String): Self = StObject.set(x, "supplementalDocumentsMustView", value.asInstanceOf[js.Any])
    
    inline def setSupplementalDocumentsMustViewMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "supplementalDocumentsMustViewMetadata", value.asInstanceOf[js.Any])
    
    inline def setSupplementalDocumentsMustViewMetadataUndefined: Self = StObject.set(x, "supplementalDocumentsMustViewMetadata", js.undefined)
    
    inline def setSupplementalDocumentsMustViewUndefined: Self = StObject.set(x, "supplementalDocumentsMustView", js.undefined)
    
    inline def setSuppressCertificateEnforcement(value: String): Self = StObject.set(x, "suppressCertificateEnforcement", value.asInstanceOf[js.Any])
    
    inline def setSuppressCertificateEnforcementMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "suppressCertificateEnforcementMetadata", value.asInstanceOf[js.Any])
    
    inline def setSuppressCertificateEnforcementMetadataUndefined: Self = StObject.set(x, "suppressCertificateEnforcementMetadata", js.undefined)
    
    inline def setSuppressCertificateEnforcementUndefined: Self = StObject.set(x, "suppressCertificateEnforcement", js.undefined)
    
    inline def setTabAccountSettings(value: TabAccountSettings): Self = StObject.set(x, "tabAccountSettings", value.asInstanceOf[js.Any])
    
    inline def setTabAccountSettingsUndefined: Self = StObject.set(x, "tabAccountSettings", js.undefined)
    
    inline def setTimezoneOffsetAPI(value: String): Self = StObject.set(x, "timezoneOffsetAPI", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetAPIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timezoneOffsetAPIMetadata", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetAPIMetadataUndefined: Self = StObject.set(x, "timezoneOffsetAPIMetadata", js.undefined)
    
    inline def setTimezoneOffsetAPIUndefined: Self = StObject.set(x, "timezoneOffsetAPI", js.undefined)
    
    inline def setTimezoneOffsetUI(value: String): Self = StObject.set(x, "timezoneOffsetUI", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "timezoneOffsetUIMetadata", value.asInstanceOf[js.Any])
    
    inline def setTimezoneOffsetUIMetadataUndefined: Self = StObject.set(x, "timezoneOffsetUIMetadata", js.undefined)
    
    inline def setTimezoneOffsetUIUndefined: Self = StObject.set(x, "timezoneOffsetUI", js.undefined)
    
    inline def setUniversalSignatureOptIn(value: String): Self = StObject.set(x, "universalSignatureOptIn", value.asInstanceOf[js.Any])
    
    inline def setUniversalSignatureOptInUndefined: Self = StObject.set(x, "universalSignatureOptIn", js.undefined)
    
    inline def setUseAccountLevelEmail(value: String): Self = StObject.set(x, "useAccountLevelEmail", value.asInstanceOf[js.Any])
    
    inline def setUseAccountLevelEmailMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useAccountLevelEmailMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseAccountLevelEmailMetadataUndefined: Self = StObject.set(x, "useAccountLevelEmailMetadata", js.undefined)
    
    inline def setUseAccountLevelEmailUndefined: Self = StObject.set(x, "useAccountLevelEmail", js.undefined)
    
    inline def setUseConsumerDisclosure(value: String): Self = StObject.set(x, "useConsumerDisclosure", value.asInstanceOf[js.Any])
    
    inline def setUseConsumerDisclosureMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useConsumerDisclosureMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseConsumerDisclosureMetadataUndefined: Self = StObject.set(x, "useConsumerDisclosureMetadata", js.undefined)
    
    inline def setUseConsumerDisclosureUndefined: Self = StObject.set(x, "useConsumerDisclosure", js.undefined)
    
    inline def setUseConsumerDisclosureWithinAccount(value: String): Self = StObject.set(x, "useConsumerDisclosureWithinAccount", value.asInstanceOf[js.Any])
    
    inline def setUseConsumerDisclosureWithinAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useConsumerDisclosureWithinAccountMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseConsumerDisclosureWithinAccountMetadataUndefined: Self = StObject.set(x, "useConsumerDisclosureWithinAccountMetadata", js.undefined)
    
    inline def setUseConsumerDisclosureWithinAccountUndefined: Self = StObject.set(x, "useConsumerDisclosureWithinAccount", js.undefined)
    
    inline def setUseDerivedKeys(value: String): Self = StObject.set(x, "useDerivedKeys", value.asInstanceOf[js.Any])
    
    inline def setUseDerivedKeysMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useDerivedKeysMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseDerivedKeysMetadataUndefined: Self = StObject.set(x, "useDerivedKeysMetadata", js.undefined)
    
    inline def setUseDerivedKeysUndefined: Self = StObject.set(x, "useDerivedKeys", js.undefined)
    
    inline def setUseDocuSignExpressSignerCertificate(value: String): Self = StObject.set(x, "useDocuSignExpressSignerCertificate", value.asInstanceOf[js.Any])
    
    inline def setUseDocuSignExpressSignerCertificateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useDocuSignExpressSignerCertificateMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseDocuSignExpressSignerCertificateMetadataUndefined: Self = StObject.set(x, "useDocuSignExpressSignerCertificateMetadata", js.undefined)
    
    inline def setUseDocuSignExpressSignerCertificateUndefined: Self = StObject.set(x, "useDocuSignExpressSignerCertificate", js.undefined)
    
    inline def setUseMultiAppGroupsData(value: String): Self = StObject.set(x, "useMultiAppGroupsData", value.asInstanceOf[js.Any])
    
    inline def setUseMultiAppGroupsDataMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useMultiAppGroupsDataMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseMultiAppGroupsDataMetadataUndefined: Self = StObject.set(x, "useMultiAppGroupsDataMetadata", js.undefined)
    
    inline def setUseMultiAppGroupsDataUndefined: Self = StObject.set(x, "useMultiAppGroupsData", js.undefined)
    
    inline def setUseNewBlobForPdf(value: String): Self = StObject.set(x, "useNewBlobForPdf", value.asInstanceOf[js.Any])
    
    inline def setUseNewBlobForPdfMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useNewBlobForPdfMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseNewBlobForPdfMetadataUndefined: Self = StObject.set(x, "useNewBlobForPdfMetadata", js.undefined)
    
    inline def setUseNewBlobForPdfUndefined: Self = StObject.set(x, "useNewBlobForPdf", js.undefined)
    
    inline def setUseSAFESignerCertificates(value: String): Self = StObject.set(x, "useSAFESignerCertificates", value.asInstanceOf[js.Any])
    
    inline def setUseSAFESignerCertificatesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useSAFESignerCertificatesMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseSAFESignerCertificatesMetadataUndefined: Self = StObject.set(x, "useSAFESignerCertificatesMetadata", js.undefined)
    
    inline def setUseSAFESignerCertificatesUndefined: Self = StObject.set(x, "useSAFESignerCertificates", js.undefined)
    
    inline def setUseSignatureProviderPlatform(value: String): Self = StObject.set(x, "useSignatureProviderPlatform", value.asInstanceOf[js.Any])
    
    inline def setUseSignatureProviderPlatformMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useSignatureProviderPlatformMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseSignatureProviderPlatformMetadataUndefined: Self = StObject.set(x, "useSignatureProviderPlatformMetadata", js.undefined)
    
    inline def setUseSignatureProviderPlatformUndefined: Self = StObject.set(x, "useSignatureProviderPlatform", js.undefined)
    
    inline def setUsesAPI(value: String): Self = StObject.set(x, "usesAPI", value.asInstanceOf[js.Any])
    
    inline def setUsesAPIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "usesAPIMetadata", value.asInstanceOf[js.Any])
    
    inline def setUsesAPIMetadataUndefined: Self = StObject.set(x, "usesAPIMetadata", js.undefined)
    
    inline def setUsesAPIUndefined: Self = StObject.set(x, "usesAPI", js.undefined)
    
    inline def setValidationsAllowed(value: String): Self = StObject.set(x, "validationsAllowed", value.asInstanceOf[js.Any])
    
    inline def setValidationsAllowedMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "validationsAllowedMetadata", value.asInstanceOf[js.Any])
    
    inline def setValidationsAllowedMetadataUndefined: Self = StObject.set(x, "validationsAllowedMetadata", js.undefined)
    
    inline def setValidationsAllowedUndefined: Self = StObject.set(x, "validationsAllowed", js.undefined)
    
    inline def setValidationsBrand(value: String): Self = StObject.set(x, "validationsBrand", value.asInstanceOf[js.Any])
    
    inline def setValidationsBrandMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "validationsBrandMetadata", value.asInstanceOf[js.Any])
    
    inline def setValidationsBrandMetadataUndefined: Self = StObject.set(x, "validationsBrandMetadata", js.undefined)
    
    inline def setValidationsBrandUndefined: Self = StObject.set(x, "validationsBrand", js.undefined)
    
    inline def setValidationsCadence(value: String): Self = StObject.set(x, "validationsCadence", value.asInstanceOf[js.Any])
    
    inline def setValidationsCadenceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "validationsCadenceMetadata", value.asInstanceOf[js.Any])
    
    inline def setValidationsCadenceMetadataUndefined: Self = StObject.set(x, "validationsCadenceMetadata", js.undefined)
    
    inline def setValidationsCadenceUndefined: Self = StObject.set(x, "validationsCadence", js.undefined)
    
    inline def setValidationsEnabled(value: String): Self = StObject.set(x, "validationsEnabled", value.asInstanceOf[js.Any])
    
    inline def setValidationsEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "validationsEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setValidationsEnabledMetadataUndefined: Self = StObject.set(x, "validationsEnabledMetadata", js.undefined)
    
    inline def setValidationsEnabledUndefined: Self = StObject.set(x, "validationsEnabled", js.undefined)
    
    inline def setValidationsReport(value: String): Self = StObject.set(x, "validationsReport", value.asInstanceOf[js.Any])
    
    inline def setValidationsReportMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "validationsReportMetadata", value.asInstanceOf[js.Any])
    
    inline def setValidationsReportMetadataUndefined: Self = StObject.set(x, "validationsReportMetadata", js.undefined)
    
    inline def setValidationsReportUndefined: Self = StObject.set(x, "validationsReport", js.undefined)
    
    inline def setWaterMarkEnabled(value: String): Self = StObject.set(x, "waterMarkEnabled", value.asInstanceOf[js.Any])
    
    inline def setWaterMarkEnabledMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "waterMarkEnabledMetadata", value.asInstanceOf[js.Any])
    
    inline def setWaterMarkEnabledMetadataUndefined: Self = StObject.set(x, "waterMarkEnabledMetadata", js.undefined)
    
    inline def setWaterMarkEnabledUndefined: Self = StObject.set(x, "waterMarkEnabled", js.undefined)
    
    inline def setWriteReminderToEnvelopeHistory(value: String): Self = StObject.set(x, "writeReminderToEnvelopeHistory", value.asInstanceOf[js.Any])
    
    inline def setWriteReminderToEnvelopeHistoryMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "writeReminderToEnvelopeHistoryMetadata", value.asInstanceOf[js.Any])
    
    inline def setWriteReminderToEnvelopeHistoryMetadataUndefined: Self = StObject.set(x, "writeReminderToEnvelopeHistoryMetadata", js.undefined)
    
    inline def setWriteReminderToEnvelopeHistoryUndefined: Self = StObject.set(x, "writeReminderToEnvelopeHistory", js.undefined)
    
    inline def setWurflMinAllowableScreenSize(value: String): Self = StObject.set(x, "wurflMinAllowableScreenSize", value.asInstanceOf[js.Any])
    
    inline def setWurflMinAllowableScreenSizeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "wurflMinAllowableScreenSizeMetadata", value.asInstanceOf[js.Any])
    
    inline def setWurflMinAllowableScreenSizeMetadataUndefined: Self = StObject.set(x, "wurflMinAllowableScreenSizeMetadata", js.undefined)
    
    inline def setWurflMinAllowableScreenSizeUndefined: Self = StObject.set(x, "wurflMinAllowableScreenSize", js.undefined)
  }
}
