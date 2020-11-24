package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineTemplate extends js.Object {
  
  /**
    * An optional array of strings that enables the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise
    * not used by DocuSign. Each `customField` string can be a maximum of 100 characters.
    */
  var customFields: js.UndefOr[
    /* An `accountCustomField` is an envelope custom field that you set at the account level. Applying custom fields enables account administators to
    group and manage envelopes.  */ AccountCustomFields
  ] = js.native
  
  /**
    * A complex element that contains details about the documents associated with the envelope.
    */
  var documents: js.UndefOr[js.Array[/* A document object. */ Document]] = js.native
  
  /**
    * A container used to send documents to recipients. The envelope carries information about the sender and timestamps to indicate the progress of the delivery procedure.
    * It can contain collections of Documents, Tabs and Recipients.
    */
  var envelope: js.UndefOr[Envelope] = js.native
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[/* Envelope recipients */ EnvelopeRecipients] = js.native
  
  /**
    * Specifies the order in which templates are overlaid.
    */
  var sequence: js.UndefOr[String] = js.native
}
object InlineTemplate {
  
  @scala.inline
  def apply(): InlineTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineTemplate]
  }
  
  @scala.inline
  implicit class InlineTemplateOps[Self <: InlineTemplate] (val x: Self) extends AnyVal {
    
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
    def setCustomFields(
      value: /* An `accountCustomField` is an envelope custom field that you set at the account level. Applying custom fields enables account administators to
      group and manage envelopes.  */ AccountCustomFields
    ): Self = this.set("customFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFields: Self = this.set("customFields", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: (/* A document object. */ Document)*): Self = this.set("documents", js.Array(value :_*))
    
    @scala.inline
    def setDocuments(value: js.Array[/* A document object. */ Document]): Self = this.set("documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
    
    @scala.inline
    def setEnvelope(value: Envelope): Self = this.set("envelope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvelope: Self = this.set("envelope", js.undefined)
    
    @scala.inline
    def setRecipients(value: /* Envelope recipients */ EnvelopeRecipients): Self = this.set("recipients", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecipients: Self = this.set("recipients", js.undefined)
    
    @scala.inline
    def setSequence(value: String): Self = this.set("sequence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequence: Self = this.set("sequence", js.undefined)
  }
}
