package typings.atFirebaseUtil.distSrcJwtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodedToken extends js.Object {
  var claims: Claims
  var data: js.Object
  var header: js.Object
  var signature: String
}

object DecodedToken {
  @scala.inline
  def apply(claims: Claims, data: js.Object, header: js.Object, signature: String): DecodedToken = {
    val __obj = js.Dynamic.literal(claims = claims, data = data, header = header, signature = signature)
  
    __obj.asInstanceOf[DecodedToken]
  }
}

