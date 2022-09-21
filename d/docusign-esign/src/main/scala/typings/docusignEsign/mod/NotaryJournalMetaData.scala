package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotaryJournalMetaData extends StObject {
  
  var comment: js.UndefOr[String] = js.undefined
  
  var credibleWitnesses: js.UndefOr[js.Array[NotaryJournalCredibleWitness]] = js.undefined
  
  var signatureImage: js.UndefOr[String] = js.undefined
  
  var signerIdType: js.UndefOr[String] = js.undefined
}
object NotaryJournalMetaData {
  
  inline def apply(): NotaryJournalMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournalMetaData]
  }
  
  extension [Self <: NotaryJournalMetaData](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    inline def setCredibleWitnesses(value: js.Array[NotaryJournalCredibleWitness]): Self = StObject.set(x, "credibleWitnesses", value.asInstanceOf[js.Any])
    
    inline def setCredibleWitnessesUndefined: Self = StObject.set(x, "credibleWitnesses", js.undefined)
    
    inline def setCredibleWitnessesVarargs(value: NotaryJournalCredibleWitness*): Self = StObject.set(x, "credibleWitnesses", js.Array(value*))
    
    inline def setSignatureImage(value: String): Self = StObject.set(x, "signatureImage", value.asInstanceOf[js.Any])
    
    inline def setSignatureImageUndefined: Self = StObject.set(x, "signatureImage", js.undefined)
    
    inline def setSignerIdType(value: String): Self = StObject.set(x, "signerIdType", value.asInstanceOf[js.Any])
    
    inline def setSignerIdTypeUndefined: Self = StObject.set(x, "signerIdType", js.undefined)
  }
}
