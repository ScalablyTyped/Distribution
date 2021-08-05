package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeEvent extends StObject {
  
  /**
    * An envelope status for which your webhook should be called. Values: Draft, Sent, Delivered, Completed, Declined, or Voided.
    */
  var envelopeEventStatusCode: js.UndefOr[String] = js.undefined
  
  /**
    * reserved
    */
  var includeDocuments: js.UndefOr[String] = js.undefined
}
object EnvelopeEvent {
  
  inline def apply(): EnvelopeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeEvent]
  }
  
  extension [Self <: EnvelopeEvent](x: Self) {
    
    inline def setEnvelopeEventStatusCode(value: String): Self = StObject.set(x, "envelopeEventStatusCode", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeEventStatusCodeUndefined: Self = StObject.set(x, "envelopeEventStatusCode", js.undefined)
    
    inline def setIncludeDocuments(value: String): Self = StObject.set(x, "includeDocuments", value.asInstanceOf[js.Any])
    
    inline def setIncludeDocumentsUndefined: Self = StObject.set(x, "includeDocuments", js.undefined)
  }
}
