package typings.ethereumjsWallet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EthSaleKeystore extends js.Object {
  
  var btcaddr: String = js.native
  
  var email: String = js.native
  
  var encseed: String = js.native
  
  var ethaddr: String = js.native
}
object EthSaleKeystore {
  
  @scala.inline
  def apply(btcaddr: String, email: String, encseed: String, ethaddr: String): EthSaleKeystore = {
    val __obj = js.Dynamic.literal(btcaddr = btcaddr.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], encseed = encseed.asInstanceOf[js.Any], ethaddr = ethaddr.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthSaleKeystore]
  }
  
  @scala.inline
  implicit class EthSaleKeystoreOps[Self <: EthSaleKeystore] (val x: Self) extends AnyVal {
    
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
    def setBtcaddr(value: String): Self = this.set("btcaddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncseed(value: String): Self = this.set("encseed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEthaddr(value: String): Self = this.set("ethaddr", value.asInstanceOf[js.Any])
  }
}
