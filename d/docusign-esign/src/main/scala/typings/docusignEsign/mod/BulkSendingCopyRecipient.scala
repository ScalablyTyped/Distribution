package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BulkSendingCopyRecipient extends StObject {
  
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
    * Specifies whether the recipient is embedded or remote.
    *
    * If the `clientUserId` property is not null then the recipient is embedded. Use this field to associate the signer with their userId in your app.
    * Authenticating the user is the responsibility of your app when you use embedded signing.
    *
    * Note: if the `clientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to  **true**,
    * an error is generated on sending.
    *
    * Maximum length: 100 characters.
    */
  var clientUserId: js.UndefOr[String] = js.native
  
  /**
    * An optional array of strings that enables the sender to provide custom data about the recipient. This information is returned in the envelope status
    * but otherwise not used by DocuSign. Each `customField` string can be a maximum of 100 characters.
    */
  var customFields: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var deliveryMethod: js.UndefOr[String] = js.native
  
  /**
    * The recipient's email address.
    */
  var email: js.UndefOr[String] = js.native
  
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
    * If set to `SIGN_AT_DOCUSIGN`, the recipient is directed to an embedded signing or viewing process directly at DocuSign. The signing or viewing action is initiated
    * by the DocuSign system and the transaction activity and Certificate of Completion records will reflect this. In all other ways the process is identical to an embedded
    * signing or viewing operation launched by a partner.
    *
    * It is important to understand that in a typical embedded workflow, the authentication of an embedded recipient is the responsibility of the sending application.
    * DocuSign expects that senders will follow their own processes for establishing the recipient's identity. In this workflow the recipient goes through the sending application
    * before the embedded signing or viewing process is initiated. However, when the sending application sets `EmbeddedRecipientStartURL=SIGN_AT_DOCUSIGN`,
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
  var embeddedRecipientStartURL: js.UndefOr[String] = js.native
  
  /**
    * Reserved for DocuSign.
    */
  var faxNumber: js.UndefOr[String] = js.native
  
  /**
    * The name of the authentication check to use. This value must match one of the authentication types that the account uses.
    * The names of these authentication types appear in the web console sending export interface in the Identify list for a recipient.
    * This setting overrides any default authentication setting. Valid values are:
    *
    * - `Phone Auth $`: The recipient must authenticate by using two-factor authentication (2FA). You provide the phone number to use for 2FA in the
    * `phoneAuthentication` object.
    * - `SMS Auth $`: The recipient must authenticate via SMS. You provide the phone number to use in the `smsAuthentication` object.
    * - `ID Check $`: The  recipient must answer detailed security questions.
    *
    * **Example**: Your account has ID Check and SMS Authentication available. In the web console Identify list,
    * these appear as ID Check $ and SMS Auth $. To use ID Check in an envelope, the idCheckConfigurationName should be ID Check $. For SMS,
    * you would use SMS Auth $, and you would also need to add a phone number to the smsAuthentication node.
    */
  var idCheckConfigurationName: js.UndefOr[String] = js.native
  
  /**
    * An object that contains input information related to a recipient ID check.
    */
  var idCheckInformationInput: js.UndefOr[
    /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
  ] = js.native
  
  var identificationMethod: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
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
  var note: js.UndefOr[String] = js.native
  
  /**
    * When `idCheckConfigurationName` is set to `Phone Auth $`, you use this complex type to provide the recipient authentication method details.
    * It contains the following elements:
    *
    * * `recipMayProvideNumber`: Boolean. When set to **true**, the recipient can use whatever phone number they choose.
    * * `senderProvidedNumbers`: ArrayOfStrings.  A list of phone numbers the recipient can use.
    * * `recordVoicePrint`: Reserved for DocuSign.
    * * `validateRecipProvidedNumber`: Reserved for DocuSign.
    *
    *
    */
  var phoneAuthentication: js.UndefOr[RecipientPhoneAuthentication] = js.native
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId`
    * must be unique, but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.native
  
  /**
    * The default signature provider is the DocuSign Electronic signature system. This parameter is used to specify one or more Standards Based Signature
    * (digital signature) providers for the signer to use. [More information.](https://developers.docusign.com/esign-rest-api/guides/standards-based-signatures)
    */
  var recipientSignatureProviders: js.UndefOr[js.Array[RecipientSignatureProvider]] = js.native
  
  /**
    * The name of the role associated with the recipient. This property is optional and is only used in place of a `recipientId`.
    */
  var roleName: js.UndefOr[String] = js.native
  
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
    * A list of tabs associated with the recipient. In a bulk send request, each of these recipient tabs must match a recipient tab
    * on the envelope or template that you want to send.
    * To match up, the `tabLabel` for this tab and the `tabLabel` for the corresponding tab on the envelope or template must be the same.
    *
    * For example, if the envelope has a placeholder text tab with the `tabLabel` `childName`, you must assign the same `tabLabel` `childName`
    * to the tab here that you are populating with that information.
    *
    *  You can use the following types of tabs to match bulk send recipients to an envelope:
    *
    * - Text tabs
    * - Radio group tabs (where the name of the `radioGroup` on the envelope is used as the `tabLabel` in the bulk send list)
    * - List tabs
    */
  var tabs: js.UndefOr[js.Array[BulkSendingCopyTab]] = js.native
}
object BulkSendingCopyRecipient {
  
  @scala.inline
  def apply(): BulkSendingCopyRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BulkSendingCopyRecipient]
  }
  
  @scala.inline
  implicit class BulkSendingCopyRecipientMutableBuilder[Self <: BulkSendingCopyRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessCode(value: String): Self = StObject.set(x, "accessCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessCodeUndefined: Self = StObject.set(x, "accessCode", js.undefined)
    
    @scala.inline
    def setClientUserId(value: String): Self = StObject.set(x, "clientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUserIdUndefined: Self = StObject.set(x, "clientUserId", js.undefined)
    
    @scala.inline
    def setCustomFields(value: js.Array[String]): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    @scala.inline
    def setCustomFieldsVarargs(value: String*): Self = StObject.set(x, "customFields", js.Array(value :_*))
    
    @scala.inline
    def setDeliveryMethod(value: String): Self = StObject.set(x, "deliveryMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryMethodUndefined: Self = StObject.set(x, "deliveryMethod", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
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
    def setFaxNumber(value: String): Self = StObject.set(x, "faxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxNumberUndefined: Self = StObject.set(x, "faxNumber", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationName(value: String): Self = StObject.set(x, "idCheckConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCheckConfigurationNameUndefined: Self = StObject.set(x, "idCheckConfigurationName", js.undefined)
    
    @scala.inline
    def setIdCheckInformationInput(
      value: /* A complex element that contains input information related to a recipient ID check. */ IdCheckInformationInput
    ): Self = StObject.set(x, "idCheckInformationInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdCheckInformationInputUndefined: Self = StObject.set(x, "idCheckInformationInput", js.undefined)
    
    @scala.inline
    def setIdentificationMethod(value: String): Self = StObject.set(x, "identificationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentificationMethodUndefined: Self = StObject.set(x, "identificationMethod", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setPhoneAuthentication(value: RecipientPhoneAuthentication): Self = StObject.set(x, "phoneAuthentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneAuthenticationUndefined: Self = StObject.set(x, "phoneAuthentication", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProviders(value: js.Array[RecipientSignatureProvider]): Self = StObject.set(x, "recipientSignatureProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientSignatureProvidersUndefined: Self = StObject.set(x, "recipientSignatureProviders", js.undefined)
    
    @scala.inline
    def setRecipientSignatureProvidersVarargs(value: RecipientSignatureProvider*): Self = StObject.set(x, "recipientSignatureProviders", js.Array(value :_*))
    
    @scala.inline
    def setRoleName(value: String): Self = StObject.set(x, "roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleNameUndefined: Self = StObject.set(x, "roleName", js.undefined)
    
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
    def setTabs(value: js.Array[BulkSendingCopyTab]): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    
    @scala.inline
    def setTabsVarargs(value: BulkSendingCopyTab*): Self = StObject.set(x, "tabs", js.Array(value :_*))
  }
}
