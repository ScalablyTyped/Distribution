package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountRoleSettings extends js.Object {
  
  /**
    * When **true**, users have full administrative access to the account.
    */
  var allowAccountManagement: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowAccountManagement` property is editable.
    *
    */
  var allowAccountManagementMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users can manage documents by using the API.
    */
  var allowApiAccess: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowApiAccess` property is editable.
    *
    */
  var allowApiAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users can access the account by using the eSignature API.
    */
  var allowApiAccessToAccount: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowApiAccessToAccount` property is editable.
    *
    */
  var allowApiAccessToAccountMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users can send envelopes on behalf of others.
    */
  var allowApiSendingOnBehalfOfOthers: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowApiSendingOnBehalfOfOthers` property is editable.
    *
    */
  var allowApiSendingOnBehalfOfOthersMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users may specify sequential signing recipients when they send documents by using the API.
    */
  var allowApiSequentialSigning: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowApiSequentialSigning` property is editable.
    *
    */
  var allowApiSequentialSigningMetadata: js.UndefOr[
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
    * When **true**, bulk sending is enabled for users.
    */
  var allowBulkSending: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowBulkSending` property is editable.
    *
    */
  var allowBulkSendingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the DocuSign Desktop Client is enabled for users.
    *
    */
  var allowDocuSignDesktopClient: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowDocuSignDesktopClient` property is editable.
    *
    */
  var allowDocuSignDesktopClientMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users can add electronic seal ([eSeal](https://support.docusign.com/en/guides/ndse-user-guide-apply-electronic-seals)) recipients.
    */
  var allowESealRecipients: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowESealRecipients` property is editable.
    */
  var allowESealRecipientsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users can send envelopes.
    */
  var allowEnvelopeSending: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowEnvelopeSending` property is editable.
    *
    */
  var allowEnvelopeSendingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, PowerForm Administrators can access all of the PowerForm envelopes associated with the account.
    */
  var allowPowerFormsAdminToAccessAllPowerFormEnvelopes: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowPowerFormsAdminToAccessAllPowerFormEnvelopes` property is editable.
    */
  var allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, senders can set the language of the email that is sent to recipients.
    */
  var allowSendersToSetRecipientEmailLanguage: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSendersToSetRecipientEmailLanguage` property is editable.
    *
    */
  var allowSendersToSetRecipientEmailLanguageMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users can add requests for attachments from signers.
    */
  var allowSignerAttachments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSignerAttachments` property is editable.
    *
    */
  var allowSignerAttachmentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, senders can include supplemental documents.
    */
  var allowSupplementalDocuments: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowSupplementalDocuments` property is editable.
    */
  var allowSupplementalDocumentsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the tagger palette is visible during the sending and correct flows and users can add tabs to documents.
    */
  var allowTaggingInSendAndCorrect: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowTaggingInSendAndCorrect` property is editable.
    *
    */
  var allowTaggingInSendAndCorrectMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var allowVaulting: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var allowVaultingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users can override the default account setting that controls whether recipients can sign documents on paper.
    * The option to overrride this setting occurs during the sending process on a per-envelope basis.
    */
  var allowWetSigningOverride: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowWetSigningOverride` property is editable.
    *
    */
  var allowWetSigningOverrideMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies the level of access that users have to the account's address book. Valid values are:
    *
    * - `personal`
    * - `useShared`
    * - `usePersonalAndShared`
    * - `personalAndShared`
    *
    */
  var allowedAddressBookAccess: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowedAddressBookAccess` property is editable.
    *
    */
  var allowedAddressBookAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  var allowedClickwrapsAccess: js.UndefOr[String] = js.native
  
  var allowedClickwrapsAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Specifies the level of access that users have to account templates. Valid values are:
    *
    * - `none`
    * - `use`
    * - `create`
    * - `share`
    */
  var allowedTemplateAccess: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowedTemplateAccess` property is editable.
    *
    */
  var allowedTemplateAccessMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users can be recipients of envelopes transferred to them by administrators of other accounts.
    */
  var allowedToBeEnvelopeTransferRecipient: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `allowedToBeEnvelopeTransferRecipient` property is editable.
    *
    */
  var allowedToBeEnvelopeTransferRecipientMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canCreateWorkspaces: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var canCreateWorkspacesMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, users cannot upload documents.
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
    * When **true**, users can access the **Other Actions** menu.
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
    * When **true**, API request logging is enabled.
    *
    * **Note**: Logging limits apply.
    */
  var enableApiRequestLogging: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableApiRequestLogging` property is editable.
    *
    */
  var enableApiRequestLoggingMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, senders are notified when recipients view the documents that they send.
    */
  var enableRecipientViewingNotifications: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableRecipientViewingNotifications` property is editable.
    *
    */
  var enableRecipientViewingNotificationsMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, the sequential signing user export interface is enabled.
    */
  var enableSequentialSigningInterface: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `enableSequentialSigningInterface` property is editable.
    *
    */
  var enableSequentialSigningInterfaceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPointIntegration: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var enableTransactionPointIntegrationMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * The PowerForms rights associated with the account permission profile. Valid values are:
    *
    * - `none`
    * - `user`
    * - `admin`
    *
    */
  var powerFormRole: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `powerFormRole` property is editable.
    *
    */
  var powerFormRoleMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, senders receive emails about completed, self-signed documents that contain links to the completed documents instead of PDF attachments.
    */
  var receiveCompletedSelfSignedDocumentsAsEmailLinks: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `receiveCompletedSelfSignedDocumentsAsEmailLinks` property is editable.
    *
    */
  var receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signingUiVersionMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * When **true**, senders can require recipients to accept supplemental documents.
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
    * When **true**, senders can require recipients to read supplemental documents.
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
    * When **true**, users can require recipients to view supplemental documents.
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
    * Reserved for DocuSign.
    */
  var useNewDocuSignExperienceInterface: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var useNewDocuSignExperienceInterfaceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var useNewSendingInterface: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var useNewSendingInterfaceMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var vaultingMode: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var vaultingModeMetadata: js.UndefOr[
    /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
  ] = js.native
}
object AccountRoleSettings {
  
  @scala.inline
  def apply(): AccountRoleSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountRoleSettings]
  }
  
  @scala.inline
  implicit class AccountRoleSettingsOps[Self <: AccountRoleSettings] (val x: Self) extends AnyVal {
    
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
    def setAllowAccountManagement(value: String): Self = this.set("allowAccountManagement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAccountManagement: Self = this.set("allowAccountManagement", js.undefined)
    
    @scala.inline
    def setAllowAccountManagementMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowAccountManagementMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAccountManagementMetadata: Self = this.set("allowAccountManagementMetadata", js.undefined)
    
    @scala.inline
    def setAllowApiAccess(value: String): Self = this.set("allowApiAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowApiAccess: Self = this.set("allowApiAccess", js.undefined)
    
    @scala.inline
    def setAllowApiAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowApiAccessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowApiAccessMetadata: Self = this.set("allowApiAccessMetadata", js.undefined)
    
    @scala.inline
    def setAllowApiAccessToAccount(value: String): Self = this.set("allowApiAccessToAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowApiAccessToAccount: Self = this.set("allowApiAccessToAccount", js.undefined)
    
    @scala.inline
    def setAllowApiAccessToAccountMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowApiAccessToAccountMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowApiAccessToAccountMetadata: Self = this.set("allowApiAccessToAccountMetadata", js.undefined)
    
    @scala.inline
    def setAllowApiSendingOnBehalfOfOthers(value: String): Self = this.set("allowApiSendingOnBehalfOfOthers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowApiSendingOnBehalfOfOthers: Self = this.set("allowApiSendingOnBehalfOfOthers", js.undefined)
    
    @scala.inline
    def setAllowApiSendingOnBehalfOfOthersMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowApiSendingOnBehalfOfOthersMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowApiSendingOnBehalfOfOthersMetadata: Self = this.set("allowApiSendingOnBehalfOfOthersMetadata", js.undefined)
    
    @scala.inline
    def setAllowApiSequentialSigning(value: String): Self = this.set("allowApiSequentialSigning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowApiSequentialSigning: Self = this.set("allowApiSequentialSigning", js.undefined)
    
    @scala.inline
    def setAllowApiSequentialSigningMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowApiSequentialSigningMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowApiSequentialSigningMetadata: Self = this.set("allowApiSequentialSigningMetadata", js.undefined)
    
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
    def setAllowBulkSending(value: String): Self = this.set("allowBulkSending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBulkSending: Self = this.set("allowBulkSending", js.undefined)
    
    @scala.inline
    def setAllowBulkSendingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowBulkSendingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowBulkSendingMetadata: Self = this.set("allowBulkSendingMetadata", js.undefined)
    
    @scala.inline
    def setAllowDocuSignDesktopClient(value: String): Self = this.set("allowDocuSignDesktopClient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDocuSignDesktopClient: Self = this.set("allowDocuSignDesktopClient", js.undefined)
    
    @scala.inline
    def setAllowDocuSignDesktopClientMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowDocuSignDesktopClientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDocuSignDesktopClientMetadata: Self = this.set("allowDocuSignDesktopClientMetadata", js.undefined)
    
    @scala.inline
    def setAllowESealRecipients(value: String): Self = this.set("allowESealRecipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowESealRecipients: Self = this.set("allowESealRecipients", js.undefined)
    
    @scala.inline
    def setAllowESealRecipientsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowESealRecipientsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowESealRecipientsMetadata: Self = this.set("allowESealRecipientsMetadata", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeSending(value: String): Self = this.set("allowEnvelopeSending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeSending: Self = this.set("allowEnvelopeSending", js.undefined)
    
    @scala.inline
    def setAllowEnvelopeSendingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowEnvelopeSendingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEnvelopeSendingMetadata: Self = this.set("allowEnvelopeSendingMetadata", js.undefined)
    
    @scala.inline
    def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopes(value: String): Self = this.set("allowPowerFormsAdminToAccessAllPowerFormEnvelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPowerFormsAdminToAccessAllPowerFormEnvelopes: Self = this.set("allowPowerFormsAdminToAccessAllPowerFormEnvelopes", js.undefined)
    
    @scala.inline
    def setAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata: Self = this.set("allowPowerFormsAdminToAccessAllPowerFormEnvelopesMetadata", js.undefined)
    
    @scala.inline
    def setAllowSendersToSetRecipientEmailLanguage(value: String): Self = this.set("allowSendersToSetRecipientEmailLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSendersToSetRecipientEmailLanguage: Self = this.set("allowSendersToSetRecipientEmailLanguage", js.undefined)
    
    @scala.inline
    def setAllowSendersToSetRecipientEmailLanguageMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSendersToSetRecipientEmailLanguageMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSendersToSetRecipientEmailLanguageMetadata: Self = this.set("allowSendersToSetRecipientEmailLanguageMetadata", js.undefined)
    
    @scala.inline
    def setAllowSignerAttachments(value: String): Self = this.set("allowSignerAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignerAttachments: Self = this.set("allowSignerAttachments", js.undefined)
    
    @scala.inline
    def setAllowSignerAttachmentsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowSignerAttachmentsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSignerAttachmentsMetadata: Self = this.set("allowSignerAttachmentsMetadata", js.undefined)
    
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
    def setAllowTaggingInSendAndCorrect(value: String): Self = this.set("allowTaggingInSendAndCorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTaggingInSendAndCorrect: Self = this.set("allowTaggingInSendAndCorrect", js.undefined)
    
    @scala.inline
    def setAllowTaggingInSendAndCorrectMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowTaggingInSendAndCorrectMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowTaggingInSendAndCorrectMetadata: Self = this.set("allowTaggingInSendAndCorrectMetadata", js.undefined)
    
    @scala.inline
    def setAllowVaulting(value: String): Self = this.set("allowVaulting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowVaulting: Self = this.set("allowVaulting", js.undefined)
    
    @scala.inline
    def setAllowVaultingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowVaultingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowVaultingMetadata: Self = this.set("allowVaultingMetadata", js.undefined)
    
    @scala.inline
    def setAllowWetSigningOverride(value: String): Self = this.set("allowWetSigningOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowWetSigningOverride: Self = this.set("allowWetSigningOverride", js.undefined)
    
    @scala.inline
    def setAllowWetSigningOverrideMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowWetSigningOverrideMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowWetSigningOverrideMetadata: Self = this.set("allowWetSigningOverrideMetadata", js.undefined)
    
    @scala.inline
    def setAllowedAddressBookAccess(value: String): Self = this.set("allowedAddressBookAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAddressBookAccess: Self = this.set("allowedAddressBookAccess", js.undefined)
    
    @scala.inline
    def setAllowedAddressBookAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowedAddressBookAccessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAddressBookAccessMetadata: Self = this.set("allowedAddressBookAccessMetadata", js.undefined)
    
    @scala.inline
    def setAllowedClickwrapsAccess(value: String): Self = this.set("allowedClickwrapsAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedClickwrapsAccess: Self = this.set("allowedClickwrapsAccess", js.undefined)
    
    @scala.inline
    def setAllowedClickwrapsAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowedClickwrapsAccessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedClickwrapsAccessMetadata: Self = this.set("allowedClickwrapsAccessMetadata", js.undefined)
    
    @scala.inline
    def setAllowedTemplateAccess(value: String): Self = this.set("allowedTemplateAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedTemplateAccess: Self = this.set("allowedTemplateAccess", js.undefined)
    
    @scala.inline
    def setAllowedTemplateAccessMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowedTemplateAccessMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedTemplateAccessMetadata: Self = this.set("allowedTemplateAccessMetadata", js.undefined)
    
    @scala.inline
    def setAllowedToBeEnvelopeTransferRecipient(value: String): Self = this.set("allowedToBeEnvelopeTransferRecipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedToBeEnvelopeTransferRecipient: Self = this.set("allowedToBeEnvelopeTransferRecipient", js.undefined)
    
    @scala.inline
    def setAllowedToBeEnvelopeTransferRecipientMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("allowedToBeEnvelopeTransferRecipientMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedToBeEnvelopeTransferRecipientMetadata: Self = this.set("allowedToBeEnvelopeTransferRecipientMetadata", js.undefined)
    
    @scala.inline
    def setCanCreateWorkspaces(value: String): Self = this.set("canCreateWorkspaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCreateWorkspaces: Self = this.set("canCreateWorkspaces", js.undefined)
    
    @scala.inline
    def setCanCreateWorkspacesMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("canCreateWorkspacesMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanCreateWorkspacesMetadata: Self = this.set("canCreateWorkspacesMetadata", js.undefined)
    
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
    def setEnableApiRequestLogging(value: String): Self = this.set("enableApiRequestLogging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableApiRequestLogging: Self = this.set("enableApiRequestLogging", js.undefined)
    
    @scala.inline
    def setEnableApiRequestLoggingMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableApiRequestLoggingMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableApiRequestLoggingMetadata: Self = this.set("enableApiRequestLoggingMetadata", js.undefined)
    
    @scala.inline
    def setEnableRecipientViewingNotifications(value: String): Self = this.set("enableRecipientViewingNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRecipientViewingNotifications: Self = this.set("enableRecipientViewingNotifications", js.undefined)
    
    @scala.inline
    def setEnableRecipientViewingNotificationsMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableRecipientViewingNotificationsMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRecipientViewingNotificationsMetadata: Self = this.set("enableRecipientViewingNotificationsMetadata", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningInterface(value: String): Self = this.set("enableSequentialSigningInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSequentialSigningInterface: Self = this.set("enableSequentialSigningInterface", js.undefined)
    
    @scala.inline
    def setEnableSequentialSigningInterfaceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableSequentialSigningInterfaceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSequentialSigningInterfaceMetadata: Self = this.set("enableSequentialSigningInterfaceMetadata", js.undefined)
    
    @scala.inline
    def setEnableTransactionPointIntegration(value: String): Self = this.set("enableTransactionPointIntegration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTransactionPointIntegration: Self = this.set("enableTransactionPointIntegration", js.undefined)
    
    @scala.inline
    def setEnableTransactionPointIntegrationMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("enableTransactionPointIntegrationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTransactionPointIntegrationMetadata: Self = this.set("enableTransactionPointIntegrationMetadata", js.undefined)
    
    @scala.inline
    def setPowerFormRole(value: String): Self = this.set("powerFormRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerFormRole: Self = this.set("powerFormRole", js.undefined)
    
    @scala.inline
    def setPowerFormRoleMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("powerFormRoleMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerFormRoleMetadata: Self = this.set("powerFormRoleMetadata", js.undefined)
    
    @scala.inline
    def setReceiveCompletedSelfSignedDocumentsAsEmailLinks(value: String): Self = this.set("receiveCompletedSelfSignedDocumentsAsEmailLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveCompletedSelfSignedDocumentsAsEmailLinks: Self = this.set("receiveCompletedSelfSignedDocumentsAsEmailLinks", js.undefined)
    
    @scala.inline
    def setReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveCompletedSelfSignedDocumentsAsEmailLinksMetadata: Self = this.set("receiveCompletedSelfSignedDocumentsAsEmailLinksMetadata", js.undefined)
    
    @scala.inline
    def setSigningUiVersionMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("signingUiVersionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningUiVersionMetadata: Self = this.set("signingUiVersionMetadata", js.undefined)
    
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
    def setUseNewDocuSignExperienceInterface(value: String): Self = this.set("useNewDocuSignExperienceInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewDocuSignExperienceInterface: Self = this.set("useNewDocuSignExperienceInterface", js.undefined)
    
    @scala.inline
    def setUseNewDocuSignExperienceInterfaceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useNewDocuSignExperienceInterfaceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewDocuSignExperienceInterfaceMetadata: Self = this.set("useNewDocuSignExperienceInterfaceMetadata", js.undefined)
    
    @scala.inline
    def setUseNewSendingInterface(value: String): Self = this.set("useNewSendingInterface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewSendingInterface: Self = this.set("useNewSendingInterface", js.undefined)
    
    @scala.inline
    def setUseNewSendingInterfaceMetadata(
      value: /* Metadata that indicates whether a property is editable and describes setting-specific options. */ SettingsMetadata
    ): Self = this.set("useNewSendingInterfaceMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseNewSendingInterfaceMetadata: Self = this.set("useNewSendingInterfaceMetadata", js.undefined)
    
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
