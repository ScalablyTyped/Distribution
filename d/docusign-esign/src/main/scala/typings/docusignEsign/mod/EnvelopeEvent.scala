package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeEvent extends js.Object {
  
  /**
    * An envelope status for which your webhook should be called. Values: Draft, Sent, Delivered, Completed, Declined, or Voided.
    */
  var envelopeEventStatusCode: js.UndefOr[String] = js.native
  
  /**
    * reserved
    */
  var includeDocuments: js.UndefOr[String] = js.native
}
object EnvelopeEvent {
  
  @scala.inline
  def apply(): EnvelopeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeEvent]
  }
  
  @scala.inline
  implicit class EnvelopeEventOps[Self <: EnvelopeEvent] (val x: Self) extends AnyVal {
    
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
    def setEnvelopeEventStatusCode(value: String): Self = this.set("envelopeEventStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelopeEventStatusCode: Self = this.set("envelopeEventStatusCode", js.undefined)
    
    @scala.inline
    def setIncludeDocuments(value: String): Self = this.set("includeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeDocuments: Self = this.set("includeDocuments", js.undefined)
  }
}
