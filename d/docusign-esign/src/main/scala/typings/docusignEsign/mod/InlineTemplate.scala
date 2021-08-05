package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlineTemplate extends StObject {
  
  /**
    * An optional array of strings that enables the sender to provide custom data about the recipient. This information is returned in the envelope status but otherwise
    * not used by DocuSign. Each `customField` string can be a maximum of 100 characters.
    */
  var customFields: js.UndefOr[
    /* An `accountCustomField` is an envelope custom field that you set at the account level. Applying custom fields enables account administators to
    group and manage envelopes.  */ AccountCustomFields
  ] = js.undefined
  
  /**
    * A complex element that contains details about the documents associated with the envelope.
    */
  var documents: js.UndefOr[js.Array[/* A document object. */ Document]] = js.undefined
  
  /**
    * A container used to send documents to recipients. The envelope carries information about the sender and timestamps to indicate the progress of the delivery procedure.
    * It can contain collections of Documents, Tabs and Recipients.
    */
  var envelope: js.UndefOr[Envelope] = js.undefined
  
  /**
    * An array of recipient objects that provides details about the recipients of the envelope.
    */
  var recipients: js.UndefOr[/* Envelope recipients */ EnvelopeRecipients] = js.undefined
  
  /**
    * Specifies the order in which templates are overlaid.
    */
  var sequence: js.UndefOr[String] = js.undefined
}
object InlineTemplate {
  
  inline def apply(): InlineTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineTemplate]
  }
  
  extension [Self <: InlineTemplate](x: Self) {
    
    inline def setCustomFields(
      value: /* An `accountCustomField` is an envelope custom field that you set at the account level. Applying custom fields enables account administators to
      group and manage envelopes.  */ AccountCustomFields
    ): Self = StObject.set(x, "customFields", value.asInstanceOf[js.Any])
    
    inline def setCustomFieldsUndefined: Self = StObject.set(x, "customFields", js.undefined)
    
    inline def setDocuments(value: js.Array[/* A document object. */ Document]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    inline def setDocumentsVarargs(value: (/* A document object. */ Document)*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    inline def setEnvelope(value: Envelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeUndefined: Self = StObject.set(x, "envelope", js.undefined)
    
    inline def setRecipients(value: /* Envelope recipients */ EnvelopeRecipients): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
    
    inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
    
    inline def setSequence(value: String): Self = StObject.set(x, "sequence", value.asInstanceOf[js.Any])
    
    inline def setSequenceUndefined: Self = StObject.set(x, "sequence", js.undefined)
  }
}
