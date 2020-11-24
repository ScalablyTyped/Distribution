package typings.ethersprojectJsonWallets.keystoreMod

import typings.ethersprojectBytes.mod.BytesLike
import typings.ethersprojectJsonWallets.anon.N
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptOptions extends js.Object {
  
  var client: js.UndefOr[String] = js.native
  
  var entropy: js.UndefOr[BytesLike] = js.native
  
  var iv: js.UndefOr[BytesLike] = js.native
  
  var salt: js.UndefOr[BytesLike] = js.native
  
  var scrypt: js.UndefOr[N] = js.native
  
  var uuid: js.UndefOr[String] = js.native
}
object EncryptOptions {
  
  @scala.inline
  def apply(): EncryptOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EncryptOptions]
  }
  
  @scala.inline
  implicit class EncryptOptionsOps[Self <: EncryptOptions] (val x: Self) extends AnyVal {
    
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
    def setClient(value: String): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClient: Self = this.set("client", js.undefined)
    
    @scala.inline
    def setEntropy(value: BytesLike): Self = this.set("entropy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntropy: Self = this.set("entropy", js.undefined)
    
    @scala.inline
    def setIv(value: BytesLike): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setSalt(value: BytesLike): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setScrypt(value: N): Self = this.set("scrypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrypt: Self = this.set("scrypt", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
