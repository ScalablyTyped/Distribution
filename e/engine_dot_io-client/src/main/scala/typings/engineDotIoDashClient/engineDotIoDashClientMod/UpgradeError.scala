package typings.engineDotIoDashClient.engineDotIoDashClientMod

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
    val __obj = js.Dynamic.literal(message = message, name = name, transport = transport)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[UpgradeError]
  }
}

