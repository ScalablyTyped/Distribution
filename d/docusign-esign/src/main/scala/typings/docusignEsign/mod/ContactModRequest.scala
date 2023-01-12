package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactModRequest extends StObject {
  
  /**
    * A list of contacts.
    */
  var contactList: js.UndefOr[js.Array[Contact]] = js.undefined
}
object ContactModRequest {
  
  inline def apply(): ContactModRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactModRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContactModRequest] (val x: Self) extends AnyVal {
    
    inline def setContactList(value: js.Array[Contact]): Self = StObject.set(x, "contactList", value.asInstanceOf[js.Any])
    
    inline def setContactListUndefined: Self = StObject.set(x, "contactList", js.undefined)
    
    inline def setContactListVarargs(value: Contact*): Self = StObject.set(x, "contactList", js.Array(value*))
  }
}
