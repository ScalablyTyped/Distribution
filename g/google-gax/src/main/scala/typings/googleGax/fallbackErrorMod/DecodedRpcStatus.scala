package typings.googleGax.fallbackErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecodedRpcStatus extends js.Object {
  var code: Double
  var details: js.Array[js.Object]
  var message: String
}

object DecodedRpcStatus {
  @scala.inline
  def apply(code: Double, details: js.Array[js.Object], message: String): DecodedRpcStatus = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecodedRpcStatus]
  }
}

