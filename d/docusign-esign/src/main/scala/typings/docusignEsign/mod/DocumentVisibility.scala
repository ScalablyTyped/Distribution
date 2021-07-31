package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentVisibility extends StObject {
  
  /**
    * The `documentId` is set by the API client. It is an integer that falls between `1` and 2,147,483,647. The value is encoded as a string without commas.
    * The values `1`, `2`, `3`, and so on are typically used to identify the first few documents in an envelope. Tab definitions include a `documentId` property
    * that specifies the document on which to place the tab.
    */
  var documentId: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * A local reference that senders use to map recipients to other objects, such as specific document tabs. Within an envelope, each `recipientId` must be unique,
    * but there is no uniqueness requirement across envelopes. For example, many envelopes assign the first recipient a `recipientId` of `1`.
    */
  var recipientId: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the document is editable:
    *
    * - `editable`
    * - `read_only`
    */
  var rights: js.UndefOr[String] = js.undefined
  
  /**
    * When **true**, the document is visible to the recipient.
    */
  var visible: js.UndefOr[String] = js.undefined
}
object DocumentVisibility {
  
  @scala.inline
  def apply(): DocumentVisibility = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentVisibility]
  }
  
  @scala.inline
  implicit class DocumentVisibilityMutableBuilder[Self <: DocumentVisibility] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocumentId(value: String): Self = StObject.set(x, "documentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentIdUndefined: Self = StObject.set(x, "documentId", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setRecipientId(value: String): Self = StObject.set(x, "recipientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientIdUndefined: Self = StObject.set(x, "recipientId", js.undefined)
    
    @scala.inline
    def setRights(value: String): Self = StObject.set(x, "rights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightsUndefined: Self = StObject.set(x, "rights", js.undefined)
    
    @scala.inline
    def setVisible(value: String): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
