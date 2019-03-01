package typings
package ethDashSigDashUtilLib.ethDashSigDashUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EIP712TypedData extends js.Object {
  var domain: EIP712Domain
  var message: EIP712Message
  var primaryType: java.lang.String
  var types: EIP712Types
}

object EIP712TypedData {
  @scala.inline
  def apply(domain: EIP712Domain, message: EIP712Message, primaryType: java.lang.String, types: EIP712Types): EIP712TypedData = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("primaryType")(primaryType)
    __obj.updateDynamic("types")(types)
    __obj.asInstanceOf[EIP712TypedData]
  }
}

