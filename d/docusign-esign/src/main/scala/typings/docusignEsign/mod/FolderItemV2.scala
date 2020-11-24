package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderItemV2 extends js.Object {
  
  /**
    * If the item is an envelope, this is the UTC DateTime when the envelope was completed.
    */
  var completedDateTime: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.native
  
  /**
    * If the item is an envelope, this is the id of the envelope.
    */
  var envelopeId: js.UndefOr[String] = js.native
  
  /**
    * If the item is an envelope, this is the URI for retrieving it.
    */
  var envelopeUri: js.UndefOr[String] = js.native
  
  /**
    * The date and time the envelope is set to expire.
    */
  var expireDateTime: js.UndefOr[String] = js.native
  
  /**
    * The id of the folder.
    */
  var folderId: js.UndefOr[String] = js.native
  
  /**
    * If the item is a subfolder, this is the URI for retrieving it.
    */
  var folderUri: js.UndefOr[String] = js.native
  
  /**
    * When **true**, indicates compliance with United States Food and Drug Administration (FDA) regulations on electronic records and electronic signatures (ERES).
    */
  var is21CFRPart11: js.UndefOr[String] = js.native
  
  /**
    * The name of the user who owns the folder.
    */
  var ownerName: js.UndefOr[String] = js.native
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[/* Envelope recipients */ EnvelopeRecipients] = js.native
  
  /**
    * Contains a URI for an endpoint that you can use to retrieve the recipients.
    */
  var recipientsUri: js.UndefOr[String] = js.native
  
  /**
    * The name of the sender's company.
    */
  var senderCompany: js.UndefOr[String] = js.native
  
  /**
    * The sender's email address.
    */
  var senderEmail: js.UndefOr[String] = js.native
  
  /**
    * The sender's name.
    */
  var senderName: js.UndefOr[String] = js.native
  
  /**
    * The sender's id.
    */
  var senderUserId: js.UndefOr[String] = js.native
  
  /**
    * The UTC DateTime when the envelope was sent. Read only.
    */
  var sentDateTime: js.UndefOr[String] = js.native
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.native
  
  /**
    * The subject of the envelope.
    */
  var subject: js.UndefOr[String] = js.native
  
  /**
    * The id of the template.
    */
  var templateId: js.UndefOr[String] = js.native
  
  /**
    * The URI for retrieving the template.
    */
  var templateUri: js.UndefOr[String] = js.native
}
object FolderItemV2 {
  
  @scala.inline
  def apply(): FolderItemV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderItemV2]
  }
  
  @scala.inline
  implicit class FolderItemV2Ops[Self <: FolderItemV2] (val x: Self) extends AnyVal {
    
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
    def setCompletedDateTime(value: String): Self = this.set("completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompletedDateTime: Self = this.set("completedDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = this.set("createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedDateTime: Self = this.set("createdDateTime", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = this.set("envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeId: Self = this.set("envelopeId", js.undefined)
    
    @scala.inline
    def setEnvelopeUri(value: String): Self = this.set("envelopeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeUri: Self = this.set("envelopeUri", js.undefined)
    
    @scala.inline
    def setExpireDateTime(value: String): Self = this.set("expireDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpireDateTime: Self = this.set("expireDateTime", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = this.set("folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderId: Self = this.set("folderId", js.undefined)
    
    @scala.inline
    def setFolderUri(value: String): Self = this.set("folderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolderUri: Self = this.set("folderUri", js.undefined)
    
    @scala.inline
    def setIs21CFRPart11(value: String): Self = this.set("is21CFRPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIs21CFRPart11: Self = this.set("is21CFRPart11", js.undefined)
    
    @scala.inline
    def setOwnerName(value: String): Self = this.set("ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerName: Self = this.set("ownerName", js.undefined)
    
    @scala.inline
    def setRecipients(value: /* Envelope recipients */ EnvelopeRecipients): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setRecipientsUri(value: String): Self = this.set("recipientsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientsUri: Self = this.set("recipientsUri", js.undefined)
    
    @scala.inline
    def setSenderCompany(value: String): Self = this.set("senderCompany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderCompany: Self = this.set("senderCompany", js.undefined)
    
    @scala.inline
    def setSenderEmail(value: String): Self = this.set("senderEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderEmail: Self = this.set("senderEmail", js.undefined)
    
    @scala.inline
    def setSenderName(value: String): Self = this.set("senderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderName: Self = this.set("senderName", js.undefined)
    
    @scala.inline
    def setSenderUserId(value: String): Self = this.set("senderUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSenderUserId: Self = this.set("senderUserId", js.undefined)
    
    @scala.inline
    def setSentDateTime(value: String): Self = this.set("sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSentDateTime: Self = this.set("sentDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = this.set("templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateId: Self = this.set("templateId", js.undefined)
    
    @scala.inline
    def setTemplateUri(value: String): Self = this.set("templateUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateUri: Self = this.set("templateUri", js.undefined)
  }
}
