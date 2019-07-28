package typings.ethDashSigDashUtil.ethDashSigDashUtilMod

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
    val __obj = js.Dynamic.literal(domain = domain, message = message, primaryType = primaryType, types = types)
  
    __obj.asInstanceOf[EIP712TypedData]
  }
}

