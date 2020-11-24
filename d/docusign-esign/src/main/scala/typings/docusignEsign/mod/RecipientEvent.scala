package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientEvent extends js.Object {
  
  /**
    * reserved
    */
  var includeDocuments: js.UndefOr[String] = js.native
  
  /**
    * Send a webhook notification for the following recipient statuses: Sent, Delivered, Completed, Declined, AuthenticationFailed, and AutoResponded.
    */
  var recipientEventStatusCode: js.UndefOr[String] = js.native
}
object RecipientEvent {
  
  @scala.inline
  def apply(): RecipientEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientEvent]
  }
  
  @scala.inline
  implicit class RecipientEventOps[Self <: RecipientEvent] (val x: Self) extends AnyVal {
    
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
    def setIncludeDocuments(value: String): Self = this.set("includeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDocuments: Self = this.set("includeDocuments", js.undefined)
    
    @scala.inline
    def setRecipientEventStatusCode(value: String): Self = this.set("recipientEventStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipientEventStatusCode: Self = this.set("recipientEventStatusCode", js.undefined)
  }
}
