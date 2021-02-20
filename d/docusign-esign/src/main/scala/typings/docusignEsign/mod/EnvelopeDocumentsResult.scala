package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvelopeDocumentsResult extends StObject {
  
  /**
    * An array containing information about the documents that are included in the envelope.
    */
  var envelopeDocuments: js.UndefOr[
    js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]
  ] = js.native
  
  /**
    * The envelope's GUID.
    *
    * Example: `93be49ab-afa0-4adf-933c-f752070d71ec`
    */
  var envelopeId: js.UndefOr[String] = js.native
}
object EnvelopeDocumentsResult {
  
  @scala.inline
  def apply(): EnvelopeDocumentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDocumentsResult]
  }
  
  @scala.inline
  implicit class EnvelopeDocumentsResultMutableBuilder[Self <: EnvelopeDocumentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnvelopeDocuments(value: js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]): Self = StObject.set(x, "envelopeDocuments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeDocumentsUndefined: Self = StObject.set(x, "envelopeDocuments", js.undefined)
    
    @scala.inline
    def setEnvelopeDocumentsVarargs(value: (/* This object contains details about the envelope document. */ EnvelopeDocument)*): Self = StObject.set(x, "envelopeDocuments", js.Array(value :_*))
    
    @scala.inline
    def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
  }
}
