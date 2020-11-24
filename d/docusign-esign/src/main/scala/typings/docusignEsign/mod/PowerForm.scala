package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerForm extends js.Object {
  
  /**
    * The id of the user who created the PowerForm.
    */
  var createdBy: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  /**
    * The body of the email message sent to the recipients.
    *
    * Maximum length: 10000 characters.
    */
  var emailBody: js.UndefOr[String] = js.native
  
  /**
    * The subject line of the email message that is sent to all recipients.
    *
    * For information about adding merge field information to the email subject, see
    * [Template Email Subject Merge Fields](https://developers.docusign.com/esign-rest-api/reference/Templates/Templates/create#template-email-subject-merge-fields).
    *
    */
  var emailSubject: js.UndefOr[String] = js.native
  
  /**
    * An array containing PowerForm data.
    */
  var envelopes: js.UndefOr[js.Array[Envelope]] = js.native
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.native
  
  /**
    * The instructions that display on the landing page for the first recipient. These instructions are important if the recipient accesses the PowerForm
    * by a method other than email. If instructions are entered, they display as an introduction after the recipient accesses the PowerForm.  Limit: 2000 characters.
    */
  var instructions: js.UndefOr[String] = js.native
  
  /**
    * When **true**, indicates that the PowerForm is active and can be sent to recipients. This is the default value.
    *
    * When **false**, the PowerForm cannot be emailed or accessed by a recipient, even if they arrive at the PowerForm URL.
    *
    * If a recipient attempts to sign an inactive PowerForm, an error message informs the recipient that the document is not active and suggests that they contact the sender.
    *
    */
  var isActive: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the PowerForm was last used.
    */
  var lastUsed: js.UndefOr[String] = js.native
  
  /**
    * The length of time before the same recipient can sign the same PowerForm. This property is used in combination with the `limitUseIntervalUnits` property.
    */
  var limitUseInterval: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the `limitUseInterval` is enabled.
    */
  var limitUseIntervalEnabled: js.UndefOr[String] = js.native
  
  /**
    * The units associated with the `limitUseInterval`. Valid values are:
    *
    * - `minutes`
    * - `hours
    * - `days`
    * - `weeks`
    * - `months`
    *
    * For example, to limit a recipient to signing once per year, set the `limitUseInterval` to 365 and the `limitUseIntervalUnits` to `days`.
    *
    */
  var limitUseIntervalUnits: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, you can set a maximum number of uses for the PowerForm.
    */
  var maxUseEnabled: js.UndefOr[String] = js.native
  
  /**
    * The name of the PowerForm.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The id of the PowerForm.
    */
  var powerFormId: js.UndefOr[String] = js.native
  
  /**
    * The URL for the PowerForm.
    */
  var powerFormUrl: js.UndefOr[String] = js.native
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[
    js.Array[
      /* **Note**: For a self-service PowerForm on a website, you can specify the intended recipients generically (for example, use `Member` as the `Name`),
    and omit personal details such as `email`. */ PowerFormRecipient
    ]
  ] = js.native
  
  /**
    * The sender's name.
    */
  var senderName: js.UndefOr[String] = js.native
  
  /**
    * The id of the sender.
    */
  var senderUserId: js.UndefOr[String] = js.native
  
  /**
    * The signing mode to use. Valid values are:
    *
    * - `email`: Verifies the recipient's identity using email authentication before the recipient can sign a document. The recipient enters their email address and then clicks
    * **Begin Signing** to begin the signing process. The system then sends an email message with a validation code for the PowerForm to the recipient.
    * If the recipient does not provide a valid email address, they cannot open and sign the document.
    * - `direct`: Does not require any verification. After a recipient enters their email address and clicks **Begin Signing**, a new browser tab opens
    * and the recipient can immediately begin the signing process. Because the recipient's identity is not verified by using email authentication,
    * we strongly recommend that you only use the `direct` signing mode when the PowerForm is accessible behind a secure portal where the recipient's
    * identity is already authenticated, or where another form of authentication is specified for the recipient in the DocuSign template (for example,
    * an access code, phone authentication, or ID check).
    *
    * **Note**: In the account settings, `enablePowerFormDirect` must be **true** to use `direct` as the `signingMode`.
    */
  var signingMode: js.UndefOr[String] = js.native
  
  /**
    * The id of the template used to create the PowerForm.
    */
  var templateId: js.UndefOr[String] = js.native
  
  /**
    * The name of the template used to create the PowerForm.
    */
  var templateName: js.UndefOr[String] = js.native
  
  /**
    * The number of times the PowerForm has been used.
    */
  var timesUsed: js.UndefOr[String] = js.native
  
  /**
    * The URI for the PowerForm.
    */
  var uri: js.UndefOr[String] = js.native
  
  /**
    * The number of times the PowerForm can still be used.
    */
  var usesRemaining: js.UndefOr[String] = js.native
}
object PowerForm {
  
  @scala.inline
  def apply(): PowerForm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerForm]
  }
  
  @scala.inline
  implicit class PowerFormOps[Self <: PowerForm] (val x: Self) extends AnyVal {
    
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
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setEmailBody(value: String): Self = this.set("emailBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailBody: Self = this.set("emailBody", js.undefined)
    
    @scala.inline
    def setEmailSubject(value: String): Self = this.set("emailSubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailSubject: Self = this.set("emailSubject", js.undefined)
    
    @scala.inline
    def setEnvelopesVarargs(value: Envelope*): Self = this.set("envelopes", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopes(value: js.Array[Envelope]): Self = this.set("envelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopes: Self = this.set("envelopes", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = this.set("errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDetails: Self = this.set("errorDetails", js.undefined)
    
    @scala.inline
    def setInstructions(value: String): Self = this.set("instructions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstructions: Self = this.set("instructions", js.undefined)
    
    @scala.inline
    def setIsActive(value: String): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setLastUsed(value: String): Self = this.set("lastUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUsed: Self = this.set("lastUsed", js.undefined)
    
    @scala.inline
    def setLimitUseInterval(value: String): Self = this.set("limitUseInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitUseInterval: Self = this.set("limitUseInterval", js.undefined)
    
    @scala.inline
    def setLimitUseIntervalEnabled(value: String): Self = this.set("limitUseIntervalEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitUseIntervalEnabled: Self = this.set("limitUseIntervalEnabled", js.undefined)
    
    @scala.inline
    def setLimitUseIntervalUnits(value: String): Self = this.set("limitUseIntervalUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimitUseIntervalUnits: Self = this.set("limitUseIntervalUnits", js.undefined)
    
    @scala.inline
    def setMaxUseEnabled(value: String): Self = this.set("maxUseEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxUseEnabled: Self = this.set("maxUseEnabled", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPowerFormId(value: String): Self = this.set("powerFormId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerFormId: Self = this.set("powerFormId", js.undefined)
    
    @scala.inline
    def setPowerFormUrl(value: String): Self = this.set("powerFormUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePowerFormUrl: Self = this.set("powerFormUrl", js.undefined)
    
    @scala.inline
    def setRecipientsVarargs(
      value: (/* **Note**: For a self-service PowerForm on a website, you can specify the intended recipients generically (for example, use `Member` as the `Name`),
      and omit personal details such as `email`. */ PowerFormRecipient)*
    ): Self = this.set("recipients", js.Array(value :_*))
    
    @scala.inline
    def setRecipients(
      value: js.Array[
          /* **Note**: For a self-service PowerForm on a website, you can specify the intended recipients generically (for example, use `Member` as the `Name`),
      and omit personal details such as `email`. */ PowerFormRecipient
        ]
    ): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setSenderName(value: String): Self = this.set("senderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderName: Self = this.set("senderName", js.undefined)
    
    @scala.inline
    def setSenderUserId(value: String): Self = this.set("senderUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderUserId: Self = this.set("senderUserId", js.undefined)
    
    @scala.inline
    def setSigningMode(value: String): Self = this.set("signingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSigningMode: Self = this.set("signingMode", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    
    @scala.inline
    def setTemplateName(value: String): Self = this.set("templateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("templateName", js.undefined)
    
    @scala.inline
    def setTimesUsed(value: String): Self = this.set("timesUsed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimesUsed: Self = this.set("timesUsed", js.undefined)
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
    
    @scala.inline
    def setUsesRemaining(value: String): Self = this.set("usesRemaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsesRemaining: Self = this.set("usesRemaining", js.undefined)
  }
}
