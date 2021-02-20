package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FolderItemV2 extends StObject {
  
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
  implicit class FolderItemV2MutableBuilder[Self <: FolderItemV2] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletedDateTime(value: String): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    @scala.inline
    def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    @scala.inline
    def setEnvelopeUri(value: String): Self = StObject.set(x, "envelopeUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeUriUndefined: Self = StObject.set(x, "envelopeUri", js.undefined)
    
    @scala.inline
    def setExpireDateTime(value: String): Self = StObject.set(x, "expireDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpireDateTimeUndefined: Self = StObject.set(x, "expireDateTime", js.undefined)
    
    @scala.inline
    def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    @scala.inline
    def setFolderUri(value: String): Self = StObject.set(x, "folderUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderUriUndefined: Self = StObject.set(x, "folderUri", js.undefined)
    
    @scala.inline
    def setIs21CFRPart11(value: String): Self = StObject.set(x, "is21CFRPart11", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs21CFRPart11Undefined: Self = StObject.set(x, "is21CFRPart11", js.undefined)
    
    @scala.inline
    def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
    
    @scala.inline
    def setRecipients(value: /* Envelope recipients */ EnvelopeRecipients): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    @scala.inline
    def setRecipientsUri(value: String): Self = StObject.set(x, "recipientsUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientsUriUndefined: Self = StObject.set(x, "recipientsUri", js.undefined)
    
    @scala.inline
    def setSenderCompany(value: String): Self = StObject.set(x, "senderCompany", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderCompanyUndefined: Self = StObject.set(x, "senderCompany", js.undefined)
    
    @scala.inline
    def setSenderEmail(value: String): Self = StObject.set(x, "senderEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderEmailUndefined: Self = StObject.set(x, "senderEmail", js.undefined)
    
    @scala.inline
    def setSenderName(value: String): Self = StObject.set(x, "senderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderNameUndefined: Self = StObject.set(x, "senderName", js.undefined)
    
    @scala.inline
    def setSenderUserId(value: String): Self = StObject.set(x, "senderUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSenderUserIdUndefined: Self = StObject.set(x, "senderUserId", js.undefined)
    
    @scala.inline
    def setSentDateTime(value: String): Self = StObject.set(x, "sentDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSentDateTimeUndefined: Self = StObject.set(x, "sentDateTime", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    @scala.inline
    def setTemplateUri(value: String): Self = StObject.set(x, "templateUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateUriUndefined: Self = StObject.set(x, "templateUri", js.undefined)
  }
}
