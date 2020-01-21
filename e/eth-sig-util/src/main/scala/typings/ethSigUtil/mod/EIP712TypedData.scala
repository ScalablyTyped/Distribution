package typings.ethSigUtil.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EIP712TypedData extends js.Object {
  var domain: EIP712Domain
  var message: EIP712Message
  var primaryType: String
  var types: EIP712Types
}

object EIP712TypedData {
  @scala.inline
  def apply(domain: EIP712Domain, message: EIP712Message, primaryType: String, types: EIP712Types): EIP712TypedData = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], primaryType = primaryType.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EIP712TypedData]
  }
}

