package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvelopeDocuments extends StObject {
  
  /**
    * An array of document objects.
    */
  var envelopeDocuments: js.UndefOr[
    js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]
  ] = js.undefined
  
  /**
    * The envelope ID of the envelope status that failed to post.
    */
  var envelopeId: js.UndefOr[String] = js.undefined
}
object EnvelopeDocuments {
  
  inline def apply(): EnvelopeDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvelopeDocuments]
  }
  
  extension [Self <: EnvelopeDocuments](x: Self) {
    
    inline def setEnvelopeDocuments(value: js.Array[/* This object contains details about the envelope document. */ EnvelopeDocument]): Self = StObject.set(x, "envelopeDocuments", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeDocumentsUndefined: Self = StObject.set(x, "envelopeDocuments", js.undefined)
    
    inline def setEnvelopeDocumentsVarargs(value: (/* This object contains details about the envelope document. */ EnvelopeDocument)*): Self = StObject.set(x, "envelopeDocuments", js.Array(value :_*))
    
    inline def setEnvelopeId(value: String): Self = StObject.set(x, "envelopeId", value.asInstanceOf[js.Any])
    
    inline def setEnvelopeIdUndefined: Self = StObject.set(x, "envelopeId", js.undefined)
  }
}
