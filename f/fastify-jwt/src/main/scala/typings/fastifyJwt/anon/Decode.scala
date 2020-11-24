package typings.fastifyJwt.anon

import typings.jsonwebtoken.mod.DecodeOptions
import typings.jsonwebtoken.mod.SignOptions
import typings.jsonwebtoken.mod.VerifyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Decode extends js.Object {
  
  var decode: DecodeOptions = js.native
  
  var sign: SignOptions = js.native
  
  var verify: VerifyOptions = js.native
}
object Decode {
  
  @scala.inline
  def apply(decode: DecodeOptions, sign: SignOptions, verify: VerifyOptions): Decode = {
    val __obj = js.Dynamic.literal(decode = decode.asInstanceOf[js.Any], sign = sign.asInstanceOf[js.Any], verify = verify.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decode]
  }
  
  @scala.inline
  implicit class DecodeOps[Self <: Decode] (val x: Self) extends AnyVal {
    
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
    def setDecode(value: DecodeOptions): Self = this.set("decode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSign(value: SignOptions): Self = this.set("sign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerify(value: VerifyOptions): Self = this.set("verify", value.asInstanceOf[js.Any])
  }
}
