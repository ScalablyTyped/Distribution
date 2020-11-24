package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactModRequest extends js.Object {
  
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
  implicit class ContactModRequestOps[Self <: ContactModRequest] (val x: Self) extends AnyVal {
    
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
    def setContactListVarargs(value: Contact*): Self = this.set("contactList", js.Array(value :_*))
    
    @scala.inline
    def setContactList(value: js.Array[Contact]): Self = this.set("contactList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContactList: Self = this.set("contactList", js.undefined)
  }
}
