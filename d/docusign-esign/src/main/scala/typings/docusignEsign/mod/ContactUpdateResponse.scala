package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactUpdateResponse extends js.Object {
  
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
  implicit class ContactUpdateResponseOps[Self <: ContactUpdateResponse] (val x: Self) extends AnyVal {
    
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
    def setContactsVarargs(value: Contact*): Self = this.set("contacts", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: js.Array[Contact]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContacts: Self = this.set("contacts", js.undefined)
  }
}
