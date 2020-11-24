package typings.ethereumjsWallet.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<ethereumjs-wallet.ethereumjs-wallet.V3Params> */
@js.native
trait PartialV3Params extends js.Object {
  
  var c: js.UndefOr[Double] = js.native
  
  var cipher: js.UndefOr[String] = js.native
  
  var dklen: js.UndefOr[Double] = js.native
  
  var iv: js.UndefOr[String | Buffer] = js.native
  
  var kdf: js.UndefOr[String] = js.native
  
  var n: js.UndefOr[Double] = js.native
  
  var p: js.UndefOr[Double] = js.native
  
  var r: js.UndefOr[Double] = js.native
  
  var salt: js.UndefOr[String | Buffer] = js.native
  
  var uuid: js.UndefOr[String | Buffer] = js.native
}
object PartialV3Params {
  
  @scala.inline
  def apply(): PartialV3Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialV3Params]
  }
  
  @scala.inline
  implicit class PartialV3ParamsOps[Self <: PartialV3Params] (val x: Self) extends AnyVal {
    
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
    def setC(value: Double): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteC: Self = this.set("c", js.undefined)
    
    @scala.inline
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCipher: Self = this.set("cipher", js.undefined)
    
    @scala.inline
    def setDklen(value: Double): Self = this.set("dklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDklen: Self = this.set("dklen", js.undefined)
    
    @scala.inline
    def setIv(value: String | Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setKdf(value: String): Self = this.set("kdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKdf: Self = this.set("kdf", js.undefined)
    
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteN: Self = this.set("n", js.undefined)
    
    @scala.inline
    def setP(value: Double): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteP: Self = this.set("p", js.undefined)
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteR: Self = this.set("r", js.undefined)
    
    @scala.inline
    def setSalt(value: String | Buffer): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setUuid(value: String | Buffer): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUuid: Self = this.set("uuid", js.undefined)
  }
}
