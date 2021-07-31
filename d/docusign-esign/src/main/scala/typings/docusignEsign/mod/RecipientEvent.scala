package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecipientEvent extends StObject {
  
  /**
    * reserved
    */
  var includeDocuments: js.UndefOr[String] = js.undefined
  
  /**
    * Send a webhook notification for the following recipient statuses: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.
    */
  var recipientEventStatusCode: js.UndefOr[String] = js.undefined
}
object RecipientEvent {
  
  @scala.inline
  def apply(): RecipientEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientEvent]
  }
  
  @scala.inline
  implicit class RecipientEventMutableBuilder[Self <: RecipientEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeDocuments(value: String): Self = StObject.set(x, "includeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDocumentsUndefined: Self = StObject.set(x, "includeDocuments", js.undefined)
    
    @scala.inline
    def setRecipientEventStatusCode(value: String): Self = StObject.set(x, "recipientEventStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecipientEventStatusCodeUndefined: Self = StObject.set(x, "recipientEventStatusCode", js.undefined)
  }
}
