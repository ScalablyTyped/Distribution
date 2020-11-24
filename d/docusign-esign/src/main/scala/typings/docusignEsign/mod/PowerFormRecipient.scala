package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PowerFormRecipient extends js.Object {
  
  /**
    * (Optional) The access code that the recipient must enter to access the PowerForm.
    *
    * Maximum Length: 50 characters. The code must also conform to the account's access code format setting.
    *
    * If blank but the signer accessCode property is set in the envelope, then that value is used.
    *
    * If blank and the signer accessCode property is not set, then the access code is not required.
    */
  var accessCode: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the `accessCode` property is locked and cannot be edited.
    */
  var accessCodeLocked: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the recipient must enter the `accessCode` to access the PowerForm.
    */
  var accessCodeRequired: js.UndefOr[String] = js.native
  
  /**
    * The email address of the recipient.
    *
    * **Note**: For self-service documents where you do not know who the recipients are in advance, you can leave this property blank.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the recipient's email address is locked and cannot be edited.
    */
  var emailLocked: js.UndefOr[String] = js.native
  
  /**
    * The name of the authentication check to use. This value must match one of the authentication types that the account uses.
    * The names of these authentication types appear in the web console sending export interface in the Identify list for a recipient.
    * This setting overrides any default authentication setting. Valid values are:
    *
    * - `Phone Auth $`: The recipient must authenticate by using two-factor authentication (2FA). You provide the phone number to use for 2FA in the `phoneAuthentication` object.
    * - `SMS Auth $`: The recipient must authenticate via SMS. You provide the phone number to use in the `smsAuthentication` object.
    * - `ID Check $`: The  recipient must answer detailed security questions.
    *
    * **Example**: Your account has ID Check and SMS Authentication available. In the web console Identify list, these appear as ID Check $ and SMS Auth $.
    * To use ID Check in an envelope, the idCheckConfigurationName should be ID Check $. For SMS, you would use SMS Auth $, and you would also need to
    * add a phone number to the smsAuthentication node.
    */
  var idCheckConfigurationName: js.UndefOr[String] = js.native
  
  /**
    * Indicates if authentication is configured for the account. Valid values are:
    *
    * - `always`: Authentication checks are performed on every envelope.
    * - `never`: Authentication checks are not performed on any envelopes.
    * - `optional:` Authentication is configurable per envelope.
    */
  var idCheckRequired: js.UndefOr[String] = js.native
  
  /**
    * The name of the PowerForm recipient.
    *
    * **Note**: For self-service documents where you do not know who the recipients are in advance, you can leave this property blank.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The recipient type, as specified by the following values:
    * - `agent`: Agent recipients can add name and email information for recipients that appear after the agent in routing order.
    * - `carbonCopy`: Carbon copy recipients get a copy of the envelope but don't need to sign, initial, date, or add information to any of the documents.
    * This type of recipient can be used in any routing order.
    * - `certifiedDelivery`: Certified delivery recipients must receive the completed documents for the envelope to be completed.
    * They don't need to sign, initial, date, or add information to any of the documents.
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
    * The role associated with the recipient (for example, `Member`).
    *
    * This property is required when you are working with template recipients and PowerForm recipients.
    */
  var roleName: js.UndefOr[String] = js.native
  
  /**
    * Specifies the routing order of the recipient in the envelope.
    */
  var routingOrder: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the template used to create the PowerForm requires ID lookup for the recipient.
    */
  var templateRequiresIdLookup: js.UndefOr[String] = js.native
  
  /**
    * When **true**, the `userName` property for the recipient is locked and cannot be edited.
    */
  var userNameLocked: js.UndefOr[String] = js.native
}
object PowerFormRecipient {
  
  @scala.inline
  def apply(): PowerFormRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PowerFormRecipient]
  }
  
  @scala.inline
  implicit class PowerFormRecipientOps[Self <: PowerFormRecipient] (val x: Self) extends AnyVal {
    
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
    def setAccessCodeLocked(value: String): Self = this.set("accessCodeLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessCodeLocked: Self = this.set("accessCodeLocked", js.undefined)
    
    @scala.inline
    def setAccessCodeRequired(value: String): Self = this.set("accessCodeRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessCodeRequired: Self = this.set("accessCodeRequired", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmailLocked(value: String): Self = this.set("emailLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmailLocked: Self = this.set("emailLocked", js.undefined)
    
    @scala.inline
    def setIdCheckConfigurationName(value: String): Self = this.set("idCheckConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckConfigurationName: Self = this.set("idCheckConfigurationName", js.undefined)
    
    @scala.inline
    def setIdCheckRequired(value: String): Self = this.set("idCheckRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdCheckRequired: Self = this.set("idCheckRequired", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRecipientType(value: String): Self = this.set("recipientType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientType: Self = this.set("recipientType", js.undefined)
    
    @scala.inline
    def setRoleName(value: String): Self = this.set("roleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleName: Self = this.set("roleName", js.undefined)
    
    @scala.inline
    def setRoutingOrder(value: String): Self = this.set("routingOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingOrder: Self = this.set("routingOrder", js.undefined)
    
    @scala.inline
    def setTemplateRequiresIdLookup(value: String): Self = this.set("templateRequiresIdLookup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateRequiresIdLookup: Self = this.set("templateRequiresIdLookup", js.undefined)
    
    @scala.inline
    def setUserNameLocked(value: String): Self = this.set("userNameLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserNameLocked: Self = this.set("userNameLocked", js.undefined)
  }
}
