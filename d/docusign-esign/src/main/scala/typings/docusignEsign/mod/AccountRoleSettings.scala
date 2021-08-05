package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountRoleSettings extends StObject {
  
  /**
    * When **true**, users have full administrative access to the account.
    */
  var allowAccountManagement: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowAccountManagement` property is editable.
    *
    */
  var allowAccountManagementMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can manage documents by using the API.
    */
  var allowApiAccess: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowApiAccess` property is editable.
    *
    */
  var allowApiAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can access the account by using the eSignature API.
    */
  var allowApiAccessToAccount: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowApiAccessToAccount` property is editable.
    *
    */
  var allowApiAccessToAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can send envelopes on behalf of others.
    */
  var allowApiSendingOnBehalfOfOthers: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowApiSendingOnBehalfOfOthers` property is editable.
    *
    */
  var allowApiSendingOnBehalfOfOthersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users may specify sequential signing recipients when they send documents by using the API.
    */
  var allowApiSequentialSigning: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowApiSequentialSigning` property is editable.
    *
    */
  var allowApiSequentialSigningMetadata: js.UndefOr[
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
    * When **true**, bulk sending is enabled for users.
    */
  var allowBulkSending: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowBulkSending` property is editable.
    *
    */
  var allowBulkSendingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the DocuSign Desktop Client is enabled for users.
    *
    */
  var allowDocuSignDesktopClient: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowDocuSignDesktopClient` property is editable.
    *
    */
  var allowDocuSignDesktopClientMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can add electronic seal ([eSeal](https://support.docusign.com/en/guides/ndse-user-guide-apply-electronic-seals)) recipients.
    */
  var allowESealRecipients: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowESealRecipients` property is editable.
    */
  var allowESealRecipientsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can send envelopes.
    */
  var allowEnvelopeSending: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowEnvelopeSending` property is editable.
    *
    */
  var allowEnvelopeSendingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, PowerForm Administrators can access all of the PowerForm envelopes associated with the account.
    */
  var allowPowerFormsAdminToAccessAllPowerFormEnvelopes: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowPowerFormsAdminToAccessAllPowerFormEnvelopes` property is editable.
    */
  var allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, senders can set the language of the email that is sent to recipients.
    */
  var allowSendersToSetRecipientEmailLanguage: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSendersToSetRecipientEmailLanguage` property is editable.
    *
    */
  var allowSendersToSetRecipientEmailLanguageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can add requests for attachments from signers.
    */
  var allowSignerAttachments: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSignerAttachments` property is editable.
    *
    */
  var allowSignerAttachmentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, senders can include supplemental documents.
    */
  var allowSupplementalDocuments: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowSupplementalDocuments` property is editable.
    */
  var allowSupplementalDocumentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the tagger palette is visible during the sending and correct flows and users can add tabs to documents.
    */
  var allowTaggingInSendAndCorrect: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowTaggingInSendAndCorrect` property is editable.
    *
    */
  var allowTaggingInSendAndCorrectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var allowVaulting: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var allowVaultingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can override the default account setting that controls whether recipients can sign documents on paper.
    * The option to overrride this setting occurs during the sending process on a per-envelope basis.
    */
  var allowWetSigningOverride: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowWetSigningOverride` property is editable.
    *
    */
  var allowWetSigningOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies the level of access that users have to the account's address book. Valid values are:
    *
    * - `personal`
    * - `useShared`
    * - `usePersonalAndShared`
    * - `personalAndShared`
    *
    */
  var allowedAddressBookAccess: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowedAddressBookAccess` property is editable.
    *
    */
  var allowedAddressBookAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  var allowedClickwrapsAccess: js.UndefOr[String] = js.undefined
  
  var allowedClickwrapsAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Specifies the level of access that users have to account templates. Valid values are:
    *
    * - `none`
    * - `use`
    * - `create`
    * - `share`
    */
  var allowedTemplateAccess: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowedTemplateAccess` property is editable.
    *
    */
  var allowedTemplateAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can be recipients of envelopes transferred to them by administrators of other accounts.
    */
  var allowedToBeEnvelopeTransferRecipient: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `allowedToBeEnvelopeTransferRecipient` property is editable.
    *
    */
  var allowedToBeEnvelopeTransferRecipientMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var canCreateWorkspaces: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var canCreateWorkspacesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users cannot upload documents.
    */
  var disableDocumentUpload: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableDocumentUpload` property is editable.
    *
    */
  var disableDocumentUploadMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, users can access the **Other Actions** menu.
    */
  var disableOtherActions: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `disableOtherActions` property is editable.
    *
    */
  var disableOtherActionsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, API request logging is enabled.
    *
    * **Note**: Logging limits apply.
    */
  var enableApiRequestLogging: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableApiRequestLogging` property is editable.
    *
    */
  var enableApiRequestLoggingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, senders are notified when recipients view the documents that they send.
    */
  var enableRecipientViewingNotifications: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableRecipientViewingNotifications` property is editable.
    *
    */
  var enableRecipientViewingNotificationsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, the sequential signing user export interface is enabled.
    */
  var enableSequentialSigningInterface: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `enableSequentialSigningInterface` property is editable.
    *
    */
  var enableSequentialSigningInterfaceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPointIntegration: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPointIntegrationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * The PowerForms rights associated with the account permission profile. Valid values are:
    *
    * - `none`
    * - `user`
    * - `admin`
    *
    */
  var powerFormRole: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `powerFormRole` property is editable.
    *
    */
  var powerFormRoleMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, senders receive emails about completed, self-signed documents that contain links to the completed documents instead of PDF attachments.
    */
  var receiveCompletedSelfSignedDocumentsAsEmailLinks: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `receiveCompletedSelfSignedDocumentsAsEmailLinks` property is editable.
    *
    */
  var receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var signingUiVersionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * When **true**, senders can require recipients to accept supplemental documents.
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
    * When **true**, senders can require recipients to read supplemental documents.
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
    * When **true**, users can require recipients to view supplemental documents.
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
    * Reserved for DocuSign.
    */
  var useNewDocuSignExperienceInterface: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var useNewDocuSignExperienceInterfaceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var useNewSendingInterface: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var useNewSendingInterfaceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var vaultingMode: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var vaultingModeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.undefined
}
object AccountRoleSettings {
  
  inline def apply(): AccountRoleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRoleSettings]
  }
  
  extension [Self <: AccountRoleSettings](x: Self) {
    
    inline def setAllowAccountManagement(value: String): Self = StObject.set(x, "allowAccountManagement", value.asInstanceOf[js.Any])
    
    inline def setAllowAccountManagementMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAccountManagementMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAccountManagementMetadataUndefined: Self = StObject.set(x, "allowAccountManagementMetadata", js.undefined)
    
    inline def setAllowAccountManagementUndefined: Self = StObject.set(x, "allowAccountManagement", js.undefined)
    
    inline def setAllowApiAccess(value: String): Self = StObject.set(x, "allowApiAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowApiAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowApiAccessMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowApiAccessMetadataUndefined: Self = StObject.set(x, "allowApiAccessMetadata", js.undefined)
    
    inline def setAllowApiAccessToAccount(value: String): Self = StObject.set(x, "allowApiAccessToAccount", value.asInstanceOf[js.Any])
    
    inline def setAllowApiAccessToAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowApiAccessToAccountMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowApiAccessToAccountMetadataUndefined: Self = StObject.set(x, "allowApiAccessToAccountMetadata", js.undefined)
    
    inline def setAllowApiAccessToAccountUndefined: Self = StObject.set(x, "allowApiAccessToAccount", js.undefined)
    
    inline def setAllowApiAccessUndefined: Self = StObject.set(x, "allowApiAccess", js.undefined)
    
    inline def setAllowApiSendingOnBehalfOfOthers(value: String): Self = StObject.set(x, "allowApiSendingOnBehalfOfOthers", value.asInstanceOf[js.Any])
    
    inline def setAllowApiSendingOnBehalfOfOthersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowApiSendingOnBehalfOfOthersMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowApiSendingOnBehalfOfOthersMetadataUndefined: Self = StObject.set(x, "allowApiSendingOnBehalfOfOthersMetadata", js.undefined)
    
    inline def setAllowApiSendingOnBehalfOfOthersUndefined: Self = StObject.set(x, "allowApiSendingOnBehalfOfOthers", js.undefined)
    
    inline def setAllowApiSequentialSigning(value: String): Self = StObject.set(x, "allowApiSequentialSigning", value.asInstanceOf[js.Any])
    
    inline def setAllowApiSequentialSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowApiSequentialSigningMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowApiSequentialSigningMetadataUndefined: Self = StObject.set(x, "allowApiSequentialSigningMetadata", js.undefined)
    
    inline def setAllowApiSequentialSigningUndefined: Self = StObject.set(x, "allowApiSequentialSigning", js.undefined)
    
    inline def setAllowAutoTagging(value: String): Self = StObject.set(x, "allowAutoTagging", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoTaggingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowAutoTaggingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowAutoTaggingMetadataUndefined: Self = StObject.set(x, "allowAutoTaggingMetadata", js.undefined)
    
    inline def setAllowAutoTaggingUndefined: Self = StObject.set(x, "allowAutoTagging", js.undefined)
    
    inline def setAllowBulkSending(value: String): Self = StObject.set(x, "allowBulkSending", value.asInstanceOf[js.Any])
    
    inline def setAllowBulkSendingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowBulkSendingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowBulkSendingMetadataUndefined: Self = StObject.set(x, "allowBulkSendingMetadata", js.undefined)
    
    inline def setAllowBulkSendingUndefined: Self = StObject.set(x, "allowBulkSending", js.undefined)
    
    inline def setAllowDocuSignDesktopClient(value: String): Self = StObject.set(x, "allowDocuSignDesktopClient", value.asInstanceOf[js.Any])
    
    inline def setAllowDocuSignDesktopClientMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowDocuSignDesktopClientMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowDocuSignDesktopClientMetadataUndefined: Self = StObject.set(x, "allowDocuSignDesktopClientMetadata", js.undefined)
    
    inline def setAllowDocuSignDesktopClientUndefined: Self = StObject.set(x, "allowDocuSignDesktopClient", js.undefined)
    
    inline def setAllowESealRecipients(value: String): Self = StObject.set(x, "allowESealRecipients", value.asInstanceOf[js.Any])
    
    inline def setAllowESealRecipientsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowESealRecipientsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowESealRecipientsMetadataUndefined: Self = StObject.set(x, "allowESealRecipientsMetadata", js.undefined)
    
    inline def setAllowESealRecipientsUndefined: Self = StObject.set(x, "allowESealRecipients", js.undefined)
    
    inline def setAllowEnvelopeSending(value: String): Self = StObject.set(x, "allowEnvelopeSending", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeSendingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowEnvelopeSendingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowEnvelopeSendingMetadataUndefined: Self = StObject.set(x, "allowEnvelopeSendingMetadata", js.undefined)
    
    inline def setAllowEnvelopeSendingUndefined: Self = StObject.set(x, "allowEnvelopeSending", js.undefined)
    
    inline def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopes(value: String): Self = StObject.set(x, "allowPowerFormsAdminToAccessAllPowerFormEnvelopes", value.asInstanceOf[js.Any])
    
    inline def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadataUndefined: Self = StObject.set(x, "allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata", js.undefined)
    
    inline def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopesUndefined: Self = StObject.set(x, "allowPowerFormsAdminToAccessAllPowerFormEnvelopes", js.undefined)
    
    inline def setAllowSendersToSetRecipientEmailLanguage(value: String): Self = StObject.set(x, "allowSendersToSetRecipientEmailLanguage", value.asInstanceOf[js.Any])
    
    inline def setAllowSendersToSetRecipientEmailLanguageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSendersToSetRecipientEmailLanguageMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSendersToSetRecipientEmailLanguageMetadataUndefined: Self = StObject.set(x, "allowSendersToSetRecipientEmailLanguageMetadata", js.undefined)
    
    inline def setAllowSendersToSetRecipientEmailLanguageUndefined: Self = StObject.set(x, "allowSendersToSetRecipientEmailLanguage", js.undefined)
    
    inline def setAllowSignerAttachments(value: String): Self = StObject.set(x, "allowSignerAttachments", value.asInstanceOf[js.Any])
    
    inline def setAllowSignerAttachmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSignerAttachmentsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSignerAttachmentsMetadataUndefined: Self = StObject.set(x, "allowSignerAttachmentsMetadata", js.undefined)
    
    inline def setAllowSignerAttachmentsUndefined: Self = StObject.set(x, "allowSignerAttachments", js.undefined)
    
    inline def setAllowSupplementalDocuments(value: String): Self = StObject.set(x, "allowSupplementalDocuments", value.asInstanceOf[js.Any])
    
    inline def setAllowSupplementalDocumentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowSupplementalDocumentsMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowSupplementalDocumentsMetadataUndefined: Self = StObject.set(x, "allowSupplementalDocumentsMetadata", js.undefined)
    
    inline def setAllowSupplementalDocumentsUndefined: Self = StObject.set(x, "allowSupplementalDocuments", js.undefined)
    
    inline def setAllowTaggingInSendAndCorrect(value: String): Self = StObject.set(x, "allowTaggingInSendAndCorrect", value.asInstanceOf[js.Any])
    
    inline def setAllowTaggingInSendAndCorrectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowTaggingInSendAndCorrectMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowTaggingInSendAndCorrectMetadataUndefined: Self = StObject.set(x, "allowTaggingInSendAndCorrectMetadata", js.undefined)
    
    inline def setAllowTaggingInSendAndCorrectUndefined: Self = StObject.set(x, "allowTaggingInSendAndCorrect", js.undefined)
    
    inline def setAllowVaulting(value: String): Self = StObject.set(x, "allowVaulting", value.asInstanceOf[js.Any])
    
    inline def setAllowVaultingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowVaultingMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowVaultingMetadataUndefined: Self = StObject.set(x, "allowVaultingMetadata", js.undefined)
    
    inline def setAllowVaultingUndefined: Self = StObject.set(x, "allowVaulting", js.undefined)
    
    inline def setAllowWetSigningOverride(value: String): Self = StObject.set(x, "allowWetSigningOverride", value.asInstanceOf[js.Any])
    
    inline def setAllowWetSigningOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowWetSigningOverrideMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowWetSigningOverrideMetadataUndefined: Self = StObject.set(x, "allowWetSigningOverrideMetadata", js.undefined)
    
    inline def setAllowWetSigningOverrideUndefined: Self = StObject.set(x, "allowWetSigningOverride", js.undefined)
    
    inline def setAllowedAddressBookAccess(value: String): Self = StObject.set(x, "allowedAddressBookAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowedAddressBookAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowedAddressBookAccessMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowedAddressBookAccessMetadataUndefined: Self = StObject.set(x, "allowedAddressBookAccessMetadata", js.undefined)
    
    inline def setAllowedAddressBookAccessUndefined: Self = StObject.set(x, "allowedAddressBookAccess", js.undefined)
    
    inline def setAllowedClickwrapsAccess(value: String): Self = StObject.set(x, "allowedClickwrapsAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowedClickwrapsAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowedClickwrapsAccessMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowedClickwrapsAccessMetadataUndefined: Self = StObject.set(x, "allowedClickwrapsAccessMetadata", js.undefined)
    
    inline def setAllowedClickwrapsAccessUndefined: Self = StObject.set(x, "allowedClickwrapsAccess", js.undefined)
    
    inline def setAllowedTemplateAccess(value: String): Self = StObject.set(x, "allowedTemplateAccess", value.asInstanceOf[js.Any])
    
    inline def setAllowedTemplateAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowedTemplateAccessMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowedTemplateAccessMetadataUndefined: Self = StObject.set(x, "allowedTemplateAccessMetadata", js.undefined)
    
    inline def setAllowedTemplateAccessUndefined: Self = StObject.set(x, "allowedTemplateAccess", js.undefined)
    
    inline def setAllowedToBeEnvelopeTransferRecipient(value: String): Self = StObject.set(x, "allowedToBeEnvelopeTransferRecipient", value.asInstanceOf[js.Any])
    
    inline def setAllowedToBeEnvelopeTransferRecipientMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "allowedToBeEnvelopeTransferRecipientMetadata", value.asInstanceOf[js.Any])
    
    inline def setAllowedToBeEnvelopeTransferRecipientMetadataUndefined: Self = StObject.set(x, "allowedToBeEnvelopeTransferRecipientMetadata", js.undefined)
    
    inline def setAllowedToBeEnvelopeTransferRecipientUndefined: Self = StObject.set(x, "allowedToBeEnvelopeTransferRecipient", js.undefined)
    
    inline def setCanCreateWorkspaces(value: String): Self = StObject.set(x, "canCreateWorkspaces", value.asInstanceOf[js.Any])
    
    inline def setCanCreateWorkspacesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "canCreateWorkspacesMetadata", value.asInstanceOf[js.Any])
    
    inline def setCanCreateWorkspacesMetadataUndefined: Self = StObject.set(x, "canCreateWorkspacesMetadata", js.undefined)
    
    inline def setCanCreateWorkspacesUndefined: Self = StObject.set(x, "canCreateWorkspaces", js.undefined)
    
    inline def setDisableDocumentUpload(value: String): Self = StObject.set(x, "disableDocumentUpload", value.asInstanceOf[js.Any])
    
    inline def setDisableDocumentUploadMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableDocumentUploadMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableDocumentUploadMetadataUndefined: Self = StObject.set(x, "disableDocumentUploadMetadata", js.undefined)
    
    inline def setDisableDocumentUploadUndefined: Self = StObject.set(x, "disableDocumentUpload", js.undefined)
    
    inline def setDisableOtherActions(value: String): Self = StObject.set(x, "disableOtherActions", value.asInstanceOf[js.Any])
    
    inline def setDisableOtherActionsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "disableOtherActionsMetadata", value.asInstanceOf[js.Any])
    
    inline def setDisableOtherActionsMetadataUndefined: Self = StObject.set(x, "disableOtherActionsMetadata", js.undefined)
    
    inline def setDisableOtherActionsUndefined: Self = StObject.set(x, "disableOtherActions", js.undefined)
    
    inline def setEnableApiRequestLogging(value: String): Self = StObject.set(x, "enableApiRequestLogging", value.asInstanceOf[js.Any])
    
    inline def setEnableApiRequestLoggingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableApiRequestLoggingMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableApiRequestLoggingMetadataUndefined: Self = StObject.set(x, "enableApiRequestLoggingMetadata", js.undefined)
    
    inline def setEnableApiRequestLoggingUndefined: Self = StObject.set(x, "enableApiRequestLogging", js.undefined)
    
    inline def setEnableRecipientViewingNotifications(value: String): Self = StObject.set(x, "enableRecipientViewingNotifications", value.asInstanceOf[js.Any])
    
    inline def setEnableRecipientViewingNotificationsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableRecipientViewingNotificationsMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableRecipientViewingNotificationsMetadataUndefined: Self = StObject.set(x, "enableRecipientViewingNotificationsMetadata", js.undefined)
    
    inline def setEnableRecipientViewingNotificationsUndefined: Self = StObject.set(x, "enableRecipientViewingNotifications", js.undefined)
    
    inline def setEnableSequentialSigningInterface(value: String): Self = StObject.set(x, "enableSequentialSigningInterface", value.asInstanceOf[js.Any])
    
    inline def setEnableSequentialSigningInterfaceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableSequentialSigningInterfaceMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableSequentialSigningInterfaceMetadataUndefined: Self = StObject.set(x, "enableSequentialSigningInterfaceMetadata", js.undefined)
    
    inline def setEnableSequentialSigningInterfaceUndefined: Self = StObject.set(x, "enableSequentialSigningInterface", js.undefined)
    
    inline def setEnableTransactionPointIntegration(value: String): Self = StObject.set(x, "enableTransactionPointIntegration", value.asInstanceOf[js.Any])
    
    inline def setEnableTransactionPointIntegrationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "enableTransactionPointIntegrationMetadata", value.asInstanceOf[js.Any])
    
    inline def setEnableTransactionPointIntegrationMetadataUndefined: Self = StObject.set(x, "enableTransactionPointIntegrationMetadata", js.undefined)
    
    inline def setEnableTransactionPointIntegrationUndefined: Self = StObject.set(x, "enableTransactionPointIntegration", js.undefined)
    
    inline def setPowerFormRole(value: String): Self = StObject.set(x, "powerFormRole", value.asInstanceOf[js.Any])
    
    inline def setPowerFormRoleMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "powerFormRoleMetadata", value.asInstanceOf[js.Any])
    
    inline def setPowerFormRoleMetadataUndefined: Self = StObject.set(x, "powerFormRoleMetadata", js.undefined)
    
    inline def setPowerFormRoleUndefined: Self = StObject.set(x, "powerFormRole", js.undefined)
    
    inline def setReceiveCompletedSelfSignedDocumentsAsEmailLinks(value: String): Self = StObject.set(x, "receiveCompletedSelfSignedDocumentsAsEmailLinks", value.asInstanceOf[js.Any])
    
    inline def setReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata", value.asInstanceOf[js.Any])
    
    inline def setReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadataUndefined: Self = StObject.set(x, "receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata", js.undefined)
    
    inline def setReceiveCompletedSelfSignedDocumentsAsEmailLinksUndefined: Self = StObject.set(x, "receiveCompletedSelfSignedDocumentsAsEmailLinks", js.undefined)
    
    inline def setSigningUiVersionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "signingUiVersionMetadata", value.asInstanceOf[js.Any])
    
    inline def setSigningUiVersionMetadataUndefined: Self = StObject.set(x, "signingUiVersionMetadata", js.undefined)
    
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
    
    inline def setUseNewDocuSignExperienceInterface(value: String): Self = StObject.set(x, "useNewDocuSignExperienceInterface", value.asInstanceOf[js.Any])
    
    inline def setUseNewDocuSignExperienceInterfaceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useNewDocuSignExperienceInterfaceMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseNewDocuSignExperienceInterfaceMetadataUndefined: Self = StObject.set(x, "useNewDocuSignExperienceInterfaceMetadata", js.undefined)
    
    inline def setUseNewDocuSignExperienceInterfaceUndefined: Self = StObject.set(x, "useNewDocuSignExperienceInterface", js.undefined)
    
    inline def setUseNewSendingInterface(value: String): Self = StObject.set(x, "useNewSendingInterface", value.asInstanceOf[js.Any])
    
    inline def setUseNewSendingInterfaceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "useNewSendingInterfaceMetadata", value.asInstanceOf[js.Any])
    
    inline def setUseNewSendingInterfaceMetadataUndefined: Self = StObject.set(x, "useNewSendingInterfaceMetadata", js.undefined)
    
    inline def setUseNewSendingInterfaceUndefined: Self = StObject.set(x, "useNewSendingInterface", js.undefined)
    
    inline def setVaultingMode(value: String): Self = StObject.set(x, "vaultingMode", value.asInstanceOf[js.Any])
    
    inline def setVaultingModeMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = StObject.set(x, "vaultingModeMetadata", value.asInstanceOf[js.Any])
    
    inline def setVaultingModeMetadataUndefined: Self = StObject.set(x, "vaultingModeMetadata", js.undefined)
    
    inline def setVaultingModeUndefined: Self = StObject.set(x, "vaultingMode", js.undefined)
  }
}
