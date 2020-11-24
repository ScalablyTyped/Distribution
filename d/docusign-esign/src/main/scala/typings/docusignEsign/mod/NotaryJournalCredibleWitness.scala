package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotaryJournalCredibleWitness extends js.Object {
  
  /**
    * The user's address.
    */
  var address: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var signatureImage: js.UndefOr[String] = js.native
}
object NotaryJournalCredibleWitness {
  
  @scala.inline
  def apply(): NotaryJournalCredibleWitness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournalCredibleWitness]
  }
  
  @scala.inline
  implicit class NotaryJournalCredibleWitnessOps[Self <: NotaryJournalCredibleWitness] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSignatureImage(value: String): Self = this.set("signatureImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignatureImage: Self = this.set("signatureImage", js.undefined)
  }
}
