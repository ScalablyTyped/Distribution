package typings.ethereumjsWallet.mod

import typings.ethereumjsWallet.anon.CipherText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V1Keystore extends js.Object {
  
  var Address: String = js.native
  
  var Crypto: CipherText = js.native
  
  var Id: String = js.native
  
  var Version: String = js.native
}
object V1Keystore {
  
  @scala.inline
  def apply(Address: String, Crypto: CipherText, Id: String, Version: String): V1Keystore = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], Crypto = Crypto.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[V1Keystore]
  }
  
  @scala.inline
  implicit class V1KeystoreOps[Self <: V1Keystore] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrypto(value: CipherText): Self = this.set("Crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("Version", value.asInstanceOf[js.Any])
  }
}
