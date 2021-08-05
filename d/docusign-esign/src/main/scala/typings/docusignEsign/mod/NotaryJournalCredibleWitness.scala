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
  
  inline def apply(): NotaryJournalCredibleWitness = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotaryJournalCredibleWitness]
  }
  
  extension [Self <: NotaryJournalCredibleWitness](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSignatureImage(value: String): Self = StObject.set(x, "signatureImage", value.asInstanceOf[js.Any])
    
    inline def setSignatureImageUndefined: Self = StObject.set(x, "signatureImage", js.undefined)
  }
}
