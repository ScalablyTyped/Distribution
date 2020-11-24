package typings.ethersprojectJsonWallets.keystoreMod

import typings.ethersprojectHdnode.mod.Mnemonic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _KeystoreAccount extends js.Object {
  
  var _isKeystoreAccount: Boolean = js.native
  
  var address: String = js.native
  
  var mnemonic: js.UndefOr[Mnemonic] = js.native
  
  var privateKey: String = js.native
}
object _KeystoreAccount {
  
  @scala.inline
  def apply(_isKeystoreAccount: Boolean, address: String, privateKey: String): _KeystoreAccount = {
    val __obj = js.Dynamic.literal(_isKeystoreAccount = _isKeystoreAccount.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[_KeystoreAccount]
  }
  
  @scala.inline
  implicit class _KeystoreAccountOps[Self <: _KeystoreAccount] (val x: Self) extends AnyVal {
    
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
    def set_isKeystoreAccount(value: Boolean): Self = this.set("_isKeystoreAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMnemonic(value: Mnemonic): Self = this.set("mnemonic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMnemonic: Self = this.set("mnemonic", js.undefined)
  }
}
