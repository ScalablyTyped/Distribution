package typings.engineIoClient.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpgradeError extends Error {
  var transport: String
}

object UpgradeError {
  @scala.inline
  def apply(message: String, name: String, transport: String, stack: String = null): UpgradeError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpgradeError]
  }
}

