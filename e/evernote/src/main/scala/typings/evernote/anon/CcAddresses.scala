package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcAddresses extends js.Object {
  
  var ccAddresses: js.UndefOr[js.Array[String]] = js.native
  
  var guid: js.UndefOr[String] = js.native
  
  var message: js.UndefOr[String] = js.native
  
  var note: js.UndefOr[typings.evernote.mod.Types.Note] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  var toAddresses: js.UndefOr[js.Array[String]] = js.native
}
object CcAddresses {
  
  @scala.inline
  def apply(): CcAddresses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CcAddresses]
  }
  
  @scala.inline
  implicit class CcAddressesOps[Self <: CcAddresses] (val x: Self) extends AnyVal {
    
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
    def setCcAddressesVarargs(value: String*): Self = this.set("ccAddresses", js.Array(value :_*))
    
    @scala.inline
    def setCcAddresses(value: js.Array[String]): Self = this.set("ccAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCcAddresses: Self = this.set("ccAddresses", js.undefined)
    
    @scala.inline
    def setGuid(value: String): Self = this.set("guid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGuid: Self = this.set("guid", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setNote(value: typings.evernote.mod.Types.Note): Self = this.set("note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNote: Self = this.set("note", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setToAddressesVarargs(value: String*): Self = this.set("toAddresses", js.Array(value :_*))
    
    @scala.inline
    def setToAddresses(value: js.Array[String]): Self = this.set("toAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToAddresses: Self = this.set("toAddresses", js.undefined)
  }
}
