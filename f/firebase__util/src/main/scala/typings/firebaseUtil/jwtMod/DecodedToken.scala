package typings.firebaseUtil.jwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DecodedToken extends js.Object {
  var claims: Claims = js.native
  var data: js.Object = js.native
  var header: js.Object = js.native
  var signature: String = js.native
}

object DecodedToken {
  @scala.inline
  def apply(claims: Claims, data: js.Object, header: js.Object, signature: String): DecodedToken = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedToken]
  }
  @scala.inline
  implicit class DecodedTokenOps[Self <: DecodedToken] (val x: Self) extends AnyVal {
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
    def setClaims(value: Claims): Self = this.set("claims", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
  }
  
}

