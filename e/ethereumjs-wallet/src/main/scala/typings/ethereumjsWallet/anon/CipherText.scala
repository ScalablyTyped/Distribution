package typings.ethereumjsWallet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherText extends js.Object {
  
  var CipherText: String = js.native
  
  var IV: String = js.native
  
  var KeyHeader: Kdf = js.native
  
  var MAC: String = js.native
  
  var Salt: String = js.native
}
object CipherText {
  
  @scala.inline
  def apply(CipherText: String, IV: String, KeyHeader: Kdf, MAC: String, Salt: String): CipherText = {
    val __obj = js.Dynamic.literal(CipherText = CipherText.asInstanceOf[js.Any], IV = IV.asInstanceOf[js.Any], KeyHeader = KeyHeader.asInstanceOf[js.Any], MAC = MAC.asInstanceOf[js.Any], Salt = Salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherText]
  }
  
  @scala.inline
  implicit class CipherTextOps[Self <: CipherText] (val x: Self) extends AnyVal {
    
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
    def setCipherText(value: String): Self = this.set("CipherText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIV(value: String): Self = this.set("IV", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyHeader(value: Kdf): Self = this.set("KeyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMAC(value: String): Self = this.set("MAC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalt(value: String): Self = this.set("Salt", value.asInstanceOf[js.Any])
  }
}
