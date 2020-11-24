package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotaryJournalMetaData extends js.Object {
  
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
  implicit class NotaryJournalMetaDataOps[Self <: NotaryJournalMetaData] (val x: Self) extends AnyVal {
    
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
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setCredibleWitnessesVarargs(value: NotaryJournalCredibleWitness*): Self = this.set("credibleWitnesses", js.Array(value :_*))
    
    @scala.inline
    def setCredibleWitnesses(value: js.Array[NotaryJournalCredibleWitness]): Self = this.set("credibleWitnesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCredibleWitnesses: Self = this.set("credibleWitnesses", js.undefined)
    
    @scala.inline
    def setSignatureImage(value: String): Self = this.set("signatureImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureImage: Self = this.set("signatureImage", js.undefined)
    
    @scala.inline
    def setSignerIdType(value: String): Self = this.set("signerIdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignerIdType: Self = this.set("signerIdType", js.undefined)
  }
}
