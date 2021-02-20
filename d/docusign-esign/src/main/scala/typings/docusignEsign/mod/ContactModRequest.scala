package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactModRequest extends StObject {
  
  /**
    * A list of contacts.
    */
  var contactList: js.UndefOr[js.Array[Contact]] = js.native
}
object ContactModRequest {
  
  @scala.inline
  def apply(): ContactModRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactModRequest]
  }
  
  @scala.inline
  implicit class ContactModRequestMutableBuilder[Self <: ContactModRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContactList(value: js.Array[Contact]): Self = StObject.set(x, "contactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactListUndefined: Self = StObject.set(x, "contactList", js.undefined)
    
    @scala.inline
    def setContactListVarargs(value: Contact*): Self = StObject.set(x, "contactList", js.Array(value :_*))
  }
}
