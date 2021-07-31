package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CarbonCopy extends StObject {
  
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
  
  /**
    * Optional element. When set to **true**, the agents recipient associated with this recipient can change the recipient's pre-populated email address.
    * This element is only active if enabled for the account.
    */
  var agentCanEditEmail: js.UndefOr[String] = js.undefined
  
  /**
    * Optional element. When set to **true**, the agents recipient associated with this recipient can change the recipient's pre-populated name.
    * This element is only active if enabled for the account.
    */
  var agentCanEditName: js.UndefOr[String] = js.undefined
  
  var allowSystemOverrideForLockedRecipient: js.UndefOr[String] = js.undefined
  
  /**
    * Not applicable for Carbon Copy recipients.
    */
  var clientUserId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the number of times that the recipient has been through a signing completion for the envelope. If this number is greater than 0 for a signing group,
    * only the user who previously completed may sign again. Read only.
    */
  var completedCount: js.UndefOr[String] = js.undefined
  
  /**
    * An optional array of strings that enables the sender to provide custom data about the recipient.
    * This information is returned in the envelope status but otherwise not used by DocuSign. Each `customField` string can be a maximum of 100 characters.
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
    * The recipient's email address. Notification of the document to sign is sent to this email address.
    *
    * Maximum length: 100 characters.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `email` property is editable. Read only.
    */
  var emailMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * An optional complex type that sets a specific email subject and body for this recipient's notification email.
    *
    * **Note**: You can set the `emailNotification` property separately for each recipient. If you set the value only for certain recipients,
    * the other recipients will inherit the this value from the top-level `emailSubject` and `emailBlurb`.
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
    * `recipientId`, `recipientName`, `recipientEmail`, and `customFields`. The `customFields` property must be set for the recipient or envelope.
    * The merge fields are enclosed in double brackets.
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
    * Specifies the documents that are not visible to this recipient. Document Visibility must be enabled for the account and the `enforceSignerVisibility`
    * property must be set to **true** for the envelope to use this.
    *
    * When enforce signer visibility is enabled, documents with tabs can only be viewed by signers that have a tab on that document. Recipients that have an
    * administrative role (Agent, Editor, or Intermediaries) or informational role (Certified Deliveries or Carbon Copies) can always see all the documents in an envelope,
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
    * The recipient's first name. Maximum Length: 50 characters.
    */
  var firstName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `firstame` property is editable. Read only.
    */
  var firstNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var fullName: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var fullNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
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
    * Specifies the ID Verification workflow applied on an envelope by workflow ID. <br/>See
    * the [list](https://developers.docusign.com/esign-rest-api/reference/Accounts/IdentityVerifications/list) method in the
    * [IdentityVerifications](https://developers.docusign.com/esign-rest-api/reference/Accounts/IdentityVerifications) resource for more information on how to
    * retrieve workflow IDs available for an account. <br/>This can be used in addition to other
    * [recipient authentication](https://support.docusign.com/en/guides/ndse-user-guide-recipient-authentication) methods. <br/>Note that ID Verification and ID Check are
    * two distinct methods. ID Verification checks recipients' identity by verifying their ID while ID Check relies on data available on public records
    * (such as current and former address).
    */
  var identityVerification: js.UndefOr[RecipientIdentityVerification] = js.undefined
  
  /**
    * When set to **true** and the envelope recipient creates a DocuSign account after signing,
    * the Manage Account Email Notification settings are used as the default settings for the recipient's account.
    */
  var inheritEmailNotificationConfiguration: js.UndefOr[String] = js.undefined
  
  /**
    * The recipient's last name.
    */
  var lastName: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `lastName` property is editable. Read only.
    */
  var lastNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var lockedRecipientPhoneAuthEditable: js.UndefOr[String] = js.undefined
  
  /**
    * Reserved for DocuSign.
    */
  var lockedRecipientSmsEditable: js.UndefOr[String] = js.undefined
  
  /**
    * The full legal name of the recipient. Maximum Length: 100 characters.
    *
    * **Note**: You must always set a value for this property in requests, even if `firstName` and `lastName` are set.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `name` property is editable. Read only.
    */
  var nameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * A note sent to the recipient in the signing email.
    * This note is unique to this recipient.
    * In the user interface,
    * it appears near the upper left corner
    * of the document
    * on the signing screen.
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
    *
    *
    */
  var phoneAuthentication: js.UndefOr[RecipientPhoneAuthentication] = js.undefined
  
  var proofFile: js.UndefOr[RecipientProofFile] = js.undefined
  
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
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.undefined
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.undefined
  
  /**
    * The recipient type, as specified by the following values:
    * - `agent`: Agent recipients can add name and email information for recipients that appear after the agent in routing order.
    * - `carbonCopy`: Carbon copy recipients get a copy of the envelope but don't need to sign, initial, date, or add information to any of the documents.
    * This type of recipient can be used in any routing order.
    * - `certifiedDelivery`: Certified delivery recipients must receive the completed documents for the envelope to be completed. They don't need to sign, initial,
    * date, or add information to any of the documents.
    * - `editor`: Editors have the same management and access rights for the envelope as the sender. Editors can add name and email information, add or change the routing order,
    * set authentication options, and can edit signature/initial tabs and data fields for the remaining recipients.
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
    * Reserved for DocuSign.
    */
  var signedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The ID of the [signing group](https://support.docusign.com/en/guides/ndse-user-guide-signing-groups).
    *
    * **Note**: When you send an envelope to a signing group, anyone in the group can open it and sign it with their own signature.
    * For this reason, we recommend that you do not include non-signer recipients (such as carbon copy recipients) in the same signing group as signer recipients.
    * However, you could create a second signing group for the non-signer recipients and change the default action of Needs to Sign to a different value, such as Receives a Copy.
    */
  var signingGroupId: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata that indicates whether the `signingGroupId` property is editable. Read only.
    */
  var signingGroupIdMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.undefined
  
  /**
    * Optional. The name of the signing group.
    *
    * Maximum Length: 100 characters.
    */
  var signingGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * A complex type that contains information about users in the signing group.
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
    * - `autoresponded`: The recipient's email system auto-responded to the email from DocuSign. This status is used in the web console to inform senders about
    * the bounced-back email. This recipient status is only used if **Send-on-behalf-of** is turned off for the account.
    * - `completed`: The recipient has completed their actions (signing or other required actions if not a signer) for an envelope.
    * - `created`: The recipient is in a draft state. This value is only associated with draft envelopes (envelopes that have a status of `created`).
    * - `declined`: The recipient declined to sign the document(s) in the envelope.
    * - `delivered`: The recipient has viewed the document(s) in an envelope through the DocuSign signing website. This is not an email delivery of the documents in an envelope.
    * - `faxPending`: The recipient has finished signing and the system is waiting for a fax attachment from the recipient before completing their signing step.
    * - `sent`: The recipient has been sent an email notification that it is their turn to sign an envelope.
    * - `signed`: The recipient has completed (signed) all required tags in an envelope. This is a temporary state during processing, after which the
    * recipient's status automatically switches to `completed`.
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
    * A list of `commentTabs` that contains the Carbon Copy recipient's comments.
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
object CarbonCopy {
  
  @scala.inline
  def apply(): CarbonCopy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarbonCopy]
  }
  
  @scala.inline
  implicit class CarbonCopyMutableBuilder[Self <: CarbonCopy] (val x: Self) extends AnyVal {
    
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
    def setAgentCanEditEmail(value: String): Self = StObject.set(x, "agentCanEditEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentCanEditEmailUndefined: Self = StObject.set(x, "agentCanEditEmail", js.undefined)
    
    @scala.inline
    def setAgentCanEditName(value: String): Self = StObject.set(x, "agentCanEditName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAgentCanEditNameUndefined: Self = StObject.set(x, "agentCanEditName", js.undefined)
    
    @scala.inline
    def setAllowSystemOverrideForLockedRecipient(value: String): Self = StObject.set(x, "allowSystemOverrideForLockedRecipient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSystemOverrideForLockedRecipientUndefined: Self = StObject.set(x, "allowSystemOverrideForLockedRecipient", js.undefined)
    
    @scala.inline
    def setClientUserId(value: String): Self = StObject.set(x, "clientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUserIdUndefined: Self = StObject.set(x, "clientUserId", js.undefined)
    
    @scala.inline
    def setCompletedCount(value: String): Self = StObject.set(x, "completedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedCountUndefined: Self = StObject.set(x, "completedCount", js.undefined)
    
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
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "firstNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameMetadataUndefined: Self = StObject.set(x, "firstNameMetadata", js.undefined)
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "fullNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullNameMetadataUndefined: Self = StObject.set(x, "fullNameMetadata", js.undefined)
    
    @scala.inline
    def setFullNameUndefined: Self = StObject.set(x, "fullName", js.undefined)
    
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
    def setIdentityVerification(value: RecipientIdentityVerification): Self = StObject.set(x, "identityVerification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityVerificationUndefined: Self = StObject.set(x, "identityVerification", js.undefined)
    
    @scala.inline
    def setInheritEmailNotificationConfiguration(value: String): Self = StObject.set(x, "inheritEmailNotificationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritEmailNotificationConfigurationUndefined: Self = StObject.set(x, "inheritEmailNotificationConfiguration", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = StObject.set(x, "lastNameMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameMetadataUndefined: Self = StObject.set(x, "lastNameMetadata", js.undefined)
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
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
    def setProofFile(value: RecipientProofFile): Self = StObject.set(x, "proofFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProofFileUndefined: Self = StObject.set(x, "proofFile", js.undefined)
    
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
    def setSignedDateTime(value: String): Self = StObject.set(x, "signedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedDateTimeUndefined: Self = StObject.set(x, "signedDateTime", js.undefined)
    
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
