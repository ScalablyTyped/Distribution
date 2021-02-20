package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotaryJournalMetaData extends StObject {
  
  var comment: js.UndefOr[String] = js.native
  
  var credibleWitnesses: js.UndefOr[js.Array[NotaryJournalCredibleWitness]] = js.native
  
  var signatureImage: js.UndefOr[String] = js.native
  
  var signerIdType: js.UndefOr[String] = js.native
}
object NotaryJournalMetaData {
  
  @scala.inline
  def apply(): NotaryJournalMetaData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournalMetaData]
  }
  
  @scala.inline
  implicit class NotaryJournalMetaDataMutableBuilder[Self <: NotaryJournalMetaData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
    
    @scala.inline
    def setCredibleWitnesses(value: js.Array[NotaryJournalCredibleWitness]): Self = StObject.set(x, "credibleWitnesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredibleWitnessesUndefined: Self = StObject.set(x, "credibleWitnesses", js.undefined)
    
    @scala.inline
    def setCredibleWitnessesVarargs(value: NotaryJournalCredibleWitness*): Self = StObject.set(x, "credibleWitnesses", js.Array(value :_*))
    
    @scala.inline
    def setSignatureImage(value: String): Self = StObject.set(x, "signatureImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureImageUndefined: Self = StObject.set(x, "signatureImage", js.undefined)
    
    @scala.inline
    def setSignerIdType(value: String): Self = StObject.set(x, "signerIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerIdTypeUndefined: Self = StObject.set(x, "signerIdType", js.undefined)
  }
}
