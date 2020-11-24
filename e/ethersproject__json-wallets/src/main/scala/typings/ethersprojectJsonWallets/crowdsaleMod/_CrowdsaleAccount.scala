package typings.ethersprojectJsonWallets.crowdsaleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _CrowdsaleAccount extends js.Object {
  
  var _isCrowdsaleAccount: Boolean = js.native
  
  var address: String = js.native
  
  var privateKey: String = js.native
}
object _CrowdsaleAccount {
  
  @scala.inline
  def apply(_isCrowdsaleAccount: Boolean, address: String, privateKey: String): _CrowdsaleAccount = {
    val __obj = js.Dynamic.literal(_isCrowdsaleAccount = _isCrowdsaleAccount.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CrowdsaleAccount]
  }
  
  @scala.inline
  implicit class _CrowdsaleAccountOps[Self <: _CrowdsaleAccount] (val x: Self) extends AnyVal {
    
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
    def set_isCrowdsaleAccount(value: Boolean): Self = this.set("_isCrowdsaleAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateKey(value: String): Self = this.set("privateKey", value.asInstanceOf[js.Any])
  }
}
