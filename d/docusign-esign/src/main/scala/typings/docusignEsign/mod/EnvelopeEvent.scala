package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeEvent extends StObject {
  
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
  implicit class EnvelopeEventMutableBuilder[Self <: EnvelopeEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopeEventStatusCode(value: String): Self = StObject.set(x, "envelopeEventStatusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeEventStatusCodeUndefined: Self = StObject.set(x, "envelopeEventStatusCode", js.undefined)
    
    @scala.inline
    def setIncludeDocuments(value: String): Self = StObject.set(x, "includeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeDocumentsUndefined: Self = StObject.set(x, "includeDocuments", js.undefined)
  }
}
