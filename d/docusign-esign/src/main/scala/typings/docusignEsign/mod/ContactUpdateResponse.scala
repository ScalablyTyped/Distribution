package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactUpdateResponse extends StObject {
  
  /**
    * A list of contacts.
    */
  var contacts: js.UndefOr[js.Array[Contact]] = js.undefined
}
object ContactUpdateResponse {
  
  inline def apply(): ContactUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactUpdateResponse]
  }
  
  extension [Self <: ContactUpdateResponse](x: Self) {
    
    inline def setContacts(value: js.Array[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value*))
  }
}
