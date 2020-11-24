package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserSettingsInformation extends js.Object {
  
  /**
    * Describes which account management capabilities a user has.
    */
  var accountManagementGranular: js.UndefOr[
    /* Describes which account management capabilities a user has. */ UserAccountManagementGranularInformation
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var adminOnly: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var adminOnlyMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the API returns suggested tabs for documents for this user.
    */
  var allowAutoTagging: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, this user can participate in envelope transfers on the account.
    */
  var allowEnvelopeTransferTo: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var allowEnvelopeTransferToMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can create [electronic seal recipients][eseal].
    *
    * [eseal]: /esign/restapi//Envelopes/EnvelopeRecipients#seal-recipient
    */
  var allowEsealRecipients: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `allowEsealRecipientsMetadata` property.
    */
  var allowEsealRecipientsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true** and this user is an administrator, they can view all of the envelopes generated from PowerForms. The default value is **false**.
    */
  var allowPowerFormsAdminToAccessAllPowerFormEnvelope: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata` property.
    */
  var allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can set the language used in the standard email format for a recipient when creating an envelope.
    */
  var allowRecipientLanguageSelection: js.UndefOr[String] = js.native
  
  /**
    * Metadata for allowRecipientLanguageSelection.
    */
  var allowRecipientLanguageSelectionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can send envelopes "on behalf of" other users through the API.
    */
  var allowSendOnBehalfOf: js.UndefOr[String] = js.native
  
  /**
    * Metadata for allowSendOnBehalfOf.
    */
  var allowSendOnBehalfOfMetadata: js.UndefOr[
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
  
  /**
    * Reserved for DocuSign.
    *
    */
  var anchorTagVersionedPlacementEnabled: js.UndefOr[String] = js.native
  
  /**
    * When **true**, indicates that this user can send envelope-specific API requests on the account.
    */
  var apiAccountWideAccess: js.UndefOr[String] = js.native
  
  /**
    * Metadata for apiAccountWideAccess.
    */
  var apiAccountWideAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can export authoritative copy for the account.
    */
  var apiCanExportAC: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `apiCanExportACMetadata` property.
    */
  var apiCanExportACMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can use the bulk send feature for the account.
    */
  var bulkSend: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `bulkSend` property is editable.
    *
    */
  var bulkSendMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canChargeAccount: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canChargeAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When true, this user can edit the shared address book for the account.
    */
  var canEditSharedAddressbook: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canEditSharedAddressbookMetadata` property.
    */
  var canEditSharedAddressbookMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can lock envelopes.
    */
  var canLockEnvelopes: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canLockEnvelopes` property.
    */
  var canLockEnvelopesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user is an administrator for the account.
    */
  var canManageAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canManageAccountMetadata` property.
    */
  var canManageAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canManageDistributor: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canManageDistributor` property.
    */
  var canManageDistributorMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can manage templates for the account.
    */
  var canManageTemplates: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canManageTemplates` property.
    */
  var canManageTemplatesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can send API requests on the account.
    */
  var canSendAPIRequests: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canSendAPIRequests` property.
    */
  var canSendAPIRequestsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can send envelopes on the account.
    */
  var canSendEnvelope: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canSendEnvelope` property.
    */
  var canSendEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can sign envelopes.
    */
  var canSignEnvelope: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canSignEnvelope` property.
    */
  var canSignEnvelopeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, this user can use a scratchpad to edit information.
    */
  var canUseScratchpad: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `canUseScratchpad` property.
    */
  var canUseScratchpadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canUseSmartContracts: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canUseSmartContractsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user is prohibited from uploading documents during sending.
    */
  var disableDocumentUpload: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableDocumentUpload` property is editable.
    *
    */
  var disableDocumentUploadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user can access the **Other Actions** menu.
    */
  var disableOtherActions: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `disableOtherActions` property is editable.
    *
    */
  var disableOtherActionsMetadata: js.UndefOr[
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
    * When set to **true**, a user can override the default default account setting for the Sign on Paper option, which specifies whether signers can sign
    * documents on paper as an option to signing electronically.
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
    * When **true**, this user can use the signing attachments feature.
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
    * When set to **false**, this user can apply tabs to documents during the sending experience.
    */
  var expressSendOnly: js.UndefOr[String] = js.native
  
  /**
    * The user's locale code. Valid values are:
    * - `zh_CN`
    * - `zh_TW`
    * - `nl`
    * - `en`
    * - `fr`
    * - `de`
    * - `it`
    * - `ja`
    * - `ko`
    * - `pt`
    * - `pt_BR`
    * - `ru`
    * - `es`
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `locale` property.
    */
  var localeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var localePolicy: js.UndefOr[LocalePolicy] = js.native
  
  /**
    * When set to **true**, this user can create and manage [Clickwraps](https://developers.docusign.com/click-api).
    */
  var manageClickwrapsMode: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `manageClickwrapsMode` property.
    */
  var manageClickwrapsModeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The user id (GUID) of the user who last modified this user record.
    */
  var modifiedBy: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `modifiedBy` property.
    */
  var modifiedByMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The date on which this user record was last modified.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `modifiedDate` property.
    */
  var modifiedDateMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Note referencing the page that modified this user record.
    */
  var modifiedPage: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `modifiedPage` property.
    */
  var modifiedPageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var newSendUI: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `newSendUI` property.
    */
  var newSendUIMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Indicates the Power Form mode setting for the user:
    * - `none`
    * - `admin`
    * - `user`
    */
  var powerFormMode: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `powerFormMode` property.
    */
  var powerFormModeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, this user receives notifications when envelopes are viewed.
    */
  var recipientViewedNotification: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `recipientViewedNotification` property.
    */
  var recipientViewedNotificationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Information about the seals associated with this user.
    */
  var sealIdentifiers: js.UndefOr[js.Array[SealIdentifier]] = js.native
  
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
    *
    * An array of email notifications that sets the email the user receives when they are a sender. When the specific email notification is set to true,
    * the user will receive those types of email notifications from DocuSign.
    *
    * The user inherits the default account sender email notification settings when the user is created. The email notifications are:
    *
    * * envelopeComplete
    * * changedSigner
    * * senderEnvelopeDeclined
    * * withdrawnConsent
    * * recipientViewed
    * * deliveryFailed
    *
    */
  var senderEmailNotifications: js.UndefOr[
    /* Contains the settings for the email notifications that senders receive about the envelopes that they send. */ SenderEmailNotifications
  ] = js.native
  
  /**
    * An array of email notifications that specifies the email the user receives when they are a sender. When the specific email notification is set to true,
    * the user receives those types of email notifications from DocuSign. The user inherits the default account sender email notification settings when the user is created.
    */
  var signerEmailNotifications: js.UndefOr[
    /* An array of email notifications that specifies the email the user receives when they are a sender.
    When the specific email notification is set to true, the user receives those types of email notifications from DocuSign.
    The user inherits the default account sender email notification settings when the user is created. */ SignerEmailNotifications
  ] = js.native
  
  /**
    * When **true**, this user gets supplemental documents when downloading documents.
    */
  var supplementalDocumentIncludeInDownload: js.UndefOr[String] = js.native
  
  /**
    * When **true**, this user must accept supplemental documents.
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
    * When **true**, this user must both view and accept supplemental documents.
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
    * When **true**, this user must view supplemental documents.
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
    * When set to **true**, a new template is created each time the user sends an envelope.
    */
  var templateActiveCreation: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `templateActiveCreation` property.
    */
  var templateActiveCreationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the system notifies this user before applying a matching template.
    */
  var templateApplyNotify: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `templateApplyNotify` property.
    */
  var templateApplyNotifyMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When set to **true**, the system automatically applies a matching template to a document if only one template matches.
    * If there are multiple matches, it displays a list of matches to select from.
    */
  var templateAutoMatching: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `templateAutoMatching` property.
    */
  var templateAutoMatchingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Percentage used when matching templates.
    */
  var templateMatchingSensitivity: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `tempalteMatchingSensitivity` property.
    */
  var templateMatchingSensitivityMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users see template matching functionality.
    */
  var templatePageLevelMatching: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `templatePageLevelMatching` property.
    */
  var templatePageLevelMatchingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When true, daylight savings time is in effect for this user's time zone.
    */
  var timezoneDST: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `timezoneDST` property.
    */
  var timezoneDSTMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The custom DateTime format setting for this user.
    */
  var timezoneMask: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `timezoneMask` property.
    */
  var timezoneMaskMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The timezone offset for the user. Valid values:
    * - `tz_01_afghanistan`
    * - `tz_02_alaskan`
    * - `tz_03_arab`
    * - `tz_04_arabian`
    * - `tz_05_arabic`
    * - `tz_06_argentina`
    * - `tz_07_atlantic`
    * - `tz_08_aus_central`
    * - `tz_09_aus_eastern`
    * - `tz_10_azerbaijan`
    * - `tz_11_azores`
    * - `tz_12_bangladesh`
    * - `tz_13_canada_central`
    * - `tz_14_cape_verde`
    * - `tz_15_caucasus`
    * - `tz_16_central_australia`
    * - `tz_17_central_america`
    * - `tz_18_central_asia`
    * - `tz_19_central_brazilian`
    * - `tz_20_central_europe`
    * - `tz_21_central_european`
    * - `tz_22_central_pacific`
    * - `tz_23_central`
    * - `tz_24_central_mexico`
    * - `tz_25_china`
    * - `tz_26_dateline`
    * - `tz_27_east_africa`
    * - `tz_28_east_australia`
    * - `tz_29_east_europe`
    * - `tz_30_east_south_america`
    * - `tz_31_eastern`
    * - `tz_32_egypt`
    * - `tz_33_ekaterinburg`
    * - `tz_34_fiji`
    * - `tz_35_fli`
    * - `tz_36_georgian`
    * - `tz_37_gmt`
    * - `tz_38_greenland`
    * - `tz_39_greenwich`
    * - `tz_40_gtb`
    * - `tz_41_hawaiian`
    * - `tz_42_india`
    * - `tz_43_iran`
    * - `tz_44_israel`
    * - `tz_45_jordan`
    * - `tz_46_kaliningrad`
    * - `tz_47_kamchatka`
    * - `tz_48_korea`
    * - `tz_49_magadan`
    * - `tz_50_mauritius`
    * - `tz_51_mid_atlantic`
    * - `tz_52_middle_east`
    * - `tz_53_montevideo`
    * - `tz_54_morocco`
    * - `tz_55_mountain`
    * - `tz_56_mountain_mexico`
    * - `tz_57_myanmar`
    * - `tz_58_north_central_asia`
    * - `tz_59_namibia`
    * - `tz_60_nepal`
    * - `tz_61_new_zealand`
    * - `tz_62_new_foundland`
    * - `tz_63_north_asia_east`
    * - `tz_64_north_asia`
    * - `tz_65_pacific_sa`
    * - `tz_66_pacific`
    * - `tz_67_pacific_mexico`
    * - `tz_68_pakistan`
    * - `tz_69_paraguay`
    * - `tz_70_romance`
    * - `tz_71_russian`
    * - `tz_72_sa_eastern`
    * - `tz_73_sa_pacific`
    * - `tz_74_sa_western`
    * - `tz_75_samoa`
    * - `tz_76_se_asia`
    * - `tz_77_singapore`
    * - `tz_78_south_africa`
    * - `tz_79_sriLanka`
    * - `tz_80_syria`
    * - `tz_81_taipei`
    * - `tz_82_tasmania`
    * - `tz_83_tokyo`
    * - `tz_84_tonga`
    * - `tz_85_turkey`
    * - `tz_86_ulaanbaatar`
    * - `tz_87_us_eastern`
    * - `tz_88_us_mountain`
    * - `tz_89_venezuela`
    * - `tz_90_vladivostok`
    * - `tz_91_west_australia`
    * - `tz_92_west_central_africa`
    * - `tz_93_west_europe`
    * - `tz_94_west_asia`
    * - `tz_95_west_pacific`
    * - `tz_96_yakutsk`
    */
  var timezoneOffset: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `timezoneOffset` property.
    */
  var timezoneOffsetMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var timezoneSendingPref: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var timezoneSendingPrefMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var timezoneSigningPref: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var timezoneSigningPrefMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var transactionPointSiteNameURL: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var transactionPointSiteNameURLMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var transactionPointUserName: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var transactionPointUserNameMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Indicates the specified Vaulting mode:
    * - `none`
    * - `estored`
    * - `electronic_original`
    */
  var vaultingMode: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the `vaultingMode` property.
    */
  var vaultingModeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object UserSettingsInformation {
  
  @scala.inline
  def apply(): UserSettingsInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSettingsInformation]
  }
  
  @scala.inline
  implicit class UserSettingsInformationOps[Self <: UserSettingsInformation] (val x: Self) extends AnyVal {
    
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
    def setAccountManagementGranular(
      value: /* Describes which account management capabilities a user has. */ UserAccountManagementGranularInformation
    ): Self = this.set("accountManagementGranular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountManagementGranular: Self = this.set("accountManagementGranular", js.undefined)
    
    @scala.inline
    def setAdminOnly(value: String): Self = this.set("adminOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminOnly: Self = this.set("adminOnly", js.undefined)
    
    @scala.inline
    def setAdminOnlyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("adminOnlyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdminOnlyMetadata: Self = this.set("adminOnlyMetadata", js.undefined)
    
    @scala.inline
    def setAllowAutoTagging(value: String): Self = this.set("allowAutoTagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoTagging: Self = this.set("allowAutoTagging", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeTransferTo(value: String): Self = this.set("allowEnvelopeTransferTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeTransferTo: Self = this.set("allowEnvelopeTransferTo", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeTransferToMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEnvelopeTransferToMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeTransferToMetadata: Self = this.set("allowEnvelopeTransferToMetadata", js.undefined)
    
    @scala.inline
    def setAllowEsealRecipients(value: String): Self = this.set("allowEsealRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEsealRecipients: Self = this.set("allowEsealRecipients", js.undefined)
    
    @scala.inline
    def setAllowEsealRecipientsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEsealRecipientsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEsealRecipientsMetadata: Self = this.set("allowEsealRecipientsMetadata", js.undefined)
    
    @scala.inline
    def setAllowPowerFormsAdminToAccessAllPowerFormEnvelope(value: String): Self = this.set("allowPowerFormsAdminToAccessAllPowerFormEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPowerFormsAdminToAccessAllPowerFormEnvelope: Self = this.set("allowPowerFormsAdminToAccessAllPowerFormEnvelope", js.undefined)
    
    @scala.inline
    def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata: Self = this.set("allowPowerFormsAdminToAccessAllPowerFormEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setAllowRecipientLanguageSelection(value: String): Self = this.set("allowRecipientLanguageSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRecipientLanguageSelection: Self = this.set("allowRecipientLanguageSelection", js.undefined)
    
    @scala.inline
    def setAllowRecipientLanguageSelectionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowRecipientLanguageSelectionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRecipientLanguageSelectionMetadata: Self = this.set("allowRecipientLanguageSelectionMetadata", js.undefined)
    
    @scala.inline
    def setAllowSendOnBehalfOf(value: String): Self = this.set("allowSendOnBehalfOf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSendOnBehalfOf: Self = this.set("allowSendOnBehalfOf", js.undefined)
    
    @scala.inline
    def setAllowSendOnBehalfOfMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSendOnBehalfOfMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSendOnBehalfOfMetadata: Self = this.set("allowSendOnBehalfOfMetadata", js.undefined)
    
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
    def setAnchorTagVersionedPlacementEnabled(value: String): Self = this.set("anchorTagVersionedPlacementEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorTagVersionedPlacementEnabled: Self = this.set("anchorTagVersionedPlacementEnabled", js.undefined)
    
    @scala.inline
    def setApiAccountWideAccess(value: String): Self = this.set("apiAccountWideAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiAccountWideAccess: Self = this.set("apiAccountWideAccess", js.undefined)
    
    @scala.inline
    def setApiAccountWideAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("apiAccountWideAccessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiAccountWideAccessMetadata: Self = this.set("apiAccountWideAccessMetadata", js.undefined)
    
    @scala.inline
    def setApiCanExportAC(value: String): Self = this.set("apiCanExportAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiCanExportAC: Self = this.set("apiCanExportAC", js.undefined)
    
    @scala.inline
    def setApiCanExportACMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("apiCanExportACMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiCanExportACMetadata: Self = this.set("apiCanExportACMetadata", js.undefined)
    
    @scala.inline
    def setBulkSend(value: String): Self = this.set("bulkSend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkSend: Self = this.set("bulkSend", js.undefined)
    
    @scala.inline
    def setBulkSendMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("bulkSendMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBulkSendMetadata: Self = this.set("bulkSendMetadata", js.undefined)
    
    @scala.inline
    def setCanChargeAccount(value: String): Self = this.set("canChargeAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanChargeAccount: Self = this.set("canChargeAccount", js.undefined)
    
    @scala.inline
    def setCanChargeAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canChargeAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanChargeAccountMetadata: Self = this.set("canChargeAccountMetadata", js.undefined)
    
    @scala.inline
    def setCanEditSharedAddressbook(value: String): Self = this.set("canEditSharedAddressbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanEditSharedAddressbook: Self = this.set("canEditSharedAddressbook", js.undefined)
    
    @scala.inline
    def setCanEditSharedAddressbookMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canEditSharedAddressbookMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanEditSharedAddressbookMetadata: Self = this.set("canEditSharedAddressbookMetadata", js.undefined)
    
    @scala.inline
    def setCanLockEnvelopes(value: String): Self = this.set("canLockEnvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanLockEnvelopes: Self = this.set("canLockEnvelopes", js.undefined)
    
    @scala.inline
    def setCanLockEnvelopesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canLockEnvelopesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanLockEnvelopesMetadata: Self = this.set("canLockEnvelopesMetadata", js.undefined)
    
    @scala.inline
    def setCanManageAccount(value: String): Self = this.set("canManageAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageAccount: Self = this.set("canManageAccount", js.undefined)
    
    @scala.inline
    def setCanManageAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageAccountMetadata: Self = this.set("canManageAccountMetadata", js.undefined)
    
    @scala.inline
    def setCanManageDistributor(value: String): Self = this.set("canManageDistributor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageDistributor: Self = this.set("canManageDistributor", js.undefined)
    
    @scala.inline
    def setCanManageDistributorMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageDistributorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageDistributorMetadata: Self = this.set("canManageDistributorMetadata", js.undefined)
    
    @scala.inline
    def setCanManageTemplates(value: String): Self = this.set("canManageTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageTemplates: Self = this.set("canManageTemplates", js.undefined)
    
    @scala.inline
    def setCanManageTemplatesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canManageTemplatesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanManageTemplatesMetadata: Self = this.set("canManageTemplatesMetadata", js.undefined)
    
    @scala.inline
    def setCanSendAPIRequests(value: String): Self = this.set("canSendAPIRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSendAPIRequests: Self = this.set("canSendAPIRequests", js.undefined)
    
    @scala.inline
    def setCanSendAPIRequestsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canSendAPIRequestsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSendAPIRequestsMetadata: Self = this.set("canSendAPIRequestsMetadata", js.undefined)
    
    @scala.inline
    def setCanSendEnvelope(value: String): Self = this.set("canSendEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSendEnvelope: Self = this.set("canSendEnvelope", js.undefined)
    
    @scala.inline
    def setCanSendEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canSendEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSendEnvelopeMetadata: Self = this.set("canSendEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setCanSignEnvelope(value: String): Self = this.set("canSignEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSignEnvelope: Self = this.set("canSignEnvelope", js.undefined)
    
    @scala.inline
    def setCanSignEnvelopeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canSignEnvelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSignEnvelopeMetadata: Self = this.set("canSignEnvelopeMetadata", js.undefined)
    
    @scala.inline
    def setCanUseScratchpad(value: String): Self = this.set("canUseScratchpad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUseScratchpad: Self = this.set("canUseScratchpad", js.undefined)
    
    @scala.inline
    def setCanUseScratchpadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canUseScratchpadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUseScratchpadMetadata: Self = this.set("canUseScratchpadMetadata", js.undefined)
    
    @scala.inline
    def setCanUseSmartContracts(value: String): Self = this.set("canUseSmartContracts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUseSmartContracts: Self = this.set("canUseSmartContracts", js.undefined)
    
    @scala.inline
    def setCanUseSmartContractsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canUseSmartContractsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanUseSmartContractsMetadata: Self = this.set("canUseSmartContractsMetadata", js.undefined)
    
    @scala.inline
    def setDisableDocumentUpload(value: String): Self = this.set("disableDocumentUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDocumentUpload: Self = this.set("disableDocumentUpload", js.undefined)
    
    @scala.inline
    def setDisableDocumentUploadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableDocumentUploadMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableDocumentUploadMetadata: Self = this.set("disableDocumentUploadMetadata", js.undefined)
    
    @scala.inline
    def setDisableOtherActions(value: String): Self = this.set("disableOtherActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOtherActions: Self = this.set("disableOtherActions", js.undefined)
    
    @scala.inline
    def setDisableOtherActionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("disableOtherActionsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOtherActionsMetadata: Self = this.set("disableOtherActionsMetadata", js.undefined)
    
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
    def setExpressSendOnly(value: String): Self = this.set("expressSendOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpressSendOnly: Self = this.set("expressSendOnly", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setLocaleMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("localeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocaleMetadata: Self = this.set("localeMetadata", js.undefined)
    
    @scala.inline
    def setLocalePolicy(value: LocalePolicy): Self = this.set("localePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocalePolicy: Self = this.set("localePolicy", js.undefined)
    
    @scala.inline
    def setManageClickwrapsMode(value: String): Self = this.set("manageClickwrapsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManageClickwrapsMode: Self = this.set("manageClickwrapsMode", js.undefined)
    
    @scala.inline
    def setManageClickwrapsModeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("manageClickwrapsModeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManageClickwrapsModeMetadata: Self = this.set("manageClickwrapsModeMetadata", js.undefined)
    
    @scala.inline
    def setModifiedBy(value: String): Self = this.set("modifiedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedBy: Self = this.set("modifiedBy", js.undefined)
    
    @scala.inline
    def setModifiedByMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("modifiedByMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedByMetadata: Self = this.set("modifiedByMetadata", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    
    @scala.inline
    def setModifiedDateMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("modifiedDateMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDateMetadata: Self = this.set("modifiedDateMetadata", js.undefined)
    
    @scala.inline
    def setModifiedPage(value: String): Self = this.set("modifiedPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedPage: Self = this.set("modifiedPage", js.undefined)
    
    @scala.inline
    def setModifiedPageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("modifiedPageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedPageMetadata: Self = this.set("modifiedPageMetadata", js.undefined)
    
    @scala.inline
    def setNewSendUI(value: String): Self = this.set("newSendUI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSendUI: Self = this.set("newSendUI", js.undefined)
    
    @scala.inline
    def setNewSendUIMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("newSendUIMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewSendUIMetadata: Self = this.set("newSendUIMetadata", js.undefined)
    
    @scala.inline
    def setPowerFormMode(value: String): Self = this.set("powerFormMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerFormMode: Self = this.set("powerFormMode", js.undefined)
    
    @scala.inline
    def setPowerFormModeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("powerFormModeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerFormModeMetadata: Self = this.set("powerFormModeMetadata", js.undefined)
    
    @scala.inline
    def setRecipientViewedNotification(value: String): Self = this.set("recipientViewedNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientViewedNotification: Self = this.set("recipientViewedNotification", js.undefined)
    
    @scala.inline
    def setRecipientViewedNotificationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("recipientViewedNotificationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientViewedNotificationMetadata: Self = this.set("recipientViewedNotificationMetadata", js.undefined)
    
    @scala.inline
    def setSealIdentifiersVarargs(value: SealIdentifier*): Self = this.set("sealIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setSealIdentifiers(value: js.Array[SealIdentifier]): Self = this.set("sealIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSealIdentifiers: Self = this.set("sealIdentifiers", js.undefined)
    
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
    def setSenderEmailNotifications(
      value: /* Contains the settings for the email notifications that senders receive about the envelopes that they send. */ SenderEmailNotifications
    ): Self = this.set("senderEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderEmailNotifications: Self = this.set("senderEmailNotifications", js.undefined)
    
    @scala.inline
    def setSignerEmailNotifications(
      value: /* An array of email notifications that specifies the email the user receives when they are a sender.
      When the specific email notification is set to true, the user receives those types of email notifications from DocuSign.
      The user inherits the default account sender email notification settings when the user is created. */ SignerEmailNotifications
    ): Self = this.set("signerEmailNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerEmailNotifications: Self = this.set("signerEmailNotifications", js.undefined)
    
    @scala.inline
    def setSupplementalDocumentIncludeInDownload(value: String): Self = this.set("supplementalDocumentIncludeInDownload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupplementalDocumentIncludeInDownload: Self = this.set("supplementalDocumentIncludeInDownload", js.undefined)
    
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
    def setTemplateActiveCreation(value: String): Self = this.set("templateActiveCreation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateActiveCreation: Self = this.set("templateActiveCreation", js.undefined)
    
    @scala.inline
    def setTemplateActiveCreationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("templateActiveCreationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateActiveCreationMetadata: Self = this.set("templateActiveCreationMetadata", js.undefined)
    
    @scala.inline
    def setTemplateApplyNotify(value: String): Self = this.set("templateApplyNotify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateApplyNotify: Self = this.set("templateApplyNotify", js.undefined)
    
    @scala.inline
    def setTemplateApplyNotifyMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("templateApplyNotifyMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateApplyNotifyMetadata: Self = this.set("templateApplyNotifyMetadata", js.undefined)
    
    @scala.inline
    def setTemplateAutoMatching(value: String): Self = this.set("templateAutoMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateAutoMatching: Self = this.set("templateAutoMatching", js.undefined)
    
    @scala.inline
    def setTemplateAutoMatchingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("templateAutoMatchingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateAutoMatchingMetadata: Self = this.set("templateAutoMatchingMetadata", js.undefined)
    
    @scala.inline
    def setTemplateMatchingSensitivity(value: String): Self = this.set("templateMatchingSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateMatchingSensitivity: Self = this.set("templateMatchingSensitivity", js.undefined)
    
    @scala.inline
    def setTemplateMatchingSensitivityMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("templateMatchingSensitivityMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateMatchingSensitivityMetadata: Self = this.set("templateMatchingSensitivityMetadata", js.undefined)
    
    @scala.inline
    def setTemplatePageLevelMatching(value: String): Self = this.set("templatePageLevelMatching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplatePageLevelMatching: Self = this.set("templatePageLevelMatching", js.undefined)
    
    @scala.inline
    def setTemplatePageLevelMatchingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("templatePageLevelMatchingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplatePageLevelMatchingMetadata: Self = this.set("templatePageLevelMatchingMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneDST(value: String): Self = this.set("timezoneDST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneDST: Self = this.set("timezoneDST", js.undefined)
    
    @scala.inline
    def setTimezoneDSTMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timezoneDSTMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneDSTMetadata: Self = this.set("timezoneDSTMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneMask(value: String): Self = this.set("timezoneMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneMask: Self = this.set("timezoneMask", js.undefined)
    
    @scala.inline
    def setTimezoneMaskMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timezoneMaskMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneMaskMetadata: Self = this.set("timezoneMaskMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneOffset(value: String): Self = this.set("timezoneOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneOffset: Self = this.set("timezoneOffset", js.undefined)
    
    @scala.inline
    def setTimezoneOffsetMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timezoneOffsetMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneOffsetMetadata: Self = this.set("timezoneOffsetMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneSendingPref(value: String): Self = this.set("timezoneSendingPref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneSendingPref: Self = this.set("timezoneSendingPref", js.undefined)
    
    @scala.inline
    def setTimezoneSendingPrefMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timezoneSendingPrefMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneSendingPrefMetadata: Self = this.set("timezoneSendingPrefMetadata", js.undefined)
    
    @scala.inline
    def setTimezoneSigningPref(value: String): Self = this.set("timezoneSigningPref", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneSigningPref: Self = this.set("timezoneSigningPref", js.undefined)
    
    @scala.inline
    def setTimezoneSigningPrefMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("timezoneSigningPrefMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezoneSigningPrefMetadata: Self = this.set("timezoneSigningPrefMetadata", js.undefined)
    
    @scala.inline
    def setTransactionPointSiteNameURL(value: String): Self = this.set("transactionPointSiteNameURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionPointSiteNameURL: Self = this.set("transactionPointSiteNameURL", js.undefined)
    
    @scala.inline
    def setTransactionPointSiteNameURLMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("transactionPointSiteNameURLMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionPointSiteNameURLMetadata: Self = this.set("transactionPointSiteNameURLMetadata", js.undefined)
    
    @scala.inline
    def setTransactionPointUserName(value: String): Self = this.set("transactionPointUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionPointUserName: Self = this.set("transactionPointUserName", js.undefined)
    
    @scala.inline
    def setTransactionPointUserNameMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("transactionPointUserNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransactionPointUserNameMetadata: Self = this.set("transactionPointUserNameMetadata", js.undefined)
    
    @scala.inline
    def setVaultingMode(value: String): Self = this.set("vaultingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultingMode: Self = this.set("vaultingMode", js.undefined)
    
    @scala.inline
    def setVaultingModeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("vaultingModeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVaultingModeMetadata: Self = this.set("vaultingModeMetadata", js.undefined)
  }
}
