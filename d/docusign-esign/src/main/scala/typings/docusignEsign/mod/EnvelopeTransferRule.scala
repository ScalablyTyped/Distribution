package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeTransferRule extends js.Object {
  
  /**
    * When set to **true**, the original owner is added as a carbon copy recipient after envelope transfer. The default value is **false**.
    */
  var carbonCopyOriginalOwner: js.UndefOr[String] = js.native
  
  /**
    * When set to **true**, the envelope transfer rule is active.
    */
  var enabled: js.UndefOr[String] = js.native
  
  /**
    * The id of the envelope transfer rule. The system generates this id when the rule is first created.
    */
  var envelopeTransferRuleId: js.UndefOr[String] = js.native
  
  /**
    * The type of envelope event that triggers the transfer. Valid values are:
    *
    * - `sent`
    * - `before sent`
    * - `completed`
    */
  var eventType: js.UndefOr[String] = js.native
  
  /**
    * Information about the group that triggers the transfer.
    */
  var fromGroup: js.UndefOr[/* This object contains information about a group. */ Group] = js.native
  
  /**
    * Information about the user who triggers the transfer.
    */
  var fromUser: js.UndefOr[UserInformation] = js.native
  
  /**
    * The UTC DateTime when the envelope transfer rule was last modified. This property is read only.
    */
  var modifiedDate: js.UndefOr[String] = js.native
  
  /**
    * Information about the user who last modified the envelope transfer rule.
    */
  var modifiedUser: js.UndefOr[UserInformation] = js.native
  
  /**
    * Information about the destination folder to which the envelope is transferred.
    */
  var toFolder: js.UndefOr[/* This object contains details about a folder. */ Folder] = js.native
  
  /**
    * Information about the user to which the envelope is transferred.
    */
  var toUser: js.UndefOr[UserInformation] = js.native
}
object EnvelopeTransferRule {
  
  @scala.inline
  def apply(): EnvelopeTransferRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeTransferRule]
  }
  
  @scala.inline
  implicit class EnvelopeTransferRuleOps[Self <: EnvelopeTransferRule] (val x: Self) extends AnyVal {
    
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
    def setCarbonCopyOriginalOwner(value: String): Self = this.set("carbonCopyOriginalOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarbonCopyOriginalOwner: Self = this.set("carbonCopyOriginalOwner", js.undefined)
    
    @scala.inline
    def setEnabled(value: String): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setEnvelopeTransferRuleId(value: String): Self = this.set("envelopeTransferRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeTransferRuleId: Self = this.set("envelopeTransferRuleId", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setFromGroup(value: /* This object contains information about a group. */ Group): Self = this.set("fromGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromGroup: Self = this.set("fromGroup", js.undefined)
    
    @scala.inline
    def setFromUser(value: UserInformation): Self = this.set("fromUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromUser: Self = this.set("fromUser", js.undefined)
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedDate: Self = this.set("modifiedDate", js.undefined)
    
    @scala.inline
    def setModifiedUser(value: UserInformation): Self = this.set("modifiedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModifiedUser: Self = this.set("modifiedUser", js.undefined)
    
    @scala.inline
    def setToFolder(value: /* This object contains details about a folder. */ Folder): Self = this.set("toFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToFolder: Self = this.set("toFolder", js.undefined)
    
    @scala.inline
    def setToUser(value: UserInformation): Self = this.set("toUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToUser: Self = this.set("toUser", js.undefined)
  }
}
