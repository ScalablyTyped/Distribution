package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeDefinition extends StObject {
  
  /**
    * Reserved for DocuSign.
    */
  var accessControlListBase64: js.UndefOr[String] = js.native
  
  /**
    * Sets the document reading zones for screen reader applications.  This element can only be used if Document Accessibility is enabled for the account.
    *
    * ###### Note: This information is currently generated from the DocuSign web console by setting the reading zones when creating a template,
    * exporting the reading zone string information, and adding it here.
    */
  var accessibility: js.UndefOr[String] = js.native
  
  /**
    * When **true**, comments are allowed on the envelope.
    */
  var allowComments: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the Document Markup feature is enabled.
    *
    * **Note**:  To use this feature, Document Markup must be enabled at both the account and envelope levels. Only Admin users can change this setting for at the account level.
    */
  var allowMarkup: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the recipient can redirect an envelope to a more appropriate recipient.
    */
  var allowReassign: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, this enables the Recursive Recipients feature and allows a recipient to appear more than once in the routing order.
    */
  var allowRecipientRecursion: js.UndefOr[String] = js.native
  
  /**
    * When **true**, users can view the history of the envelope.
    */
  var allowViewHistory: js.UndefOr[String] = js.native
  
  /**
    * Deprecated. This feature has been replaced by signing groups.
    */
  var anySigner: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the envelope is queued for processing and the value of the `status` property is set to `Processing`. Additionally, GET status calls return `Processing` until completed.
    *
    *
    * **Note**: A `transactionId` is required for this call to work correctly. When the envelope is created, the status is `Processing` and an `envelopeId`
    * is not returned in the response. To get the `envelopeId`, use a GET envelope query by using the
    * [transactionId](https://developers.docusign.com/esign-rest-api/reference/Envelopes/Envelopes/create/#envelopeDefinition) or by checking the Connect notification.
    */
  var asynchronous: js.UndefOr[String] = js.native
  
  /**
    * An array of attachment objects containing details about any envelope attachments.
    */
  var attachments: js.UndefOr[js.Array[/* Contains information about an attachment. */ Attachment]] = js.native
  
  /**
    * The URI for retrieving the envelope attachments.
    */
  var attachmentsUri: js.UndefOr[String] = js.native
  
  /**
    * When **true**, marks all of the documents in the envelope as authoritative copies.
    *
    * **Note**: You can override this value for a specific document. For example, you can set the `authoritativeCopy` property to **true** at the envelope level,
    * but turn it off for a single document by setting the `authoritativeCopy` property for the document to **false**.
    */
  var authoritativeCopy: js.UndefOr[String] = js.native
  
  /**
    * The default `authoritativeCopy` setting for documents in this envelope that do not have `authoritativeCopy` set.
    * If this property is not set, each document defaults to the envelope's `authoritativeCopy`.
    */
  var authoritativeCopyDefault: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, autonavigation is set for the recipient.
    *
    */
  var autoNavigation: js.UndefOr[String] = js.native
  
  /**
    * The id of the brand, or text and formatting, to use for the envelope. To use brands, account branding must be enabled for the account.
    */
  var brandId: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the `brandId` for the envelope is locked and senders cannot change the brand used for the envelope.
    */
  var brandLock: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving certificate information.
    */
  var certificateUri: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the envelope was completed.
    */
  var completedDateTime: js.UndefOr[String] = js.native
  
  /**
    * A complex type that can be added to create envelopes from a combination of DocuSign templates and PDF forms. The basic envelope remains the same, while the Composite
    * Template adds new document and template overlays into the envelope. There can be any number of Composite Template structures in the envelope.
    */
  var compositeTemplates: js.UndefOr[js.Array[CompositeTemplate]] = js.native
  
  var copyRecipientData: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the envelope was created.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  /**
    * An optional array of strings that enables the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise
    * not used by DocuSign. Each `customField` string can be a maximum of 100 characters.
    */
  var customFields: js.UndefOr[
    /* An `accountCustomField` is an envelope custom field that you set at the account level. Applying custom fields enables account administators to group
    and manage envelopes.  */ AccountCustomFields
  ] = js.native
  
  /**
    * The URI for retrieving custom fields.
    */
  var customFieldsUri: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the recipient declined the envelope.
    */
  var declinedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the envelope was deleted.
    */
  var deletedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the envelope was delivered to the recipient. Read only.
    */
  var deliveredDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the responsive document feature is turned off for the envelope.
    */
  var disableResponsiveDocument: js.UndefOr[String] = js.native
  
  /**
    * A complex element that contains details about the documents associated with the envelope.
    */
  var documents: js.UndefOr[js.Array[/* A document object. */ Document]] = js.native
  
  /**
    * The URI for retrieving all of the documents associated with the envelope as a single PDF file.
    */
  var documentsCombinedUri: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving all of the documents associated with the envelope as separate files.
    */
  var documentsUri: js.UndefOr[String] = js.native
  
  /**
    * This optional element holds the body of the email message that is sent to all envelope recipients.
    *
    * Maximum Length: 10000 characters.
    */
  var emailBlurb: js.UndefOr[String] = js.native
  
  /**
    * This optional complex element enables the sender to override some envelope email setting information.
    * This can be used to override the Reply To email address and name associated with the envelope, as well as the BCC email addresses to which an envelope is sent.
    * When the `emailSettings` information is used for an envelope, it only applies to that envelope.
    *
    * **Important Note**: The `emailSettings` information is not returned in the GET method for envelope status. Use GET /email_settings to return information about the emailSettings.
    */
  var emailSettings: js.UndefOr[EmailSettings] = js.native
  
  /**
    * The subject line of the email message that is sent to all recipients.
    *
    * For information about adding merge field information to the email subject, see
    * [Template Email Subject Merge Fields](https://developers.docusign.com/esign-rest-api/reference/Templates/Templates/create#template-email-subject-merge-fields).
    *
    */
  var emailSubject: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the signer is allowed to print the document and sign it on paper.
    */
  var enableWetSign: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, signers can only view the documents on which they have tabs. Recipients that have an administrative role (Agent, Editor, or
    * Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all of the documents in an envelope, unless they are
    * specifically excluded by using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients, unless
    * they are specifically excluded by using this setting when an envelope is sent.
    *
    * **Note**: To use this functionality, [Document Visibility][docviz] must be enabled for the account by making the account setting `allowDocumentVisibility` **true**.
    *
    * [docviz]: /esign/restapi/Envelopes/EnvelopeDocumentVisibility
    */
  var enforceSignerVisibility: js.UndefOr[String] = js.native
  
  /**
    * An array of attachment objects that provide information about the attachments that are associated with the envelope.
    */
  var envelopeAttachments: js.UndefOr[js.Array[/* Contains information about an attachment. */ Attachment]] = js.native
  
  /**
    * An array containing information about the documents that are included in the envelope.
    */
  var envelopeDocuments: js.UndefOr[
    js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]
  ] = js.native
  
  /**
    * The envelope's GUID.
    *
    * Example: `93be49ab-afa0-4adf-933c-f752070d71ec`
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, [Envelope ID Stamping](https://support.docusign.com/en/guides/ndse-user-guide-set-advanced-document-options) is enabled.
    * After a document or attachment is stamped with an Envelope ID,
    * the ID is seen by all recipients
    * and becomes a permanent part of the document
    * and cannot be removed.
    */
  var envelopeIdStamping: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var envelopeLocation: js.UndefOr[String] = js.native
  
  /**
    * Metadata about the features that are enabled for the envelope.
    */
  var envelopeMetadata: js.UndefOr[EnvelopeMetadata] = js.native
  
  /**
    * The URI for retrieving the envelope or envelopes.
    */
  var envelopeUri: js.UndefOr[String] = js.native
  
  /**
    * This optional object is used to register a webhook that will receive status changes for this envelope.
    */
  var eventNotification: js.UndefOr[/* Register a Connect webhook for a specific envelope */ EventNotification] = js.native
  
  /**
    * An array of `eventNotification` objects.
    */
  var eventNotifications: js.UndefOr[
    js.Array[/* Register a Connect webhook for a specific envelope */ EventNotification]
  ] = js.native
  
  /**
    * An integer specifying the number of days that a sent envelope remains active before it expires. A negative number in a response indicates that the envelope has already expired.
    */
  var expireAfter: js.UndefOr[String] = js.native
  
  /**
    * The date and time the envelope is set to expire.
    */
  var expireDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the envelope expires (is no longer available for signing) after the specified number of days after it is sent (`sentDateTime`).
    * Set  `expireAfter` to set the number of days until an envelope expires. When **false**, the account default setting is used. If the account does
    * not have an expiration setting, the DocuSign default value of 120 days is used.
    */
  var expireEnabled: js.UndefOr[String] = js.native
  
  /**
    * May contain an external identifier for the envelope.
    */
  var externalEnvelopeId: js.UndefOr[String] = js.native
  
  /**
    * An array of folders that the envelope belongs to.
    */
  var folders: js.UndefOr[js.Array[/* This object contains details about a folder. */ Folder]] = js.native
  
  /**
    * When set to **true**, indicates that users have added comments to the envelope.
    */
  var hasComments: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the form data associated with the envelope has changed since it was sent. If **false**, this property does not appear in the response.
    */
  var hasFormDataChanged: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that a wave file (voice recording) is part of the envelope.
    */
  var hasWavFile: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var holder: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the envelope was first sent.
    */
  var initialSentDateTime: js.UndefOr[String] = js.native
  
  /**
    * When **true**, indicates compliance with United States Food and Drug Administration (FDA) regulations on electronic records and electronic signatures (ERES).
    */
  var is21CFRPart11: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the envelope is a dynamic envelope.
    */
  var isDynamicEnvelope: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, indicates that the envelope is a signature-provided envelope.
    */
  var isSignatureProviderEnvelope: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the item was last modified.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var location: js.UndefOr[String] = js.native
  
  /**
    * Provides lock information about an envelope that a user has locked.
    */
  var lockInformation: js.UndefOr[/* This section provides information about envelope locks. */ EnvelopeLocks] = js.native
  
  /**
    * When set to **true**, prevents senders from changing the contents of `emailBlurb` and `emailSubject` properties for the envelope.
    *
    * Additionally, this prevents users from making changes to the contents of `emailBlurb` and `emailSubject` properties when correcting envelopes.
    *
    * However, if the `messageLock` node is set to **true** and the `emailSubject` property is empty, senders and correctors are able to add a subject to the envelope.
    */
  var messageLock: js.UndefOr[String] = js.native
  
  /**
    * An optional complex element that specifies the notification options for the envelope.
    */
  var notification: js.UndefOr[
    /* A complex element that specifies the notification settings for the envelope. */ Notification
  ] = js.native
  
  /**
    * The URI for retrieving notifications.
    */
  var notificationUri: js.UndefOr[String] = js.native
  
  /**
    * The user's encrypted password hash.
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Information about any PowerForms that are included in the envelope.
    */
  var powerForm: js.UndefOr[/* Contains details about a PowerForm. */ PowerForm] = js.native
  
  /**
    * The date that a purge was completed.
    */
  var purgeCompletedDate: js.UndefOr[String] = js.native
  
  /**
    * The date that a purge was requested.
    */
  var purgeRequestDate: js.UndefOr[String] = js.native
  
  /**
    * Initiates a purge request. Valid values are:
    * * `documents_queued`: Places envelope documents in the purge queue.
    * * `documents_and_metadata_queued`: Places envelope documents and metadata in the purge queue.
    *
    */
  var purgeState: js.UndefOr[String] = js.native
  
  /**
    * Specifies the envelope recipients.
    */
  var recipients: js.UndefOr[/* Envelope recipients */ EnvelopeRecipients] = js.native
  
  /**
    * When set to **true**, prevents senders from changing, correcting, or deleting the recipient information for the envelope.
    */
  var recipientsLock: js.UndefOr[String] = js.native
  
  /**
    * Contains a URI for an endpoint that you can use to retrieve the recipients.
    */
  var recipientsUri: js.UndefOr[String] = js.native
  
  /**
    * Information about the sender of the envelope.
    */
  var sender: js.UndefOr[UserInfo] = js.native
  
  /**
    * The UTC DateTime when the envelope was sent. Read only.
    */
  var sentDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, recipients can sign on a mobile device.
    *
    * **Note**: Only Admin users can change this setting.
    *
    */
  var signerCanSignOnMobile: js.UndefOr[String] = js.native
  
  /**
    * Specifies the physical location where the signing takes place. It can have two enumeration values; `inPerson` and `online`. The default value is `online`.
    */
  var signingLocation: js.UndefOr[String] = js.native
  
  /**
    * Indicates the envelope status. Valid values are:
    *
    * * `sent`: The envelope has been sent to the recipients.
    * * `created`: The envelope is saved as a draft and can be modified and sent later.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The data and time that the status changed.
    */
  var statusChangedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The DateTime that the envelope changed status (i.e. was created or sent.)
    */
  var statusDateTime: js.UndefOr[String] = js.native
  
  /**
    * The id of the template. If a value is not provided, DocuSign generates a value.
    */
  var templateId: js.UndefOr[String] = js.native
  
  /**
    * This object specifies the template recipients. Each `roleName` in the template must have a recipient assigned to it. This object is comprised of the following elements:
    *
    * * `email`: The recipient's email address.
    * * `name`: The recipient's name.
    * * `roleName`: The template roleName associated with the recipient.
    * * `clientUserId`: An optional property that specifies whether the recipient is embedded or remote. If the `clientUserId` is not null, then the recipient is embedded.
    * Note that if a `clientUserId` is used and the account settings `signerMustHaveAccount` or `signerMustLoginToSign` are **true**, an error is generated on sending.
    * * `defaultRecipient`: Optional, When set to **true**, this recipient is the default recipient and any tabs generated by the `transformPdfFields`
    * option are mapped to this recipient.
    * * `routingOrder`: This specifies the routing order of the recipient in the envelope.
    * * `accessCode`: This optional element specifies the access code a recipient has to enter to validate the identity. Maximum Length: 50 characters.
    * * `inPersonSignerName`: Optional. If the template role is an in-person signer, this is the full legal name of the signer. Maximum Length: 100 characters.
    * * `emailNotification`: This is an optional complex element that has a role-specific `emailSubject`, `emailBody`, and `language`. It follows the same format as
    * the `emailNotification` property for recipients.
    * * `tabs`: This property enables the tab values to be specified for matching to tabs in the template.
    *
    */
  var templateRoles: js.UndefOr[js.Array[TemplateRole]] = js.native
  
  /**
    * The URI for retrieving any templates associated with the envelope.
    */
  var templatesUri: js.UndefOr[String] = js.native
  
  /**
    *  Used to identify an envelope. The id is a sender-generated value and is valid in the DocuSign system for 7 days. We recommend that you use a transaction ID
    * for offline signing to ensure that an envelope is not sent multiple times. You can use the `transactionId` property to determine an envelope's status
    * (i.e. was it created or not) in cases where the Internet connection was lost before the envelope status was returned.
    */
  var transactionId: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the disclosure is shown to recipients in accordance with the account's Electronic Record and Signature Disclosure frequency setting.
    * When set to **false**, the Electronic Record and Signature Disclosure is not shown to any envelope recipients.
    *
    * If the `useDisclosure` property is not set, then the account's normal disclosure setting is used and the value of the `useDisclosure` property is not returned in
    * responses when getting envelope information.
    */
  var useDisclosure: js.UndefOr[String] = js.native
  
  /**
    * The date and time the envelope or template was voided.
    */
  var voidedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The reason the envelope or template was voided.
    */
  var voidedReason: js.UndefOr[String] = js.native
}
object EnvelopeDefinition {
  
  @scala.inline
  def apply(): EnvelopeDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDefinition]
  }
  
  @scala.inline
  implicit class EnvelopeDefinitionMutableBuilder[Self <: EnvelopeDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessControlListBase64(value: String): Self = StObject.set(x, "accessControlListBase64", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessControlListBase64Undefined: Self = StObject.set(x, "accessControlListBase64", js.undefined)
    
    @scala.inline
    def setAccessibility(value: String): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAllowComments(value: String): Self = StObject.set(x, "allowComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowCommentsUndefined: Self = StObject.set(x, "allowComments", js.undefined)
    
    @scala.inline
    def setAllowMarkup(value: String): Self = StObject.set(x, "allowMarkup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowMarkupUndefined: Self = StObject.set(x, "allowMarkup", js.undefined)
    
    @scala.inline
    def setAllowReassign(value: String): Self = StObject.set(x, "allowReassign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowReassignUndefined: Self = StObject.set(x, "allowReassign", js.undefined)
    
    @scala.inline
    def setAllowRecipientRecursion(value: String): Self = StObject.set(x, "allowRecipientRecursion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowRecipientRecursionUndefined: Self = StObject.set(x, "allowRecipientRecursion", js.undefined)
    
    @scala.inline
    def setAllowViewHistory(value: String): Self = StObject.set(x, "allowViewHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowViewHistoryUndefined: Self = StObject.set(x, "allowViewHistory", js.undefined)
    
    @scala.inline
    def setAnySigner(value: String): Self = StObject.set(x, "anySigner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnySignerUndefined: Self = StObject.set(x, "anySigner", js.undefined)
    
    @scala.inline
    def setAsynchronous(value: String): Self = StObject.set(x, "asynchronous", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsynchronousUndefined: Self = StObject.set(x, "asynchronous", js.undefined)
    
    @scala.inline
    def setAttachments(value: js.Array[/* Contains information about an attachment. */ Attachment]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsUri(value: String): Self = StObject.set(x, "attachmentsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUriUndefined: Self = StObject.set(x, "attachmentsUri", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: (/* Contains information about an attachment. */ Attachment)*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setAuthoritativeCopy(value: String): Self = StObject.set(x, "authoritativeCopy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoritativeCopyDefault(value: String): Self = StObject.set(x, "authoritativeCopyDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthoritativeCopyDefaultUndefined: Self = StObject.set(x, "authoritativeCopyDefault", js.undefined)
    
    @scala.inline
    def setAuthoritativeCopyUndefined: Self = StObject.set(x, "authoritativeCopy", js.undefined)
    
    @scala.inline
    def setAutoNavigation(value: String): Self = StObject.set(x, "autoNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoNavigationUndefined: Self = StObject.set(x, "autoNavigation", js.undefined)
    
    @scala.inline
    def setBrandId(value: String): Self = StObject.set(x, "brandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandIdUndefined: Self = StObject.set(x, "brandId", js.undefined)
    
    @scala.inline
    def setBrandLock(value: String): Self = StObject.set(x, "brandLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBrandLockUndefined: Self = StObject.set(x, "brandLock", js.undefined)
    
    @scala.inline
    def setCertificateUri(value: String): Self = StObject.set(x, "certificateUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateUriUndefined: Self = StObject.set(x, "certificateUri", js.undefined)
    
    @scala.inline
    def setCompletedDateTime(value: String): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    @scala.inline
    def setCompositeTemplates(value: js.Array[CompositeTemplate]): Self = StObject.set(x, "compositeTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompositeTemplatesUndefined: Self = StObject.set(x, "compositeTemplates", js.undefined)
    
    @scala.inline
    def setCompositeTemplatesVarargs(value: CompositeTemplate*): Self = StObject.set(x, "compositeTemplates", js.Array(value :_*))
    
    @scala.inline
    def setCopyRecipientData(value: String): Self = StObject.set(x, "copyRecipientData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyRecipientDataUndefined: Self = StObject.set(x, "copyRecipientData", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setCustomFields(
      value: /* An `accountCustomField` is an envelope custom field that you set at the account level. Applying custom fields enables account administators to group
      and manage envelopes.  */ AccountCustomFields
    ): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomFieldsUri(value: String): Self = StObject.set(x, "customFieldsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUriUndefined: Self = StObject.set(x, "customFieldsUri", js.undefined)
    
    @scala.inline
    def setDeclinedDateTime(value: String): Self = StObject.set(x, "declinedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclinedDateTimeUndefined: Self = StObject.set(x, "declinedDateTime", js.undefined)
    
    @scala.inline
    def setDeletedDateTime(value: String): Self = StObject.set(x, "deletedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedDateTimeUndefined: Self = StObject.set(x, "deletedDateTime", js.undefined)
    
    @scala.inline
    def setDeliveredDateTime(value: String): Self = StObject.set(x, "deliveredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveredDateTimeUndefined: Self = StObject.set(x, "deliveredDateTime", js.undefined)
    
    @scala.inline
    def setDisableResponsiveDocument(value: String): Self = StObject.set(x, "disableResponsiveDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableResponsiveDocumentUndefined: Self = StObject.set(x, "disableResponsiveDocument", js.undefined)
    
    @scala.inline
    def setDocuments(value: js.Array[/* A document object. */ Document]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsCombinedUri(value: String): Self = StObject.set(x, "documentsCombinedUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsCombinedUriUndefined: Self = StObject.set(x, "documentsCombinedUri", js.undefined)
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setDocumentsUri(value: String): Self = StObject.set(x, "documentsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUriUndefined: Self = StObject.set(x, "documentsUri", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: (/* A document object. */ Document)*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    @scala.inline
    def setEmailBlurb(value: String): Self = StObject.set(x, "emailBlurb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailBlurbUndefined: Self = StObject.set(x, "emailBlurb", js.undefined)
    
    @scala.inline
    def setEmailSettings(value: EmailSettings): Self = StObject.set(x, "emailSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSettingsUndefined: Self = StObject.set(x, "emailSettings", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = StObject.set(x, "emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailSubjectUndefined: Self = StObject.set(x, "emailSubject", js.undefined)
    
    @scala.inline
    def setEnableWetSign(value: String): Self = StObject.set(x, "enableWetSign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableWetSignUndefined: Self = StObject.set(x, "enableWetSign", js.undefined)
    
    @scala.inline
    def setEnforceSignerVisibility(value: String): Self = StObject.set(x, "enforceSignerVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceSignerVisibilityUndefined: Self = StObject.set(x, "enforceSignerVisibility", js.undefined)
    
    @scala.inline
    def setEnvelopeAttachments(value: js.Array[/* Contains information about an attachment. */ Attachment]): Self = StObject.set(x, "envelopeAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeAttachmentsUndefined: Self = StObject.set(x, "envelopeAttachments", js.undefined)
    
    @scala.inline
    def setEnvelopeAttachmentsVarargs(value: (/* Contains information about an attachment. */ Attachment)*): Self = StObject.set(x, "envelopeAttachments", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeDocuments(value: js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]): Self = StObject.set(x, "envelopeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeDocumentsUndefined: Self = StObject.set(x, "envelopeDocuments", js.undefined)
    
    @scala.inline
    def setEnvelopeDocumentsVarargs(value: (/* This object contains details about the envelope document. */ EnvelopeDocument)*): Self = StObject.set(x, "envelopeDocuments", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdStamping(value: String): Self = StObject.set(x, "envelopeIdStamping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdStampingUndefined: Self = StObject.set(x, "envelopeIdStamping", js.undefined)
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setEnvelopeLocation(value: String): Self = StObject.set(x, "envelopeLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeLocationUndefined: Self = StObject.set(x, "envelopeLocation", js.undefined)
    
    @scala.inline
    def setEnvelopeMetadata(value: EnvelopeMetadata): Self = StObject.set(x, "envelopeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeMetadataUndefined: Self = StObject.set(x, "envelopeMetadata", js.undefined)
    
    @scala.inline
    def setEnvelopeUri(value: String): Self = StObject.set(x, "envelopeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeUriUndefined: Self = StObject.set(x, "envelopeUri", js.undefined)
    
    @scala.inline
    def setEventNotification(value: /* Register a Connect webhook for a specific envelope */ EventNotification): Self = StObject.set(x, "eventNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNotificationUndefined: Self = StObject.set(x, "eventNotification", js.undefined)
    
    @scala.inline
    def setEventNotifications(value: js.Array[/* Register a Connect webhook for a specific envelope */ EventNotification]): Self = StObject.set(x, "eventNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNotificationsUndefined: Self = StObject.set(x, "eventNotifications", js.undefined)
    
    @scala.inline
    def setEventNotificationsVarargs(value: (/* Register a Connect webhook for a specific envelope */ EventNotification)*): Self = StObject.set(x, "eventNotifications", js.Array(value :_*))
    
    @scala.inline
    def setExpireAfter(value: String): Self = StObject.set(x, "expireAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireAfterUndefined: Self = StObject.set(x, "expireAfter", js.undefined)
    
    @scala.inline
    def setExpireDateTime(value: String): Self = StObject.set(x, "expireDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireDateTimeUndefined: Self = StObject.set(x, "expireDateTime", js.undefined)
    
    @scala.inline
    def setExpireEnabled(value: String): Self = StObject.set(x, "expireEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireEnabledUndefined: Self = StObject.set(x, "expireEnabled", js.undefined)
    
    @scala.inline
    def setExternalEnvelopeId(value: String): Self = StObject.set(x, "externalEnvelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalEnvelopeIdUndefined: Self = StObject.set(x, "externalEnvelopeId", js.undefined)
    
    @scala.inline
    def setFolders(value: js.Array[/* This object contains details about a folder. */ Folder]): Self = StObject.set(x, "folders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldersUndefined: Self = StObject.set(x, "folders", js.undefined)
    
    @scala.inline
    def setFoldersVarargs(value: (/* This object contains details about a folder. */ Folder)*): Self = StObject.set(x, "folders", js.Array(value :_*))
    
    @scala.inline
    def setHasComments(value: String): Self = StObject.set(x, "hasComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasCommentsUndefined: Self = StObject.set(x, "hasComments", js.undefined)
    
    @scala.inline
    def setHasFormDataChanged(value: String): Self = StObject.set(x, "hasFormDataChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasFormDataChangedUndefined: Self = StObject.set(x, "hasFormDataChanged", js.undefined)
    
    @scala.inline
    def setHasWavFile(value: String): Self = StObject.set(x, "hasWavFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasWavFileUndefined: Self = StObject.set(x, "hasWavFile", js.undefined)
    
    @scala.inline
    def setHolder(value: String): Self = StObject.set(x, "holder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolderUndefined: Self = StObject.set(x, "holder", js.undefined)
    
    @scala.inline
    def setInitialSentDateTime(value: String): Self = StObject.set(x, "initialSentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialSentDateTimeUndefined: Self = StObject.set(x, "initialSentDateTime", js.undefined)
    
    @scala.inline
    def setIs21CFRPart11(value: String): Self = StObject.set(x, "is21CFRPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs21CFRPart11Undefined: Self = StObject.set(x, "is21CFRPart11", js.undefined)
    
    @scala.inline
    def setIsDynamicEnvelope(value: String): Self = StObject.set(x, "isDynamicEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDynamicEnvelopeUndefined: Self = StObject.set(x, "isDynamicEnvelope", js.undefined)
    
    @scala.inline
    def setIsSignatureProviderEnvelope(value: String): Self = StObject.set(x, "isSignatureProviderEnvelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSignatureProviderEnvelopeUndefined: Self = StObject.set(x, "isSignatureProviderEnvelope", js.undefined)
    
    @scala.inline
    def setLastModifiedDateTime(value: String): Self = StObject.set(x, "lastModifiedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateTimeUndefined: Self = StObject.set(x, "lastModifiedDateTime", js.undefined)
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLockInformation(value: /* This section provides information about envelope locks. */ EnvelopeLocks): Self = StObject.set(x, "lockInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockInformationUndefined: Self = StObject.set(x, "lockInformation", js.undefined)
    
    @scala.inline
    def setMessageLock(value: String): Self = StObject.set(x, "messageLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageLockUndefined: Self = StObject.set(x, "messageLock", js.undefined)
    
    @scala.inline
    def setNotification(
      value: /* A complex element that specifies the notification settings for the envelope. */ Notification
    ): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    @scala.inline
    def setNotificationUri(value: String): Self = StObject.set(x, "notificationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUriUndefined: Self = StObject.set(x, "notificationUri", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    @scala.inline
    def setPowerForm(value: /* Contains details about a PowerForm. */ PowerForm): Self = StObject.set(x, "powerForm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerFormUndefined: Self = StObject.set(x, "powerForm", js.undefined)
    
    @scala.inline
    def setPurgeCompletedDate(value: String): Self = StObject.set(x, "purgeCompletedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeCompletedDateUndefined: Self = StObject.set(x, "purgeCompletedDate", js.undefined)
    
    @scala.inline
    def setPurgeRequestDate(value: String): Self = StObject.set(x, "purgeRequestDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeRequestDateUndefined: Self = StObject.set(x, "purgeRequestDate", js.undefined)
    
    @scala.inline
    def setPurgeState(value: String): Self = StObject.set(x, "purgeState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurgeStateUndefined: Self = StObject.set(x, "purgeState", js.undefined)
    
    @scala.inline
    def setRecipients(value: /* Envelope recipients */ EnvelopeRecipients): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsLock(value: String): Self = StObject.set(x, "recipientsLock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsLockUndefined: Self = StObject.set(x, "recipientsLock", js.undefined)
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsUri(value: String): Self = StObject.set(x, "recipientsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUriUndefined: Self = StObject.set(x, "recipientsUri", js.undefined)
    
    @scala.inline
    def setSender(value: UserInfo): Self = StObject.set(x, "sender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUndefined: Self = StObject.set(x, "sender", js.undefined)
    
    @scala.inline
    def setSentDateTime(value: String): Self = StObject.set(x, "sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentDateTimeUndefined: Self = StObject.set(x, "sentDateTime", js.undefined)
    
    @scala.inline
    def setSignerCanSignOnMobile(value: String): Self = StObject.set(x, "signerCanSignOnMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerCanSignOnMobileUndefined: Self = StObject.set(x, "signerCanSignOnMobile", js.undefined)
    
    @scala.inline
    def setSigningLocation(value: String): Self = StObject.set(x, "signingLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningLocationUndefined: Self = StObject.set(x, "signingLocation", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusChangedDateTime(value: String): Self = StObject.set(x, "statusChangedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusChangedDateTimeUndefined: Self = StObject.set(x, "statusChangedDateTime", js.undefined)
    
    @scala.inline
    def setStatusDateTime(value: String): Self = StObject.set(x, "statusDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDateTimeUndefined: Self = StObject.set(x, "statusDateTime", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    @scala.inline
    def setTemplateRoles(value: js.Array[TemplateRole]): Self = StObject.set(x, "templateRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRolesUndefined: Self = StObject.set(x, "templateRoles", js.undefined)
    
    @scala.inline
    def setTemplateRolesVarargs(value: TemplateRole*): Self = StObject.set(x, "templateRoles", js.Array(value :_*))
    
    @scala.inline
    def setTemplatesUri(value: String): Self = StObject.set(x, "templatesUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplatesUriUndefined: Self = StObject.set(x, "templatesUri", js.undefined)
    
    @scala.inline
    def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
    
    @scala.inline
    def setUseDisclosure(value: String): Self = StObject.set(x, "useDisclosure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseDisclosureUndefined: Self = StObject.set(x, "useDisclosure", js.undefined)
    
    @scala.inline
    def setVoidedDateTime(value: String): Self = StObject.set(x, "voidedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidedDateTimeUndefined: Self = StObject.set(x, "voidedDateTime", js.undefined)
    
    @scala.inline
    def setVoidedReason(value: String): Self = StObject.set(x, "voidedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoidedReasonUndefined: Self = StObject.set(x, "voidedReason", js.undefined)
  }
}
