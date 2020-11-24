package typings.ethereumjsWallet.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait V3Params extends js.Object {
  
  var c: Double = js.native
  
  var cipher: String = js.native
  
  var dklen: Double = js.native
  
  var iv: String | Buffer = js.native
  
  var kdf: String = js.native
  
  var n: Double = js.native
  
  var p: Double = js.native
  
  var r: Double = js.native
  
  var salt: String | Buffer = js.native
  
  var uuid: String | Buffer = js.native
}
object V3Params {
  
  @scala.inline
  def apply(
    c: Double,
    cipher: String,
    dklen: Double,
    iv: String | Buffer,
    kdf: String,
    n: Double,
    p: Double,
    r: Double,
    salt: String | Buffer,
    uuid: String | Buffer
  ): V3Params = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], cipher = cipher.asInstanceOf[js.Any], dklen = dklen.asInstanceOf[js.Any], iv = iv.asInstanceOf[js.Any], kdf = kdf.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], p = p.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[V3Params]
  }
  
  @scala.inline
  implicit class V3ParamsOps[Self <: V3Params] (val x: Self) extends AnyVal {
    
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
    def setCipher(value: String): Self = this.set("cipher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDklen(value: Double): Self = this.set("dklen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIv(value: String | Buffer): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKdf(value: String): Self = this.set("kdf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: Double): Self = this.set("n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setP(value: Double): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setR(value: Double): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSalt(value: String | Buffer): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String | Buffer): Self = this.set("uuid", value.asInstanceOf[js.Any])
  }
}
