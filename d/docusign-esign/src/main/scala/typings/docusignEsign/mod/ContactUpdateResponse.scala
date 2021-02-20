package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactUpdateResponse extends StObject {
  
  /**
    * A list of contacts.
    */
  var contacts: js.UndefOr[js.Array[Contact]] = js.native
}
object ContactUpdateResponse {
  
  @scala.inline
  def apply(): ContactUpdateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactUpdateResponse]
  }
  
  @scala.inline
  implicit class ContactUpdateResponseMutableBuilder[Self <: ContactUpdateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContacts(value: js.Array[Contact]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    @scala.inline
    def setContactsVarargs(value: Contact*): Self = StObject.set(x, "contacts", js.Array(value :_*))
  }
}
