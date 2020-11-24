package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InPersonSigner extends js.Object {
  
  /**
    * If a value is provided, the recipient must enter the value as the access code to view and sign the envelope.
    *
    * Maximum Length: 50 characters and it must conform to the account's access code format setting.
    *
    * If blank, but the signer `accessCode` property is set in the envelope, then that value is used.
    *
    * If blank and the signer `accessCode` property is not set, then the access code is not required.
    */
  var accessCode: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `accessCode` property is editable. Read only.
    */
  var accessCodeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Optional. When set to **true**, the access code will be added to the email sent to the recipient. This nullifies the security measure of `accessCode` on the recipient.
    */
  var addAccessCodeToEmail: js.UndefOr[String] = js.native
  
  var allowSystemOverrideForLockedRecipient: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, autonavigation is set for the recipient.
    *
    */
  var autoNavigation: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, specifies that the signer can perform the signing ceremony offline.
    */
  var canSignOffline: js.UndefOr[String] = js.native
  
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
  var clientUserId: js.UndefOr[String] = js.native
  
  /**
    * Indicates the number of times that the recipient has been through a signing completion.
    *
    * If this number is greater than `0` for a signing group, only the user who previously completed may sign again.
    */
  var completedCount: js.UndefOr[String] = js.native
  
  /**
    * The reason why the recipient was created (for example, `sender`). Read only.
    */
  var creationReason: js.UndefOr[String] = js.native
  
  /**
    * An optional array of strings that enables the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise not
    * used by DocuSign. Each `customField` string can be a maximum of 100 characters.
    */
  var customFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The date and time the recipient declined the document. Read only.
    */
  var declinedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The reason the recipient declined the document. Read only.
    */
  var declinedReason: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**,
    * this is the default recipient for the envelope.
    * This option is used when creating an envelope from a template.
    *
    */
  var defaultRecipient: js.UndefOr[String] = js.native
  
  /**
    * The date and time that the envelope was delivered to the recipient. Read only.
    */
  var deliveredDateTime: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var deliveryMethod: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var deliveryMethodMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  var designatorId: js.UndefOr[String] = js.native
  
  var designatorIdGuid: js.UndefOr[String] = js.native
  
  /**
    * A list of `documentVisibility` objects. Each object in the list specifies whether a document in the envelope is visible to this recipient.
    * For the envelope to use this functionality, Document Visibility must be enabled for the account and the `enforceSignerVisibility` property must be set to **true**.
    */
  var documentVisibility: js.UndefOr[
    js.Array[
      /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
    ]
  ] = js.native
  
  /**
    * The signer's email address in an eNotary flow.
    *
    * Use only when `inPersonSigningType` is `notary`.
    * For regular in-person-signer flow, use `signerEmail` instead.
    *
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `email` property is editable. Read only.
    */
  var emailMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An optional complex type that sets a specific email subject and body for this recipient's notification email.
    *
    * **Note**: You can set the `emailNotification` property separately for each recipient. If you set the value only for certain recipients, the other recipients will
    * inherit the this value from the top-level `emailSubject` and `emailBlurb`.
    */
  var emailNotification: js.UndefOr[RecipientEmailNotification] = js.native
  
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
  var embeddedRecipientStartURL: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility` property
    * must be set to **true** for the envelope to use this.
    *
    * When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an administrative
    * role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope,
    * unless they are specifically excluded using this setting when an envelope is sent. Documents that do not have tabs are always visible to all recipients,
    * unless they are specifically excluded using this setting when an envelope is sent.
    */
  var excludedDocuments: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumber: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
  var hostEmail: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `hostEmail` property is editable.
    */
  var hostEmailMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
  var hostName: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `hostName` property is editable.
    */
  var hostNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
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
  var idCheckConfigurationName: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `idCheckConfigurationName` property is editable. Read only.
    */
  var idCheckConfigurationNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * An object that contains input information related to a recipient ID check.
    */
  var idCheckInformationInput: js.UndefOr[
    /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
  ] = js.native
  
  /**
    * Specifies whether the envelope uses the eNotary feature.
    * Valid values:
    *
    * * `inPersonSigner`: The envelope uses the normal in-person signing flow.
    * * `notary`: The envelope uses the eNotary in-person signing flow.
    *
    */
  var inPersonSigningType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `inPersonSigningType` property is editable.
    */
  var inPersonSigningTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true** and the envelope recipient creates a DocuSign account after signing, the Manage Account Email Notification settings are used as the
    * default settings for the recipient's account.
    */
  var inheritEmailNotificationConfiguration: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var lockedRecipientPhoneAuthEditable: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var lockedRecipientSmsEditable: js.UndefOr[String] = js.native
  
  /**
    * The signer's full legal name in an eNotary flow.
    *
    * Required when `inPersonSigningType` is `notary`.
    * For a regular in-person-signer flow, use `signerName` instead.
    *
    * Maximum Length: 100 characters.
    *
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `name` property is editable. Read only.
    */
  var nameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Information about the notary host. The following information is required when using the eNotary in-person signing flow:
    *
    * - `name`: The name of the notary.
    * - `email`: The email address of the notary.
    * - `recipientId`: A unique ID number for the notary signing host.
    */
  var notaryHost: js.UndefOr[NotaryHost] = js.native
  
  /**
    * A note sent to the in-person signer in the signing email.
    * This note is visible only to this recipient.
    *
    * Maximum Length: 1000 characters.
    *
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `note` property is editable. Read only.
    */
  var noteMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When `idCheckConfigurationName` is set to `Phone Auth $`, you use this complex type to provide the recipient authentication method details. It contains the following elements:
    *
    * * `recipMayProvideNumber`: Boolean. When set to **true**, the recipient can use whatever phone number they choose.
    * * `senderProvidedNumbers`: ArrayOfStrings.  A list of phone numbers the recipient can use.
    * * `recordVoicePrint`: Reserved for DocuSign.
    * * `validateRecipProvidedNumber`: Reserved for DocuSign.
    */
  var phoneAuthentication: js.UndefOr[RecipientPhoneAuthentication] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var recipientAttachments: js.UndefOr[js.Array[RecipientAttachment]] = js.native
  
  /**
    * Information about the recipient's authentication status. Read only.
    */
  var recipientAuthenticationStatus: js.UndefOr[
    /* A complex element that contains information about a user's authentication status. */ AuthenticationStatus
  ] = js.native
  
  /**
    * Metadata about the features that are supported for the recipient type. Read only.
    */
  var recipientFeatureMetadata: js.UndefOr[js.Array[FeatureAvailableMetadata]] = js.native
  
  /**
    * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the document.
    */
  var recipientId: js.UndefOr[String] = js.native
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.native
  
  /**
    * The default signature provider is the DocuSign Electronic signature system. This parameter is used to specify one or more Standards Based Signature
    * (digital signature) providers for the signer to use. [More information.](https://developers.docusign.com/esign-rest-api/guides/standards-based-signatures)
    */
  var recipientSignatureProviders: js.UndefOr[js.Array[RecipientSignatureProvider]] = js.native
  
  /**
    * When set to **true**, specifies that the recipient creates the tabs.
    */
  var recipientSuppliesTabs: js.UndefOr[String] = js.native
  
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
  var recipientType: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `recipientType` property is editable. Read only.
    */
  var recipientTypeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the recipient is required to use the specified ID check method (including Phone and SMS authentication) to validate their identity.
    */
  var requireIdLookup: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `requireIdLookup` property is editable. Read only.
    */
  var requireIdLookupMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * When set to **true**, the signer must print, sign, and upload or fax the signed documents to DocuSign.
    */
  var requireSignOnPaper: js.UndefOr[String] = js.native
  
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
  var requireSignerCertificate: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the signer is required to upload a new signature, even if they have a pre-adopted signature in their personal DocuSign account.
    */
  var requireUploadSignature: js.UndefOr[String] = js.native
  
  /**
    * Optional element. Specifies the role name associated with the recipient.<br/><br/>This property is required when you are working with template recipients.
    */
  var roleName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the routing order of the recipient in the envelope.
    */
  var routingOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `routingOrder` property is editable. Read only.
    */
  var routingOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The UTC DateTime when the envelope was sent. Read only.
    */
  var sentDateTime: js.UndefOr[String] = js.native
  
  /**
    * When set to **true** and the feature is enabled in the sender's account, the signing recipient is required to draw signatures and initials at each
    * signature/initial tab (instead of adopting a signature/initial style or only drawing a signature/initial once).
    */
  var signInEachLocation: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signInEachLocation` property is editable. Read only.
    */
  var signInEachLocationMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Allows the sender to pre-specify the signature name, signature initials and signature font used in the signature stamp for the recipient.
    *
    * Used only with recipient types In Person Signers and Signers.
    */
  var signatureInfo: js.UndefOr[RecipientSignatureInformation] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var signedDateTime: js.UndefOr[String] = js.native
  
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
  var signerEmail: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the sender can edit the in-person signer's email address.
    */
  var signerEmailMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The signer's first name.
    */
  var signerFirstName: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates if the `signerFirstName` property is editable.
    */
  var signerFirstNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The signer's last name.
    */
  var signerLastName: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerLastName` property is editable.
    */
  var signerLastNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * The in-person signer's full legal name.
    *
    * Required when `inPersonSigningType` is `inPersonSigner`.
    * For eNotary flow, use `name` instead.
    *
    * Maximum Length: 100 characters.
    *
    */
  var signerName: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `signerName` property is editable.
    */
  var signerNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable. You cannot use a signing group for an in-person signer.
    */
  var signingGroupId: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var signingGroupIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var signingGroupName: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var signingGroupUsers: js.UndefOr[js.Array[UserInfo]] = js.native
  
  /**
    * When `idCheckConfigurationName` is set to `SMS Auth $`, you use this complex type to provide the recipient authentication method details.
    * It contains the element `senderProvidedNumbers`, which is an array of phone numbers that the recipient can use for SMS text authentication.
    *
    *
    */
  var smsAuthentication: js.UndefOr[RecipientSMSAuthentication] = js.native
  
  /**
    * Deprecated.
    */
  var socialAuthentications: js.UndefOr[js.Array[SocialAuthentication]] = js.native
  
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
  var status: js.UndefOr[String] = js.native
  
  /**
    * The code associated with the recipient's status. Read only.
    */
  var statusCode: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, email notifications are suppressed for the recipient, and they must access envelopes and documents from their DocuSign inbox.
    */
  var suppressEmails: js.UndefOr[String] = js.native
  
  /**
    * A list of tabs, which are represented graphically as symbols on documents at the time of signing. Tabs show recipients where to sign, initial, or enter data.
    * They may also display data to the recipients.
    */
  var tabs: js.UndefOr[EnvelopeRecipientTabs] = js.native
  
  /**
    * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients.
    */
  var templateLocked: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
    */
  var templateRequired: js.UndefOr[String] = js.native
  
  /**
    * The total number of tabs in the documents. Read only.
    */
  var totalTabCount: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user to access. Generally this is the ID of the current authenticated user, but if the authenticated user is an Administrator on the account,
    * `userId` can represent another user whom the Administrator is accessing.
    *
    */
  var userId: js.UndefOr[String] = js.native
}
object InPersonSigner {
  
  @scala.inline
  def apply(): InPersonSigner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InPersonSigner]
  }
  
  @scala.inline
  implicit class InPersonSignerOps[Self <: InPersonSigner] (val x: Self) extends AnyVal {
    
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
    def setAccessCode(value: String): Self = this.set("accessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessCode: Self = this.set("accessCode", js.undefined)
    
    @scala.inline
    def setAccessCodeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("accessCodeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessCodeMetadata: Self = this.set("accessCodeMetadata", js.undefined)
    
    @scala.inline
    def setAddAccessCodeToEmail(value: String): Self = this.set("addAccessCodeToEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddAccessCodeToEmail: Self = this.set("addAccessCodeToEmail", js.undefined)
    
    @scala.inline
    def setAllowSystemOverrideForLockedRecipient(value: String): Self = this.set("allowSystemOverrideForLockedRecipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSystemOverrideForLockedRecipient: Self = this.set("allowSystemOverrideForLockedRecipient", js.undefined)
    
    @scala.inline
    def setAutoNavigation(value: String): Self = this.set("autoNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNavigation: Self = this.set("autoNavigation", js.undefined)
    
    @scala.inline
    def setCanSignOffline(value: String): Self = this.set("canSignOffline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCanSignOffline: Self = this.set("canSignOffline", js.undefined)
    
    @scala.inline
    def setClientUserId(value: String): Self = this.set("clientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientUserId: Self = this.set("clientUserId", js.undefined)
    
    @scala.inline
    def setCompletedCount(value: String): Self = this.set("completedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedCount: Self = this.set("completedCount", js.undefined)
    
    @scala.inline
    def setCreationReason(value: String): Self = this.set("creationReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationReason: Self = this.set("creationReason", js.undefined)
    
    @scala.inline
    def setCustomFieldsVarargs(value: String*): Self = this.set("customFields", js.Array(value :_*))
    
    @scala.inline
    def setCustomFields(value: js.Array[String]): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setDeclinedDateTime(value: String): Self = this.set("declinedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclinedDateTime: Self = this.set("declinedDateTime", js.undefined)
    
    @scala.inline
    def setDeclinedReason(value: String): Self = this.set("declinedReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclinedReason: Self = this.set("declinedReason", js.undefined)
    
    @scala.inline
    def setDefaultRecipient(value: String): Self = this.set("defaultRecipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRecipient: Self = this.set("defaultRecipient", js.undefined)
    
    @scala.inline
    def setDeliveredDateTime(value: String): Self = this.set("deliveredDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveredDateTime: Self = this.set("deliveredDateTime", js.undefined)
    
    @scala.inline
    def setDeliveryMethod(value: String): Self = this.set("deliveryMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryMethod: Self = this.set("deliveryMethod", js.undefined)
    
    @scala.inline
    def setDeliveryMethodMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("deliveryMethodMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryMethodMetadata: Self = this.set("deliveryMethodMetadata", js.undefined)
    
    @scala.inline
    def setDesignatorId(value: String): Self = this.set("designatorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesignatorId: Self = this.set("designatorId", js.undefined)
    
    @scala.inline
    def setDesignatorIdGuid(value: String): Self = this.set("designatorIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesignatorIdGuid: Self = this.set("designatorIdGuid", js.undefined)
    
    @scala.inline
    def setDocumentVisibilityVarargs(
      value: (/* This object configures a recipient's read/write access to a document. */ DocumentVisibility)*
    ): Self = this.set("documentVisibility", js.Array(value :_*))
    
    @scala.inline
    def setDocumentVisibility(
      value: js.Array[
          /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
        ]
    ): Self = this.set("documentVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVisibility: Self = this.set("documentVisibility", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmailMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("emailMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailMetadata: Self = this.set("emailMetadata", js.undefined)
    
    @scala.inline
    def setEmailNotification(value: RecipientEmailNotification): Self = this.set("emailNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailNotification: Self = this.set("emailNotification", js.undefined)
    
    @scala.inline
    def setEmbeddedRecipientStartURL(value: String): Self = this.set("embeddedRecipientStartURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddedRecipientStartURL: Self = this.set("embeddedRecipientStartURL", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setExcludedDocumentsVarargs(value: String*): Self = this.set("excludedDocuments", js.Array(value :_*))
    
    @scala.inline
    def setExcludedDocuments(value: js.Array[String]): Self = this.set("excludedDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedDocuments: Self = this.set("excludedDocuments", js.undefined)
    
    @scala.inline
    def setFaxNumber(value: String): Self = this.set("faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxNumber: Self = this.set("faxNumber", js.undefined)
    
    @scala.inline
    def setFaxNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("faxNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxNumberMetadata: Self = this.set("faxNumberMetadata", js.undefined)
    
    @scala.inline
    def setHostEmail(value: String): Self = this.set("hostEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostEmail: Self = this.set("hostEmail", js.undefined)
    
    @scala.inline
    def setHostEmailMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("hostEmailMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostEmailMetadata: Self = this.set("hostEmailMetadata", js.undefined)
    
    @scala.inline
    def setHostName(value: String): Self = this.set("hostName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostName: Self = this.set("hostName", js.undefined)
    
    @scala.inline
    def setHostNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("hostNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostNameMetadata: Self = this.set("hostNameMetadata", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationName(value: String): Self = this.set("idCheckConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckConfigurationName: Self = this.set("idCheckConfigurationName", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("idCheckConfigurationNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckConfigurationNameMetadata: Self = this.set("idCheckConfigurationNameMetadata", js.undefined)
    
    @scala.inline
    def setIdCheckInformationInput(
      value: /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
    ): Self = this.set("idCheckInformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckInformationInput: Self = this.set("idCheckInformationInput", js.undefined)
    
    @scala.inline
    def setInPersonSigningType(value: String): Self = this.set("inPersonSigningType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPersonSigningType: Self = this.set("inPersonSigningType", js.undefined)
    
    @scala.inline
    def setInPersonSigningTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("inPersonSigningTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInPersonSigningTypeMetadata: Self = this.set("inPersonSigningTypeMetadata", js.undefined)
    
    @scala.inline
    def setInheritEmailNotificationConfiguration(value: String): Self = this.set("inheritEmailNotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInheritEmailNotificationConfiguration: Self = this.set("inheritEmailNotificationConfiguration", js.undefined)
    
    @scala.inline
    def setLockedRecipientPhoneAuthEditable(value: String): Self = this.set("lockedRecipientPhoneAuthEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedRecipientPhoneAuthEditable: Self = this.set("lockedRecipientPhoneAuthEditable", js.undefined)
    
    @scala.inline
    def setLockedRecipientSmsEditable(value: String): Self = this.set("lockedRecipientSmsEditable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockedRecipientSmsEditable: Self = this.set("lockedRecipientSmsEditable", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("nameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameMetadata: Self = this.set("nameMetadata", js.undefined)
    
    @scala.inline
    def setNotaryHost(value: NotaryHost): Self = this.set("notaryHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotaryHost: Self = this.set("notaryHost", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setNoteMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("noteMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoteMetadata: Self = this.set("noteMetadata", js.undefined)
    
    @scala.inline
    def setPhoneAuthentication(value: RecipientPhoneAuthentication): Self = this.set("phoneAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneAuthentication: Self = this.set("phoneAuthentication", js.undefined)
    
    @scala.inline
    def setRecipientAttachmentsVarargs(value: RecipientAttachment*): Self = this.set("recipientAttachments", js.Array(value :_*))
    
    @scala.inline
    def setRecipientAttachments(value: js.Array[RecipientAttachment]): Self = this.set("recipientAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientAttachments: Self = this.set("recipientAttachments", js.undefined)
    
    @scala.inline
    def setRecipientAuthenticationStatus(
      value: /* A complex element that contains information about a user's authentication status. */ AuthenticationStatus
    ): Self = this.set("recipientAuthenticationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientAuthenticationStatus: Self = this.set("recipientAuthenticationStatus", js.undefined)
    
    @scala.inline
    def setRecipientFeatureMetadataVarargs(value: FeatureAvailableMetadata*): Self = this.set("recipientFeatureMetadata", js.Array(value :_*))
    
    @scala.inline
    def setRecipientFeatureMetadata(value: js.Array[FeatureAvailableMetadata]): Self = this.set("recipientFeatureMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientFeatureMetadata: Self = this.set("recipientFeatureMetadata", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = this.set("recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientId: Self = this.set("recipientId", js.undefined)
    
    @scala.inline
    def setRecipientIdGuid(value: String): Self = this.set("recipientIdGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientIdGuid: Self = this.set("recipientIdGuid", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProvidersVarargs(value: RecipientSignatureProvider*): Self = this.set("recipientSignatureProviders", js.Array(value :_*))
    
    @scala.inline
    def setRecipientSignatureProviders(value: js.Array[RecipientSignatureProvider]): Self = this.set("recipientSignatureProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientSignatureProviders: Self = this.set("recipientSignatureProviders", js.undefined)
    
    @scala.inline
    def setRecipientSuppliesTabs(value: String): Self = this.set("recipientSuppliesTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientSuppliesTabs: Self = this.set("recipientSuppliesTabs", js.undefined)
    
    @scala.inline
    def setRecipientType(value: String): Self = this.set("recipientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientType: Self = this.set("recipientType", js.undefined)
    
    @scala.inline
    def setRecipientTypeMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("recipientTypeMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientTypeMetadata: Self = this.set("recipientTypeMetadata", js.undefined)
    
    @scala.inline
    def setRequireIdLookup(value: String): Self = this.set("requireIdLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireIdLookup: Self = this.set("requireIdLookup", js.undefined)
    
    @scala.inline
    def setRequireIdLookupMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("requireIdLookupMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireIdLookupMetadata: Self = this.set("requireIdLookupMetadata", js.undefined)
    
    @scala.inline
    def setRequireSignOnPaper(value: String): Self = this.set("requireSignOnPaper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSignOnPaper: Self = this.set("requireSignOnPaper", js.undefined)
    
    @scala.inline
    def setRequireSignerCertificate(value: String): Self = this.set("requireSignerCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireSignerCertificate: Self = this.set("requireSignerCertificate", js.undefined)
    
    @scala.inline
    def setRequireUploadSignature(value: String): Self = this.set("requireUploadSignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequireUploadSignature: Self = this.set("requireUploadSignature", js.undefined)
    
    @scala.inline
    def setRoleName(value: String): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setRoutingOrder(value: String): Self = this.set("routingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingOrder: Self = this.set("routingOrder", js.undefined)
    
    @scala.inline
    def setRoutingOrderMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("routingOrderMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingOrderMetadata: Self = this.set("routingOrderMetadata", js.undefined)
    
    @scala.inline
    def setSentDateTime(value: String): Self = this.set("sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentDateTime: Self = this.set("sentDateTime", js.undefined)
    
    @scala.inline
    def setSignInEachLocation(value: String): Self = this.set("signInEachLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignInEachLocation: Self = this.set("signInEachLocation", js.undefined)
    
    @scala.inline
    def setSignInEachLocationMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("signInEachLocationMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignInEachLocationMetadata: Self = this.set("signInEachLocationMetadata", js.undefined)
    
    @scala.inline
    def setSignatureInfo(value: RecipientSignatureInformation): Self = this.set("signatureInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureInfo: Self = this.set("signatureInfo", js.undefined)
    
    @scala.inline
    def setSignedDateTime(value: String): Self = this.set("signedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedDateTime: Self = this.set("signedDateTime", js.undefined)
    
    @scala.inline
    def setSignerEmail(value: String): Self = this.set("signerEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerEmail: Self = this.set("signerEmail", js.undefined)
    
    @scala.inline
    def setSignerEmailMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("signerEmailMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerEmailMetadata: Self = this.set("signerEmailMetadata", js.undefined)
    
    @scala.inline
    def setSignerFirstName(value: String): Self = this.set("signerFirstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerFirstName: Self = this.set("signerFirstName", js.undefined)
    
    @scala.inline
    def setSignerFirstNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("signerFirstNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerFirstNameMetadata: Self = this.set("signerFirstNameMetadata", js.undefined)
    
    @scala.inline
    def setSignerLastName(value: String): Self = this.set("signerLastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerLastName: Self = this.set("signerLastName", js.undefined)
    
    @scala.inline
    def setSignerLastNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("signerLastNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerLastNameMetadata: Self = this.set("signerLastNameMetadata", js.undefined)
    
    @scala.inline
    def setSignerName(value: String): Self = this.set("signerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerName: Self = this.set("signerName", js.undefined)
    
    @scala.inline
    def setSignerNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("signerNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerNameMetadata: Self = this.set("signerNameMetadata", js.undefined)
    
    @scala.inline
    def setSigningGroupId(value: String): Self = this.set("signingGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroupId: Self = this.set("signingGroupId", js.undefined)
    
    @scala.inline
    def setSigningGroupIdMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("signingGroupIdMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroupIdMetadata: Self = this.set("signingGroupIdMetadata", js.undefined)
    
    @scala.inline
    def setSigningGroupName(value: String): Self = this.set("signingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroupName: Self = this.set("signingGroupName", js.undefined)
    
    @scala.inline
    def setSigningGroupUsersVarargs(value: UserInfo*): Self = this.set("signingGroupUsers", js.Array(value :_*))
    
    @scala.inline
    def setSigningGroupUsers(value: js.Array[UserInfo]): Self = this.set("signingGroupUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningGroupUsers: Self = this.set("signingGroupUsers", js.undefined)
    
    @scala.inline
    def setSmsAuthentication(value: RecipientSMSAuthentication): Self = this.set("smsAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmsAuthentication: Self = this.set("smsAuthentication", js.undefined)
    
    @scala.inline
    def setSocialAuthenticationsVarargs(value: SocialAuthentication*): Self = this.set("socialAuthentications", js.Array(value :_*))
    
    @scala.inline
    def setSocialAuthentications(value: js.Array[SocialAuthentication]): Self = this.set("socialAuthentications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocialAuthentications: Self = this.set("socialAuthentications", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setStatusCode(value: String): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    
    @scala.inline
    def setSuppressEmails(value: String): Self = this.set("suppressEmails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuppressEmails: Self = this.set("suppressEmails", js.undefined)
    
    @scala.inline
    def setTabs(value: EnvelopeRecipientTabs): Self = this.set("tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabs: Self = this.set("tabs", js.undefined)
    
    @scala.inline
    def setTemplateLocked(value: String): Self = this.set("templateLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateLocked: Self = this.set("templateLocked", js.undefined)
    
    @scala.inline
    def setTemplateRequired(value: String): Self = this.set("templateRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateRequired: Self = this.set("templateRequired", js.undefined)
    
    @scala.inline
    def setTotalTabCount(value: String): Self = this.set("totalTabCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalTabCount: Self = this.set("totalTabCount", js.undefined)
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserId: Self = this.set("userId", js.undefined)
  }
}
