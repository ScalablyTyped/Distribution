package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SealSign extends js.Object {
  
  /**
    * Not applicable.
    */
  var accessCode: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var accessCodeMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var addAccessCodeToEmail: js.UndefOr[String] = js.native
  
  var allowSystemOverrideForLockedRecipient: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var clientUserId: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var completedCount: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var customFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Not applicable.
    */
  var declinedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var declinedReason: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
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
    * Not applicable.
    */
  var documentVisibility: js.UndefOr[
    js.Array[
      /* This object configures a recipient's read/write access to a document. */ DocumentVisibility
    ]
  ] = js.native
  
  /**
    * Not applicable.
    */
  var emailNotification: js.UndefOr[RecipientEmailNotification] = js.native
  
  /**
    * Not applicable.
    */
  var embeddedRecipientStartURL: js.UndefOr[String] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumber: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumberMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var idCheckConfigurationName: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var idCheckConfigurationNameMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var idCheckInformationInput: js.UndefOr[
    /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
  ] = js.native
  
  /**
    * Not applicable.
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
    * Not applicable.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var note: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var noteMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var phoneAuthentication: js.UndefOr[RecipientPhoneAuthentication] = js.native
  
  /**
    * Not applicable.
    */
  var recipientAttachments: js.UndefOr[js.Array[RecipientAttachment]] = js.native
  
  /**
    * Not applicable.
    */
  var recipientAuthenticationStatus: js.UndefOr[
    /* A complex element that contains information about a user's authentication status. */ AuthenticationStatus
  ] = js.native
  
  /**
    * Metadata about the features that are supported for the recipient type. Read only.
    */
  var recipientFeatureMetadata: js.UndefOr[js.Array[FeatureAvailableMetadata]] = js.native
  
  /**
    * (Required) The `recipientId` used when the envelope or template was created.
    *
    * This is a local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
  
  /**
    * The globally-unique identifier (GUID) for a specific recipient on a specific envelope. If the same recipient is associated with multiple envelopes,
    * they will have a different GUID for each one. Read only.
    */
  var recipientIdGuid: js.UndefOr[String] = js.native
  
  /**
    * (Required) Indicates which electronic seal to apply on documents when creating an envelope.
    */
  var recipientSignatureProviders: js.UndefOr[js.Array[RecipientSignatureProvider]] = js.native
  
  /**
    * The recipient type, as specified by the following values:
    * - `agent`: Agent recipients can add name and email information for recipients that appear after the agent in routing order.
    * - `carbonCopy`: Carbon copy recipients get a copy of the envelope but don't need to sign, initial, date, or add information to any of the documents.
    * This type of recipient can be used in any routing order.
    * - `certifiedDelivery`: Certified delivery recipients must receive the completed documents for the envelope to be completed. They don't need to sign, initial,
    * date, or add information to any of the documents.
    * - `editor`: Editors have the same management and access rights for the envelope as the sender. Editors can add name and email information, add or change the
    * routing order, set authentication options, and can edit signature/initial tabs and data fields for the remaining recipients.
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
    * Not applicable.
    */
  var requireIdLookup: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var requireIdLookupMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Optional element. Specifies the role name associated with the recipient.<br/><br/>This property is required when you are working with template recipients.
    */
  var roleName: js.UndefOr[String] = js.native
  
  /**
    * (Optional, default: 1)
    * Specifies the routing order of the electronic seal in the envelope.
    * The routing order assigned to your electronic seal cannot be shared with another recipient.
    * It is recommended that you set a routing order for your electronic seals.
    *
    */
  var routingOrder: js.UndefOr[String] = js.native
  
  /**
    * Metadata that indicates whether the `routingOrder` property is editable. Read only.
    */
  var routingOrderMetadata: js.UndefOr[/* Metadata about a property. */ PropertyMetadata] = js.native
  
  /**
    * Not applicable.
    */
  var sentDateTime: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var signedDateTime: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
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
    * - `autoresponded`: The recipient's email system auto-responded to the email from DocuSign. This status is used in the web console to inform senders
    * about the bounced-back email. This recipient status is only used if **Send-on-behalf-of** is turned off for the account.
    * - `completed`: The recipient has completed their actions (signing or other required actions if not a signer) for an envelope.
    * - `created`: The recipient is in a draft state. This value is only associated with draft envelopes (envelopes that have a status of `created`).
    * - `declined`: The recipient declined to sign the document(s) in the envelope.
    * - `delivered`: The recipient has viewed the document(s) in an envelope through the DocuSign signing website. This is not an email delivery of the documents in an envelope.
    * - `faxPending`: The recipient has finished signing and the system is waiting for a fax attachment from the recipient before completing their signing step.
    * - `sent`: The recipient has been sent an email notification that it is their turn to sign an envelope.
    * - `signed`: The recipient has completed (signed) all required tags in an envelope. This is a temporary state during processing,
    * after which the recipient's status automatically switches to `completed`.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The code associated with the recipient's status. Read only.
    */
  var statusCode: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
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
    * Not applicable.
    */
  var totalTabCount: js.UndefOr[String] = js.native
  
  /**
    * Not applicable.
    */
  var userId: js.UndefOr[String] = js.native
}
object SealSign {
  
  @scala.inline
  def apply(): SealSign = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SealSign]
  }
  
  @scala.inline
  implicit class SealSignOps[Self <: SealSign] (val x: Self) extends AnyVal {
    
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
    def setClientUserId(value: String): Self = this.set("clientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientUserId: Self = this.set("clientUserId", js.undefined)
    
    @scala.inline
    def setCompletedCount(value: String): Self = this.set("completedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedCount: Self = this.set("completedCount", js.undefined)
    
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
    def setFaxNumber(value: String): Self = this.set("faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxNumber: Self = this.set("faxNumber", js.undefined)
    
    @scala.inline
    def setFaxNumberMetadata(value: /* Metadata about a property. */ PropertyMetadata): Self = this.set("faxNumberMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaxNumberMetadata: Self = this.set("faxNumberMetadata", js.undefined)
    
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
    def setSignedDateTime(value: String): Self = this.set("signedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedDateTime: Self = this.set("signedDateTime", js.undefined)
    
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
