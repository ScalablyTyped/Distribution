package typings.easyXHeaders.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurePair extends js.Object {
  
  var cleartext: js.Any = js.native
  
  var encrypted: js.Any = js.native
}
object SecurePair {
  
  @scala.inline
  def apply(cleartext: js.Any, encrypted: js.Any): SecurePair = {
    val __obj = js.Dynamic.literal(cleartext = cleartext.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurePair]
  }
  
  @scala.inline
  implicit class SecurePairOps[Self <: SecurePair] (val x: Self) extends AnyVal {
    
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
    def setCleartext(value: js.Any): Self = this.set("cleartext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: js.Any): Self = this.set("encrypted", value.asInstanceOf[js.Any])
  }
}
