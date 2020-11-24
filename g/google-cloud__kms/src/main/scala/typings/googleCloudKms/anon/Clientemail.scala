package typings.googleCloudKms.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clientemail extends js.Object {
  
  var client_email: js.UndefOr[String] = js.native
  
  var private_key: js.UndefOr[String] = js.native
}
object Clientemail {
  
  @scala.inline
  def apply(): Clientemail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Clientemail]
  }
  
  @scala.inline
  implicit class ClientemailOps[Self <: Clientemail] (val x: Self) extends AnyVal {
    
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
    def setClient_email(value: String): Self = this.set("client_email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient_email: Self = this.set("client_email", js.undefined)
    
    @scala.inline
    def setPrivate_key(value: String): Self = this.set("private_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivate_key: Self = this.set("private_key", js.undefined)
  }
}
