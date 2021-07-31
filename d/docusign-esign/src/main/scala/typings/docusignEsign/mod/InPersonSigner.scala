package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InPersonSigner extends StObject {
  
  /**
    * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.
    *
    * Maximum Length: 50 characters and it must conform to the account's access code format setting.
    *
    * If blank, but the signer `accessCode` property is set in the envelope, then that value is used.
    *
    * If blank and the signer `accessCode` property is not set, then the access code is not required.
    */
  var accessCode: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `accessCode` property is editable. Read only.
    */
  var accessCodeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Optional. When set to **true**, the access code will be added to the email sent to the recipient. This nullifies the security measure of `accessCode` on the recipient.
    */
  var addAccessCodeToEmail: js.UndefOr[String] = js.undefined
  
  var allowSystemOverrideForLockedRecipient: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, autonavigation is set for the recipient.
    *
    */
  var autoNavigation: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, specifies that the signer can perform the signing ceremony offline.
    */
  var canSignOffline: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether the recipient is embedded or remote.
    *
    * If the `clientUserId` property is not null then the recipient is embedded. Use this field to associate the signer with their userId in your app. Authenticating the
    * user is the responsibility of your app when you use embedded signing.
    *
    * Note: if the `clientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**,
    * an error is generated on sending.
    *
    * Maximum length: 100 characters.
    */
  var clientUserId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the number of times that the recipient has been through a signing completion.
    *
    * If this number is greater than `0` for a signing group, only the user who previously completed may sign again.
    */
  var completedCount: js.UndefOr[String] = js.undefined
  
  /**
    * The reason why the recipient was created (for example, `sender`). Read only.
    */
  var creationReason: js.UndefOr[String] = js.undefined
  
  /**
    * An optional array of strings that enables the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not
    * used by DocuSign. Each `customField` string can be a maximum of 100 characters.
    */
  var customFields: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The date and time the recipient declined the document. Read only.
    */
  var declinedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The reason the recipient declined the document. Read only.
    */
  var declinedReason: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**,
    * this is the default recipient for the envelope.
    * This option is used when creating an envelope from a template.
    *
    */
  var defaultRecipient: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time that the envelope was delivered to the recipient. Read only.
    */
  var deliveredDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var deliveryMethod: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var deliveryMethodMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  var designatorId: js.UndefOr[String] = js.undefined
  
  var designatorIdGuid: js.UndefOr[String] = js.undefined
  
  /**
    * A list of `documentVisibility` objects. Each object in the list specifies whether a document in the envelope is visible to this recipient.
    * For the envelope to use this functionality, Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true**.
    */
  var documentVisibility: js.UndefOr[
    js.Array[
      /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
    ]
  ] = js.undefined
  
  /**
    * The signer's email address in an eNotary flow.
    *
    * Use only when `inPersonSigningType` is `notary`.
    * For regular in-person-signer flow, use `signerEmail` instead.
    *
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `email` property is editable. Read only.
    */
  var emailMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * An optional complex type that sets a specific email subject and body for this recipient's notification email.
    *
    * **Note**: You can set the `emailNotification` property separately for each recipient. If you set the value only for certain recipients, the other recipients will
    * inherit the this value from the top-level `emailSubject` and `emailBlurb`.
    */
  var emailNotification: js.UndefOr[RecipientEmailNotification] = js.undefined
  
  /**
    * Specifies a sender-provided valid URL string for redirecting an embedded recipient. When using this option, the embedded recipient still receives an email from DocuSign,
    * just as a remote recipient would. When the document link in the email is clicked the recipient is redirected, through DocuSign, to the supplied URL to complete their actions.
    * When routing to the URL, the sender's system (the server responding to the URL) must request a recipient token to launch a signing session.
    *
    * If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated by
    * the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded
    * signing or viewing operation launched by a partner.
    *
    * It is important to understand that in a typical embedded workflow, the authentication of an embedded recipient is the responsibility of the sending application.
    * DocuSign expects that senders will follow their own processes for establishing the recipient's identity. In this workflow the recipient goes through the sending
    * application before the embedded signing or viewing process is initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`,
    * the recipient goes directly to the embedded signing or viewing process, bypassing the sending application and any authentication steps the sending application would use.
    * In this case, DocuSign recommends that you use one of the normal DocuSign authentication features (Access Code, Phone Authentication, SMS Authentication, etc.)
    * to verify the identity of the recipient.
    *
    * If the `clientUserId` property is NOT set, and the `embeddedRecipientStartURL` is set, DocuSign will ignore the redirect URL and launch the standard signing process
    * for the email recipient. Information can be appended to the embedded recipient start URL using merge fields. The available merge fields items are: `envelopeId`,
    * `recipientId`, `recipientName`, `recipientEmail`, and `customFields`. The `customFields` property must be set for the recipient or envelope. The merge fields are
    * enclosed in double brackets.
    *
    * *Example*:
    *
    * `http://senderHost/[[mergeField1]]/ beginSigningSession? [[mergeField2]]&[[mergeField3]]`
    */
  var embeddedRecipientStartURL: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property
    * must be set to **true** for the envelope to use this.
    *
    * When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative
    * role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope,
    * unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients,
    * unless they are specifically excluded using this setting when an envelope is sent.
    */
  var excludedDocuments: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumber: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The email address of the signing host.
    * This is the DocuSign user that is hosting the in-person signing session.
    *
    * Required when `inPersonSigningType` is `inPersonSigner`.
    * For eNotary flow, use `email` instead.
    *
    * Maximum Length: 100 characters.
    *
    */
  var hostEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `hostEmail` property is editable.
    */
  var hostEmailMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The name of the signing host.
    * This is the DocuSign user that is hosting the in-person signing session.
    *
    * Required when `inPersonSigningType` is `inPersonSigner`.
    * For eNotary flow, use `name` instead.
    *
    * Maximum Length: 100 characters.
    *
    */
  var hostName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `hostName` property is editable.
    */
  var hostNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The name of the authentication check to use. This value must match one of the authentication types that the account uses. The names of these authentication
    * types appear in the web console sending export interface in the Identify list for a recipient. This setting overrides any default authentication setting. Valid values are:
    *
    * - `Phone Auth $`: The recipient must authenticate by using two-factor authentication (2FA). You provide the phone number to use for 2FA in the `phoneAuthentication` object.
    * - `SMS Auth $`: The recipient must authenticate via SMS. You provide the phone number to use in the `smsAuthentication` object.
    * - `ID Check $`: The  recipient must answer detailed security questions.
    *
    * **Example**: Your account has ID Check and SMS Authentication available. In the web console Identify list, these appear as ID Check $ and SMS Auth $.
    * To use ID Check in an envelope, the idCheckConfigurationName should be ID Check $. For SMS, you would use SMS Auth $, and you would also need to add a
    * phone number to the smsAuthentication node.
    */
  var idCheckConfigurationName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `idCheckConfigurationName` property is editable. Read only.
    */
  var idCheckConfigurationNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * An object that contains input information related to a recipient ID check.
    */
  var idCheckInformationInput: js.UndefOr[
    /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
  ] = js.undefined
  
  /**
    * Specifies whether the envelope uses the eNotary feature.
    * Valid values:
    *
    * * `inPersonSigner`: The envelope uses the normal in-person signing flow.
    * * `notary`: The envelope uses the eNotary in-person signing flow.
    *
    */
  var inPersonSigningType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `inPersonSigningType` property is editable.
    */
  var inPersonSigningTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the
    * default settings for the recipient's account.
    */
  var inheritEmailNotificationConfiguration: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var lockedRecipientPhoneAuthEditable: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var lockedRecipientSmsEditable: js.UndefOr[String] = js.undefined
  
  /**
    * The signer's full legal name in an eNotary flow.
    *
    * Required when `inPersonSigningType` is `notary`.
    * For a regular in-person-signer flow, use `signerName` instead.
    *
    * Maximum Length: 100 characters.
    *
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `name` property is editable. Read only.
    */
  var nameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Information about the notary host. The following information is required when using the eNotary in-person signing flow:
    *
    * - `name`: The name of the notary.
    * - `email`: The email address of the notary.
    * - `recipientId`: A unique ID number for the notary signing host.
    */
  var notaryHost: js.UndefOr[NotaryHost] = js.undefined
  
  /**
    * A note sent to the in-person signer in the signing email.
    * This note is visible only to this recipient.
    *
    * Maximum Length: 1000 characters.
    *
    */
  var note: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `note` property is editable. Read only.
    */
  var noteMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When `idCheckConfigurationName` is set to `Phone Auth $`, you use this complex type to provide the recipient authentication method details. It contains the following elements:
    *
    * * `recipMayProvideNumber`: Boolean. When set to **true**, the recipient can use whatever phone number they choose.
    * * `senderProvidedNumbers`: ArrayOfStrings.  A list of phone numbers the recipient can use.
    * * `recordVoicePrint`: Reserved for DocuSign.
    * * `validateRecipProvidedNumber`: Reserved for DocuSign.
    */
  var phoneAuthentication: js.UndefOr[RecipientPhoneAuthentication] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var recipientAttachments: js.UndefOr[js.Array[RecipientAttachment]] = js.undefined
  
  /**
    * Information about the recipient's authentication status. Read only.
    */
  var recipientAuthenticationStatus: js.UndefOr[
    /* A complex element that contains information about a user's authentication status. */ AuthenticationStatus
  ] = js.undefined
  
  /**
    * Metadata about the features that are supported for the recipient type. Read only.
    */
  var recipientFeatureMetadata: js.UndefOr[js.Array[FeatureAvailableMetadata]] = js.undefined
  
  /**
    * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the document.
    */
  var recipientId: js.UndefOr[String] = js.undefined
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.undefined
  
  /**
    * The default signature provider is the DocuSign Electronic signature system. This parameter is used to specify one or more Standards Based Signature
    * (digital signature) providers for the signer to use. [More information.](https://developers.docusign.com/esign-rest-api/guides/standards-based-signatures)
    */
  var recipientSignatureProviders: js.UndefOr[js.Array[RecipientSignatureProvider]] = js.undefined
  
  /**
    * When set to **true**, specifies that the recipient creates the tabs.
    */
  var recipientSuppliesTabs: js.UndefOr[String] = js.undefined
  
  /**
    * The recipient type, as specified by the following values:
    * - `agent`: Agent recipients can add name and email information for recipients that appear after the agent in routing order.
    * - `carbonCopy`: Carbon copy recipients get a copy of the envelope but don't need to sign, initial, date, or add information to any of the documents.
    * This type of recipient can be used in any routing order.
    * - `certifiedDelivery`: Certified delivery recipients must receive the completed documents for the envelope to be completed. They don't need to sign,
    * initial, date, or add information to any of the documents.
    * - `editor`: Editors have the same management and access rights for the envelope as the sender. Editors can add name and email information,
    * add or change the routing order, set authentication options, and can edit signature/initial tabs and data fields for the remaining recipients.
    * - `inPersonSigner`: In-person recipients are DocuSign users who act as signing hosts in the same physical location as the signer.
    * - `intermediaries`: Intermediary recipients can optionally add name and email information for recipients at the same or subsequent level in the routing order.
    * - `seal`: Electronic seal recipients represent legal entities.
    * - `signer`: Signers are recipients who must sign, initial, date, or add data to form fields on the documents in the envelope.
    * - `witness`: Witnesses are recipients whose signatures affirm that the identified signers have signed the documents in the envelope.
    */
  var recipientType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `recipientType` property is editable. Read only.
    */
  var recipientTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity.
    */
  var requireIdLookup: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `requireIdLookup` property is editable. Read only.
    */
  var requireIdLookupMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * When set to **true**, the signer must print, sign, and upload or fax the signed documents to DocuSign.
    */
  var requireSignOnPaper: js.UndefOr[String] = js.undefined
  
  /**
    * By default, DocuSign signers create electronic signatures. This field can be used to require the signer to use a SAFE-BioPharma digital certificate for signing.
    *
    * This parameter should only be used to select a SAFE-BioPharma certificate. New integrations should use the `recipientSignatureProviders`
    * parameter for other types of digital certificates.
    *
    * Set this parameter to `safe` to use a SAFE-BioPharma certificate.
    *
    * The signer must be enrolled in the SAFE program to sign with a SAFE certificate.
    */
  var requireSignerCertificate: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the signer is required to upload a new signature, even if they have a pre-adopted signature in their personal DocuSign account.
    */
  var requireUploadSignature: js.UndefOr[String] = js.undefined
  
  /**
    * Optional element. Specifies the role name associated with the recipient.<br/><br/>This property is required when you are working with template recipients.
    */
  var roleName: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the routing order of the recipient in the envelope.
    */
  var routingOrder: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `routingOrder` property is editable. Read only.
    */
  var routingOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The UTC DateTime when the envelope was sent. Read only.
    */
  var sentDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each
    * signature/initial tab (instead of adopting a signature/initial style or only drawing a signature/initial once).
    */
  var signInEachLocation: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signInEachLocation` property is editable. Read only.
    */
  var signInEachLocationMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.
    *
    * Used only with recipient types In Person Signers and Signers.
    */
  var signatureInfo: js.UndefOr[RecipientSignatureInformation] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var signedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The in-person signer's email address.
    *
    * Required when `inPersonSigningType` is `inPersonSigner`.
    * For eNotary flow, use `email` instead.
    *
    * Maximum Length: 100 characters.
    *
    *
    */
  var signerEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the sender can edit the in-person signer's email address.
    */
  var signerEmailMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The signer's first name.
    */
  var signerFirstName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates if the `signerFirstName` property is editable.
    */
  var signerFirstNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The signer's last name.
    */
  var signerLastName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerLastName` property is editable.
    */
  var signerLastNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * The in-person signer's full legal name.
    *
    * Required when `inPersonSigningType` is `inPersonSigner`.
    * For eNotary flow, use `name` instead.
    *
    * Maximum Length: 100 characters.
    *
    */
  var signerName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signerName` property is editable.
    */
  var signerNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Not applicable. You cannot use a signing group for an in-person signer.
    */
  var signingGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Not applicable.
    */
  var signingGroupIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Not applicable.
    */
  var signingGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Not applicable.
    */
  var signingGroupUsers: js.UndefOr[js.Array[UserInfo]] = js.undefined
  
  /**
    * When `idCheckConfigurationName` is set to `SMS Auth $`, you use this complex type to provide the recipient authentication method details.
    * It contains the element `senderProvidedNumbers`, which is an array of phone numbers that the recipient can use for SMS text authentication.
    *
    *
    */
  var smsAuthentication: js.UndefOr[RecipientSMSAuthentication] = js.undefined
  
  /**
    * Deprecated.
    */
  var socialAuthentications: js.UndefOr[js.Array[SocialAuthentication]] = js.undefined
  
  /**
    * The recipient's status. Read only.
    *
    * Possible values:
    *
    * - `autoresponded`: The recipient's email system auto-responded to the email from DocuSign. This status is used in the web console to inform senders about the
    * bounced-back email. This recipient status is only used if **Send-on-behalf-of** is turned off for the account.
    * - `completed`: The recipient has completed their actions (signing or other required actions if not a signer) for an envelope.
    * - `created`: The recipient is in a draft state. This value is only associated with draft envelopes (envelopes that have a status of `created`).
    * - `declined`: The recipient declined to sign the document(s) in the envelope.
    * - `delivered`: The recipient has viewed the document(s) in an envelope through the DocuSign signing website. This is not an email delivery of the documents in an envelope.
    * - `faxPending`: The recipient has finished signing and the system is waiting for a fax attachment from the recipient before completing their signing step.
    * - `sent`: The recipient has been sent an email notification that it is their turn to sign an envelope.
    * - `signed`: The recipient has completed (signed) all required tags in an envelope. This is a temporary state during processing, after which the recipient's
    * status automatically switches to `completed`.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The code associated with the recipient's status. Read only.
    */
  var statusCode: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, email notifications are suppressed for the recipient, and they must access envelopes and documents from their DocuSign inbox.
    */
  var suppressEmails: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data.
    * They may also display data to the recipients.
    */
  var tabs: js.UndefOr[EnvelopeRecipientTabs] = js.undefined
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.undefined
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of tabs in the documents. Read only.
    */
  var totalTabCount: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.undefined
}
object InPersonSigner {
  
  @scala.inline
  def apply(): InPersonSigner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InPersonSigner]
  }
  
  @scala.inline
  implicit class InPersonSignerMutableBuilder[Self <: InPersonSigner] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessCode(value: String): Self = StObject.set(x, "accessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessCodeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "accessCodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessCodeMetadataUndefined: Self = StObject.set(x, "accessCodeMetadata", js.undefined)
    
    @scala.inline
    def setAccessCodeUndefined: Self = StObject.set(x, "accessCode", js.undefined)
    
    @scala.inline
    def setAddAccessCodeToEmail(value: String): Self = StObject.set(x, "addAccessCodeToEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAccessCodeToEmailUndefined: Self = StObject.set(x, "addAccessCodeToEmail", js.undefined)
    
    @scala.inline
    def setAllowSystemOverrideForLockedRecipient(value: String): Self = StObject.set(x, "allowSystemOverrideForLockedRecipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSystemOverrideForLockedRecipientUndefined: Self = StObject.set(x, "allowSystemOverrideForLockedRecipient", js.undefined)
    
    @scala.inline
    def setAutoNavigation(value: String): Self = StObject.set(x, "autoNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoNavigationUndefined: Self = StObject.set(x, "autoNavigation", js.undefined)
    
    @scala.inline
    def setCanSignOffline(value: String): Self = StObject.set(x, "canSignOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanSignOfflineUndefined: Self = StObject.set(x, "canSignOffline", js.undefined)
    
    @scala.inline
    def setClientUserId(value: String): Self = StObject.set(x, "clientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUserIdUndefined: Self = StObject.set(x, "clientUserId", js.undefined)
    
    @scala.inline
    def setCompletedCount(value: String): Self = StObject.set(x, "completedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedCountUndefined: Self = StObject.set(x, "completedCount", js.undefined)
    
    @scala.inline
    def setCreationReason(value: String): Self = StObject.set(x, "creationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationReasonUndefined: Self = StObject.set(x, "creationReason", js.undefined)
    
    @scala.inline
    def setCustomFields(value: js.Array[String]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomFieldsVarargs(value: String*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setDeclinedDateTime(value: String): Self = StObject.set(x, "declinedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclinedDateTimeUndefined: Self = StObject.set(x, "declinedDateTime", js.undefined)
    
    @scala.inline
    def setDeclinedReason(value: String): Self = StObject.set(x, "declinedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclinedReasonUndefined: Self = StObject.set(x, "declinedReason", js.undefined)
    
    @scala.inline
    def setDefaultRecipient(value: String): Self = StObject.set(x, "defaultRecipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultRecipientUndefined: Self = StObject.set(x, "defaultRecipient", js.undefined)
    
    @scala.inline
    def setDeliveredDateTime(value: String): Self = StObject.set(x, "deliveredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveredDateTimeUndefined: Self = StObject.set(x, "deliveredDateTime", js.undefined)
    
    @scala.inline
    def setDeliveryMethod(value: String): Self = StObject.set(x, "deliveryMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryMethodMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "deliveryMethodMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryMethodMetadataUndefined: Self = StObject.set(x, "deliveryMethodMetadata", js.undefined)
    
    @scala.inline
    def setDeliveryMethodUndefined: Self = StObject.set(x, "deliveryMethod", js.undefined)
    
    @scala.inline
    def setDesignatorId(value: String): Self = StObject.set(x, "designatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignatorIdGuid(value: String): Self = StObject.set(x, "designatorIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesignatorIdGuidUndefined: Self = StObject.set(x, "designatorIdGuid", js.undefined)
    
    @scala.inline
    def setDesignatorIdUndefined: Self = StObject.set(x, "designatorId", js.undefined)
    
    @scala.inline
    def setDocumentVisibility(
      value: js.Array[
          /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
        ]
    ): Self = StObject.set(x, "documentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVisibilityUndefined: Self = StObject.set(x, "documentVisibility", js.undefined)
    
    @scala.inline
    def setDocumentVisibilityVarargs(
      value: (/* This object configures a recipient's read/write access to a document. */ DocumentVisibility)*
    ): Self = StObject.set(x, "documentVisibility", js.Array(value :_*))
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "emailMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailMetadataUndefined: Self = StObject.set(x, "emailMetadata", js.undefined)
    
    @scala.inline
    def setEmailNotification(value: RecipientEmailNotification): Self = StObject.set(x, "emailNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailNotificationUndefined: Self = StObject.set(x, "emailNotification", js.undefined)
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setEmbeddedRecipientStartURL(value: String): Self = StObject.set(x, "embeddedRecipientStartURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbeddedRecipientStartURLUndefined: Self = StObject.set(x, "embeddedRecipientStartURL", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setExcludedDocuments(value: js.Array[String]): Self = StObject.set(x, "excludedDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedDocumentsUndefined: Self = StObject.set(x, "excludedDocuments", js.undefined)
    
    @scala.inline
    def setExcludedDocumentsVarargs(value: String*): Self = StObject.set(x, "excludedDocuments", js.Array(value :_*))
    
    @scala.inline
    def setFaxNumber(value: String): Self = StObject.set(x, "faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "faxNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumberMetadataUndefined: Self = StObject.set(x, "faxNumberMetadata", js.undefined)
    
    @scala.inline
    def setFaxNumberUndefined: Self = StObject.set(x, "faxNumber", js.undefined)
    
    @scala.inline
    def setHostEmail(value: String): Self = StObject.set(x, "hostEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostEmailMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "hostEmailMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostEmailMetadataUndefined: Self = StObject.set(x, "hostEmailMetadata", js.undefined)
    
    @scala.inline
    def setHostEmailUndefined: Self = StObject.set(x, "hostEmail", js.undefined)
    
    @scala.inline
    def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "hostNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNameMetadataUndefined: Self = StObject.set(x, "hostNameMetadata", js.undefined)
    
    @scala.inline
    def setHostNameUndefined: Self = StObject.set(x, "hostName", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationName(value: String): Self = StObject.set(x, "idCheckConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCheckConfigurationNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "idCheckConfigurationNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCheckConfigurationNameMetadataUndefined: Self = StObject.set(x, "idCheckConfigurationNameMetadata", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationNameUndefined: Self = StObject.set(x, "idCheckConfigurationName", js.undefined)
    
    @scala.inline
    def setIdCheckInformationInput(
      value: /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
    ): Self = StObject.set(x, "idCheckInformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCheckInformationInputUndefined: Self = StObject.set(x, "idCheckInformationInput", js.undefined)
    
    @scala.inline
    def setInPersonSigningType(value: String): Self = StObject.set(x, "inPersonSigningType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPersonSigningTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "inPersonSigningTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInPersonSigningTypeMetadataUndefined: Self = StObject.set(x, "inPersonSigningTypeMetadata", js.undefined)
    
    @scala.inline
    def setInPersonSigningTypeUndefined: Self = StObject.set(x, "inPersonSigningType", js.undefined)
    
    @scala.inline
    def setInheritEmailNotificationConfiguration(value: String): Self = StObject.set(x, "inheritEmailNotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritEmailNotificationConfigurationUndefined: Self = StObject.set(x, "inheritEmailNotificationConfiguration", js.undefined)
    
    @scala.inline
    def setLockedRecipientPhoneAuthEditable(value: String): Self = StObject.set(x, "lockedRecipientPhoneAuthEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedRecipientPhoneAuthEditableUndefined: Self = StObject.set(x, "lockedRecipientPhoneAuthEditable", js.undefined)
    
    @scala.inline
    def setLockedRecipientSmsEditable(value: String): Self = StObject.set(x, "lockedRecipientSmsEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockedRecipientSmsEditableUndefined: Self = StObject.set(x, "lockedRecipientSmsEditable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "nameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameMetadataUndefined: Self = StObject.set(x, "nameMetadata", js.undefined)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNotaryHost(value: NotaryHost): Self = StObject.set(x, "notaryHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotaryHostUndefined: Self = StObject.set(x, "notaryHost", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "noteMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteMetadataUndefined: Self = StObject.set(x, "noteMetadata", js.undefined)
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setPhoneAuthentication(value: RecipientPhoneAuthentication): Self = StObject.set(x, "phoneAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneAuthenticationUndefined: Self = StObject.set(x, "phoneAuthentication", js.undefined)
    
    @scala.inline
    def setRecipientAttachments(value: js.Array[RecipientAttachment]): Self = StObject.set(x, "recipientAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientAttachmentsUndefined: Self = StObject.set(x, "recipientAttachments", js.undefined)
    
    @scala.inline
    def setRecipientAttachmentsVarargs(value: RecipientAttachment*): Self = StObject.set(x, "recipientAttachments", js.Array(value :_*))
    
    @scala.inline
    def setRecipientAuthenticationStatus(
      value: /* A complex element that contains information about a user's authentication status. */ AuthenticationStatus
    ): Self = StObject.set(x, "recipientAuthenticationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientAuthenticationStatusUndefined: Self = StObject.set(x, "recipientAuthenticationStatus", js.undefined)
    
    @scala.inline
    def setRecipientFeatureMetadata(value: js.Array[FeatureAvailableMetadata]): Self = StObject.set(x, "recipientFeatureMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientFeatureMetadataUndefined: Self = StObject.set(x, "recipientFeatureMetadata", js.undefined)
    
    @scala.inline
    def setRecipientFeatureMetadataVarargs(value: FeatureAvailableMetadata*): Self = StObject.set(x, "recipientFeatureMetadata", js.Array(value :_*))
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuid(value: String): Self = StObject.set(x, "recipientIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdGuidUndefined: Self = StObject.set(x, "recipientIdGuid", js.undefined)
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProviders(value: js.Array[RecipientSignatureProvider]): Self = StObject.set(x, "recipientSignatureProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSignatureProvidersUndefined: Self = StObject.set(x, "recipientSignatureProviders", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProvidersVarargs(value: RecipientSignatureProvider*): Self = StObject.set(x, "recipientSignatureProviders", js.Array(value :_*))
    
    @scala.inline
    def setRecipientSuppliesTabs(value: String): Self = StObject.set(x, "recipientSuppliesTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSuppliesTabsUndefined: Self = StObject.set(x, "recipientSuppliesTabs", js.undefined)
    
    @scala.inline
    def setRecipientType(value: String): Self = StObject.set(x, "recipientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "recipientTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientTypeMetadataUndefined: Self = StObject.set(x, "recipientTypeMetadata", js.undefined)
    
    @scala.inline
    def setRecipientTypeUndefined: Self = StObject.set(x, "recipientType", js.undefined)
    
    @scala.inline
    def setRequireIdLookup(value: String): Self = StObject.set(x, "requireIdLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireIdLookupMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "requireIdLookupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireIdLookupMetadataUndefined: Self = StObject.set(x, "requireIdLookupMetadata", js.undefined)
    
    @scala.inline
    def setRequireIdLookupUndefined: Self = StObject.set(x, "requireIdLookup", js.undefined)
    
    @scala.inline
    def setRequireSignOnPaper(value: String): Self = StObject.set(x, "requireSignOnPaper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSignOnPaperUndefined: Self = StObject.set(x, "requireSignOnPaper", js.undefined)
    
    @scala.inline
    def setRequireSignerCertificate(value: String): Self = StObject.set(x, "requireSignerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireSignerCertificateUndefined: Self = StObject.set(x, "requireSignerCertificate", js.undefined)
    
    @scala.inline
    def setRequireUploadSignature(value: String): Self = StObject.set(x, "requireUploadSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequireUploadSignatureUndefined: Self = StObject.set(x, "requireUploadSignature", js.undefined)
    
    @scala.inline
    def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
    @scala.inline
    def setRoutingOrder(value: String): Self = StObject.set(x, "routingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "routingOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingOrderMetadataUndefined: Self = StObject.set(x, "routingOrderMetadata", js.undefined)
    
    @scala.inline
    def setRoutingOrderUndefined: Self = StObject.set(x, "routingOrder", js.undefined)
    
    @scala.inline
    def setSentDateTime(value: String): Self = StObject.set(x, "sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentDateTimeUndefined: Self = StObject.set(x, "sentDateTime", js.undefined)
    
    @scala.inline
    def setSignInEachLocation(value: String): Self = StObject.set(x, "signInEachLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInEachLocationMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signInEachLocationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignInEachLocationMetadataUndefined: Self = StObject.set(x, "signInEachLocationMetadata", js.undefined)
    
    @scala.inline
    def setSignInEachLocationUndefined: Self = StObject.set(x, "signInEachLocation", js.undefined)
    
    @scala.inline
    def setSignatureInfo(value: RecipientSignatureInformation): Self = StObject.set(x, "signatureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureInfoUndefined: Self = StObject.set(x, "signatureInfo", js.undefined)
    
    @scala.inline
    def setSignedDateTime(value: String): Self = StObject.set(x, "signedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedDateTimeUndefined: Self = StObject.set(x, "signedDateTime", js.undefined)
    
    @scala.inline
    def setSignerEmail(value: String): Self = StObject.set(x, "signerEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerEmailMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signerEmailMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerEmailMetadataUndefined: Self = StObject.set(x, "signerEmailMetadata", js.undefined)
    
    @scala.inline
    def setSignerEmailUndefined: Self = StObject.set(x, "signerEmail", js.undefined)
    
    @scala.inline
    def setSignerFirstName(value: String): Self = StObject.set(x, "signerFirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerFirstNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signerFirstNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerFirstNameMetadataUndefined: Self = StObject.set(x, "signerFirstNameMetadata", js.undefined)
    
    @scala.inline
    def setSignerFirstNameUndefined: Self = StObject.set(x, "signerFirstName", js.undefined)
    
    @scala.inline
    def setSignerLastName(value: String): Self = StObject.set(x, "signerLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerLastNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signerLastNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerLastNameMetadataUndefined: Self = StObject.set(x, "signerLastNameMetadata", js.undefined)
    
    @scala.inline
    def setSignerLastNameUndefined: Self = StObject.set(x, "signerLastName", js.undefined)
    
    @scala.inline
    def setSignerName(value: String): Self = StObject.set(x, "signerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signerNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerNameMetadataUndefined: Self = StObject.set(x, "signerNameMetadata", js.undefined)
    
    @scala.inline
    def setSignerNameUndefined: Self = StObject.set(x, "signerName", js.undefined)
    
    @scala.inline
    def setSigningGroupId(value: String): Self = StObject.set(x, "signingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "signingGroupIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupIdMetadataUndefined: Self = StObject.set(x, "signingGroupIdMetadata", js.undefined)
    
    @scala.inline
    def setSigningGroupIdUndefined: Self = StObject.set(x, "signingGroupId", js.undefined)
    
    @scala.inline
    def setSigningGroupName(value: String): Self = StObject.set(x, "signingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupNameUndefined: Self = StObject.set(x, "signingGroupName", js.undefined)
    
    @scala.inline
    def setSigningGroupUsers(value: js.Array[UserInfo]): Self = StObject.set(x, "signingGroupUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningGroupUsersUndefined: Self = StObject.set(x, "signingGroupUsers", js.undefined)
    
    @scala.inline
    def setSigningGroupUsersVarargs(value: UserInfo*): Self = StObject.set(x, "signingGroupUsers", js.Array(value :_*))
    
    @scala.inline
    def setSmsAuthentication(value: RecipientSMSAuthentication): Self = StObject.set(x, "smsAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmsAuthenticationUndefined: Self = StObject.set(x, "smsAuthentication", js.undefined)
    
    @scala.inline
    def setSocialAuthentications(value: js.Array[SocialAuthentication]): Self = StObject.set(x, "socialAuthentications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocialAuthenticationsUndefined: Self = StObject.set(x, "socialAuthentications", js.undefined)
    
    @scala.inline
    def setSocialAuthenticationsVarargs(value: SocialAuthentication*): Self = StObject.set(x, "socialAuthentications", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: String): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSuppressEmails(value: String): Self = StObject.set(x, "suppressEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressEmailsUndefined: Self = StObject.set(x, "suppressEmails", js.undefined)
    
    @scala.inline
    def setTabs(value: EnvelopeRecipientTabs): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = StObject.set(x, "templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateLockedUndefined: Self = StObject.set(x, "templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = StObject.set(x, "templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateRequiredUndefined: Self = StObject.set(x, "templateRequired", js.undefined)
    
    @scala.inline
    def setTotalTabCount(value: String): Self = StObject.set(x, "totalTabCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTabCountUndefined: Self = StObject.set(x, "totalTabCount", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
