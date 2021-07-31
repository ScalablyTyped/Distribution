package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotaryJournalCredibleWitness extends StObject {
  
  /**
    * The user's address.
    */
  var address: js.UndefOr[String] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var signatureImage: js.UndefOr[String] = js.undefined
}
object NotaryJournalCredibleWitness {
  
  @scala.inline
  def apply(): NotaryJournalCredibleWitness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournalCredibleWitness]
  }
  
  @scala.inline
  implicit class NotaryJournalCredibleWitnessMutableBuilder[Self <: NotaryJournalCredibleWitness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSignatureImage(value: String): Self = StObject.set(x, "signatureImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignatureImageUndefined: Self = StObject.set(x, "signatureImage", js.undefined)
  }
}
