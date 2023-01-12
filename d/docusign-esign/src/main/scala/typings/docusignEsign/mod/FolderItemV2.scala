package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FolderItemV2 extends StObject {
  
  /**
    * If the item is an envelope, this is the UTC DateTime when the envelope was completed.
    */
  var completedDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the item was created.
    */
  var createdDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * If the item is an envelope, this is the id of the envelope.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
  
  /**
    * If the item is an envelope, this is the URI for retrieving it.
    */
  var envelopeUri: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the envelope is set to expire.
    */
  var expireDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the folder.
    */
  var folderId: js.UndefOr[String] = js.undefined
  
  /**
    * If the item is a subfolder, this is the URI for retrieving it.
    */
  var folderUri: js.UndefOr[String] = js.undefined
  
  /**
    * When **true**, indicates compliance with United States Food and Drug Administration (FDA) regulations on electronic records and electronic signatures (ERES).
    */
  var is21CFRPart11: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user who owns the folder.
    */
  var ownerName: js.UndefOr[String] = js.undefined
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[/* Envelope recipients */ EnvelopeRecipients] = js.undefined
  
  /**
    * Contains a URI for an endpoint that you can use to retrieve the recipients.
    */
  var recipientsUri: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the sender's company.
    */
  var senderCompany: js.UndefOr[String] = js.undefined
  
  /**
    * The sender's email address.
    */
  var senderEmail: js.UndefOr[String] = js.undefined
  
  /**
    * The sender's name.
    */
  var senderName: js.UndefOr[String] = js.undefined
  
  /**
    * The sender's id.
    */
  var senderUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The UTC DateTime when the envelope was sent. Read only.
    */
  var sentDateTime: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the item.
    */
  var status: js.UndefOr[String] = js.undefined
  
  /**
    * The subject of the envelope.
    */
  var subject: js.UndefOr[String] = js.undefined
  
  /**
    * The id of the template.
    */
  var templateId: js.UndefOr[String] = js.undefined
  
  /**
    * The URI for retrieving the template.
    */
  var templateUri: js.UndefOr[String] = js.undefined
}
object FolderItemV2 {
  
  inline def apply(): FolderItemV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FolderItemV2]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FolderItemV2] (val x: Self) extends AnyVal {
    
    inline def setCompletedDateTime(value: String): Self = StObject.set(x, "completedDateTime", value.asInstanceOf[js.Any])
    
    inline def setCompletedDateTimeUndefined: Self = StObject.set(x, "completedDateTime", js.undefined)
    
    inline def setCreatedDateTime(value: String): Self = StObject.set(x, "createdDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateTimeUndefined: Self = StObject.set(x, "createdDateTime", js.undefined)
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
    
    inline def setEnvelopeUri(value: String): Self = StObject.set(x, "envelopeUri", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUriUndefined: Self = StObject.set(x, "envelopeUri", js.undefined)
    
    inline def setExpireDateTime(value: String): Self = StObject.set(x, "expireDateTime", value.asInstanceOf[js.Any])
    
    inline def setExpireDateTimeUndefined: Self = StObject.set(x, "expireDateTime", js.undefined)
    
    inline def setFolderId(value: String): Self = StObject.set(x, "folderId", value.asInstanceOf[js.Any])
    
    inline def setFolderIdUndefined: Self = StObject.set(x, "folderId", js.undefined)
    
    inline def setFolderUri(value: String): Self = StObject.set(x, "folderUri", value.asInstanceOf[js.Any])
    
    inline def setFolderUriUndefined: Self = StObject.set(x, "folderUri", js.undefined)
    
    inline def setIs21CFRPart11(value: String): Self = StObject.set(x, "is21CFRPart11", value.asInstanceOf[js.Any])
    
    inline def setIs21CFRPart11Undefined: Self = StObject.set(x, "is21CFRPart11", js.undefined)
    
    inline def setOwnerName(value: String): Self = StObject.set(x, "ownerName", value.asInstanceOf[js.Any])
    
    inline def setOwnerNameUndefined: Self = StObject.set(x, "ownerName", js.undefined)
    
    inline def setRecipients(value: /* Envelope recipients */ EnvelopeRecipients): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setRecipientsUri(value: String): Self = StObject.set(x, "recipientsUri", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUriUndefined: Self = StObject.set(x, "recipientsUri", js.undefined)
    
    inline def setSenderCompany(value: String): Self = StObject.set(x, "senderCompany", value.asInstanceOf[js.Any])
    
    inline def setSenderCompanyUndefined: Self = StObject.set(x, "senderCompany", js.undefined)
    
    inline def setSenderEmail(value: String): Self = StObject.set(x, "senderEmail", value.asInstanceOf[js.Any])
    
    inline def setSenderEmailUndefined: Self = StObject.set(x, "senderEmail", js.undefined)
    
    inline def setSenderName(value: String): Self = StObject.set(x, "senderName", value.asInstanceOf[js.Any])
    
    inline def setSenderNameUndefined: Self = StObject.set(x, "senderName", js.undefined)
    
    inline def setSenderUserId(value: String): Self = StObject.set(x, "senderUserId", value.asInstanceOf[js.Any])
    
    inline def setSenderUserIdUndefined: Self = StObject.set(x, "senderUserId", js.undefined)
    
    inline def setSentDateTime(value: String): Self = StObject.set(x, "sentDateTime", value.asInstanceOf[js.Any])
    
    inline def setSentDateTimeUndefined: Self = StObject.set(x, "sentDateTime", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTemplateId(value: String): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
    
    inline def setTemplateUri(value: String): Self = StObject.set(x, "templateUri", value.asInstanceOf[js.Any])
    
    inline def setTemplateUriUndefined: Self = StObject.set(x, "templateUri", js.undefined)
  }
}
