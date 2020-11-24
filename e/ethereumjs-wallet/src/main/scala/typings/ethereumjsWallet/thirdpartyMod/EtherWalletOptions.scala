package typings.ethereumjsWallet.thirdpartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EtherWalletOptions extends js.Object {
  
  var address: String = js.native
  
  var encrypted: Boolean = js.native
  
  var hash: String = js.native
  
  var locked: Boolean = js.native
  
  var `private`: String = js.native
  
  var public: String = js.native
}
object EtherWalletOptions {
  
  @scala.inline
  def apply(
    address: String,
    encrypted: Boolean,
    hash: String,
    locked: Boolean,
    `private`: String,
    public: String
  ): EtherWalletOptions = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], encrypted = encrypted.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EtherWalletOptions]
  }
  
  @scala.inline
  implicit class EtherWalletOptionsOps[Self <: EtherWalletOptions] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: Boolean): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: String): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublic(value: String): Self = this.set("public", value.asInstanceOf[js.Any])
  }
}
